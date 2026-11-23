package p007c.p190n.p194b.p334e.p346g;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p365y.EdgeTreatment;
import p007c.p190n.p194b.p334e.p365y.ShapePath3;

/* JADX INFO: renamed from: c.n.b.e.g.f, reason: use source file name */
/* JADX INFO: compiled from: BottomAppBarTopEdgeTreatment.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {

    /* JADX INFO: renamed from: f */
    public float f24997f;

    /* JADX INFO: renamed from: g */
    public float f24998g;

    /* JADX INFO: renamed from: h */
    public float f24999h;

    /* JADX INFO: renamed from: i */
    public float f25000i;

    /* JADX INFO: renamed from: j */
    public float f25001j;

    public BottomAppBarTopEdgeTreatment(float f, float f2, float f3) {
        this.f24998g = f;
        this.f24997f = f2;
        m11111b(f3);
        this.f25001j = 0.0f;
    }

    @Override // p007c.p190n.p194b.p334e.p365y.EdgeTreatment
    /* JADX INFO: renamed from: a */
    public void mo11110a(float f, float f2, float f3, ShapePath3 shapePath3) {
        float f4 = this.f24999h;
        if (f4 == 0.0f) {
            shapePath3.m11410d(f, 0.0f);
            return;
        }
        float f5 = ((this.f24998g * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f24997f;
        float f7 = f2 + this.f25001j;
        float fM1576a = outline.m1576a(1.0f, f3, f5, this.f25000i * f3);
        if (fM1576a / f5 >= 1.0f) {
            shapePath3.m11410d(f, 0.0f);
            return;
        }
        float f8 = f5 + f6;
        float f9 = fM1576a + f6;
        float fSqrt = (float) Math.sqrt((f8 * f8) - (f9 * f9));
        float f10 = f7 - fSqrt;
        float f11 = f7 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f9));
        float f12 = 90.0f - degrees;
        shapePath3.m11410d(f10, 0.0f);
        float f13 = f6 * 2.0f;
        shapePath3.m11407a(f10 - f6, 0.0f, f10 + f6, f13, 270.0f, degrees);
        shapePath3.m11407a(f7 - f5, (-f5) - fM1576a, f7 + f5, f5 - fM1576a, 180.0f - f12, (f12 * 2.0f) - 180.0f);
        shapePath3.m11407a(f11 - f6, 0.0f, f11 + f6, f13, 270.0f - degrees, degrees);
        shapePath3.m11410d(f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m11111b(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f25000i = f;
    }
}
