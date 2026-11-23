package p007c.p056c.p057a.p059b0.p060j;

import android.graphics.PointF;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p061k.ContentModel;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;

/* JADX INFO: renamed from: c.c.a.b0.j.l, reason: use source file name */
/* JADX INFO: compiled from: AnimatableTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableTransform implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final AnimatablePathValue f2009a;

    /* JADX INFO: renamed from: b */
    public final AnimatableValue<PointF, PointF> f2010b;

    /* JADX INFO: renamed from: c */
    public final AnimatableScaleValue f2011c;

    /* JADX INFO: renamed from: d */
    public final AnimatableFloatValue f2012d;

    /* JADX INFO: renamed from: e */
    public final AnimatableIntegerValue f2013e;

    /* JADX INFO: renamed from: f */
    public final AnimatableFloatValue f2014f;

    /* JADX INFO: renamed from: g */
    public final AnimatableFloatValue f2015g;

    /* JADX INFO: renamed from: h */
    public final AnimatableFloatValue f2016h;

    /* JADX INFO: renamed from: i */
    public final AnimatableFloatValue f2017i;

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return null;
    }

    public AnimatableTransform(AnimatablePathValue animatablePathValue, AnimatableValue<PointF, PointF> animatableValue, AnimatableScaleValue animatableScaleValue, AnimatableFloatValue animatableFloatValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5) {
        this.f2009a = animatablePathValue;
        this.f2010b = animatableValue;
        this.f2011c = animatableScaleValue;
        this.f2012d = animatableFloatValue;
        this.f2013e = animatableIntegerValue;
        this.f2016h = animatableFloatValue2;
        this.f2017i = animatableFloatValue3;
        this.f2014f = animatableFloatValue4;
        this.f2015g = animatableFloatValue5;
    }
}
