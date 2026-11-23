package p509g1.p510j0.p514g;

import java.net.Proxy;
import java.net.URI;
import java.util.List;
import p477d1.p483s.CollectionsJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p509g1.HttpUrl;
import p509g1.p510j0.Util9;

/* JADX INFO: renamed from: g1.j0.g.n, reason: use source file name */
/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RouteSelector2 extends Lambda implements InterfaceC6153a<List<? extends Proxy>> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RouteSelector f30277g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Proxy f30278h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ HttpUrl f30279i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelector2(RouteSelector routeSelector, Proxy proxy, HttpUrl httpUrl) {
        super(0);
        this.f30277g = routeSelector;
        this.f30278h = proxy;
        this.f30279i = httpUrl;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Proxy> mo2c() {
        Proxy proxy = this.f30278h;
        if (proxy != null) {
            return CollectionsJVM.m13036a(proxy);
        }
        URI uriM13672i = this.f30279i.m13672i();
        if (uriM13672i.getHost() == null) {
            return Util9.m13372l(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = this.f30277g.f30271f.f29845k.select(uriM13672i);
        return listSelect == null || listSelect.isEmpty() ? Util9.m13372l(Proxy.NO_PROXY) : Util9.m13384x(listSelect);
    }
}
