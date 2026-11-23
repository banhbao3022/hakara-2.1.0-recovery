package p509g1.p510j0.p514g;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p483s.MutableCollections;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Address;
import p509g1.Call;
import p509g1.EventListener;
import p509g1.HttpUrl;
import p509g1.Route;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p513f.TaskQueue2;
import p509g1.p510j0.p517j.ConnectionShutdownException;
import p509g1.p510j0.p517j.ErrorCode2;
import p509g1.p510j0.p517j.StreamResetException;

/* JADX INFO: renamed from: g1.j0.g.d, reason: use source file name */
/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExchangeFinder {

    /* JADX INFO: renamed from: a */
    public RouteSelector.b f30203a;

    /* JADX INFO: renamed from: b */
    public RouteSelector f30204b;

    /* JADX INFO: renamed from: c */
    public int f30205c;

    /* JADX INFO: renamed from: d */
    public int f30206d;

    /* JADX INFO: renamed from: e */
    public int f30207e;

    /* JADX INFO: renamed from: f */
    public Route f30208f;

    /* JADX INFO: renamed from: g */
    public final RealConnectionPool f30209g;

    /* JADX INFO: renamed from: h */
    public final Address f30210h;

    /* JADX INFO: renamed from: i */
    public final RealCall f30211i;

    /* JADX INFO: renamed from: j */
    public final EventListener f30212j;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        Intrinsics2.m13090f(realConnectionPool, "connectionPool");
        Intrinsics2.m13090f(address, "address");
        Intrinsics2.m13090f(realCall, "call");
        Intrinsics2.m13090f(eventListener, "eventListener");
        this.f30209g = realConnectionPool;
        this.f30210h = address;
        this.f30211i = realCall;
        this.f30212j = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0252  */
    /* JADX WARN: Code duplicated, block: B:115:0x026b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0277  */
    /* JADX WARN: Code duplicated, block: B:119:0x027d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0288  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:176:0x02eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX INFO: renamed from: a */
    public final RealConnection m13440a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        Route routeM13474b;
        RouteSelector.b bVar;
        RouteSelector routeSelector;
        ArrayList arrayList;
        RouteSelector.b bVar2;
        List<Route> list;
        RealCall realCall;
        Proxy proxy;
        String hostName;
        int port;
        boolean zContains;
        RealConnection realConnection;
        RouteDatabase routeDatabase;
        Route route;
        RealConnection realConnection2;
        RealCall realCall2;
        Socket socketM13451l;
        while (!this.f30211i.f30225r) {
            RealConnection realConnection3 = this.f30211i.f30219l;
            if (realConnection3 != null) {
                synchronized (realConnection3) {
                    socketM13451l = (realConnection3.f30243i || !m13441b(realConnection3.f30251q.f30034a.f29835a)) ? this.f30211i.m13451l() : null;
                }
                if (this.f30211i.f30219l != null) {
                    if (!(socketM13451l == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (socketM13451l != null) {
                        Util9.m13365e(socketM13451l);
                    }
                    EventListener eventListener = this.f30212j;
                    RealCall realCall3 = this.f30211i;
                    Objects.requireNonNull(eventListener);
                    Intrinsics2.m13090f(realCall3, "call");
                    Intrinsics2.m13090f(realConnection3, "connection");
                    this.f30205c = 0;
                    this.f30206d = 0;
                    this.f30207e = 0;
                    if (this.f30209g.m13469a(this.f30210h, this.f30211i, null, false)) {
                        realCall2 = this.f30211i;
                        realConnection3 = realCall2.f30219l;
                        if (realConnection3 != null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        this.f30212j.m13643a(realCall2, realConnection3);
                    } else {
                        routeM13474b = this.f30208f;
                        try {
                            if (routeM13474b != null) {
                                this.f30208f = null;
                            } else {
                                bVar = this.f30203a;
                                if (bVar == null && bVar.m13473a()) {
                                    RouteSelector.b bVar3 = this.f30203a;
                                    if (bVar3 == null) {
                                        Intrinsics2.m13095k();
                                        throw null;
                                    }
                                    routeM13474b = bVar3.m13474b();
                                } else {
                                    routeSelector = this.f30204b;
                                    if (routeSelector == null) {
                                        Address address = this.f30210h;
                                        RealCall realCall4 = this.f30211i;
                                        routeSelector = new RouteSelector(address, realCall4.f30228u.f29860L, realCall4, this.f30212j);
                                        this.f30204b = routeSelector;
                                    }
                                    if (routeSelector.m13471a()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (routeSelector.m13472b()) {
                                        if (routeSelector.m13472b()) {
                                            StringBuilder sbM1556G = outline.m1556G("No route to ");
                                            sbM1556G.append(routeSelector.f30271f.f29835a.f30647g);
                                            sbM1556G.append("; exhausted proxy configurations: ");
                                            sbM1556G.append(routeSelector.f30267b);
                                            throw new SocketException(sbM1556G.toString());
                                        }
                                        List<? extends Proxy> list2 = routeSelector.f30267b;
                                        int i5 = routeSelector.f30268c;
                                        routeSelector.f30268c = i5 + 1;
                                        proxy = list2.get(i5);
                                        ArrayList arrayList2 = new ArrayList();
                                        routeSelector.f30269d = arrayList2;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            HttpUrl httpUrl = routeSelector.f30271f.f29835a;
                                            hostName = httpUrl.f30647g;
                                            port = httpUrl.f30648h;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                StringBuilder sbM1556G2 = outline.m1556G("Proxy.address() is not an InetSocketAddress: ");
                                                sbM1556G2.append(socketAddressAddress.getClass());
                                                throw new IllegalArgumentException(sbM1556G2.toString().toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            Objects.requireNonNull(RouteSelector.f30266a);
                                            Intrinsics2.m13090f(inetSocketAddress, "$this$socketHost");
                                            InetAddress address2 = inetSocketAddress.getAddress();
                                            if (address2 != null) {
                                                hostName = address2.getHostAddress();
                                                Intrinsics2.m13086b(hostName, "address.hostAddress");
                                            } else {
                                                hostName = inetSocketAddress.getHostName();
                                                Intrinsics2.m13086b(hostName, "hostName");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || 65535 < port) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            EventListener eventListener2 = routeSelector.f30274i;
                                            Call call = routeSelector.f30273h;
                                            Objects.requireNonNull(eventListener2);
                                            Intrinsics2.m13090f(call, "call");
                                            Intrinsics2.m13090f(hostName, "domainName");
                                            List<InetAddress> listMo13642a = routeSelector.f30271f.f29838d.mo13642a(hostName);
                                            if (listMo13642a.isEmpty()) {
                                                throw new UnknownHostException(routeSelector.f30271f.f29838d + " returned no addresses for " + hostName);
                                            }
                                            EventListener eventListener3 = routeSelector.f30274i;
                                            Call call2 = routeSelector.f30273h;
                                            Objects.requireNonNull(eventListener3);
                                            Intrinsics2.m13090f(call2, "call");
                                            Intrinsics2.m13090f(hostName, "domainName");
                                            Intrinsics2.m13090f(listMo13642a, "inetAddressList");
                                            Iterator<InetAddress> it = listMo13642a.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InetSocketAddress(it.next(), port));
                                            }
                                        }
                                        Iterator<? extends InetSocketAddress> it2 = routeSelector.f30269d.iterator();
                                        while (it2.hasNext()) {
                                            Route route2 = new Route(routeSelector.f30271f, proxy, it2.next());
                                            RouteDatabase routeDatabase2 = routeSelector.f30272g;
                                            synchronized (routeDatabase2) {
                                                Intrinsics2.m13090f(route2, "route");
                                                zContains = routeDatabase2.f30263a.contains(route2);
                                            }
                                            if (zContains) {
                                                routeSelector.f30270e.add(route2);
                                            } else {
                                                arrayList.add(route2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        MutableCollections.m13043h(arrayList, routeSelector.f30270e);
                                        routeSelector.f30270e.clear();
                                    }
                                    bVar2 = new RouteSelector.b(arrayList);
                                    this.f30203a = bVar2;
                                    list = bVar2.f30276b;
                                    if (!this.f30211i.f30225r) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f30209g.m13469a(this.f30210h, this.f30211i, list, false)) {
                                        realCall = this.f30211i;
                                        realConnection3 = realCall.f30219l;
                                        if (realConnection3 != null) {
                                            Intrinsics2.m13095k();
                                            throw null;
                                        }
                                        this.f30212j.m13643a(realCall, realConnection3);
                                    } else {
                                        routeM13474b = bVar2.m13474b();
                                        realConnection = new RealConnection(this.f30209g, routeM13474b);
                                        this.f30211i.f30227t = realConnection;
                                        realConnection.m13456c(i, i2, i3, i4, z, this.f30211i, this.f30212j);
                                        this.f30211i.f30227t = null;
                                        routeDatabase = this.f30211i.f30228u.f29860L;
                                        route = realConnection.f30251q;
                                        synchronized (routeDatabase) {
                                            Intrinsics2.m13090f(route, "route");
                                            routeDatabase.f30263a.remove(route);
                                        }
                                        if (this.f30209g.m13469a(this.f30210h, this.f30211i, list, true)) {
                                            realConnection2 = this.f30211i.f30219l;
                                            if (realConnection2 != null) {
                                                Intrinsics2.m13095k();
                                                throw null;
                                            }
                                            this.f30208f = routeM13474b;
                                            Util9.m13365e(realConnection.m13467n());
                                            this.f30212j.m13643a(this.f30211i, realConnection2);
                                            realConnection3 = realConnection2;
                                        } else {
                                            synchronized (realConnection) {
                                                RealConnectionPool realConnectionPool = this.f30209g;
                                                Objects.requireNonNull(realConnectionPool);
                                                Intrinsics2.m13090f(realConnection, "connection");
                                                byte[] bArr = Util9.f30070a;
                                                realConnectionPool.f30260d.add(realConnection);
                                                TaskQueue2.m13416d(realConnectionPool.f30258b, realConnectionPool.f30259c, 0L, 2);
                                                this.f30211i.m13444b(realConnection);
                                            }
                                            EventListener eventListener4 = this.f30212j;
                                            RealCall realCall5 = this.f30211i;
                                            Objects.requireNonNull(eventListener4);
                                            Intrinsics2.m13090f(realCall5, "call");
                                            Intrinsics2.m13090f(realConnection, "connection");
                                            realConnection3 = realConnection;
                                        }
                                    }
                                }
                            }
                            realConnection.m13456c(i, i2, i3, i4, z, this.f30211i, this.f30212j);
                            this.f30211i.f30227t = null;
                            routeDatabase = this.f30211i.f30228u.f29860L;
                            route = realConnection.f30251q;
                            synchronized (routeDatabase) {
                                Intrinsics2.m13090f(route, "route");
                                routeDatabase.f30263a.remove(route);
                                if (this.f30209g.m13469a(this.f30210h, this.f30211i, list, true)) {
                                    realConnection2 = this.f30211i.f30219l;
                                    if (realConnection2 != null) {
                                        Intrinsics2.m13095k();
                                        throw null;
                                    }
                                    this.f30208f = routeM13474b;
                                    Util9.m13365e(realConnection.m13467n());
                                    this.f30212j.m13643a(this.f30211i, realConnection2);
                                    realConnection3 = realConnection2;
                                } else {
                                    synchronized (realConnection) {
                                        RealConnectionPool realConnectionPool2 = this.f30209g;
                                        Objects.requireNonNull(realConnectionPool2);
                                        Intrinsics2.m13090f(realConnection, "connection");
                                        byte[] bArr2 = Util9.f30070a;
                                        realConnectionPool2.f30260d.add(realConnection);
                                        TaskQueue2.m13416d(realConnectionPool2.f30258b, realConnectionPool2.f30259c, 0L, 2);
                                        this.f30211i.m13444b(realConnection);
                                        EventListener eventListener5 = this.f30212j;
                                        RealCall realCall6 = this.f30211i;
                                        Objects.requireNonNull(eventListener5);
                                        Intrinsics2.m13090f(realCall6, "call");
                                        Intrinsics2.m13090f(realConnection, "connection");
                                        realConnection3 = realConnection;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            this.f30211i.f30227t = null;
                            throw th;
                        }
                        list = null;
                        realConnection = new RealConnection(this.f30209g, routeM13474b);
                        this.f30211i.f30227t = realConnection;
                    }
                }
            } else {
                this.f30205c = 0;
                this.f30206d = 0;
                this.f30207e = 0;
                if (this.f30209g.m13469a(this.f30210h, this.f30211i, null, false)) {
                    realCall2 = this.f30211i;
                    realConnection3 = realCall2.f30219l;
                    if (realConnection3 != null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    this.f30212j.m13643a(realCall2, realConnection3);
                } else {
                    routeM13474b = this.f30208f;
                    if (routeM13474b != null) {
                        this.f30208f = null;
                    } else {
                        bVar = this.f30203a;
                        if (bVar == null) {
                        }
                        routeSelector = this.f30204b;
                        if (routeSelector == null) {
                            Address address3 = this.f30210h;
                            RealCall realCall7 = this.f30211i;
                            routeSelector = new RouteSelector(address3, realCall7.f30228u.f29860L, realCall7, this.f30212j);
                            this.f30204b = routeSelector;
                        }
                        if (routeSelector.m13471a()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (routeSelector.m13472b()) {
                            if (routeSelector.m13472b()) {
                                StringBuilder sbM1556G3 = outline.m1556G("No route to ");
                                sbM1556G3.append(routeSelector.f30271f.f29835a.f30647g);
                                sbM1556G3.append("; exhausted proxy configurations: ");
                                sbM1556G3.append(routeSelector.f30267b);
                                throw new SocketException(sbM1556G3.toString());
                            }
                            List<? extends Proxy> list3 = routeSelector.f30267b;
                            int i6 = routeSelector.f30268c;
                            routeSelector.f30268c = i6 + 1;
                            proxy = list3.get(i6);
                            ArrayList arrayList3 = new ArrayList();
                            routeSelector.f30269d = arrayList3;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                HttpUrl httpUrl2 = routeSelector.f30271f.f29835a;
                                hostName = httpUrl2.f30647g;
                                port = httpUrl2.f30648h;
                            } else {
                                HttpUrl httpUrl3 = routeSelector.f30271f.f29835a;
                                hostName = httpUrl3.f30647g;
                                port = httpUrl3.f30648h;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            MutableCollections.m13043h(arrayList, routeSelector.f30270e);
                            routeSelector.f30270e.clear();
                        }
                        bVar2 = new RouteSelector.b(arrayList);
                        this.f30203a = bVar2;
                        list = bVar2.f30276b;
                        if (!this.f30211i.f30225r) {
                            throw new IOException("Canceled");
                        }
                        if (this.f30209g.m13469a(this.f30210h, this.f30211i, list, false)) {
                            realCall = this.f30211i;
                            realConnection3 = realCall.f30219l;
                            if (realConnection3 != null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            this.f30212j.m13643a(realCall, realConnection3);
                        } else {
                            routeM13474b = bVar2.m13474b();
                            realConnection = new RealConnection(this.f30209g, routeM13474b);
                            this.f30211i.f30227t = realConnection;
                            realConnection.m13456c(i, i2, i3, i4, z, this.f30211i, this.f30212j);
                            this.f30211i.f30227t = null;
                            routeDatabase = this.f30211i.f30228u.f29860L;
                            route = realConnection.f30251q;
                            synchronized (routeDatabase) {
                                Intrinsics2.m13090f(route, "route");
                                routeDatabase.f30263a.remove(route);
                                if (this.f30209g.m13469a(this.f30210h, this.f30211i, list, true)) {
                                    realConnection2 = this.f30211i.f30219l;
                                    if (realConnection2 != null) {
                                        Intrinsics2.m13095k();
                                        throw null;
                                    }
                                    this.f30208f = routeM13474b;
                                    Util9.m13365e(realConnection.m13467n());
                                    this.f30212j.m13643a(this.f30211i, realConnection2);
                                    realConnection3 = realConnection2;
                                } else {
                                    synchronized (realConnection) {
                                        RealConnectionPool realConnectionPool3 = this.f30209g;
                                        Objects.requireNonNull(realConnectionPool3);
                                        Intrinsics2.m13090f(realConnection, "connection");
                                        byte[] bArr3 = Util9.f30070a;
                                        realConnectionPool3.f30260d.add(realConnection);
                                        TaskQueue2.m13416d(realConnectionPool3.f30258b, realConnectionPool3.f30259c, 0L, 2);
                                        this.f30211i.m13444b(realConnection);
                                        EventListener eventListener6 = this.f30212j;
                                        RealCall realCall8 = this.f30211i;
                                        Objects.requireNonNull(eventListener6);
                                        Intrinsics2.m13090f(realCall8, "call");
                                        Intrinsics2.m13090f(realConnection, "connection");
                                        realConnection3 = realConnection;
                                    }
                                }
                            }
                        }
                    }
                    list = null;
                    realConnection = new RealConnection(this.f30209g, routeM13474b);
                    this.f30211i.f30227t = realConnection;
                    realConnection.m13456c(i, i2, i3, i4, z, this.f30211i, this.f30212j);
                    this.f30211i.f30227t = null;
                    routeDatabase = this.f30211i.f30228u.f29860L;
                    route = realConnection.f30251q;
                    synchronized (routeDatabase) {
                        Intrinsics2.m13090f(route, "route");
                        routeDatabase.f30263a.remove(route);
                        if (this.f30209g.m13469a(this.f30210h, this.f30211i, list, true)) {
                            realConnection2 = this.f30211i.f30219l;
                            if (realConnection2 != null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            this.f30208f = routeM13474b;
                            Util9.m13365e(realConnection.m13467n());
                            this.f30212j.m13643a(this.f30211i, realConnection2);
                            realConnection3 = realConnection2;
                        } else {
                            synchronized (realConnection) {
                                RealConnectionPool realConnectionPool4 = this.f30209g;
                                Objects.requireNonNull(realConnectionPool4);
                                Intrinsics2.m13090f(realConnection, "connection");
                                byte[] bArr4 = Util9.f30070a;
                                realConnectionPool4.f30260d.add(realConnection);
                                TaskQueue2.m13416d(realConnectionPool4.f30258b, realConnectionPool4.f30259c, 0L, 2);
                                this.f30211i.m13444b(realConnection);
                                EventListener eventListener7 = this.f30212j;
                                RealCall realCall9 = this.f30211i;
                                Objects.requireNonNull(eventListener7);
                                Intrinsics2.m13090f(realCall9, "call");
                                Intrinsics2.m13090f(realConnection, "connection");
                                realConnection3 = realConnection;
                            }
                        }
                    }
                }
            }
            if (realConnection3.m13462i(z2)) {
                return realConnection3;
            }
            realConnection3.m13465l();
            if (this.f30208f == null) {
                RouteSelector.b bVar4 = this.f30203a;
                if (bVar4 != null ? bVar4.m13473a() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector2 = this.f30204b;
                    if (!(routeSelector2 != null ? routeSelector2.m13471a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13441b(HttpUrl httpUrl) {
        Intrinsics2.m13090f(httpUrl, "url");
        HttpUrl httpUrl2 = this.f30210h.f29835a;
        return httpUrl.f30648h == httpUrl2.f30648h && Intrinsics2.m13085a(httpUrl.f30647g, httpUrl2.f30647g);
    }

    /* JADX INFO: renamed from: c */
    public final void m13442c(IOException iOException) {
        Intrinsics2.m13090f(iOException, "e");
        this.f30208f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f30513f == ErrorCode2.REFUSED_STREAM) {
            this.f30205c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f30206d++;
        } else {
            this.f30207e++;
        }
    }
}
