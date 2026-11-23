package p007c.p056c.p057a.p068z.p070c;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatablePathValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableScaleValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p060j.AnimatableValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p067f0.ScaleXY;

/* JADX INFO: renamed from: c.c.a.z.c.o, reason: use source file name */
/* JADX INFO: compiled from: TransformKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class TransformKeyframeAnimation {

    /* JADX INFO: renamed from: a */
    public final Matrix f2660a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Matrix f2661b;

    /* JADX INFO: renamed from: c */
    public final Matrix f2662c;

    /* JADX INFO: renamed from: d */
    public final Matrix f2663d;

    /* JADX INFO: renamed from: e */
    public final float[] f2664e;

    /* JADX INFO: renamed from: f */
    public BaseKeyframeAnimation<PointF, PointF> f2665f;

    /* JADX INFO: renamed from: g */
    public BaseKeyframeAnimation<?, PointF> f2666g;

    /* JADX INFO: renamed from: h */
    public BaseKeyframeAnimation<ScaleXY, ScaleXY> f2667h;

    /* JADX INFO: renamed from: i */
    public BaseKeyframeAnimation<Float, Float> f2668i;

    /* JADX INFO: renamed from: j */
    public BaseKeyframeAnimation<Integer, Integer> f2669j;

    /* JADX INFO: renamed from: k */
    public FloatKeyframeAnimation f2670k;

    /* JADX INFO: renamed from: l */
    public FloatKeyframeAnimation f2671l;

    /* JADX INFO: renamed from: m */
    public BaseKeyframeAnimation<?, Float> f2672m;

    /* JADX INFO: renamed from: n */
    public BaseKeyframeAnimation<?, Float> f2673n;

    public TransformKeyframeAnimation(AnimatableTransform animatableTransform) {
        AnimatablePathValue animatablePathValue = animatableTransform.f2009a;
        this.f2665f = animatablePathValue == null ? null : animatablePathValue.mo1339a();
        AnimatableValue<PointF, PointF> animatableValue = animatableTransform.f2010b;
        this.f2666g = animatableValue == null ? null : animatableValue.mo1339a();
        AnimatableScaleValue animatableScaleValue = animatableTransform.f2011c;
        this.f2667h = animatableScaleValue == null ? null : animatableScaleValue.mo1339a();
        AnimatableFloatValue animatableFloatValue = animatableTransform.f2012d;
        this.f2668i = animatableFloatValue == null ? null : animatableFloatValue.mo1339a();
        AnimatableFloatValue animatableFloatValue2 = animatableTransform.f2014f;
        FloatKeyframeAnimation floatKeyframeAnimation = animatableFloatValue2 == null ? null : (FloatKeyframeAnimation) animatableFloatValue2.mo1339a();
        this.f2670k = floatKeyframeAnimation;
        if (floatKeyframeAnimation != null) {
            this.f2661b = new Matrix();
            this.f2662c = new Matrix();
            this.f2663d = new Matrix();
            this.f2664e = new float[9];
        } else {
            this.f2661b = null;
            this.f2662c = null;
            this.f2663d = null;
            this.f2664e = null;
        }
        AnimatableFloatValue animatableFloatValue3 = animatableTransform.f2015g;
        this.f2671l = animatableFloatValue3 == null ? null : (FloatKeyframeAnimation) animatableFloatValue3.mo1339a();
        AnimatableIntegerValue animatableIntegerValue = animatableTransform.f2013e;
        if (animatableIntegerValue != null) {
            this.f2669j = animatableIntegerValue.mo1339a();
        }
        AnimatableFloatValue animatableFloatValue4 = animatableTransform.f2016h;
        if (animatableFloatValue4 != null) {
            this.f2672m = animatableFloatValue4.mo1339a();
        } else {
            this.f2672m = null;
        }
        AnimatableFloatValue animatableFloatValue5 = animatableTransform.f2017i;
        if (animatableFloatValue5 != null) {
            this.f2673n = animatableFloatValue5.mo1339a();
        } else {
            this.f2673n = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1520a(BaseLayer2 baseLayer2) {
        baseLayer2.m1348e(this.f2669j);
        baseLayer2.m1348e(this.f2672m);
        baseLayer2.m1348e(this.f2673n);
        baseLayer2.m1348e(this.f2665f);
        baseLayer2.m1348e(this.f2666g);
        baseLayer2.m1348e(this.f2667h);
        baseLayer2.m1348e(this.f2668i);
        baseLayer2.m1348e(this.f2670k);
        baseLayer2.m1348e(this.f2671l);
    }

    /* JADX INFO: renamed from: b */
    public void m1521b(BaseKeyframeAnimation.b bVar) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f2669j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.f2629a.add(bVar);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f2672m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.f2629a.add(bVar);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f2673n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.f2629a.add(bVar);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f2665f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.f2629a.add(bVar);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.f2666g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.f2629a.add(bVar);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation6 = this.f2667h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.f2629a.add(bVar);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.f2668i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.f2629a.add(bVar);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f2670k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.f2629a.add(bVar);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f2671l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.f2629a.add(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public <T> boolean m1522c(T t, LottieValueCallback<T> lottieValueCallback) {
        FloatKeyframeAnimation floatKeyframeAnimation;
        FloatKeyframeAnimation floatKeyframeAnimation2;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t == LottieProperty.f2457e) {
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation3 = this.f2665f;
            if (baseKeyframeAnimation3 == null) {
                this.f2665f = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            LottieValueCallback<PointF> lottieValueCallback2 = baseKeyframeAnimation3.f2633e;
            baseKeyframeAnimation3.f2633e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f2458f) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation4 = this.f2666g;
            if (baseKeyframeAnimation4 == null) {
                this.f2666g = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            LottieValueCallback<PointF> lottieValueCallback3 = baseKeyframeAnimation4.f2633e;
            baseKeyframeAnimation4.f2633e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f2463k) {
            BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation5 = this.f2667h;
            if (baseKeyframeAnimation5 == null) {
                this.f2667h = new ValueCallbackKeyframeAnimation(lottieValueCallback, new ScaleXY());
                return true;
            }
            LottieValueCallback<ScaleXY> lottieValueCallback4 = baseKeyframeAnimation5.f2633e;
            baseKeyframeAnimation5.f2633e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f2464l) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.f2668i;
            if (baseKeyframeAnimation6 == null) {
                this.f2668i = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(0.0f));
                return true;
            }
            LottieValueCallback<Float> lottieValueCallback5 = baseKeyframeAnimation6.f2633e;
            baseKeyframeAnimation6.f2633e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f2455c) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation7 = this.f2669j;
            if (baseKeyframeAnimation7 == null) {
                this.f2669j = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            LottieValueCallback<Integer> lottieValueCallback6 = baseKeyframeAnimation7.f2633e;
            baseKeyframeAnimation7.f2633e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f2477y && (baseKeyframeAnimation2 = this.f2672m) != null) {
            if (baseKeyframeAnimation2 == null) {
                this.f2672m = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            LottieValueCallback<Float> lottieValueCallback7 = baseKeyframeAnimation2.f2633e;
            baseKeyframeAnimation2.f2633e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f2478z && (baseKeyframeAnimation = this.f2673n) != null) {
            if (baseKeyframeAnimation == null) {
                this.f2673n = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            LottieValueCallback<Float> lottieValueCallback8 = baseKeyframeAnimation.f2633e;
            baseKeyframeAnimation.f2633e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f2465m && (floatKeyframeAnimation2 = this.f2670k) != null) {
            if (floatKeyframeAnimation2 == null) {
                this.f2670k = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
            }
            FloatKeyframeAnimation floatKeyframeAnimation3 = this.f2670k;
            Object obj = floatKeyframeAnimation3.f2633e;
            floatKeyframeAnimation3.f2633e = lottieValueCallback;
            return true;
        }
        if (t != LottieProperty.f2466n || (floatKeyframeAnimation = this.f2671l) == null) {
            return false;
        }
        if (floatKeyframeAnimation == null) {
            this.f2671l = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
        }
        FloatKeyframeAnimation floatKeyframeAnimation4 = this.f2671l;
        Object obj2 = floatKeyframeAnimation4.f2633e;
        floatKeyframeAnimation4.f2633e = lottieValueCallback;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m1523d() {
        for (int i = 0; i < 9; i++) {
            this.f2664e[i] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: e */
    public Matrix m1524e() {
        this.f2660a.reset();
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f2666g;
        if (baseKeyframeAnimation != null) {
            PointF pointFMo1504e = baseKeyframeAnimation.mo1504e();
            float f = pointFMo1504e.x;
            if (f != 0.0f || pointFMo1504e.y != 0.0f) {
                this.f2660a.preTranslate(f, pointFMo1504e.y);
            }
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.f2668i;
        if (baseKeyframeAnimation2 != null) {
            float fFloatValue = baseKeyframeAnimation2 instanceof ValueCallbackKeyframeAnimation ? baseKeyframeAnimation2.mo1504e().floatValue() : ((FloatKeyframeAnimation) baseKeyframeAnimation2).m1516j();
            if (fFloatValue != 0.0f) {
                this.f2660a.preRotate(fFloatValue);
            }
        }
        if (this.f2670k != null) {
            FloatKeyframeAnimation floatKeyframeAnimation = this.f2671l;
            float fCos = floatKeyframeAnimation == null ? 0.0f : (float) Math.cos(Math.toRadians((-floatKeyframeAnimation.m1516j()) + 90.0f));
            FloatKeyframeAnimation floatKeyframeAnimation2 = this.f2671l;
            float fSin = floatKeyframeAnimation2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-floatKeyframeAnimation2.m1516j()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(this.f2670k.m1516j()));
            m1523d();
            float[] fArr = this.f2664e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f2661b.setValues(fArr);
            m1523d();
            float[] fArr2 = this.f2664e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f2662c.setValues(fArr2);
            m1523d();
            float[] fArr3 = this.f2664e;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f2663d.setValues(fArr3);
            this.f2662c.preConcat(this.f2661b);
            this.f2663d.preConcat(this.f2662c);
            this.f2660a.preConcat(this.f2663d);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation3 = this.f2667h;
        if (baseKeyframeAnimation3 != null) {
            ScaleXY scaleXYMo1504e = baseKeyframeAnimation3.mo1504e();
            float f3 = scaleXYMo1504e.f2376a;
            if (f3 != 1.0f || scaleXYMo1504e.f2377b != 1.0f) {
                this.f2660a.preScale(f3, scaleXYMo1504e.f2377b);
            }
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f2665f;
        if (baseKeyframeAnimation4 != null) {
            PointF pointFMo1504e2 = baseKeyframeAnimation4.mo1504e();
            float f4 = pointFMo1504e2.x;
            if (f4 != 0.0f || pointFMo1504e2.y != 0.0f) {
                this.f2660a.preTranslate(-f4, -pointFMo1504e2.y);
            }
        }
        return this.f2660a;
    }

    /* JADX INFO: renamed from: f */
    public Matrix m1525f(float f) {
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f2666g;
        PointF pointFMo1504e = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.mo1504e();
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation2 = this.f2667h;
        ScaleXY scaleXYMo1504e = baseKeyframeAnimation2 == null ? null : baseKeyframeAnimation2.mo1504e();
        this.f2660a.reset();
        if (pointFMo1504e != null) {
            this.f2660a.preTranslate(pointFMo1504e.x * f, pointFMo1504e.y * f);
        }
        if (scaleXYMo1504e != null) {
            double d = f;
            this.f2660a.preScale((float) Math.pow(scaleXYMo1504e.f2376a, d), (float) Math.pow(scaleXYMo1504e.f2377b, d));
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.f2668i;
        if (baseKeyframeAnimation3 != null) {
            float fFloatValue = baseKeyframeAnimation3.mo1504e().floatValue();
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f2665f;
            PointF pointFMo1504e2 = baseKeyframeAnimation4 != null ? baseKeyframeAnimation4.mo1504e() : null;
            this.f2660a.preRotate(fFloatValue * f, pointFMo1504e2 == null ? 0.0f : pointFMo1504e2.x, pointFMo1504e2 != null ? pointFMo1504e2.y : 0.0f);
        }
        return this.f2660a;
    }
}
