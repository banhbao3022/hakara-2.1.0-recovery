package p007c.p056c.p057a.p059b0.p061k;

import android.graphics.PointF;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatablePointValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.RectangleContent;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.k.j, reason: use source file name */
/* JADX INFO: compiled from: RectangleShape.java */
/* JADX INFO: loaded from: classes.dex */
public class RectangleShape implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2082a;

    /* JADX INFO: renamed from: b */
    public final AnimatableValue<PointF, PointF> f2083b;

    /* JADX INFO: renamed from: c */
    public final AnimatablePointValue f2084c;

    /* JADX INFO: renamed from: d */
    public final AnimatableFloatValue f2085d;

    /* JADX INFO: renamed from: e */
    public final boolean f2086e;

    public RectangleShape(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatablePointValue animatablePointValue, AnimatableFloatValue animatableFloatValue, boolean z) {
        this.f2082a = str;
        this.f2083b = animatableValue;
        this.f2084c = animatablePointValue;
        this.f2085d = animatableFloatValue;
        this.f2086e = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new RectangleContent(lottieDrawable, baseLayer2, this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("RectangleShape{position=");
        sbM1556G.append(this.f2083b);
        sbM1556G.append(", size=");
        sbM1556G.append(this.f2084c);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
