package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class iz0 implements ce0 {

    /* JADX INFO: renamed from: a */
    public final rh1 f15423a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3249lf f15424b;

    /* JADX INFO: renamed from: c */
    public final boolean f15425c;

    /* JADX INFO: renamed from: d */
    public y60 f15426d = null;

    public iz0(rh1 rh1Var, InterfaceC3249lf interfaceC3249lf, boolean z) {
        this.f15423a = rh1Var;
        this.f15424b = interfaceC3249lf;
        this.f15425c = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ce0
    /* JADX INFO: renamed from: a */
    public final void mo6171a(boolean z, Context context) throws be0 {
        try {
            if (!(this.f15425c ? this.f15424b.mo7335v5(new BinderC2800b(context)) : this.f15424b.mo7327X3(new BinderC2800b(context)))) {
                throw new be0("Adapter failed to show.");
            }
            if (this.f15426d == null) {
                return;
            }
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14275U0)).booleanValue() || this.f15423a.f18795S != 2) {
                return;
            }
            this.f15426d.zza();
        } catch (Throwable th) {
            throw new be0(th);
        }
    }
}
