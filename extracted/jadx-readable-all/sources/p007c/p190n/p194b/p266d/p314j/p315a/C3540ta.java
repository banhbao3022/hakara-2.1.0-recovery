package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.AbstractC2185l;
import p007c.p190n.p194b.p266d.p267a.p278v.AbstractC2196b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.a.ta */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3540ta<AdT> extends AbstractC2196b {

    /* JADX INFO: renamed from: a */
    public final Context f19800a;

    /* JADX INFO: renamed from: b */
    public final iw2 f19801b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3604v f19802c;

    /* JADX INFO: renamed from: d */
    public final BinderC3247ld f19803d;

    public C3540ta(Context context, String str) {
        BinderC3247ld binderC3247ld = new BinderC3247ld();
        this.f19803d = binderC3247ld;
        this.f19800a = context;
        this.f19801b = iw2.f15412a;
        ex2 ex2Var = gx2.f14692a.f14694c;
        jw2 jw2Var = new jw2();
        Objects.requireNonNull(ex2Var);
        this.f19802c = new ax2(ex2Var, context, jw2Var, str, binderC3247ld).m6891d(context, false);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2104a
    /* JADX INFO: renamed from: b */
    public final void mo4600b(AbstractC2185l abstractC2185l) {
        try {
            InterfaceC3604v interfaceC3604v = this.f19802c;
            if (interfaceC3604v != null) {
                interfaceC3604v.mo4879S4(new BinderC2900c(abstractC2185l));
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2104a
    /* JADX INFO: renamed from: c */
    public final void mo4601c(boolean z) {
        try {
            InterfaceC3604v interfaceC3604v = this.f19802c;
            if (interfaceC3604v != null) {
                interfaceC3604v.mo4874L0(z);
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2104a
    /* JADX INFO: renamed from: d */
    public final void mo4602d(Activity activity) {
        if (activity == null) {
            C2622l.m5226A3("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            InterfaceC3604v interfaceC3604v = this.f19802c;
            if (interfaceC3604v != null) {
                interfaceC3604v.mo4884a4(new BinderC2800b(activity));
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }
}
