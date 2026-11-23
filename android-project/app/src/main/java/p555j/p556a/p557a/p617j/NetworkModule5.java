package p555j.p556a.p557a.p617j;

import p000.C6487i0;
import p477d1.Unit;
import p477d1.p479b0.KClass;
import p477d1.p483s.Collections4;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p509g1.Cache2;
import p509g1.Interceptor;
import p509g1.OkHttpClient;
import p526i1.p536d.p543c.p545h.BeanDefinition;
import p526i1.p536d.p543c.p545h.BeanDefinition2;
import p526i1.p536d.p543c.p545h.Options4;
import p526i1.p536d.p543c.p546i.DefinitionOverrideException;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p551n.StringQualifier;
import p526i1.p536d.p543c.p553p.ScopeDefinition;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p623k1.Retrofit;

/* JADX INFO: renamed from: j.a.a.j.h, reason: use source file name */
/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkModule5 {

    /* JADX INFO: renamed from: a */
    public static final Module f33029a = SkuDao.a.m14059K(false, false, a.f33030g, 3);

    /* JADX INFO: renamed from: j.a.a.j.h$a */
    /* JADX INFO: compiled from: NetworkModule.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Module, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f33030g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Module module) throws DefinitionOverrideException {
            Module module2 = module;
            Intrinsics2.m13089e(module2, "$receiver");
            NetworkModule networkModule = NetworkModule.f33021g;
            ScopeDefinition scopeDefinition = module2.f30927a;
            Options4 options4M13855a = module2.m13855a(false, false);
            Collections4 collections4 = Collections4.f29519f;
            KClass kClassM13097a = Reflection.m13097a(Cache2.class);
            BeanDefinition2 beanDefinition2 = BeanDefinition2.Single;
            ScopeDefinition.m13866a(scopeDefinition, new BeanDefinition(scopeDefinition, kClassM13097a, null, networkModule, beanDefinition2, collections4, options4M13855a, null, null, 384, null), false, 2);
            Intrinsics2.m13090f("logging", "name");
            StringQualifier stringQualifier = new StringQualifier("logging");
            C6487i0 c6487i0 = C6487i0.f30765g;
            ScopeDefinition scopeDefinition2 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition2, new BeanDefinition(scopeDefinition2, Reflection.m13097a(Interceptor.class), stringQualifier, c6487i0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            Intrinsics2.m13090f("header", "name");
            StringQualifier stringQualifier2 = new StringQualifier("header");
            C6487i0 c6487i1 = C6487i0.f30766h;
            ScopeDefinition scopeDefinition3 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition3, new BeanDefinition(scopeDefinition3, Reflection.m13097a(Interceptor.class), stringQualifier2, c6487i1, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            NetworkModule2 networkModule2 = NetworkModule2.f33023g;
            ScopeDefinition scopeDefinition4 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition4, new BeanDefinition(scopeDefinition4, Reflection.m13097a(OkHttpClient.class), null, networkModule2, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            NetworkModule3 networkModule3 = NetworkModule3.f33025g;
            ScopeDefinition scopeDefinition5 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition5, new BeanDefinition(scopeDefinition5, Reflection.m13097a(Retrofit.class), null, networkModule3, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            NetworkModule4 networkModule4 = NetworkModule4.f33027g;
            ScopeDefinition scopeDefinition6 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition6, new BeanDefinition(scopeDefinition6, Reflection.m13097a(ApiService.class), null, networkModule4, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            return Unit.f29502a;
        }
    }
}
