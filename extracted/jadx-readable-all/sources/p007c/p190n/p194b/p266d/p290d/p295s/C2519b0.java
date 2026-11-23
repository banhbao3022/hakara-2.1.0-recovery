package p007c.p190n.p194b.p266d.p290d.p295s;

import com.google.android.gms.common.api.Status;
import p007c.p190n.p194b.p266d.p290d.C2380d;
import p007c.p190n.p194b.p266d.p290d.C2383e;

/* JADX INFO: renamed from: c.n.b.d.d.s.b0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2519b0 implements C2383e.a {

    /* JADX INFO: renamed from: f */
    public final Status f11376f;

    /* JADX INFO: renamed from: g */
    public final C2380d f11377g;

    /* JADX INFO: renamed from: h */
    public final String f11378h;

    /* JADX INFO: renamed from: i */
    public final String f11379i;

    /* JADX INFO: renamed from: j */
    public final boolean f11380j;

    public C2519b0(Status status, C2380d c2380d, String str, String str2, boolean z) {
        this.f11376f = status;
        this.f11377g = c2380d;
        this.f11378h = str;
        this.f11379i = str2;
        this.f11380j = z;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k
    /* JADX INFO: renamed from: B */
    public final Status mo4909B() {
        return this.f11376f;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.C2383e.a
    /* JADX INFO: renamed from: D */
    public final String mo4951D() {
        return this.f11379i;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.C2383e.a
    /* JADX INFO: renamed from: c */
    public final boolean mo4952c() {
        return this.f11380j;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.C2383e.a
    /* JADX INFO: renamed from: f */
    public final String mo4953f() {
        return this.f11378h;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.C2383e.a
    /* JADX INFO: renamed from: t */
    public final C2380d mo4954t() {
        return this.f11377g;
    }

    public C2519b0(Status status) {
        this(status, null, null, null, false);
    }
}
