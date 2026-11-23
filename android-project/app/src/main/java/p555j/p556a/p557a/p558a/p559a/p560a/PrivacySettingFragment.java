package p555j.p556a.p557a.p558a.p559a.p560a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple5;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.MainViewModel2;
import p555j.p556a.p557a.MainViewModel3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p644b.p645c.AppCompatActivity;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.a.k, reason: use source file name */
/* JADX INFO: compiled from: PrivacySettingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PrivacySettingFragment extends Fragment {

    /* JADX INFO: renamed from: c0 */
    public static final b f31013c0 = new b(null);

    /* JADX INFO: renamed from: d0 */
    public final Lazy3 f31014d0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: e0 */
    public PrivacySettingAdapter f31015e0 = new PrivacySettingAdapter(new d());

    /* JADX INFO: renamed from: f0 */
    public c f31016f0;

    /* JADX INFO: renamed from: g0 */
    public int f31017g0;

    /* JADX INFO: renamed from: h0 */
    public HashMap f31018h0;

    /* JADX INFO: renamed from: j.a.a.a.a.a.k$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<MainViewModel3> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31019g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31020h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31021i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31019g = viewModelStoreOwner;
            this.f31020h = qualifier;
            this.f31021i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public MainViewModel3 mo2c() {
            return SkuDao.a.m14107t(this.f31019g, Reflection.m13097a(MainViewModel3.class), this.f31020h, this.f31021i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.k$b */
    /* JADX INFO: compiled from: PrivacySettingFragment.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.k$c */
    /* JADX INFO: compiled from: PrivacySettingFragment.kt */
    public interface c {
        /* JADX INFO: renamed from: t */
        void mo13889t(int i);
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.k$d */
    /* JADX INFO: compiled from: PrivacySettingFragment.kt */
    public static final class d extends Lambda implements InterfaceC6164l<Simple5, Unit> {
        public d() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Simple5 simple5) {
            Simple5 simple6 = simple5;
            Intrinsics2.m13089e(simple6, "it");
            c cVar = PrivacySettingFragment.this.f31016f0;
            if (cVar != null) {
                cVar.mo13889t(simple6.getId());
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.k$e */
    /* JADX INFO: compiled from: PrivacySettingFragment.kt */
    public static final class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) PrivacySettingFragment.this.m16562f();
            if (appCompatActivity != null) {
                appCompatActivity.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public View m13888W0(int i) {
        if (this.f31018h0 == null) {
            this.f31018h0 = new HashMap();
        }
        View view = (View) this.f31018h0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31018h0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.mo463Z(context);
        if (context instanceof c) {
            this.f31016f0 = (c) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            this.f31017g0 = bundle2.getInt("privacy_id");
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics2.m13089e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_privacy_setting, viewGroup, false);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        this.f38414K = true;
        HashMap map = this.f31018h0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        this.f38414K = true;
        this.f31016f0 = null;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        FragmentActivity fragmentActivityM16562f = m16562f();
        if (fragmentActivityM16562f != null) {
            SkuDao.a.m14056H(fragmentActivityM16562f, false, false, 3);
        }
        Toolbar toolbar = (Toolbar) m13888W0(R.id.toolbar);
        Intrinsics2.m13088d(toolbar, "toolbar");
        FragmentActivity fragmentActivityM16526F0 = m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
        SkuDao.a.m14066R(toolbar, SkuDao.a.m14105r(fragmentActivityM16526F0));
        AppCompatActivity appCompatActivity = (AppCompatActivity) m16562f();
        if (appCompatActivity != null) {
            appCompatActivity.m14615N((Toolbar) m13888W0(R.id.toolbar));
        }
        AppCompatActivity appCompatActivity2 = (AppCompatActivity) m16562f();
        ActionBar actionBarM14610I = appCompatActivity2 != null ? appCompatActivity2.m14610I() : null;
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14593m(true);
            actionBarM14610I.mo14594n(true);
        }
        ((Toolbar) m13888W0(R.id.toolbar)).setNavigationOnClickListener(new e());
        MainViewModel3 mainViewModel3 = (MainViewModel3) this.f31014d0.getValue();
        int i = this.f31017g0;
        Objects.requireNonNull(mainViewModel3);
        C5729a.m12428A(C8310a.m16440e(mainViewModel3), null, 0, new MainViewModel2(mainViewModel3, i, null), 3, null);
        ((RecyclerView) m13888W0(R.id.recycler)).setHasFixedSize(true);
        RecyclerView recyclerView = (RecyclerView) m13888W0(R.id.recycler);
        Intrinsics2.m13088d(recyclerView, "recycler");
        recyclerView.setAdapter(this.f31015e0);
        RecyclerView recyclerView2 = (RecyclerView) m13888W0(R.id.recycler);
        Intrinsics2.m13088d(recyclerView2, "recycler");
        recyclerView2.setLayoutManager(new LinearLayoutManager(m16571x(), 1, false));
        ((MainViewModel3) this.f31014d0.getValue()).f32088l.mo422e(m16548R(), new PrivacySettingFragment2(this));
    }
}
