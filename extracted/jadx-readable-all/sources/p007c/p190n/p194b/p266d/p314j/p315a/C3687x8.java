package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.x8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3687x8 implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final Context f21451a;

    public C3687x8(Context context) {
        this.f21451a = context;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        byte b;
        C2330u c2330u = C2330u.f10884a;
        if (c2330u.f10910y.m6048f(this.f21451a)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("_ac")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("_aa")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                c2330u.f10910y.m6052j(this.f21451a, str2);
                return;
            }
            if (b == 1) {
                c2330u.f10910y.m6053k(this.f21451a, str2);
            } else if (b != 2) {
                C2622l.m5408n3("logScionEvent gmsg contained unsupported eventName");
            } else {
                c2330u.f10910y.m6055n(this.f21451a, "_aa", str2, null);
            }
        }
    }
}
