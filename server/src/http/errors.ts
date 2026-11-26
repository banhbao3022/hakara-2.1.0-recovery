import type { FastifyInstance } from 'fastify'

/**
 * The client parses an error body as ServerErrorResponse { status, message }
 * (see ErrorHandlingFactory.java), so every failure leaves here in that shape.
 */
export class ApiError extends Error {
  constructor(
    readonly statusCode: number,
    message: string,
  ) {
    super(message)
    this.name = 'ApiError'
  }
}

export const badRequest = (m = 'Bad request') => new ApiError(400, m)
export const unauthorized = (m = 'Unauthorized') => new ApiError(401, m)
export const forbidden = (m = 'Forbidden') => new ApiError(403, m)
export const notFound = (m = 'Not found') => new ApiError(404, m)
export const unprocessable = (m = 'Unprocessable entity') => new ApiError(422, m)

export function registerErrorHandler(app: FastifyInstance): void {
  app.setErrorHandler((err: unknown, request, reply) => {
    const error = err as Partial<ApiError> & { statusCode?: number; message?: string }

    const status =
      err instanceof ApiError
        ? err.statusCode
        : typeof error.statusCode === 'number' && error.statusCode >= 400
          ? error.statusCode
          : 500

    if (status >= 500) {
      request.log.error({ err }, 'unhandled error')
    }

    // A 500 message can carry a stack frame or a query string; never relay it.
    const message =
      status >= 500 && !(err instanceof ApiError)
        ? 'Internal server error'
        : (error.message ?? 'Request failed')

    reply.status(status).send({ status, message })
  })

  app.setNotFoundHandler((request, reply) => {
    reply.status(404).send({ status: 404, message: `No route for ${request.method} ${request.url}` })
  })
}
