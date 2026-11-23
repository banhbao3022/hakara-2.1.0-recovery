package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.k3, reason: use source file name */
/* JADX INFO: compiled from: ProfileRecordingFragmentBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ProfileRecordingFragmentBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ConstraintLayout f32639t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32640u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f32641v;

    /* JADX INFO: renamed from: w */
    public final RecyclerView f32642w;

    /* JADX INFO: renamed from: x */
    public BaseLoadMoreRefreshViewModel<Object> f32643x;

    public ProfileRecordingFragmentBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, BackgroundMessageView backgroundMessageView) {
        super(obj, view, i);
        this.f32639t = constraintLayout;
        this.f32640u = progressBar;
        this.f32641v = progressBar2;
        this.f32642w = recyclerView;
    }
}
