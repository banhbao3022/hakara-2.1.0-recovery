package p007c.p165l.p178k0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import java.util.HashSet;
import java.util.Map;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;

/* JADX INFO: renamed from: c.l.k0.h, reason: use source file name */
/* JADX INFO: compiled from: DialogPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public class DialogPresenter {

    /* JADX INFO: renamed from: c.l.k0.h$a */
    /* JADX INFO: compiled from: DialogPresenter.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        Bundle mo2485a();

        /* JADX INFO: renamed from: b */
        Bundle mo2486b();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2480a(DialogFeature dialogFeature) {
        return m2481b(dialogFeature).f5065b != -1;
    }

    /* JADX INFO: renamed from: b */
    public static NativeProtocol.g m2481b(DialogFeature dialogFeature) {
        FetchedAppSettings fetchedAppSettingsM2524b;
        Map<String, FetchedAppSettings.a> map;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        String str = FacebookSdk.f5354c;
        String strMo2471h = dialogFeature.mo2471h();
        String strName = dialogFeature.name();
        FetchedAppSettings.a aVar = null;
        if (!Utility.m2466y(strMo2471h) && !Utility.m2466y(strName) && (fetchedAppSettingsM2524b = FetchedAppSettingsManager.m2524b(str)) != null && (map = fetchedAppSettingsM2524b.f5004d.get(strMo2471h)) != null) {
            aVar = map.get(strName);
        }
        return NativeProtocol.m2544h(NativeProtocol.f5060d.get(strMo2471h), aVar != null ? aVar.f5016c : new int[]{dialogFeature.mo2470f()});
    }

    /* JADX INFO: renamed from: c */
    public static void m2482c(AppCall appCall, a aVar, DialogFeature dialogFeature) {
        Intent intentM2550n;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        Context context = FacebookSdk.f5360i;
        String strMo2471h = dialogFeature.mo2471h();
        NativeProtocol.g gVarM2481b = m2481b(dialogFeature);
        int i = gVarM2481b.f5065b;
        if (i == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle bundleMo2485a = NativeProtocol.m2547k(i) ? aVar.mo2485a() : aVar.mo2486b();
        if (bundleMo2485a == null) {
            bundleMo2485a = new Bundle();
        }
        String string = appCall.f4874b.toString();
        Intent intent = null;
        NativeProtocol.f fVar = gVarM2481b.f5064a;
        if (fVar != null && (intentM2550n = NativeProtocol.m2550n(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(fVar.mo2552c()).addCategory("android.intent.category.DEFAULT"))) != null) {
            NativeProtocol.m2548l(intentM2550n, string, strMo2471h, gVarM2481b.f5065b, bundleMo2485a);
            intent = intentM2550n;
        }
        if (intent == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.f4875c = intent;
    }

    /* JADX INFO: renamed from: d */
    public static void m2483d(AppCall appCall, FacebookException facebookException) {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        Validate.m2474c(FacebookSdk.f5360i, true);
        Intent intent = new Intent();
        Validate.m2479h();
        intent.setClass(FacebookSdk.f5360i, FacebookActivity.class);
        String str = FacebookActivity.f28291t;
        intent.setAction("PassThrough");
        NativeProtocol.m2548l(intent, appCall.f4874b.toString(), null, NativeProtocol.m2545i(), NativeProtocol.m2538b(facebookException));
        appCall.f4875c = intent;
    }

    /* JADX INFO: renamed from: e */
    public static void m2484e(AppCall appCall, String str, Bundle bundle) {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        Validate.m2474c(FacebookSdk.f5360i, true);
        Validate.m2479h();
        Validate.m2475d(FacebookSdk.f5360i, true);
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        NativeProtocol.m2548l(intent, appCall.f4874b.toString(), str, NativeProtocol.m2545i(), bundle2);
        Validate.m2479h();
        intent.setClass(FacebookSdk.f5360i, FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        appCall.f4875c = intent;
    }
}
