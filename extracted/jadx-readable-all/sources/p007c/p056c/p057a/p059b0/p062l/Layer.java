package p007c.p056c.p057a.p059b0.p062l;

import java.util.List;
import java.util.Locale;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTextFrame;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTextProperties;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p061k.ContentModel;
import p007c.p056c.p057a.p059b0.p061k.Mask;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.l.e, reason: use source file name */
/* JADX INFO: compiled from: Layer.java */
/* JADX INFO: loaded from: classes.dex */
public class Layer {

    /* JADX INFO: renamed from: a */
    public final List<ContentModel> f2168a;

    /* JADX INFO: renamed from: b */
    public final LottieComposition f2169b;

    /* JADX INFO: renamed from: c */
    public final String f2170c;

    /* JADX INFO: renamed from: d */
    public final long f2171d;

    /* JADX INFO: renamed from: e */
    public final a f2172e;

    /* JADX INFO: renamed from: f */
    public final long f2173f;

    /* JADX INFO: renamed from: g */
    public final String f2174g;

    /* JADX INFO: renamed from: h */
    public final List<Mask> f2175h;

    /* JADX INFO: renamed from: i */
    public final AnimatableTransform f2176i;

    /* JADX INFO: renamed from: j */
    public final int f2177j;

    /* JADX INFO: renamed from: k */
    public final int f2178k;

    /* JADX INFO: renamed from: l */
    public final int f2179l;

    /* JADX INFO: renamed from: m */
    public final float f2180m;

    /* JADX INFO: renamed from: n */
    public final float f2181n;

    /* JADX INFO: renamed from: o */
    public final int f2182o;

    /* JADX INFO: renamed from: p */
    public final int f2183p;

    /* JADX INFO: renamed from: q */
    public final AnimatableTextFrame f2184q;

    /* JADX INFO: renamed from: r */
    public final AnimatableTextProperties f2185r;

    /* JADX INFO: renamed from: s */
    public final AnimatableFloatValue f2186s;

    /* JADX INFO: renamed from: t */
    public final List<Keyframe<Float>> f2187t;

    /* JADX INFO: renamed from: u */
    public final b f2188u;

    /* JADX INFO: renamed from: v */
    public final boolean f2189v;

    /* JADX INFO: renamed from: c.c.a.b0.l.e$a */
    /* JADX INFO: compiled from: Layer.java */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* JADX INFO: renamed from: c.c.a.b0.l.e$b */
    /* JADX INFO: compiled from: Layer.java */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<ContentModel> list, LottieComposition lottieComposition, String str, long j2, a aVar, long j3, String str2, List<Mask> list2, AnimatableTransform animatableTransform, int i, int i2, int i3, float f, float f2, int i4, int i5, AnimatableTextFrame animatableTextFrame, AnimatableTextProperties animatableTextProperties, List<Keyframe<Float>> list3, b bVar, AnimatableFloatValue animatableFloatValue, boolean z) {
        this.f2168a = list;
        this.f2169b = lottieComposition;
        this.f2170c = str;
        this.f2171d = j2;
        this.f2172e = aVar;
        this.f2173f = j3;
        this.f2174g = str2;
        this.f2175h = list2;
        this.f2176i = animatableTransform;
        this.f2177j = i;
        this.f2178k = i2;
        this.f2179l = i3;
        this.f2180m = f;
        this.f2181n = f2;
        this.f2182o = i4;
        this.f2183p = i5;
        this.f2184q = animatableTextFrame;
        this.f2185r = animatableTextProperties;
        this.f2187t = list3;
        this.f2188u = bVar;
        this.f2186s = animatableFloatValue;
        this.f2189v = z;
    }

    /* JADX INFO: renamed from: a */
    public String m1360a(String str) {
        StringBuilder sbM1556G = outline.m1556G(str);
        sbM1556G.append(this.f2170c);
        sbM1556G.append("\n");
        Layer layerM1447e = this.f2169b.m1447e(this.f2173f);
        if (layerM1447e != null) {
            sbM1556G.append("\t\tParents: ");
            sbM1556G.append(layerM1447e.f2170c);
            Layer layerM1447e2 = this.f2169b.m1447e(layerM1447e.f2173f);
            while (layerM1447e2 != null) {
                sbM1556G.append("->");
                sbM1556G.append(layerM1447e2.f2170c);
                layerM1447e2 = this.f2169b.m1447e(layerM1447e2.f2173f);
            }
            sbM1556G.append(str);
            sbM1556G.append("\n");
        }
        if (!this.f2175h.isEmpty()) {
            sbM1556G.append(str);
            sbM1556G.append("\tMasks: ");
            sbM1556G.append(this.f2175h.size());
            sbM1556G.append("\n");
        }
        if (this.f2177j != 0 && this.f2178k != 0) {
            sbM1556G.append(str);
            sbM1556G.append("\tBackground: ");
            sbM1556G.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.f2177j), Integer.valueOf(this.f2178k), Integer.valueOf(this.f2179l)));
        }
        if (!this.f2168a.isEmpty()) {
            sbM1556G.append(str);
            sbM1556G.append("\tShapes:\n");
            for (ContentModel contentModel : this.f2168a) {
                sbM1556G.append(str);
                sbM1556G.append("\t\t");
                sbM1556G.append(contentModel);
                sbM1556G.append("\n");
            }
        }
        return sbM1556G.toString();
    }

    public String toString() {
        return m1360a("");
    }
}
