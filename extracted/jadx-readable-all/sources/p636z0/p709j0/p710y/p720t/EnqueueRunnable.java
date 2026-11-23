package p636z0.p709j0.p710y.p720t;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p709j0.Constraints2;
import p636z0.p709j0.Data;
import p636z0.p709j0.ExistingWorkPolicy;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.Operation;
import p636z0.p709j0.WorkInfo;
import p636z0.p709j0.WorkRequest;
import p636z0.p709j0.p710y.OperationImpl;
import p636z0.p709j0.p710y.Scheduler2;
import p636z0.p709j0.p710y.Schedulers;
import p636z0.p709j0.p710y.WorkContinuationImpl;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p719s.Dependency3;
import p636z0.p709j0.p710y.p719s.DependencyDao;
import p636z0.p709j0.p710y.p719s.DependencyDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkName;
import p636z0.p709j0.p710y.p719s.WorkNameDao;
import p636z0.p709j0.p710y.p719s.WorkNameDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkTag;
import p636z0.p709j0.p710y.p719s.WorkTagDao;
import p636z0.p709j0.p710y.p719s.WorkTagDao_Impl;

/* JADX INFO: renamed from: z0.j0.y.t.e, reason: use source file name */
/* JADX INFO: compiled from: EnqueueRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class EnqueueRunnable implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final String f37564f = Logger9.m15886e("EnqueueRunnable");

    /* JADX INFO: renamed from: g */
    public final WorkContinuationImpl f37565g;

    /* JADX INFO: renamed from: h */
    public final OperationImpl f37566h = new OperationImpl();

    public EnqueueRunnable(WorkContinuationImpl workContinuationImpl) {
        this.f37565g = workContinuationImpl;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0216  */
    /* JADX INFO: renamed from: a */
    public static boolean m16004a(WorkContinuationImpl workContinuationImpl) {
        boolean zM16004a;
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WorkInfo workInfo;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j3;
        boolean z10;
        boolean z11;
        List listEmptyList;
        List<WorkContinuationImpl> list = workContinuationImpl.f37322h;
        if (list != null) {
            zM16004a = false;
            for (WorkContinuationImpl workContinuationImpl2 : list) {
                if (workContinuationImpl2.f37323i) {
                    Logger9.m15885c().mo15891g(f37564f, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", workContinuationImpl2.f37320f)), new Throwable[0]);
                } else {
                    zM16004a |= m16004a(workContinuationImpl2);
                }
            }
        } else {
            zM16004a = false;
        }
        Set<String> setM15913b = WorkContinuationImpl.m15913b(workContinuationImpl);
        WorkManagerImpl workManagerImpl = workContinuationImpl.f37316b;
        List<? extends WorkRequest> list2 = workContinuationImpl.f37319e;
        String[] strArr = (String[]) setM15913b.toArray(new String[0]);
        String str = workContinuationImpl.f37317c;
        ExistingWorkPolicy existingWorkPolicy = workContinuationImpl.f37318d;
        WorkInfo workInfo2 = WorkInfo.ENQUEUED;
        ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.APPEND_OR_REPLACE;
        WorkInfo workInfo3 = WorkInfo.SUCCEEDED;
        WorkInfo workInfo4 = WorkInfo.CANCELLED;
        WorkInfo workInfo5 = WorkInfo.FAILED;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = workManagerImpl.f37342g;
        boolean z12 = strArr != null && strArr.length > 0;
        if (z12) {
            z = zM16004a;
            int length = strArr.length;
            int i = 0;
            z2 = false;
            z3 = false;
            z4 = true;
            while (true) {
                if (i < length) {
                    int i2 = length;
                    String str2 = strArr[i];
                    long j4 = jCurrentTimeMillis;
                    WorkSpec workSpecM15992j = ((WorkSpecDao_Impl) workDatabase.mo946u()).m15992j(str2);
                    if (workSpecM15992j == null) {
                        Logger9.m15885c().mo15888b(f37564f, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    } else {
                        WorkInfo workInfo6 = workSpecM15992j.f37525b;
                        z4 &= workInfo6 == workInfo3;
                        if (workInfo6 == workInfo5) {
                            z3 = true;
                        } else if (workInfo6 == workInfo4) {
                            z2 = true;
                        }
                        i++;
                        length = i2;
                        jCurrentTimeMillis = j4;
                    }
                } else {
                    j2 = jCurrentTimeMillis;
                }
                z8 = true;
                z9 = false;
                workContinuationImpl.f37323i = z8;
                return z | z9;
            }
        }
        z = zM16004a;
        j2 = jCurrentTimeMillis;
        z2 = false;
        z3 = false;
        z4 = true;
        boolean z13 = !TextUtils.isEmpty(str);
        if (z13 && !z12) {
            ArrayList arrayList = (ArrayList) ((WorkSpecDao_Impl) workDatabase.mo946u()).m15993k(str);
            if (arrayList.isEmpty()) {
                z5 = z13;
                workInfo = workInfo2;
            } else if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == existingWorkPolicy2) {
                DependencyDao dependencyDaoMo941p = workDatabase.mo941p();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    WorkSpec.a aVar = (WorkSpec.a) it.next();
                    Iterator it2 = it;
                    String str3 = aVar.f37541a;
                    boolean z14 = z13;
                    DependencyDao_Impl dependencyDao_Impl = (DependencyDao_Impl) dependencyDaoMo941p;
                    Objects.requireNonNull(dependencyDao_Impl);
                    DependencyDao dependencyDao = dependencyDaoMo941p;
                    WorkInfo workInfo7 = workInfo2;
                    RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
                    if (str3 == null) {
                        roomSQLiteQueryM14548f.mo14553d0(1);
                    } else {
                        roomSQLiteQueryM14548f.mo14555o(1, str3);
                    }
                    dependencyDao_Impl.f37503a.m14528b();
                    Cursor cursorM14503b = DBUtil.m14503b(dependencyDao_Impl.f37503a, roomSQLiteQueryM14548f, false, null);
                    try {
                        boolean z15 = cursorM14503b.moveToFirst() && cursorM14503b.getInt(0) != 0;
                        cursorM14503b.close();
                        roomSQLiteQueryM14548f.m14554h();
                        if (!z15) {
                            WorkInfo workInfo8 = aVar.f37542b;
                            boolean z16 = z4 & (workInfo8 == workInfo3);
                            if (workInfo8 == workInfo5) {
                                z3 = true;
                            } else if (workInfo8 == workInfo4) {
                                z2 = true;
                            }
                            arrayList2.add(aVar.f37541a);
                            z4 = z16;
                        }
                        it = it2;
                        z13 = z14;
                        dependencyDaoMo941p = dependencyDao;
                        workInfo2 = workInfo7;
                    } catch (Throwable th) {
                        cursorM14503b.close();
                        roomSQLiteQueryM14548f.m14554h();
                        throw th;
                    }
                }
                z5 = z13;
                workInfo = workInfo2;
                if (existingWorkPolicy == existingWorkPolicy2 && (z2 || z3)) {
                    WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) workDatabase.mo946u();
                    Iterator it3 = ((ArrayList) workSpecDao_Impl.m15993k(str)).iterator();
                    while (it3.hasNext()) {
                        workSpecDao_Impl.m15983a(((WorkSpec.a) it3.next()).f37541a);
                    }
                    z11 = false;
                    z3 = false;
                    listEmptyList = Collections.emptyList();
                } else {
                    z11 = z2;
                    listEmptyList = arrayList2;
                }
                strArr = (String[]) listEmptyList.toArray(strArr);
                z2 = z11;
                z12 = strArr.length > 0;
            } else {
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            WorkInfo workInfo9 = ((WorkSpec.a) it4.next()).f37542b;
                            if (workInfo9 == workInfo2 || workInfo9 == WorkInfo.RUNNING) {
                                z8 = true;
                                z9 = false;
                                workContinuationImpl.f37323i = z8;
                                return z | z9;
                            }
                        }
                    }
                }
                new CancelWorkRunnable3(workManagerImpl, str, false).run();
                WorkSpecDao workSpecDaoMo946u = workDatabase.mo946u();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((WorkSpecDao_Impl) workSpecDaoMo946u).m15983a(((WorkSpec.a) it5.next()).f37541a);
                }
                z5 = z13;
                z6 = z12;
                workInfo = workInfo2;
                z7 = true;
            }
            z6 = z12;
            z7 = false;
        } else {
            z5 = z13;
            workInfo = workInfo2;
            z6 = z12;
            z7 = false;
        }
        for (WorkRequest workRequest : list2) {
            WorkSpec workSpec = workRequest.f37290b;
            if (z6 && !z4) {
                if (z3) {
                    workSpec.f37525b = workInfo5;
                } else if (z2) {
                    workSpec.f37525b = workInfo4;
                } else {
                    workSpec.f37525b = WorkInfo.BLOCKED;
                }
                j3 = j2;
            } else if (workSpec.m15982c()) {
                j3 = j2;
                workSpec.f37537n = 0L;
            } else {
                j3 = j2;
                workSpec.f37537n = j3;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 23 && i3 <= 25) {
                m16005b(workSpec);
            } else if (i3 <= 22) {
                try {
                    Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                    Iterator<Scheduler2> it6 = workManagerImpl.f37344i.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z10 = false;
                            break;
                        }
                        if (cls.isAssignableFrom(it6.next().getClass())) {
                            z10 = true;
                            break;
                        }
                    }
                } catch (ClassNotFoundException unused) {
                }
                if (z10) {
                    m16005b(workSpec);
                }
            }
            WorkInfo workInfo10 = workInfo;
            if (workSpec.f37525b == workInfo10) {
                z7 = true;
            }
            WorkSpecDao_Impl workSpecDao_Impl2 = (WorkSpecDao_Impl) workDatabase.mo946u();
            workSpecDao_Impl2.f37543a.m14528b();
            workSpecDao_Impl2.f37543a.m14529c();
            try {
                workSpecDao_Impl2.f37544b.m14513f(workSpec);
                workSpecDao_Impl2.f37543a.m14537n();
                workSpecDao_Impl2.f37543a.m14530f();
                if (z6) {
                    int length2 = strArr.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        boolean z17 = z6;
                        String[] strArr2 = strArr;
                        Dependency3 dependency3 = new Dependency3(workRequest.m15894a(), strArr[i4]);
                        DependencyDao_Impl dependencyDao_Impl2 = (DependencyDao_Impl) workDatabase.mo941p();
                        dependencyDao_Impl2.f37503a.m14528b();
                        dependencyDao_Impl2.f37503a.m14529c();
                        try {
                            dependencyDao_Impl2.f37504b.m14513f(dependency3);
                            dependencyDao_Impl2.f37503a.m14537n();
                            dependencyDao_Impl2.f37503a.m14530f();
                            i4++;
                            z6 = z17;
                            strArr = strArr2;
                        } catch (Throwable th2) {
                            dependencyDao_Impl2.f37503a.m14530f();
                            throw th2;
                        }
                    }
                }
                boolean z18 = z6;
                String[] strArr3 = strArr;
                for (String str4 : workRequest.f37291c) {
                    WorkTagDao workTagDaoMo947v = workDatabase.mo947v();
                    WorkTag workTag = new WorkTag(str4, workRequest.m15894a());
                    WorkTagDao_Impl workTagDao_Impl = (WorkTagDao_Impl) workTagDaoMo947v;
                    workTagDao_Impl.f37554a.m14528b();
                    workTagDao_Impl.f37554a.m14529c();
                    try {
                        workTagDao_Impl.f37555b.m14513f(workTag);
                        workTagDao_Impl.f37554a.m14537n();
                        workTagDao_Impl.f37554a.m14530f();
                    } catch (Throwable th3) {
                        workTagDao_Impl.f37554a.m14530f();
                        throw th3;
                    }
                }
                if (z5) {
                    WorkNameDao workNameDaoMo944s = workDatabase.mo944s();
                    WorkName workName = new WorkName(str, workRequest.m15894a());
                    WorkNameDao_Impl workNameDao_Impl = (WorkNameDao_Impl) workNameDaoMo944s;
                    workNameDao_Impl.f37516a.m14528b();
                    workNameDao_Impl.f37516a.m14529c();
                    try {
                        workNameDao_Impl.f37517b.m14513f(workName);
                        workNameDao_Impl.f37516a.m14537n();
                        workNameDao_Impl.f37516a.m14530f();
                    } catch (Throwable th4) {
                        workNameDao_Impl.f37516a.m14530f();
                        throw th4;
                    }
                }
                workInfo = workInfo10;
                z6 = z18;
                strArr = strArr3;
                j2 = j3;
            } catch (Throwable th5) {
                workSpecDao_Impl2.f37543a.m14530f();
                throw th5;
            }
        }
        z8 = true;
        z9 = z7;
        workContinuationImpl.f37323i = z8;
        return z | z9;
    }

    /* JADX INFO: renamed from: b */
    public static void m16005b(WorkSpec workSpec) {
        Constraints2 constraints2 = workSpec.f37533j;
        if (constraints2.f37246e || constraints2.f37247f) {
            String str = workSpec.f37526c;
            Data.a aVar = new Data.a();
            aVar.m15882b(workSpec.f37528e.f37260c);
            aVar.f37261a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            workSpec.f37526c = ConstraintTrackingWorker.class.getName();
            workSpec.f37528e = aVar.m15881a();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            WorkContinuationImpl workContinuationImpl = this.f37565g;
            Objects.requireNonNull(workContinuationImpl);
            if (WorkContinuationImpl.m15912a(workContinuationImpl, new HashSet())) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f37565g));
            }
            WorkDatabase workDatabase = this.f37565g.f37316b.f37342g;
            workDatabase.m14529c();
            try {
                boolean zM16004a = m16004a(this.f37565g);
                workDatabase.m14537n();
                workDatabase.m14530f();
                if (zM16004a) {
                    PackageManagerHelper.m16008a(this.f37565g.f37316b.f37340e, RescheduleReceiver.class, true);
                    WorkManagerImpl workManagerImpl = this.f37565g.f37316b;
                    Schedulers.m15911a(workManagerImpl.f37341f, workManagerImpl.f37342g, workManagerImpl.f37344i);
                }
                this.f37566h.m15898a(Operation.f37279a);
            } catch (Throwable th) {
                workDatabase.m14530f();
                throw th;
            }
        } catch (Throwable th2) {
            this.f37566h.m15898a(new Operation.b.a(th2));
        }
    }
}
