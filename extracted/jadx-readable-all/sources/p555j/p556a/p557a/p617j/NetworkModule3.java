package p555j.p556a.p557a.p617j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p430e.Gson6;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p509g1.HttpUrl;
import p509g1.OkHttpClient;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p623k1.BuiltInConverters;
import p623k1.CompletableFutureCallAdapterFactory;
import p623k1.DefaultCallAdapterFactory;
import p623k1.OptionalConverterFactory;
import p623k1.Platform2;
import p623k1.Retrofit;
import p623k1.p624f0.p625a.GsonConverterFactory;

/* JADX INFO: renamed from: j.a.a.j.f, reason: use source file name */
/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkModule3 extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, Retrofit> {

    /* JADX INFO: renamed from: g */
    public static final NetworkModule3 f33025g = new NetworkModule3();

    public NetworkModule3() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Retrofit mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        OkHttpClient okHttpClient = (OkHttpClient) scope3.m13863c(Reflection.m13097a(OkHttpClient.class), null, null);
        Module module = NetworkModule5.f33029a;
        Intrinsics2.m13089e(okHttpClient, "okHttpClient");
        Retrofit.a aVar = new Retrofit.a();
        aVar.f33124d.add(new GsonConverterFactory(new Gson6()));
        HttpUrl httpUrlM13681c = HttpUrl.f30642b.m13681c("https://api.karavietnam.com/");
        List<String> list = httpUrlM13681c.f30649i;
        if (!"".equals(list.get(list.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrlM13681c);
        }
        aVar.f33123c = httpUrlM13681c;
        aVar.f33122b = okHttpClient;
        Executor executorMo14306a = aVar.f33121a.mo14306a();
        ArrayList arrayList = new ArrayList(aVar.f33125e);
        Platform2 platform2 = aVar.f33121a;
        Objects.requireNonNull(platform2);
        DefaultCallAdapterFactory defaultCallAdapterFactory = new DefaultCallAdapterFactory(executorMo14306a);
        arrayList.addAll(platform2.f33238b ? Arrays.asList(CompletableFutureCallAdapterFactory.f33151a, defaultCallAdapterFactory) : Collections.singletonList(defaultCallAdapterFactory));
        ArrayList arrayList2 = new ArrayList(aVar.f33124d.size() + 1 + (aVar.f33121a.f33238b ? 1 : 0));
        arrayList2.add(new BuiltInConverters());
        arrayList2.addAll(aVar.f33124d);
        arrayList2.addAll(aVar.f33121a.f33238b ? Collections.singletonList(OptionalConverterFactory.f33194a) : Collections.emptyList());
        Retrofit retrofit = new Retrofit(okHttpClient, aVar.f33123c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executorMo14306a, false);
        Intrinsics2.m13088d(retrofit, "Retrofit.Builder()\n//   …pClient)\n        .build()");
        return retrofit;
    }
}
