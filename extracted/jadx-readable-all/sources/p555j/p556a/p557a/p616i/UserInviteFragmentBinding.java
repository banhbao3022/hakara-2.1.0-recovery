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
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;

/* JADX INFO: renamed from: j.a.a.i.q4, reason: use source file name */
/* JADX INFO: compiled from: UserInviteFragmentBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class UserInviteFragmentBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ProgressBar f32774t;

    /* JADX INFO: renamed from: u */
    public final ProgressBar f32775u;

    /* JADX INFO: renamed from: v */
    public final RecyclerView f32776v;

    /* JADX INFO: renamed from: w */
    public final SwipeRefreshLayout f32777w;

    /* JADX INFO: renamed from: x */
    public final View f32778x;

    /* JADX INFO: renamed from: y */
    public BaseLoadMoreRefreshViewModel<Object> f32779y;

    public UserInviteFragmentBinding(Object obj, View view, int i, AppBarLayout appBarLayout, TextView textView, ConstraintLayout constraintLayout, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, BackgroundMessageView backgroundMessageView, Toolbar toolbar, View view2, TextView textView2) {
        super(obj, view, i);
        this.f32774t = progressBar;
        this.f32775u = progressBar2;
        this.f32776v = recyclerView;
        this.f32777w = swipeRefreshLayout;
        this.f32778x = view2;
    }
}
