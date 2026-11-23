package p555j.p556a.p557a.p558a.p559a.p563d.p564a;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p000.C7392p;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBinding;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.d.a.b, reason: use source file name */
/* JADX INFO: compiled from: DuetInviteFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetInviteFragment extends BaseLoadMoreRefreshFragment<FragmentLoadmoreRefreshBinding, DuetInviteViewModel, Recording> {

    /* JADX INFO: renamed from: f0 */
    public static final b f31150f0 = new b(null);

    /* JADX INFO: renamed from: g0 */
    public final int f31151g0 = R.layout.duet_invite_fragment;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31152h0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: i0 */
    public final Lazy3 f31153i0 = LazyJVM.m13021b(new c());

    /* JADX INFO: renamed from: j0 */
    public HashMap f31154j0;

    /* JADX INFO: renamed from: j.a.a.a.a.d.a.b$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<DuetInviteViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31155g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31156h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31157i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31155g = viewModelStoreOwner;
            this.f31156h = qualifier;
            this.f31157i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.d.a.c] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public DuetInviteViewModel mo2c() {
            return SkuDao.a.m14107t(this.f31155g, Reflection.m13097a(DuetInviteViewModel.class), this.f31156h, this.f31157i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.d.a.b$b */
    /* JADX INFO: compiled from: DuetInviteFragment.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public static DuetInviteFragment m13899a(b bVar, int i, int i2, int i3, boolean z, int i4) {
            if ((i4 & 1) != 0) {
                i = 0;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            if ((i4 & 8) != 0) {
                z = false;
            }
            Objects.requireNonNull(bVar);
            DuetInviteFragment duetInviteFragment = new DuetInviteFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("song_id", i);
            bundle.putInt("type", i2);
            bundle.putInt("user_id", i3);
            bundle.putBoolean("for_profile", z);
            duetInviteFragment.m16540M0(bundle);
            return duetInviteFragment;
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.d.a.b$c */
    /* JADX INFO: compiled from: DuetInviteFragment.kt */
    public static final class c extends Lambda implements InterfaceC6153a<DuetInviteAdapter> {
        public c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public DuetInviteAdapter mo2c() {
            return new DuetInviteAdapter(new C7392p(0, this), new C7392p(1, this), new C7392p(2, this));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31154j0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31151g0;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            DuetInviteViewModel duetInviteViewModelMo13882Z0 = mo13882Z0();
            duetInviteViewModelMo13882Z0.f31161u.mo427j(Integer.valueOf(bundle2.getInt("type")));
            duetInviteViewModelMo13882Z0.f31160t.mo427j(Integer.valueOf(bundle2.getInt("song_id")));
            duetInviteViewModelMo13882Z0.f31159s.mo427j(Integer.valueOf(bundle2.getInt("user_id")));
            duetInviteViewModelMo13882Z0.f31162v = bundle2.getBoolean("for_profile");
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f31154j0 == null) {
            this.f31154j0 = new HashMap();
        }
        View view = (View) this.f31154j0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31154j0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<Recording, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31153i0.getValue();
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
            backgroundMessageView2.m14471b(R.drawable.ic_no_song, R.string.message_duet_invite_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public DuetInviteViewModel mo13882Z0() {
        return (DuetInviteViewModel) this.f31152h0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }
}
