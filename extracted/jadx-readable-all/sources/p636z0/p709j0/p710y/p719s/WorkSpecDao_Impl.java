package p636z0.p709j0.p710y.p719s;

import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.SharedSQLiteStatement;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p660c0.p661a.SupportSQLiteStatement;
import p636z0.p709j0.BackoffPolicy;
import p636z0.p709j0.Constraints2;
import p636z0.p709j0.ContentUriTriggers;
import p636z0.p709j0.Data;
import p636z0.p709j0.NetworkType;
import p636z0.p709j0.WorkInfo;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: z0.j0.y.s.r, reason: use source file name */
/* JADX INFO: compiled from: WorkSpecDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37543a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<WorkSpec> f37544b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f37545c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f37546d;

    /* JADX INFO: renamed from: e */
    public final SharedSQLiteStatement f37547e;

    /* JADX INFO: renamed from: f */
    public final SharedSQLiteStatement f37548f;

    /* JADX INFO: renamed from: g */
    public final SharedSQLiteStatement f37549g;

    /* JADX INFO: renamed from: h */
    public final SharedSQLiteStatement f37550h;

    /* JADX INFO: renamed from: i */
    public final SharedSQLiteStatement f37551i;

    /* JADX INFO: renamed from: z0.j0.y.s.r$a */
    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class a extends EntityInsertionAdapter<WorkSpec> {
        public a(WorkSpecDao_Impl workSpecDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21, types: [java.io.ByteArrayOutputStream] */
        /* JADX WARN: Type inference failed for: r2v23, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r4v21 */
        /* JADX WARN: Type inference failed for: r4v22, types: [java.io.ObjectOutputStream] */
        /* JADX WARN: Type inference failed for: r4v25 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x017e -> B:95:0x0182). Please report as a decompilation issue!!! */
        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) throws Throwable {
            int i;
            ?? byteArrayOutputStream;
            Throwable th;
            ?? r4;
            ?? r2;
            WorkSpec workSpec2 = workSpec;
            String str = workSpec2.f37524a;
            int i2 = 1;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14555o(1, str);
            }
            supportSQLiteStatement.mo14549J(2, C8462c.m16932A(workSpec2.f37525b));
            String str2 = workSpec2.f37526c;
            if (str2 == null) {
                supportSQLiteStatement.mo14553d0(3);
            } else {
                supportSQLiteStatement.mo14555o(3, str2);
            }
            String str3 = workSpec2.f37527d;
            int i3 = 4;
            if (str3 == null) {
                supportSQLiteStatement.mo14553d0(4);
            } else {
                supportSQLiteStatement.mo14555o(4, str3);
            }
            byte[] bArrM15879c = Data.m15879c(workSpec2.f37528e);
            if (bArrM15879c == null) {
                supportSQLiteStatement.mo14553d0(5);
            } else {
                supportSQLiteStatement.mo14550N(5, bArrM15879c);
            }
            byte[] bArrM15879c2 = Data.m15879c(workSpec2.f37529f);
            if (bArrM15879c2 == null) {
                supportSQLiteStatement.mo14553d0(6);
            } else {
                supportSQLiteStatement.mo14550N(6, bArrM15879c2);
            }
            supportSQLiteStatement.mo14549J(7, workSpec2.f37530g);
            supportSQLiteStatement.mo14549J(8, workSpec2.f37531h);
            supportSQLiteStatement.mo14549J(9, workSpec2.f37532i);
            supportSQLiteStatement.mo14549J(10, workSpec2.f37534k);
            BackoffPolicy backoffPolicy = workSpec2.f37535l;
            int iOrdinal = backoffPolicy.ordinal();
            if (iOrdinal == 0) {
                i = 0;
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
                }
                i = 1;
            }
            supportSQLiteStatement.mo14549J(11, i);
            supportSQLiteStatement.mo14549J(12, workSpec2.f37536m);
            supportSQLiteStatement.mo14549J(13, workSpec2.f37537n);
            supportSQLiteStatement.mo14549J(14, workSpec2.f37538o);
            supportSQLiteStatement.mo14549J(15, workSpec2.f37539p);
            supportSQLiteStatement.mo14549J(16, workSpec2.f37540q ? 1L : 0L);
            Constraints2 constraints2 = workSpec2.f37533j;
            if (constraints2 == null) {
                supportSQLiteStatement.mo14553d0(17);
                supportSQLiteStatement.mo14553d0(18);
                supportSQLiteStatement.mo14553d0(19);
                supportSQLiteStatement.mo14553d0(20);
                supportSQLiteStatement.mo14553d0(21);
                supportSQLiteStatement.mo14553d0(22);
                supportSQLiteStatement.mo14553d0(23);
                supportSQLiteStatement.mo14553d0(24);
                return;
            }
            NetworkType networkType = constraints2.f37243b;
            int iOrdinal2 = networkType.ordinal();
            if (iOrdinal2 == 0) {
                i3 = 0;
            } else if (iOrdinal2 == 1) {
                i3 = i2;
            } else {
                if (iOrdinal2 == 2) {
                    i2 = 2;
                } else if (iOrdinal2 == 3) {
                    i2 = 3;
                } else if (iOrdinal2 != 4) {
                    throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                }
                i3 = i2;
            }
            supportSQLiteStatement.mo14549J(17, i3);
            supportSQLiteStatement.mo14549J(18, constraints2.f37244c ? 1L : 0L);
            supportSQLiteStatement.mo14549J(19, constraints2.f37245d ? 1L : 0L);
            supportSQLiteStatement.mo14549J(20, constraints2.f37246e ? 1L : 0L);
            supportSQLiteStatement.mo14549J(21, constraints2.f37247f ? 1L : 0L);
            supportSQLiteStatement.mo14549J(22, constraints2.f37248g);
            supportSQLiteStatement.mo14549J(23, constraints2.f37249h);
            ContentUriTriggers contentUriTriggers = constraints2.f37250i;
            byte[] byteArray = null;
            ObjectOutputStream objectOutputStream = null;
            byteArray = null;
            if (contentUriTriggers.m15877a() != 0) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        try {
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                objectOutputStream2.writeInt(contentUriTriggers.m15877a());
                                for (ContentUriTriggers.a aVar : contentUriTriggers.f37255a) {
                                    objectOutputStream2.writeUTF(aVar.f37256a.toString());
                                    objectOutputStream2.writeBoolean(aVar.f37257b);
                                }
                                objectOutputStream2.close();
                            } catch (IOException e) {
                                e = e;
                                objectOutputStream = objectOutputStream2;
                                e.printStackTrace();
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r2 = byteArrayOutputStream;
                                r4 = objectOutputStream2;
                                if (r4 != 0) {
                                    try {
                                        r4.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                try {
                                    r2.close();
                                    throw th;
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r4 = byteArray;
                            r2 = byteArrayOutputStream;
                        }
                    } catch (IOException e4) {
                        e = e4;
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
            if (byteArray == null) {
                byteArrayOutputStream = 24;
                supportSQLiteStatement.mo14553d0(24);
            } else {
                byteArrayOutputStream = 24;
                supportSQLiteStatement.mo14550N(24, byteArray);
            }
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.r$b */
    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        public b(WorkSpecDao_Impl workSpecDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.r$c */
    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        public c(WorkSpecDao_Impl workSpecDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.r$d */
    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class d extends SharedSQLiteStatement {
        public d(WorkSpecDao_Impl workSpecDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.r$e */
    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class e extends SharedSQLiteStatement {
        public e(WorkSpecDao_Impl workSpecDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.r$f */
    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class f extends SharedSQLiteStatement {
        public f(WorkSpecDao_Impl workSpecDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.r$g */
    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class g extends SharedSQLiteStatement {
        public g(WorkSpecDao_Impl workSpecDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.r$h */
    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class h extends SharedSQLiteStatement {
        public h(WorkSpecDao_Impl workSpecDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.r$i */
    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class i extends SharedSQLiteStatement {
        public i(WorkSpecDao_Impl workSpecDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.f37543a = roomDatabase;
        this.f37544b = new a(this, roomDatabase);
        this.f37545c = new b(this, roomDatabase);
        this.f37546d = new c(this, roomDatabase);
        this.f37547e = new d(this, roomDatabase);
        this.f37548f = new e(this, roomDatabase);
        this.f37549g = new f(this, roomDatabase);
        this.f37550h = new g(this, roomDatabase);
        this.f37551i = new h(this, roomDatabase);
        new i(this, roomDatabase);
    }

    /* JADX INFO: renamed from: a */
    public void m15983a(String str) {
        this.f37543a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = this.f37545c.m14559a();
        if (str == null) {
            supportSQLiteStatementM14559a.mo14553d0(1);
        } else {
            supportSQLiteStatementM14559a.mo14555o(1, str);
        }
        this.f37543a.m14529c();
        try {
            supportSQLiteStatementM14559a.mo15051q();
            this.f37543a.m14537n();
            this.f37543a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = this.f37545c;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
        } catch (Throwable th) {
            this.f37543a.m14530f();
            this.f37545c.m14561d(supportSQLiteStatementM14559a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public List<WorkSpec> m15984b(int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        roomSQLiteQueryM14548f.mo14549J(1, i2);
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
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
                int i3 = iM16940g14;
                ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
                while (cursorM14503b.moveToNext()) {
                    String string = cursorM14503b.getString(iM16940g9);
                    int i4 = iM16940g9;
                    String string2 = cursorM14503b.getString(iM16940g11);
                    int i5 = iM16940g11;
                    Constraints2 constraints2 = new Constraints2();
                    int i6 = iM16940g;
                    constraints2.f37243b = C8462c.m16948o(cursorM14503b.getInt(iM16940g));
                    constraints2.f37244c = cursorM14503b.getInt(iM16940g2) != 0;
                    constraints2.f37245d = cursorM14503b.getInt(iM16940g3) != 0;
                    constraints2.f37246e = cursorM14503b.getInt(iM16940g4) != 0;
                    constraints2.f37247f = cursorM14503b.getInt(iM16940g5) != 0;
                    int i7 = iM16940g2;
                    int i8 = iM16940g3;
                    constraints2.f37248g = cursorM14503b.getLong(iM16940g6);
                    constraints2.f37249h = cursorM14503b.getLong(iM16940g7);
                    constraints2.f37250i = C8462c.m16934a(cursorM14503b.getBlob(iM16940g8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.f37525b = C8462c.m16949p(cursorM14503b.getInt(iM16940g10));
                    workSpec.f37527d = cursorM14503b.getString(iM16940g12);
                    workSpec.f37528e = Data.m15878a(cursorM14503b.getBlob(iM16940g13));
                    int i9 = i3;
                    workSpec.f37529f = Data.m15878a(cursorM14503b.getBlob(i9));
                    i3 = i9;
                    int i10 = iM16940g15;
                    workSpec.f37530g = cursorM14503b.getLong(i10);
                    int i11 = iM16940g12;
                    int i12 = iM16940g16;
                    workSpec.f37531h = cursorM14503b.getLong(i12);
                    int i13 = iM16940g4;
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
                    iM16940g2 = i7;
                    iM16940g12 = i11;
                    iM16940g15 = i10;
                    iM16940g16 = i12;
                    iM16940g18 = i15;
                    iM16940g9 = i4;
                    iM16940g11 = i5;
                    iM16940g = i6;
                    iM16940g22 = i19;
                    iM16940g3 = i8;
                    iM16940g20 = i17;
                    iM16940g4 = i13;
                    iM16940g19 = i16;
                }
                cursorM14503b.close();
                roomSQLiteQuery.m14554h();
                return arrayList;
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

    /* JADX INFO: renamed from: c */
    public List<String> m15985c() {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
            while (cursorM14503b.moveToNext()) {
                arrayList.add(cursorM14503b.getString(0));
            }
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
            return arrayList;
        } catch (Throwable th) {
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public List<WorkSpec> m15986d(int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        roomSQLiteQueryM14548f.mo14549J(1, i2);
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
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
                int i3 = iM16940g14;
                ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
                while (cursorM14503b.moveToNext()) {
                    String string = cursorM14503b.getString(iM16940g9);
                    int i4 = iM16940g9;
                    String string2 = cursorM14503b.getString(iM16940g11);
                    int i5 = iM16940g11;
                    Constraints2 constraints2 = new Constraints2();
                    int i6 = iM16940g;
                    constraints2.f37243b = C8462c.m16948o(cursorM14503b.getInt(iM16940g));
                    constraints2.f37244c = cursorM14503b.getInt(iM16940g2) != 0;
                    constraints2.f37245d = cursorM14503b.getInt(iM16940g3) != 0;
                    constraints2.f37246e = cursorM14503b.getInt(iM16940g4) != 0;
                    constraints2.f37247f = cursorM14503b.getInt(iM16940g5) != 0;
                    int i7 = iM16940g2;
                    int i8 = iM16940g3;
                    constraints2.f37248g = cursorM14503b.getLong(iM16940g6);
                    constraints2.f37249h = cursorM14503b.getLong(iM16940g7);
                    constraints2.f37250i = C8462c.m16934a(cursorM14503b.getBlob(iM16940g8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.f37525b = C8462c.m16949p(cursorM14503b.getInt(iM16940g10));
                    workSpec.f37527d = cursorM14503b.getString(iM16940g12);
                    workSpec.f37528e = Data.m15878a(cursorM14503b.getBlob(iM16940g13));
                    int i9 = i3;
                    workSpec.f37529f = Data.m15878a(cursorM14503b.getBlob(i9));
                    i3 = i9;
                    int i10 = iM16940g15;
                    workSpec.f37530g = cursorM14503b.getLong(i10);
                    int i11 = iM16940g12;
                    int i12 = iM16940g16;
                    workSpec.f37531h = cursorM14503b.getLong(i12);
                    int i13 = iM16940g4;
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
                    iM16940g2 = i7;
                    iM16940g12 = i11;
                    iM16940g15 = i10;
                    iM16940g16 = i12;
                    iM16940g18 = i15;
                    iM16940g9 = i4;
                    iM16940g11 = i5;
                    iM16940g = i6;
                    iM16940g22 = i19;
                    iM16940g3 = i8;
                    iM16940g20 = i17;
                    iM16940g4 = i13;
                    iM16940g19 = i16;
                }
                cursorM14503b.close();
                roomSQLiteQuery.m14554h();
                return arrayList;
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

    /* JADX INFO: renamed from: e */
    public List<WorkSpec> m15987e() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
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
                    int i9 = iM16940g15;
                    workSpec.f37530g = cursorM14503b.getLong(i9);
                    int i10 = iM16940g13;
                    int i11 = iM16940g16;
                    workSpec.f37531h = cursorM14503b.getLong(i11);
                    int i12 = iM16940g4;
                    int i13 = iM16940g17;
                    workSpec.f37532i = cursorM14503b.getLong(i13);
                    int i14 = iM16940g18;
                    workSpec.f37534k = cursorM14503b.getInt(i14);
                    int i15 = iM16940g19;
                    workSpec.f37535l = C8462c.m16947n(cursorM14503b.getInt(i15));
                    iM16940g17 = i13;
                    int i16 = iM16940g20;
                    workSpec.f37536m = cursorM14503b.getLong(i16);
                    int i17 = iM16940g21;
                    workSpec.f37537n = cursorM14503b.getLong(i17);
                    iM16940g21 = i17;
                    int i18 = iM16940g22;
                    workSpec.f37538o = cursorM14503b.getLong(i18);
                    int i19 = iM16940g23;
                    workSpec.f37539p = cursorM14503b.getLong(i19);
                    int i20 = iM16940g24;
                    workSpec.f37540q = cursorM14503b.getInt(i20) != 0;
                    workSpec.f37533j = constraints2;
                    arrayList.add(workSpec);
                    iM16940g23 = i19;
                    iM16940g24 = i20;
                    iM16940g2 = i6;
                    iM16940g13 = i10;
                    iM16940g15 = i9;
                    iM16940g16 = i11;
                    iM16940g18 = i14;
                    iM16940g9 = i3;
                    iM16940g11 = i4;
                    iM16940g = i5;
                    iM16940g22 = i18;
                    iM16940g3 = i7;
                    iM16940g20 = i16;
                    iM16940g4 = i12;
                    iM16940g19 = i15;
                }
                cursorM14503b.close();
                roomSQLiteQuery.m14554h();
                return arrayList;
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

    /* JADX INFO: renamed from: f */
    public List<WorkSpec> m15988f() {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
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
                    int i9 = iM16940g15;
                    workSpec.f37530g = cursorM14503b.getLong(i9);
                    int i10 = iM16940g13;
                    int i11 = iM16940g16;
                    workSpec.f37531h = cursorM14503b.getLong(i11);
                    int i12 = iM16940g4;
                    int i13 = iM16940g17;
                    workSpec.f37532i = cursorM14503b.getLong(i13);
                    int i14 = iM16940g18;
                    workSpec.f37534k = cursorM14503b.getInt(i14);
                    int i15 = iM16940g19;
                    workSpec.f37535l = C8462c.m16947n(cursorM14503b.getInt(i15));
                    iM16940g17 = i13;
                    int i16 = iM16940g20;
                    workSpec.f37536m = cursorM14503b.getLong(i16);
                    int i17 = iM16940g21;
                    workSpec.f37537n = cursorM14503b.getLong(i17);
                    iM16940g21 = i17;
                    int i18 = iM16940g22;
                    workSpec.f37538o = cursorM14503b.getLong(i18);
                    int i19 = iM16940g23;
                    workSpec.f37539p = cursorM14503b.getLong(i19);
                    int i20 = iM16940g24;
                    workSpec.f37540q = cursorM14503b.getInt(i20) != 0;
                    workSpec.f37533j = constraints2;
                    arrayList.add(workSpec);
                    iM16940g23 = i19;
                    iM16940g24 = i20;
                    iM16940g2 = i6;
                    iM16940g13 = i10;
                    iM16940g15 = i9;
                    iM16940g16 = i11;
                    iM16940g18 = i14;
                    iM16940g9 = i3;
                    iM16940g11 = i4;
                    iM16940g = i5;
                    iM16940g22 = i18;
                    iM16940g3 = i7;
                    iM16940g20 = i16;
                    iM16940g4 = i12;
                    iM16940g19 = i15;
                }
                cursorM14503b.close();
                roomSQLiteQuery.m14554h();
                return arrayList;
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

    /* JADX INFO: renamed from: g */
    public WorkInfo m15989g(String str) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
        try {
            return cursorM14503b.moveToFirst() ? C8462c.m16949p(cursorM14503b.getInt(0)) : null;
        } finally {
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
        }
    }

    /* JADX INFO: renamed from: h */
    public List<String> m15990h(String str) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
            while (cursorM14503b.moveToNext()) {
                arrayList.add(cursorM14503b.getString(0));
            }
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
            return arrayList;
        } catch (Throwable th) {
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public List<String> m15991i(String str) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
            while (cursorM14503b.moveToNext()) {
                arrayList.add(cursorM14503b.getString(0));
            }
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
            return arrayList;
        } catch (Throwable th) {
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public WorkSpec m15992j(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
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
                if (cursorM14503b.moveToFirst()) {
                    String string = cursorM14503b.getString(iM16940g9);
                    String string2 = cursorM14503b.getString(iM16940g11);
                    Constraints2 constraints2 = new Constraints2();
                    constraints2.f37243b = C8462c.m16948o(cursorM14503b.getInt(iM16940g));
                    constraints2.f37244c = cursorM14503b.getInt(iM16940g2) != 0;
                    constraints2.f37245d = cursorM14503b.getInt(iM16940g3) != 0;
                    constraints2.f37246e = cursorM14503b.getInt(iM16940g4) != 0;
                    constraints2.f37247f = cursorM14503b.getInt(iM16940g5) != 0;
                    constraints2.f37248g = cursorM14503b.getLong(iM16940g6);
                    constraints2.f37249h = cursorM14503b.getLong(iM16940g7);
                    constraints2.f37250i = C8462c.m16934a(cursorM14503b.getBlob(iM16940g8));
                    WorkSpec workSpec2 = new WorkSpec(string, string2);
                    workSpec2.f37525b = C8462c.m16949p(cursorM14503b.getInt(iM16940g10));
                    workSpec2.f37527d = cursorM14503b.getString(iM16940g12);
                    workSpec2.f37528e = Data.m15878a(cursorM14503b.getBlob(iM16940g13));
                    workSpec2.f37529f = Data.m15878a(cursorM14503b.getBlob(iM16940g14));
                    workSpec2.f37530g = cursorM14503b.getLong(iM16940g15);
                    workSpec2.f37531h = cursorM14503b.getLong(iM16940g16);
                    workSpec2.f37532i = cursorM14503b.getLong(iM16940g17);
                    workSpec2.f37534k = cursorM14503b.getInt(iM16940g18);
                    workSpec2.f37535l = C8462c.m16947n(cursorM14503b.getInt(iM16940g19));
                    workSpec2.f37536m = cursorM14503b.getLong(iM16940g20);
                    workSpec2.f37537n = cursorM14503b.getLong(iM16940g21);
                    workSpec2.f37538o = cursorM14503b.getLong(iM16940g22);
                    workSpec2.f37539p = cursorM14503b.getLong(iM16940g23);
                    workSpec2.f37540q = cursorM14503b.getInt(iM16940g24) != 0;
                    workSpec2.f37533j = constraints2;
                    workSpec = workSpec2;
                } else {
                    workSpec = null;
                }
                cursorM14503b.close();
                roomSQLiteQuery.m14554h();
                return workSpec;
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

    /* JADX INFO: renamed from: k */
    public List<WorkSpec.a> m15993k(String str) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37543a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37543a, roomSQLiteQueryM14548f, false, null);
        try {
            int iM16940g = C8462c.m16940g(cursorM14503b, "id");
            int iM16940g2 = C8462c.m16940g(cursorM14503b, "state");
            ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
            while (cursorM14503b.moveToNext()) {
                WorkSpec.a aVar = new WorkSpec.a();
                aVar.f37541a = cursorM14503b.getString(iM16940g);
                aVar.f37542b = C8462c.m16949p(cursorM14503b.getInt(iM16940g2));
                arrayList.add(aVar);
            }
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
            return arrayList;
        } catch (Throwable th) {
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public int m15994l(String str) {
        this.f37543a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = this.f37548f.m14559a();
        if (str == null) {
            supportSQLiteStatementM14559a.mo14553d0(1);
        } else {
            supportSQLiteStatementM14559a.mo14555o(1, str);
        }
        this.f37543a.m14529c();
        try {
            int iMo15051q = supportSQLiteStatementM14559a.mo15051q();
            this.f37543a.m14537n();
            this.f37543a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = this.f37548f;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
            return iMo15051q;
        } catch (Throwable th) {
            this.f37543a.m14530f();
            this.f37548f.m14561d(supportSQLiteStatementM14559a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public int m15995m(String str, long j2) {
        this.f37543a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = this.f37550h.m14559a();
        supportSQLiteStatementM14559a.mo14549J(1, j2);
        if (str == null) {
            supportSQLiteStatementM14559a.mo14553d0(2);
        } else {
            supportSQLiteStatementM14559a.mo14555o(2, str);
        }
        this.f37543a.m14529c();
        try {
            int iMo15051q = supportSQLiteStatementM14559a.mo15051q();
            this.f37543a.m14537n();
            return iMo15051q;
        } finally {
            this.f37543a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = this.f37550h;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public int m15996n(String str) {
        this.f37543a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = this.f37549g.m14559a();
        if (str == null) {
            supportSQLiteStatementM14559a.mo14553d0(1);
        } else {
            supportSQLiteStatementM14559a.mo14555o(1, str);
        }
        this.f37543a.m14529c();
        try {
            int iMo15051q = supportSQLiteStatementM14559a.mo15051q();
            this.f37543a.m14537n();
            this.f37543a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = this.f37549g;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
            return iMo15051q;
        } catch (Throwable th) {
            this.f37543a.m14530f();
            this.f37549g.m14561d(supportSQLiteStatementM14559a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m15997o(String str, Data data) throws Throwable {
        this.f37543a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = this.f37546d.m14559a();
        byte[] bArrM15879c = Data.m15879c(data);
        if (bArrM15879c == null) {
            supportSQLiteStatementM14559a.mo14553d0(1);
        } else {
            supportSQLiteStatementM14559a.mo14550N(1, bArrM15879c);
        }
        if (str == null) {
            supportSQLiteStatementM14559a.mo14553d0(2);
        } else {
            supportSQLiteStatementM14559a.mo14555o(2, str);
        }
        this.f37543a.m14529c();
        try {
            supportSQLiteStatementM14559a.mo15051q();
            this.f37543a.m14537n();
            this.f37543a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = this.f37546d;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
        } catch (Throwable th) {
            this.f37543a.m14530f();
            this.f37546d.m14561d(supportSQLiteStatementM14559a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m15998p(String str, long j2) {
        this.f37543a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = this.f37547e.m14559a();
        supportSQLiteStatementM14559a.mo14549J(1, j2);
        if (str == null) {
            supportSQLiteStatementM14559a.mo14553d0(2);
        } else {
            supportSQLiteStatementM14559a.mo14555o(2, str);
        }
        this.f37543a.m14529c();
        try {
            supportSQLiteStatementM14559a.mo15051q();
            this.f37543a.m14537n();
        } finally {
            this.f37543a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = this.f37547e;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public int m15999q(WorkInfo workInfo, String... strArr) {
        this.f37543a.m14528b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("?");
            if (i2 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        RoomDatabase roomDatabase = this.f37543a;
        roomDatabase.m14527a();
        roomDatabase.m14528b();
        SupportSQLiteStatement supportSQLiteStatementMo15047r = roomDatabase.f34306d.mo14509e().mo15047r(string);
        supportSQLiteStatementMo15047r.mo14549J(1, C8462c.m16932A(workInfo));
        int i3 = 2;
        for (String str : strArr) {
            if (str == null) {
                supportSQLiteStatementMo15047r.mo14553d0(i3);
            } else {
                supportSQLiteStatementMo15047r.mo14555o(i3, str);
            }
            i3++;
        }
        this.f37543a.m14529c();
        try {
            int iMo15051q = supportSQLiteStatementMo15047r.mo15051q();
            this.f37543a.m14537n();
            return iMo15051q;
        } finally {
            this.f37543a.m14530f();
        }
    }
}
