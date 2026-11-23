package p007c.p056c.p057a.p066e0;

import android.graphics.PointF;
import java.util.List;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p068z.p069b.KeyPathElementContent;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.e0.g, reason: use source file name */
/* JADX INFO: compiled from: MiscUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class MiscUtils {

    /* JADX INFO: renamed from: a */
    public static PointF f2336a = new PointF();

    /* JADX INFO: renamed from: a */
    public static PointF m1431a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: b */
    public static float m1432b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: renamed from: c */
    public static int m1433c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* JADX INFO: renamed from: d */
    public static int m1434d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* JADX INFO: renamed from: e */
    public static float m1435e(float f, float f2, float f3) {
        return outline.m1576a(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: f */
    public static void m1436f(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2, KeyPathElementContent keyPathElementContent) {
        if (keyPath.m1332c(keyPathElementContent.getName(), i)) {
            list.add(keyPath2.m1330a(keyPathElementContent.getName()).m1336g(keyPathElementContent));
        }
    }
}
