package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.C2193t;
import p007c.p190n.p194b.p266d.p267a.p279w.C2199b;
import p007c.p190n.p194b.p266d.p267a.p279w.InterfaceC2203f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.a.j6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3166j6 implements InterfaceC2203f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3129i6 f15491a;

    public C3166j6(InterfaceC3129i6 interfaceC3129i6) {
        Context context;
        new C2193t();
        this.f15491a = interfaceC3129i6;
        try {
            context = (Context) BinderC2800b.m5639T1(interfaceC3129i6.mo6368m());
        } catch (RemoteException | NullPointerException e) {
            C2622l.m5438t3("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.f15491a.mo6365H(new BinderC2800b(new C2199b(context)));
            } catch (RemoteException e2) {
                C2622l.m5438t3("", e2);
            }
        }
    }
}
