package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum iu2 implements i82 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* JADX INFO: renamed from: m */
    public final int f15399m;

    iu2(int i) {
        this.f15399m = i;
    }

    /* JADX INFO: renamed from: f */
    public static iu2 m7304f(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + iu2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f15399m + " name=" + name() + '>';
    }
}
