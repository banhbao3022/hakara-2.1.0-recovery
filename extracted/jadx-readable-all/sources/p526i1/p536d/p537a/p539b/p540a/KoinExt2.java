package p526i1.p536d.p537a.p539b.p540a;

import android.app.Application;
import android.content.Context;
import p477d1.Unit;
import p477d1.p483s.Collections4;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p545h.BeanDefinition;
import p526i1.p536d.p543c.p545h.BeanDefinition2;
import p526i1.p536d.p543c.p545h.Options4;
import p526i1.p536d.p543c.p546i.DefinitionOverrideException;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p551n.Qualifier;
import p526i1.p536d.p543c.p553p.ScopeDefinition;

/* JADX INFO: renamed from: i1.d.a.b.a.b, reason: use source file name */
/* JADX INFO: compiled from: KoinExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KoinExt2 extends Lambda implements InterfaceC6164l<Module, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Context f30870g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinExt2(Context context) {
        super(1);
        this.f30870g = context;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Module module) throws DefinitionOverrideException {
        Module module2 = module;
        Intrinsics2.m13090f(module2, "$receiver");
        KoinExt koinExt = new KoinExt(this);
        ScopeDefinition scopeDefinition = module2.f30927a;
        Options4 options4M13855a = module2.m13855a(false, false);
        Qualifier qualifier = null;
        ScopeDefinition.m13866a(scopeDefinition, new BeanDefinition(scopeDefinition, Reflection.m13097a(Application.class), qualifier, koinExt, BeanDefinition2.Single, Collections4.f29519f, options4M13855a, null, null, 384, null), false, 2);
        return Unit.f29502a;
    }
}
