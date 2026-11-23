package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum ja1 implements i82 {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);


    /* JADX INFO: renamed from: m */
    public final int f15539m;

    ja1(int i) {
        this.f15539m = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ja1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f15539m + " name=" + name() + '>';
    }
}
