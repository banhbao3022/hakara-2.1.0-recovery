package p007c.p056c.p057a.p059b0.p061k;

import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.TrimPathContent;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.k.q, reason: use source file name */
/* JADX INFO: compiled from: ShapeTrimPath.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeTrimPath implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2126a;

    /* JADX INFO: renamed from: b */
    public final a f2127b;

    /* JADX INFO: renamed from: c */
    public final AnimatableFloatValue f2128c;

    /* JADX INFO: renamed from: d */
    public final AnimatableFloatValue f2129d;

    /* JADX INFO: renamed from: e */
    public final AnimatableFloatValue f2130e;

    /* JADX INFO: renamed from: f */
    public final boolean f2131f;

    /* JADX INFO: renamed from: c.c.a.b0.k.q$a */
    /* JADX INFO: compiled from: ShapeTrimPath.java */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY
    }

    public ShapeTrimPath(String str, a aVar, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, boolean z) {
        this.f2126a = str;
        this.f2127b = aVar;
        this.f2128c = animatableFloatValue;
        this.f2129d = animatableFloatValue2;
        this.f2130e = animatableFloatValue3;
        this.f2131f = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new TrimPathContent(baseLayer2, this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Trim Path: {start: ");
        sbM1556G.append(this.f2128c);
        sbM1556G.append(", end: ");
        sbM1556G.append(this.f2129d);
        sbM1556G.append(", offset: ");
        sbM1556G.append(this.f2130e);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
