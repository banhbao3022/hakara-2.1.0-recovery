package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.v7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3612v7 implements InterfaceC3464r8 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3464r8 f20705a = new C3612v7();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map map) {
        InterfaceC3485rt interfaceC3485rt = (InterfaceC3485rt) obj;
        InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            C2622l.m5226A3("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = interfaceC3485rt.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            map2.put(str2, boolValueOf);
            String strValueOf = String.valueOf(boolValueOf);
            StringBuilder sb = new StringBuilder(str2.length() + 14 + strValueOf.length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(strValueOf);
            C2096e.m4590z(sb.toString());
        }
        ((InterfaceC3577ua) interfaceC3485rt).mo6501r0("openableURLs", map2);
    }
}
