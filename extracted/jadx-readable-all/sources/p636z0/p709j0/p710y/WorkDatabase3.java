package p636z0.p709j0.p710y;

import androidx.work.impl.WorkDatabase;
import p636z0.p641a0.RoomDatabase;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;

/* JADX INFO: renamed from: z0.j0.y.i, reason: use source file name */
/* JADX INFO: compiled from: WorkDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkDatabase3 extends RoomDatabase.b {
    @Override // p636z0.p641a0.RoomDatabase.b
    /* JADX INFO: renamed from: a */
    public void mo14541a(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.mo15043i();
        try {
            int i = WorkDatabase.f1374o;
            supportSQLiteDatabase.mo15045n("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f1373n) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            supportSQLiteDatabase.mo15037K();
        } finally {
            supportSQLiteDatabase.mo15041T();
        }
    }
}
