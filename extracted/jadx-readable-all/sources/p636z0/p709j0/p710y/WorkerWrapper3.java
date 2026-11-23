package p636z0.p709j0.p710y;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p709j0.Configuration;
import p636z0.p709j0.Data;
import p636z0.p709j0.InputMerger;
import p636z0.p709j0.InputMergerFactory2;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.WorkInfo;
import p636z0.p709j0.p710y.p718r.ForegroundProcessor;
import p636z0.p709j0.p710y.p719s.DependencyDao;
import p636z0.p709j0.p710y.p719s.DependencyDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkProgressDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkTagDao;
import p636z0.p709j0.p710y.p719s.WorkTagDao_Impl;
import p636z0.p709j0.p710y.p720t.PackageManagerHelper;
import p636z0.p709j0.p710y.p720t.WorkForegroundUpdater2;
import p636z0.p709j0.p710y.p720t.WorkProgressUpdater2;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: renamed from: z0.j0.y.o, reason: use source file name */
/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkerWrapper3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final String f37355f = Logger9.m15886e("WorkerWrapper");

    /* JADX INFO: renamed from: g */
    public Context f37356g;

    /* JADX INFO: renamed from: h */
    public String f37357h;

    /* JADX INFO: renamed from: i */
    public List<Scheduler2> f37358i;

    /* JADX INFO: renamed from: j */
    public WorkerParameters.C0226a f37359j;

    /* JADX INFO: renamed from: k */
    public WorkSpec f37360k;

    /* JADX INFO: renamed from: n */
    public Configuration f37363n;

    /* JADX INFO: renamed from: o */
    public TaskExecutor2 f37364o;

    /* JADX INFO: renamed from: p */
    public ForegroundProcessor f37365p;

    /* JADX INFO: renamed from: q */
    public WorkDatabase f37366q;

    /* JADX INFO: renamed from: r */
    public WorkSpecDao f37367r;

    /* JADX INFO: renamed from: s */
    public DependencyDao f37368s;

    /* JADX INFO: renamed from: t */
    public WorkTagDao f37369t;

    /* JADX INFO: renamed from: u */
    public List<String> f37370u;

    /* JADX INFO: renamed from: v */
    public String f37371v;

    /* JADX INFO: renamed from: y */
    public volatile boolean f37374y;

    /* JADX INFO: renamed from: m */
    public ListenableWorker.AbstractC0224a f37362m = new ListenableWorker.AbstractC0224a.a();

    /* JADX INFO: renamed from: w */
    public SettableFuture<Boolean> f37372w = new SettableFuture<>();

    /* JADX INFO: renamed from: x */
    public ListenableFuture<ListenableWorker.AbstractC0224a> f37373x = null;

    /* JADX INFO: renamed from: l */
    public ListenableWorker f37361l = null;

    /* JADX INFO: renamed from: z0.j0.y.o$a */
    /* JADX INFO: compiled from: WorkerWrapper.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Context f37375a;

        /* JADX INFO: renamed from: b */
        public ForegroundProcessor f37376b;

        /* JADX INFO: renamed from: c */
        public TaskExecutor2 f37377c;

        /* JADX INFO: renamed from: d */
        public Configuration f37378d;

        /* JADX INFO: renamed from: e */
        public WorkDatabase f37379e;

        /* JADX INFO: renamed from: f */
        public String f37380f;

        /* JADX INFO: renamed from: g */
        public List<Scheduler2> f37381g;

        /* JADX INFO: renamed from: h */
        public WorkerParameters.C0226a f37382h = new WorkerParameters.C0226a();

        public a(Context context, Configuration configuration, TaskExecutor2 taskExecutor2, ForegroundProcessor foregroundProcessor, WorkDatabase workDatabase, String str) {
            this.f37375a = context.getApplicationContext();
            this.f37377c = taskExecutor2;
            this.f37376b = foregroundProcessor;
            this.f37378d = configuration;
            this.f37379e = workDatabase;
            this.f37380f = str;
        }
    }

    public WorkerWrapper3(a aVar) {
        this.f37356g = aVar.f37375a;
        this.f37364o = aVar.f37377c;
        this.f37365p = aVar.f37376b;
        this.f37357h = aVar.f37380f;
        this.f37358i = aVar.f37381g;
        this.f37359j = aVar.f37382h;
        this.f37363n = aVar.f37378d;
        WorkDatabase workDatabase = aVar.f37379e;
        this.f37366q = workDatabase;
        this.f37367r = workDatabase.mo946u();
        this.f37368s = this.f37366q.mo941p();
        this.f37369t = this.f37366q.mo947v();
    }

    /* JADX INFO: renamed from: a */
    public final void m15920a(ListenableWorker.AbstractC0224a abstractC0224a) {
        if (!(abstractC0224a instanceof ListenableWorker.AbstractC0224a.c)) {
            if (abstractC0224a instanceof ListenableWorker.AbstractC0224a.b) {
                Logger9.m15885c().mo15889d(f37355f, String.format("Worker result RETRY for %s", this.f37371v), new Throwable[0]);
                m15923d();
                return;
            }
            Logger9.m15885c().mo15889d(f37355f, String.format("Worker result FAILURE for %s", this.f37371v), new Throwable[0]);
            if (this.f37360k.m15982c()) {
                m15924e();
                return;
            } else {
                m15927h();
                return;
            }
        }
        Logger9.m15885c().mo15889d(f37355f, String.format("Worker result SUCCESS for %s", this.f37371v), new Throwable[0]);
        if (this.f37360k.m15982c()) {
            m15924e();
            return;
        }
        this.f37366q.m14529c();
        try {
            ((WorkSpecDao_Impl) this.f37367r).m15999q(WorkInfo.SUCCEEDED, this.f37357h);
            ((WorkSpecDao_Impl) this.f37367r).m15997o(this.f37357h, ((ListenableWorker.AbstractC0224a.c) this.f37362m).f1357a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : (ArrayList) ((DependencyDao_Impl) this.f37368s).m15971a(this.f37357h)) {
                if (((WorkSpecDao_Impl) this.f37367r).m15989g(str) == WorkInfo.BLOCKED && ((DependencyDao_Impl) this.f37368s).m15972b(str)) {
                    Logger9.m15885c().mo15889d(f37355f, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    ((WorkSpecDao_Impl) this.f37367r).m15999q(WorkInfo.ENQUEUED, str);
                    ((WorkSpecDao_Impl) this.f37367r).m15998p(str, jCurrentTimeMillis);
                }
            }
            this.f37366q.m14537n();
        } finally {
            this.f37366q.m14530f();
            m15925f(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15921b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((WorkSpecDao_Impl) this.f37367r).m15989g(str2) != WorkInfo.CANCELLED) {
                ((WorkSpecDao_Impl) this.f37367r).m15999q(WorkInfo.FAILED, str2);
            }
            linkedList.addAll(((DependencyDao_Impl) this.f37368s).m15971a(str2));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15922c() {
        if (!m15928i()) {
            this.f37366q.m14529c();
            try {
                WorkInfo workInfoM15989g = ((WorkSpecDao_Impl) this.f37367r).m15989g(this.f37357h);
                ((WorkProgressDao_Impl) this.f37366q.mo945t()).m15978a(this.f37357h);
                if (workInfoM15989g == null) {
                    m15925f(false);
                } else if (workInfoM15989g == WorkInfo.RUNNING) {
                    m15920a(this.f37362m);
                } else if (!workInfoM15989g.m15892f()) {
                    m15923d();
                }
                this.f37366q.m14537n();
                this.f37366q.m14530f();
            } catch (Throwable th) {
                this.f37366q.m14530f();
                throw th;
            }
        }
        List<Scheduler2> list = this.f37358i;
        if (list != null) {
            Iterator<Scheduler2> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo15910e(this.f37357h);
            }
            Schedulers.m15911a(this.f37363n, this.f37366q, this.f37358i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15923d() {
        this.f37366q.m14529c();
        try {
            ((WorkSpecDao_Impl) this.f37367r).m15999q(WorkInfo.ENQUEUED, this.f37357h);
            ((WorkSpecDao_Impl) this.f37367r).m15998p(this.f37357h, System.currentTimeMillis());
            ((WorkSpecDao_Impl) this.f37367r).m15995m(this.f37357h, -1L);
            this.f37366q.m14537n();
        } finally {
            this.f37366q.m14530f();
            m15925f(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15924e() {
        this.f37366q.m14529c();
        try {
            ((WorkSpecDao_Impl) this.f37367r).m15998p(this.f37357h, System.currentTimeMillis());
            ((WorkSpecDao_Impl) this.f37367r).m15999q(WorkInfo.ENQUEUED, this.f37357h);
            ((WorkSpecDao_Impl) this.f37367r).m15996n(this.f37357h);
            ((WorkSpecDao_Impl) this.f37367r).m15995m(this.f37357h, -1L);
            this.f37366q.m14537n();
        } finally {
            this.f37366q.m14530f();
            m15925f(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15925f(boolean z) {
        ListenableWorker listenableWorker;
        this.f37366q.m14529c();
        try {
            if (((ArrayList) ((WorkSpecDao_Impl) this.f37366q.mo946u()).m15985c()).isEmpty()) {
                PackageManagerHelper.m16008a(this.f37356g, RescheduleReceiver.class, false);
            }
            if (z) {
                ((WorkSpecDao_Impl) this.f37367r).m15999q(WorkInfo.ENQUEUED, this.f37357h);
                ((WorkSpecDao_Impl) this.f37367r).m15995m(this.f37357h, -1L);
            }
            if (this.f37360k != null && (listenableWorker = this.f37361l) != null && listenableWorker.isRunInForeground()) {
                ForegroundProcessor foregroundProcessor = this.f37365p;
                String str = this.f37357h;
                Processor processor = (Processor) foregroundProcessor;
                synchronized (processor.f37310q) {
                    processor.f37305l.remove(str);
                    processor.m15905h();
                }
            }
            this.f37366q.m14537n();
            this.f37366q.m14530f();
            this.f37372w.m16027k(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f37366q.m14530f();
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15926g() {
        WorkInfo workInfoM15989g = ((WorkSpecDao_Impl) this.f37367r).m15989g(this.f37357h);
        if (workInfoM15989g == WorkInfo.RUNNING) {
            Logger9.m15885c().mo15887a(f37355f, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f37357h), new Throwable[0]);
            m15925f(true);
        } else {
            Logger9.m15885c().mo15887a(f37355f, String.format("Status for %s is %s; not doing any work", this.f37357h, workInfoM15989g), new Throwable[0]);
            m15925f(false);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m15927h() {
        this.f37366q.m14529c();
        try {
            m15921b(this.f37357h);
            Data data = ((ListenableWorker.AbstractC0224a.a) this.f37362m).f1356a;
            ((WorkSpecDao_Impl) this.f37367r).m15997o(this.f37357h, data);
            this.f37366q.m14537n();
        } finally {
            this.f37366q.m14530f();
            m15925f(false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m15928i() {
        if (!this.f37374y) {
            return false;
        }
        Logger9.m15885c().mo15887a(f37355f, String.format("Work interrupted for %s", this.f37371v), new Throwable[0]);
        WorkInfo workInfoM15989g = ((WorkSpecDao_Impl) this.f37367r).m15989g(this.f37357h);
        if (workInfoM15989g == null) {
            m15925f(false);
        } else {
            m15925f(!workInfoM15989g.m15892f());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c1 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:14:0x0057, B:16:0x0065, B:17:0x0086, B:19:0x008a, B:20:0x00ac, B:22:0x00b2, B:24:0x00b8, B:38:0x0104, B:29:0x00c1, B:34:0x00d4, B:36:0x00dc), top: B:95:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    @Override // java.lang.Runnable
    public void run() {
        WorkSpec workSpec;
        boolean z;
        Data dataMo938a;
        boolean z2;
        List<String> listM16000a = ((WorkTagDao_Impl) this.f37369t).m16000a(this.f37357h);
        this.f37370u = listM16000a;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f37357h);
        sb.append(", tags={ ");
        boolean z3 = true;
        for (String str : listM16000a) {
            if (z3) {
                z3 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        this.f37371v = sb.toString();
        WorkInfo workInfo = WorkInfo.ENQUEUED;
        if (m15928i()) {
            return;
        }
        this.f37366q.m14529c();
        try {
            WorkSpec workSpecM15992j = ((WorkSpecDao_Impl) this.f37367r).m15992j(this.f37357h);
            this.f37360k = workSpecM15992j;
            if (workSpecM15992j == null) {
                Logger9.m15885c().mo15888b(f37355f, String.format("Didn't find WorkSpec for id %s", this.f37357h), new Throwable[0]);
                m15925f(false);
                this.f37366q.m14537n();
            } else {
                if (workSpecM15992j.f37525b == workInfo) {
                    if (workSpecM15992j.m15982c()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        workSpec = this.f37360k;
                        if (workSpec.f37537n == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Logger9.m15885c().mo15887a(f37355f, String.format("Delaying execution for %s because it is being executed before schedule.", this.f37360k.f37526c), new Throwable[0]);
                            m15925f(true);
                            this.f37366q.m14537n();
                        }
                    } else {
                        WorkSpec workSpec2 = this.f37360k;
                        if (workSpec2.f37525b == workInfo && workSpec2.f37534k > 0) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            workSpec = this.f37360k;
                            if (workSpec.f37537n == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && jCurrentTimeMillis2 < workSpec.m15980a()) {
                                Logger9.m15885c().mo15887a(f37355f, String.format("Delaying execution for %s because it is being executed before schedule.", this.f37360k.f37526c), new Throwable[0]);
                                m15925f(true);
                                this.f37366q.m14537n();
                            }
                        }
                    }
                    this.f37366q.m14537n();
                    this.f37366q.m14530f();
                    if (this.f37360k.m15982c()) {
                        dataMo938a = this.f37360k.f37528e;
                    } else {
                        InputMergerFactory2 inputMergerFactory2 = this.f37363n.f37223d;
                        String str2 = this.f37360k.f37527d;
                        InputMerger inputMergerMo15884a = inputMergerFactory2.mo15884a(str2);
                        if (inputMergerMo15884a == null) {
                            String str3 = InputMerger.f37270a;
                            try {
                                inputMergerMo15884a = (InputMerger) Class.forName(str2).newInstance();
                            } catch (Exception e) {
                                Logger9.m15885c().mo15888b(InputMerger.f37270a, outline.m1599u("Trouble instantiating + ", str2), e);
                                inputMergerMo15884a = null;
                            }
                        }
                        if (inputMergerMo15884a == null) {
                            Logger9.m15885c().mo15888b(f37355f, String.format("Could not create Input Merger %s", this.f37360k.f37527d), new Throwable[0]);
                            m15927h();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f37360k.f37528e);
                        WorkSpecDao workSpecDao = this.f37367r;
                        String str4 = this.f37357h;
                        WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) workSpecDao;
                        Objects.requireNonNull(workSpecDao_Impl);
                        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                        if (str4 == null) {
                            roomSQLiteQueryM14548f.mo14553d0(1);
                        } else {
                            roomSQLiteQueryM14548f.mo14555o(1, str4);
                        }
                        workSpecDao_Impl.f37543a.m14528b();
                        Cursor cursorM14503b = DBUtil.m14503b(workSpecDao_Impl.f37543a, roomSQLiteQueryM14548f, false, null);
                        try {
                            ArrayList arrayList2 = new ArrayList(cursorM14503b.getCount());
                            while (cursorM14503b.moveToNext()) {
                                arrayList2.add(Data.m15878a(cursorM14503b.getBlob(0)));
                            }
                            cursorM14503b.close();
                            roomSQLiteQueryM14548f.m14554h();
                            arrayList.addAll(arrayList2);
                            dataMo938a = inputMergerMo15884a.mo938a(arrayList);
                        } catch (Throwable th) {
                            cursorM14503b.close();
                            roomSQLiteQueryM14548f.m14554h();
                            throw th;
                        }
                    }
                    Data data = dataMo938a;
                    UUID uuidFromString = UUID.fromString(this.f37357h);
                    List<String> list = this.f37370u;
                    WorkerParameters.C0226a c0226a = this.f37359j;
                    int i = this.f37360k.f37534k;
                    Configuration configuration = this.f37363n;
                    WorkerParameters workerParameters = new WorkerParameters(uuidFromString, data, list, c0226a, i, configuration.f37220a, this.f37364o, configuration.f37222c, new WorkProgressUpdater2(this.f37366q, this.f37364o), new WorkForegroundUpdater2(this.f37366q, this.f37365p, this.f37364o));
                    if (this.f37361l == null) {
                        this.f37361l = this.f37363n.f37222c.m15897b(this.f37356g, this.f37360k.f37526c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f37361l;
                    if (listenableWorker == null) {
                        Logger9.m15885c().mo15888b(f37355f, String.format("Could not create Worker %s", this.f37360k.f37526c), new Throwable[0]);
                        m15927h();
                        return;
                    }
                    if (listenableWorker.isUsed()) {
                        Logger9.m15885c().mo15888b(f37355f, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f37360k.f37526c), new Throwable[0]);
                        m15927h();
                        return;
                    }
                    this.f37361l.setUsed();
                    this.f37366q.m14529c();
                    try {
                        if (((WorkSpecDao_Impl) this.f37367r).m15989g(this.f37357h) == workInfo) {
                            z2 = true;
                            ((WorkSpecDao_Impl) this.f37367r).m15999q(WorkInfo.RUNNING, this.f37357h);
                            ((WorkSpecDao_Impl) this.f37367r).m15994l(this.f37357h);
                        } else {
                            z2 = false;
                        }
                        this.f37366q.m14537n();
                        this.f37366q.m14530f();
                        if (!z2) {
                            m15926g();
                            return;
                        } else {
                            if (m15928i()) {
                                return;
                            }
                            SettableFuture settableFuture = new SettableFuture();
                            ((WorkManagerTaskExecutor) this.f37364o).f37641c.execute(new WorkerWrapper(this, settableFuture));
                            settableFuture.mo11664h(new WorkerWrapper2(this, settableFuture, this.f37371v), ((WorkManagerTaskExecutor) this.f37364o).f37639a);
                            return;
                        }
                    } catch (Throwable th2) {
                        this.f37366q.m14530f();
                        throw th2;
                    }
                }
                m15926g();
                this.f37366q.m14537n();
                Logger9.m15885c().mo15887a(f37355f, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f37360k.f37526c), new Throwable[0]);
            }
            this.f37366q.m14530f();
        } catch (Throwable th3) {
            this.f37366q.m14530f();
            throw th3;
        }
    }
}
