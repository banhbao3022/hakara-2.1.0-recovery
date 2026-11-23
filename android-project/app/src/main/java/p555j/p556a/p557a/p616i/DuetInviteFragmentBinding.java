package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.o, reason: use source file name */
/* JADX INFO: compiled from: DuetInviteFragmentBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DuetInviteFragmentBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ConstraintLayout f32707t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32708u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f32709v;

    /* JADX INFO: renamed from: w */
    public final RecyclerView f32710w;

    /* JADX INFO: renamed from: x */
    public BaseLoadMoreRefreshViewModel<Object> f32711x;

    public DuetInviteFragmentBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, BackgroundMessageView backgroundMessageView) {
        super(obj, view, i);
        this.f32707t = constraintLayout;
        this.f32708u = progressBar;
        this.f32709v = progressBar2;
        this.f32710w = recyclerView;
    }
}
