package p007c.p190n.p194b.p195a.p196i.p197f;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.i.f.h, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_LogResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_LogResponse extends LogResponse {

    /* JADX INFO: renamed from: a */
    public final long f5638a;

    public AutoValue_LogResponse(long j2) {
        this.f5638a = j2;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogResponse
    /* JADX INFO: renamed from: b */
    public long mo2790b() {
        return this.f5638a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.f5638a == ((LogResponse) obj).mo2790b();
    }

    public int hashCode() {
        long j2 = this.f5638a;
        return 1000003 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("LogResponse{nextRequestWaitMillis=");
        sbM1556G.append(this.f5638a);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
