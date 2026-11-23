package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.BinderC2329t;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2219b0;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2220c;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2221d;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2238u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2239v;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2241x;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractBinderC2938d0;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3264lu;
import p007c.p190n.p194b.p266d.p314j.p315a.C2896bw;
import p007c.p190n.p194b.p266d.p314j.p315a.C2933cw;
import p007c.p190n.p194b.p266d.p314j.p315a.C3266lw;
import p007c.p190n.p194b.p266d.p314j.p315a.C3340nw;
import p007c.p190n.p194b.p266d.p314j.p315a.C3600uw;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3395pd;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3404pm;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3435qg;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj;
import p007c.p190n.p194b.p266d.p314j.p315a.jw2;
import p007c.p190n.p194b.p266d.p314j.p315a.l31;
import p007c.p190n.p194b.p266d.p314j.p315a.o31;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends AbstractBinderC2938d0 {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: B3 */
    public final InterfaceC3404pm mo6131B3(InterfaceC2799a interfaceC2799a, InterfaceC3395pd interfaceC3395pd, int i) {
        return AbstractC3264lu.m7618c((Context) BinderC2800b.m5639T1(interfaceC2799a), interfaceC3395pd, i).mo7641w();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: Z4 */
    public final InterfaceC3234l0 mo6132Z4(InterfaceC2799a interfaceC2799a, int i) {
        return AbstractC3264lu.m7619d((Context) BinderC2800b.m5639T1(interfaceC2799a), i).mo7629k();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: h6 */
    public final InterfaceC3604v mo6133h6(InterfaceC2799a interfaceC2799a, jw2 jw2Var, String str, InterfaceC3395pd interfaceC3395pd, int i) {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        C2896bw c2896bwMo7631m = AbstractC3264lu.m7618c(context, interfaceC3395pd, i).mo7631m();
        Objects.requireNonNull(c2896bwMo7631m);
        Objects.requireNonNull(context);
        c2896bwMo7631m.f12876a = context;
        Objects.requireNonNull(jw2Var);
        c2896bwMo7631m.f12878c = jw2Var;
        Objects.requireNonNull(str);
        c2896bwMo7631m.f12877b = str;
        C2622l.m5467z2(c2896bwMo7631m.f12876a, Context.class);
        C2622l.m5467z2(c2896bwMo7631m.f12877b, String.class);
        C2622l.m5467z2(c2896bwMo7631m.f12878c, jw2.class);
        C3600uw c3600uw = c2896bwMo7631m.f12879d;
        Context context2 = c2896bwMo7631m.f12876a;
        String str2 = c2896bwMo7631m.f12877b;
        jw2 jw2Var2 = c2896bwMo7631m.f12878c;
        C2933cw c2933cw = new C2933cw(c3600uw, context2, str2, jw2Var2);
        return new o31(context2, jw2Var2, str2, c2933cw.f13135h.mo4613a(), c2933cw.f13133f.mo4613a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: o1 */
    public final InterfaceC3604v mo6134o1(InterfaceC2799a interfaceC2799a, jw2 jw2Var, String str, int i) {
        return new BinderC2329t((Context) BinderC2800b.m5639T1(interfaceC2799a), jw2Var, str, new C3702xn(210890000, i, true, false));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2955dh mo6135q0(InterfaceC2799a interfaceC2799a) {
        Activity activity = (Activity) BinderC2800b.m5639T1(interfaceC2799a);
        AdOverlayInfoParcel adOverlayInfoParcelM12636H = AdOverlayInfoParcel.m12636H(activity.getIntent());
        if (adOverlayInfoParcelM12636H == null) {
            return new BinderC2239v(activity);
        }
        int i = adOverlayInfoParcelM12636H.f28477p;
        if (i == 1) {
            return new BinderC2238u(activity);
        }
        if (i == 2) {
            return new BinderC2220c(activity);
        }
        if (i == 3) {
            return new BinderC2221d(activity);
        }
        if (i != 4) {
            return i != 5 ? new BinderC2239v(activity) : new BinderC2219b0(activity);
        }
        return new BinderC2241x(activity, adOverlayInfoParcelM12636H);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: q6 */
    public final InterfaceC3604v mo6136q6(InterfaceC2799a interfaceC2799a, jw2 jw2Var, String str, InterfaceC3395pd interfaceC3395pd, int i) {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        C3266lw c3266lwMo7636r = AbstractC3264lu.m7618c(context, interfaceC3395pd, i).mo7636r();
        Objects.requireNonNull(c3266lwMo7636r);
        Objects.requireNonNull(context);
        c3266lwMo7636r.f16621a = context;
        Objects.requireNonNull(jw2Var);
        c3266lwMo7636r.f16623c = jw2Var;
        Objects.requireNonNull(str);
        c3266lwMo7636r.f16622b = str;
        return c3266lwMo7636r.m7648a().f16950g.mo4613a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: t6 */
    public final InterfaceC3455r mo6137t6(InterfaceC2799a interfaceC2799a, String str, InterfaceC3395pd interfaceC3395pd, int i) {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        return new l31(AbstractC3264lu.m7618c(context, interfaceC3395pd, i), context, str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: u4 */
    public final InterfaceC3435qg mo6138u4(InterfaceC2799a interfaceC2799a, InterfaceC3395pd interfaceC3395pd, int i) {
        return AbstractC3264lu.m7618c((Context) BinderC2800b.m5639T1(interfaceC2799a), interfaceC3395pd, i).mo7642x();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: v4 */
    public final InterfaceC3735yj mo6139v4(InterfaceC2799a interfaceC2799a, String str, InterfaceC3395pd interfaceC3395pd, int i) {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        C3340nw c3340nwMo7639u = AbstractC3264lu.m7618c(context, interfaceC3395pd, i).mo7639u();
        Objects.requireNonNull(c3340nwMo7639u);
        Objects.requireNonNull(context);
        c3340nwMo7639u.f17462a = context;
        c3340nwMo7639u.f17463b = str;
        return c3340nwMo7639u.m7945a().f17771h.mo4613a();
    }
}
