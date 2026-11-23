package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.p061k.PolystarShape;
import p007c.p056c.p057a.p059b0.p061k.ShapeTrimPath;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.z.b.n, reason: use source file name */
/* JADX INFO: compiled from: PolystarContent.java */
/* JADX INFO: loaded from: classes.dex */
public class PolystarContent implements PathContent, BaseKeyframeAnimation.b, KeyPathElementContent {

    /* JADX INFO: renamed from: b */
    public final String f2579b;

    /* JADX INFO: renamed from: c */
    public final LottieDrawable f2580c;

    /* JADX INFO: renamed from: d */
    public final PolystarShape.a f2581d;

    /* JADX INFO: renamed from: e */
    public final boolean f2582e;

    /* JADX INFO: renamed from: f */
    public final BaseKeyframeAnimation<?, Float> f2583f;

    /* JADX INFO: renamed from: g */
    public final BaseKeyframeAnimation<?, PointF> f2584g;

    /* JADX INFO: renamed from: h */
    public final BaseKeyframeAnimation<?, Float> f2585h;

    /* JADX INFO: renamed from: i */
    public final BaseKeyframeAnimation<?, Float> f2586i;

    /* JADX INFO: renamed from: j */
    public final BaseKeyframeAnimation<?, Float> f2587j;

    /* JADX INFO: renamed from: k */
    public final BaseKeyframeAnimation<?, Float> f2588k;

    /* JADX INFO: renamed from: l */
    public final BaseKeyframeAnimation<?, Float> f2589l;

    /* JADX INFO: renamed from: n */
    public boolean f2591n;

    /* JADX INFO: renamed from: a */
    public final Path f2578a = new Path();

    /* JADX INFO: renamed from: m */
    public CompoundTrimPathContent f2590m = new CompoundTrimPathContent();

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, PolystarShape polystarShape) {
        this.f2580c = lottieDrawable;
        this.f2579b = polystarShape.f2068a;
        PolystarShape.a aVar = polystarShape.f2069b;
        this.f2581d = aVar;
        this.f2582e = polystarShape.f2077j;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a = polystarShape.f2070c.mo1339a();
        this.f2583f = baseKeyframeAnimationMo1339a;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationMo1339a2 = polystarShape.f2071d.mo1339a();
        this.f2584g = baseKeyframeAnimationMo1339a2;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a3 = polystarShape.f2072e.mo1339a();
        this.f2585h = baseKeyframeAnimationMo1339a3;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a4 = polystarShape.f2074g.mo1339a();
        this.f2587j = baseKeyframeAnimationMo1339a4;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a5 = polystarShape.f2076i.mo1339a();
        this.f2589l = baseKeyframeAnimationMo1339a5;
        PolystarShape.a aVar2 = PolystarShape.a.STAR;
        if (aVar == aVar2) {
            this.f2586i = polystarShape.f2073f.mo1339a();
            this.f2588k = polystarShape.f2075h.mo1339a();
        } else {
            this.f2586i = null;
            this.f2588k = null;
        }
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a2);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a3);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a4);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a5);
        if (aVar == aVar2) {
            baseLayer2.m1348e(this.f2586i);
            baseLayer2.m1348e(this.f2588k);
        }
        baseKeyframeAnimationMo1339a.f2629a.add(this);
        baseKeyframeAnimationMo1339a2.f2629a.add(this);
        baseKeyframeAnimationMo1339a3.f2629a.add(this);
        baseKeyframeAnimationMo1339a4.f2629a.add(this);
        baseKeyframeAnimationMo1339a5.f2629a.add(this);
        if (aVar == aVar2) {
            this.f2586i.f2629a.add(this);
            this.f2588k.f2629a.add(this);
        }
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2591n = false;
        this.f2580c.invalidateSelf();
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f2625c == ShapeTrimPath.a.SIMULTANEOUSLY) {
                    this.f2590m.f2514a.add(trimPathContent);
                    trimPathContent.f2624b.add(this);
                }
            }
        }
    }

    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: c */
    public void mo1337c(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.m1436f(keyPath, i, list, keyPath2, this);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.PathContent
    /* JADX INFO: renamed from: g */
    public Path mo1493g() {
        float fSin;
        double d;
        float fCos;
        float fM1576a;
        float f;
        float f2;
        if (this.f2591n) {
            return this.f2578a;
        }
        this.f2578a.reset();
        if (this.f2582e) {
            this.f2591n = true;
            return this.f2578a;
        }
        int iOrdinal = this.f2581d.ordinal();
        if (iOrdinal == 0) {
            float fFloatValue = this.f2583f.mo1504e().floatValue();
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f2585h;
            double radians = Math.toRadians((baseKeyframeAnimation != null ? baseKeyframeAnimation.mo1504e().floatValue() : 0.0d) - 90.0d);
            double d2 = fFloatValue;
            float f3 = (float) (6.283185307179586d / d2);
            float f4 = f3 / 2.0f;
            float f5 = fFloatValue - ((int) fFloatValue);
            if (f5 != 0.0f) {
                radians += (double) ((1.0f - f5) * f4);
            }
            float fFloatValue2 = this.f2587j.mo1504e().floatValue();
            float fFloatValue3 = this.f2586i.mo1504e().floatValue();
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f2588k;
            float fFloatValue4 = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.mo1504e().floatValue() / 100.0f : 0.0f;
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f2589l;
            float fFloatValue5 = baseKeyframeAnimation3 != null ? baseKeyframeAnimation3.mo1504e().floatValue() / 100.0f : 0.0f;
            if (f5 != 0.0f) {
                fM1576a = outline.m1576a(fFloatValue2, fFloatValue3, f5, fFloatValue3);
                double d3 = fM1576a;
                fCos = (float) (Math.cos(radians) * d3);
                fSin = (float) (d3 * Math.sin(radians));
                this.f2578a.moveTo(fCos, fSin);
                d = radians + ((double) ((f3 * f5) / 2.0f));
            } else {
                double d4 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d4);
                fSin = (float) (Math.sin(radians) * d4);
                this.f2578a.moveTo(fCos2, fSin);
                d = radians + ((double) f4);
                fCos = fCos2;
                fM1576a = 0.0f;
            }
            double dCeil = Math.ceil(d2) * 2.0d;
            int i = 0;
            boolean z = false;
            while (true) {
                double d5 = i;
                if (d5 >= dCeil) {
                    break;
                }
                float f6 = z ? fFloatValue2 : fFloatValue3;
                float f7 = (fM1576a == 0.0f || d5 != dCeil - 2.0d) ? f4 : (f3 * f5) / 2.0f;
                if (fM1576a == 0.0f || d5 != dCeil - 1.0d) {
                    fM1576a = f6;
                }
                double d6 = fM1576a;
                float fCos3 = (float) (Math.cos(d) * d6);
                float fSin2 = (float) (d6 * Math.sin(d));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.f2578a.lineTo(fCos3, fSin2);
                    f = fSin2;
                    f2 = fFloatValue5;
                } else {
                    float f8 = fSin;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin3 = (float) Math.sin(dAtan2);
                    f = fSin2;
                    f2 = fFloatValue5;
                    double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin4 = (float) Math.sin(dAtan3);
                    float f9 = z ? fFloatValue4 : f2;
                    float f10 = z ? f2 : fFloatValue4;
                    float f11 = (z ? fFloatValue3 : fFloatValue2) * f9 * 0.47829f;
                    float f12 = fCos4 * f11;
                    float f13 = f11 * fSin3;
                    float f14 = (z ? fFloatValue2 : fFloatValue3) * f10 * 0.47829f;
                    float f15 = fCos5 * f14;
                    float f16 = f14 * fSin4;
                    if (f5 != 0.0f) {
                        if (i == 0) {
                            f12 *= f5;
                            f13 *= f5;
                        } else if (d5 == dCeil - 1.0d) {
                            f15 *= f5;
                            f16 *= f5;
                        }
                    }
                    this.f2578a.cubicTo(fCos - f12, f8 - f13, fCos3 + f15, f + f16, fCos3, f);
                }
                d += (double) f7;
                z = !z;
                i++;
                fCos = fCos3;
                fM1576a = fM1576a;
                f3 = f3;
                fSin = f;
                fFloatValue5 = f2;
            }
            PointF pointFMo1504e = this.f2584g.mo1504e();
            this.f2578a.offset(pointFMo1504e.x, pointFMo1504e.y);
            this.f2578a.close();
        } else if (iOrdinal == 1) {
            int iFloor = (int) Math.floor(this.f2583f.mo1504e().floatValue());
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation4 = this.f2585h;
            double radians2 = Math.toRadians((baseKeyframeAnimation4 != null ? baseKeyframeAnimation4.mo1504e().floatValue() : 0.0d) - 90.0d);
            double d7 = iFloor;
            float fFloatValue6 = this.f2589l.mo1504e().floatValue() / 100.0f;
            float fFloatValue7 = this.f2587j.mo1504e().floatValue();
            double d8 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d8);
            float fSin5 = (float) (Math.sin(radians2) * d8);
            this.f2578a.moveTo(fCos6, fSin5);
            double d9 = (float) (6.283185307179586d / d7);
            double d10 = radians2 + d9;
            double dCeil2 = Math.ceil(d7);
            int i2 = 0;
            while (i2 < dCeil2) {
                float fCos7 = (float) (Math.cos(d10) * d8);
                double d11 = dCeil2;
                float fSin6 = (float) (Math.sin(d10) * d8);
                if (fFloatValue6 != 0.0f) {
                    double dAtan4 = (float) (Math.atan2(fSin5, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin7 = (float) Math.sin(dAtan4);
                    double dAtan5 = (float) (Math.atan2(fSin6, fCos7) - 1.5707963267948966d);
                    float f17 = fFloatValue7 * fFloatValue6 * 0.25f;
                    this.f2578a.cubicTo(fCos6 - (fCos8 * f17), fSin5 - (fSin7 * f17), fCos7 + (((float) Math.cos(dAtan5)) * f17), fSin6 + (f17 * ((float) Math.sin(dAtan5))), fCos7, fSin6);
                } else {
                    this.f2578a.lineTo(fCos7, fSin6);
                }
                d10 += d9;
                i2++;
                fSin5 = fSin6;
                fCos6 = fCos7;
                dCeil2 = d11;
                d8 = d8;
                d9 = d9;
            }
            PointF pointFMo1504e2 = this.f2584g.mo1504e();
            this.f2578a.offset(pointFMo1504e2.x, pointFMo1504e2.y);
            this.f2578a.close();
        }
        this.f2578a.close();
        this.f2590m.m1491a(this.f2578a);
        this.f2591n = true;
        return this.f2578a;
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2579b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t == LottieProperty.f2471s) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f2583f;
            LottieValueCallback<Float> lottieValueCallback2 = baseKeyframeAnimation3.f2633e;
            baseKeyframeAnimation3.f2633e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f2472t) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation4 = this.f2585h;
            LottieValueCallback<Float> lottieValueCallback3 = baseKeyframeAnimation4.f2633e;
            baseKeyframeAnimation4.f2633e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f2462j) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.f2584g;
            LottieValueCallback<PointF> lottieValueCallback4 = baseKeyframeAnimation5.f2633e;
            baseKeyframeAnimation5.f2633e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f2473u && (baseKeyframeAnimation2 = this.f2586i) != null) {
            LottieValueCallback<Float> lottieValueCallback5 = baseKeyframeAnimation2.f2633e;
            baseKeyframeAnimation2.f2633e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f2474v) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation6 = this.f2587j;
            LottieValueCallback<Float> lottieValueCallback6 = baseKeyframeAnimation6.f2633e;
            baseKeyframeAnimation6.f2633e = lottieValueCallback;
        } else if (t == LottieProperty.f2475w && (baseKeyframeAnimation = this.f2588k) != null) {
            LottieValueCallback<Float> lottieValueCallback7 = baseKeyframeAnimation.f2633e;
            baseKeyframeAnimation.f2633e = lottieValueCallback;
        } else if (t == LottieProperty.f2476x) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation7 = this.f2589l;
            LottieValueCallback<Float> lottieValueCallback8 = baseKeyframeAnimation7.f2633e;
            baseKeyframeAnimation7.f2633e = lottieValueCallback;
        }
    }
}
