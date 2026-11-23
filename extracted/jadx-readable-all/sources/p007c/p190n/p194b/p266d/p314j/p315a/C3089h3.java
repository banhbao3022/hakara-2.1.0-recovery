package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.h3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3089h3 {

    /* JADX INFO: renamed from: a */
    public final String f14724a = C3201k4.f15880b.m6603d();

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f14725b;

    /* JADX INFO: renamed from: c */
    public final Context f14726c;

    /* JADX INFO: renamed from: d */
    public final String f14727d;

    /* JADX WARN: Multi-variable type inference failed */
    public C3089h3(Context context, String str) {
        this.f14726c = context;
        this.f14727d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f14725b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        C2330u c2330u = C2330u.f10884a;
        C2267h1 c2267h1 = c2330u.f10889d;
        linkedHashMap.put("device", C2267h1.m4740J());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        C2267h1 c2267h2 = c2330u.f10889d;
        linkedHashMap.put("is_lite_sdk", true != C2267h1.m4746e(context) ? "0" : "1");
        C3734yi c3734yi = c2330u.f10900o;
        Objects.requireNonNull(c3734yi);
        kv1 kv1VarMo6691u0 = C2962do.f13330a.mo6691u0(new CallableC3660wi(c3734yi, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C3623vi) kv1VarMo6691u0.get()).f20799j));
            linkedHashMap.put("network_fine", Integer.toString(((C3623vi) kv1VarMo6691u0.get()).f20800k));
        } catch (Exception e) {
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "CsiConfiguration.CsiConfiguration");
        }
    }
}
