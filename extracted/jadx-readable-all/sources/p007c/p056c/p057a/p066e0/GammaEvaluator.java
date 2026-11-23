package p007c.p056c.p057a.p066e0;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.e0.b, reason: use source file name */
/* JADX INFO: compiled from: GammaEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public class GammaEvaluator {
    /* JADX INFO: renamed from: a */
    public static float m1416a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: b */
    public static float m1417b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX INFO: renamed from: c */
    public static int m1418c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fM1416a = m1416a(((i >> 16) & 255) / 255.0f);
        float fM1416a2 = m1416a(((i >> 8) & 255) / 255.0f);
        float fM1416a3 = m1416a((i & 255) / 255.0f);
        float fM1416a4 = m1416a(((i2 >> 16) & 255) / 255.0f);
        float fM1416a5 = m1416a(((i2 >> 8) & 255) / 255.0f);
        float fM1416a6 = m1416a((i2 & 255) / 255.0f);
        float fM1576a = outline.m1576a(f3, f2, f, f2);
        float fM1576a2 = outline.m1576a(fM1416a4, fM1416a, f, fM1416a);
        float fM1576a3 = outline.m1576a(fM1416a5, fM1416a2, f, fM1416a2);
        float fM1576a4 = outline.m1576a(fM1416a6, fM1416a3, f, fM1416a3);
        float fM1417b = m1417b(fM1576a2) * 255.0f;
        float fM1417b2 = m1417b(fM1576a3) * 255.0f;
        return Math.round(m1417b(fM1576a4) * 255.0f) | (Math.round(fM1417b) << 16) | (Math.round(fM1576a * 255.0f) << 24) | (Math.round(fM1417b2) << 8);
    }
}
