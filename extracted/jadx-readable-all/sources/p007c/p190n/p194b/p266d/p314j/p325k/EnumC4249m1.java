package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.m1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4249m1 implements InterfaceC4155f5 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* JADX INFO: renamed from: m */
    public final int f23310m;

    EnumC4249m1(int i) {
        this.f23310m = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC4249m1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f23310m + " name=" + name() + '>';
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4155f5
    public final int zza() {
        return this.f23310m;
    }
}
