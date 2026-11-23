package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class aj2 implements jj2 {

    /* JADX INFO: renamed from: a */
    public final long[] f12185a;

    /* JADX INFO: renamed from: b */
    public final long[] f12186b;

    /* JADX INFO: renamed from: c */
    public final long f12187c;

    public aj2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f12185a = jArr;
        this.f12186b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f12187c = 0L;
        } else {
            int i = length - 1;
            this.f12187c = jArr2[i] + jArr3[i];
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jj2
    /* JADX INFO: renamed from: a */
    public final long mo5818a() {
        return this.f12187c;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jj2
    /* JADX INFO: renamed from: e */
    public final long mo5819e(long j2) {
        return this.f12185a[jo2.m7371c(this.f12186b, j2, true, true)];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jj2
    public final boolean zza() {
        return true;
    }
}
