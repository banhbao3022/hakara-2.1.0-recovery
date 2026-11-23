package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum zt2 implements i82 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);


    /* JADX INFO: renamed from: j */
    public final int f22403j;

    zt2(int i) {
        this.f22403j = i;
    }

    /* JADX INFO: renamed from: f */
    public static zt2 m8907f(int i) {
        if (i == 0) {
            return NETWORKTYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CELL;
        }
        if (i != 2) {
            return null;
        }
        return WIFI;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zt2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22403j + " name=" + name() + '>';
    }
}
