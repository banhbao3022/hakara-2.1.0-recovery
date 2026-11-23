package p007c.p165l.p166h0.p168c0;

import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.AttributionIdentifiers;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.c0.d, reason: use source file name */
/* JADX INFO: compiled from: CodelessManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class CodelessManager2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f4624f;

    public CodelessManager2(String str) {
        this.f4624f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        GraphRequest2 graphRequest2M2676m = GraphRequest2.m2676m(null, String.format(Locale.US, "%s/app_indexing_session", this.f4624f), null, null);
        Bundle bundle = graphRequest2M2676m.f5380i;
        if (bundle == null) {
            bundle = new Bundle();
        }
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        AttributionIdentifiers attributionIdentifiersM2418c = AttributionIdentifiers.m2418c(FacebookSdk.f5360i);
        JSONArray jSONArray = new JSONArray();
        String str = Build.MODEL;
        jSONArray.put(str != null ? str : "");
        if (attributionIdentifiersM2418c == null || attributionIdentifiersM2418c.m2419b() == null) {
            jSONArray.put("");
        } else {
            jSONArray.put(attributionIdentifiersM2418c.m2419b());
        }
        jSONArray.put("0");
        String str2 = Build.FINGERPRINT;
        jSONArray.put(str2.startsWith("generic") || str2.startsWith("unknown") || str.contains("google_sdk") || str.contains("Emulator") || str.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT)) ? "1" : "0");
        Locale localeM2456o = Utility.m2456o();
        if (localeM2456o == null) {
            localeM2456o = Locale.getDefault();
        }
        jSONArray.put(localeM2456o.getLanguage() + "_" + localeM2456o.getCountry());
        String string = jSONArray.toString();
        if (CodelessManager3.f4628d == null) {
            CodelessManager3.f4628d = UUID.randomUUID().toString();
        }
        bundle.putString("device_session_id", CodelessManager3.f4628d);
        bundle.putString("extinfo", string);
        graphRequest2M2676m.f5380i = bundle;
        JSONObject jSONObject = graphRequest2M2676m.m2687d().f5408c;
        Boolean boolValueOf = Boolean.valueOf(jSONObject != null && jSONObject.optBoolean("is_app_indexing_enabled", false));
        CodelessManager3.f4630f = boolValueOf;
        if (boolValueOf.booleanValue()) {
            ViewIndexer5 viewIndexer5 = CodelessManager3.f4627c;
            if (viewIndexer5 != null) {
                FacebookSdk.m2660b().execute(new ViewIndexer2(viewIndexer5, new ViewIndexer(viewIndexer5)));
            }
        } else {
            CodelessManager3.f4628d = null;
        }
        CodelessManager3.f4631g = Boolean.FALSE;
    }
}
