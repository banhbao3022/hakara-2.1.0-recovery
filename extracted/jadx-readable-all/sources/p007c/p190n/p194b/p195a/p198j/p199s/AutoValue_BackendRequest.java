package p007c.p190n.p194b.p195a.p198j.p199s;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.p198j.EventInternal;

/* JADX INFO: renamed from: c.n.b.a.j.s.a, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_BackendRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_BackendRequest extends BackendRequest {

    /* JADX INFO: renamed from: a */
    public final Iterable<EventInternal> f5759a;

    /* JADX INFO: renamed from: b */
    public final byte[] f5760b;

    /* JADX INFO: renamed from: c.n.b.a.j.s.a$b */
    /* JADX INFO: compiled from: AutoValue_BackendRequest.java */
    public static final class b extends BackendRequest.a {

        /* JADX INFO: renamed from: a */
        public Iterable<EventInternal> f5761a;

        /* JADX INFO: renamed from: b */
        public byte[] f5762b;
    }

    public AutoValue_BackendRequest(Iterable iterable, byte[] bArr, a aVar) {
        this.f5759a = iterable;
        this.f5760b = bArr;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.BackendRequest
    /* JADX INFO: renamed from: a */
    public Iterable<EventInternal> mo2823a() {
        return this.f5759a;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.BackendRequest
    /* JADX INFO: renamed from: b */
    public byte[] mo2824b() {
        return this.f5760b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f5759a.equals(backendRequest.mo2823a())) {
            if (Arrays.equals(this.f5760b, backendRequest instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) backendRequest).f5760b : backendRequest.mo2824b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5759a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5760b);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("BackendRequest{events=");
        sbM1556G.append(this.f5759a);
        sbM1556G.append(", extras=");
        sbM1556G.append(Arrays.toString(this.f5760b));
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
