package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.e, reason: use source file name */
/* JADX INFO: compiled from: CommentFragmentBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CommentFragmentBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ConstraintLayout f32497t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32498u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f32499v;

    /* JADX INFO: renamed from: w */
    public final RecyclerView f32500w;

    /* JADX INFO: renamed from: x */
    public BaseLoadMoreRefreshViewModel<Object> f32501x;

    public CommentFragmentBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, BackgroundMessageView backgroundMessageView) {
        super(obj, view, i);
        this.f32497t = constraintLayout;
        this.f32498u = progressBar;
        this.f32499v = progressBar2;
        this.f32500w = recyclerView;
    }
}
