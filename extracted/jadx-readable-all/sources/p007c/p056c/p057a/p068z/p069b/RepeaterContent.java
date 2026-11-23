package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p061k.Repeater3;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.TransformKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.p, reason: use source file name */
/* JADX INFO: compiled from: RepeaterContent.java */
/* JADX INFO: loaded from: classes.dex */
public class RepeaterContent implements DrawingContent, PathContent, GreedyContent, BaseKeyframeAnimation.b, KeyPathElementContent {

    /* JADX INFO: renamed from: a */
    public final Matrix f2602a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Path f2603b = new Path();

    /* JADX INFO: renamed from: c */
    public final LottieDrawable f2604c;

    /* JADX INFO: renamed from: d */
    public final BaseLayer2 f2605d;

    /* JADX INFO: renamed from: e */
    public final String f2606e;

    /* JADX INFO: renamed from: f */
    public final boolean f2607f;

    /* JADX INFO: renamed from: g */
    public final BaseKeyframeAnimation<Float, Float> f2608g;

    /* JADX INFO: renamed from: h */
    public final BaseKeyframeAnimation<Float, Float> f2609h;

    /* JADX INFO: renamed from: i */
    public final TransformKeyframeAnimation f2610i;

    /* JADX INFO: renamed from: j */
    public ContentGroup f2611j;

    public RepeaterContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, Repeater3 repeater3) {
        this.f2604c = lottieDrawable;
        this.f2605d = baseLayer2;
        this.f2606e = repeater3.f2087a;
        this.f2607f = repeater3.f2091e;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a = repeater3.f2088b.mo1339a();
        this.f2608g = baseKeyframeAnimationMo1339a;
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
        baseKeyframeAnimationMo1339a.f2629a.add(this);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a2 = repeater3.f2089c.mo1339a();
        this.f2609h = baseKeyframeAnimationMo1339a2;
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a2);
        baseKeyframeAnimationMo1339a2.f2629a.add(this);
        AnimatableTransform animatableTransform = repeater3.f2090d;
        Objects.requireNonNull(animatableTransform);
        TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
        this.f2610i = transformKeyframeAnimation;
        transformKeyframeAnimation.m1520a(baseLayer2);
        transformKeyframeAnimation.m1521b(this);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2604c.invalidateSelf();
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        this.f2611j.mo1346b(list, list2);
    }

    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: c */
    public void mo1337c(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.m1436f(keyPath, i, list, keyPath2, this);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        this.f2611j.mo1347d(rectF, matrix, z);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.GreedyContent
    /* JADX INFO: renamed from: e */
    public void mo1498e(ListIterator<Content> listIterator) {
        if (this.f2611j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f2611j = new ContentGroup(this.f2604c, this.f2605d, "Repeater", this.f2607f, arrayList, null);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: f */
    public void mo1349f(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.f2608g.mo1504e().floatValue();
        float fFloatValue2 = this.f2609h.mo1504e().floatValue();
        float fFloatValue3 = this.f2610i.f2672m.mo1504e().floatValue() / 100.0f;
        float fFloatValue4 = this.f2610i.f2673n.mo1504e().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f2602a.set(matrix);
            float f = i2;
            this.f2602a.preConcat(this.f2610i.m1525f(f + fFloatValue2));
            this.f2611j.mo1349f(canvas, this.f2602a, (int) (MiscUtils.m1435e(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    @Override // p007c.p056c.p057a.p068z.p069b.PathContent
    /* JADX INFO: renamed from: g */
    public Path mo1493g() {
        Path pathMo1493g = this.f2611j.mo1493g();
        this.f2603b.reset();
        float fFloatValue = this.f2608g.mo1504e().floatValue();
        float fFloatValue2 = this.f2609h.mo1504e().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.f2602a.set(this.f2610i.m1525f(i + fFloatValue2));
            this.f2603b.addPath(pathMo1493g, this.f2602a);
        }
        return this.f2603b;
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2606e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        if (this.f2610i.m1522c(t, lottieValueCallback)) {
            return;
        }
        if (t == LottieProperty.f2469q) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f2608g;
            LottieValueCallback<Float> lottieValueCallback2 = baseKeyframeAnimation.f2633e;
            baseKeyframeAnimation.f2633e = lottieValueCallback;
        } else if (t == LottieProperty.f2470r) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.f2609h;
            LottieValueCallback<Float> lottieValueCallback3 = baseKeyframeAnimation2.f2633e;
            baseKeyframeAnimation2.f2633e = lottieValueCallback;
        }
    }
}
