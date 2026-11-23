package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.L;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p061k.ShapeTrimPath;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.LPaint;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.FloatKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.IntegerKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ValueCallbackKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.a, reason: use source file name */
/* JADX INFO: compiled from: BaseStrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.b, KeyPathElementContent, DrawingContent {

    /* JADX INFO: renamed from: e */
    public final LottieDrawable f2502e;

    /* JADX INFO: renamed from: f */
    public final BaseLayer2 f2503f;

    /* JADX INFO: renamed from: h */
    public final float[] f2505h;

    /* JADX INFO: renamed from: i */
    public final Paint f2506i;

    /* JADX INFO: renamed from: j */
    public final BaseKeyframeAnimation<?, Float> f2507j;

    /* JADX INFO: renamed from: k */
    public final BaseKeyframeAnimation<?, Integer> f2508k;

    /* JADX INFO: renamed from: l */
    public final List<BaseKeyframeAnimation<?, Float>> f2509l;

    /* JADX INFO: renamed from: m */
    public final BaseKeyframeAnimation<?, Float> f2510m;

    /* JADX INFO: renamed from: n */
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f2511n;

    /* JADX INFO: renamed from: a */
    public final PathMeasure f2498a = new PathMeasure();

    /* JADX INFO: renamed from: b */
    public final Path f2499b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f2500c = new Path();

    /* JADX INFO: renamed from: d */
    public final RectF f2501d = new RectF();

    /* JADX INFO: renamed from: g */
    public final List<b> f2504g = new ArrayList();

    /* JADX INFO: renamed from: c.c.a.z.b.a$b */
    /* JADX INFO: compiled from: BaseStrokeContent.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<PathContent> f2512a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final TrimPathContent f2513b;

        public b(TrimPathContent trimPathContent, a aVar) {
            this.f2513b = trimPathContent;
        }
    }

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, Paint.Cap cap, Paint.Join join, float f, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.f2506i = lPaint;
        this.f2502e = lottieDrawable;
        this.f2503f = baseLayer2;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f);
        this.f2508k = animatableIntegerValue.mo1339a();
        this.f2507j = animatableFloatValue.mo1339a();
        if (animatableFloatValue2 == null) {
            this.f2510m = null;
        } else {
            this.f2510m = animatableFloatValue2.mo1339a();
        }
        this.f2509l = new ArrayList(list.size());
        this.f2505h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f2509l.add(list.get(i).mo1339a());
        }
        baseLayer2.m1348e(this.f2508k);
        baseLayer2.m1348e(this.f2507j);
        for (int i2 = 0; i2 < this.f2509l.size(); i2++) {
            baseLayer2.m1348e(this.f2509l.get(i2));
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f2510m;
        if (baseKeyframeAnimation != null) {
            baseLayer2.m1348e(baseKeyframeAnimation);
        }
        this.f2508k.f2629a.add(this);
        this.f2507j.f2629a.add(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f2509l.get(i3).f2629a.add(this);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f2510m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.f2629a.add(this);
        }
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2502e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065 A[SYNTHETIC] */
    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        ShapeTrimPath.a aVar = ShapeTrimPath.a.INDIVIDUALLY;
        TrimPathContent trimPathContent = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent2 = (TrimPathContent) content;
                if (trimPathContent2.f2625c == aVar) {
                    trimPathContent = trimPathContent2;
                }
            }
        }
        if (trimPathContent != null) {
            trimPathContent.f2624b.add(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            Content content2 = list2.get(size2);
            if (content2 instanceof TrimPathContent) {
                TrimPathContent trimPathContent3 = (TrimPathContent) content2;
                if (trimPathContent3.f2625c == aVar) {
                    if (bVar != null) {
                        this.f2504g.add(bVar);
                    }
                    bVar = new b(trimPathContent3, null);
                    trimPathContent3.f2624b.add(this);
                } else if (!(content2 instanceof PathContent)) {
                    if (bVar == null) {
                        bVar = new b(trimPathContent, null);
                    }
                    bVar.f2512a.add((PathContent) content2);
                }
            } else if (!(content2 instanceof PathContent)) {
                if (bVar == null) {
                    bVar = new b(trimPathContent, null);
                }
                bVar.f2512a.add((PathContent) content2);
            }
        }
        if (bVar != null) {
            this.f2504g.add(bVar);
        }
    }

    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: c */
    public void mo1337c(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.m1436f(keyPath, i, list, keyPath2, this);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        this.f2499b.reset();
        for (int i = 0; i < this.f2504g.size(); i++) {
            b bVar = this.f2504g.get(i);
            for (int i2 = 0; i2 < bVar.f2512a.size(); i2++) {
                this.f2499b.addPath(bVar.f2512a.get(i2).mo1493g(), matrix);
            }
        }
        this.f2499b.computeBounds(this.f2501d, false);
        float fM1516j = ((FloatKeyframeAnimation) this.f2507j).m1516j();
        RectF rectF2 = this.f2501d;
        float f = fM1516j / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f2501d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        L.m1365a("StrokeContent#getBounds");
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0205  */
    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: f */
    public void mo1349f(Canvas canvas, Matrix matrix, int i) {
        float f;
        float[] fArr = Utils.f2340d.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            L.m1365a("StrokeContent#draw");
            return;
        }
        IntegerKeyframeAnimation integerKeyframeAnimation = (IntegerKeyframeAnimation) this.f2508k;
        float fM1518j = (i / 255.0f) * integerKeyframeAnimation.m1518j(integerKeyframeAnimation.m1500a(), integerKeyframeAnimation.m1502c());
        float f2 = 100.0f;
        this.f2506i.setAlpha(MiscUtils.m1433c((int) ((fM1518j / 100.0f) * 255.0f), 0, 255));
        this.f2506i.setStrokeWidth(Utils.m1440d(matrix) * ((FloatKeyframeAnimation) this.f2507j).m1516j());
        if (this.f2506i.getStrokeWidth() <= 0.0f) {
            L.m1365a("StrokeContent#draw");
            return;
        }
        float f3 = 1.0f;
        if (this.f2509l.isEmpty()) {
            L.m1365a("StrokeContent#applyDashPattern");
        } else {
            float fM1440d = Utils.m1440d(matrix);
            for (int i2 = 0; i2 < this.f2509l.size(); i2++) {
                this.f2505h[i2] = this.f2509l.get(i2).mo1504e().floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr2 = this.f2505h;
                    if (fArr2[i2] < 1.0f) {
                        fArr2[i2] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f2505h;
                    if (fArr3[i2] < 0.1f) {
                        fArr3[i2] = 0.1f;
                    }
                }
                float[] fArr4 = this.f2505h;
                fArr4[i2] = fArr4[i2] * fM1440d;
            }
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f2510m;
            this.f2506i.setPathEffect(new DashPathEffect(this.f2505h, baseKeyframeAnimation == null ? 0.0f : baseKeyframeAnimation.mo1504e().floatValue() * fM1440d));
            L.m1365a("StrokeContent#applyDashPattern");
        }
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation2 = this.f2511n;
        if (baseKeyframeAnimation2 != null) {
            this.f2506i.setColorFilter(baseKeyframeAnimation2.mo1504e());
        }
        int i3 = 0;
        while (i3 < this.f2504g.size()) {
            b bVar = this.f2504g.get(i3);
            TrimPathContent trimPathContent = bVar.f2513b;
            if (trimPathContent == null) {
                this.f2499b.reset();
                for (int size = bVar.f2512a.size() - 1; size >= 0; size--) {
                    this.f2499b.addPath(bVar.f2512a.get(size).mo1493g(), matrix);
                }
                L.m1365a("StrokeContent#buildPath");
                canvas.drawPath(this.f2499b, this.f2506i);
                L.m1365a("StrokeContent#drawPath");
            } else if (trimPathContent == null) {
                L.m1365a("StrokeContent#applyTrimPath");
            } else {
                this.f2499b.reset();
                int size2 = bVar.f2512a.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else {
                        this.f2499b.addPath(bVar.f2512a.get(size2).mo1493g(), matrix);
                    }
                }
                this.f2498a.setPath(this.f2499b, z);
                float length = this.f2498a.getLength();
                while (this.f2498a.nextContour()) {
                    length += this.f2498a.getLength();
                }
                float fFloatValue = (bVar.f2513b.f2628f.mo1504e().floatValue() * length) / 360.0f;
                float fFloatValue2 = ((bVar.f2513b.f2626d.mo1504e().floatValue() * length) / f2) + fFloatValue;
                float fFloatValue3 = ((bVar.f2513b.f2627e.mo1504e().floatValue() * length) / f2) + fFloatValue;
                int size3 = bVar.f2512a.size() - 1;
                float f4 = 0.0f;
                while (size3 >= 0) {
                    this.f2500c.set(bVar.f2512a.get(size3).mo1493g());
                    this.f2500c.transform(matrix);
                    this.f2498a.setPath(this.f2500c, z);
                    float length2 = this.f2498a.getLength();
                    if (fFloatValue3 > length) {
                        float f5 = fFloatValue3 - length;
                        if (f5 >= f4 + length2 || f4 >= f5) {
                            f = f4 + length2;
                            if (f < fFloatValue2 && f4 <= fFloatValue3) {
                                if (f > fFloatValue3 || fFloatValue2 >= f4) {
                                    Utils.m1437a(this.f2500c, fFloatValue2 < f4 ? 0.0f : (fFloatValue2 - f4) / length2, fFloatValue3 > f ? 1.0f : (fFloatValue3 - f4) / length2, 0.0f);
                                    canvas.drawPath(this.f2500c, this.f2506i);
                                } else {
                                    canvas.drawPath(this.f2500c, this.f2506i);
                                }
                            }
                        } else {
                            Utils.m1437a(this.f2500c, fFloatValue2 > length ? (fFloatValue2 - length) / length2 : 0.0f, Math.min(f5 / length2, f3), 0.0f);
                            canvas.drawPath(this.f2500c, this.f2506i);
                        }
                    } else {
                        f = f4 + length2;
                        if (f < fFloatValue2) {
                        }
                    }
                    f4 += length2;
                    size3--;
                    z = false;
                    f3 = 1.0f;
                }
                L.m1365a("StrokeContent#applyTrimPath");
            }
            i3++;
            z = false;
            f2 = 100.0f;
            f3 = 1.0f;
        }
        L.m1365a("StrokeContent#draw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.f2456d) {
            BaseKeyframeAnimation<?, Integer> baseKeyframeAnimation = this.f2508k;
            LottieValueCallback<Integer> lottieValueCallback2 = baseKeyframeAnimation.f2633e;
            baseKeyframeAnimation.f2633e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f2467o) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f2507j;
            LottieValueCallback<Float> lottieValueCallback3 = baseKeyframeAnimation2.f2633e;
            baseKeyframeAnimation2.f2633e = lottieValueCallback;
        } else if (t == LottieProperty.f2451C) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation3 = this.f2511n;
            if (baseKeyframeAnimation3 != null) {
                this.f2503f.f2156u.remove(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == 0) {
                this.f2511n = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2511n = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f2629a.add(this);
            this.f2503f.m1348e(this.f2511n);
        }
    }
}
