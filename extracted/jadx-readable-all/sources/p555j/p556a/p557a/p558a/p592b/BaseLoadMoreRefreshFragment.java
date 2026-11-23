package p555j.p556a.p557a.p558a.p592b;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.HashMap;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.b.o, reason: use source file name */
/* JADX INFO: compiled from: BaseLoadMoreRefreshFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseLoadMoreRefreshFragment<ViewBinding extends ViewDataBinding, ViewModel extends BaseLoadMoreRefreshViewModel<Item>, Item> extends BaseFragment3<ViewBinding, ViewModel> {

    /* JADX INFO: renamed from: d0 */
    public final int f32024d0 = R.layout.fragment_loadmore_refresh;

    /* JADX INFO: renamed from: e0 */
    public HashMap f32025e0;

    /* JADX INFO: renamed from: j.a.a.a.b.o$a */
    /* JADX INFO: compiled from: BaseLoadMoreRefreshFragment.kt */
    public static final class a<T> implements Observer<Boolean> {
        public a() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics2.m13088d(bool2, "it");
            if (bool2.booleanValue()) {
                BaseLoadMoreRefreshFragment.this.mo13897f1();
                return;
            }
            BackgroundMessageView backgroundMessageView = (BackgroundMessageView) BaseLoadMoreRefreshFragment.this.mo13891c1(R.id.statusView);
            if (backgroundMessageView != null) {
                SkuDao.a.m14061M(backgroundMessageView);
            }
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f32025e0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f32024d0;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: a1 */
    public void mo13975a1(boolean z) {
    }

    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f32025e0 == null) {
            this.f32025e0 = new HashMap();
        }
        View view = (View) this.f32025e0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f32025e0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: d1 */
    public RecyclerView.AbstractC0160m mo13933d1() {
        return new LinearLayoutManager(m16571x(), 1, false);
    }

    /* JADX INFO: renamed from: e1 */
    public abstract BaseListAdapter<Item, ? extends ViewDataBinding> mo13892e1();

    /* JADX INFO: renamed from: f1 */
    public void mo13897f1() {
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        RecyclerView recyclerView = (RecyclerView) mo13891c1(R.id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        mo13880W0();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo13891c1(R.id.refresh_layout);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setColorSchemeResources(R.color.header_color);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) mo13891c1(R.id.refresh_layout);
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setOnRefreshListener(new BaseLoadMoreRefreshFragment3(this));
        }
        RecyclerView recyclerView = (RecyclerView) mo13891c1(R.id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(mo13933d1());
        }
        RecyclerView recyclerView2 = (RecyclerView) mo13891c1(R.id.recycler_view);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(mo13892e1());
        }
        ViewModel viewmodelMo13882Z0 = mo13882Z0();
        viewmodelMo13882Z0.f32034q.mo422e(m16548R(), new BaseLoadMoreRefreshFragment2(this));
        viewmodelMo13882Z0.m13985r();
        mo13882Z0().f32035r.mo422e(m16548R(), new a());
    }
}
