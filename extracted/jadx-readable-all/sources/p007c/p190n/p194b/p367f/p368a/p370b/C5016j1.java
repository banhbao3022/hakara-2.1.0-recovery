package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import p007c.p190n.p194b.p367f.p368a.p373d.C5090f0;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0;

/* JADX INFO: renamed from: c.n.b.f.a.b.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5016j1 implements InterfaceC5094h0<C5012i1> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5094h0 f25841a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f25842b = 0;

    public C5016j1(InterfaceC5094h0<C5056u> interfaceC5094h0) {
        this.f25841a = interfaceC5094h0;
    }

    public C5016j1(InterfaceC5094h0<InterfaceC5037o2> interfaceC5094h0, byte[] bArr) {
        this.f25841a = interfaceC5094h0;
    }

    public C5016j1(InterfaceC5094h0<Context> interfaceC5094h0, char[] cArr) {
        this.f25841a = interfaceC5094h0;
    }

    public C5016j1(InterfaceC5094h0<C5056u> interfaceC5094h0, short[] sArr) {
        this.f25841a = interfaceC5094h0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [c.n.b.f.a.b.b0, c.n.b.f.a.b.i1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [c.n.b.f.a.b.i1, c.n.b.f.a.b.p1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [c.n.b.f.a.b.i1, c.n.b.f.a.b.x1] */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ C5012i1 mo11416a() {
        int i = this.f25842b;
        if (i == 0) {
            return new C5012i1((C5056u) this.f25841a.mo11416a());
        }
        if (i != 1) {
            return i != 2 ? new C5067x1((C5056u) this.f25841a.mo11416a()) : new C5040p1(((C5021k2) this.f25841a).mo11416a());
        }
        return new C4983b0(C5090f0.m11535c(this.f25841a));
    }
}
