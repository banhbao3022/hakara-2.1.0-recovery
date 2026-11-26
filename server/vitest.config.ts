import { defineConfig } from 'vitest/config'

export default defineConfig({
  test: {
    include: ['test/**/*.spec.ts'],
    environment: 'node',
    // These tests are offline and deterministic by design: no database, no
    // network, no clock dependence beyond what each test injects.
    testTimeout: 10_000,
  },
})
