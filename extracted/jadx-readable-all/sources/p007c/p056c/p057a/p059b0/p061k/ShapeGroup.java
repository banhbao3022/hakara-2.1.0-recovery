package p007c.p056c.p057a.p059b0.p061k;

import java.util.Arrays;
import java.util.List;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.ContentGroup;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.k.n, reason: use source file name */
/* JADX INFO: compiled from: ShapeGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeGroup implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2101a;

    /* JADX INFO: renamed from: b */
    public final List<ContentModel> f2102b;

    /* JADX INFO: renamed from: c */
    public final boolean f2103c;

    public ShapeGroup(String str, List<ContentModel> list, boolean z) {
        this.f2101a = str;
        this.f2102b = list;
        this.f2103c = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new ContentGroup(lottieDrawable, baseLayer2, this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ShapeGroup{name='");
        sbM1556G.append(this.f2101a);
        sbM1556G.append("' Shapes: ");
        sbM1556G.append(Arrays.toString(this.f2102b.toArray()));
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
