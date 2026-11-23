package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum l42 implements i82 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: m */
    public final int f16287m;

    l42(int i) {
        this.f16287m = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(l42.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        l42 l42Var = UNRECOGNIZED;
        if (this != l42Var) {
            sb.append(" number=");
            if (this == l42Var) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            sb.append(this.f16287m);
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
