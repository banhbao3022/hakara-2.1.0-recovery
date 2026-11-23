package p007c.p056c.p057a.p068z.p070c;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.p059b0.p061k.Mask;
import p007c.p056c.p057a.p059b0.p061k.ShapeData;

/* JADX INFO: renamed from: c.c.a.z.c.g, reason: use source file name */
/* JADX INFO: compiled from: MaskKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class MaskKeyframeAnimation {

    /* JADX INFO: renamed from: a */
    public final List<BaseKeyframeAnimation<ShapeData, Path>> f2644a;

    /* JADX INFO: renamed from: b */
    public final List<BaseKeyframeAnimation<Integer, Integer>> f2645b;

    /* JADX INFO: renamed from: c */
    public final List<Mask> f2646c;

    public MaskKeyframeAnimation(List<Mask> list) {
        this.f2646c = list;
        this.f2644a = new ArrayList(list.size());
        this.f2645b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f2644a.add(list.get(i).f2051b.mo1339a());
            this.f2645b.add(list.get(i).f2052c.mo1339a());
        }
    }
}
