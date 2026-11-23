package p007c.p190n.p194b.p334e.p365y;

/* JADX INFO: renamed from: c.n.b.e.y.i, reason: use source file name */
/* JADX INFO: compiled from: RoundedCornerTreatment.java */
/* JADX INFO: loaded from: classes.dex */
public class RoundedCornerTreatment extends CornerTreatment {

    /* JADX INFO: renamed from: a */
    public float f25617a;

    public RoundedCornerTreatment() {
        this.f25617a = -1.0f;
    }

    @Override // p007c.p190n.p194b.p334e.p365y.CornerTreatment
    /* JADX INFO: renamed from: a */
    public void mo11364a(ShapePath3 shapePath3, float f, float f2, float f3) {
        shapePath3.m11412f(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        shapePath3.m11407a(0.0f, 0.0f, f4, f4, 180.0f, f);
    }

    @Deprecated
    public RoundedCornerTreatment(float f) {
        this.f25617a = -1.0f;
        this.f25617a = f;
    }
}
