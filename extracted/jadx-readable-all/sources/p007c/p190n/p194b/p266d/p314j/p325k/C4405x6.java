package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.x6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4405x6 implements InterfaceC4212j6 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4240l6 f23623a;

    /* JADX INFO: renamed from: b */
    public final String f23624b;

    /* JADX INFO: renamed from: c */
    public final Object[] f23625c;

    /* JADX INFO: renamed from: d */
    public final int f23626d;

    public C4405x6(InterfaceC4240l6 interfaceC4240l6, String str, Object[] objArr) {
        this.f23623a = interfaceC4240l6;
        this.f23624b = str;
        this.f23625c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f23626d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f23626d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4212j6
    /* JADX INFO: renamed from: a */
    public final boolean mo9834a() {
        return (this.f23626d & 2) == 2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4212j6
    /* JADX INFO: renamed from: b */
    public final InterfaceC4240l6 mo9835b() {
        return this.f23623a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4212j6
    public final int zza() {
        return (this.f23626d & 1) == 1 ? 1 : 2;
    }
}
