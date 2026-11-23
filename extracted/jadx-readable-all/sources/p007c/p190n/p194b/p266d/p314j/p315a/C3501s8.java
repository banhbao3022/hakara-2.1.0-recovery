package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.s8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3501s8 implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final br0 f19483a;

    public C3501s8(br0 br0Var) {
        C2622l.m5379i(br0Var, "The Inspector Manager must not be null");
        this.f19483a = br0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j2 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j2 = Long.parseLong(map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        br0 br0Var = this.f19483a;
        String str = map.get("extras");
        synchronized (br0Var) {
            br0Var.f12794h = str;
            br0Var.f12795i = j2;
            br0Var.m6081j();
        }
    }
}
