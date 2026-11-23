package p509g1.p510j0.p515h;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.EventListener;
import p509g1.Interceptor;
import p509g1.Request3;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.ResponseBody;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p514g.Exchange;
import p509g1.p510j0.p514g.RealCall;
import p524h1.RealBufferedSink;
import p524h1.RealBufferedSource;
import p524h1.Sink;

/* JADX INFO: renamed from: g1.j0.h.b, reason: use source file name */
/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CallServerInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final boolean f30281a;

    public CallServerInterceptor(boolean z) {
        this.f30281a = z;
    }

    @Override // p509g1.Interceptor
    public Response3 intercept(Interceptor.a aVar) throws Throwable {
        boolean z;
        Response3.a aVarM13435d;
        Response3 response3M13339a;
        Intrinsics2.m13090f(aVar, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        Exchange exchange = realInterceptorChain.f30291e;
        if (exchange == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        Request3 request3 = realInterceptorChain.f30292f;
        RequestBody requestBody = request3.f29954e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics2.m13090f(request3, "request");
        try {
            EventListener eventListener = exchange.f30189d;
            RealCall realCall = exchange.f30188c;
            Objects.requireNonNull(eventListener);
            Intrinsics2.m13090f(realCall, "call");
            exchange.f30191f.mo13478b(request3);
            EventListener eventListener2 = exchange.f30189d;
            RealCall realCall2 = exchange.f30188c;
            Objects.requireNonNull(eventListener2);
            Intrinsics2.m13090f(realCall2, "call");
            Intrinsics2.m13090f(request3, "request");
            if (!HttpMethod3.m13490a(request3.f29952c) || requestBody == null) {
                exchange.f30188c.m13449j(exchange, true, false, null);
                z = true;
                aVarM13435d = null;
            } else {
                if (StringsJVM.m12989f("100-continue", request3.m13312b("Expect"), true)) {
                    exchange.m13434c();
                    aVarM13435d = exchange.m13435d(true);
                    exchange.m13436e();
                    z = false;
                } else {
                    z = true;
                    aVarM13435d = null;
                }
                if (aVarM13435d == null) {
                    Sink sinkM13433b = exchange.m13433b(request3, false);
                    Intrinsics2.m13090f(sinkM13433b, "$this$buffer");
                    RealBufferedSink realBufferedSink = new RealBufferedSink(sinkM13433b);
                    requestBody.mo13328d(realBufferedSink);
                    realBufferedSink.close();
                } else {
                    exchange.f30188c.m13449j(exchange, true, false, null);
                    if (!exchange.f30187b.m13463j()) {
                        exchange.f30191f.mo13481e().m13465l();
                    }
                }
            }
            try {
                exchange.f30191f.mo13477a();
                if (aVarM13435d == null) {
                    aVarM13435d = exchange.m13435d(false);
                    if (aVarM13435d == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    if (z) {
                        exchange.m13436e();
                        z = false;
                    }
                }
                aVarM13435d.m13345g(request3);
                aVarM13435d.f30007e = exchange.f30187b.f30238d;
                aVarM13435d.f30013k = jCurrentTimeMillis;
                aVarM13435d.f30014l = System.currentTimeMillis();
                Response3 response3M13339a2 = aVarM13435d.m13339a();
                int i = response3M13339a2.f29993j;
                if (i == 100) {
                    Response3.a aVarM13435d2 = exchange.m13435d(false);
                    if (aVarM13435d2 == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    if (z) {
                        exchange.m13436e();
                    }
                    aVarM13435d2.m13345g(request3);
                    aVarM13435d2.f30007e = exchange.f30187b.f30238d;
                    aVarM13435d2.f30013k = jCurrentTimeMillis;
                    aVarM13435d2.f30014l = System.currentTimeMillis();
                    response3M13339a2 = aVarM13435d2.m13339a();
                    i = response3M13339a2.f29993j;
                }
                Intrinsics2.m13090f(response3M13339a2, "response");
                EventListener eventListener3 = exchange.f30189d;
                RealCall realCall3 = exchange.f30188c;
                Objects.requireNonNull(eventListener3);
                Intrinsics2.m13090f(realCall3, "call");
                Intrinsics2.m13090f(response3M13339a2, "response");
                if (this.f30281a && i == 101) {
                    Response3.a aVar2 = new Response3.a(response3M13339a2);
                    aVar2.f30009g = Util9.f30072c;
                    response3M13339a = aVar2.m13339a();
                } else {
                    Response3.a aVar3 = new Response3.a(response3M13339a2);
                    Intrinsics2.m13090f(response3M13339a2, "response");
                    try {
                        String strM13336c = Response3.m13336c(response3M13339a2, HttpHeaders.CONTENT_TYPE, null, 2);
                        long jMo13483g = exchange.f30191f.mo13483g(response3M13339a2);
                        Exchange.b bVar = new Exchange.b(exchange, exchange.f30191f.mo13479c(response3M13339a2), jMo13483g);
                        Intrinsics2.m13090f(bVar, "$this$buffer");
                        aVar3.f30009g = new RealResponseBody(strM13336c, jMo13483g, new RealBufferedSource(bVar));
                        response3M13339a = aVar3.m13339a();
                    } catch (IOException e) {
                        EventListener eventListener4 = exchange.f30189d;
                        RealCall realCall4 = exchange.f30188c;
                        Objects.requireNonNull(eventListener4);
                        Intrinsics2.m13090f(realCall4, "call");
                        Intrinsics2.m13090f(e, "ioe");
                        exchange.m13437f(e);
                        throw e;
                    }
                }
                if (StringsJVM.m12989f("close", response3M13339a.f29990g.m13312b("Connection"), true) || StringsJVM.m12989f("close", Response3.m13336c(response3M13339a, "Connection", null, 2), true)) {
                    exchange.f30191f.mo13481e().m13465l();
                }
                if (i == 204 || i == 205) {
                    ResponseBody responseBody = response3M13339a.f29996m;
                    if ((responseBody != null ? responseBody.contentLength() : -1L) > 0) {
                        StringBuilder sbM1557H = outline.m1557H("HTTP ", i, " had non-zero Content-Length: ");
                        ResponseBody responseBody2 = response3M13339a.f29996m;
                        sbM1557H.append(responseBody2 != null ? Long.valueOf(responseBody2.contentLength()) : null);
                        throw new ProtocolException(sbM1557H.toString());
                    }
                }
                return response3M13339a;
            } catch (IOException e2) {
                EventListener eventListener5 = exchange.f30189d;
                RealCall realCall5 = exchange.f30188c;
                Objects.requireNonNull(eventListener5);
                Intrinsics2.m13090f(realCall5, "call");
                Intrinsics2.m13090f(e2, "ioe");
                exchange.m13437f(e2);
                throw e2;
            }
        } catch (IOException e3) {
            EventListener eventListener6 = exchange.f30189d;
            RealCall realCall6 = exchange.f30188c;
            Objects.requireNonNull(eventListener6);
            Intrinsics2.m13090f(realCall6, "call");
            Intrinsics2.m13090f(e3, "ioe");
            exchange.m13437f(e3);
            throw e3;
        }
    }
}
