package p007c.p190n.p194b.p367f.p368a.p370b;

import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.f.a.b.q0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5043q0 implements InterfaceC5063w0 {

    /* JADX INFO: renamed from: a */
    public final C5066x0 f25919a;

    /* JADX INFO: renamed from: b */
    public final int f25920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25921c = 0;

    public C5043q0(C5066x0 c5066x0, int i) {
        this.f25919a = c5066x0;
        this.f25920b = i;
    }

    public C5043q0(C5066x0 c5066x0, int i, byte[] bArr) {
        this.f25919a = c5066x0;
        this.f25920b = i;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5063w0
    /* JADX INFO: renamed from: a */
    public final Object mo11466a() {
        if (this.f25921c != 0) {
            this.f25919a.m11512c(this.f25920b).f25978c.f25960c = 5;
            return null;
        }
        C5066x0 c5066x0 = this.f25919a;
        int i = this.f25920b;
        C5057u0 c5057u0M11512c = c5066x0.m11512c(i);
        if (!C4799a.m10958I(c5057u0M11512c.f25978c.f25960c)) {
            throw new C5011i0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        C5056u c5056u = c5066x0.f26000b;
        C5054t0 c5054t0 = c5057u0M11512c.f25978c;
        String str = c5054t0.f25958a;
        int i2 = c5057u0M11512c.f25977b;
        long j2 = c5054t0.f25959b;
        if (c5056u.m11489e(str, i2, j2).exists()) {
            C5056u.m11486h(c5056u.m11489e(str, i2, j2));
        }
        C5054t0 c5054t1 = c5057u0M11512c.f25978c;
        int i3 = c5054t1.f25960c;
        if (i3 == 5 || i3 == 6) {
            C5056u c5056u2 = c5066x0.f26000b;
            String str2 = c5054t1.f25958a;
            int i4 = c5057u0M11512c.f25977b;
            long j3 = c5054t1.f25959b;
            if (c5056u2.m11494k(str2, i4, j3).exists()) {
                C5056u.m11486h(c5056u2.m11494k(str2, i4, j3));
            }
        }
        return null;
    }
}
