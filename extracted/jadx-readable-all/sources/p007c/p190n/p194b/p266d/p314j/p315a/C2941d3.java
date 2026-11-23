package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.d3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2941d3 implements InterfaceC2906c5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC2978e3 f13169a;

    public C2941d3(SharedPreferencesOnSharedPreferenceChangeListenerC2978e3 sharedPreferencesOnSharedPreferenceChangeListenerC2978e3) {
        this.f13169a = sharedPreferencesOnSharedPreferenceChangeListenerC2978e3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2906c5
    /* JADX INFO: renamed from: a */
    public final String mo6143a(String str, String str2) {
        return this.f13169a.f13470e.getString(str, str2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2906c5
    /* JADX INFO: renamed from: b */
    public final Long mo6144b(String str, long j2) {
        try {
            return Long.valueOf(this.f13169a.f13470e.getLong(str, j2));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f13169a.f13470e.getInt(str, (int) j2));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2906c5
    /* JADX INFO: renamed from: c */
    public final Double mo6145c(String str, double d) {
        return Double.valueOf(this.f13169a.f13470e.getFloat(str, (float) d));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2906c5
    /* JADX INFO: renamed from: d */
    public final Boolean mo6146d(String str, boolean z) {
        return Boolean.valueOf(this.f13169a.f13470e.getBoolean(str, z));
    }
}
