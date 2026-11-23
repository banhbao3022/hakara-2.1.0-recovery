package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.p061k.RectangleShape;
import p007c.p056c.p057a.p059b0.p061k.ShapeTrimPath;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.FloatKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.o, reason: use source file name */
/* JADX INFO: compiled from: RectangleContent.java */
/* JADX INFO: loaded from: classes.dex */
public class RectangleContent implements BaseKeyframeAnimation.b, KeyPathElementContent, PathContent {

    /* JADX INFO: renamed from: c */
    public final String f2594c;

    /* JADX INFO: renamed from: d */
    public final boolean f2595d;

    /* JADX INFO: renamed from: e */
    public final LottieDrawable f2596e;

    /* JADX INFO: renamed from: f */
    public final BaseKeyframeAnimation<?, PointF> f2597f;

    /* JADX INFO: renamed from: g */
    public final BaseKeyframeAnimation<?, PointF> f2598g;

    /* JADX INFO: renamed from: h */
    public final BaseKeyframeAnimation<?, Float> f2599h;

    /* JADX INFO: renamed from: j */
    public boolean f2601j;

    /* JADX INFO: renamed from: a */
    public final Path f2592a = new Path();

    /* JADX INFO: renamed from: b */
    public final RectF f2593b = new RectF();

    /* JADX INFO: renamed from: i */
    public CompoundTrimPathContent f2600i = new CompoundTrimPathContent();

    public RectangleContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, RectangleShape rectangleShape) {
        this.f2594c = rectangleShape.f2082a;
        this.f2595d = rectangleShape.f2086e;
        this.f2596e = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationMo1339a = rectangleShape.f2083b.mo1339a();
        this.f2597f = baseKeyframeAnimationMo1339a;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationMo1339a2 = rectangleShape.f2084c.mo1339a();
        this.f2598g = baseKeyframeAnimationMo1339a2;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a3 = rectangleShape.f2085d.mo1339a();
        this.f2599h = baseKeyframeAnimationMo1339a3;
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a2);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a3);
        baseKeyframeAnimationMo1339a.f2629a.add(this);
        baseKeyframeAnimationMo1339a2.f2629a.add(this);
        baseKeyframeAnimationMo1339a3.f2629a.add(this);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2601j = false;
        this.f2596e.invalidateSelf();
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f2625c == ShapeTrimPath.a.SIMULTANEOUSLY) {
                    this.f2600i.f2514a.add(trimPathContent);
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
        if (this.f2601j) {
            return this.f2592a;
        }
        this.f2592a.reset();
        if (this.f2595d) {
            this.f2601j = true;
            return this.f2592a;
        }
        PointF pointFMo1504e = this.f2598g.mo1504e();
        float f = pointFMo1504e.x / 2.0f;
        float f2 = pointFMo1504e.y / 2.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f2599h;
        float fM1516j = baseKeyframeAnimation == null ? 0.0f : ((FloatKeyframeAnimation) baseKeyframeAnimation).m1516j();
        float fMin = Math.min(f, f2);
        if (fM1516j > fMin) {
            fM1516j = fMin;
        }
        PointF pointFMo1504e2 = this.f2597f.mo1504e();
        this.f2592a.moveTo(pointFMo1504e2.x + f, (pointFMo1504e2.y - f2) + fM1516j);
        this.f2592a.lineTo(pointFMo1504e2.x + f, (pointFMo1504e2.y + f2) - fM1516j);
        if (fM1516j > 0.0f) {
            RectF rectF = this.f2593b;
            float f3 = pointFMo1504e2.x;
            float f4 = fM1516j * 2.0f;
            float f5 = pointFMo1504e2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f2592a.arcTo(this.f2593b, 0.0f, 90.0f, false);
        }
        this.f2592a.lineTo((pointFMo1504e2.x - f) + fM1516j, pointFMo1504e2.y + f2);
        if (fM1516j > 0.0f) {
            RectF rectF2 = this.f2593b;
            float f6 = pointFMo1504e2.x;
            float f7 = pointFMo1504e2.y;
            float f8 = fM1516j * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f2592a.arcTo(this.f2593b, 90.0f, 90.0f, false);
        }
        this.f2592a.lineTo(pointFMo1504e2.x - f, (pointFMo1504e2.y - f2) + fM1516j);
        if (fM1516j > 0.0f) {
            RectF rectF3 = this.f2593b;
            float f9 = pointFMo1504e2.x;
            float f10 = pointFMo1504e2.y;
            float f11 = fM1516j * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f2592a.arcTo(this.f2593b, 180.0f, 90.0f, false);
        }
        this.f2592a.lineTo((pointFMo1504e2.x + f) - fM1516j, pointFMo1504e2.y - f2);
        if (fM1516j > 0.0f) {
            RectF rectF4 = this.f2593b;
            float f12 = pointFMo1504e2.x;
            float f13 = fM1516j * 2.0f;
            float f14 = pointFMo1504e2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f2592a.arcTo(this.f2593b, 270.0f, 90.0f, false);
        }
        this.f2592a.close();
        this.f2600i.m1491a(this.f2592a);
        this.f2601j = true;
        return this.f2592a;
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2594c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.f2460h) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f2598g;
            LottieValueCallback<PointF> lottieValueCallback2 = baseKeyframeAnimation.f2633e;
            baseKeyframeAnimation.f2633e = lottieValueCallback;
        } else if (t == LottieProperty.f2462j) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = this.f2597f;
            LottieValueCallback<PointF> lottieValueCallback3 = baseKeyframeAnimation2.f2633e;
            baseKeyframeAnimation2.f2633e = lottieValueCallback;
        } else if (t == LottieProperty.f2461i) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f2599h;
            LottieValueCallback<Float> lottieValueCallback4 = baseKeyframeAnimation3.f2633e;
            baseKeyframeAnimation3.f2633e = lottieValueCallback;
        }
    }
}
