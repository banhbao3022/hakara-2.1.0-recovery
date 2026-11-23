package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.View;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2312c;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.fb */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3023fb implements InterfaceC3689xa, InterfaceC3615va {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3410ps f14003f;

    /* JADX WARN: Multi-variable type inference failed */
    public C3023fb(Context context, C3702xn c3702xn, rd2 rd2Var, C2312c c2312c) throws C3781zs {
        C2855at c2855at = C2330u.f10884a.f10890e;
        InterfaceC3410ps interfaceC3410psM5850a = C2855at.m5850a(context, C3005eu.m6687b(), "", false, false, null, null, c3702xn, null, null, null, new as2(), null, null);
        this.f14003f = interfaceC3410psM5850a;
        ((View) interfaceC3410psM5850a).setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: a */
    public static final void m6784a(Runnable runnable) {
        C3331nn c3331nn = gx2.f14692a.f14693b;
        if (C3331nn.m7890h()) {
            runnable.run();
        } else {
            C2267h1.f10713a.post(runnable);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3577ua
    /* JADX INFO: renamed from: B0 */
    public final void mo6433B0(String str, JSONObject jSONObject) {
        C2622l.m5452w2(this, str, jSONObject);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: Z */
    public final void mo6470Z(String str, String str2) {
        C2622l.m5313T1(this, str, str2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2987ec
    /* JADX INFO: renamed from: c */
    public final void mo6617c(String str, InterfaceC3464r8<? super InterfaceC2987ec> interfaceC3464r8) {
        this.f14003f.mo6448J(str, new C2912cb(interfaceC3464r8));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2987ec
    /* JADX INFO: renamed from: e */
    public final void mo6618e(String str, InterfaceC3464r8<? super InterfaceC2987ec> interfaceC3464r8) {
        this.f14003f.mo6479f0(str, new C2986eb(this, interfaceC3464r8));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: f */
    public final void mo6478f(final String str) {
        m6784a(new Runnable(this, str) { // from class: c.n.b.d.j.a.ya

            /* JADX INFO: renamed from: f */
            public final C3023fb f21825f;

            /* JADX INFO: renamed from: g */
            public final String f21826g;

            {
                this.f21825f = this;
                this.f21826g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3023fb c3023fb = this.f21825f;
                c3023fb.f14003f.mo6478f(this.f21826g);
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3689xa
    /* JADX INFO: renamed from: h */
    public final boolean mo6785h() {
        return this.f14003f.mo6458O();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3689xa
    /* JADX INFO: renamed from: i */
    public final void mo6786i() {
        this.f14003f.destroy();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3689xa
    /* JADX INFO: renamed from: k */
    public final C3024fc mo6787k() {
        return new C3024fc(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3577ua
    /* JADX INFO: renamed from: r0 */
    public final void mo6501r0(String str, Map map) {
        try {
            C2622l.m5452w2(this, str, C2330u.f10884a.f10889d.m4767C(map));
        } catch (JSONException unused) {
            C2622l.m5226A3("Could not convert parameters to JSON.");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: u0 */
    public final void mo6507u0(String str, JSONObject jSONObject) {
        C2622l.m5313T1(this, str, jSONObject.toString());
    }
}
