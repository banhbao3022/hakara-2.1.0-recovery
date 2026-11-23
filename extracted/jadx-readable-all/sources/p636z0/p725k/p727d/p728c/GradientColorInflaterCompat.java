package p636z0.p725k.p727d.p728c;

import java.util.List;

/* JADX INFO: renamed from: z0.k.d.c.g, reason: use source file name */
/* JADX INFO: compiled from: GradientColorInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class GradientColorInflaterCompat {

    /* JADX INFO: renamed from: a */
    public final int[] f37833a;

    /* JADX INFO: renamed from: b */
    public final float[] f37834b;

    public GradientColorInflaterCompat(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f37833a = new int[size];
        this.f37834b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f37833a[i] = list.get(i).intValue();
            this.f37834b[i] = list2.get(i).floatValue();
        }
    }

    public GradientColorInflaterCompat(int i, int i2) {
        this.f37833a = new int[]{i, i2};
        this.f37834b = new float[]{0.0f, 1.0f};
    }

    public GradientColorInflaterCompat(int i, int i2, int i3) {
        this.f37833a = new int[]{i, i2, i3};
        this.f37834b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
