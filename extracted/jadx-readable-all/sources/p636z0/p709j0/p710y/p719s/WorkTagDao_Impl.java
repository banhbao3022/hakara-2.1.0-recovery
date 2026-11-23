package p636z0.p709j0.p710y.p719s;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p660c0.p661a.SupportSQLiteStatement;

/* JADX INFO: renamed from: z0.j0.y.s.u, reason: use source file name */
/* JADX INFO: compiled from: WorkTagDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class WorkTagDao_Impl implements WorkTagDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37554a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<WorkTag> f37555b;

    /* JADX INFO: renamed from: z0.j0.y.s.u$a */
    /* JADX INFO: compiled from: WorkTagDao_Impl.java */
    public class a extends EntityInsertionAdapter<WorkTag> {
        public a(WorkTagDao_Impl workTagDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, WorkTag workTag) {
            WorkTag workTag2 = workTag;
            String str = workTag2.f37552a;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14555o(1, str);
            }
            String str2 = workTag2.f37553b;
            if (str2 == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14555o(2, str2);
            }
        }
    }

    public WorkTagDao_Impl(RoomDatabase roomDatabase) {
        this.f37554a = roomDatabase;
        this.f37555b = new a(this, roomDatabase);
    }

    /* JADX INFO: renamed from: a */
    public List<String> m16000a(String str) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            roomSQLiteQueryM14548f.mo14553d0(1);
        } else {
            roomSQLiteQueryM14548f.mo14555o(1, str);
        }
        this.f37554a.m14528b();
        Cursor cursorM14503b = DBUtil.m14503b(this.f37554a, roomSQLiteQueryM14548f, false, null);
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
}
