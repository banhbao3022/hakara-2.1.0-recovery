FROM node:22-alpine
# node:22-alpine already ships libssl.so.3, which is what Prisma's query engine
# links against. The `openssl` CLI is absent and is not needed.

WORKDIR /app

COPY package.json package-lock.json ./

# `npm ci` over `npm install`: reproducible from the lockfile. The retry and
# timeout settings are not cosmetic — npm reports the unhelpful
# "Exit handler never called" when a registry fetch stalls or is rejected.
#
# On a network that TLS-intercepts the npm registry (a corporate proxy), this
# step fails because the image does not trust the interception CA. Supply it:
#   docker build --build-arg NODE_EXTRA_CA_CERTS=/certs/corp.pem \
#                --secret id=ca,src=/path/corp.pem .
# or build on a network without interception. See README.md § Container image.
ARG NODE_EXTRA_CA_CERTS=""
ENV NODE_EXTRA_CA_CERTS=${NODE_EXTRA_CA_CERTS}

RUN npm config set fetch-retries 5 \
  && npm config set fetch-retry-maxtimeout 120000 \
  && npm config set fetch-timeout 600000 \
  && npm ci --no-audit --no-fund

COPY prisma ./prisma
RUN npx prisma generate

COPY tsconfig.json tsconfig.build.json ./
COPY src ./src
COPY scripts ./scripts

RUN npm run build

ENV NODE_ENV=production
EXPOSE 8080

# Apply migrations before serving so a fresh volume comes up ready.
CMD ["sh", "-c", "npx prisma migrate deploy && node dist/src/server.js"]
