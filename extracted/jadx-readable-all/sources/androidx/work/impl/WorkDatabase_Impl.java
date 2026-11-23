package androidx.work.impl;

import android.content.Context;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p636z0.p641a0.DatabaseConfiguration;
import p636z0.p641a0.InvalidationTracker;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomOpenHelper;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p641a0.p643b0.TableInfo;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteOpenHelper;
import p636z0.p709j0.p710y.p719s.DependencyDao;
import p636z0.p709j0.p710y.p719s.DependencyDao_Impl;
import p636z0.p709j0.p710y.p719s.PreferenceDao;
import p636z0.p709j0.p710y.p719s.PreferenceDao_Impl;
import p636z0.p709j0.p710y.p719s.SystemIdInfoDao;
import p636z0.p709j0.p710y.p719s.SystemIdInfoDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkNameDao;
import p636z0.p709j0.p710y.p719s.WorkNameDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkProgressDao;
import p636z0.p709j0.p710y.p719s.WorkProgressDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkTagDao;
import p636z0.p709j0.p710y.p719s.WorkTagDao_Impl;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f1375p = 0;

    /* JADX INFO: renamed from: q */
    public volatile WorkSpecDao f1376q;

    /* JADX INFO: renamed from: r */
    public volatile DependencyDao f1377r;

    /* JADX INFO: renamed from: s */
    public volatile WorkTagDao f1378s;

    /* JADX INFO: renamed from: t */
    public volatile SystemIdInfoDao f1379t;

    /* JADX INFO: renamed from: u */
    public volatile WorkNameDao f1380u;

    /* JADX INFO: renamed from: v */
    public volatile WorkProgressDao f1381v;

    /* JADX INFO: renamed from: w */
    public volatile PreferenceDao f1382w;

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C0227a extends RoomOpenHelper.a {
        public C0227a(int i) {
            super(i);
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: a */
        public void mo950a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo15045n("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            supportSQLiteDatabase.mo15045n("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.mo15045n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            supportSQLiteDatabase.mo15045n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo15045n("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo15045n("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            supportSQLiteDatabase.mo15045n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.mo15045n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: b */
        public void mo951b(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `Dependency`");
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `WorkSpec`");
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `WorkTag`");
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `SystemIdInfo`");
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `WorkName`");
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `WorkProgress`");
            supportSQLiteDatabase.mo15045n("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f1375p;
            List<RoomDatabase.b> list = workDatabase_Impl.f34310h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(WorkDatabase_Impl.this.f34310h.get(i2));
                }
            }
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: c */
        public void mo952c(SupportSQLiteDatabase supportSQLiteDatabase) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f1375p;
            List<RoomDatabase.b> list = workDatabase_Impl.f34310h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(WorkDatabase_Impl.this.f34310h.get(i2));
                }
            }
        }

        @Override // p636z0.p641a0.RoomOpenHelper.a
        /* JADX INFO: renamed from: d */
        public void mo953d(SupportSQLiteDatabase supportSQLiteDatabase) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f1375p;
            workDatabase_Impl.f34303a = supportSQLiteDatabase;
            supportSQLiteDatabase.mo15045n("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m14534k(supportSQLiteDatabase);
            List<RoomDatabase.b> list = WorkDatabase_Impl.this.f34310h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f34310h.get(i2).mo14541a(supportSQLiteDatabase);
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
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new TableInfo.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new TableInfo.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new TableInfo.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new TableInfo.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new TableInfo.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new TableInfo.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            TableInfo tableInfo = new TableInfo("Dependency", map, hashSet, hashSet2);
            TableInfo tableInfoM14505a = TableInfo.m14505a(supportSQLiteDatabase, "Dependency");
            if (!tableInfo.equals(tableInfoM14505a)) {
                return new RoomOpenHelper.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoM14505a);
            }
            HashMap map2 = new HashMap(24);
            map2.put("id", new TableInfo.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new TableInfo.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new TableInfo.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new TableInfo.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new TableInfo.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new TableInfo.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new TableInfo.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new TableInfo.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new TableInfo.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new TableInfo.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new TableInfo.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new TableInfo.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new TableInfo.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new TableInfo.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new TableInfo.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new TableInfo.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new TableInfo.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new TableInfo.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new TableInfo.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new TableInfo.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new TableInfo.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new TableInfo.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new TableInfo.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new TableInfo.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new TableInfo.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new TableInfo.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            TableInfo tableInfo2 = new TableInfo("WorkSpec", map2, hashSet3, hashSet4);
            TableInfo tableInfoM14505a2 = TableInfo.m14505a(supportSQLiteDatabase, "WorkSpec");
            if (!tableInfo2.equals(tableInfoM14505a2)) {
                return new RoomOpenHelper.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + tableInfo2 + "\n Found:\n" + tableInfoM14505a2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new TableInfo.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new TableInfo.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new TableInfo.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new TableInfo.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            TableInfo tableInfo3 = new TableInfo("WorkTag", map3, hashSet5, hashSet6);
            TableInfo tableInfoM14505a3 = TableInfo.m14505a(supportSQLiteDatabase, "WorkTag");
            if (!tableInfo3.equals(tableInfoM14505a3)) {
                return new RoomOpenHelper.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfoM14505a3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new TableInfo.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new TableInfo.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new TableInfo.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            TableInfo tableInfo4 = new TableInfo("SystemIdInfo", map4, hashSet7, new HashSet(0));
            TableInfo tableInfoM14505a4 = TableInfo.m14505a(supportSQLiteDatabase, "SystemIdInfo");
            if (!tableInfo4.equals(tableInfoM14505a4)) {
                return new RoomOpenHelper.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + tableInfo4 + "\n Found:\n" + tableInfoM14505a4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new TableInfo.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new TableInfo.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new TableInfo.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new TableInfo.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            TableInfo tableInfo5 = new TableInfo("WorkName", map5, hashSet8, hashSet9);
            TableInfo tableInfoM14505a5 = TableInfo.m14505a(supportSQLiteDatabase, "WorkName");
            if (!tableInfo5.equals(tableInfoM14505a5)) {
                return new RoomOpenHelper.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfoM14505a5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new TableInfo.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new TableInfo.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new TableInfo.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            TableInfo tableInfo6 = new TableInfo("WorkProgress", map6, hashSet10, new HashSet(0));
            TableInfo tableInfoM14505a6 = TableInfo.m14505a(supportSQLiteDatabase, "WorkProgress");
            if (!tableInfo6.equals(tableInfoM14505a6)) {
                return new RoomOpenHelper.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + tableInfo6 + "\n Found:\n" + tableInfoM14505a6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new TableInfo.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new TableInfo.a("long_value", "INTEGER", false, 0, null, 1));
            TableInfo tableInfo7 = new TableInfo("Preference", map7, new HashSet(0), new HashSet(0));
            TableInfo tableInfoM14505a7 = TableInfo.m14505a(supportSQLiteDatabase, "Preference");
            if (tableInfo7.equals(tableInfoM14505a7)) {
                return new RoomOpenHelper.b(true, null);
            }
            return new RoomOpenHelper.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfoM14505a7);
        }
    }

    @Override // p636z0.p641a0.RoomDatabase
    /* JADX INFO: renamed from: d */
    public InvalidationTracker mo948d() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p636z0.p641a0.RoomDatabase
    /* JADX INFO: renamed from: e */
    public SupportSQLiteOpenHelper mo949e(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new C0227a(11), "cf029002fffdcadf079e8d0a1c9a70ac", "8aff2efc47fafe870c738f727dfcfc6e");
        Context context = databaseConfiguration.f34243b;
        String str = databaseConfiguration.f34244c;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return databaseConfiguration.f34242a.mo15049a(new SupportSQLiteOpenHelper.b(context, str, roomOpenHelper, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: p */
    public DependencyDao mo941p() {
        DependencyDao dependencyDao;
        if (this.f1377r != null) {
            return this.f1377r;
        }
        synchronized (this) {
            if (this.f1377r == null) {
                this.f1377r = new DependencyDao_Impl(this);
            }
            dependencyDao = this.f1377r;
        }
        return dependencyDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: q */
    public PreferenceDao mo942q() {
        PreferenceDao preferenceDao;
        if (this.f1382w != null) {
            return this.f1382w;
        }
        synchronized (this) {
            if (this.f1382w == null) {
                this.f1382w = new PreferenceDao_Impl(this);
            }
            preferenceDao = this.f1382w;
        }
        return preferenceDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: r */
    public SystemIdInfoDao mo943r() {
        SystemIdInfoDao systemIdInfoDao;
        if (this.f1379t != null) {
            return this.f1379t;
        }
        synchronized (this) {
            if (this.f1379t == null) {
                this.f1379t = new SystemIdInfoDao_Impl(this);
            }
            systemIdInfoDao = this.f1379t;
        }
        return systemIdInfoDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: s */
    public WorkNameDao mo944s() {
        WorkNameDao workNameDao;
        if (this.f1380u != null) {
            return this.f1380u;
        }
        synchronized (this) {
            if (this.f1380u == null) {
                this.f1380u = new WorkNameDao_Impl(this);
            }
            workNameDao = this.f1380u;
        }
        return workNameDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: t */
    public WorkProgressDao mo945t() {
        WorkProgressDao workProgressDao;
        if (this.f1381v != null) {
            return this.f1381v;
        }
        synchronized (this) {
            if (this.f1381v == null) {
                this.f1381v = new WorkProgressDao_Impl(this);
            }
            workProgressDao = this.f1381v;
        }
        return workProgressDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: u */
    public WorkSpecDao mo946u() {
        WorkSpecDao workSpecDao;
        if (this.f1376q != null) {
            return this.f1376q;
        }
        synchronized (this) {
            if (this.f1376q == null) {
                this.f1376q = new WorkSpecDao_Impl(this);
            }
            workSpecDao = this.f1376q;
        }
        return workSpecDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: v */
    public WorkTagDao mo947v() {
        WorkTagDao workTagDao;
        if (this.f1378s != null) {
            return this.f1378s;
        }
        synchronized (this) {
            if (this.f1378s == null) {
                this.f1378s = new WorkTagDao_Impl(this);
            }
            workTagDao = this.f1378s;
        }
        return workTagDao;
    }
}
