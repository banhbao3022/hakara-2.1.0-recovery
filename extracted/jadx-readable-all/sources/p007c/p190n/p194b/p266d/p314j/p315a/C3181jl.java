package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.jl */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3181jl implements ip2 {

    /* JADX INFO: renamed from: f */
    public final Context f15645f;

    /* JADX INFO: renamed from: g */
    public final Object f15646g;

    /* JADX INFO: renamed from: h */
    public final String f15647h;

    /* JADX INFO: renamed from: i */
    public boolean f15648i;

    public C3181jl(Context context, String str) {
        this.f15645f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f15647h = str;
        this.f15648i = false;
        this.f15646g = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final void m7361a(boolean z) {
        C2330u c2330u = C2330u.f10884a;
        if (c2330u.f10910y.m6048f(this.f15645f)) {
            synchronized (this.f15646g) {
                try {
                    if (this.f15648i == z) {
                        return;
                    }
                    this.f15648i = z;
                    if (TextUtils.isEmpty(this.f15647h)) {
                        return;
                    }
                    if (this.f15648i) {
                        C2885bm c2885bm = c2330u.f10910y;
                        Context context = this.f15645f;
                        final String str = this.f15647h;
                        if (c2885bm.m6048f(context)) {
                            if (C2885bm.m6042m(context)) {
                                c2885bm.m6046d("beginAdUnitExposure", new InterfaceC2848am(str) { // from class: c.n.b.d.j.a.ql

                                    /* JADX INFO: renamed from: a */
                                    public final String f18375a;

                                    {
                                        this.f18375a = str;
                                    }

                                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2848am
                                    /* JADX INFO: renamed from: a */
                                    public final void mo5828a(InterfaceC3079gu interfaceC3079gu) throws RemoteException {
                                        interfaceC3079gu.mo6619I(this.f18375a);
                                    }
                                });
                            } else {
                                c2885bm.m6057p(context, str, "beginAdUnitExposure");
                            }
                        }
                    } else {
                        C2885bm c2885bm2 = c2330u.f10910y;
                        Context context2 = this.f15645f;
                        final String str2 = this.f15647h;
                        if (c2885bm2.m6048f(context2)) {
                            if (C2885bm.m6042m(context2)) {
                                c2885bm2.m6046d("endAdUnitExposure", new InterfaceC2848am(str2) { // from class: c.n.b.d.j.a.rl

                                    /* JADX INFO: renamed from: a */
                                    public final String f18920a;

                                    {
                                        this.f18920a = str2;
                                    }

                                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2848am
                                    /* JADX INFO: renamed from: a */
                                    public final void mo5828a(InterfaceC3079gu interfaceC3079gu) throws RemoteException {
                                        interfaceC3079gu.mo6629z0(this.f18920a);
                                    }
                                });
                            } else {
                                c2885bm2.m6057p(context2, str2, "endAdUnitExposure");
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
    /* JADX INFO: renamed from: q0 */
    public final void mo6352q0(hp2 hp2Var) {
        m7361a(hp2Var.f14934j);
    }
}
