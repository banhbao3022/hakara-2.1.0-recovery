package p007c.p190n.p194b.p334e.p337c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.e.c.b, reason: use source file name */
/* JADX INFO: compiled from: AnimatorSetCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatorSetCompat {
    /* JADX INFO: renamed from: a */
    public static void m11032a(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
