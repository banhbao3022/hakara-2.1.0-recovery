package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class go2 implements zn2 {

    /* JADX INFO: renamed from: a */
    public boolean f14629a;

    /* JADX INFO: renamed from: b */
    public long f14630b;

    /* JADX INFO: renamed from: c */
    public long f14631c;

    /* JADX INFO: renamed from: d */
    public gh2 f14632d = gh2.f14588a;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zn2
    /* JADX INFO: renamed from: D */
    public final long mo7011D() {
        long j2 = this.f14630b;
        if (!this.f14629a) {
            return j2;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f14631c;
        gh2 gh2Var = this.f14632d;
        return gh2Var.f14589b == 1.0f ? j2 + og2.m8009b(jElapsedRealtime) : j2 + (jElapsedRealtime * ((long) gh2Var.f14591d));
    }

    /* JADX INFO: renamed from: a */
    public final void m7012a(long j2) {
        this.f14630b = j2;
        if (this.f14629a) {
            this.f14631c = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7013b(zn2 zn2Var) {
        m7012a(zn2Var.mo7011D());
        this.f14632d = zn2Var.mo7015r();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zn2
    /* JADX INFO: renamed from: o */
    public final gh2 mo7014o(gh2 gh2Var) {
        if (this.f14629a) {
            m7012a(mo7011D());
        }
        this.f14632d = gh2Var;
        return gh2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zn2
    /* JADX INFO: renamed from: r */
    public final gh2 mo7015r() {
        throw null;
    }
}
