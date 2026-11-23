package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lr1 {

    /* JADX INFO: renamed from: a */
    public boolean f16472a;

    /* JADX INFO: renamed from: b */
    public mr1 f16473b;

    public lr1(Context context, String str, String str2) {
        mr1 mr1Var;
        try {
            try {
                try {
                    IBinder iBinderM12673c = DynamiteModule.m12666d(context, DynamiteModule.f28674a, ModuleDescriptor.MODULE_ID).m12673c("com.google.android.gms.ads.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderM12673c == null) {
                        mr1Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM12673c.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IClearcut");
                        mr1Var = iInterfaceQueryLocalInterface instanceof mr1 ? (mr1) iInterfaceQueryLocalInterface : new mr1(iBinderM12673c);
                    }
                    this.f16473b = mr1Var;
                    this.f16473b.m7727K2(new BinderC2800b(context), str, null);
                    this.f16472a = true;
                } catch (Exception e) {
                    throw new qq1(e);
                }
            } catch (Exception e2) {
                throw new qq1(e2);
            }
        } catch (RemoteException | qq1 | NullPointerException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
        }
    }
}
