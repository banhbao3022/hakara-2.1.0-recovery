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

/* JADX INFO: renamed from: j.a.a.i.u, reason: use source file name */
/* JADX INFO: compiled from: ExploreRecordingActivityBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ExploreRecordingActivityBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ProgressBar f32862t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32863u;

    /* JADX INFO: renamed from: v */
    public final RecyclerView f32864v;

    /* JADX INFO: renamed from: w */
    public final SwipeRefreshLayout f32865w;

    /* JADX INFO: renamed from: x */
    public final View f32866x;

    /* JADX INFO: renamed from: y */
    public BaseLoadMoreRefreshViewModel<Object> f32867y;

    public ExploreRecordingActivityBinding(Object obj, View view, int i, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, BackgroundMessageView backgroundMessageView, Toolbar toolbar, View view2) {
        super(obj, view, i);
        this.f32862t = progressBar;
        this.f32863u = progressBar2;
        this.f32864v = recyclerView;
        this.f32865w = swipeRefreshLayout;
        this.f32866x = view2;
    }
}
