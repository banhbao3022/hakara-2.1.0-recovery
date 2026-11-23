package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum zf2 implements i82 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    UNKNOWN(999);


    /* JADX INFO: renamed from: m */
    public final int f22263m;

    zf2(int i) {
        this.f22263m = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zf2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22263m + " name=" + name() + '>';
    }
}
