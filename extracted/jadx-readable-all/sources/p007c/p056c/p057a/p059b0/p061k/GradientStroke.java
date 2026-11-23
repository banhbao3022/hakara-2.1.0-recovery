package p007c.p056c.p057a.p059b0.p061k;

import java.util.List;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableGradientColorValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatablePointValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.GradientStrokeContent;

/* JADX INFO: renamed from: c.c.a.b0.k.e, reason: use source file name */
/* JADX INFO: compiled from: GradientStroke.java */
/* JADX INFO: loaded from: classes.dex */
public class GradientStroke implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2034a;

    /* JADX INFO: renamed from: b */
    public final GradientType f2035b;

    /* JADX INFO: renamed from: c */
    public final AnimatableGradientColorValue f2036c;

    /* JADX INFO: renamed from: d */
    public final AnimatableIntegerValue f2037d;

    /* JADX INFO: renamed from: e */
    public final AnimatablePointValue f2038e;

    /* JADX INFO: renamed from: f */
    public final AnimatablePointValue f2039f;

    /* JADX INFO: renamed from: g */
    public final AnimatableFloatValue f2040g;

    /* JADX INFO: renamed from: h */
    public final ShapeStroke.a f2041h;

    /* JADX INFO: renamed from: i */
    public final ShapeStroke.b f2042i;

    /* JADX INFO: renamed from: j */
    public final float f2043j;

    /* JADX INFO: renamed from: k */
    public final List<AnimatableFloatValue> f2044k;

    /* JADX INFO: renamed from: l */
    public final AnimatableFloatValue f2045l;

    /* JADX INFO: renamed from: m */
    public final boolean f2046m;

    public GradientStroke(String str, GradientType gradientType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, ShapeStroke.a aVar, ShapeStroke.b bVar, float f, List<AnimatableFloatValue> list, AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.f2034a = str;
        this.f2035b = gradientType;
        this.f2036c = animatableGradientColorValue;
        this.f2037d = animatableIntegerValue;
        this.f2038e = animatablePointValue;
        this.f2039f = animatablePointValue2;
        this.f2040g = animatableFloatValue;
        this.f2041h = aVar;
        this.f2042i = bVar;
        this.f2043j = f;
        this.f2044k = list;
        this.f2045l = animatableFloatValue2;
        this.f2046m = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new GradientStrokeContent(lottieDrawable, baseLayer2, this);
    }
}
