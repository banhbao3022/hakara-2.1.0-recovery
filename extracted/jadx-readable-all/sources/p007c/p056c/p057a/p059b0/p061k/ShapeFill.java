package p007c.p056c.p057a.p059b0.p061k;

import android.graphics.Path;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatableColorValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.FillContent;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.k.m, reason: use source file name */
/* JADX INFO: compiled from: ShapeFill.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeFill implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final boolean f2095a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f2096b;

    /* JADX INFO: renamed from: c */
    public final String f2097c;

    /* JADX INFO: renamed from: d */
    public final AnimatableColorValue f2098d;

    /* JADX INFO: renamed from: e */
    public final AnimatableIntegerValue f2099e;

    /* JADX INFO: renamed from: f */
    public final boolean f2100f;

    public ShapeFill(String str, boolean z, Path.FillType fillType, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, boolean z2) {
        this.f2097c = str;
        this.f2095a = z;
        this.f2096b = fillType;
        this.f2098d = animatableColorValue;
        this.f2099e = animatableIntegerValue;
        this.f2100f = z2;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new FillContent(lottieDrawable, baseLayer2, this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ShapeFill{color=, fillEnabled=");
        sbM1556G.append(this.f2095a);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
