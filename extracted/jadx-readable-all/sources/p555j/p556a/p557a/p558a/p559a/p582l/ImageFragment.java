package p555j.p556a.p557a.p558a.p559a.p582l;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Image;
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
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBinding;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.l.f, reason: use source file name */
/* JADX INFO: compiled from: ImageFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageFragment extends BaseLoadMoreRefreshFragment<FragmentLoadmoreRefreshBinding, ImageViewModel2, Image> {

    /* JADX INFO: renamed from: f0 */
    public static final b f31617f0 = new b(null);

    /* JADX INFO: renamed from: g0 */
    public final int f31618g0 = R.layout.image_fragment;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31619h0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: i0 */
    public final Lazy3 f31620i0 = LazyJVM.m13021b(new c());

    /* JADX INFO: renamed from: j0 */
    public HashMap f31621j0;

    /* JADX INFO: renamed from: j.a.a.a.a.l.f$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<ImageViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31622g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31623h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31624i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31622g = viewModelStoreOwner;
            this.f31623h = qualifier;
            this.f31624i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.l.k] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ImageViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f31622g, Reflection.m13097a(ImageViewModel2.class), this.f31623h, this.f31624i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.l.f$b */
    /* JADX INFO: compiled from: ImageFragment.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.l.f$c */
    /* JADX INFO: compiled from: ImageFragment.kt */
    public static final class c extends Lambda implements InterfaceC6153a<ImageAdapter> {
        public c() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ImageAdapter mo2c() {
            return new ImageAdapter(new ImageFragment2(this), null, 2, 0 == true ? 1 : 0);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31621j0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31618g0;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            int i = bundle2.getInt("user_id");
            if (i > 0) {
                mo13882Z0().f31632s.mo427j(Integer.valueOf(i));
            }
            BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13892e1 = mo13892e1();
            Objects.requireNonNull(baseListAdapterMo13892e1, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
            FragmentActivity fragmentActivityM16526F0 = m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            ((ImageAdapter) baseListAdapterMo13892e1).f31607f = (SkuDao.a.m14104q(fragmentActivityM16526F0) / 3) - 6;
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f31621j0 == null) {
            this.f31621j0 = new HashMap();
        }
        View view = (View) this.f31621j0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31621j0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: d1 */
    public RecyclerView.AbstractC0160m mo13933d1() {
        return new GridLayoutManager(m16571x(), 3);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<Image, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31620i0.getValue();
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
            backgroundMessageView2.m14471b(R.drawable.ic_no_image, R.string.message_image_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public ImageViewModel2 mo13882Z0() {
        return (ImageViewModel2) this.f31619h0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }
}
