package p007c.p190n.p194b.p266d.p314j.p315a;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nf0 extends AbstractBinderC3461r5 {

    /* JADX INFO: renamed from: f */
    public final bg0 f17085f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2799a f17086g;

    public nf0(bg0 bg0Var) {
        this.f17085f = bg0Var;
    }

    /* JADX INFO: renamed from: F6 */
    public static float m7857F6(InterfaceC2799a interfaceC2799a) {
        Drawable drawable;
        if (interfaceC2799a == null || (drawable = (Drawable) BinderC2800b.m5639T1(interfaceC2799a)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3498s5
    /* JADX INFO: renamed from: f */
    public final InterfaceC2799a mo7858f() throws RemoteException {
        InterfaceC2799a interfaceC2799a = this.f17086g;
        if (interfaceC2799a != null) {
            return interfaceC2799a;
        }
        InterfaceC3610v5 interfaceC3610v5M6013w = this.f17085f.m6013w();
        if (interfaceC3610v5M6013w == null) {
            return null;
        }
        return interfaceC3610v5M6013w.mo7056a();
    }
}
