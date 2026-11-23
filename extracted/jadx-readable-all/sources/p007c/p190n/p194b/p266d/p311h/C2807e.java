package p007c.p190n.p194b.p266d.p311h;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: renamed from: c.n.b.d.h.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2807e implements DynamiteModule.InterfaceC5900b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC5900b
    /* JADX INFO: renamed from: a */
    public final C2813k mo5644a(Context context, String str, InterfaceC2812j interfaceC2812j) throws DynamiteModule.C5899a {
        C2813k c2813k = new C2813k();
        int iMo5643b = interfaceC2812j.mo5643b(context, str);
        c2813k.f11969a = iMo5643b;
        if (iMo5643b != 0) {
            c2813k.f11971c = -1;
        } else {
            int iMo5642a = interfaceC2812j.mo5642a(context, str, true);
            c2813k.f11970b = iMo5642a;
            if (iMo5642a != 0) {
                c2813k.f11971c = 1;
            }
        }
        return c2813k;
    }
}
