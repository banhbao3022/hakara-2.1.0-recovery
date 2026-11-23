package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p367f.p368a.p373d.C5090f0;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0;

/* JADX INFO: renamed from: c.n.b.f.a.b.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5019k0 implements InterfaceC5094h0<C5015j0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5094h0 f25847a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5094h0 f25848b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5094h0 f25849c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5094h0 f25850d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5094h0 f25851e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5094h0 f25852f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5094h0 f25853g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5094h0 f25854h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f25855i = 0;

    public C5019k0(InterfaceC5094h0<C5066x0> interfaceC5094h0, InterfaceC5094h0<InterfaceC5037o2> interfaceC5094h1, InterfaceC5094h0<C5007h0> interfaceC5094h2, InterfaceC5094h0<C5067x1> interfaceC5094h3, InterfaceC5094h0<C5012i1> interfaceC5094h4, InterfaceC5094h0<C5032n1> interfaceC5094h5, InterfaceC5094h0<C5048r1> interfaceC5094h6, InterfaceC5094h0<C4980a1> interfaceC5094h7) {
        this.f25847a = interfaceC5094h0;
        this.f25848b = interfaceC5094h1;
        this.f25849c = interfaceC5094h2;
        this.f25850d = interfaceC5094h3;
        this.f25851e = interfaceC5094h4;
        this.f25852f = interfaceC5094h5;
        this.f25853g = interfaceC5094h6;
        this.f25854h = interfaceC5094h7;
    }

    public C5019k0(InterfaceC5094h0<Context> interfaceC5094h0, InterfaceC5094h0<C5066x0> interfaceC5094h1, InterfaceC5094h0<C5015j0> interfaceC5094h2, InterfaceC5094h0<InterfaceC5037o2> interfaceC5094h3, InterfaceC5094h0<C5027m0> interfaceC5094h4, InterfaceC5094h0<C4991d0> interfaceC5094h5, InterfaceC5094h0<Executor> interfaceC5094h6, InterfaceC5094h0<Executor> interfaceC5094h7, byte[] bArr) {
        this.f25847a = interfaceC5094h0;
        this.f25853g = interfaceC5094h1;
        this.f25854h = interfaceC5094h2;
        this.f25848b = interfaceC5094h3;
        this.f25851e = interfaceC5094h4;
        this.f25852f = interfaceC5094h5;
        this.f25849c = interfaceC5094h6;
        this.f25850d = interfaceC5094h7;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [c.n.b.f.a.b.j0, c.n.b.f.a.b.r] */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ C5015j0 mo11416a() {
        if (this.f25855i == 0) {
            Object objMo11416a = this.f25847a.mo11416a();
            return new C5015j0((C5066x0) objMo11416a, C5090f0.m11535c(this.f25848b), (C5007h0) this.f25849c.mo11416a(), (C5067x1) this.f25850d.mo11416a(), (C5012i1) this.f25851e.mo11416a(), (C5032n1) this.f25852f.mo11416a(), (C5048r1) this.f25853g.mo11416a(), (C4980a1) this.f25854h.mo11416a());
        }
        Context contextMo11416a = ((C5021k2) this.f25847a).mo11416a();
        Object objMo11416a2 = this.f25853g.mo11416a();
        Object objMo11416a3 = this.f25854h.mo11416a();
        InterfaceC5086d0 interfaceC5086d0M11535c = C5090f0.m11535c(this.f25848b);
        Object objMo11416a4 = this.f25851e.mo11416a();
        Object objMo11416a5 = this.f25852f.mo11416a();
        return new C5046r(contextMo11416a, (C5066x0) objMo11416a2, (C5015j0) objMo11416a3, interfaceC5086d0M11535c, (C5027m0) objMo11416a4, (C4991d0) objMo11416a5, C5090f0.m11535c(this.f25849c), C5090f0.m11535c(this.f25850d));
    }
}
