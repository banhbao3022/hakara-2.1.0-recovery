package p509g1;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.h0, reason: use source file name */
/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Route {

    /* JADX INFO: renamed from: a */
    public final Address f30034a;

    /* JADX INFO: renamed from: b */
    public final Proxy f30035b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f30036c;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Intrinsics2.m13090f(address, "address");
        Intrinsics2.m13090f(proxy, "proxy");
        Intrinsics2.m13090f(inetSocketAddress, "socketAddress");
        this.f30034a = address;
        this.f30035b = proxy;
        this.f30036c = inetSocketAddress;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13354a() {
        return this.f30034a.f29840f != null && this.f30035b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (Intrinsics2.m13085a(route.f30034a, this.f30034a) && Intrinsics2.m13085a(route.f30035b, this.f30035b) && Intrinsics2.m13085a(route.f30036c, this.f30036c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f30036c.hashCode() + ((this.f30035b.hashCode() + ((this.f30034a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Route{");
        sbM1556G.append(this.f30036c);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
