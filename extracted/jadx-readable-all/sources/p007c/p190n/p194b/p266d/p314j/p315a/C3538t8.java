package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.t8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3538t8 implements InterfaceC3464r8<InterfaceC3410ps> {

    /* JADX INFO: renamed from: a */
    public final C3575u8 f19791a;

    public C3538t8(C3575u8 c3575u8, byte[] bArr) {
        this.f19791a = c3575u8;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        InterfaceC3410ps interfaceC3410ps2 = interfaceC3410ps;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            C2622l.m5438t3("Fail to parse float", e);
        }
        C3575u8 c3575u8 = this.f19791a;
        synchronized (c3575u8) {
            c3575u8.f20228a = zEquals;
            c3575u8.f20231d.set(true);
        }
        C3575u8 c3575u9 = this.f19791a;
        synchronized (c3575u9) {
            c3575u9.f20229b = zEquals2;
            c3575u9.f20230c = f;
        }
        interfaceC3410ps2.mo6515y0(zEquals);
    }
}
