package p007c.p190n.p194b.p334e.p337c;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p754q.p755a.p756a.FastOutLinearInInterpolator;
import p636z0.p754q.p755a.p756a.FastOutSlowInInterpolator;
import p636z0.p754q.p755a.p756a.LinearOutSlowInInterpolator;

/* JADX INFO: renamed from: c.n.b.e.c.a, reason: use source file name */
/* JADX INFO: compiled from: AnimationUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimationUtils {

    /* JADX INFO: renamed from: a */
    public static final TimeInterpolator f24793a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final TimeInterpolator f24794b = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: c */
    public static final TimeInterpolator f24795c = new FastOutLinearInInterpolator();

    /* JADX INFO: renamed from: d */
    public static final TimeInterpolator f24796d = new LinearOutSlowInInterpolator();

    /* JADX INFO: renamed from: e */
    public static final TimeInterpolator f24797e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m11030a(float f, float f2, float f3) {
        return outline.m1576a(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: b */
    public static int m11031b(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
