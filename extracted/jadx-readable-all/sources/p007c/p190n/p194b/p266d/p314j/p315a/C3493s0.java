package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.s0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3493s0 {

    /* JADX INFO: renamed from: a */
    public final String f19428a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3456r0 f19429b;

    public C3493s0(InterfaceC3456r0 interfaceC3456r0) {
        String strMo8074c;
        this.f19429b = interfaceC3456r0;
        try {
            strMo8074c = interfaceC3456r0.mo8074c();
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            strMo8074c = null;
        }
        this.f19428a = strMo8074c;
    }

    public final String toString() {
        return this.f19428a;
    }
}
