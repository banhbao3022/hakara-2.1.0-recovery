package mtp.media.karaoke.data.local.p627db;

import android.content.Context;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao;
import p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao_Impl;
import p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao;
import p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao_Impl;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao_Impl;
import p636z0.p641a0.DatabaseConfiguration;
import p636z0.p641a0.InvalidationTracker;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomOpenHelper;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p641a0.p643b0.TableInfo;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f33482r = 0;

    /* JADX INFO: renamed from: s */
    public volatile RecordingDao f33483s;

    /* JADX INFO: renamed from: t */
    public volatile KeywordDao f33484t;

    /* JADX INFO: renamed from: u */
    public volatile SkuDao f33485u;

    /* JADX INFO: renamed from: mtp.media.karaoke.data.local.db.AppDatabase_Impl$a */
    public class C7245a extends RoomOpenHelper.a {
        public C7245a(int i) {
            super(i);
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: a */
        public void mo950a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `recordings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `userId` INTEGER NOT NULL, `songId` INTEGER NOT NULL, `duetId` INTEGER NOT NULL, `message` TEXT, `thumbnail` TEXT NOT NULL, `url` TEXT, `type` INTEGER NOT NULL, `imageIds` TEXT, `images` TEXT, `duration` INTEGER, `effect` INTEGER, `tone` INTEGER NOT NULL, `rhythm` INTEGER NOT NULL, `effectCustom` TEXT, `useHeadphone` INTEGER, `filename` TEXT, `folderName` TEXT, `segments` TEXT, `format` INTEGER NOT NULL, `videoRatio` INTEGER NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL)");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `keywords` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL)");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `sku` (`sku` TEXT NOT NULL, `type` TEXT, `price` TEXT, `title` TEXT, `description` TEXT, `originalJson` TEXT, `canPurchase` INTEGER NOT NULL, PRIMARY KEY(`sku`))");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.mo15045n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '60fd56aa126c0b694b11099af9a11f72')");
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: b */
        public void mo951b(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `recordings`");
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `keywords`");
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `sku`");
            AppDatabase_Impl appDatabase_Impl = AppDatabase_Impl.this;
            int i = AppDatabase_Impl.f33482r;
            List<RoomDatabase.b> list = appDatabase_Impl.f34310h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(AppDatabase_Impl.this.f34310h.get(i2));
                }
            }
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: c */
        public void mo952c(SupportSQLiteDatabase supportSQLiteDatabase) {
            AppDatabase_Impl appDatabase_Impl = AppDatabase_Impl.this;
            int i = AppDatabase_Impl.f33482r;
            List<RoomDatabase.b> list = appDatabase_Impl.f34310h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(AppDatabase_Impl.this.f34310h.get(i2));
                }
            }
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: d */
        public void mo953d(SupportSQLiteDatabase supportSQLiteDatabase) {
            AppDatabase_Impl appDatabase_Impl = AppDatabase_Impl.this;
            int i = AppDatabase_Impl.f33482r;
            appDatabase_Impl.f34303a = supportSQLiteDatabase;
            AppDatabase_Impl.this.m14534k(supportSQLiteDatabase);
            List<RoomDatabase.b> list = AppDatabase_Impl.this.f34310h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AppDatabase_Impl.this.f34310h.get(i2).mo14541a(supportSQLiteDatabase);
                }
            }
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: e */
        public void mo954e(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: f */
        public void mo955f(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.m14502a(supportSQLiteDatabase);
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: g */
        public RoomOpenHelper.b mo956g(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(24);
            map.put("id", new TableInfo.a("id", "INTEGER", false, 1, null, 1));
            map.put("name", new TableInfo.a("name", "TEXT", true, 0, null, 1));
            map.put("userId", new TableInfo.a("userId", "INTEGER", true, 0, null, 1));
            map.put("songId", new TableInfo.a("songId", "INTEGER", true, 0, null, 1));
            map.put("duetId", new TableInfo.a("duetId", "INTEGER", true, 0, null, 1));
            map.put("message", new TableInfo.a("message", "TEXT", false, 0, null, 1));
            map.put("thumbnail", new TableInfo.a("thumbnail", "TEXT", true, 0, null, 1));
            map.put("url", new TableInfo.a("url", "TEXT", false, 0, null, 1));
            map.put("type", new TableInfo.a("type", "INTEGER", true, 0, null, 1));
            map.put("imageIds", new TableInfo.a("imageIds", "TEXT", false, 0, null, 1));
            map.put("images", new TableInfo.a("images", "TEXT", false, 0, null, 1));
            map.put(CainMediaMetadataRetriever.METADATA_KEY_DURATION, new TableInfo.a(CainMediaMetadataRetriever.METADATA_KEY_DURATION, "INTEGER", false, 0, null, 1));
            map.put("effect", new TableInfo.a("effect", "INTEGER", false, 0, null, 1));
            map.put("tone", new TableInfo.a("tone", "INTEGER", true, 0, null, 1));
            map.put("rhythm", new TableInfo.a("rhythm", "INTEGER", true, 0, null, 1));
            map.put("effectCustom", new TableInfo.a("effectCustom", "TEXT", false, 0, null, 1));
            map.put("useHeadphone", new TableInfo.a("useHeadphone", "INTEGER", false, 0, null, 1));
            map.put(CainMediaMetadataRetriever.METADATA_KEY_FILENAME, new TableInfo.a(CainMediaMetadataRetriever.METADATA_KEY_FILENAME, "TEXT", false, 0, null, 1));
            map.put("folderName", new TableInfo.a("folderName", "TEXT", false, 0, null, 1));
            map.put("segments", new TableInfo.a("segments", "TEXT", false, 0, null, 1));
            map.put("format", new TableInfo.a("format", "INTEGER", true, 0, null, 1));
            map.put("videoRatio", new TableInfo.a("videoRatio", "INTEGER", true, 0, null, 1));
            map.put("createdAt", new TableInfo.a("createdAt", "TEXT", true, 0, null, 1));
            map.put("updatedAt", new TableInfo.a("updatedAt", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("recordings", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfoM14505a = TableInfo.m14505a(supportSQLiteDatabase, "recordings");
            if (!tableInfo.equals(tableInfoM14505a)) {
                return new RoomOpenHelper.b(false, "recordings(mtp.media.karaoke.data.local.entity.RecordingEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoM14505a);
            }
            HashMap map2 = new HashMap(4);
            map2.put("id", new TableInfo.a("id", "INTEGER", false, 1, null, 1));
            map2.put("name", new TableInfo.a("name", "TEXT", true, 0, null, 1));
            map2.put("createdAt", new TableInfo.a("createdAt", "INTEGER", true, 0, null, 1));
            map2.put("updatedAt", new TableInfo.a("updatedAt", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo2 = new TableInfo("keywords", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfoM14505a2 = TableInfo.m14505a(supportSQLiteDatabase, "keywords");
            if (!tableInfo2.equals(tableInfoM14505a2)) {
                return new RoomOpenHelper.b(false, "keywords(mtp.media.karaoke.data.local.entity.KeywordEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + tableInfoM14505a2);
            }
            HashMap map3 = new HashMap(7);
            map3.put("sku", new TableInfo.a("sku", "TEXT", true, 1, null, 1));
            map3.put("type", new TableInfo.a("type", "TEXT", false, 0, null, 1));
            map3.put("price", new TableInfo.a("price", "TEXT", false, 0, null, 1));
            map3.put(CainMediaMetadataRetriever.METADATA_KEY_TITLE, new TableInfo.a(CainMediaMetadataRetriever.METADATA_KEY_TITLE, "TEXT", false, 0, null, 1));
            map3.put(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION, new TableInfo.a(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION, "TEXT", false, 0, null, 1));
            map3.put("originalJson", new TableInfo.a("originalJson", "TEXT", false, 0, null, 1));
            map3.put("canPurchase", new TableInfo.a("canPurchase", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("sku", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfoM14505a3 = TableInfo.m14505a(supportSQLiteDatabase, "sku");
            if (tableInfo3.equals(tableInfoM14505a3)) {
                return new RoomOpenHelper.b(true, null);
            }
            return new RoomOpenHelper.b(false, "sku(mtp.media.karaoke.data.local.entity.SkuEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfoM14505a3);
        }
    }

    @Override // p636z0.p641a0.RoomDatabase
    /* JADX INFO: renamed from: d */
    public InvalidationTracker mo948d() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "recordings", "keywords", "sku");
    }

    @Override // p636z0.p641a0.RoomDatabase
    /* JADX INFO: renamed from: e */
    public SupportSQLiteOpenHelper mo949e(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new C7245a(4), "60fd56aa126c0b694b11099af9a11f72", "20449eb04f21338cf83890a44b1af00f");
        Context context = databaseConfiguration.f34243b;
        String str = databaseConfiguration.f34244c;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return databaseConfiguration.f34242a.mo15049a(new SupportSQLiteOpenHelper.b(context, str, roomOpenHelper, false));
    }

    @Override // p636z0.p641a0.RoomDatabase
    /* JADX INFO: renamed from: g */
    public Map<Class<?>, List<Class<?>>> mo14350g() {
        HashMap map = new HashMap();
        map.put(RecordingDao.class, Collections.emptyList());
        map.put(KeywordDao.class, Collections.emptyList());
        map.put(SkuDao.class, Collections.emptyList());
        return map;
    }

    @Override // mtp.media.karaoke.data.local.p627db.AppDatabase
    /* JADX INFO: renamed from: p */
    public KeywordDao mo14346p() {
        KeywordDao keywordDao;
        if (this.f33484t != null) {
            return this.f33484t;
        }
        synchronized (this) {
            if (this.f33484t == null) {
                this.f33484t = new KeywordDao_Impl(this);
            }
            keywordDao = this.f33484t;
        }
        return keywordDao;
    }

    @Override // mtp.media.karaoke.data.local.p627db.AppDatabase
    /* JADX INFO: renamed from: q */
    public RecordingDao mo14347q() {
        RecordingDao recordingDao;
        if (this.f33483s != null) {
            return this.f33483s;
        }
        synchronized (this) {
            if (this.f33483s == null) {
                this.f33483s = new RecordingDao_Impl(this);
            }
            recordingDao = this.f33483s;
        }
        return recordingDao;
    }

    @Override // mtp.media.karaoke.data.local.p627db.AppDatabase
    /* JADX INFO: renamed from: r */
    public SkuDao mo14348r() {
        SkuDao skuDao;
        if (this.f33485u != null) {
            return this.f33485u;
        }
        synchronized (this) {
            if (this.f33485u == null) {
                this.f33485u = new SkuDao_Impl(this);
            }
            skuDao = this.f33485u;
        }
        return skuDao;
    }
}
