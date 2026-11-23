package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.v6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4023v6 implements InterfaceC3875g6 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3895i6 f22963a;

    /* JADX INFO: renamed from: b */
    public final String f22964b;

    /* JADX INFO: renamed from: c */
    public final Object[] f22965c;

    /* JADX INFO: renamed from: d */
    public final int f22966d;

    public C4023v6(InterfaceC3895i6 interfaceC3895i6, String str, Object[] objArr) {
        this.f22963a = interfaceC3895i6;
        this.f22964b = str;
        this.f22965c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f22966d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f22966d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3875g6
    /* JADX INFO: renamed from: a */
    public final InterfaceC3895i6 mo9026a() {
        return this.f22963a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3875g6
    /* JADX INFO: renamed from: b */
    public final int mo9027b() {
        return (this.f22966d & 1) == 1 ? 1 : 2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3875g6
    /* JADX INFO: renamed from: c */
    public final boolean mo9028c() {
        return (this.f22966d & 2) == 2;
    }
}
