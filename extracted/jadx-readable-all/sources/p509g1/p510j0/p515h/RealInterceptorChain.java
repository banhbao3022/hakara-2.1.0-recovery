package p509g1.p510j0.p515h;

import java.io.IOException;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Connection;
import p509g1.Interceptor;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.p510j0.p514g.Exchange;
import p509g1.p510j0.p514g.RealCall;

/* JADX INFO: renamed from: g1.j0.h.g, reason: use source file name */
/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealInterceptorChain implements Interceptor.a {

    /* JADX INFO: renamed from: a */
    public int f30287a;

    /* JADX INFO: renamed from: b */
    public final RealCall f30288b;

    /* JADX INFO: renamed from: c */
    public final List<Interceptor> f30289c;

    /* JADX INFO: renamed from: d */
    public final int f30290d;

    /* JADX INFO: renamed from: e */
    public final Exchange f30291e;

    /* JADX INFO: renamed from: f */
    public final Request3 f30292f;

    /* JADX INFO: renamed from: g */
    public final int f30293g;

    /* JADX INFO: renamed from: h */
    public final int f30294h;

    /* JADX INFO: renamed from: i */
    public final int f30295i;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i, Exchange exchange, Request3 request3, int i2, int i3, int i4) {
        Intrinsics2.m13090f(realCall, "call");
        Intrinsics2.m13090f(list, "interceptors");
        Intrinsics2.m13090f(request3, "request");
        this.f30288b = realCall;
        this.f30289c = list;
        this.f30290d = i;
        this.f30291e = exchange;
        this.f30292f = request3;
        this.f30293g = i2;
        this.f30294h = i3;
        this.f30295i = i4;
    }

    /* JADX INFO: renamed from: d */
    public static RealInterceptorChain m13491d(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request3 request3, int i2, int i3, int i4, int i5) {
        int i6 = (i5 & 1) != 0 ? realInterceptorChain.f30290d : i;
        Exchange exchange2 = (i5 & 2) != 0 ? realInterceptorChain.f30291e : exchange;
        Request3 request4 = (i5 & 4) != 0 ? realInterceptorChain.f30292f : request3;
        int i7 = (i5 & 8) != 0 ? realInterceptorChain.f30293g : i2;
        int i8 = (i5 & 16) != 0 ? realInterceptorChain.f30294h : i3;
        int i9 = (i5 & 32) != 0 ? realInterceptorChain.f30295i : i4;
        Intrinsics2.m13090f(request4, "request");
        return new RealInterceptorChain(realInterceptorChain.f30288b, realInterceptorChain.f30289c, i6, exchange2, request4, i7, i8, i9);
    }

    @Override // p509g1.Interceptor.a
    /* JADX INFO: renamed from: a */
    public Response3 mo13492a(Request3 request3) throws IOException {
        Intrinsics2.m13090f(request3, "request");
        if (!(this.f30290d < this.f30289c.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f30287a++;
        Exchange exchange = this.f30291e;
        if (exchange != null) {
            if (!exchange.f30190e.m13441b(request3.f29951b)) {
                StringBuilder sbM1556G = outline.m1556G("network interceptor ");
                sbM1556G.append(this.f30289c.get(this.f30290d - 1));
                sbM1556G.append(" must retain the same host and port");
                throw new IllegalStateException(sbM1556G.toString().toString());
            }
            if (!(this.f30287a == 1)) {
                StringBuilder sbM1556G2 = outline.m1556G("network interceptor ");
                sbM1556G2.append(this.f30289c.get(this.f30290d - 1));
                sbM1556G2.append(" must call proceed() exactly once");
                throw new IllegalStateException(sbM1556G2.toString().toString());
            }
        }
        RealInterceptorChain realInterceptorChainM13491d = m13491d(this, this.f30290d + 1, null, request3, 0, 0, 0, 58);
        Interceptor interceptor = this.f30289c.get(this.f30290d);
        Response3 response3Intercept = interceptor.intercept(realInterceptorChainM13491d);
        if (response3Intercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.f30291e != null) {
            if (!(this.f30290d + 1 >= this.f30289c.size() || realInterceptorChainM13491d.f30287a == 1)) {
                throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
            }
        }
        if (response3Intercept.f29996m != null) {
            return response3Intercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // p509g1.Interceptor.a
    /* JADX INFO: renamed from: b */
    public Connection mo13493b() {
        Exchange exchange = this.f30291e;
        if (exchange != null) {
            return exchange.f30187b;
        }
        return null;
    }

    @Override // p509g1.Interceptor.a
    /* JADX INFO: renamed from: c */
    public Request3 mo13494c() {
        return this.f30292f;
    }
}
