package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3293mm;
import p007c.p190n.p194b.p266d.p314j.p315a.dv1;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2158p implements dv1<C2145c> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3293mm f10514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC2161s f10515b;

    public C2158p(BinderC2161s binderC2161s, InterfaceC3293mm interfaceC3293mm) {
        this.f10515b = binderC2161s;
        this.f10514a = interfaceC3293mm;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        try {
            InterfaceC3293mm interfaceC3293mm = this.f10514a;
            String strValueOf = String.valueOf(th.getMessage());
            interfaceC3293mm.mo7512E(strValueOf.length() != 0 ? "Internal error. ".concat(strValueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(C2145c c2145c) {
        C2145c c2145c2 = c2145c;
        try {
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14462v4;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                if (this.f10515b.f10525n.f21617h >= ((Integer) c2862b.f12496d.m6596a(C3052g3.f14476x4)).intValue()) {
                    if (c2145c2 == null) {
                        this.f10514a.mo7514f0(null, null, null);
                        return;
                    } else {
                        this.f10514a.mo7514f0(c2145c2.f10492a, c2145c2.f10493b, c2145c2.f10494c);
                        return;
                    }
                }
            }
            if (c2145c2 == null) {
                this.f10514a.mo7513Z(null, null);
            } else {
                this.f10514a.mo7513Z(c2145c2.f10492a, c2145c2.f10493b);
            }
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }
}
