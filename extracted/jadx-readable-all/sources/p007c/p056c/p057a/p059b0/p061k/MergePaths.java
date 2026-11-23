package p007c.p056c.p057a.p059b0.p061k;

import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.MergePathsContent;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.k.h, reason: use source file name */
/* JADX INFO: compiled from: MergePaths.java */
/* JADX INFO: loaded from: classes.dex */
public class MergePaths implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2059a;

    /* JADX INFO: renamed from: b */
    public final a f2060b;

    /* JADX INFO: renamed from: c */
    public final boolean f2061c;

    /* JADX INFO: renamed from: c.c.a.b0.k.h$a */
    /* JADX INFO: compiled from: MergePaths.java */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS
    }

    public MergePaths(String str, a aVar, boolean z) {
        this.f2059a = str;
        this.f2060b = aVar;
        this.f2061c = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        if (lottieDrawable.f2410u) {
            return new MergePathsContent(this);
        }
        Logger2.m1420b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("MergePaths{mode=");
        sbM1556G.append(this.f2060b);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
