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

/* JADX INFO: renamed from: j.a.a.i.c3, reason: use source file name */
/* JADX INFO: compiled from: PresentActivityBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PresentActivityBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ProgressBar f32455t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32456u;

    /* JADX INFO: renamed from: v */
    public final RecyclerView f32457v;

    /* JADX INFO: renamed from: w */
    public final SwipeRefreshLayout f32458w;

    /* JADX INFO: renamed from: x */
    public final View f32459x;

    /* JADX INFO: renamed from: y */
    public BaseLoadMoreRefreshViewModel<Object> f32460y;

    public PresentActivityBinding(Object obj, View view, int i, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, BackgroundMessageView backgroundMessageView, Toolbar toolbar, View view2) {
        super(obj, view, i);
        this.f32455t = progressBar;
        this.f32456u = progressBar2;
        this.f32457v = recyclerView;
        this.f32458w = swipeRefreshLayout;
        this.f32459x = view2;
    }
}
