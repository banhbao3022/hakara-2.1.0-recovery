package p007c.p190n.p194b.p195a.p196i.p197f;

import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.i.f.d, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_BatchedLogRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_BatchedLogRequest extends BatchedLogRequest {

    /* JADX INFO: renamed from: a */
    public final List<LogRequest> f5605a;

    public AutoValue_BatchedLogRequest(List<LogRequest> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f5605a = list;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.BatchedLogRequest
    /* JADX INFO: renamed from: a */
    public List<LogRequest> mo2773a() {
        return this.f5605a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f5605a.equals(((BatchedLogRequest) obj).mo2773a());
        }
        return false;
    }

    public int hashCode() {
        return this.f5605a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("BatchedLogRequest{logRequests=");
        sbM1556G.append(this.f5605a);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
