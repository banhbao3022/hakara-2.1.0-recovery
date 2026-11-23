package p636z0.p754q.p755a.p756a;

import android.view.animation.Interpolator;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.q.a.a.d, reason: use source file name */
/* JADX INFO: compiled from: LookupTableInterpolator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class LookupTableInterpolator implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f38661a;

    /* JADX INFO: renamed from: b */
    public final float f38662b;

    public LookupTableInterpolator(float[] fArr) {
        this.f38661a = fArr;
        this.f38662b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f38661a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f38662b;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.f38661a;
        return outline.m1576a(fArr2[iMin + 1], fArr2[iMin], f3, fArr2[iMin]);
    }
}
