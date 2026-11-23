package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum r22 implements i82 {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: m */
    public final int f18700m;

    r22(int i) {
        this.f18700m = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(r22.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        r22 r22Var = UNRECOGNIZED;
        if (this != r22Var) {
            sb.append(" number=");
            if (this == r22Var) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            sb.append(this.f18700m);
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
