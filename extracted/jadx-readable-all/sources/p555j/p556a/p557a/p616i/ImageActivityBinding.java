package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.g0, reason: use source file name */
/* JADX INFO: compiled from: ImageActivityBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ImageActivityBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ProgressBar f32537t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32538u;

    /* JADX INFO: renamed from: v */
    public final RecyclerView f32539v;

    /* JADX INFO: renamed from: w */
    public final SwipeRefreshLayout f32540w;

    /* JADX INFO: renamed from: x */
    public final View f32541x;

    /* JADX INFO: renamed from: y */
    public BaseLoadMoreRefreshViewModel<Object> f32542y;

    public ImageActivityBinding(Object obj, View view, int i, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton, TextView textView, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, BackgroundMessageView backgroundMessageView, Toolbar toolbar, View view2, TextView textView2) {
        super(obj, view, i);
        this.f32537t = progressBar;
        this.f32538u = progressBar2;
        this.f32539v = recyclerView;
        this.f32540w = swipeRefreshLayout;
        this.f32541x = view2;
    }
}
