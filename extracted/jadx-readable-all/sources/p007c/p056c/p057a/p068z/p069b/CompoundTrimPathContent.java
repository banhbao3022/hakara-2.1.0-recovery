package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p068z.p070c.FloatKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.b, reason: use source file name */
/* JADX INFO: compiled from: CompoundTrimPathContent.java */
/* JADX INFO: loaded from: classes.dex */
public class CompoundTrimPathContent {

    /* JADX INFO: renamed from: a */
    public List<TrimPathContent> f2514a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m1491a(Path path) {
        for (int size = this.f2514a.size() - 1; size >= 0; size--) {
            TrimPathContent trimPathContent = this.f2514a.get(size);
            ThreadLocal<PathMeasure> threadLocal = Utils.f2337a;
            if (trimPathContent != null && !trimPathContent.f2623a) {
                Utils.m1437a(path, ((FloatKeyframeAnimation) trimPathContent.f2626d).m1516j() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.f2627e).m1516j() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.f2628f).m1516j() / 360.0f);
            }
        }
    }
}
