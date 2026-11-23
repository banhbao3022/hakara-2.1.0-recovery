package p007c.p190n.p194b.p195a.p196i.p197f;

import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.i.f.g, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_LogRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_LogRequest extends LogRequest {

    /* JADX INFO: renamed from: a */
    public final long f5624a;

    /* JADX INFO: renamed from: b */
    public final long f5625b;

    /* JADX INFO: renamed from: c */
    public final ClientInfo f5626c;

    /* JADX INFO: renamed from: d */
    public final Integer f5627d;

    /* JADX INFO: renamed from: e */
    public final String f5628e;

    /* JADX INFO: renamed from: f */
    public final List<LogEvent> f5629f;

    /* JADX INFO: renamed from: g */
    public final QosTier f5630g;

    /* JADX INFO: renamed from: c.n.b.a.i.f.g$b */
    /* JADX INFO: compiled from: AutoValue_LogRequest.java */
    public static final class b extends LogRequest.a {

        /* JADX INFO: renamed from: a */
        public Long f5631a;

        /* JADX INFO: renamed from: b */
        public Long f5632b;

        /* JADX INFO: renamed from: c */
        public ClientInfo f5633c;

        /* JADX INFO: renamed from: d */
        public Integer f5634d;

        /* JADX INFO: renamed from: e */
        public String f5635e;

        /* JADX INFO: renamed from: f */
        public List<LogEvent> f5636f;

        /* JADX INFO: renamed from: g */
        public QosTier f5637g;
    }

    public AutoValue_LogRequest(long j2, long j3, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier, a aVar) {
        this.f5624a = j2;
        this.f5625b = j3;
        this.f5626c = clientInfo;
        this.f5627d = num;
        this.f5628e = str;
        this.f5629f = list;
        this.f5630g = qosTier;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogRequest
    /* JADX INFO: renamed from: a */
    public ClientInfo mo2783a() {
        return this.f5626c;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogRequest
    /* JADX INFO: renamed from: b */
    public List<LogEvent> mo2784b() {
        return this.f5629f;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogRequest
    /* JADX INFO: renamed from: c */
    public Integer mo2785c() {
        return this.f5627d;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogRequest
    /* JADX INFO: renamed from: d */
    public String mo2786d() {
        return this.f5628e;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogRequest
    /* JADX INFO: renamed from: e */
    public QosTier mo2787e() {
        return this.f5630g;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<LogEvent> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f5624a == logRequest.mo2788f() && this.f5625b == logRequest.mo2789g() && ((clientInfo = this.f5626c) != null ? clientInfo.equals(logRequest.mo2783a()) : logRequest.mo2783a() == null) && ((num = this.f5627d) != null ? num.equals(logRequest.mo2785c()) : logRequest.mo2785c() == null) && ((str = this.f5628e) != null ? str.equals(logRequest.mo2786d()) : logRequest.mo2786d() == null) && ((list = this.f5629f) != null ? list.equals(logRequest.mo2784b()) : logRequest.mo2784b() == null)) {
            QosTier qosTier = this.f5630g;
            if (qosTier == null) {
                if (logRequest.mo2787e() == null) {
                    return true;
                }
            } else if (qosTier.equals(logRequest.mo2787e())) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogRequest
    /* JADX INFO: renamed from: f */
    public long mo2788f() {
        return this.f5624a;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogRequest
    /* JADX INFO: renamed from: g */
    public long mo2789g() {
        return this.f5625b;
    }

    public int hashCode() {
        long j2 = this.f5624a;
        long j3 = this.f5625b;
        int i = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        ClientInfo clientInfo = this.f5626c;
        int iHashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f5627d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f5628e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<LogEvent> list = this.f5629f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f5630g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("LogRequest{requestTimeMs=");
        sbM1556G.append(this.f5624a);
        sbM1556G.append(", requestUptimeMs=");
        sbM1556G.append(this.f5625b);
        sbM1556G.append(", clientInfo=");
        sbM1556G.append(this.f5626c);
        sbM1556G.append(", logSource=");
        sbM1556G.append(this.f5627d);
        sbM1556G.append(", logSourceName=");
        sbM1556G.append(this.f5628e);
        sbM1556G.append(", logEvents=");
        sbM1556G.append(this.f5629f);
        sbM1556G.append(", qosTier=");
        sbM1556G.append(this.f5630g);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
