package p007c.p190n.p194b.p367f.p368a.p370b;

import java.util.concurrent.Executor;
import p007c.p190n.p194b.p367f.p368a.p372c.C5076c;
import p007c.p190n.p194b.p367f.p368a.p373d.C5090f0;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0;

/* JADX INFO: renamed from: c.n.b.f.a.b.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5069y0 implements InterfaceC5094h0<C5066x0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5094h0 f26016a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5094h0 f26017b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5094h0 f26018c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5094h0 f26019d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f26020e = 0;

    public C5069y0(InterfaceC5094h0<C5056u> interfaceC5094h0, InterfaceC5094h0<InterfaceC5037o2> interfaceC5094h1, InterfaceC5094h0<C5027m0> interfaceC5094h2, InterfaceC5094h0<Executor> interfaceC5094h3) {
        this.f26016a = interfaceC5094h0;
        this.f26017b = interfaceC5094h1;
        this.f26018c = interfaceC5094h2;
        this.f26019d = interfaceC5094h3;
    }

    public C5069y0(InterfaceC5094h0<C5056u> interfaceC5094h0, InterfaceC5094h0<InterfaceC5037o2> interfaceC5094h1, InterfaceC5094h0<C5046r> interfaceC5094h2, InterfaceC5094h0<C5027m0> interfaceC5094h3, byte[] bArr) {
        this.f26016a = interfaceC5094h0;
        this.f26017b = interfaceC5094h1;
        this.f26018c = interfaceC5094h2;
        this.f26019d = interfaceC5094h3;
    }

    public C5069y0(InterfaceC5094h0<C5066x0> interfaceC5094h0, InterfaceC5094h0<C5056u> interfaceC5094h1, InterfaceC5094h0<C4983b0> interfaceC5094h2, InterfaceC5094h0<C5076c> interfaceC5094h3, char[] cArr) {
        this.f26018c = interfaceC5094h0;
        this.f26017b = interfaceC5094h1;
        this.f26016a = interfaceC5094h2;
        this.f26019d = interfaceC5094h3;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [c.n.b.f.a.b.h0, c.n.b.f.a.b.x0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [c.n.b.f.a.b.a1, c.n.b.f.a.b.x0] */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ C5066x0 mo11416a() {
        int i = this.f26020e;
        if (i == 0) {
            Object objMo11416a = this.f26016a.mo11416a();
            return new C5066x0((C5056u) objMo11416a, C5090f0.m11535c(this.f26017b), (C5027m0) this.f26018c.mo11416a(), C5090f0.m11535c(this.f26019d));
        }
        if (i == 1) {
            return new C5007h0((C5056u) this.f26016a.mo11416a(), C5090f0.m11535c(this.f26017b), C5090f0.m11535c(this.f26018c), (C5027m0) this.f26019d.mo11416a());
        }
        Object objMo11416a2 = this.f26018c.mo11416a();
        Object objMo11416a3 = this.f26017b.mo11416a();
        return new C4980a1((C5066x0) objMo11416a2, (C5056u) objMo11416a3, (C4983b0) this.f26016a.mo11416a(), (C5076c) this.f26019d.mo11416a());
    }
}
