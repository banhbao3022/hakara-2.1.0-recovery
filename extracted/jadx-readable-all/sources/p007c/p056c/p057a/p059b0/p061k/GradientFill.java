package p007c.p056c.p057a.p059b0.p061k;

import android.graphics.Path;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableGradientColorValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatablePointValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.GradientFillContent;

/* JADX INFO: renamed from: c.c.a.b0.k.d, reason: use source file name */
/* JADX INFO: compiled from: GradientFill.java */
/* JADX INFO: loaded from: classes.dex */
public class GradientFill implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final GradientType f2026a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f2027b;

    /* JADX INFO: renamed from: c */
    public final AnimatableGradientColorValue f2028c;

    /* JADX INFO: renamed from: d */
    public final AnimatableIntegerValue f2029d;

    /* JADX INFO: renamed from: e */
    public final AnimatablePointValue f2030e;

    /* JADX INFO: renamed from: f */
    public final AnimatablePointValue f2031f;

    /* JADX INFO: renamed from: g */
    public final String f2032g;

    /* JADX INFO: renamed from: h */
    public final boolean f2033h;

    public GradientFill(String str, GradientType gradientType, Path.FillType fillType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.f2026a = gradientType;
        this.f2027b = fillType;
        this.f2028c = animatableGradientColorValue;
        this.f2029d = animatableIntegerValue;
        this.f2030e = animatablePointValue;
        this.f2031f = animatablePointValue2;
        this.f2032g = str;
        this.f2033h = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new GradientFillContent(lottieDrawable, baseLayer2, this);
    }
}
