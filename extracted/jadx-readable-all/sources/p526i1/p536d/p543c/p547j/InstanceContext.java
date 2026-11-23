package p526i1.p536d.p543c.p547j;

import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;

/* JADX INFO: renamed from: i1.d.c.j.b, reason: use source file name */
/* JADX INFO: compiled from: InstanceContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InstanceContext {

    /* JADX INFO: renamed from: a */
    public final DefinitionParameters f30915a;

    /* JADX INFO: renamed from: b */
    public final Scope2 f30916b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6153a<DefinitionParameters> f30917c;

    public InstanceContext(Koin koin, Scope2 scope2, InterfaceC6153a<DefinitionParameters> interfaceC6153a) {
        DefinitionParameters definitionParametersMo2c;
        Intrinsics2.m13090f(koin, "koin");
        Intrinsics2.m13090f(scope2, "scope");
        this.f30916b = scope2;
        this.f30917c = interfaceC6153a;
        this.f30915a = (interfaceC6153a == null || (definitionParametersMo2c = interfaceC6153a.mo2c()) == null) ? new DefinitionParameters(new Object[0]) : definitionParametersMo2c;
    }

    public /* synthetic */ InstanceContext(Koin koin, Scope2 scope2, InterfaceC6153a interfaceC6153a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(koin, scope2, (i & 4) != 0 ? null : interfaceC6153a);
    }
}
