package p007c.p190n.p385d.p391l;

import java.io.FilenameFilter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p391l.p392e.Onboarding;
import p007c.p190n.p385d.p391l.p392e.Onboarding2;
import p007c.p190n.p385d.p391l.p392e.Onboarding4;
import p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsCore2;
import p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsCore3;
import p007c.p190n.p385d.p391l.p392e.p395k.Utils3;
import p007c.p190n.p385d.p391l.p392e.p395k.Utils5;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsController;

/* JADX INFO: renamed from: c.n.d.l.c, reason: use source file name */
/* JADX INFO: compiled from: FirebaseCrashlytics.java */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCrashlytics implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Onboarding4 f26416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ExecutorService f26417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SettingsController f26418c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f26419d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CrashlyticsCore3 f26420e;

    public FirebaseCrashlytics(Onboarding4 onboarding4, ExecutorService executorService, SettingsController settingsController, boolean z, CrashlyticsCore3 crashlyticsCore3) {
        this.f26416a = onboarding4;
        this.f26417b = executorService;
        this.f26418c = settingsController;
        this.f26419d = z;
        this.f26420e = crashlyticsCore3;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        Onboarding4 onboarding4 = this.f26416a;
        ExecutorService executorService = this.f26417b;
        SettingsController settingsController = this.f26418c;
        FirebaseApp2 firebaseApp2 = onboarding4.f26431b;
        firebaseApp2.m11668a();
        onboarding4.f26442m.m11771b().mo10942o(executorService, new Onboarding2(onboarding4, settingsController)).mo10942o(executorService, new Onboarding(onboarding4, firebaseApp2.f26305f.f26320b, settingsController, executorService));
        if (!this.f26419d) {
            return null;
        }
        CrashlyticsCore3 crashlyticsCore3 = this.f26420e;
        SettingsController settingsController2 = this.f26418c;
        ExecutorService executorService2 = crashlyticsCore3.f26510k;
        CrashlyticsCore2 crashlyticsCore2 = new CrashlyticsCore2(crashlyticsCore3, settingsController2);
        FilenameFilter filenameFilter = Utils3.f26467a;
        executorService2.execute(new Utils5(crashlyticsCore2, new C4782j()));
        return null;
    }
}
