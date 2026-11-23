package p636z0.p665d0.p666a;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: z0.d0.a.b, reason: use source file name */
/* JADX INFO: compiled from: CircularProgressDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class CircularProgressDrawable implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CircularProgressDrawable3.a f35377a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CircularProgressDrawable3 f35378b;

    public CircularProgressDrawable(CircularProgressDrawable3 circularProgressDrawable3, CircularProgressDrawable3.a aVar) {
        this.f35378b = circularProgressDrawable3;
        this.f35377a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f35378b.m15065d(fFloatValue, this.f35377a);
        this.f35378b.m15062a(fFloatValue, this.f35377a, false);
        this.f35378b.invalidateSelf();
    }
}
