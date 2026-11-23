package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum h32 implements i82 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: l */
    public final int f14738l;

    h32(int i) {
        this.f14738l = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(h32.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        h32 h32Var = UNRECOGNIZED;
        if (this != h32Var) {
            sb.append(" number=");
            if (this == h32Var) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            sb.append(this.f14738l);
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
