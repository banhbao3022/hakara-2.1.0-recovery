package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nl2 implements lm2 {

    /* JADX INFO: renamed from: f */
    public final lm2[] f17158f;

    public nl2(lm2[] lm2VarArr) {
        this.f17158f = lm2VarArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lm2
    /* JADX INFO: renamed from: a */
    public final boolean mo6205a(long j2) {
        boolean zMo6205a;
        boolean z = false;
        do {
            long jZza = zza();
            if (jZza == Long.MIN_VALUE) {
                break;
            }
            zMo6205a = false;
            for (lm2 lm2Var : this.f17158f) {
                if (lm2Var.zza() == jZza) {
                    zMo6205a |= lm2Var.mo6205a(j2);
                }
            }
            z |= zMo6205a;
        } while (zMo6205a);
        return true == z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lm2
    public final long zza() {
        long jMin = Long.MAX_VALUE;
        for (lm2 lm2Var : this.f17158f) {
            long jZza = lm2Var.zza();
            if (jZza != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZza);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
