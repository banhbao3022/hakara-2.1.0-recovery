package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.f8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3020f8 implements InterfaceC3464r8<InterfaceC3410ps> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        InterfaceC3410ps interfaceC3410ps2 = interfaceC3410ps;
        WindowManager windowManager = (WindowManager) interfaceC3410ps2.getContext().getSystemService("window");
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        DisplayMetrics displayMetricsM4741K = C2267h1.m4741K(windowManager);
        int i = displayMetricsM4741K.widthPixels;
        int i2 = displayMetricsM4741K.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) interfaceC3410ps2).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i));
        map2.put("windowHeightInPixels", Integer.valueOf(i2));
        interfaceC3410ps2.mo6501r0("locationReady", map2);
        C2622l.m5226A3("GET LOCATION COMPILED");
    }
}
