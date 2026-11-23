package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum hb2 implements i82 {
    SAFE(0),
    DANGEROUS(1),
    UNKNOWN(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4);


    /* JADX INFO: renamed from: l */
    public final int f14808l;

    hb2(int i) {
        this.f14808l = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + hb2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14808l + " name=" + name() + '>';
    }
}
