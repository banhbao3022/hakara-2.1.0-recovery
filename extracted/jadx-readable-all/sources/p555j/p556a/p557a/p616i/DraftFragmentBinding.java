package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.i, reason: use source file name */
/* JADX INFO: compiled from: DraftFragmentBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DraftFragmentBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ConstraintLayout f32578t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32579u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f32580v;

    /* JADX INFO: renamed from: w */
    public final RecyclerView f32581w;

    /* JADX INFO: renamed from: x */
    public BaseLoadMoreRefreshViewModel<Object> f32582x;

    public DraftFragmentBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, BackgroundMessageView backgroundMessageView) {
        super(obj, view, i);
        this.f32578t = constraintLayout;
        this.f32579u = progressBar;
        this.f32580v = progressBar2;
        this.f32581w = recyclerView;
    }
}
