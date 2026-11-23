package p007c.p056c.p057a.p059b0.p061k;

import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.RepeaterContent;

/* JADX INFO: renamed from: c.c.a.b0.k.k, reason: use source file name */
/* JADX INFO: compiled from: Repeater.java */
/* JADX INFO: loaded from: classes.dex */
public class Repeater3 implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2087a;

    /* JADX INFO: renamed from: b */
    public final AnimatableFloatValue f2088b;

    /* JADX INFO: renamed from: c */
    public final AnimatableFloatValue f2089c;

    /* JADX INFO: renamed from: d */
    public final AnimatableTransform f2090d;

    /* JADX INFO: renamed from: e */
    public final boolean f2091e;

    public Repeater3(String str, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableTransform animatableTransform, boolean z) {
        this.f2087a = str;
        this.f2088b = animatableFloatValue;
        this.f2089c = animatableFloatValue2;
        this.f2090d = animatableTransform;
        this.f2091e = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new RepeaterContent(lottieDrawable, baseLayer2, this);
    }
}
