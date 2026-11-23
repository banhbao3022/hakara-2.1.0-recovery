package p007c.p190n.p194b.p266d.p314j.p315a;

import android.location.Location;
import java.util.Date;
import java.util.Set;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e;

/* JADX INFO: renamed from: c.n.b.d.j.a.fe */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3026fe implements InterfaceC2111e {

    /* JADX INFO: renamed from: a */
    public final Date f14021a;

    /* JADX INFO: renamed from: b */
    public final int f14022b;

    /* JADX INFO: renamed from: c */
    public final Set<String> f14023c;

    /* JADX INFO: renamed from: d */
    public final boolean f14024d;

    /* JADX INFO: renamed from: e */
    public final Location f14025e;

    /* JADX INFO: renamed from: f */
    public final int f14026f;

    /* JADX INFO: renamed from: g */
    public final boolean f14027g;

    public C3026fe(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f14021a = date;
        this.f14022b = i;
        this.f14023c = set;
        this.f14025e = location;
        this.f14024d = z;
        this.f14026f = i2;
        this.f14027g = z2;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    /* JADX INFO: renamed from: a */
    public final int mo4604a() {
        return this.f14026f;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    @Deprecated
    /* JADX INFO: renamed from: b */
    public final boolean mo4605b() {
        return this.f14027g;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    @Deprecated
    /* JADX INFO: renamed from: c */
    public final Date mo4606c() {
        return this.f14021a;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    /* JADX INFO: renamed from: d */
    public final boolean mo4607d() {
        return this.f14024d;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    /* JADX INFO: renamed from: e */
    public final Set<String> mo4608e() {
        return this.f14023c;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    /* JADX INFO: renamed from: f */
    public final Location mo4609f() {
        return this.f14025e;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    @Deprecated
    /* JADX INFO: renamed from: g */
    public final int mo4610g() {
        return this.f14022b;
    }
}
