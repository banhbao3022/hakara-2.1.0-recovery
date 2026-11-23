package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.p061k.ShapeStroke;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ColorKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ValueCallbackKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.r, reason: use source file name */
/* JADX INFO: compiled from: StrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class StrokeContent extends BaseStrokeContent {

    /* JADX INFO: renamed from: o */
    public final BaseLayer2 f2618o;

    /* JADX INFO: renamed from: p */
    public final String f2619p;

    /* JADX INFO: renamed from: q */
    public final boolean f2620q;

    /* JADX INFO: renamed from: r */
    public final BaseKeyframeAnimation<Integer, Integer> f2621r;

    /* JADX INFO: renamed from: s */
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f2622s;

    public StrokeContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, ShapeStroke shapeStroke) {
        super(lottieDrawable, baseLayer2, shapeStroke.f2114g.m1343f(), shapeStroke.f2115h.m1344f(), shapeStroke.f2116i, shapeStroke.f2112e, shapeStroke.f2113f, shapeStroke.f2110c, shapeStroke.f2109b);
        this.f2618o = baseLayer2;
        this.f2619p = shapeStroke.f2108a;
        this.f2620q = shapeStroke.f2117j;
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationMo1339a = shapeStroke.f2111d.mo1339a();
        this.f2621r = baseKeyframeAnimationMo1339a;
        baseKeyframeAnimationMo1339a.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.BaseStrokeContent, p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: f */
    public void mo1349f(Canvas canvas, Matrix matrix, int i) {
        if (this.f2620q) {
            return;
        }
        Paint paint = this.f2506i;
        ColorKeyframeAnimation colorKeyframeAnimation = (ColorKeyframeAnimation) this.f2621r;
        paint.setColor(colorKeyframeAnimation.m1515j(colorKeyframeAnimation.m1500a(), colorKeyframeAnimation.m1502c()));
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f2622s;
        if (baseKeyframeAnimation != null) {
            this.f2506i.setColorFilter(baseKeyframeAnimation.mo1504e());
        }
        super.mo1349f(canvas, matrix, i);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2619p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p068z.p069b.BaseStrokeContent, p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        super.mo1338h(t, lottieValueCallback);
        if (t == LottieProperty.f2454b) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f2621r;
            LottieValueCallback<Integer> lottieValueCallback2 = baseKeyframeAnimation.f2633e;
            baseKeyframeAnimation.f2633e = lottieValueCallback;
        } else if (t == LottieProperty.f2451C) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation2 = this.f2622s;
            if (baseKeyframeAnimation2 != null) {
                this.f2618o.f2156u.remove(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == 0) {
                this.f2622s = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2622s = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f2629a.add(this);
            this.f2618o.m1348e(this.f2621r);
        }
    }
}
