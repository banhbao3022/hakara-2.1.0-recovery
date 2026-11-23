package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fx2<T> {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2975e0 f14134a;

    static {
        InterfaceC2975e0 c2901c0 = null;
        try {
            Object objNewInstance = ex2.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    c2901c0 = iInterfaceQueryLocalInterface instanceof InterfaceC2975e0 ? (InterfaceC2975e0) iInterfaceQueryLocalInterface : new C2901c0(iBinder);
                }
            } else {
                C2622l.m5226A3("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            C2622l.m5226A3("Failed to instantiate ClientApi class.");
        }
        f14134a = c2901c0;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo5889a();

    /* JADX INFO: renamed from: b */
    public abstract T mo5890b() throws RemoteException;

    /* JADX INFO: renamed from: c */
    public abstract T mo5891c(InterfaceC2975e0 interfaceC2975e0) throws RemoteException;

    /* JADX INFO: renamed from: d */
    public final T m6891d(Context context, boolean z) {
        T tM6892e;
        if (!z) {
            C3331nn c3331nn = gx2.f14692a.f14693b;
            if (!C3331nn.m7888f(context, 12451000)) {
                C2622l.m5318U2("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z2 = false;
        boolean z3 = z | (!(DynamiteModule.m12664a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.m12665b(context, ModuleDescriptor.MODULE_ID)));
        C3052g3.m6922a(context);
        if (C3238l4.f16274a.m6603d().booleanValue()) {
            z3 = false;
        } else if (C3238l4.f16275b.m6603d().booleanValue()) {
            z3 = true;
            z2 = true;
        }
        T tMo5890b = null;
        if (z3) {
            tM6892e = m6892e();
            if (tM6892e == null && !z2) {
                try {
                    tMo5890b = mo5890b();
                } catch (RemoteException e) {
                    C2622l.m5241D3("Cannot invoke remote loader.", e);
                }
            }
        } else {
            try {
                tMo5890b = mo5890b();
            } catch (RemoteException e2) {
                C2622l.m5241D3("Cannot invoke remote loader.", e2);
            }
            if (tMo5890b == null) {
                int iIntValue = C3646w4.f20985a.m6603d().intValue();
                gx2 gx2Var = gx2.f14692a;
                if (gx2Var.f14697f.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    C3331nn c3331nn2 = gx2Var.f14693b;
                    String str = gx2Var.f14696e.f21615f;
                    Objects.requireNonNull(c3331nn2);
                    C3331nn.m7892j(context, str, "gmob-apps", bundle, new C3257ln());
                }
            }
            tM6892e = tMo5890b == null ? m6892e() : tMo5890b;
        }
        return tM6892e == null ? mo5889a() : tM6892e;
    }

    /* JADX INFO: renamed from: e */
    public final T m6892e() {
        InterfaceC2975e0 interfaceC2975e0 = f14134a;
        if (interfaceC2975e0 == null) {
            C2622l.m5226A3("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo5891c(interfaceC2975e0);
        } catch (RemoteException e) {
            C2622l.m5241D3("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }
}
