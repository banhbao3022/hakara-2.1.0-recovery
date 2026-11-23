package p555j.p556a.p557a.p617j;

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
import p555j.p556a.p557a.MainViewModel3;
import p555j.p556a.p557a.p558a.p559a.p561b.UserViewModel;
import p555j.p556a.p557a.p558a.p559a.p562c.ExploreViewModel;
import p555j.p556a.p557a.p558a.p559a.p563d.p564a.DuetInviteViewModel;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel2;
import p555j.p556a.p557a.p558a.p559a.p567e.p568b.RecordingRankingViewModel;
import p555j.p556a.p557a.p558a.p559a.p569f.SongViewModel;
import p555j.p556a.p557a.p558a.p559a.p569f.SongbookViewModel;
import p555j.p556a.p557a.p558a.p559a.p569f.p570f.SongDetailViewModel;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentViewModel3;
import p555j.p556a.p557a.p558a.p559a.p572h.NotificationViewModel2;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p559a.p573i.p574a.DraftViewModel2;
import p555j.p556a.p557a.p558a.p559a.p573i.p575d0.BlockViewModel;
import p555j.p556a.p557a.p558a.p559a.p578j.GiftViewModel3;
import p555j.p556a.p557a.p558a.p559a.p578j.p579i.FanGiftViewModel;
import p555j.p556a.p557a.p558a.p559a.p578j.p580j.PresentViewModel;
import p555j.p556a.p557a.p558a.p559a.p581k.FeedViewModel;
import p555j.p556a.p557a.p558a.p559a.p582l.ImageViewModel2;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginViewModel3;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingViewModel4;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel7;
import p555j.p556a.p557a.p558a.p559a.p585o.p586o.SearchSongViewModel;
import p555j.p556a.p557a.p558a.p559a.p585o.p587p.SearchUserViewModel;
import p555j.p556a.p557a.p558a.p559a.p589q.ShareViewModel3;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p558a.p559a.p591s.WalletViewModel5;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.j.y0 */
/* JADX INFO: compiled from: ViewModelModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7135y0 {

    /* JADX INFO: renamed from: a */
    public static final Module f33066a = SkuDao.a.m14059K(false, false, a.f33067g, 3);

    /* JADX INFO: renamed from: j.a.a.j.y0$a */
    /* JADX INFO: compiled from: ViewModelModule.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Module, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f33067g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Module module) throws DefinitionOverrideException {
            Module module2 = module;
            Intrinsics2.m13089e(module2, "$receiver");
            C7101h0 c7101h0 = C7101h0.f33031g;
            ScopeDefinition scopeDefinition = module2.f30927a;
            Options4 options4M13855a = module2.m13855a(false, false);
            Collections4 collections4 = Collections4.f29519f;
            KClass kClassM13097a = Reflection.m13097a(MainViewModel3.class);
            BeanDefinition2 beanDefinition2 = BeanDefinition2.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(scopeDefinition, kClassM13097a, null, c7101h0, beanDefinition2, collections4, options4M13855a, null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition, beanDefinition, false, 2);
            SkuDao.a.m14063O(beanDefinition);
            C7119q0 c7119q0 = C7119q0.f33049g;
            ScopeDefinition scopeDefinition2 = module2.f30927a;
            BeanDefinition beanDefinition3 = new BeanDefinition(scopeDefinition2, Reflection.m13097a(SongbookViewModel.class), null, c7119q0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition2, beanDefinition3, false, 2);
            SkuDao.a.m14063O(beanDefinition3);
            C7121r0 c7121r0 = C7121r0.f33051g;
            ScopeDefinition scopeDefinition3 = module2.f30927a;
            BeanDefinition beanDefinition4 = new BeanDefinition(scopeDefinition3, Reflection.m13097a(SongViewModel.class), null, c7121r0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition3, beanDefinition4, false, 2);
            SkuDao.a.m14063O(beanDefinition4);
            C7123s0 c7123s0 = C7123s0.f33053g;
            ScopeDefinition scopeDefinition4 = module2.f30927a;
            BeanDefinition beanDefinition5 = new BeanDefinition(scopeDefinition4, Reflection.m13097a(FeedViewModel.class), null, c7123s0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition4, beanDefinition5, false, 2);
            SkuDao.a.m14063O(beanDefinition5);
            C7125t0 c7125t0 = C7125t0.f33055g;
            ScopeDefinition scopeDefinition5 = module2.f30927a;
            BeanDefinition beanDefinition6 = new BeanDefinition(scopeDefinition5, Reflection.m13097a(ExploreViewModel.class), null, c7125t0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition5, beanDefinition6, false, 2);
            SkuDao.a.m14063O(beanDefinition6);
            C7127u0 c7127u0 = C7127u0.f33057g;
            ScopeDefinition scopeDefinition6 = module2.f30927a;
            BeanDefinition beanDefinition7 = new BeanDefinition(scopeDefinition6, Reflection.m13097a(NotificationViewModel2.class), null, c7127u0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition6, beanDefinition7, false, 2);
            SkuDao.a.m14063O(beanDefinition7);
            C7129v0 c7129v0 = C7129v0.f33059g;
            ScopeDefinition scopeDefinition7 = module2.f30927a;
            BeanDefinition beanDefinition8 = new BeanDefinition(scopeDefinition7, Reflection.m13097a(ProfileViewModel6.class), null, c7129v0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition7, beanDefinition8, false, 2);
            SkuDao.a.m14063O(beanDefinition8);
            C7131w0 c7131w0 = C7131w0.f33062g;
            ScopeDefinition scopeDefinition8 = module2.f30927a;
            BeanDefinition beanDefinition9 = new BeanDefinition(scopeDefinition8, Reflection.m13097a(WalletViewModel5.class), null, c7131w0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition8, beanDefinition9, false, 2);
            SkuDao.a.m14063O(beanDefinition9);
            C7133x0 c7133x0 = C7133x0.f33064g;
            ScopeDefinition scopeDefinition9 = module2.f30927a;
            BeanDefinition beanDefinition10 = new BeanDefinition(scopeDefinition9, Reflection.m13097a(LoginViewModel3.class), null, c7133x0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition9, beanDefinition10, false, 2);
            SkuDao.a.m14063O(beanDefinition10);
            C7132x c7132x = C7132x.f33063g;
            ScopeDefinition scopeDefinition10 = module2.f30927a;
            BeanDefinition beanDefinition11 = new BeanDefinition(scopeDefinition10, Reflection.m13097a(RecordingViewModel2.class), null, c7132x, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition10, beanDefinition11, false, 2);
            SkuDao.a.m14063O(beanDefinition11);
            C7134y c7134y = C7134y.f33065g;
            ScopeDefinition scopeDefinition11 = module2.f30927a;
            BeanDefinition beanDefinition12 = new BeanDefinition(scopeDefinition11, Reflection.m13097a(PlayingViewModel4.class), null, c7134y, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition11, beanDefinition12, false, 2);
            SkuDao.a.m14063O(beanDefinition12);
            C7136z c7136z = C7136z.f33068g;
            ScopeDefinition scopeDefinition12 = module2.f30927a;
            BeanDefinition beanDefinition13 = new BeanDefinition(scopeDefinition12, Reflection.m13097a(CommentViewModel3.class), null, c7136z, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition12, beanDefinition13, false, 2);
            SkuDao.a.m14063O(beanDefinition13);
            C7087a0 c7087a0 = C7087a0.f33014g;
            ScopeDefinition scopeDefinition13 = module2.f30927a;
            BeanDefinition beanDefinition14 = new BeanDefinition(scopeDefinition13, Reflection.m13097a(GiftViewModel3.class), null, c7087a0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition13, beanDefinition14, false, 2);
            SkuDao.a.m14063O(beanDefinition14);
            C7089b0 c7089b0 = C7089b0.f33018g;
            ScopeDefinition scopeDefinition14 = module2.f30927a;
            BeanDefinition beanDefinition15 = new BeanDefinition(scopeDefinition14, Reflection.m13097a(ShareViewModel3.class), null, c7089b0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition14, beanDefinition15, false, 2);
            SkuDao.a.m14063O(beanDefinition15);
            C7091c0 c7091c0 = C7091c0.f33020g;
            ScopeDefinition scopeDefinition15 = module2.f30927a;
            BeanDefinition beanDefinition16 = new BeanDefinition(scopeDefinition15, Reflection.m13097a(SearchViewModel7.class), null, c7091c0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition15, beanDefinition16, false, 2);
            SkuDao.a.m14063O(beanDefinition16);
            C7093d0 c7093d0 = C7093d0.f33022g;
            ScopeDefinition scopeDefinition16 = module2.f30927a;
            BeanDefinition beanDefinition17 = new BeanDefinition(scopeDefinition16, Reflection.m13097a(SearchSongViewModel.class), null, c7093d0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition16, beanDefinition17, false, 2);
            SkuDao.a.m14063O(beanDefinition17);
            C7095e0 c7095e0 = C7095e0.f33024g;
            ScopeDefinition scopeDefinition17 = module2.f30927a;
            BeanDefinition beanDefinition18 = new BeanDefinition(scopeDefinition17, Reflection.m13097a(SearchUserViewModel.class), null, c7095e0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition17, beanDefinition18, false, 2);
            SkuDao.a.m14063O(beanDefinition18);
            C7097f0 c7097f0 = C7097f0.f33026g;
            ScopeDefinition scopeDefinition18 = module2.f30927a;
            BeanDefinition beanDefinition19 = new BeanDefinition(scopeDefinition18, Reflection.m13097a(FanGiftViewModel.class), null, c7097f0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition18, beanDefinition19, false, 2);
            SkuDao.a.m14063O(beanDefinition19);
            C7099g0 c7099g0 = C7099g0.f33028g;
            ScopeDefinition scopeDefinition19 = module2.f30927a;
            BeanDefinition beanDefinition20 = new BeanDefinition(scopeDefinition19, Reflection.m13097a(SongDetailViewModel.class), null, c7099g0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition19, beanDefinition20, false, 2);
            SkuDao.a.m14063O(beanDefinition20);
            C7103i0 c7103i0 = C7103i0.f33033g;
            ScopeDefinition scopeDefinition20 = module2.f30927a;
            BeanDefinition beanDefinition21 = new BeanDefinition(scopeDefinition20, Reflection.m13097a(RecordingRankingViewModel.class), null, c7103i0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition20, beanDefinition21, false, 2);
            SkuDao.a.m14063O(beanDefinition21);
            C7105j0 c7105j0 = C7105j0.f33035g;
            ScopeDefinition scopeDefinition21 = module2.f30927a;
            BeanDefinition beanDefinition22 = new BeanDefinition(scopeDefinition21, Reflection.m13097a(DuetInviteViewModel.class), null, c7105j0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition21, beanDefinition22, false, 2);
            SkuDao.a.m14063O(beanDefinition22);
            C7107k0 c7107k0 = C7107k0.f33037g;
            ScopeDefinition scopeDefinition22 = module2.f30927a;
            BeanDefinition beanDefinition23 = new BeanDefinition(scopeDefinition22, Reflection.m13097a(UserViewModel.class), null, c7107k0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition22, beanDefinition23, false, 2);
            SkuDao.a.m14063O(beanDefinition23);
            C7109l0 c7109l0 = C7109l0.f33039g;
            ScopeDefinition scopeDefinition23 = module2.f30927a;
            BeanDefinition beanDefinition24 = new BeanDefinition(scopeDefinition23, Reflection.m13097a(C6799h0.class), null, c7109l0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition23, beanDefinition24, false, 2);
            SkuDao.a.m14063O(beanDefinition24);
            C7111m0 c7111m0 = C7111m0.f33041g;
            ScopeDefinition scopeDefinition24 = module2.f30927a;
            BeanDefinition beanDefinition25 = new BeanDefinition(scopeDefinition24, Reflection.m13097a(ImageViewModel2.class), null, c7111m0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition24, beanDefinition25, false, 2);
            SkuDao.a.m14063O(beanDefinition25);
            C7113n0 c7113n0 = C7113n0.f33043g;
            ScopeDefinition scopeDefinition25 = module2.f30927a;
            BeanDefinition beanDefinition26 = new BeanDefinition(scopeDefinition25, Reflection.m13097a(PresentViewModel.class), null, c7113n0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition25, beanDefinition26, false, 2);
            SkuDao.a.m14063O(beanDefinition26);
            C7115o0 c7115o0 = C7115o0.f33045g;
            ScopeDefinition scopeDefinition26 = module2.f30927a;
            BeanDefinition beanDefinition27 = new BeanDefinition(scopeDefinition26, Reflection.m13097a(DraftViewModel2.class), null, c7115o0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition26, beanDefinition27, false, 2);
            SkuDao.a.m14063O(beanDefinition27);
            C7117p0 c7117p0 = C7117p0.f33047g;
            ScopeDefinition scopeDefinition27 = module2.f30927a;
            BeanDefinition beanDefinition28 = new BeanDefinition(scopeDefinition27, Reflection.m13097a(BlockViewModel.class), null, c7117p0, beanDefinition2, collections4, module2.m13855a(false, false), null, null, 384, null);
            ScopeDefinition.m13866a(scopeDefinition27, beanDefinition28, false, 2);
            SkuDao.a.m14063O(beanDefinition28);
            return Unit.f29502a;
        }
    }
}
