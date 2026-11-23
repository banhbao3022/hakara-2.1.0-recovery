package p526i1.p536d.p537a.p539b.p540a;

import android.app.Application;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;

/* JADX INFO: renamed from: i1.d.a.b.a.a, reason: use source file name */
/* JADX INFO: compiled from: KoinExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KoinExt extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, Application> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ KoinExt2 f30869g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinExt(KoinExt2 koinExt2) {
        super(2);
        this.f30869g = koinExt2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Application mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Intrinsics2.m13090f(scope2, "$receiver");
        Intrinsics2.m13090f(definitionParameters, "it");
        return (Application) this.f30869g.f30870g;
    }
}
