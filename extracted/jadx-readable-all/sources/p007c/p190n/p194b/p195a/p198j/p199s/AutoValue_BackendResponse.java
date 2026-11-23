package p007c.p190n.p194b.p195a.p198j.p199s;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.j.s.b, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_BackendResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_BackendResponse extends BackendResponse {

    /* JADX INFO: renamed from: a */
    public final BackendResponse.a f5763a;

    /* JADX INFO: renamed from: b */
    public final long f5764b;

    public AutoValue_BackendResponse(BackendResponse.a aVar, long j2) {
        Objects.requireNonNull(aVar, "Null status");
        this.f5763a = aVar;
        this.f5764b = j2;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.BackendResponse
    /* JADX INFO: renamed from: b */
    public long mo2825b() {
        return this.f5764b;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.BackendResponse
    /* JADX INFO: renamed from: c */
    public BackendResponse.a mo2826c() {
        return this.f5763a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f5763a.equals(backendResponse.mo2826c()) && this.f5764b == backendResponse.mo2825b();
    }

    public int hashCode() {
        int iHashCode = (this.f5763a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f5764b;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("BackendResponse{status=");
        sbM1556G.append(this.f5763a);
        sbM1556G.append(", nextRequestWaitMillis=");
        sbM1556G.append(this.f5764b);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
