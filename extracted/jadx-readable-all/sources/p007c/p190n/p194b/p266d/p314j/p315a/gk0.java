package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum gk0 implements i82 {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);


    /* JADX INFO: renamed from: l */
    public final int f14605l;

    gk0(int i) {
        this.f14605l = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + gk0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14605l + " name=" + name() + '>';
    }
}
