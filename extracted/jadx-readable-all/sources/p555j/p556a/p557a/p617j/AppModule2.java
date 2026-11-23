package p555j.p556a.p557a.p617j;

import android.content.res.Resources;
import java.util.List;
import p477d1.Unit;
import p477d1.p483s.Collections2;
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
import p526i1.p536d.p543c.p553p.ScopeDefinition;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.j.b, reason: use source file name */
/* JADX INFO: compiled from: AppModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AppModule2 {

    /* JADX INFO: renamed from: a */
    public static final Module f33015a;

    /* JADX INFO: renamed from: b */
    public static final List<Module> f33016b;

    /* JADX INFO: renamed from: j.a.a.j.b$a */
    /* JADX INFO: compiled from: AppModule.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Module, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f33017g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Module module) throws DefinitionOverrideException {
            Module module2 = module;
            Intrinsics2.m13089e(module2, "$receiver");
            AppModule appModule = AppModule.f33013g;
            ScopeDefinition scopeDefinition = module2.f30927a;
            Options4 options4M13855a = module2.m13855a(false, false);
            ScopeDefinition.m13866a(scopeDefinition, new BeanDefinition(scopeDefinition, Reflection.m13097a(Resources.class), null, appModule, BeanDefinition2.Single, Collections4.f29519f, options4M13855a, null, null, 384, null), false, 2);
            return Unit.f29502a;
        }
    }

    static {
        Module moduleM14059K = SkuDao.a.m14059K(false, false, a.f33017g, 3);
        f33015a = moduleM14059K;
        f33016b = Collections2.m13038c(moduleM14059K, NetworkModule5.f33029a, C7130w.f33060a, C7135y0.f33066a);
    }
}
