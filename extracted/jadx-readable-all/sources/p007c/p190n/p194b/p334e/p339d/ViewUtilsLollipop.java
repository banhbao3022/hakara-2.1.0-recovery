package p007c.p190n.p194b.p334e.p339d;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* JADX INFO: renamed from: c.n.b.e.d.j, reason: use source file name */
/* JADX INFO: compiled from: ViewUtilsLollipop.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtilsLollipop {

    /* JADX INFO: renamed from: a */
    public static final int[] f24941a = {R.attr.stateListAnimator};

    /* JADX INFO: renamed from: a */
    public static void m11089a(View view, float f) {
        int integer = view.getResources().getInteger(mtp.media.karaoke.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, mtp.media.karaoke.R.attr.state_liftable, -2130969570}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
