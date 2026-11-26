import { readFileSync } from 'node:fs'
import { resolve } from 'node:path'
import { buildApp } from '../src/app.js'

/**
 * Route parity against the decompiled client.
 *
 * "All 57 routes are implemented" is a claim that rots the moment someone
 * renames a path. This reads the route annotations straight out of
 * ApiService.java and asserts each one is served, so the claim is checked rather
 * than asserted in a README.
 */

const API_SERVICE = resolve(
  process.cwd(),
  process.env.API_SERVICE_PATH ??
    '../extracted/jadx-readable-all/sources/p555j/p556a/p557a/p606h/p613d/ApiService.java',
)

interface ClientRoute {
  method: string
  path: string
}

function parseClientRoutes(source: string): ClientRoute[] {
  const routes: ClientRoute[] = []
  const pattern = /@(GET|POST|PUT|DELETE|PATCH|HEAD)\("([^"]+)"\)/g
  let match: RegExpExecArray | null
  while ((match = pattern.exec(source)) !== null) {
    const [, method, path] = match
    if (method && path) routes.push({ method, path })
  }
  return routes
}

/** Retrofit writes path parameters as {id}; Fastify as :id. */
function normalize(path: string): string {
  return path.replace(/\{([^}]+)\}/g, ':$1').replace(/\/+$/, '') || '/'
}

async function main(): Promise<void> {
  let source: string
  try {
    source = readFileSync(API_SERVICE, 'utf8')
  } catch {
    console.error(
      `Could not read ApiService.java at:\n  ${API_SERVICE}\n\n` +
        'Set API_SERVICE_PATH to point at the decompiled client, or run this from server/.',
    )
    process.exit(2)
  }

  const declared = parseClientRoutes(source)

  // One route in ApiService.java is an absolute URL to Google's autocomplete
  // service, which the client calls directly. It is not ours to serve.
  const external = declared.filter((r) => /^https?:\/\//i.test(r.path))
  const expected = declared.filter((r) => !/^https?:\/\//i.test(r.path))

  const registered = new Set<string>()
  const app = await buildApp({
    onRoute: (route) => {
      const methods = Array.isArray(route.method) ? route.method : [route.method]
      for (const m of methods) registered.add(`${m} ${normalize(route.url)}`)
    },
  })
  await app.close()

  const missing = expected.filter((r) => !registered.has(`${r.method} ${normalize(r.path)}`))

  console.log(`ApiService.java: ${declared.length} route annotations`)
  console.log(`  ${expected.length} served by this server`)
  for (const r of external) console.log(`  1 external (client calls directly): ${r.method} ${r.path}`)
  console.log(`Registered on the Fastify instance: ${registered.size}`)

  if (missing.length) {
    console.error(`\n${missing.length} client route(s) NOT served:`)
    for (const r of missing) console.error(`  ${r.method} ${r.path}`)
    process.exit(1)
  }

  console.log('\nEvery client route is served.')
}

await main()
