package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import java.util.Objects;
import p007c.p190n.p194b.p367f.p368a.p373d.C5090f0;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0;

/* JADX INFO: renamed from: c.n.b.f.a.b.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5017j2 implements InterfaceC5094h0<InterfaceC5037o2> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5094h0<Context> f25843a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5094h0<C5030n> f25844b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5094h0<C4996e1> f25845c;

    public C5017j2(InterfaceC5094h0<Context> interfaceC5094h0, InterfaceC5094h0<C5030n> interfaceC5094h1, InterfaceC5094h0<C4996e1> interfaceC5094h2) {
        this.f25843a = interfaceC5094h0;
        this.f25844b = interfaceC5094h1;
        this.f25845c = interfaceC5094h2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: a */
    public final InterfaceC5037o2 mo11416a() {
        InterfaceC5037o2 interfaceC5037o2 = (InterfaceC5037o2) (C5001f2.m11443a(((C5021k2) this.f25843a).mo11416a()) == null ? C5090f0.m11535c(this.f25844b).m11529a() : C5090f0.m11535c(this.f25845c).m11529a());
        Objects.requireNonNull(interfaceC5037o2, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC5037o2;
    }
}
