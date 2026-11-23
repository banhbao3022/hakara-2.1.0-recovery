package p007c.p190n.p194b.p266d.p298f;

/* JADX INFO: renamed from: c.n.b.d.f.p0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2710p0 {

    /* JADX INFO: renamed from: a */
    public static final C2710p0 f11779a = new C2710p0(true, null, null);

    /* JADX INFO: renamed from: b */
    public final boolean f11780b;

    /* JADX INFO: renamed from: c */
    public final String f11781c;

    /* JADX INFO: renamed from: d */
    public final Throwable f11782d;

    public C2710p0(boolean z, String str, Throwable th) {
        this.f11780b = z;
        this.f11781c = str;
        this.f11782d = th;
    }

    /* JADX INFO: renamed from: b */
    public static C2710p0 m5559b(String str) {
        return new C2710p0(false, str, null);
    }

    /* JADX INFO: renamed from: c */
    public static C2710p0 m5560c(String str, Throwable th) {
        return new C2710p0(false, str, th);
    }

    /* JADX INFO: renamed from: a */
    public String mo5558a() {
        return this.f11781c;
    }
}
