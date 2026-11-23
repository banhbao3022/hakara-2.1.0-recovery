package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.AbstractC2245a0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.or */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3372or extends AbstractC2245a0 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC3704xp f17723b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3669wr f17724c;

    /* JADX INFO: renamed from: d */
    public final String f17725d;

    /* JADX INFO: renamed from: e */
    public final String[] f17726e;

    public C3372or(InterfaceC3704xp interfaceC3704xp, AbstractC3669wr abstractC3669wr, String str, String[] strArr) {
        this.f17723b = interfaceC3704xp;
        this.f17724c = abstractC3669wr;
        this.f17725d = str;
        this.f17726e = strArr;
        C2330u.f10884a.f10885A.f18081f.add(this);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.AbstractC2245a0
    /* JADX INFO: renamed from: a */
    public final void mo4671a() {
        try {
            this.f17724c.mo6678i(this.f17725d, this.f17726e);
        } finally {
            C2267h1.f10713a.post(new RunnableC3335nr(this));
        }
    }
}
