package p555j.p556a.p557a.p558a.p559a.p561b;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.UserInviteFragmentBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p644b.p645c.AppCompatActivity;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.b.d, reason: use source file name */
/* JADX INFO: compiled from: UserInviteFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserInviteFragment extends BaseLoadMoreRefreshFragment<UserInviteFragmentBinding, UserViewModel, User> {

    /* JADX INFO: renamed from: f0 */
    public static final c f31065f0 = new c(null);

    /* JADX INFO: renamed from: k0 */
    public d f31070k0;

    /* JADX INFO: renamed from: m0 */
    public HashMap f31072m0;

    /* JADX INFO: renamed from: g0 */
    public final int f31066g0 = R.layout.user_invite_fragment;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31067h0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: i0 */
    public final Lazy3 f31068i0 = C8310a.m16436a(this, Reflection.m13097a(C6799h0.class), new b(new h()), null);

    /* JADX INFO: renamed from: j0 */
    public final Lazy3 f31069j0 = LazyJVM.m13021b(new e());

    /* JADX INFO: renamed from: l0 */
    public ArrayList<User> f31071l0 = new ArrayList<>();

    /* JADX INFO: renamed from: j.a.a.a.a.b.d$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<UserViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31073g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31074h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31075i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31073g = viewModelStoreOwner;
            this.f31074h = qualifier;
            this.f31075i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.b.g] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public UserViewModel mo2c() {
            return SkuDao.a.m14107t(this.f31073g, Reflection.m13097a(UserViewModel.class), this.f31074h, this.f31075i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.b.d$b */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    public static final class b extends Lambda implements InterfaceC6153a<ViewModelStore> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC6153a f31076g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31076g = interfaceC6153a;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ViewModelStore mo2c() {
            ViewModelStore viewModelStoreMo128o = ((ViewModelStoreOwner) this.f31076g.mo2c()).mo128o();
            Intrinsics2.m13088d(viewModelStoreMo128o, "ownerProducer().viewModelStore");
            return viewModelStoreMo128o;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.b.d$c */
    /* JADX INFO: compiled from: UserInviteFragment.kt */
    public static final class c {
        public c() {
        }

        public c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.b.d$d */
    /* JADX INFO: compiled from: UserInviteFragment.kt */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo13893a();

        /* JADX INFO: renamed from: h */
        void mo13894h(ArrayList<User> arrayList);
    }

    /* JADX INFO: renamed from: j.a.a.a.a.b.d$e */
    /* JADX INFO: compiled from: UserInviteFragment.kt */
    public static final class e extends Lambda implements InterfaceC6153a<UserInviteAdapter> {
        public e() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public UserInviteAdapter mo2c() {
            return new UserInviteAdapter(new UserInviteFragment2(this));
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.b.d$f */
    /* JADX INFO: compiled from: UserInviteFragment.kt */
    public static final class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = UserInviteFragment.this.f31070k0;
            if (dVar != null) {
                dVar.mo13893a();
            }
            AppCompatActivity appCompatActivity = (AppCompatActivity) UserInviteFragment.this.m16562f();
            if (appCompatActivity != null) {
                appCompatActivity.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.b.d$g */
    /* JADX INFO: compiled from: UserInviteFragment.kt */
    public static final class g extends Lambda implements InterfaceC6153a<Unit> {
        public g() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            if (UserInviteFragment.this.f31071l0.size() > 0) {
                UserInviteFragment userInviteFragment = UserInviteFragment.this;
                d dVar = userInviteFragment.f31070k0;
                if (dVar != null) {
                    dVar.mo13894h(userInviteFragment.f31071l0);
                }
                AppCompatActivity appCompatActivity = (AppCompatActivity) UserInviteFragment.this.m16562f();
                if (appCompatActivity != null) {
                    appCompatActivity.onBackPressed();
                }
            } else {
                Toast.makeText(UserInviteFragment.this.m16528G0(), UserInviteFragment.this.m16546Q(R.string.message_require_choose_friends), 0).show();
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.b.d$h */
    /* JADX INFO: compiled from: UserInviteFragment.kt */
    public static final class h extends Lambda implements InterfaceC6153a<ViewModelStoreOwner> {
        public h() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ViewModelStoreOwner mo2c() {
            FragmentActivity fragmentActivityM16526F0 = UserInviteFragment.this.m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            return fragmentActivityM16526F0;
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31072m0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31066g0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.mo463Z(context);
        if (context instanceof d) {
            this.f31070k0 = (d) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Z0 */
    public BaseViewModel mo13882Z0() {
        return (UserViewModel) this.f31067h0.getValue();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        ((UserViewModel) this.f31067h0.getValue()).f31082s.mo427j(2);
        ArrayList<User> arrayListM421d = ((C6799h0) this.f31068i0.getValue()).f31868w.m421d();
        if (arrayListM421d != null) {
            BaseListAdapter<User, ? extends ViewDataBinding> baseListAdapterMo13892e1 = mo13892e1();
            Objects.requireNonNull(baseListAdapterMo13892e1, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.user.UserInviteAdapter");
            Intrinsics2.m13088d(arrayListM421d, "it");
            Intrinsics2.m13089e(arrayListM421d, "users");
            ((UserInviteAdapter) baseListAdapterMo13892e1).f31059f = arrayListM421d;
            this.f31071l0 = arrayListM421d;
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f31072m0 == null) {
            this.f31072m0 = new HashMap();
        }
        View view = (View) this.f31072m0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31072m0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<User, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31069j0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        this.f38414K = true;
        this.f31070k0 = null;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        FragmentActivity fragmentActivityM16562f = m16562f();
        if (fragmentActivityM16562f != null) {
            SkuDao.a.m14056H(fragmentActivityM16562f, false, false, 3);
        }
        Toolbar toolbar = (Toolbar) mo13891c1(R.id.toolbar);
        Intrinsics2.m13088d(toolbar, "toolbar");
        FragmentActivity fragmentActivityM16526F0 = m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
        SkuDao.a.m14066R(toolbar, SkuDao.a.m14105r(fragmentActivityM16526F0));
        AppCompatActivity appCompatActivity = (AppCompatActivity) m16562f();
        if (appCompatActivity != null) {
            appCompatActivity.m14615N((Toolbar) mo13891c1(R.id.toolbar));
        }
        AppCompatActivity appCompatActivity2 = (AppCompatActivity) m16562f();
        ActionBar actionBarM14610I = appCompatActivity2 != null ? appCompatActivity2.m14610I() : null;
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14593m(true);
        }
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14594n(true);
        }
        ((Toolbar) mo13891c1(R.id.toolbar)).setNavigationOnClickListener(new f());
        TextView textView = (TextView) mo13891c1(R.id.btnInvite);
        Intrinsics2.m13088d(textView, "btnInvite");
        SkuDao.a.m14067S(textView, new g());
    }
}
