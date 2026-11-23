package p007c.p056c.p057a.p059b0.p062l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.L;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ValueCallbackKeyframeAnimation;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.LongSparseArray;

/* JADX INFO: renamed from: c.c.a.b0.l.c, reason: use source file name */
/* JADX INFO: compiled from: CompositionLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class CompositionLayer extends BaseLayer2 {

    /* JADX INFO: renamed from: A */
    public final RectF f2159A;

    /* JADX INFO: renamed from: B */
    public Paint f2160B;

    /* JADX INFO: renamed from: x */
    public BaseKeyframeAnimation<Float, Float> f2161x;

    /* JADX INFO: renamed from: y */
    public final List<BaseLayer2> f2162y;

    /* JADX INFO: renamed from: z */
    public final RectF f2163z;

    public CompositionLayer(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, LottieComposition lottieComposition) {
        int i;
        BaseLayer2 baseLayer2;
        BaseLayer2 compositionLayer;
        super(lottieDrawable, layer);
        this.f2162y = new ArrayList();
        this.f2163z = new RectF();
        this.f2159A = new RectF();
        this.f2160B = new Paint();
        AnimatableFloatValue animatableFloatValue = layer.f2186s;
        if (animatableFloatValue != null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a = animatableFloatValue.mo1339a();
            this.f2161x = baseKeyframeAnimationMo1339a;
            m1348e(baseKeyframeAnimationMo1339a);
            this.f2161x.f2629a.add(this);
        } else {
            this.f2161x = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.f2351i.size());
        int size = list.size() - 1;
        BaseLayer2 baseLayer3 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            int iOrdinal = layer2.f2172e.ordinal();
            if (iOrdinal == 0) {
                compositionLayer = new CompositionLayer(lottieDrawable, layer2, lottieComposition.f2345c.get(layer2.f2174g), lottieComposition);
            } else if (iOrdinal == 1) {
                compositionLayer = new SolidLayer(lottieDrawable, layer2);
            } else if (iOrdinal == 2) {
                compositionLayer = new ImageLayer(lottieDrawable, layer2);
            } else if (iOrdinal == 3) {
                compositionLayer = new NullLayer(lottieDrawable, layer2);
            } else if (iOrdinal == 4) {
                compositionLayer = new ShapeLayer(lottieDrawable, layer2);
            } else if (iOrdinal != 5) {
                StringBuilder sbM1556G = outline.m1556G("Unknown layer type ");
                sbM1556G.append(layer2.f2172e);
                Logger2.m1420b(sbM1556G.toString());
                compositionLayer = null;
            } else {
                compositionLayer = new TextLayer(lottieDrawable, layer2);
            }
            if (compositionLayer != null) {
                longSparseArray.m15593m(compositionLayer.f2150o.f2171d, compositionLayer);
                if (baseLayer3 != null) {
                    baseLayer3.f2153r = compositionLayer;
                    baseLayer3 = null;
                } else {
                    this.f2162y.add(0, compositionLayer);
                    int iOrdinal2 = layer2.f2188u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        baseLayer3 = compositionLayer;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.m15595o(); i++) {
            BaseLayer2 baseLayer4 = (BaseLayer2) longSparseArray.m15589i(longSparseArray.m15592l(i));
            if (baseLayer4 != null && (baseLayer2 = (BaseLayer2) longSparseArray.m15589i(baseLayer4.f2150o.f2173f)) != null) {
                baseLayer4.f2154s = baseLayer2;
            }
        }
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        super.mo1347d(rectF, matrix, z);
        for (int size = this.f2162y.size() - 1; size >= 0; size--) {
            this.f2163z.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f2162y.get(size).mo1347d(this.f2163z, this.f2148m, true);
            rectF.union(this.f2163z);
        }
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        this.f2157v.m1522c(t, lottieValueCallback);
        if (t == LottieProperty.f2449A) {
            if (lottieValueCallback == null) {
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f2161x;
                if (baseKeyframeAnimation != null) {
                    baseKeyframeAnimation.m1508i(null);
                    return;
                }
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2161x = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f2629a.add(this);
            m1348e(this.f2161x);
        }
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2
    /* JADX INFO: renamed from: k */
    public void mo1352k(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.f2159A;
        Layer layer = this.f2150o;
        rectF.set(0.0f, 0.0f, layer.f2182o, layer.f2183p);
        matrix.mapRect(this.f2159A);
        boolean z = this.f2149n.f2414y && this.f2162y.size() > 1 && i != 255;
        if (z) {
            this.f2160B.setAlpha(i);
            Utils.m1442f(canvas, this.f2159A, this.f2160B, 31);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f2162y.size() - 1; size >= 0; size--) {
            if (!this.f2159A.isEmpty() ? canvas.clipRect(this.f2159A) : true) {
                this.f2162y.get(size).mo1349f(canvas, matrix, i);
            }
        }
        canvas.restore();
        L.m1365a("CompositionLayer#draw");
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2
    /* JADX INFO: renamed from: o */
    public void mo1356o(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        for (int i2 = 0; i2 < this.f2162y.size(); i2++) {
            this.f2162y.get(i2).mo1337c(keyPath, i, list, keyPath2);
        }
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2
    /* JADX INFO: renamed from: p */
    public void mo1357p(float f) {
        super.mo1357p(f);
        if (this.f2161x != null) {
            f = ((this.f2161x.mo1504e().floatValue() * this.f2150o.f2169b.f2355m) - this.f2150o.f2169b.f2353k) / (this.f2149n.f2396g.m1445c() + 0.01f);
        }
        if (this.f2161x == null) {
            Layer layer = this.f2150o;
            f -= layer.f2181n / layer.f2169b.m1445c();
        }
        float f2 = this.f2150o.f2180m;
        if (f2 != 0.0f) {
            f /= f2;
        }
        int size = this.f2162y.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f2162y.get(size).mo1357p(f);
            }
        }
    }
}
