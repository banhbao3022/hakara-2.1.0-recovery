import { PrismaClient } from '@prisma/client'
import { env } from '../env.js'

export const prisma = new PrismaClient({
  datasources: { db: { url: env.databaseUrl } },
  log: env.logLevel === 'debug' ? ['query', 'warn', 'error'] : ['warn', 'error'],
})

export type Tx = Omit<
  PrismaClient,
  '$connect' | '$disconnect' | '$on' | '$transaction' | '$use' | '$extends'
>
