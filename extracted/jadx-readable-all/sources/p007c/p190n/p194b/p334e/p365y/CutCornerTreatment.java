package p007c.p190n.p194b.p334e.p365y;

/* JADX INFO: renamed from: c.n.b.e.y.e, reason: use source file name */
/* JADX INFO: compiled from: CutCornerTreatment.java */
/* JADX INFO: loaded from: classes.dex */
public class CutCornerTreatment extends CornerTreatment {

    /* JADX INFO: renamed from: a */
    public float f25568a;

    public CutCornerTreatment() {
        this.f25568a = -1.0f;
    }

    @Override // p007c.p190n.p194b.p334e.p365y.CornerTreatment
    /* JADX INFO: renamed from: a */
    public void mo11364a(ShapePath3 shapePath3, float f, float f2, float f3) {
        shapePath3.m11412f(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        shapePath3.m11410d((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }

    @Deprecated
    public CutCornerTreatment(float f) {
        this.f25568a = -1.0f;
        this.f25568a = f;
    }
}
