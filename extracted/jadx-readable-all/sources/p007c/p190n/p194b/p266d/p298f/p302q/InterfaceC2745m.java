package p007c.p190n.p194b.p266d.p298f.p302q;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p314j.p322h.BinderC4063b;

/* JADX INFO: renamed from: c.n.b.d.f.q.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2745m extends IInterface {

    /* JADX INFO: renamed from: c.n.b.d.f.q.m$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class a extends BinderC4063b implements InterfaceC2745m {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @RecentlyNonNull
        /* JADX INFO: renamed from: i1 */
        public static InterfaceC2745m m5605i1(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2745m ? (InterfaceC2745m) iInterfaceQueryLocalInterface : new C2731g1(iBinder);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p322h.BinderC4063b
        /* JADX INFO: renamed from: E0 */
        public final boolean mo5598E0(int i, @RecentlyNonNull Parcel parcel, @RecentlyNonNull Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            throw null;
        }
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    Account mo5561a() throws RemoteException;
}
