package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.m0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3929m0 implements InterfaceC3834c5 {
    APP_SESSION_REASON_UNKNOWN(0),
    APP_SESSION_REASON_ERROR(1),
    APP_SESSION_NETWORK_ERROR(2),
    APP_SESSION_NETWORK_RECOVERED(3),
    APP_SESSION_RECEIVER_CONNECTION_LOSS(4),
    APP_SESSION_RECEIVER_CONNECTION_RECOVERED(5),
    APP_SESSION_APP_BACKGROUNDED(6),
    APP_SESSION_APP_FOREGROUNDED(7),
    APP_SESSION_APP_STOPPED(8),
    APP_SESSION_CASTING_STOPPED(9),
    APP_SESSION_RESUMED_FROM_SAVED_SESSION(10),
    APP_SESSION_RESUMED_FROM_OPEN_URL(11),
    APP_SESSION_NETWORK_NOT_REACHABLE(12),
    APP_SESSION_GMSCORE_SERVICE_DISCONNECTED(13);


    /* JADX INFO: renamed from: u */
    public final int f22785u;

    EnumC3929m0(int i) {
        this.f22785u = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3834c5
    /* JADX INFO: renamed from: d */
    public final int mo8924d() {
        return this.f22785u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC3929m0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22785u + " name=" + name() + '>';
    }
}
