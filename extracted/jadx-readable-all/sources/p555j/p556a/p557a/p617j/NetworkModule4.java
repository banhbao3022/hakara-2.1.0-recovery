package p555j.p556a.p557a.p617j;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.Collections;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p623k1.Platform2;
import p623k1.Retrofit;
import p623k1.Retrofit2;

/* JADX INFO: renamed from: j.a.a.j.g, reason: use source file name */
/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkModule4 extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, ApiService> {

    /* JADX INFO: renamed from: g */
    public static final NetworkModule4 f33027g = new NetworkModule4();

    public NetworkModule4() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public ApiService mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        Retrofit retrofit = (Retrofit) scope3.m13863c(Reflection.m13097a(Retrofit.class), null, null);
        Module module = NetworkModule5.f33029a;
        Intrinsics2.m13089e(retrofit, "retrofit");
        if (!ApiService.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(ApiService.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls.getName());
                if (cls != ApiService.class) {
                    sb.append(" which is an interface of ");
                    sb.append(ApiService.class.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        if (retrofit.f33120g) {
            Platform2 platform2 = Platform2.f33237a;
            for (Method method : ApiService.class.getDeclaredMethods()) {
                if (!(platform2.f33238b && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                    retrofit.m14265b(method);
                }
            }
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(ApiService.class.getClassLoader(), new Class[]{ApiService.class}, new Retrofit2(retrofit, ApiService.class));
        Intrinsics2.m13088d(objNewProxyInstance, "retrofit.create(ApiService::class.java)");
        return (ApiService) objNewProxyInstance;
    }
}
