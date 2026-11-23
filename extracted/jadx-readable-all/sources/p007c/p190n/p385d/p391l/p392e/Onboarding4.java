package p007c.p190n.p385d.p391l.p392e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p391l.p392e.p395k.CommonUtils;
import p007c.p190n.p385d.p391l.p392e.p395k.DataCollectionArbiter;
import p007c.p190n.p385d.p391l.p392e.p395k.IdManager;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequestFactory;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsController;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppRequestData;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppSettingsData;
import p007c.p190n.p385d.p391l.p392e.p406s.p408i.CreateAppSpiCall;
import p007c.p190n.p385d.p391l.p392e.p406s.p408i.UpdateAppSpiCall;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.n.d.l.e.h, reason: use source file name */
/* JADX INFO: compiled from: Onboarding.java */
/* JADX INFO: loaded from: classes.dex */
public class Onboarding4 {

    /* JADX INFO: renamed from: a */
    public final HttpRequestFactory f26430a = new HttpRequestFactory();

    /* JADX INFO: renamed from: b */
    public final FirebaseApp2 f26431b;

    /* JADX INFO: renamed from: c */
    public final Context f26432c;

    /* JADX INFO: renamed from: d */
    public PackageManager f26433d;

    /* JADX INFO: renamed from: e */
    public String f26434e;

    /* JADX INFO: renamed from: f */
    public PackageInfo f26435f;

    /* JADX INFO: renamed from: g */
    public String f26436g;

    /* JADX INFO: renamed from: h */
    public String f26437h;

    /* JADX INFO: renamed from: i */
    public String f26438i;

    /* JADX INFO: renamed from: j */
    public String f26439j;

    /* JADX INFO: renamed from: k */
    public String f26440k;

    /* JADX INFO: renamed from: l */
    public IdManager f26441l;

    /* JADX INFO: renamed from: m */
    public DataCollectionArbiter f26442m;

    public Onboarding4(FirebaseApp2 firebaseApp2, Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter) {
        this.f26431b = firebaseApp2;
        this.f26432c = context;
        this.f26441l = idManager;
        this.f26442m = dataCollectionArbiter;
    }

    /* JADX INFO: renamed from: a */
    public static void m11718a(Onboarding4 onboarding4, AppSettingsData appSettingsData, String str, SettingsController settingsController, Executor executor, boolean z) throws Throwable {
        Objects.requireNonNull(onboarding4);
        if ("new".equals(appSettingsData.f26976a)) {
            if (new CreateAppSpiCall(onboarding4.m11720c(), appSettingsData.f26977b, onboarding4.f26430a, "17.3.0").m12038d(onboarding4.m11719b(appSettingsData.f26980e, str), z)) {
                settingsController.m12033d(2, executor);
                return;
            }
            Logger4 logger4 = Logger4.f26421a;
            if (logger4.m11712a(6)) {
                Log.e(logger4.f26422b, "Failed to create app with Crashlytics service.", null);
                return;
            }
            return;
        }
        if ("configured".equals(appSettingsData.f26976a)) {
            settingsController.m12033d(2, executor);
        } else if (appSettingsData.f26981f) {
            Logger4.f26421a.m11713b("Server says an update is required - forcing a full App update.");
            new UpdateAppSpiCall(onboarding4.m11720c(), appSettingsData.f26977b, onboarding4.f26430a, "17.3.0").m12038d(onboarding4.m11719b(appSettingsData.f26980e, str), z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AppRequestData m11719b(String str, String str2) {
        return new AppRequestData(str, str2, this.f26441l.f26568e, this.f26437h, this.f26436g, CommonUtils.m11742e(CommonUtils.m11748k(this.f26432c), str2, this.f26437h, this.f26436g), this.f26439j, C7804v0.m15333v(C7804v0.m15321j(this.f26438i)), this.f26440k, "0");
    }

    /* JADX INFO: renamed from: c */
    public String m11720c() {
        Context context = this.f26432c;
        int iM11750m = CommonUtils.m11750m(context, "com.crashlytics.ApiEndpoint", "string");
        return iM11750m > 0 ? context.getString(iM11750m) : "";
    }
}
