-- CreateTable
CREATE TABLE "users" (
    "id" SERIAL NOT NULL,
    "uid" TEXT NOT NULL,
    "fb_user_id" TEXT,
    "gg_user_id" TEXT,
    "full_name" TEXT NOT NULL,
    "email" TEXT,
    "address" TEXT,
    "city" TEXT,
    "country" TEXT,
    "language" TEXT,
    "region" TEXT,
    "phone" TEXT,
    "avatar" TEXT,
    "cover" TEXT,
    "gender" INTEGER NOT NULL DEFAULT 0,
    "birthday" TEXT,
    "bio" TEXT,
    "exps" INTEGER NOT NULL DEFAULT 0,
    "diamonds" INTEGER NOT NULL DEFAULT 0,
    "coins" INTEGER NOT NULL DEFAULT 0,
    "stars" INTEGER NOT NULL DEFAULT 0,
    "label" TEXT,
    "lat" DOUBLE PRECISION,
    "long" DOUBLE PRECISION,
    "recording_count" INTEGER NOT NULL DEFAULT 0,
    "notification_count" INTEGER NOT NULL DEFAULT 0,
    "following_count" INTEGER NOT NULL DEFAULT 0,
    "follower_count" INTEGER NOT NULL DEFAULT 0,
    "gift_count" INTEGER NOT NULL DEFAULT 0,
    "play_count" INTEGER NOT NULL DEFAULT 0,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "users_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "devices" (
    "id" SERIAL NOT NULL,
    "unique_id" TEXT NOT NULL,
    "user_id" INTEGER,
    "os" TEXT,
    "os_version" TEXT,
    "app_version" TEXT,
    "device_name" TEXT,
    "brand" TEXT,
    "timezone" TEXT,
    "screen_width" INTEGER,
    "screen_height" INTEGER,
    "fcm_token" TEXT,
    "lat" DOUBLE PRECISION,
    "long" DOUBLE PRECISION,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "devices_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "songs" (
    "id" SERIAL NOT NULL,
    "name" TEXT NOT NULL,
    "artist" TEXT,
    "youtube_id" TEXT,
    "player_ias_url" TEXT,
    "thumbnail" TEXT,
    "cover" TEXT,
    "link" TEXT,
    "link_video" TEXT,
    "trending" INTEGER NOT NULL DEFAULT 0,
    "duet_singer" INTEGER NOT NULL DEFAULT 0,
    "record_count" INTEGER NOT NULL DEFAULT 0,
    "region" TEXT,
    "status" INTEGER NOT NULL DEFAULT 1,
    "type" INTEGER NOT NULL DEFAULT 0,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "songs_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "recordings" (
    "id" SERIAL NOT NULL,
    "name" TEXT NOT NULL,
    "slug" TEXT,
    "user_id" INTEGER NOT NULL,
    "song_id" INTEGER NOT NULL,
    "duet_id" INTEGER,
    "message" TEXT,
    "thumbnail" TEXT,
    "url" TEXT NOT NULL,
    "url_video_resize" TEXT,
    "share_url" TEXT,
    "type" INTEGER NOT NULL DEFAULT 0,
    "format" INTEGER NOT NULL DEFAULT 0,
    "video_ratio" INTEGER NOT NULL DEFAULT 0,
    "privacy" INTEGER NOT NULL DEFAULT 1,
    "pin" INTEGER NOT NULL DEFAULT 0,
    "status" INTEGER NOT NULL DEFAULT 1,
    "duration" INTEGER NOT NULL DEFAULT 0,
    "effect" INTEGER NOT NULL DEFAULT 0,
    "effect_custom" TEXT,
    "use_headphone" BOOLEAN NOT NULL DEFAULT false,
    "image_ids" TEXT,
    "lat" DOUBLE PRECISION,
    "long" DOUBLE PRECISION,
    "play_count" INTEGER NOT NULL DEFAULT 0,
    "like_count" INTEGER NOT NULL DEFAULT 0,
    "comment_count" INTEGER NOT NULL DEFAULT 0,
    "share_count" INTEGER NOT NULL DEFAULT 0,
    "duet_count" INTEGER NOT NULL DEFAULT 0,
    "gift_count" INTEGER NOT NULL DEFAULT 0,
    "star_count" INTEGER NOT NULL DEFAULT 0,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "recordings_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "duets" (
    "id" SERIAL NOT NULL,
    "user_id" INTEGER NOT NULL,
    "song_id" INTEGER NOT NULL,
    "recording_id" INTEGER NOT NULL,
    "join_count" INTEGER NOT NULL DEFAULT 0,
    "segments" JSONB NOT NULL DEFAULT '[]',
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "duets_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "comments" (
    "id" SERIAL NOT NULL,
    "user_id" INTEGER NOT NULL,
    "content_type" TEXT NOT NULL,
    "content_id" INTEGER NOT NULL,
    "parent_id" INTEGER NOT NULL DEFAULT 0,
    "quote_id" INTEGER NOT NULL DEFAULT 0,
    "message" TEXT NOT NULL,
    "like_count" INTEGER NOT NULL DEFAULT 0,
    "reply_count" INTEGER NOT NULL DEFAULT 0,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "comments_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "likes" (
    "id" SERIAL NOT NULL,
    "user_id" INTEGER NOT NULL,
    "target_type" TEXT NOT NULL,
    "target_id" INTEGER NOT NULL,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT "likes_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "shares" (
    "id" SERIAL NOT NULL,
    "user_id" INTEGER NOT NULL,
    "target_type" TEXT NOT NULL,
    "target_id" INTEGER NOT NULL,
    "social" INTEGER NOT NULL DEFAULT 0,
    "message" TEXT,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT "shares_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "follows" (
    "id" SERIAL NOT NULL,
    "follower_id" INTEGER NOT NULL,
    "followed_id" INTEGER NOT NULL,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT "follows_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "blocks" (
    "id" SERIAL NOT NULL,
    "blocker_id" INTEGER NOT NULL,
    "blocked_id" INTEGER NOT NULL,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT "blocks_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "images" (
    "id" SERIAL NOT NULL,
    "user_id" INTEGER NOT NULL,
    "image" TEXT NOT NULL,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "images_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "notifications" (
    "id" SERIAL NOT NULL,
    "user_id" INTEGER NOT NULL,
    "sender_id" INTEGER,
    "title" TEXT NOT NULL,
    "message" TEXT NOT NULL,
    "content_id" INTEGER NOT NULL DEFAULT 0,
    "sub_content_id" INTEGER,
    "type" TEXT NOT NULL,
    "sub_type" TEXT,
    "image" TEXT,
    "is_read" INTEGER NOT NULL DEFAULT 0,
    "read_os" TEXT,
    "read_section" TEXT,
    "pushed_at" TIMESTAMP(3),
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "notifications_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "gifts" (
    "id" SERIAL NOT NULL,
    "name" TEXT NOT NULL,
    "image" TEXT NOT NULL,
    "type" INTEGER NOT NULL DEFAULT 1,
    "amount" INTEGER NOT NULL DEFAULT 0,
    "exp" INTEGER NOT NULL DEFAULT 0,
    "stars" INTEGER NOT NULL DEFAULT 0,
    "status" INTEGER NOT NULL DEFAULT 1,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "gifts_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "presents" (
    "id" SERIAL NOT NULL,
    "user_id" INTEGER NOT NULL,
    "receiver_id" INTEGER NOT NULL,
    "recording_id" INTEGER NOT NULL,
    "gift_id" INTEGER NOT NULL,
    "quantity" INTEGER NOT NULL DEFAULT 1,
    "stars" INTEGER NOT NULL DEFAULT 0,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "presents_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "daily_tasks" (
    "id" SERIAL NOT NULL,
    "name" TEXT NOT NULL,
    "type" INTEGER NOT NULL,
    "goal" INTEGER NOT NULL DEFAULT 1,
    "coin" INTEGER NOT NULL DEFAULT 0,
    "diamond" INTEGER NOT NULL DEFAULT 0,
    "exp" INTEGER NOT NULL DEFAULT 0,
    "coins" INTEGER[] DEFAULT ARRAY[]::INTEGER[],
    "diamonds" INTEGER[] DEFAULT ARRAY[]::INTEGER[],
    "exps" INTEGER[] DEFAULT ARRAY[]::INTEGER[],
    "status" INTEGER NOT NULL DEFAULT 1,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "daily_tasks_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "daily_task_logs" (
    "id" SERIAL NOT NULL,
    "user_id" INTEGER NOT NULL,
    "daily_task_id" INTEGER NOT NULL,
    "day" INTEGER NOT NULL DEFAULT 1,
    "progress" INTEGER NOT NULL DEFAULT 0,
    "status" INTEGER NOT NULL DEFAULT 0,
    "date" TEXT NOT NULL,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "daily_task_logs_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "keywords" (
    "id" SERIAL NOT NULL,
    "name" TEXT NOT NULL,
    "search_count" INTEGER NOT NULL DEFAULT 0,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "keywords_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "explore_sections" (
    "id" SERIAL NOT NULL,
    "name" TEXT NOT NULL,
    "type" INTEGER NOT NULL DEFAULT 0,
    "layout_type" INTEGER NOT NULL DEFAULT 0,
    "feed" TEXT NOT NULL DEFAULT 'latest',
    "position" INTEGER NOT NULL DEFAULT 0,
    "status" INTEGER NOT NULL DEFAULT 1,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "explore_sections_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "backgrounds" (
    "id" SERIAL NOT NULL,
    "key" TEXT NOT NULL,
    "value" TEXT NOT NULL,
    "position" INTEGER NOT NULL DEFAULT 0,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "backgrounds_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "diamond_transactions" (
    "id" SERIAL NOT NULL,
    "user_id" INTEGER NOT NULL,
    "transaction_id" TEXT NOT NULL,
    "product_id" TEXT NOT NULL,
    "state" TEXT,
    "unique_id" TEXT,
    "amount" INTEGER NOT NULL DEFAULT 0,
    "purchased_at" TEXT,
    "created_at" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT "diamond_transactions_pkey" PRIMARY KEY ("id")
);

-- CreateIndex
CREATE UNIQUE INDEX "users_uid_key" ON "users"("uid");

-- CreateIndex
CREATE UNIQUE INDEX "users_fb_user_id_key" ON "users"("fb_user_id");

-- CreateIndex
CREATE UNIQUE INDEX "users_gg_user_id_key" ON "users"("gg_user_id");

-- CreateIndex
CREATE INDEX "users_recording_count_idx" ON "users"("recording_count");

-- CreateIndex
CREATE INDEX "users_lat_long_idx" ON "users"("lat", "long");

-- CreateIndex
CREATE UNIQUE INDEX "devices_unique_id_key" ON "devices"("unique_id");

-- CreateIndex
CREATE INDEX "songs_type_status_idx" ON "songs"("type", "status");

-- CreateIndex
CREATE INDEX "songs_trending_idx" ON "songs"("trending");

-- CreateIndex
CREATE INDEX "recordings_user_id_created_at_idx" ON "recordings"("user_id", "created_at");

-- CreateIndex
CREATE INDEX "recordings_song_id_created_at_idx" ON "recordings"("song_id", "created_at");

-- CreateIndex
CREATE INDEX "recordings_privacy_status_created_at_idx" ON "recordings"("privacy", "status", "created_at");

-- CreateIndex
CREATE INDEX "recordings_duet_id_idx" ON "recordings"("duet_id");

-- CreateIndex
CREATE INDEX "recordings_lat_long_idx" ON "recordings"("lat", "long");

-- CreateIndex
CREATE UNIQUE INDEX "duets_recording_id_key" ON "duets"("recording_id");

-- CreateIndex
CREATE INDEX "comments_content_type_content_id_parent_id_created_at_idx" ON "comments"("content_type", "content_id", "parent_id", "created_at");

-- CreateIndex
CREATE INDEX "likes_target_type_target_id_idx" ON "likes"("target_type", "target_id");

-- CreateIndex
CREATE UNIQUE INDEX "likes_user_id_target_type_target_id_key" ON "likes"("user_id", "target_type", "target_id");

-- CreateIndex
CREATE INDEX "shares_target_type_target_id_idx" ON "shares"("target_type", "target_id");

-- CreateIndex
CREATE INDEX "follows_followed_id_idx" ON "follows"("followed_id");

-- CreateIndex
CREATE UNIQUE INDEX "follows_follower_id_followed_id_key" ON "follows"("follower_id", "followed_id");

-- CreateIndex
CREATE INDEX "blocks_blocked_id_idx" ON "blocks"("blocked_id");

-- CreateIndex
CREATE UNIQUE INDEX "blocks_blocker_id_blocked_id_key" ON "blocks"("blocker_id", "blocked_id");

-- CreateIndex
CREATE INDEX "images_user_id_created_at_idx" ON "images"("user_id", "created_at");

-- CreateIndex
CREATE INDEX "notifications_user_id_created_at_idx" ON "notifications"("user_id", "created_at");

-- CreateIndex
CREATE INDEX "presents_recording_id_stars_idx" ON "presents"("recording_id", "stars");

-- CreateIndex
CREATE INDEX "presents_receiver_id_stars_idx" ON "presents"("receiver_id", "stars");

-- CreateIndex
CREATE INDEX "presents_user_id_created_at_idx" ON "presents"("user_id", "created_at");

-- CreateIndex
CREATE UNIQUE INDEX "daily_task_logs_user_id_daily_task_id_date_key" ON "daily_task_logs"("user_id", "daily_task_id", "date");

-- CreateIndex
CREATE UNIQUE INDEX "keywords_name_key" ON "keywords"("name");

-- CreateIndex
CREATE INDEX "keywords_search_count_idx" ON "keywords"("search_count");

-- CreateIndex
CREATE INDEX "explore_sections_type_position_idx" ON "explore_sections"("type", "position");

-- CreateIndex
CREATE UNIQUE INDEX "backgrounds_key_key" ON "backgrounds"("key");

-- CreateIndex
CREATE UNIQUE INDEX "diamond_transactions_transaction_id_key" ON "diamond_transactions"("transaction_id");

-- AddForeignKey
ALTER TABLE "devices" ADD CONSTRAINT "devices_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE SET NULL ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "recordings" ADD CONSTRAINT "recordings_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "recordings" ADD CONSTRAINT "recordings_song_id_fkey" FOREIGN KEY ("song_id") REFERENCES "songs"("id") ON DELETE RESTRICT ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "recordings" ADD CONSTRAINT "recordings_duet_id_fkey" FOREIGN KEY ("duet_id") REFERENCES "duets"("id") ON DELETE SET NULL ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "duets" ADD CONSTRAINT "duets_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "duets" ADD CONSTRAINT "duets_song_id_fkey" FOREIGN KEY ("song_id") REFERENCES "songs"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "duets" ADD CONSTRAINT "duets_recording_id_fkey" FOREIGN KEY ("recording_id") REFERENCES "recordings"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "comments" ADD CONSTRAINT "comments_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "likes" ADD CONSTRAINT "likes_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "shares" ADD CONSTRAINT "shares_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "follows" ADD CONSTRAINT "follows_follower_id_fkey" FOREIGN KEY ("follower_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "follows" ADD CONSTRAINT "follows_followed_id_fkey" FOREIGN KEY ("followed_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "blocks" ADD CONSTRAINT "blocks_blocker_id_fkey" FOREIGN KEY ("blocker_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "blocks" ADD CONSTRAINT "blocks_blocked_id_fkey" FOREIGN KEY ("blocked_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "images" ADD CONSTRAINT "images_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "notifications" ADD CONSTRAINT "notifications_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "notifications" ADD CONSTRAINT "notifications_sender_id_fkey" FOREIGN KEY ("sender_id") REFERENCES "users"("id") ON DELETE SET NULL ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "presents" ADD CONSTRAINT "presents_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "presents" ADD CONSTRAINT "presents_receiver_id_fkey" FOREIGN KEY ("receiver_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "presents" ADD CONSTRAINT "presents_recording_id_fkey" FOREIGN KEY ("recording_id") REFERENCES "recordings"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "presents" ADD CONSTRAINT "presents_gift_id_fkey" FOREIGN KEY ("gift_id") REFERENCES "gifts"("id") ON DELETE RESTRICT ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "daily_task_logs" ADD CONSTRAINT "daily_task_logs_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "daily_task_logs" ADD CONSTRAINT "daily_task_logs_daily_task_id_fkey" FOREIGN KEY ("daily_task_id") REFERENCES "daily_tasks"("id") ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "diamond_transactions" ADD CONSTRAINT "diamond_transactions_user_id_fkey" FOREIGN KEY ("user_id") REFERENCES "users"("id") ON DELETE CASCADE ON UPDATE CASCADE;
