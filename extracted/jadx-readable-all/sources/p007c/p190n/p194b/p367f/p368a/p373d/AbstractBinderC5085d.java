package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.f.a.d.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC5085d extends BinderC5098j0 implements InterfaceC5087e {
    public AbstractBinderC5085d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.BinderC5098j0
    /* JADX INFO: renamed from: E0 */
    public final boolean mo11528E0(int i, Parcel parcel) throws RemoteException {
        if (i != 2) {
            return false;
        }
        mo11530j3((Bundle) C5100k0.m11539a(parcel, Bundle.CREATOR));
        return true;
    }
}
