package p509g1.p510j0.p521m;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p477d1.p483s.CollectionsJVM;

/* JADX INFO: renamed from: g1.j0.m.a, reason: use source file name */
/* JADX INFO: compiled from: NullProxySelector.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NullProxySelector extends ProxySelector {

    /* JADX INFO: renamed from: a */
    public static final NullProxySelector f30575a = new NullProxySelector();

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return CollectionsJVM.m13036a(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
