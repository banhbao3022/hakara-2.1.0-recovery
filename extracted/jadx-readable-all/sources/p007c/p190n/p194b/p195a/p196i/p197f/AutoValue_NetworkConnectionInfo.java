package p007c.p190n.p194b.p195a.p196i.p197f;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.i.f.i, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_NetworkConnectionInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {

    /* JADX INFO: renamed from: a */
    public final NetworkConnectionInfo.c f5639a;

    /* JADX INFO: renamed from: b */
    public final NetworkConnectionInfo.b f5640b;

    /* JADX INFO: renamed from: c.n.b.a.i.f.i$b */
    /* JADX INFO: compiled from: AutoValue_NetworkConnectionInfo.java */
    public static final class b extends NetworkConnectionInfo.a {

        /* JADX INFO: renamed from: a */
        public NetworkConnectionInfo.c f5641a;

        /* JADX INFO: renamed from: b */
        public NetworkConnectionInfo.b f5642b;
    }

    public AutoValue_NetworkConnectionInfo(NetworkConnectionInfo.c cVar, NetworkConnectionInfo.b bVar, a aVar) {
        this.f5639a = cVar;
        this.f5640b = bVar;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.NetworkConnectionInfo
    /* JADX INFO: renamed from: a */
    public NetworkConnectionInfo.b mo2791a() {
        return this.f5640b;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.NetworkConnectionInfo
    /* JADX INFO: renamed from: b */
    public NetworkConnectionInfo.c mo2792b() {
        return this.f5639a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.c cVar = this.f5639a;
        if (cVar != null ? cVar.equals(networkConnectionInfo.mo2792b()) : networkConnectionInfo.mo2792b() == null) {
            NetworkConnectionInfo.b bVar = this.f5640b;
            if (bVar == null) {
                if (networkConnectionInfo.mo2791a() == null) {
                    return true;
                }
            } else if (bVar.equals(networkConnectionInfo.mo2791a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.c cVar = this.f5639a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.b bVar = this.f5640b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("NetworkConnectionInfo{networkType=");
        sbM1556G.append(this.f5639a);
        sbM1556G.append(", mobileSubtype=");
        sbM1556G.append(this.f5640b);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
