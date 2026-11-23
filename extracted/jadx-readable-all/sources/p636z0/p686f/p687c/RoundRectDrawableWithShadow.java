package p636z0.p686f.p687c;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: z0.f.c.e, reason: use source file name */
/* JADX INFO: compiled from: RoundRectDrawableWithShadow.java */
/* JADX INFO: loaded from: classes.dex */
public class RoundRectDrawableWithShadow extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f36523a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m15547a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f36523a) * ((double) f2)) + ((double) f));
    }

    /* JADX INFO: renamed from: b */
    public static float m15548b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f36523a) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
