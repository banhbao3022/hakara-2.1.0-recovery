package p007c.p190n.p194b.p266d.p312i;

import android.os.IBinder;
import android.os.IInterface;
import p007c.p190n.p194b.p266d.p314j.p324j.BinderC4077a;

/* JADX INFO: renamed from: c.n.b.d.i.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2823c extends BinderC4077a implements InterfaceC2822b {
    public AbstractBinderC2823c() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static InterfaceC2822b asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2822b ? (InterfaceC2822b) iInterfaceQueryLocalInterface : new C2824d(iBinder);
    }
}
