package p007c.p190n.p194b.p209b.p215n1;

/* JADX INFO: renamed from: c.n.b.b.n1.v, reason: use source file name */
/* JADX INFO: compiled from: AuxEffectInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class AuxEffectInfo {

    /* JADX INFO: renamed from: a */
    public final int f7165a;

    /* JADX INFO: renamed from: b */
    public final float f7166b;

    public AuxEffectInfo(int i, float f) {
        this.f7165a = i;
        this.f7166b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuxEffectInfo.class != obj.getClass()) {
            return false;
        }
        AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
        return this.f7165a == auxEffectInfo.f7165a && Float.compare(auxEffectInfo.f7166b, this.f7166b) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f7166b) + ((527 + this.f7165a) * 31);
    }
}
