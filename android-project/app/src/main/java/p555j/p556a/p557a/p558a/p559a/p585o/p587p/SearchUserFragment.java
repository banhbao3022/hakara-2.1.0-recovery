package p555j.p556a.p557a.p558a.p559a.p585o.p587p;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.HashMap;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p561b.UserAdapter;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel7;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBinding;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.o.p.a, reason: use source file name */
/* JADX INFO: compiled from: SearchUserFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchUserFragment extends BaseLoadMoreRefreshFragment<FragmentLoadmoreRefreshBinding, SearchUserViewModel, User> {

    /* JADX INFO: renamed from: f0 */
    public static final c f31756f0 = new c(null);

    /* JADX INFO: renamed from: g0 */
    public final Lazy3 f31757g0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31758h0 = C8310a.m16436a(this, Reflection.m13097a(SearchViewModel7.class), new b(new f()), null);

    /* JADX INFO: renamed from: i0 */
    public final Lazy3 f31759i0 = LazyJVM.m13021b(new d());

    /* JADX INFO: renamed from: j0 */
    public HashMap f31760j0;

    /* JADX INFO: renamed from: j.a.a.a.a.o.p.a$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<SearchUserViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31761g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31762h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31763i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31761g = viewModelStoreOwner;
            this.f31762h = qualifier;
            this.f31763i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.o.p.c] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public SearchUserViewModel mo2c() {
            return SkuDao.a.m14107t(this.f31761g, Reflection.m13097a(SearchUserViewModel.class), this.f31762h, this.f31763i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.o.p.a$b */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    public static final class b extends Lambda implements InterfaceC6153a<ViewModelStore> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC6153a f31764g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31764g = interfaceC6153a;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ViewModelStore mo2c() {
            ViewModelStore viewModelStoreMo128o = ((ViewModelStoreOwner) this.f31764g.mo2c()).mo128o();
            Intrinsics2.m13088d(viewModelStoreMo128o, "ownerProducer().viewModelStore");
            return viewModelStoreMo128o;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.o.p.a$c */
    /* JADX INFO: compiled from: SearchUserFragment.kt */
    public static final class c {
        public c() {
        }

        public c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.o.p.a$d */
    /* JADX INFO: compiled from: SearchUserFragment.kt */
    public static final class d extends Lambda implements InterfaceC6153a<UserAdapter> {
        public d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public UserAdapter mo2c() {
            return new UserAdapter(new SearchUserFragment2(this), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.o.p.a$e */
    /* JADX INFO: compiled from: SearchUserFragment.kt */
    public static final class e<T> implements Observer<String> {
        public e() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(String str) {
            SearchUserFragment.this.mo13892e1().m13977p(null);
            SearchUserFragment.this.mo13882Z0().f31769s.mo427j(str);
            SearchUserFragment.this.mo13882Z0().m13965n();
            SearchUserFragment.this.mo13882Z0().mo13895u(1);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.o.p.a$f */
    /* JADX INFO: compiled from: SearchUserFragment.kt */
    public static final class f extends Lambda implements InterfaceC6153a<ViewModelStoreOwner> {
        public f() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ViewModelStoreOwner mo2c() {
            FragmentActivity fragmentActivityM16526F0 = SearchUserFragment.this.m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            return fragmentActivityM16526F0;
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31760j0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f31760j0 == null) {
            this.f31760j0 = new HashMap();
        }
        View view = (View) this.f31760j0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31760j0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<User, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31759i0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: f1 */
    public void mo13897f1() {
        BackgroundMessageView backgroundMessageView = (BackgroundMessageView) mo13891c1(R.id.statusView);
        if (backgroundMessageView != null) {
            SkuDao.a.m14068T(backgroundMessageView);
        }
        BackgroundMessageView backgroundMessageView2 = (BackgroundMessageView) mo13891c1(R.id.statusView);
        if (backgroundMessageView2 != null) {
            backgroundMessageView2.m14471b(R.drawable.ic_no_user, R.string.message_user_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public SearchUserViewModel mo13882Z0() {
        return (SearchUserViewModel) this.f31757g0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        mo13882Z0().f31769s.mo427j(String.valueOf(((SearchViewModel7) this.f31758h0.getValue()).f31730l.m421d()));
        ((SearchViewModel7) this.f31758h0.getValue()).f31730l.mo422e(m16548R(), new e());
    }
}
