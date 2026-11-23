package p007c.p190n.p194b.p266d.p311h;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: renamed from: c.n.b.d.h.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2808f implements DynamiteModule.InterfaceC5900b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC5900b
    /* JADX INFO: renamed from: a */
    public final C2813k mo5644a(Context context, String str, InterfaceC2812j interfaceC2812j) throws DynamiteModule.C5899a {
        int iMo5642a;
        C2813k c2813k = new C2813k();
        int iMo5643b = interfaceC2812j.mo5643b(context, str);
        c2813k.f11969a = iMo5643b;
        int i = 0;
        if (iMo5643b != 0) {
            iMo5642a = interfaceC2812j.mo5642a(context, str, false);
            c2813k.f11970b = iMo5642a;
        } else {
            iMo5642a = interfaceC2812j.mo5642a(context, str, true);
            c2813k.f11970b = iMo5642a;
        }
        int i2 = c2813k.f11969a;
        if (i2 == 0) {
            if (iMo5642a == 0) {
                c2813k.f11971c = 0;
            }
            return c2813k;
        }
        i = i2;
        if (i >= iMo5642a) {
            c2813k.f11971c = -1;
        } else {
            c2813k.f11971c = 1;
        }
        return c2813k;
    }
}
