package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.e4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2979e4<T> {

    /* JADX INFO: renamed from: a */
    public final String f13487a;

    /* JADX INFO: renamed from: b */
    public final T f13488b;

    /* JADX INFO: renamed from: c */
    public final int f13489c;

    public C2979e4(String str, T t, int i) {
        this.f13487a = str;
        this.f13488b = t;
        this.f13489c = i;
    }

    /* JADX INFO: renamed from: a */
    public static C2979e4<Boolean> m6600a(String str, boolean z) {
        return new C2979e4<>(str, Boolean.valueOf(z), 1);
    }

    /* JADX INFO: renamed from: b */
    public static C2979e4<Long> m6601b(String str, long j2) {
        return new C2979e4<>(str, Long.valueOf(j2), 2);
    }

    /* JADX INFO: renamed from: c */
    public static C2979e4<String> m6602c(String str, String str2) {
        return new C2979e4<>(str, str2, 4);
    }

    /* JADX INFO: renamed from: d */
    public final T m6603d() {
        InterfaceC2906c5 interfaceC2906c5 = C2943d5.f13175a.get();
        if (interfaceC2906c5 == null) {
            throw new IllegalStateException("Flag is not initialized.");
        }
        int i = this.f13489c - 1;
        if (i == 0) {
            return (T) interfaceC2906c5.mo6146d(this.f13487a, ((Boolean) this.f13488b).booleanValue());
        }
        if (i != 1) {
            return i != 2 ? (T) interfaceC2906c5.mo6143a(this.f13487a, (String) this.f13488b) : (T) interfaceC2906c5.mo6145c(this.f13487a, ((Double) this.f13488b).doubleValue());
        }
        return (T) interfaceC2906c5.mo6144b(this.f13487a, ((Long) this.f13488b).longValue());
    }
}
