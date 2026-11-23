package p636z0.p709j0.p710y;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import p636z0.p641a0.p642a0.Migration;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;

/* JADX INFO: renamed from: z0.j0.y.j, reason: use source file name */
/* JADX INFO: compiled from: WorkDatabaseMigrations.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkDatabaseMigrations {

    /* JADX INFO: renamed from: a */
    public static Migration f37326a = new a(1, 2);

    /* JADX INFO: renamed from: b */
    public static Migration f37327b = new b(3, 4);

    /* JADX INFO: renamed from: c */
    public static Migration f37328c = new c(4, 5);

    /* JADX INFO: renamed from: d */
    public static Migration f37329d = new d(6, 7);

    /* JADX INFO: renamed from: e */
    public static Migration f37330e = new e(7, 8);

    /* JADX INFO: renamed from: f */
    public static Migration f37331f = new f(8, 9);

    /* JADX INFO: renamed from: z0.j0.y.j$a */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class a extends Migration {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo15045n("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS alarmInfo");
            supportSQLiteDatabase.mo15045n("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.j$b */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class b extends Migration {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (Build.VERSION.SDK_INT >= 23) {
                supportSQLiteDatabase.mo15045n("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.j$c */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class c extends Migration {
        public c(int i, int i2) {
            super(i, i2);
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            supportSQLiteDatabase.mo15045n("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.j$d */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class d extends Migration {
        public d(int i, int i2) {
            super(i, i2);
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.j$e */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class e extends Migration {
        public e(int i, int i2) {
            super(i, i2);
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.j$f */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class f extends Migration {
        public f(int i, int i2) {
            super(i, i2);
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.j$g */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public static class g extends Migration {

        /* JADX INFO: renamed from: c */
        public final Context f37332c;

        public g(Context context, int i, int i2) {
            super(i, i2);
            this.f37332c = context;
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (this.f34198b >= 10) {
                supportSQLiteDatabase.mo15038L("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f37332c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.j$h */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public static class h extends Migration {

        /* JADX INFO: renamed from: c */
        public final Context f37333c;

        public h(Context context) {
            super(9, 10);
            this.f37333c = context;
        }

        @Override // p636z0.p641a0.p642a0.Migration
        /* JADX INFO: renamed from: a */
        public void mo14349a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f37333c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j3 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                supportSQLiteDatabase.mo15043i();
                try {
                    supportSQLiteDatabase.mo15038L("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    supportSQLiteDatabase.mo15038L("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j3)});
                    sharedPreferences.edit().clear().apply();
                    supportSQLiteDatabase.mo15037K();
                    supportSQLiteDatabase.mo15041T();
                } catch (Throwable th) {
                    supportSQLiteDatabase.mo15041T();
                    throw th;
                }
            }
            SharedPreferences sharedPreferences2 = this.f37333c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                supportSQLiteDatabase.mo15043i();
                try {
                    supportSQLiteDatabase.mo15038L("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    supportSQLiteDatabase.mo15038L("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    supportSQLiteDatabase.mo15037K();
                } finally {
                    supportSQLiteDatabase.mo15041T();
                }
            }
        }
    }
}
