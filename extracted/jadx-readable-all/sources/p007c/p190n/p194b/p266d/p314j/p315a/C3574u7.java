package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.u7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3574u7 implements InterfaceC3464r8<InterfaceC3410ps> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        InterfaceC3410ps interfaceC3410ps2 = interfaceC3410ps;
        String str = (String) map.get("action");
        if (!"tick".equals(str)) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    C2622l.m5226A3("No value given for CSI experiment.");
                    return;
                } else {
                    interfaceC3410ps2.mo6489l().f18702b.m8398c("e", str2);
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    C2622l.m5226A3("No value given for CSI extra.");
                    return;
                } else if (TextUtils.isEmpty(str3)) {
                    C2622l.m5226A3("No name given for CSI extra.");
                    return;
                } else {
                    interfaceC3410ps2.mo6489l().f18702b.m8398c(str3, str4);
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            C2622l.m5226A3("No label given for CSI tick.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            C2622l.m5226A3("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j2 = Long.parseLong(str7);
            C2330u c2330u = C2330u.f10884a;
            long jMo5623c = (j2 - c2330u.f10896k.mo5623c()) + c2330u.f10896k.mo5621a();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            C3459r3 c3459r3Mo6489l = interfaceC3410ps2.mo6489l();
            C3533t3 c3533t3 = c3459r3Mo6489l.f18702b;
            C3422q3 c3422q3 = c3459r3Mo6489l.f18701a.get(str6);
            String[] strArr = {str5};
            if (c3422q3 != null) {
                c3533t3.m8396a(c3422q3, jMo5623c, strArr);
            }
            c3459r3Mo6489l.f18701a.put(str5, new C3422q3(jMo5623c, null, null));
        } catch (NumberFormatException e) {
            C2622l.m5241D3("Malformed timestamp for CSI tick.", e);
        }
    }
}
