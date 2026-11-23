package p007c.p190n.p194b.p367f.p368a.p370b;

import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;

/* JADX INFO: renamed from: c.n.b.f.a.b.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5015j0 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25831a = new C5089f("ExtractorLooper");

    /* JADX INFO: renamed from: b */
    public final C5066x0 f25832b;

    /* JADX INFO: renamed from: c */
    public final C5007h0 f25833c;

    /* JADX INFO: renamed from: d */
    public final C5067x1 f25834d;

    /* JADX INFO: renamed from: e */
    public final C5012i1 f25835e;

    /* JADX INFO: renamed from: f */
    public final C5032n1 f25836f;

    /* JADX INFO: renamed from: g */
    public final C5048r1 f25837g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5086d0<InterfaceC5037o2> f25838h;

    /* JADX INFO: renamed from: i */
    public final C4980a1 f25839i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f25840j = new AtomicBoolean(false);

    public C5015j0(C5066x0 c5066x0, InterfaceC5086d0<InterfaceC5037o2> interfaceC5086d0, C5007h0 c5007h0, C5067x1 c5067x1, C5012i1 c5012i1, C5032n1 c5032n1, C5048r1 c5048r1, C4980a1 c4980a1) {
        this.f25832b = c5066x0;
        this.f25838h = interfaceC5086d0;
        this.f25833c = c5007h0;
        this.f25834d = c5067x1;
        this.f25835e = c5012i1;
        this.f25836f = c5032n1;
        this.f25837g = c5048r1;
        this.f25839i = c4980a1;
    }

    /* JADX INFO: renamed from: a */
    public final void m11457a(int i, Exception exc) {
        try {
            C5066x0 c5066x0 = this.f25832b;
            c5066x0.m11511b(new C5043q0(c5066x0, i, null));
            C5066x0 c5066x1 = this.f25832b;
            c5066x1.m11511b(new C5043q0(c5066x1, i));
        } catch (C5011i0 unused) {
            f25831a.m11533b(6, "Error during error handling: %s", new Object[]{exc.getMessage()});
        }
    }
}
