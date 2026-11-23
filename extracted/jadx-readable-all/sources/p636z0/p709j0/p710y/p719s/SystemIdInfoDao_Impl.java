package p636z0.p709j0.p710y.p719s;

import android.database.Cursor;
import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.SharedSQLiteStatement;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p660c0.p661a.SupportSQLiteStatement;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: z0.j0.y.s.i, reason: use source file name */
/* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37511a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<SystemIdInfo> f37512b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f37513c;

    /* JADX INFO: renamed from: z0.j0.y.s.i$a */
    /* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
    public class a extends EntityInsertionAdapter<SystemIdInfo> {
        public a(SystemIdInfoDao_Impl systemIdInfoDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, SystemIdInfo systemIdInfo) {
            SystemIdInfo systemIdInfo2 = systemIdInfo;
            String str = systemIdInfo2.f37509a;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14555o(1, str);
            }
            supportSQLiteStatement.mo14549J(2, systemIdInfo2.f37510b);
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.s.i$b */
    /* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        public b(SystemIdInfoDao_Impl systemIdInfoDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public SystemIdInfoDao_Impl(RoomDatabase roomDatabase) {
        this.f37511a = roomDatabase;
        this.f37512b = new a(this, roomDatabase);
        this.f37513c = new b(this, roomDatabase);
    }

    /* JADX INFO: renamed from: a */
    public SystemIdInfo m15975a(String str) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37511a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37511a, roomSQLiteQueryM14548f, false, null);
        try {
            return cursorM14503b.moveToFirst() ? new SystemIdInfo(cursorM14503b.getString(C8462c.m16940g(cursorM14503b, "work_spec_id")), cursorM14503b.getInt(C8462c.m16940g(cursorM14503b, "system_id"))) : null;
        } finally {
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15976b(SystemIdInfo systemIdInfo) {
        this.f37511a.m14528b();
        this.f37511a.m14529c();
        try {
            this.f37512b.m14513f(systemIdInfo);
            this.f37511a.m14537n();
        } finally {
            this.f37511a.m14530f();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15977c(String str) {
        this.f37511a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = this.f37513c.m14559a();
        if (str == null) {
            supportSQLiteStatementM14559a.mo14553d0(1);
        } else {
            supportSQLiteStatementM14559a.mo14555o(1, str);
        }
        this.f37511a.m14529c();
        try {
            supportSQLiteStatementM14559a.mo15051q();
            this.f37511a.m14537n();
            this.f37511a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = this.f37513c;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
        } catch (Throwable th) {
            this.f37511a.m14530f();
            this.f37513c.m14561d(supportSQLiteStatementM14559a);
            throw th;
        }
    }
}
