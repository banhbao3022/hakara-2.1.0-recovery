package p007c.p056c.p057a.p059b0.p061k;

import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatableShapeValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.ShapeContent;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.k.o, reason: use source file name */
/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapePath implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2104a;

    /* JADX INFO: renamed from: b */
    public final int f2105b;

    /* JADX INFO: renamed from: c */
    public final AnimatableShapeValue f2106c;

    /* JADX INFO: renamed from: d */
    public final boolean f2107d;

    public ShapePath(String str, int i, AnimatableShapeValue animatableShapeValue, boolean z) {
        this.f2104a = str;
        this.f2105b = i;
        this.f2106c = animatableShapeValue;
        this.f2107d = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new ShapeContent(lottieDrawable, baseLayer2, this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ShapePath{name=");
        sbM1556G.append(this.f2104a);
        sbM1556G.append(", index=");
        sbM1556G.append(this.f2105b);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
