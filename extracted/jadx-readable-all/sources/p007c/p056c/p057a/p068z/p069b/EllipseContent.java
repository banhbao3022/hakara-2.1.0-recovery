package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.p061k.CircleShape;
import p007c.p056c.p057a.p059b0.p061k.ShapeTrimPath;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.f, reason: use source file name */
/* JADX INFO: compiled from: EllipseContent.java */
/* JADX INFO: loaded from: classes.dex */
public class EllipseContent implements PathContent, BaseKeyframeAnimation.b, KeyPathElementContent {

    /* JADX INFO: renamed from: b */
    public final String f2527b;

    /* JADX INFO: renamed from: c */
    public final LottieDrawable f2528c;

    /* JADX INFO: renamed from: d */
    public final BaseKeyframeAnimation<?, PointF> f2529d;

    /* JADX INFO: renamed from: e */
    public final BaseKeyframeAnimation<?, PointF> f2530e;

    /* JADX INFO: renamed from: f */
    public final CircleShape f2531f;

    /* JADX INFO: renamed from: h */
    public boolean f2533h;

    /* JADX INFO: renamed from: a */
    public final Path f2526a = new Path();

    /* JADX INFO: renamed from: g */
    public CompoundTrimPathContent f2532g = new CompoundTrimPathContent();

    public EllipseContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, CircleShape circleShape) {
        this.f2527b = circleShape.f2019a;
        this.f2528c = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationMo1339a = circleShape.f2021c.mo1339a();
        this.f2529d = baseKeyframeAnimationMo1339a;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationMo1339a2 = circleShape.f2020b.mo1339a();
        this.f2530e = baseKeyframeAnimationMo1339a2;
        this.f2531f = circleShape;
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a2);
        baseKeyframeAnimationMo1339a.f2629a.add(this);
        baseKeyframeAnimationMo1339a2.f2629a.add(this);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2533h = false;
        this.f2528c.invalidateSelf();
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f2625c == ShapeTrimPath.a.SIMULTANEOUSLY) {
                    this.f2532g.f2514a.add(trimPathContent);
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
        if (this.f2533h) {
            return this.f2526a;
        }
        this.f2526a.reset();
        if (this.f2531f.f2023e) {
            this.f2533h = true;
            return this.f2526a;
        }
        PointF pointFMo1504e = this.f2529d.mo1504e();
        float f = pointFMo1504e.x / 2.0f;
        float f2 = pointFMo1504e.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f2526a.reset();
        if (this.f2531f.f2022d) {
            float f5 = -f2;
            this.f2526a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f2526a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f2526a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f2526a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f2526a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f2526a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f2526a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f2526a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f2526a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f2526a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFMo1504e2 = this.f2530e.mo1504e();
        this.f2526a.offset(pointFMo1504e2.x, pointFMo1504e2.y);
        this.f2526a.close();
        this.f2532g.m1491a(this.f2526a);
        this.f2533h = true;
        return this.f2526a;
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2527b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.f2459g) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f2529d;
            LottieValueCallback<PointF> lottieValueCallback2 = baseKeyframeAnimation.f2633e;
            baseKeyframeAnimation.f2633e = lottieValueCallback;
        } else if (t == LottieProperty.f2462j) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = this.f2530e;
            LottieValueCallback<PointF> lottieValueCallback3 = baseKeyframeAnimation2.f2633e;
            baseKeyframeAnimation2.f2633e = lottieValueCallback;
        }
    }
}
