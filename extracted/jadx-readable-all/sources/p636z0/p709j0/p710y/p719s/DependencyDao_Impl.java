package p636z0.p709j0.p710y.p719s;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p660c0.p661a.SupportSQLiteStatement;

/* JADX INFO: renamed from: z0.j0.y.s.c, reason: use source file name */
/* JADX INFO: compiled from: DependencyDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class DependencyDao_Impl implements DependencyDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37503a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<Dependency3> f37504b;

    /* JADX INFO: renamed from: z0.j0.y.s.c$a */
    /* JADX INFO: compiled from: DependencyDao_Impl.java */
    public class a extends EntityInsertionAdapter<Dependency3> {
        public a(DependencyDao_Impl dependencyDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, Dependency3 dependency3) {
            Dependency3 dependency4 = dependency3;
            String str = dependency4.f37501a;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14555o(1, str);
            }
            String str2 = dependency4.f37502b;
            if (str2 == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14555o(2, str2);
            }
        }
    }

    public DependencyDao_Impl(RoomDatabase roomDatabase) {
        this.f37503a = roomDatabase;
        this.f37504b = new a(this, roomDatabase);
    }

    /* JADX INFO: renamed from: a */
    public List<String> m15971a(String str) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37503a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37503a, roomSQLiteQueryM14548f, false, null);
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

    /* JADX INFO: renamed from: b */
    public boolean m15972b(String str) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37503a.m14528b();
        boolean z = false;
        Cursor cursorM14503b = DBUtil.m14503b(this.f37503a, roomSQLiteQueryM14548f, false, null);
        try {
            if (cursorM14503b.moveToFirst()) {
                z = cursorM14503b.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorM14503b.close();
            roomSQLiteQueryM14548f.m14554h();
        }
    }
}
