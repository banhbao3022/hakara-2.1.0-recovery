package p509g1.p510j0.p514g;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p477d1.p483s.Collections4;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Address;
import p509g1.Call;
import p509g1.EventListener;
import p509g1.HttpUrl;
import p509g1.Route;

/* JADX INFO: renamed from: g1.j0.g.m, reason: use source file name */
/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RouteSelector {

    /* JADX INFO: renamed from: a */
    public static final a f30266a = new a(null);

    /* JADX INFO: renamed from: b */
    public List<? extends Proxy> f30267b;

    /* JADX INFO: renamed from: c */
    public int f30268c;

    /* JADX INFO: renamed from: d */
    public List<? extends InetSocketAddress> f30269d;

    /* JADX INFO: renamed from: e */
    public final List<Route> f30270e;

    /* JADX INFO: renamed from: f */
    public final Address f30271f;

    /* JADX INFO: renamed from: g */
    public final RouteDatabase f30272g;

    /* JADX INFO: renamed from: h */
    public final Call f30273h;

    /* JADX INFO: renamed from: i */
    public final EventListener f30274i;

    /* JADX INFO: renamed from: g1.j0.g.m$a */
    /* JADX INFO: compiled from: RouteSelector.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.g.m$b */
    /* JADX INFO: compiled from: RouteSelector.kt */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f30275a;

        /* JADX INFO: renamed from: b */
        public final List<Route> f30276b;

        public b(List<Route> list) {
            Intrinsics2.m13090f(list, "routes");
            this.f30276b = list;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m13473a() {
            return this.f30275a < this.f30276b.size();
        }

        /* JADX INFO: renamed from: b */
        public final Route m13474b() {
            if (!m13473a()) {
                throw new NoSuchElementException();
            }
            List<Route> list = this.f30276b;
            int i = this.f30275a;
            this.f30275a = i + 1;
            return list.get(i);
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        Intrinsics2.m13090f(address, "address");
        Intrinsics2.m13090f(routeDatabase, "routeDatabase");
        Intrinsics2.m13090f(call, "call");
        Intrinsics2.m13090f(eventListener, "eventListener");
        this.f30271f = address;
        this.f30272g = routeDatabase;
        this.f30273h = call;
        this.f30274i = eventListener;
        Collections4 collections4 = Collections4.f29519f;
        this.f30267b = collections4;
        this.f30269d = collections4;
        this.f30270e = new ArrayList();
        HttpUrl httpUrl = address.f29835a;
        RouteSelector2 routeSelector2 = new RouteSelector2(this, address.f29844j, httpUrl);
        Objects.requireNonNull(eventListener);
        Intrinsics2.m13090f(call, "call");
        Intrinsics2.m13090f(httpUrl, "url");
        List<Proxy> listM13475a = routeSelector2.mo2c();
        this.f30267b = listM13475a;
        this.f30268c = 0;
        Objects.requireNonNull(eventListener);
        Intrinsics2.m13090f(call, "call");
        Intrinsics2.m13090f(httpUrl, "url");
        Intrinsics2.m13090f(listM13475a, "proxies");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13471a() {
        return m13472b() || (this.f30270e.isEmpty() ^ true);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13472b() {
        return this.f30268c < this.f30267b.size();
    }
}
