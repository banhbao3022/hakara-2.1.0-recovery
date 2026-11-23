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

/* JADX INFO: renamed from: j.a.a.i.m4, reason: use source file name */
/* JADX INFO: compiled from: UserActivityBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class UserActivityBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ProgressBar f32681t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32682u;

    /* JADX INFO: renamed from: v */
    public final RecyclerView f32683v;

    /* JADX INFO: renamed from: w */
    public final SwipeRefreshLayout f32684w;

    /* JADX INFO: renamed from: x */
    public final View f32685x;

    /* JADX INFO: renamed from: y */
    public BaseLoadMoreRefreshViewModel<Object> f32686y;

    public UserActivityBinding(Object obj, View view, int i, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, BackgroundMessageView backgroundMessageView, Toolbar toolbar, View view2) {
        super(obj, view, i);
        this.f32681t = progressBar;
        this.f32682u = progressBar2;
        this.f32683v = recyclerView;
        this.f32684w = swipeRefreshLayout;
        this.f32685x = view2;
    }
}
