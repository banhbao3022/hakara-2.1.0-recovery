package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.s.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2525e extends BinderC3808a implements InterfaceC2540l0 {
    public AbstractBinderC2525e() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ((BinderC2555z) this).f11477f.f24683a.m10944q((TResult) ((Bundle) C4016v.m9267a(parcel, Bundle.CREATOR)));
        return true;
    }
}
