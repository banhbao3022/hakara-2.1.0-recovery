package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.o3, reason: use source file name */
/* JADX INFO: compiled from: RecordingRankingFragmentBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class RecordingRankingFragmentBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ConstraintLayout f32728t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32729u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f32730v;

    /* JADX INFO: renamed from: w */
    public final RecyclerView f32731w;

    /* JADX INFO: renamed from: x */
    public BaseLoadMoreRefreshViewModel<Object> f32732x;

    public RecordingRankingFragmentBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, BackgroundMessageView backgroundMessageView) {
        super(obj, view, i);
        this.f32728t = constraintLayout;
        this.f32729u = progressBar;
        this.f32730v = progressBar2;
        this.f32731w = recyclerView;
    }
}
