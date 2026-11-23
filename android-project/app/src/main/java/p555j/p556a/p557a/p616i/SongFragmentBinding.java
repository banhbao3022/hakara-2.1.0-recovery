package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.e4, reason: use source file name */
/* JADX INFO: compiled from: SongFragmentBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SongFragmentBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ConstraintLayout f32511t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32512u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f32513v;

    /* JADX INFO: renamed from: w */
    public final RecyclerView f32514w;

    /* JADX INFO: renamed from: x */
    public final SwipeRefreshLayout f32515x;

    /* JADX INFO: renamed from: y */
    public BaseLoadMoreRefreshViewModel<Object> f32516y;

    public SongFragmentBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, BackgroundMessageView backgroundMessageView) {
        super(obj, view, i);
        this.f32511t = constraintLayout;
        this.f32512u = progressBar;
        this.f32513v = progressBar2;
        this.f32514w = recyclerView;
        this.f32515x = swipeRefreshLayout;
    }
}
