package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.q, reason: use source file name */
/* JADX INFO: compiled from: DuetOwnerActivityBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DuetOwnerActivityBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final AppCompatImageView f32751t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32752u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f32753v;

    /* JADX INFO: renamed from: w */
    public final RecyclerView f32754w;

    /* JADX INFO: renamed from: x */
    public final SwipeRefreshLayout f32755x;

    /* JADX INFO: renamed from: y */
    public final View f32756y;

    /* JADX INFO: renamed from: z */
    public BaseLoadMoreRefreshViewModel<Object> f32757z;

    public DuetOwnerActivityBinding(Object obj, View view, int i, AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, TextView textView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, TextView textView2, TextView textView3, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, BackgroundMessageView backgroundMessageView, Toolbar toolbar, View view2, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.f32751t = appCompatImageView;
        this.f32752u = progressBar;
        this.f32753v = progressBar2;
        this.f32754w = recyclerView;
        this.f32755x = swipeRefreshLayout;
        this.f32756y = view2;
    }
}
