package p007c.p056c.p057a.p059b0.p061k;

import android.graphics.PointF;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.PolystarContent;

/* JADX INFO: renamed from: c.c.a.b0.k.i, reason: use source file name */
/* JADX INFO: compiled from: PolystarShape.java */
/* JADX INFO: loaded from: classes.dex */
public class PolystarShape implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2068a;

    /* JADX INFO: renamed from: b */
    public final a f2069b;

    /* JADX INFO: renamed from: c */
    public final AnimatableFloatValue f2070c;

    /* JADX INFO: renamed from: d */
    public final AnimatableValue<PointF, PointF> f2071d;

    /* JADX INFO: renamed from: e */
    public final AnimatableFloatValue f2072e;

    /* JADX INFO: renamed from: f */
    public final AnimatableFloatValue f2073f;

    /* JADX INFO: renamed from: g */
    public final AnimatableFloatValue f2074g;

    /* JADX INFO: renamed from: h */
    public final AnimatableFloatValue f2075h;

    /* JADX INFO: renamed from: i */
    public final AnimatableFloatValue f2076i;

    /* JADX INFO: renamed from: j */
    public final boolean f2077j;

    /* JADX INFO: renamed from: c.c.a.b0.k.i$a */
    /* JADX INFO: compiled from: PolystarShape.java */
    public enum a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: i */
        public final int f2081i;

        a(int i) {
            this.f2081i = i;
        }
    }

    public PolystarShape(String str, a aVar, AnimatableFloatValue animatableFloatValue, AnimatableValue<PointF, PointF> animatableValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5, AnimatableFloatValue animatableFloatValue6, boolean z) {
        this.f2068a = str;
        this.f2069b = aVar;
        this.f2070c = animatableFloatValue;
        this.f2071d = animatableValue;
        this.f2072e = animatableFloatValue2;
        this.f2073f = animatableFloatValue3;
        this.f2074g = animatableFloatValue4;
        this.f2075h = animatableFloatValue5;
        this.f2076i = animatableFloatValue6;
        this.f2077j = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new PolystarContent(lottieDrawable, baseLayer2, this);
    }
}
