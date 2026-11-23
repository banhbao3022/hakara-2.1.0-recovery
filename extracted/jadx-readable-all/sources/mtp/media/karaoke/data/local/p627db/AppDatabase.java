package mtp.media.karaoke.data.local.p627db;

import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao;
import p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.p642a0.Migration;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;

/* JADX INFO: compiled from: AppDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: q */
    public static final C7244d f33481q = new C7244d(null);

    /* JADX INFO: renamed from: n */
    public static final Migration f33478n = new C7241a(1, 2);

    /* JADX INFO: renamed from: o */
    public static final Migration f33479o = new C7242b(2, 3);

    /* JADX INFO: renamed from: p */
    public static final Migration f33480p = new C7243c(3, 4);

    /* JADX INFO: renamed from: mtp.media.karaoke.data.local.db.AppDatabase$a */
    /* JADX INFO: compiled from: AppDatabase.kt */
    public static final class C7241a extends Migration {
        public C7241a(int i, int i2) {
            super(i, i2);
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics2.m13089e(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `keywords` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL)");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `sku` (`sku` TEXT PRIMARY KEY NOT NULL, `type` TEXT NULL, `price` TEXT NULL, `title` TEXT NULL, `description` TEXT NULL, `originalJson` TEXT NULL, `canPurchase` INTEGER NOT NULL)");
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.data.local.db.AppDatabase$b */
    /* JADX INFO: compiled from: AppDatabase.kt */
    public static final class C7242b extends Migration {
        public C7242b(int i, int i2) {
            super(i, i2);
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics2.m13089e(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.mo15045n("ALTER TABLE recordings ADD COLUMN tone INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.mo15045n("ALTER TABLE recordings ADD COLUMN rhythm INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.data.local.db.AppDatabase$c */
    /* JADX INFO: compiled from: AppDatabase.kt */
    public static final class C7243c extends Migration {
        public C7243c(int i, int i2) {
            super(i, i2);
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics2.m13089e(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.mo15045n("ALTER TABLE recordings ADD COLUMN format INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.mo15045n("ALTER TABLE recordings ADD COLUMN videoRatio INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.data.local.db.AppDatabase$d */
    /* JADX INFO: compiled from: AppDatabase.kt */
    public static final class C7244d {
        public C7244d() {
        }

        public C7244d(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract KeywordDao mo14346p();

    /* JADX INFO: renamed from: q */
    public abstract RecordingDao mo14347q();

    /* JADX INFO: renamed from: r */
    public abstract SkuDao mo14348r();
}
