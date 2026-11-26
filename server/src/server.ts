import { buildApp } from './app.js'
import { env } from './env.js'
import { prisma } from './lib/prisma.js'

const app = await buildApp()

for (const signal of ['SIGINT', 'SIGTERM'] as const) {
  process.on(signal, () => {
    app.log.info(`${signal} received, shutting down`)
    void app
      .close()
      .then(() => prisma.$disconnect())
      .then(() => process.exit(0))
  })
}

try {
  await app.listen({ port: env.port, host: env.host })
} catch (err) {
  app.log.error(err)
  process.exit(1)
}
