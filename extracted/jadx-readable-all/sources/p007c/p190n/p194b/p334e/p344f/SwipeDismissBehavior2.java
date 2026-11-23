package p007c.p190n.p194b.p334e.p344f;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityViewCommand;

/* JADX INFO: renamed from: c.n.b.e.f.a, reason: use source file name */
/* JADX INFO: compiled from: SwipeDismissBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior2 implements AccessibilityViewCommand {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f24978a;

    public SwipeDismissBehavior2(SwipeDismissBehavior swipeDismissBehavior) {
        this.f24978a = swipeDismissBehavior;
    }

    @Override // p636z0.p725k.p739l.p740b0.AccessibilityViewCommand
    /* JADX INFO: renamed from: a */
    public boolean mo935a(View view, AccessibilityViewCommand.a aVar) {
        boolean z = false;
        if (!this.f24978a.mo12705B(view)) {
            return false;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = this.f24978a.f28769c;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        ViewCompat.m16319m(view, width);
        view.setAlpha(0.0f);
        Objects.requireNonNull(this.f24978a);
        return true;
    }
}
