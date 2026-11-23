package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p709j0.Constraints2;
import p636z0.p709j0.Data;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p719s.SystemIdInfo;
import p636z0.p709j0.p710y.p719s.SystemIdInfoDao;
import p636z0.p709j0.p710y.p719s.SystemIdInfoDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkNameDao;
import p636z0.p709j0.p710y.p719s.WorkNameDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkTagDao;
import p636z0.p709j0.p710y.p719s.WorkTagDao_Impl;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: l */
    public static final String f1419l = Logger9.m15886e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: renamed from: a */
    public static String m970a(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List<WorkSpec> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (WorkSpec workSpec : list) {
            SystemIdInfo systemIdInfoM15975a = ((SystemIdInfoDao_Impl) systemIdInfoDao).m15975a(workSpec.f37524a);
            Integer numValueOf = systemIdInfoM15975a != null ? Integer.valueOf(systemIdInfoM15975a.f37510b) : null;
            String str = workSpec.f37524a;
            WorkNameDao_Impl workNameDao_Impl = (WorkNameDao_Impl) workNameDao;
            Objects.requireNonNull(workNameDao_Impl);
            RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                roomSQLiteQueryM14548f.mo14553d0(1);
            } else {
                roomSQLiteQueryM14548f.mo14555o(1, str);
            }
            workNameDao_Impl.f37516a.m14528b();
            Cursor cursorM14503b = DBUtil.m14503b(workNameDao_Impl.f37516a, roomSQLiteQueryM14548f, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
                while (cursorM14503b.moveToNext()) {
                    arrayList.add(cursorM14503b.getString(0));
                }
                cursorM14503b.close();
                roomSQLiteQueryM14548f.m14554h();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", workSpec.f37524a, workSpec.f37526c, numValueOf, workSpec.f37525b.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((WorkTagDao_Impl) workTagDao).m16000a(workSpec.f37524a))));
            } catch (Throwable th) {
                cursorM14503b.close();
                roomSQLiteQueryM14548f.m14554h();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.AbstractC0224a doWork() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        SystemIdInfoDao systemIdInfoDao;
        WorkNameDao workNameDao;
        WorkTagDao workTagDao;
        int i;
        WorkDatabase workDatabase = WorkManagerImpl.m15914b(getApplicationContext()).f37342g;
        WorkSpecDao workSpecDaoMo946u = workDatabase.mo946u();
        WorkNameDao workNameDaoMo944s = workDatabase.mo944s();
        WorkTagDao workTagDaoMo947v = workDatabase.mo947v();
        SystemIdInfoDao systemIdInfoDaoMo943r = workDatabase.mo943r();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) workSpecDaoMo946u;
        Objects.requireNonNull(workSpecDao_Impl);
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        roomSQLiteQueryM14548f.mo14549J(1, jCurrentTimeMillis);
        workSpecDao_Impl.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(workSpecDao_Impl.f37543a, roomSQLiteQueryM14548f, false, null);
        try {
            int iM16940g = C8462c.m16940g(cursorM14503b, "required_network_type");
            int iM16940g2 = C8462c.m16940g(cursorM14503b, "requires_charging");
            int iM16940g3 = C8462c.m16940g(cursorM14503b, "requires_device_idle");
            int iM16940g4 = C8462c.m16940g(cursorM14503b, "requires_battery_not_low");
            int iM16940g5 = C8462c.m16940g(cursorM14503b, "requires_storage_not_low");
            int iM16940g6 = C8462c.m16940g(cursorM14503b, "trigger_content_update_delay");
            int iM16940g7 = C8462c.m16940g(cursorM14503b, "trigger_max_content_delay");
            int iM16940g8 = C8462c.m16940g(cursorM14503b, "content_uri_triggers");
            int iM16940g9 = C8462c.m16940g(cursorM14503b, "id");
            int iM16940g10 = C8462c.m16940g(cursorM14503b, "state");
            int iM16940g11 = C8462c.m16940g(cursorM14503b, "worker_class_name");
            int iM16940g12 = C8462c.m16940g(cursorM14503b, "input_merger_class_name");
            int iM16940g13 = C8462c.m16940g(cursorM14503b, "input");
            int iM16940g14 = C8462c.m16940g(cursorM14503b, "output");
            roomSQLiteQuery = roomSQLiteQueryM14548f;
            try {
                int iM16940g15 = C8462c.m16940g(cursorM14503b, "initial_delay");
                int iM16940g16 = C8462c.m16940g(cursorM14503b, "interval_duration");
                int iM16940g17 = C8462c.m16940g(cursorM14503b, "flex_duration");
                int iM16940g18 = C8462c.m16940g(cursorM14503b, "run_attempt_count");
                int iM16940g19 = C8462c.m16940g(cursorM14503b, "backoff_policy");
                int iM16940g20 = C8462c.m16940g(cursorM14503b, "backoff_delay_duration");
                int iM16940g21 = C8462c.m16940g(cursorM14503b, "period_start_time");
                int iM16940g22 = C8462c.m16940g(cursorM14503b, "minimum_retention_duration");
                int iM16940g23 = C8462c.m16940g(cursorM14503b, "schedule_requested_at");
                int iM16940g24 = C8462c.m16940g(cursorM14503b, "run_in_foreground");
                int i2 = iM16940g14;
                ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
                while (cursorM14503b.moveToNext()) {
                    String string = cursorM14503b.getString(iM16940g9);
                    int i3 = iM16940g9;
                    String string2 = cursorM14503b.getString(iM16940g11);
                    int i4 = iM16940g11;
                    Constraints2 constraints2 = new Constraints2();
                    int i5 = iM16940g;
                    constraints2.f37243b = C8462c.m16948o(cursorM14503b.getInt(iM16940g));
                    constraints2.f37244c = cursorM14503b.getInt(iM16940g2) != 0;
                    constraints2.f37245d = cursorM14503b.getInt(iM16940g3) != 0;
                    constraints2.f37246e = cursorM14503b.getInt(iM16940g4) != 0;
                    constraints2.f37247f = cursorM14503b.getInt(iM16940g5) != 0;
                    int i6 = iM16940g2;
                    int i7 = iM16940g3;
                    constraints2.f37248g = cursorM14503b.getLong(iM16940g6);
                    constraints2.f37249h = cursorM14503b.getLong(iM16940g7);
                    constraints2.f37250i = C8462c.m16934a(cursorM14503b.getBlob(iM16940g8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.f37525b = C8462c.m16949p(cursorM14503b.getInt(iM16940g10));
                    workSpec.f37527d = cursorM14503b.getString(iM16940g12);
                    workSpec.f37528e = Data.m15878a(cursorM14503b.getBlob(iM16940g13));
                    int i8 = i2;
                    workSpec.f37529f = Data.m15878a(cursorM14503b.getBlob(i8));
                    i2 = i8;
                    int i9 = iM16940g12;
                    int i10 = iM16940g15;
                    workSpec.f37530g = cursorM14503b.getLong(i10);
                    int i11 = iM16940g13;
                    int i12 = iM16940g16;
                    workSpec.f37531h = cursorM14503b.getLong(i12);
                    int i13 = iM16940g10;
                    int i14 = iM16940g17;
                    workSpec.f37532i = cursorM14503b.getLong(i14);
                    int i15 = iM16940g18;
                    workSpec.f37534k = cursorM14503b.getInt(i15);
                    int i16 = iM16940g19;
                    workSpec.f37535l = C8462c.m16947n(cursorM14503b.getInt(i16));
                    iM16940g17 = i14;
                    int i17 = iM16940g20;
                    workSpec.f37536m = cursorM14503b.getLong(i17);
                    int i18 = iM16940g21;
                    workSpec.f37537n = cursorM14503b.getLong(i18);
                    iM16940g21 = i18;
                    int i19 = iM16940g22;
                    workSpec.f37538o = cursorM14503b.getLong(i19);
                    int i20 = iM16940g23;
                    workSpec.f37539p = cursorM14503b.getLong(i20);
                    int i21 = iM16940g24;
                    workSpec.f37540q = cursorM14503b.getInt(i21) != 0;
                    workSpec.f37533j = constraints2;
                    arrayList.add(workSpec);
                    iM16940g23 = i20;
                    iM16940g24 = i21;
                    iM16940g12 = i9;
                    iM16940g13 = i11;
                    iM16940g2 = i6;
                    iM16940g16 = i12;
                    iM16940g18 = i15;
                    iM16940g11 = i4;
                    iM16940g3 = i7;
                    iM16940g22 = i19;
                    iM16940g15 = i10;
                    iM16940g9 = i3;
                    iM16940g = i5;
                    iM16940g20 = i17;
                    iM16940g10 = i13;
                    iM16940g19 = i16;
                }
                cursorM14503b.close();
                roomSQLiteQuery.m14554h();
                WorkSpecDao_Impl workSpecDao_Impl2 = (WorkSpecDao_Impl) workSpecDaoMo946u;
                List<WorkSpec> listM15987e = workSpecDao_Impl2.m15987e();
                List<WorkSpec> listM15984b = workSpecDao_Impl2.m15984b(200);
                if (arrayList.isEmpty()) {
                    systemIdInfoDao = systemIdInfoDaoMo943r;
                    workNameDao = workNameDaoMo944s;
                    workTagDao = workTagDaoMo947v;
                    i = 0;
                } else {
                    Logger9 logger9M15885c = Logger9.m15885c();
                    String str = f1419l;
                    i = 0;
                    logger9M15885c.mo15889d(str, "Recently completed work:\n\n", new Throwable[0]);
                    systemIdInfoDao = systemIdInfoDaoMo943r;
                    workNameDao = workNameDaoMo944s;
                    workTagDao = workTagDaoMo947v;
                    Logger9.m15885c().mo15889d(str, m970a(workNameDao, workTagDao, systemIdInfoDao, arrayList), new Throwable[0]);
                }
                if (!((ArrayList) listM15987e).isEmpty()) {
                    Logger9 logger9M15885c2 = Logger9.m15885c();
                    String str2 = f1419l;
                    logger9M15885c2.mo15889d(str2, "Running work:\n\n", new Throwable[i]);
                    Logger9.m15885c().mo15889d(str2, m970a(workNameDao, workTagDao, systemIdInfoDao, listM15987e), new Throwable[i]);
                }
                if (!((ArrayList) listM15984b).isEmpty()) {
                    Logger9 logger9M15885c3 = Logger9.m15885c();
                    String str3 = f1419l;
                    logger9M15885c3.mo15889d(str3, "Enqueued work:\n\n", new Throwable[i]);
                    Logger9.m15885c().mo15889d(str3, m970a(workNameDao, workTagDao, systemIdInfoDao, listM15984b), new Throwable[i]);
                }
                return new ListenableWorker.AbstractC0224a.c();
            } catch (Throwable th) {
                th = th;
                cursorM14503b.close();
                roomSQLiteQuery.m14554h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryM14548f;
        }
    }
}
