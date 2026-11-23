package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class b72 extends e72 {

    /* JADX INFO: renamed from: i */
    public final int f12536i;

    /* JADX INFO: renamed from: j */
    public final int f12537j;

    public b72(byte[] bArr, int i, int i2) {
        super(bArr);
        g72.m6945f(i, i + i2, bArr.length);
        this.f12536i = i;
        this.f12537j = i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.e72
    /* JADX INFO: renamed from: Q */
    public final int mo5932Q() {
        return this.f12536i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.e72, p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: h */
    public final byte mo5717h(int i) {
        g72.m6944c(i, this.f12537j);
        return this.f13527h[this.f12536i + i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.e72, p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: j */
    public final byte mo5718j(int i) {
        return this.f13527h[this.f12536i + i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.e72, p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: m */
    public final int mo5719m() {
        return this.f12537j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.e72, p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: s */
    public final void mo5720s(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f13527h, this.f12536i + i, bArr, i2, i3);
    }
}
