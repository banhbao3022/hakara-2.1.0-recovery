package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p367f.p368a.p372c.C5076c;
import p007c.p190n.p194b.p367f.p368a.p373d.C5090f0;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0;

/* JADX INFO: renamed from: c.n.b.f.a.b.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5036o1 implements InterfaceC5094h0<C5032n1> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5094h0 f25897a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5094h0 f25898b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5094h0 f25899c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5094h0 f25900d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5094h0 f25901e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5094h0 f25902f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25903g = 0;

    public C5036o1(InterfaceC5094h0<C5056u> interfaceC5094h0, InterfaceC5094h0<InterfaceC5037o2> interfaceC5094h1, InterfaceC5094h0<C5066x0> interfaceC5094h2, InterfaceC5094h0<Executor> interfaceC5094h3, InterfaceC5094h0<C5027m0> interfaceC5094h4, InterfaceC5094h0<C5076c> interfaceC5094h5) {
        this.f25897a = interfaceC5094h0;
        this.f25898b = interfaceC5094h1;
        this.f25899c = interfaceC5094h2;
        this.f25900d = interfaceC5094h3;
        this.f25901e = interfaceC5094h4;
        this.f25902f = interfaceC5094h5;
    }

    public C5036o1(InterfaceC5094h0<String> interfaceC5094h0, InterfaceC5094h0<C5046r> interfaceC5094h1, InterfaceC5094h0<C5027m0> interfaceC5094h2, InterfaceC5094h0<Context> interfaceC5094h3, InterfaceC5094h0<C5040p1> interfaceC5094h4, InterfaceC5094h0<Executor> interfaceC5094h5, byte[] bArr) {
        this.f25902f = interfaceC5094h0;
        this.f25898b = interfaceC5094h1;
        this.f25901e = interfaceC5094h2;
        this.f25900d = interfaceC5094h3;
        this.f25899c = interfaceC5094h4;
        this.f25897a = interfaceC5094h5;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [c.n.b.f.a.b.e1, c.n.b.f.a.b.n1] */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ C5032n1 mo11416a() {
        if (this.f25903g == 0) {
            Object objMo11416a = this.f25897a.mo11416a();
            InterfaceC5086d0 interfaceC5086d0M11535c = C5090f0.m11535c(this.f25898b);
            Object objMo11416a2 = this.f25899c.mo11416a();
            return new C5032n1((C5056u) objMo11416a, interfaceC5086d0M11535c, (C5066x0) objMo11416a2, C5090f0.m11535c(this.f25900d), (C5027m0) this.f25901e.mo11416a(), (C5076c) this.f25902f.mo11416a());
        }
        String str = (String) this.f25902f.mo11416a();
        Object objMo11416a3 = this.f25898b.mo11416a();
        Object objMo11416a4 = this.f25901e.mo11416a();
        Context contextMo11416a = ((C5021k2) this.f25900d).mo11416a();
        Object objMo11416a5 = this.f25899c.mo11416a();
        return new C4996e1(str != null ? new File(contextMo11416a.getExternalFilesDir(null), str) : contextMo11416a.getExternalFilesDir(null), (C5046r) objMo11416a3, (C5027m0) objMo11416a4, contextMo11416a, (C5040p1) objMo11416a5, C5090f0.m11535c(this.f25897a));
    }
}
