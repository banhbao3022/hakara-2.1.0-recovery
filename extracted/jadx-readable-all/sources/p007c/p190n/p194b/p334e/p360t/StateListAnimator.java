package p007c.p190n.p194b.p334e.p360t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: c.n.b.e.t.f, reason: use source file name */
/* JADX INFO: compiled from: StateListAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class StateListAnimator {

    /* JADX INFO: renamed from: a */
    public final ArrayList<b> f25479a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public b f25480b = null;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f25481c = null;

    /* JADX INFO: renamed from: d */
    public final Animator.AnimatorListener f25482d = new a();

    /* JADX INFO: renamed from: c.n.b.e.t.f$a */
    /* JADX INFO: compiled from: StateListAnimator.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.f25481c == animator) {
                stateListAnimator.f25481c = null;
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.t.f$b */
    /* JADX INFO: compiled from: StateListAnimator.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int[] f25484a;

        /* JADX INFO: renamed from: b */
        public final ValueAnimator f25485b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f25484a = iArr;
            this.f25485b = valueAnimator;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m11334a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f25482d);
        this.f25479a.add(bVar);
    }
}
