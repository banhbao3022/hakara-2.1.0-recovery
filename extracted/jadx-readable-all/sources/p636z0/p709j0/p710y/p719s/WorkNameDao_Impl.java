package p636z0.p709j0.p710y.p719s;

import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p660c0.p661a.SupportSQLiteStatement;

/* JADX INFO: renamed from: z0.j0.y.s.l, reason: use source file name */
/* JADX INFO: compiled from: WorkNameDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class WorkNameDao_Impl implements WorkNameDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37516a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<WorkName> f37517b;

    /* JADX INFO: renamed from: z0.j0.y.s.l$a */
    /* JADX INFO: compiled from: WorkNameDao_Impl.java */
    public class a extends EntityInsertionAdapter<WorkName> {
        public a(WorkNameDao_Impl workNameDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, WorkName workName) {
            WorkName workName2 = workName;
            String str = workName2.f37514a;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14555o(1, str);
            }
            String str2 = workName2.f37515b;
            if (str2 == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14555o(2, str2);
            }
        }
    }

    public WorkNameDao_Impl(RoomDatabase roomDatabase) {
        this.f37516a = roomDatabase;
        this.f37517b = new a(this, roomDatabase);
    }
}
