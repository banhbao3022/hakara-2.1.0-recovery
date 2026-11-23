package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.AbstractC2185l;
import p007c.p190n.p194b.p266d.p267a.InterfaceC2189p;
import p007c.p190n.p194b.p266d.p267a.p276f0.AbstractC2174b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.a.hk */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3106hk extends AbstractC2174b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3735yj f14885a;

    /* JADX INFO: renamed from: b */
    public final Context f14886b;

    /* JADX INFO: renamed from: c */
    public final BinderC3439qk f14887c;

    public C3106hk(Context context, String str) {
        this.f14886b = context.getApplicationContext();
        ex2 ex2Var = gx2.f14692a.f14694c;
        BinderC3247ld binderC3247ld = new BinderC3247ld();
        Objects.requireNonNull(ex2Var);
        this.f14885a = new dx2(ex2Var, context, str, binderC3247ld).m6891d(context, false);
        this.f14887c = new BinderC3439qk();
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p276f0.AbstractC2174b
    /* JADX INFO: renamed from: a */
    public final void mo4625a(AbstractC2185l abstractC2185l) {
        this.f14887c.f18362f = abstractC2185l;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p276f0.AbstractC2174b
    /* JADX INFO: renamed from: b */
    public final void mo4626b(Activity activity, InterfaceC2189p interfaceC2189p) {
        BinderC3439qk binderC3439qk = this.f14887c;
        binderC3439qk.f18363g = interfaceC2189p;
        try {
            InterfaceC3735yj interfaceC3735yj = this.f14885a;
            if (interfaceC3735yj != null) {
                interfaceC3735yj.mo6916w4(binderC3439qk);
                this.f14885a.mo6915t0(new BinderC2800b(activity));
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }
}
