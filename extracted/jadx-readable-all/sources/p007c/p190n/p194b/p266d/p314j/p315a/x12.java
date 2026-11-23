package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum x12 implements i82 {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: l */
    public final int f21427l;

    x12(int i) {
        this.f21427l = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(x12.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        x12 x12Var = UNRECOGNIZED;
        if (this != x12Var) {
            sb.append(" number=");
            if (this == x12Var) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            sb.append(this.f21427l);
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
