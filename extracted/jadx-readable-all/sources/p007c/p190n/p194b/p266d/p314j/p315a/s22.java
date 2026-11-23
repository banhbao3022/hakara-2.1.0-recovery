package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum s22 implements i82 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: m */
    public final int f19456m;

    s22(int i) {
        this.f19456m = i;
    }

    /* JADX INFO: renamed from: f */
    public static s22 m8340f(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(s22.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        s22 s22Var = UNRECOGNIZED;
        if (this != s22Var) {
            sb.append(" number=");
            if (this == s22Var) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            sb.append(this.f19456m);
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
