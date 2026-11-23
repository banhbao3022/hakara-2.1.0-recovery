package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: c.n.b.f.a.d.m0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC5104m0 extends BinderC5098j0 implements InterfaceC5106n0 {
    /* JADX INFO: renamed from: i1 */
    public static InterfaceC5106n0 m11547i1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5106n0 ? (InterfaceC5106n0) iInterfaceQueryLocalInterface : new C5102l0(iBinder);
    }
}
