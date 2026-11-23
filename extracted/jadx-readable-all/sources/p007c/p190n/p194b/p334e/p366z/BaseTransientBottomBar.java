package p007c.p190n.p194b.p334e.p366z;

import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.e.z.a, reason: use source file name */
/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar {
    public BaseTransientBottomBar(SwipeDismissBehavior<?> swipeDismissBehavior) {
        Objects.requireNonNull(swipeDismissBehavior);
        swipeDismissBehavior.f28771e = SwipeDismissBehavior.m12704C(0.0f, 0.1f, 1.0f);
        swipeDismissBehavior.f28772f = SwipeDismissBehavior.m12704C(0.0f, 0.6f, 1.0f);
        swipeDismissBehavior.f28769c = 0;
    }
}
