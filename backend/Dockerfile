FROM node:22-bookworm-slim

WORKDIR /app

# Install curl for container healthcheck
RUN apt-get update && apt-get install -y --no-install-recommends curl ca-certificates \
  && rm -rf /var/lib/apt/lists/*

COPY package.json package-lock.json* ./
RUN npm ci --omit=dev

COPY src ./src
COPY scripts ./scripts
COPY public ./public

# Pre-generate royalty-free seed covers, avatars, gift icons, and karaoke demo tracks if missing
RUN node --no-warnings scripts/generate-media.js

RUN mkdir -p /app/data /app/public/uploads && chown -R node:node /app
USER node

ENV NODE_ENV=production
ENV PORT=3000

EXPOSE 3000

HEALTHCHECK --interval=30s --timeout=5s --start-period=10s --retries=3 \
  CMD curl -fsS http://127.0.0.1:3000/health || exit 1

CMD ["node", "--no-warnings", "src/server.js"]
