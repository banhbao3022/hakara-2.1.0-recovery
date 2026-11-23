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

/* JADX INFO: renamed from: j.a.a.a.b.l, reason: use source file name */
/* JADX INFO: compiled from: BaseLoadMoreRefreshActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseLoadMoreRefreshActivity<ViewBinding extends ViewDataBinding, ViewModel extends BaseLoadMoreRefreshViewModel<Item>, Item> extends BaseActivity3<ViewBinding, ViewModel> {

    /* JADX INFO: renamed from: w */
    public final int f32019w = R.layout.fragment_loadmore_refresh;

    /* JADX INFO: renamed from: x */
    public HashMap f32020x;

    /* JADX INFO: renamed from: j.a.a.a.b.l$a */
    /* JADX INFO: compiled from: BaseLoadMoreRefreshActivity.kt */
    public static final class a<T> implements Observer<Boolean> {
        public a() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics2.m13088d(bool2, "it");
            if (bool2.booleanValue()) {
                BaseLoadMoreRefreshActivity.this.mo13981X();
                return;
            }
            BackgroundMessageView backgroundMessageView = (BackgroundMessageView) BaseLoadMoreRefreshActivity.this.mo13978U(R.id.statusView);
            if (backgroundMessageView != null) {
                SkuDao.a.m14061M(backgroundMessageView);
            }
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f32019w;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: S */
    public void mo13970S(boolean z) {
    }

    /* JADX INFO: renamed from: U */
    public View mo13978U(int i) {
        if (this.f32020x == null) {
            this.f32020x = new HashMap();
        }
        View view = (View) this.f32020x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f32020x.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: V */
    public RecyclerView.AbstractC0160m mo13979V() {
        return new LinearLayoutManager(this, 1, false);
    }

    /* JADX INFO: renamed from: W */
    public abstract BaseListAdapter<Item, ? extends ViewDataBinding> mo13980W();

    /* JADX INFO: renamed from: X */
    public void mo13981X() {
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo13978U(R.id.refresh_layout);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setColorSchemeResources(R.color.header_color);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) mo13978U(R.id.refresh_layout);
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setOnRefreshListener(new BaseLoadMoreRefreshActivity3(this));
        }
        RecyclerView recyclerView = (RecyclerView) mo13978U(R.id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(mo13979V());
        }
        RecyclerView recyclerView2 = (RecyclerView) mo13978U(R.id.recycler_view);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(mo13980W());
        }
        ViewModel viewmodelMo13969R = mo13969R();
        viewmodelMo13969R.f32034q.mo422e(this, new BaseLoadMoreRefreshActivity2(this));
        viewmodelMo13969R.m13985r();
        mo13969R().f32035r.mo422e(this, new a());
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = (RecyclerView) mo13978U(R.id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
    }
}
