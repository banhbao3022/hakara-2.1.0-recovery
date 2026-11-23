package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.w7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3649w7 implements InterfaceC3464r8 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3464r8 f21013a = new C3649w7();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map map) {
        InterfaceC3485rt interfaceC3485rt = (InterfaceC3485rt) obj;
        InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14249P4)).booleanValue()) {
            C2622l.m5226A3("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            C2622l.m5226A3("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        Boolean boolValueOf = Boolean.valueOf(interfaceC3485rt.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        map2.put(str, boolValueOf);
        String strValueOf = String.valueOf(boolValueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + strValueOf.length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(strValueOf);
        C2096e.m4590z(sb.toString());
        ((InterfaceC3577ua) interfaceC3485rt).mo6501r0("openableApp", map2);
    }
}
