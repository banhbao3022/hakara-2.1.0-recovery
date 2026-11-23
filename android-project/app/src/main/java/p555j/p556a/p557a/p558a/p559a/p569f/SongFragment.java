package p555j.p556a.p557a.p558a.p559a.p569f;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p000.C7394q;
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
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.SongFragmentBinding;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.f.b, reason: use source file name */
/* JADX INFO: compiled from: SongFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SongFragment extends BaseLoadMoreRefreshFragment<SongFragmentBinding, SongViewModel, Song> {

    /* JADX INFO: renamed from: f0 */
    public static final b f31286f0 = new b(null);

    /* JADX INFO: renamed from: j0 */
    public float f31290j0;

    /* JADX INFO: renamed from: k0 */
    public float f31291k0;

    /* JADX INFO: renamed from: m0 */
    public boolean f31293m0;

    /* JADX INFO: renamed from: n0 */
    public HashMap f31294n0;

    /* JADX INFO: renamed from: g0 */
    public final int f31287g0 = R.layout.song_fragment;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31288h0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: i0 */
    public final int f31289i0 = 10;

    /* JADX INFO: renamed from: l0 */
    public final Lazy3 f31292l0 = LazyJVM.m13021b(new c());

    /* JADX INFO: renamed from: j.a.a.a.a.f.b$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<SongViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31295g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31296h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31297i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31295g = viewModelStoreOwner;
            this.f31296h = qualifier;
            this.f31297i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.f.c] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public SongViewModel mo2c() {
            return SkuDao.a.m14107t(this.f31295g, Reflection.m13097a(SongViewModel.class), this.f31296h, this.f31297i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.f.b$b */
    /* JADX INFO: compiled from: SongFragment.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final SongFragment m13908a(String str) {
            Intrinsics2.m13089e(str, "kind");
            SongFragment songFragment = new SongFragment();
            Bundle bundle = new Bundle();
            bundle.putString("kind", str);
            songFragment.m16540M0(bundle);
            return songFragment;
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.f.b$c */
    /* JADX INFO: compiled from: SongFragment.kt */
    public static final class c extends Lambda implements InterfaceC6153a<SongAdapter> {
        public c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public SongAdapter mo2c() {
            return new SongAdapter(new C7394q(0, this), new C7394q(1, this));
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.f.b$d */
    /* JADX INFO: compiled from: SongFragment.kt */
    public static final class d implements RecyclerView.InterfaceC0164q {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
        /* JADX INFO: renamed from: a */
        public void mo778a(RecyclerView recyclerView, MotionEvent motionEvent) {
            Intrinsics2.m13089e(recyclerView, "p0");
            Intrinsics2.m13089e(motionEvent, "p1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
        /* JADX INFO: renamed from: b */
        public boolean mo779b(RecyclerView recyclerView, MotionEvent motionEvent) {
            Intrinsics2.m13089e(recyclerView, "rv");
            Intrinsics2.m13089e(motionEvent, "e");
            int action = motionEvent.getAction();
            if (action == 0) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(motionEvent.getX() - SongFragment.this.f31290j0) > Math.abs(motionEvent.getY() - SongFragment.this.f31291k0)) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
                } else if (Math.abs(motionEvent.getY() - SongFragment.this.f31291k0) > SongFragment.this.f31289i0) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            SongFragment.this.f31290j0 = motionEvent.getX();
            SongFragment.this.f31291k0 = motionEvent.getY();
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
        /* JADX INFO: renamed from: c */
        public void mo780c(boolean z) {
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: P0 */
    public void mo13901P0(boolean z) {
        if (this.f38413J != z) {
            this.f38413J = z;
        }
        this.f31293m0 = z;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31294n0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31287g0;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Z0 */
    public BaseViewModel mo13882Z0() {
        return (SongViewModel) this.f31288h0.getValue();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            ((SongViewModel) this.f31288h0.getValue()).f31300s.mo427j(bundle2.getString("kind"));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f31294n0 == null) {
            this.f31294n0 = new HashMap();
        }
        View view = (View) this.f31294n0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31294n0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<Song, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31292l0.getValue();
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
            backgroundMessageView2.m14471b(R.drawable.ic_no_song, R.string.message_search_empty, null);
        }
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
        RecyclerView recyclerView = (RecyclerView) mo13891c1(R.id.recycler_view);
        recyclerView.f918B.add(new d());
    }
}
