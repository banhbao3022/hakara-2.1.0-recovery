package p007c.p190n.p385d.p391l.p392e.p395k;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p391l.p392e.CrashlyticsNativeComponent;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p393i.AnalyticsEventLogger;
import p007c.p190n.p385d.p391l.p392e.p394j.BreadcrumbSource;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsController;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsDataProvider;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.Settings;

/* JADX INFO: renamed from: c.n.d.l.e.k.g0, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsCore3 {

    /* JADX INFO: renamed from: a */
    public final Context f26500a;

    /* JADX INFO: renamed from: b */
    public final FirebaseApp2 f26501b;

    /* JADX INFO: renamed from: c */
    public final DataCollectionArbiter f26502c;

    /* JADX INFO: renamed from: d */
    public final long f26503d;

    /* JADX INFO: renamed from: e */
    public CrashlyticsFileMarker f26504e;

    /* JADX INFO: renamed from: f */
    public CrashlyticsFileMarker f26505f;

    /* JADX INFO: renamed from: g */
    public C5335t f26506g;

    /* JADX INFO: renamed from: h */
    public final IdManager f26507h;

    /* JADX INFO: renamed from: i */
    public final BreadcrumbSource f26508i;

    /* JADX INFO: renamed from: j */
    public final AnalyticsEventLogger f26509j;

    /* JADX INFO: renamed from: k */
    public ExecutorService f26510k;

    /* JADX INFO: renamed from: l */
    public CrashlyticsBackgroundWorker f26511l;

    /* JADX INFO: renamed from: m */
    public CrashlyticsNativeComponent f26512m;

    /* JADX INFO: renamed from: c.n.d.l.e.k.g0$a */
    /* JADX INFO: compiled from: CrashlyticsCore.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SettingsDataProvider f26513f;

        public a(SettingsDataProvider settingsDataProvider) {
            this.f26513f = settingsDataProvider;
        }

        @Override // java.lang.Runnable
        public void run() {
            CrashlyticsCore3.m11759a(CrashlyticsCore3.this, this.f26513f);
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.g0$b */
    /* JADX INFO: compiled from: CrashlyticsCore.java */
    public class b implements Callable<Boolean> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            try {
                boolean zDelete = CrashlyticsCore3.this.f26504e.m11766b().delete();
                Logger4.f26421a.m11713b("Initialization marker file removed: " + zDelete);
                return Boolean.valueOf(zDelete);
            } catch (Exception e) {
                Logger4 logger4 = Logger4.f26421a;
                if (logger4.m11712a(6)) {
                    Log.e(logger4.f26422b, "Problem encountered deleting Crashlytics initialization marker.", e);
                }
                return Boolean.FALSE;
            }
        }
    }

    public CrashlyticsCore3(FirebaseApp2 firebaseApp2, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, ExecutorService executorService) {
        this.f26501b = firebaseApp2;
        this.f26502c = dataCollectionArbiter;
        firebaseApp2.m11668a();
        this.f26500a = firebaseApp2.f26303d;
        this.f26507h = idManager;
        this.f26512m = crashlyticsNativeComponent;
        this.f26508i = breadcrumbSource;
        this.f26509j = analyticsEventLogger;
        this.f26510k = executorService;
        this.f26511l = new CrashlyticsBackgroundWorker(executorService);
        this.f26503d = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC4781i m11759a(CrashlyticsCore3 crashlyticsCore3, SettingsDataProvider settingsDataProvider) {
        AbstractC4781i<Void> abstractC4781iM10207d;
        crashlyticsCore3.f26511l.m11762a();
        crashlyticsCore3.f26504e.m11765a();
        Logger4 logger4 = Logger4.f26421a;
        logger4.m11713b("Initialization marker file created.");
        C5335t c5335t = crashlyticsCore3.f26506g;
        CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = c5335t.f26596m;
        crashlyticsBackgroundWorker.m11763b(new CrashlyticsBackgroundWorker2(crashlyticsBackgroundWorker, new RunnableC5325o(c5335t)));
        try {
            try {
                crashlyticsCore3.f26508i.mo11724a(new CrashlyticsCore(crashlyticsCore3));
                SettingsController settingsController = (SettingsController) settingsDataProvider;
                Settings settingsM12032c = settingsController.m12032c();
                if (settingsM12032c.mo12036a().f26984a) {
                    if (!crashlyticsCore3.f26506g.m11792h(settingsM12032c.mo12037b().f26985a)) {
                        logger4.m11713b("Could not finalize previous sessions.");
                    }
                    abstractC4781iM10207d = crashlyticsCore3.f26506g.m11802v(1.0f, settingsController.m12030a());
                } else {
                    logger4.m11713b("Collection of crash reports disabled in Crashlytics settings.");
                    abstractC4781iM10207d = C4340s8.m10207d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                }
            } catch (Exception e) {
                Logger4 logger5 = Logger4.f26421a;
                if (logger5.m11712a(6)) {
                    Log.e(logger5.f26422b, "Crashlytics encountered a problem during asynchronous initialization.", e);
                }
                abstractC4781iM10207d = C4340s8.m10207d(e);
            }
            return abstractC4781iM10207d;
        } finally {
            crashlyticsCore3.m11761c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11760b(SettingsDataProvider settingsDataProvider) {
        Future<?> futureSubmit = this.f26510k.submit(new a(settingsDataProvider));
        Logger4.f26421a.m11713b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger4 logger4 = Logger4.f26421a;
            if (logger4.m11712a(6)) {
                Log.e(logger4.f26422b, "Crashlytics was interrupted during initialization.", e);
            }
        } catch (ExecutionException e2) {
            Logger4 logger5 = Logger4.f26421a;
            if (logger5.m11712a(6)) {
                Log.e(logger5.f26422b, "Problem encountered during Crashlytics initialization.", e2);
            }
        } catch (TimeoutException e3) {
            Logger4 logger6 = Logger4.f26421a;
            if (logger6.m11712a(6)) {
                Log.e(logger6.f26422b, "Crashlytics timed out during initialization.", e3);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11761c() {
        this.f26511l.m11763b(new b());
    }
}
