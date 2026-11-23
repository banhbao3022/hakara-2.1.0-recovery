package p555j.p556a.p557a.p617j;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import java.util.concurrent.TimeUnit;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p509g1.Interceptor;
import p509g1.OkHttpClient;
import p509g1.p510j0.Util9;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p551n.StringQualifier;
import p526i1.p536d.p543c.p553p.Scope2;

/* JADX INFO: renamed from: j.a.a.j.e, reason: use source file name */
/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkModule2 extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, OkHttpClient> {

    /* JADX INFO: renamed from: g */
    public static final NetworkModule2 f33023g = new NetworkModule2();

    public NetworkModule2() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public OkHttpClient mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        Intrinsics2.m13090f("logging", "name");
        Interceptor interceptor = (Interceptor) scope3.m13863c(Reflection.m13097a(Interceptor.class), new StringQualifier("logging"), null);
        Intrinsics2.m13090f("header", "name");
        Interceptor interceptor2 = (Interceptor) scope3.m13863c(Reflection.m13097a(Interceptor.class), new StringQualifier("header"), null);
        Module module = NetworkModule5.f33029a;
        Intrinsics2.m13089e(interceptor, "logging");
        Intrinsics2.m13089e(interceptor2, "header");
        OkHttpClient.a aVar = new OkHttpClient.a();
        long j2 = 10;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics2.m13090f(timeUnit, "unit");
        aVar.f29907y = Util9.m13362b("timeout", j2, timeUnit);
        Intrinsics2.m13090f(timeUnit, "unit");
        aVar.f29908z = Util9.m13362b("timeout", j2, timeUnit);
        Intrinsics2.m13090f(interceptor2, "interceptor");
        aVar.f29885c.add(interceptor2);
        Intrinsics2.m13090f(interceptor, "interceptor");
        aVar.f29885c.add(interceptor);
        StethoInterceptor stethoInterceptor = new StethoInterceptor();
        Intrinsics2.m13090f(stethoInterceptor, "interceptor");
        aVar.f29886d.add(stethoInterceptor);
        return new OkHttpClient(aVar);
    }
}
