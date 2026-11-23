package p007c.p190n.p194b.p266d.p314j.p315a;

import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mg0 {

    /* JADX INFO: renamed from: a */
    public static final mg0 f16747a = new mg0(new lg0());

    /* JADX INFO: renamed from: b */
    public final InterfaceC3314n6 f16748b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3240l6 f16749c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3759z6 f16750d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3648w6 f16751e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3503sa f16752f;

    /* JADX INFO: renamed from: g */
    public final SimpleArrayMap<String, InterfaceC3536t6> f16753g;

    /* JADX INFO: renamed from: h */
    public final SimpleArrayMap<String, InterfaceC3425q6> f16754h;

    public mg0(lg0 lg0Var) {
        this.f16748b = lg0Var.f16347a;
        this.f16749c = lg0Var.f16348b;
        this.f16750d = lg0Var.f16349c;
        this.f16753g = new SimpleArrayMap<>(lg0Var.f16352f);
        this.f16754h = new SimpleArrayMap<>(lg0Var.f16353g);
        this.f16751e = lg0Var.f16350d;
        this.f16752f = lg0Var.f16351e;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3425q6 m7697a(String str) {
        return this.f16754h.getOrDefault(str, null);
    }
}
