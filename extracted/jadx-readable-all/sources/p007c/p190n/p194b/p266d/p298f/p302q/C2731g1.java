package p007c.p190n.p194b.p266d.p298f.p302q;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p322h.C4062a;
import p007c.p190n.p194b.p266d.p314j.p322h.C4064c;

/* JADX INFO: renamed from: c.n.b.d.f.q.g1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2731g1 extends C4062a implements InterfaceC2745m {
    public C2731g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2745m
    /* JADX INFO: renamed from: a */
    public final Account mo5561a() throws RemoteException {
        Parcel parcelM9327E0 = m9327E0(2, m9328i1());
        Account account = (Account) C4064c.m9329a(parcelM9327E0, Account.CREATOR);
        parcelM9327E0.recycle();
        return account;
    }
}
