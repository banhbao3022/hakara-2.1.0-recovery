package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.w, reason: use source file name */
/* JADX INFO: compiled from: FanGiftActivityBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class FanGiftActivityBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ProgressBar f32902t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32903u;

    /* JADX INFO: renamed from: v */
    public final RecyclerView f32904v;

    /* JADX INFO: renamed from: w */
    public final SwipeRefreshLayout f32905w;

    /* JADX INFO: renamed from: x */
    public final View f32906x;

    /* JADX INFO: renamed from: y */
    public BaseLoadMoreRefreshViewModel<Object> f32907y;

    public FanGiftActivityBinding(Object obj, View view, int i, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, BackgroundMessageView backgroundMessageView, Toolbar toolbar, View view2) {
        super(obj, view, i);
        this.f32902t = progressBar;
        this.f32903u = progressBar2;
        this.f32904v = recyclerView;
        this.f32905w = swipeRefreshLayout;
        this.f32906x = view2;
    }
}
