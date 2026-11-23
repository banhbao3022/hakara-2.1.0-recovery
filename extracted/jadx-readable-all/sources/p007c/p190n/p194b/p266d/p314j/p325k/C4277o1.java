package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.o1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4277o1 implements InterfaceC4183h5 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4183h5 f23376a = new C4277o1();

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4183h5
    /* JADX INFO: renamed from: b */
    public final boolean mo9829b(int i) {
        EnumC4249m1 enumC4249m1;
        if (i == 0) {
            enumC4249m1 = EnumC4249m1.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        } else if (i == 1) {
            enumC4249m1 = EnumC4249m1.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        } else if (i == 2) {
            enumC4249m1 = EnumC4249m1.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        } else if (i == 3) {
            enumC4249m1 = EnumC4249m1.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        } else if (i != 4) {
            enumC4249m1 = i != 5 ? null : EnumC4249m1.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
        } else {
            enumC4249m1 = EnumC4249m1.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        return enumC4249m1 != null;
    }
}
