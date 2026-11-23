package p636z0.p665d0.p666a;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: z0.d0.a.e, reason: use source file name */
/* JADX INFO: compiled from: SwipeRefreshLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout2 extends Animation {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SwipeRefreshLayout f35411f;

    public SwipeRefreshLayout2(SwipeRefreshLayout swipeRefreshLayout) {
        this.f35411f = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.f35411f.setAnimationProgress(f);
    }
}
