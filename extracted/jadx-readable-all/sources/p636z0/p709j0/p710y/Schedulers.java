package p636z0.p709j0.p710y;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p636z0.p709j0.Configuration;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;

/* JADX INFO: renamed from: z0.j0.y.f, reason: use source file name */
/* JADX INFO: compiled from: Schedulers.java */
/* JADX INFO: loaded from: classes.dex */
public class Schedulers {

    /* JADX INFO: renamed from: a */
    public static final String f37314a = Logger9.m15886e("Schedulers");

    /* JADX INFO: renamed from: a */
    public static void m15911a(Configuration configuration, WorkDatabase workDatabase, List<Scheduler2> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDaoMo946u = workDatabase.mo946u();
        workDatabase.m14529c();
        try {
            WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) workSpecDaoMo946u;
            List<WorkSpec> listM15986d = workSpecDao_Impl.m15986d(Build.VERSION.SDK_INT == 23 ? configuration.f37230k / 2 : configuration.f37230k);
            List<WorkSpec> listM15984b = workSpecDao_Impl.m15984b(200);
            if (((ArrayList) listM15986d).size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) listM15986d).iterator();
                while (it.hasNext()) {
                    workSpecDao_Impl.m15995m(((WorkSpec) it.next()).f37524a, jCurrentTimeMillis);
                }
            }
            workDatabase.m14537n();
            workDatabase.m14530f();
            ArrayList arrayList = (ArrayList) listM15986d;
            if (arrayList.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) arrayList.toArray(new WorkSpec[arrayList.size()]);
                for (Scheduler2 scheduler2 : list) {
                    if (scheduler2.mo15909c()) {
                        scheduler2.mo15908a(workSpecArr);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) listM15984b;
            if (arrayList2.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) arrayList2.toArray(new WorkSpec[arrayList2.size()]);
                for (Scheduler2 scheduler3 : list) {
                    if (!scheduler3.mo15909c()) {
                        scheduler3.mo15908a(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.m14530f();
            throw th;
        }
    }
}
