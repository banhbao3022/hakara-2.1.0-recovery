package p509g1.p510j0.p514g;

import java.io.IOException;
import java.util.Objects;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Interceptor;
import p509g1.OkHttpClient;
import p509g1.Response3;
import p509g1.p510j0.p515h.RealInterceptorChain;

/* JADX INFO: renamed from: g1.j0.g.a, reason: use source file name */
/* JADX INFO: compiled from: ConnectInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConnectInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public static final ConnectInterceptor f30181a = new ConnectInterceptor();

    @Override // p509g1.Interceptor
    public Response3 intercept(Interceptor.a aVar) throws IOException {
        Intrinsics2.m13090f(aVar, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        RealCall realCall = realInterceptorChain.f30288b;
        Objects.requireNonNull(realCall);
        Intrinsics2.m13090f(realInterceptorChain, "chain");
        synchronized (realCall) {
            if (!realCall.f30224q) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!realCall.f30223p)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!realCall.f30222o)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ExchangeFinder exchangeFinder = realCall.f30218k;
        if (exchangeFinder == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        OkHttpClient okHttpClient = realCall.f30228u;
        Intrinsics2.m13090f(okHttpClient, "client");
        Intrinsics2.m13090f(realInterceptorChain, "chain");
        try {
            Exchange exchange = new Exchange(realCall, realCall.f30214g, exchangeFinder, exchangeFinder.m13440a(realInterceptorChain.f30293g, realInterceptorChain.f30294h, realInterceptorChain.f30295i, okHttpClient.f29858J, okHttpClient.f29866n, !Intrinsics2.m13085a(realInterceptorChain.f30292f.f29952c, "GET")).m13464k(okHttpClient, realInterceptorChain));
            realCall.f30221n = exchange;
            realCall.f30226s = exchange;
            synchronized (realCall) {
                realCall.f30222o = true;
                realCall.f30223p = true;
            }
            if (realCall.f30225r) {
                throw new IOException("Canceled");
            }
            return RealInterceptorChain.m13491d(realInterceptorChain, 0, exchange, null, 0, 0, 0, 61).mo13492a(realInterceptorChain.f30292f);
        } catch (RouteException e) {
            exchangeFinder.m13442c(e.f30264f);
            throw e;
        } catch (IOException e2) {
            exchangeFinder.m13442c(e2);
            throw new RouteException(e2);
        }
    }
}
