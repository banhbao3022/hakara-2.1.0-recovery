package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qm1 {

    /* JADX INFO: renamed from: a */
    public final Context f18380a;

    /* JADX INFO: renamed from: b */
    public final String f18381b;

    /* JADX INFO: renamed from: c */
    public final String f18382c;

    public qm1(Context context, C3702xn c3702xn) {
        this.f18380a = context;
        this.f18381b = context.getPackageName();
        this.f18382c = c3702xn.f21615f;
    }

    /* JADX INFO: renamed from: a */
    public final void m8219a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        C2330u c2330u = C2330u.f10884a;
        C2267h1 c2267h1 = c2330u.f10889d;
        map.put("device", C2267h1.m4740J());
        map.put("app", this.f18381b);
        C2267h1 c2267h2 = c2330u.f10889d;
        map.put("is_lite_sdk", true != C2267h1.m4746e(this.f18380a) ? "0" : "1");
        List<String> listM6924c = C3052g3.m6924c();
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14441s4)).booleanValue()) {
            ((ArrayList) listM6924c).addAll(((C2311z0) c2330u.f10893h.m6649f()).mo4818p().f12221i);
        }
        map.put("e", TextUtils.join(",", listM6924c));
        map.put("sdkVersion", this.f18382c);
    }
}
