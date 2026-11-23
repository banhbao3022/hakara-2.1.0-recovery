package p555j.p556a.p557a.p617j;

import android.content.SharedPreferences;
import mtp.media.karaoke.data.local.p627db.AppDatabase;
import p007c.p190n.p430e.Gson6;
import p477d1.Unit;
import p477d1.p479b0.KClass;
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
import p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao;
import p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.PrefHelper;
import p555j.p556a.p557a.p606h.p614e.CommentRepository;
import p555j.p556a.p557a.p606h.p614e.GiftRepository;
import p555j.p556a.p557a.p606h.p614e.NotificationRepository;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p555j.p556a.p557a.p606h.p614e.SearchRepository;
import p555j.p556a.p557a.p606h.p614e.SongRepository;
import p555j.p556a.p557a.p606h.p614e.UserRepository;

/* JADX INFO: renamed from: j.a.a.j.w */
/* JADX INFO: compiled from: RepositoryModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7130w {

    /* JADX INFO: renamed from: a */
    public static final Module f33060a = SkuDao.a.m14059K(false, false, a.f33061g, 3);

    /* JADX INFO: renamed from: j.a.a.j.w$a */
    /* JADX INFO: compiled from: RepositoryModule.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Module, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f33061g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Module module) throws DefinitionOverrideException {
            Module module2 = module;
            Intrinsics2.m13089e(module2, "$receiver");
            C7112n c7112n = C7112n.f33042g;
            ScopeDefinition scopeDefinition = module2.f30927a;
            Options4 options4M13855a = module2.m13855a(false, false);
            Collections4 collections4 = Collections4.f29519f;
            KClass kClassM13097a = Reflection.m13097a(AppDatabase.class);
            BeanDefinition2 beanDefinition2 = BeanDefinition2.Single;
            ScopeDefinition.m13866a(scopeDefinition, new BeanDefinition(scopeDefinition, kClassM13097a, null, c7112n, beanDefinition2, collections4, options4M13855a, null, null, 384, null), false, 2);
            C7114o c7114o = C7114o.f33044g;
            ScopeDefinition scopeDefinition2 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition2, new BeanDefinition(scopeDefinition2, Reflection.m13097a(RecordingDao.class), null, c7114o, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7116p c7116p = C7116p.f33046g;
            ScopeDefinition scopeDefinition3 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition3, new BeanDefinition(scopeDefinition3, Reflection.m13097a(KeywordDao.class), null, c7116p, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7118q c7118q = C7118q.f33048g;
            ScopeDefinition scopeDefinition4 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition4, new BeanDefinition(scopeDefinition4, Reflection.m13097a(SkuDao.class), null, c7118q, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7120r c7120r = C7120r.f33050g;
            ScopeDefinition scopeDefinition5 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition5, new BeanDefinition(scopeDefinition5, Reflection.m13097a(SharedPreferences.class), null, c7120r, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7122s c7122s = C7122s.f33052g;
            ScopeDefinition scopeDefinition6 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition6, new BeanDefinition(scopeDefinition6, Reflection.m13097a(PrefHelper.class), null, c7122s, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7124t c7124t = C7124t.f33054g;
            ScopeDefinition scopeDefinition7 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition7, new BeanDefinition(scopeDefinition7, Reflection.m13097a(Gson6.class), null, c7124t, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7126u c7126u = C7126u.f33056g;
            ScopeDefinition scopeDefinition8 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition8, new BeanDefinition(scopeDefinition8, Reflection.m13097a(UserRepository.class), null, c7126u, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7128v c7128v = C7128v.f33058g;
            ScopeDefinition scopeDefinition9 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition9, new BeanDefinition(scopeDefinition9, Reflection.m13097a(SongRepository.class), null, c7128v, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7102i c7102i = C7102i.f33032g;
            ScopeDefinition scopeDefinition10 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition10, new BeanDefinition(scopeDefinition10, Reflection.m13097a(RecordingRepository.class), null, c7102i, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7104j c7104j = C7104j.f33034g;
            ScopeDefinition scopeDefinition11 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition11, new BeanDefinition(scopeDefinition11, Reflection.m13097a(CommentRepository.class), null, c7104j, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7106k c7106k = C7106k.f33036g;
            ScopeDefinition scopeDefinition12 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition12, new BeanDefinition(scopeDefinition12, Reflection.m13097a(GiftRepository.class), null, c7106k, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7108l c7108l = C7108l.f33038g;
            ScopeDefinition scopeDefinition13 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition13, new BeanDefinition(scopeDefinition13, Reflection.m13097a(SearchRepository.class), null, c7108l, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            C7110m c7110m = C7110m.f33040g;
            ScopeDefinition scopeDefinition14 = module2.f30927a;
            ScopeDefinition.m13866a(scopeDefinition14, new BeanDefinition(scopeDefinition14, Reflection.m13097a(NotificationRepository.class), null, c7110m, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null), false, 2);
            return Unit.f29502a;
        }
    }
}
