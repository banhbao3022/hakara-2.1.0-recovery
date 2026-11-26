import type { FastifyInstance } from 'fastify'
import { prisma } from '../lib/prisma.js'
import { item, list, reward } from '../http/envelope.js'
import { int, params } from '../http/params.js'
import { notFound, unprocessable } from '../http/errors.js'
import { requireUser } from '../plugins/auth.js'
import { serializeTask, serializeTaskLog } from '../serializers/index.js'
import { bumpUser } from '../lib/counters.js'
import { previousDay, today } from '../lib/datetime.js'

/**
 * Daily tasks and the check-in streak.
 *
 * Task.coins / diamonds / exps are *ladders* indexed by streak day (day 1 at
 * index 0), which is why the client renders a seven-cell check-in strip. `day`
 * advances when the previous calendar day was also completed and resets to 1
 * otherwise.
 */
function ladderValue(ladder: number[], day: number, fallback: number): number {
  if (!ladder.length) return fallback
  const index = Math.min(Math.max(day, 1), ladder.length) - 1
  return ladder[index] ?? fallback
}

export async function taskRoutes(app: FastifyInstance): Promise<void> {
  app.get('/v1/daily-task', async (req) => {
    const date = today()
    const tasks = await prisma.dailyTask.findMany({
      where: { status: 1 },
      orderBy: [{ type: 'asc' }, { id: 'asc' }],
      include: req.authUser
        ? { logs: { where: { userId: req.authUser.id, date }, take: 1 } }
        : { logs: { where: { id: -1 }, take: 0 } },
    })

    return list(tasks.map(serializeTask))
  })

  /** POST /v1/daily-task/addLog — the client reports progress by task `type`. */
  app.post('/v1/daily-task/addLog', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const type = int(p, 'type')
    if (type === undefined) throw unprocessable("Missing required parameter 'type'")

    const task = await prisma.dailyTask.findFirst({ where: { type, status: 1 } })
    if (!task) throw notFound(`No daily task of type ${type}`)

    const date = today()

    const log = await prisma.$transaction(async (tx) => {
      const existing = await tx.dailyTaskLog.findUnique({
        where: { userId_dailyTaskId_date: { userId: viewer.id, dailyTaskId: task.id, date } },
      })

      if (existing) {
        // Progress is capped at the goal: a client that reports twice in one day
        // must not be able to walk the counter past it.
        if (existing.progress >= task.goal) return existing
        return tx.dailyTaskLog.update({
          where: { id: existing.id },
          data: { progress: Math.min(task.goal, existing.progress + 1) },
        })
      }

      const yesterday = await tx.dailyTaskLog.findUnique({
        where: {
          userId_dailyTaskId_date: {
            userId: viewer.id,
            dailyTaskId: task.id,
            date: previousDay(date),
          },
        },
      })

      // The streak only carries over from a day that was actually collected.
      const day = yesterday?.status === 1 ? yesterday.day + 1 : 1

      return tx.dailyTaskLog.create({
        data: { userId: viewer.id, dailyTaskId: task.id, date, day, progress: 1, status: 0 },
      })
    })

    return item(serializeTaskLog(log))
  })

  /**
   * POST /v1/daily-task/collect-reward → GetCollectedRewardResponse
   * { status, coins, diamonds, exps }. Idempotent per task per day.
   */
  app.post('/v1/daily-task/collect-reward', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const taskId = int(p, 'daily_task_id')
    if (!taskId) throw unprocessable("Missing required parameter 'daily_task_id'")

    const task = await prisma.dailyTask.findUnique({ where: { id: taskId } })
    if (!task || task.status !== 1) throw notFound(`No daily task with id ${taskId}`)

    const date = today()

    const payout = await prisma.$transaction(async (tx) => {
      const log = await tx.dailyTaskLog.findUnique({
        where: { userId_dailyTaskId_date: { userId: viewer.id, dailyTaskId: taskId, date } },
      })

      if (!log) throw unprocessable('That task has no progress today')
      if (log.progress < task.goal) {
        throw unprocessable(`Task is not complete: ${log.progress}/${task.goal}`)
      }
      // Already collected — report zeros rather than paying twice.
      if (log.status === 1) return { coins: 0, diamonds: 0, exps: 0 }

      const coins = ladderValue(task.coins, log.day, task.coin)
      const diamonds = ladderValue(task.diamonds, log.day, task.diamond)
      const exps = ladderValue(task.exps, log.day, task.exp)

      await tx.dailyTaskLog.update({ where: { id: log.id }, data: { status: 1 } })
      await bumpUser(tx, viewer.id, { coins, diamonds, exps })

      return { coins, diamonds, exps }
    })

    return reward(1, payout.coins, payout.diamonds, payout.exps)
  })
}
