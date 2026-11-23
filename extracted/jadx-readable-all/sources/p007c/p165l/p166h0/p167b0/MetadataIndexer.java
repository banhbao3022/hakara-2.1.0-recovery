package p007c.p165l.p166h0.p167b0;

import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.AttributionIdentifiers;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.b0.a, reason: use source file name */
/* JADX INFO: compiled from: MetadataIndexer.java */
/* JADX INFO: loaded from: classes.dex */
public final class MetadataIndexer implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        String str;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        AttributionIdentifiers attributionIdentifiersM2418c = AttributionIdentifiers.m2418c(FacebookSdk.f5360i);
        if (attributionIdentifiersM2418c != null && attributionIdentifiersM2418c.f4891e) {
            return;
        }
        MetadataIndexer2.f4594a.set(true);
        Validate.m2479h();
        FetchedAppSettings fetchedAppSettingsM2528f = FetchedAppSettingsManager.m2528f(FacebookSdk.f5354c, false);
        if (fetchedAppSettingsM2528f == null || (str = fetchedAppSettingsM2528f.f5011k) == null) {
            return;
        }
        List<MetadataRule> list = MetadataRule.f4595a;
        try {
            MetadataRule.f4595a.clear();
            MetadataRule.m2282a(new JSONObject(str));
            MetadataRule.m2283b();
        } catch (JSONException unused) {
        }
    }
}
