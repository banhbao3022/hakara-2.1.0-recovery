package p007c.p190n.p194b.p266d.p314j.p320f;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamite.DynamiteModule;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;

/* JADX INFO: renamed from: c.n.b.d.j.f.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3858f {

    /* JADX INFO: renamed from: a */
    public static final C2518b f22572a = new C2518b("CastDynamiteModule");

    /* JADX INFO: renamed from: a */
    public static InterfaceC3878h m9021a(Context context) {
        try {
            IBinder iBinderM12673c = DynamiteModule.m12666d(context, DynamiteModule.f28674a, "com.google.android.gms.cast.framework.dynamite").m12673c("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderM12673c == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM12673c.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3878h ? (InterfaceC3878h) iInterfaceQueryLocalInterface : new C3908k(iBinderM12673c);
        } catch (DynamiteModule.C5899a e) {
            throw new RuntimeException(e);
        }
    }
}
