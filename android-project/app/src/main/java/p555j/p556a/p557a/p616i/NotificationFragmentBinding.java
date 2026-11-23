package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.w2, reason: use source file name */
/* JADX INFO: compiled from: NotificationFragmentBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NotificationFragmentBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final LinearLayout f32918t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32919u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f32920v;

    /* JADX INFO: renamed from: w */
    public final RecyclerView f32921w;

    /* JADX INFO: renamed from: x */
    public final SwipeRefreshLayout f32922x;

    /* JADX INFO: renamed from: y */
    public final View f32923y;

    /* JADX INFO: renamed from: z */
    public BaseLoadMoreRefreshViewModel<Object> f32924z;

    public NotificationFragmentBinding(Object obj, View view, int i, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, BackgroundMessageView backgroundMessageView, View view2) {
        super(obj, view, i);
        this.f32918t = linearLayout;
        this.f32919u = progressBar;
        this.f32920v = progressBar2;
        this.f32921w = recyclerView;
        this.f32922x = swipeRefreshLayout;
        this.f32923y = view2;
    }
}
