package p007c.p190n.p194b.p266d.p327k.p329b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: c.n.b.d.k.b.e7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4501e7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f23865f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Uri f23866g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23867h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f23868i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4453a7 f23869j;

    public RunnableC4501e7(C4453a7 c4453a7, boolean z, Uri uri, String str, String str2) {
        this.f23869j = c4453a7;
        this.f23865f = z;
        this.f23866g = uri;
        this.f23867h = str;
        this.f23868i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleM10906x;
        Bundle bundleM10906x2;
        C4453a7 c4453a7 = this.f23869j;
        boolean z = this.f23865f;
        Uri uri = this.f23866g;
        String str = this.f23867h;
        String str2 = this.f23868i;
        c4453a7.f23715f.mo10381b();
        try {
            if (c4453a7.f23715f.f24476a.f24534h.m10417k(C4647r.f24346e0) || c4453a7.f23715f.f24476a.f24534h.m10417k(C4647r.f24350g0) || c4453a7.f23715f.f24476a.f24534h.m10417k(C4647r.f24348f0)) {
                C4723x9 c4723x9M10817f = c4453a7.f23715f.m10817f();
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium")) {
                        bundleM10906x = c4723x9M10817f.m10906x(Uri.parse(str2.length() != 0 ? "https://google.com/search?".concat(str2) : new String("https://google.com/search?")));
                        if (bundleM10906x != null) {
                            bundleM10906x.putString("_cis", "referrer");
                        }
                    } else {
                        c4723x9M10817f.mo10684l().f24425m.m10811a("Activity created with data 'referrer' without required params");
                    }
                }
                bundleM10906x = null;
            } else {
                bundleM10906x = null;
            }
            boolean z2 = true;
            if (z) {
                bundleM10906x2 = c4453a7.f23715f.m10817f().m10906x(uri);
                if (bundleM10906x2 != null) {
                    bundleM10906x2.putString("_cis", "intent");
                    if (c4453a7.f23715f.f24476a.f24534h.m10417k(C4647r.f24346e0) && !bundleM10906x2.containsKey("gclid") && bundleM10906x != null && bundleM10906x.containsKey("gclid")) {
                        bundleM10906x2.putString("_cer", String.format("gclid=%s", bundleM10906x.getString("gclid")));
                    }
                    c4453a7.f23715f.m10517H(str, "_cmp", bundleM10906x2);
                    if (c4453a7.f23715f.f24476a.f24534h.m10417k(C4647r.f24303D0)) {
                        c4453a7.f23715f.f23862n.m10507a(str, bundleM10906x2);
                    }
                }
            } else {
                bundleM10906x2 = null;
            }
            if (c4453a7.f23715f.f24476a.f24534h.m10417k(C4647r.f24350g0) && !c4453a7.f23715f.f24476a.f24534h.m10417k(C4647r.f24348f0) && bundleM10906x != null && bundleM10906x.containsKey("gclid") && (bundleM10906x2 == null || !bundleM10906x2.containsKey("gclid"))) {
                c4453a7.f23715f.m10519J("auto", "_lgclid", bundleM10906x.getString("gclid"));
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c4453a7.f23715f.mo10684l().f24425m.m10812b("Activity created with referrer", str2);
            if (c4453a7.f23715f.f24476a.f24534h.m10417k(C4647r.f24348f0)) {
                if (bundleM10906x != null) {
                    c4453a7.f23715f.m10517H(str, "_cmp", bundleM10906x);
                    if (c4453a7.f23715f.f24476a.f24534h.m10417k(C4647r.f24303D0)) {
                        c4453a7.f23715f.f23862n.m10507a(str, bundleM10906x);
                    }
                } else {
                    c4453a7.f23715f.mo10684l().f24425m.m10812b("Referrer does not contain valid parameters", str2);
                }
                c4453a7.f23715f.m10519J("auto", "_ldl", null);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                z2 = false;
            }
            if (!z2) {
                c4453a7.f23715f.mo10684l().f24425m.m10811a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                c4453a7.f23715f.m10519J("auto", "_ldl", str2);
            }
        } catch (Exception e) {
            c4453a7.f23715f.mo10684l().f24418f.m10812b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
