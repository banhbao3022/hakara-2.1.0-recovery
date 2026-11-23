package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.m0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2281m0 {

    /* JADX INFO: renamed from: a */
    public long f10747a;

    /* JADX INFO: renamed from: b */
    public long f10748b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public final Object f10749c = new Object();

    public C2281m0(long j2) {
        this.f10747a = j2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4790a() {
        synchronized (this.f10749c) {
            long jMo5621a = C2330u.f10884a.f10896k.mo5621a();
            if (this.f10748b + this.f10747a > jMo5621a) {
                return false;
            }
            this.f10748b = jMo5621a;
            return true;
        }
    }
}
