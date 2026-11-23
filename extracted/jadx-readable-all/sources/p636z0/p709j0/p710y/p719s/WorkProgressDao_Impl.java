package p636z0.p709j0.p710y.p719s;

import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.SharedSQLiteStatement;
import p636z0.p660c0.p661a.SupportSQLiteStatement;
import p636z0.p709j0.Data;

/* JADX INFO: renamed from: z0.j0.y.s.o, reason: use source file name */
/* JADX INFO: compiled from: WorkProgressDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class WorkProgressDao_Impl implements WorkProgressDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37520a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<WorkProgress> f37521b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f37522c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f37523d;

    /* JADX INFO: renamed from: z0.j0.y.s.o$a */
    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    public class a extends EntityInsertionAdapter<WorkProgress> {
        public a(WorkProgressDao_Impl workProgressDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, WorkProgress workProgress) throws Throwable {
            WorkProgress workProgress2 = workProgress;
            String str = workProgress2.f37518a;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14555o(1, str);
            }
            byte[] bArrM15879c = Data.m15879c(workProgress2.f37519b);
            if (bArrM15879c == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14550N(2, bArrM15879c);
            }
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.o$b */
    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        public b(WorkProgressDao_Impl workProgressDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.o$c */
    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        public c(WorkProgressDao_Impl workProgressDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM WorkProgress";
        }
    }

    public WorkProgressDao_Impl(RoomDatabase roomDatabase) {
        this.f37520a = roomDatabase;
        this.f37521b = new a(this, roomDatabase);
        this.f37522c = new b(this, roomDatabase);
        this.f37523d = new c(this, roomDatabase);
    }

    /* JADX INFO: renamed from: a */
    public void m15978a(String str) {
        this.f37520a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = this.f37522c.m14559a();
        if (str == null) {
            supportSQLiteStatementM14559a.mo14553d0(1);
        } else {
            supportSQLiteStatementM14559a.mo14555o(1, str);
        }
        this.f37520a.m14529c();
        try {
            supportSQLiteStatementM14559a.mo15051q();
            this.f37520a.m14537n();
            this.f37520a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = this.f37522c;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
        } catch (Throwable th) {
            this.f37520a.m14530f();
            this.f37522c.m14561d(supportSQLiteStatementM14559a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15979b() {
        this.f37520a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = this.f37523d.m14559a();
        this.f37520a.m14529c();
        try {
            supportSQLiteStatementM14559a.mo15051q();
            this.f37520a.m14537n();
            this.f37520a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = this.f37523d;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
        } catch (Throwable th) {
            this.f37520a.m14530f();
            this.f37523d.m14561d(supportSQLiteStatementM14559a);
            throw th;
        }
    }
}
