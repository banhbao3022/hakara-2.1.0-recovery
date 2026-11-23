package p007c.p190n.p385d.p391l.p392e.p393i;

import android.os.Bundle;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p394j.BreadcrumbSource;
import p007c.p190n.p385d.p391l.p392e.p395k.C5335t;
import p007c.p190n.p385d.p391l.p392e.p395k.CallableC5321m;
import p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsCore;
import p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsCore3;

/* JADX INFO: renamed from: c.n.d.l.e.i.d, reason: use source file name */
/* JADX INFO: compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {

    /* JADX INFO: renamed from: a */
    public CrashlyticsCore f26448a;

    /* JADX INFO: renamed from: c */
    public static String m11723c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p394j.BreadcrumbSource
    /* JADX INFO: renamed from: a */
    public void mo11724a(CrashlyticsCore crashlyticsCore) {
        this.f26448a = crashlyticsCore;
        Logger4.f26421a.m11713b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p393i.AnalyticsEventReceiver
    /* JADX INFO: renamed from: b */
    public void mo11722b(String str, Bundle bundle) {
        CrashlyticsCore crashlyticsCore = this.f26448a;
        if (crashlyticsCore != null) {
            try {
                String str2 = "$A$:" + m11723c(str, bundle);
                CrashlyticsCore3 crashlyticsCore3 = crashlyticsCore.f26480a;
                Objects.requireNonNull(crashlyticsCore3);
                long jCurrentTimeMillis = System.currentTimeMillis() - crashlyticsCore3.f26503d;
                C5335t c5335t = crashlyticsCore3.f26506g;
                c5335t.f26596m.m11763b(new CallableC5321m(c5335t, jCurrentTimeMillis, str2));
            } catch (JSONException unused) {
                Logger4.f26421a.m11717f("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
