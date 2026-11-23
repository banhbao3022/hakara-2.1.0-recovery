package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ex2 {

    /* JADX INFO: renamed from: a */
    public final dw2 f13749a;

    /* JADX INFO: renamed from: b */
    public final cw2 f13750b;

    /* JADX INFO: renamed from: c */
    public final C3680x1 f13751c;

    /* JADX INFO: renamed from: d */
    public final C2843ah f13752d;

    public ex2(dw2 dw2Var, cw2 cw2Var, C3680x1 c3680x1, C3204k7 c3204k7, C3217kk c3217kk, C2843ah c2843ah, C3241l7 c3241l7) {
        this.f13749a = dw2Var;
        this.f13750b = cw2Var;
        this.f13751c = c3680x1;
        this.f13752d = c2843ah;
    }

    /* JADX INFO: renamed from: b */
    public static void m6696b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        gx2 gx2Var = gx2.f14692a;
        C3331nn c3331nn = gx2Var.f14693b;
        String str2 = gx2Var.f14696e.f21615f;
        Objects.requireNonNull(c3331nn);
        C3331nn.m7892j(context, str2, "gmob-apps", bundle, new C3257ln());
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3435qg m6697a(Context context, InterfaceC3395pd interfaceC3395pd) {
        return new xw2(context, interfaceC3395pd).m6891d(context, false);
    }
}
