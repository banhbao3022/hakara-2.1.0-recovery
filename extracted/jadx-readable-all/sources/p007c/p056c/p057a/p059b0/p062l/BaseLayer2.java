package p007c.p056c.p057a.p059b0.p062l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p056c.p057a.L;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.PerformanceTracker;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.KeyPathElement;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p061k.Mask;
import p007c.p056c.p057a.p059b0.p061k.ShapeData;
import p007c.p056c.p057a.p066e0.MeanCalculator;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p067f0.ScaleXY;
import p007c.p056c.p057a.p068z.LPaint;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.DrawingContent;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.FloatKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.MaskKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.TransformKeyframeAnimation;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.l.b, reason: use source file name */
/* JADX INFO: compiled from: BaseLayer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLayer2 implements DrawingContent, BaseKeyframeAnimation.b, KeyPathElement {

    /* JADX INFO: renamed from: a */
    public final Path f2136a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f2137b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final Paint f2138c = new LPaint(1);

    /* JADX INFO: renamed from: d */
    public final Paint f2139d = new LPaint(1, PorterDuff.Mode.DST_IN);

    /* JADX INFO: renamed from: e */
    public final Paint f2140e = new LPaint(1, PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: f */
    public final Paint f2141f;

    /* JADX INFO: renamed from: g */
    public final Paint f2142g;

    /* JADX INFO: renamed from: h */
    public final RectF f2143h;

    /* JADX INFO: renamed from: i */
    public final RectF f2144i;

    /* JADX INFO: renamed from: j */
    public final RectF f2145j;

    /* JADX INFO: renamed from: k */
    public final RectF f2146k;

    /* JADX INFO: renamed from: l */
    public final String f2147l;

    /* JADX INFO: renamed from: m */
    public final Matrix f2148m;

    /* JADX INFO: renamed from: n */
    public final LottieDrawable f2149n;

    /* JADX INFO: renamed from: o */
    public final Layer f2150o;

    /* JADX INFO: renamed from: p */
    public MaskKeyframeAnimation f2151p;

    /* JADX INFO: renamed from: q */
    public FloatKeyframeAnimation f2152q;

    /* JADX INFO: renamed from: r */
    public BaseLayer2 f2153r;

    /* JADX INFO: renamed from: s */
    public BaseLayer2 f2154s;

    /* JADX INFO: renamed from: t */
    public List<BaseLayer2> f2155t;

    /* JADX INFO: renamed from: u */
    public final List<BaseKeyframeAnimation<?, ?>> f2156u;

    /* JADX INFO: renamed from: v */
    public final TransformKeyframeAnimation f2157v;

    /* JADX INFO: renamed from: w */
    public boolean f2158w;

    public BaseLayer2(LottieDrawable lottieDrawable, Layer layer) {
        LPaint lPaint = new LPaint(1);
        this.f2141f = lPaint;
        this.f2142g = new LPaint(PorterDuff.Mode.CLEAR);
        this.f2143h = new RectF();
        this.f2144i = new RectF();
        this.f2145j = new RectF();
        this.f2146k = new RectF();
        this.f2148m = new Matrix();
        this.f2156u = new ArrayList();
        this.f2158w = true;
        this.f2149n = lottieDrawable;
        this.f2150o = layer;
        this.f2147l = outline.m1550A(new StringBuilder(), layer.f2170c, "#draw");
        if (layer.f2188u == Layer.b.INVERT) {
            lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        AnimatableTransform animatableTransform = layer.f2176i;
        Objects.requireNonNull(animatableTransform);
        TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
        this.f2157v = transformKeyframeAnimation;
        transformKeyframeAnimation.m1521b(this);
        List<Mask> list = layer.f2175h;
        if (list != null && !list.isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(layer.f2175h);
            this.f2151p = maskKeyframeAnimation;
            Iterator<BaseKeyframeAnimation<ShapeData, Path>> it = maskKeyframeAnimation.f2644a.iterator();
            while (it.hasNext()) {
                it.next().f2629a.add(this);
            }
            for (BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation : this.f2151p.f2645b) {
                m1348e(baseKeyframeAnimation);
                baseKeyframeAnimation.f2629a.add(this);
            }
        }
        if (this.f2150o.f2187t.isEmpty()) {
            m1358q(true);
            return;
        }
        FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(this.f2150o.f2187t);
        this.f2152q = floatKeyframeAnimation;
        floatKeyframeAnimation.f2630b = true;
        floatKeyframeAnimation.f2629a.add(new BaseLayer(this));
        m1358q(this.f2152q.mo1504e().floatValue() == 1.0f);
        m1348e(this.f2152q);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2149n.invalidateSelf();
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
    }

    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: c */
    public void mo1337c(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        if (keyPath.m1334e(this.f2150o.f2170c, i)) {
            if (!"__container".equals(this.f2150o.f2170c)) {
                keyPath2 = keyPath2.m1330a(this.f2150o.f2170c);
                if (keyPath.m1332c(this.f2150o.f2170c, i)) {
                    list.add(keyPath2.m1336g(this));
                }
            }
            if (keyPath.m1335f(this.f2150o.f2170c, i)) {
                mo1356o(keyPath, keyPath.m1333d(this.f2150o.f2170c, i) + i, list, keyPath2);
            }
        }
    }

    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        this.f2143h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m1350i();
        this.f2148m.set(matrix);
        if (z) {
            List<BaseLayer2> list = this.f2155t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2148m.preConcat(this.f2155t.get(size).f2157v.m1524e());
                }
            } else {
                BaseLayer2 baseLayer2 = this.f2154s;
                if (baseLayer2 != null) {
                    this.f2148m.preConcat(baseLayer2.f2157v.m1524e());
                }
            }
        }
        this.f2148m.preConcat(this.f2157v.m1524e());
    }

    /* JADX INFO: renamed from: e */
    public void m1348e(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.f2156u.add(baseKeyframeAnimation);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x012e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0136  */
    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: f */
    public void mo1349f(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        String str = this.f2147l;
        if (!this.f2158w || this.f2150o.f2189v) {
            L.m1365a(str);
            return;
        }
        m1350i();
        this.f2137b.reset();
        this.f2137b.set(matrix);
        int i2 = 1;
        for (int size = this.f2155t.size() - 1; size >= 0; size--) {
            this.f2137b.preConcat(this.f2155t.get(size).f2157v.m1524e());
        }
        L.m1365a("Layer#parentMatrix");
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f2157v.f2669j;
        int iIntValue = (int) ((((i / 255.0f) * (baseKeyframeAnimation == null ? 100 : baseKeyframeAnimation.mo1504e().intValue())) / 100.0f) * 255.0f);
        float f = 0.0f;
        if (!m1354m() && !m1353l()) {
            this.f2137b.preConcat(this.f2157v.m1524e());
            mo1352k(canvas, this.f2137b, iIntValue);
            L.m1365a("Layer#drawLayer");
            L.m1365a(this.f2147l);
            m1355n(0.0f);
            return;
        }
        boolean z2 = false;
        mo1347d(this.f2143h, this.f2137b, false);
        RectF rectF = this.f2143h;
        if (m1354m() && this.f2150o.f2188u != Layer.b.INVERT) {
            this.f2145j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f2153r.mo1347d(this.f2145j, matrix, true);
            if (!rectF.intersect(this.f2145j)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        this.f2137b.preConcat(this.f2157v.m1524e());
        RectF rectF2 = this.f2143h;
        Matrix matrix2 = this.f2137b;
        this.f2144i.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i3 = 3;
        int i4 = 2;
        if (m1353l()) {
            int size2 = this.f2151p.f2646c.size();
            int i5 = 0;
            while (true) {
                if (i5 < size2) {
                    Mask mask = this.f2151p.f2646c.get(i5);
                    this.f2136a.set(this.f2151p.f2644a.get(i5).mo1504e());
                    this.f2136a.transform(matrix2);
                    int iOrdinal = mask.f2050a.ordinal();
                    if (iOrdinal == 0) {
                        if (mask.f2053d) {
                        }
                        this.f2136a.computeBounds(this.f2146k, z2);
                        if (i5 == 0) {
                            this.f2144i.set(this.f2146k);
                        } else {
                            RectF rectF3 = this.f2144i;
                            rectF3.set(Math.min(rectF3.left, this.f2146k.left), Math.min(this.f2144i.top, this.f2146k.top), Math.max(this.f2144i.right, this.f2146k.right), Math.max(this.f2144i.bottom, this.f2146k.bottom));
                        }
                        i5++;
                        z2 = false;
                        i3 = 3;
                        i4 = 2;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != i4) {
                            if (iOrdinal == i3) {
                            }
                            this.f2136a.computeBounds(this.f2146k, z2);
                            if (i5 == 0) {
                                this.f2144i.set(this.f2146k);
                            } else {
                                RectF rectF4 = this.f2144i;
                                rectF4.set(Math.min(rectF4.left, this.f2146k.left), Math.min(this.f2144i.top, this.f2146k.top), Math.max(this.f2144i.right, this.f2146k.right), Math.max(this.f2144i.bottom, this.f2146k.bottom));
                            }
                            i5++;
                            z2 = false;
                            i3 = 3;
                            i4 = 2;
                        } else {
                            if (mask.f2053d) {
                            }
                            this.f2136a.computeBounds(this.f2146k, z2);
                            if (i5 == 0) {
                                this.f2144i.set(this.f2146k);
                            } else {
                                RectF rectF5 = this.f2144i;
                                rectF5.set(Math.min(rectF5.left, this.f2146k.left), Math.min(this.f2144i.top, this.f2146k.top), Math.max(this.f2144i.right, this.f2146k.right), Math.max(this.f2144i.bottom, this.f2146k.bottom));
                            }
                            i5++;
                            z2 = false;
                            i3 = 3;
                            i4 = 2;
                        }
                    }
                } else if (!rectF2.intersect(this.f2144i)) {
                    f = 0.0f;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                }
                f = 0.0f;
                break;
            }
        }
        if (!this.f2143h.intersect(f, f, canvas.getWidth(), canvas.getHeight())) {
            this.f2143h.set(f, f, f, f);
        }
        L.m1365a("Layer#computeBounds");
        if (!this.f2143h.isEmpty()) {
            this.f2138c.setAlpha(255);
            Utils.m1442f(canvas, this.f2143h, this.f2138c, 31);
            L.m1365a("Layer#saveLayer");
            m1351j(canvas);
            mo1352k(canvas, this.f2137b, iIntValue);
            L.m1365a("Layer#drawLayer");
            if (m1353l()) {
                Matrix matrix3 = this.f2137b;
                Utils.m1442f(canvas, this.f2143h, this.f2139d, 19);
                if (Build.VERSION.SDK_INT < 28) {
                    m1351j(canvas);
                }
                L.m1365a("Layer#saveLayer");
                int i6 = 0;
                while (i6 < this.f2151p.f2646c.size()) {
                    Mask mask2 = this.f2151p.f2646c.get(i6);
                    BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation2 = this.f2151p.f2644a.get(i6);
                    BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation3 = this.f2151p.f2645b.get(i6);
                    int iOrdinal2 = mask2.f2050a.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == i2) {
                            if (i6 == 0) {
                                this.f2138c.setColor(-16777216);
                                this.f2138c.setAlpha(255);
                                canvas.drawRect(this.f2143h, this.f2138c);
                            }
                            if (mask2.f2053d) {
                                Utils.m1442f(canvas, this.f2143h, this.f2140e, 31);
                                canvas.drawRect(this.f2143h, this.f2138c);
                                this.f2140e.setAlpha((int) (baseKeyframeAnimation3.mo1504e().intValue() * 2.55f));
                                this.f2136a.set(baseKeyframeAnimation2.mo1504e());
                                this.f2136a.transform(matrix3);
                                canvas.drawPath(this.f2136a, this.f2140e);
                                canvas.restore();
                            } else {
                                this.f2136a.set(baseKeyframeAnimation2.mo1504e());
                                this.f2136a.transform(matrix3);
                                canvas.drawPath(this.f2136a, this.f2140e);
                            }
                        } else if (iOrdinal2 != 2) {
                            if (iOrdinal2 == 3) {
                                if (this.f2151p.f2644a.isEmpty()) {
                                    z = false;
                                    break;
                                }
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= this.f2151p.f2646c.size()) {
                                        z = true;
                                        break;
                                    } else {
                                        if (this.f2151p.f2646c.get(i7).f2050a != Mask.a.MASK_MODE_NONE) {
                                            z = false;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                                if (z) {
                                    this.f2138c.setAlpha(255);
                                    canvas.drawRect(this.f2143h, this.f2138c);
                                }
                            }
                        } else if (mask2.f2053d) {
                            Utils.m1442f(canvas, this.f2143h, this.f2139d, 31);
                            canvas.drawRect(this.f2143h, this.f2138c);
                            this.f2140e.setAlpha((int) (baseKeyframeAnimation3.mo1504e().intValue() * 2.55f));
                            this.f2136a.set(baseKeyframeAnimation2.mo1504e());
                            this.f2136a.transform(matrix3);
                            canvas.drawPath(this.f2136a, this.f2140e);
                            canvas.restore();
                        } else {
                            Utils.m1442f(canvas, this.f2143h, this.f2139d, 31);
                            this.f2136a.set(baseKeyframeAnimation2.mo1504e());
                            this.f2136a.transform(matrix3);
                            this.f2138c.setAlpha((int) (baseKeyframeAnimation3.mo1504e().intValue() * 2.55f));
                            canvas.drawPath(this.f2136a, this.f2138c);
                            canvas.restore();
                        }
                    } else if (mask2.f2053d) {
                        Utils.m1442f(canvas, this.f2143h, this.f2138c, 31);
                        canvas.drawRect(this.f2143h, this.f2138c);
                        this.f2136a.set(baseKeyframeAnimation2.mo1504e());
                        this.f2136a.transform(matrix3);
                        this.f2138c.setAlpha((int) (baseKeyframeAnimation3.mo1504e().intValue() * 2.55f));
                        canvas.drawPath(this.f2136a, this.f2140e);
                        canvas.restore();
                    } else {
                        this.f2136a.set(baseKeyframeAnimation2.mo1504e());
                        this.f2136a.transform(matrix3);
                        this.f2138c.setAlpha((int) (baseKeyframeAnimation3.mo1504e().intValue() * 2.55f));
                        canvas.drawPath(this.f2136a, this.f2138c);
                    }
                    i6++;
                    i2 = 1;
                }
                canvas.restore();
                L.m1365a("Layer#restoreLayer");
            }
            if (m1354m()) {
                Utils.m1442f(canvas, this.f2143h, this.f2141f, 19);
                L.m1365a("Layer#saveLayer");
                m1351j(canvas);
                this.f2153r.mo1349f(canvas, matrix, iIntValue);
                canvas.restore();
                L.m1365a("Layer#restoreLayer");
                L.m1365a("Layer#drawMatte");
            }
            canvas.restore();
            L.m1365a("Layer#restoreLayer");
        }
        L.m1365a(this.f2147l);
        m1355n(0.0f);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2150o.f2170c;
    }

    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        this.f2157v.m1522c(t, lottieValueCallback);
    }

    /* JADX INFO: renamed from: i */
    public final void m1350i() {
        if (this.f2155t != null) {
            return;
        }
        if (this.f2154s == null) {
            this.f2155t = Collections.emptyList();
            return;
        }
        this.f2155t = new ArrayList();
        for (BaseLayer2 baseLayer2 = this.f2154s; baseLayer2 != null; baseLayer2 = baseLayer2.f2154s) {
            this.f2155t.add(baseLayer2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1351j(Canvas canvas) {
        RectF rectF = this.f2143h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f2142g);
        L.m1365a("Layer#clearLayer");
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo1352k(Canvas canvas, Matrix matrix, int i);

    /* JADX INFO: renamed from: l */
    public boolean m1353l() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.f2151p;
        return (maskKeyframeAnimation == null || maskKeyframeAnimation.f2644a.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m1354m() {
        return this.f2153r != null;
    }

    /* JADX INFO: renamed from: n */
    public final void m1355n(float f) {
        PerformanceTracker performanceTracker = this.f2149n.f2396g.f2343a;
        String str = this.f2150o.f2170c;
        if (performanceTracker.f2488a) {
            MeanCalculator meanCalculator = performanceTracker.f2490c.get(str);
            if (meanCalculator == null) {
                meanCalculator = new MeanCalculator();
                performanceTracker.f2490c.put(str, meanCalculator);
            }
            float f2 = meanCalculator.f2334a + f;
            meanCalculator.f2334a = f2;
            int i = meanCalculator.f2335b + 1;
            meanCalculator.f2335b = i;
            if (i == Integer.MAX_VALUE) {
                meanCalculator.f2334a = f2 / 2.0f;
                meanCalculator.f2335b = i / 2;
            }
            if (str.equals("__container")) {
                Iterator<PerformanceTracker.a> it = performanceTracker.f2489b.iterator();
                while (it.hasNext()) {
                    it.next().m1490a(f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo1356o(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
    }

    /* JADX INFO: renamed from: p */
    public void mo1357p(float f) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f2157v;
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = transformKeyframeAnimation.f2669j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.mo1507h(f);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = transformKeyframeAnimation.f2672m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.mo1507h(f);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = transformKeyframeAnimation.f2673n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.mo1507h(f);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = transformKeyframeAnimation.f2665f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.mo1507h(f);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = transformKeyframeAnimation.f2666g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.mo1507h(f);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation6 = transformKeyframeAnimation.f2667h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.mo1507h(f);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = transformKeyframeAnimation.f2668i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.mo1507h(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = transformKeyframeAnimation.f2670k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.mo1507h(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = transformKeyframeAnimation.f2671l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.mo1507h(f);
        }
        if (this.f2151p != null) {
            for (int i = 0; i < this.f2151p.f2644a.size(); i++) {
                this.f2151p.f2644a.get(i).mo1507h(f);
            }
        }
        float f2 = this.f2150o.f2180m;
        if (f2 != 0.0f) {
            f /= f2;
        }
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.f2152q;
        if (floatKeyframeAnimation3 != null) {
            floatKeyframeAnimation3.mo1507h(f / f2);
        }
        BaseLayer2 baseLayer2 = this.f2153r;
        if (baseLayer2 != null) {
            baseLayer2.mo1357p(baseLayer2.f2150o.f2180m * f);
        }
        for (int i2 = 0; i2 < this.f2156u.size(); i2++) {
            this.f2156u.get(i2).mo1507h(f);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1358q(boolean z) {
        if (z != this.f2158w) {
            this.f2158w = z;
            this.f2149n.invalidateSelf();
        }
    }
}
