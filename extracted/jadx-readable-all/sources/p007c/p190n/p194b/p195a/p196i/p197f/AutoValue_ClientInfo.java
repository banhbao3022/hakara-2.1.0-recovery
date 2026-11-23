package p007c.p190n.p194b.p195a.p196i.p197f;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.i.f.e, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_ClientInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_ClientInfo extends ClientInfo {

    /* JADX INFO: renamed from: a */
    public final ClientInfo.b f5606a;

    /* JADX INFO: renamed from: b */
    public final AndroidClientInfo f5607b;

    /* JADX INFO: renamed from: c.n.b.a.i.f.e$b */
    /* JADX INFO: compiled from: AutoValue_ClientInfo.java */
    public static final class b extends ClientInfo.a {

        /* JADX INFO: renamed from: a */
        public ClientInfo.b f5608a;

        /* JADX INFO: renamed from: b */
        public AndroidClientInfo f5609b;
    }

    public AutoValue_ClientInfo(ClientInfo.b bVar, AndroidClientInfo androidClientInfo, a aVar) {
        this.f5606a = bVar;
        this.f5607b = androidClientInfo;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.ClientInfo
    /* JADX INFO: renamed from: a */
    public AndroidClientInfo mo2774a() {
        return this.f5607b;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.ClientInfo
    /* JADX INFO: renamed from: b */
    public ClientInfo.b mo2775b() {
        return this.f5606a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.b bVar = this.f5606a;
        if (bVar != null ? bVar.equals(clientInfo.mo2775b()) : clientInfo.mo2775b() == null) {
            AndroidClientInfo androidClientInfo = this.f5607b;
            if (androidClientInfo == null) {
                if (clientInfo.mo2774a() == null) {
                    return true;
                }
            } else if (androidClientInfo.equals(clientInfo.mo2774a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ClientInfo.b bVar = this.f5606a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f5607b;
        return iHashCode ^ (androidClientInfo != null ? androidClientInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ClientInfo{clientType=");
        sbM1556G.append(this.f5606a);
        sbM1556G.append(", androidClientInfo=");
        sbM1556G.append(this.f5607b);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
