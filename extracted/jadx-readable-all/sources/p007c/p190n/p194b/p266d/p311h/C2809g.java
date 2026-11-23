package p007c.p190n.p194b.p266d.p311h;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: renamed from: c.n.b.d.h.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2809g implements DynamiteModule.InterfaceC5900b {
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC5900b
    /* JADX INFO: renamed from: a */
    public final C2813k mo5644a(Context context, String str, InterfaceC2812j interfaceC2812j) throws DynamiteModule.C5899a {
        C2813k c2813k = new C2813k();
        c2813k.f11969a = interfaceC2812j.mo5643b(context, str);
        int iMo5642a = interfaceC2812j.mo5642a(context, str, true);
        c2813k.f11970b = iMo5642a;
        int i = c2813k.f11969a;
        if (i != 0) {
            if (iMo5642a >= i) {
                c2813k.f11971c = 1;
            } else {
                c2813k.f11971c = -1;
            }
        } else if (iMo5642a == 0) {
            c2813k.f11971c = 0;
        } else {
            i = 0;
            if (iMo5642a >= i) {
                c2813k.f11971c = 1;
            } else {
                c2813k.f11971c = -1;
            }
        }
        return c2813k;
    }
}
