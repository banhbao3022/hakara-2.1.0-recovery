package p509g1.p510j0.p519l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;

/* JADX INFO: renamed from: g1.j0.l.e, reason: use source file name */
/* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* JADX INFO: renamed from: d */
    public static final b f30531d = new b(null);

    /* JADX INFO: renamed from: e */
    public final Method f30532e;

    /* JADX INFO: renamed from: f */
    public final Method f30533f;

    /* JADX INFO: renamed from: g */
    public final Method f30534g;

    /* JADX INFO: renamed from: h */
    public final Class<?> f30535h;

    /* JADX INFO: renamed from: i */
    public final Class<?> f30536i;

    /* JADX INFO: renamed from: g1.j0.l.e$a */
    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public boolean f30537a;

        /* JADX INFO: renamed from: b */
        public String f30538b;

        /* JADX INFO: renamed from: c */
        public final List<String> f30539c;

        public a(List<String> list) {
            Intrinsics2.m13090f(list, "protocols");
            this.f30539c = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Intrinsics2.m13090f(obj, "proxy");
            Intrinsics2.m13090f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics2.m13085a(name, "supports") && Intrinsics2.m13085a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics2.m13085a(name, "unsupported") && Intrinsics2.m13085a(Void.TYPE, returnType)) {
                this.f30537a = true;
                return null;
            }
            if (Intrinsics2.m13085a(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f30539c;
                }
            }
            if ((!Intrinsics2.m13085a(name, "selectProtocol") && !Intrinsics2.m13085a(name, "select")) || !Intrinsics2.m13085a(String.class, returnType) || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!Intrinsics2.m13085a(name, "protocolSelected") && !Intrinsics2.m13085a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj2 = objArr[0];
                if (obj2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                this.f30538b = (String) obj2;
                return null;
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
            }
            List list = (List) obj3;
            int size = list.size();
            if (size >= 0) {
                int i = 0;
                while (true) {
                    Object obj4 = list.get(i);
                    if (obj4 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = (String) obj4;
                    if (!this.f30539c.contains(str)) {
                        if (i == size) {
                            break;
                        }
                        i++;
                    } else {
                        this.f30538b = str;
                        return str;
                    }
                }
            }
            String str2 = this.f30539c.get(0);
            this.f30538b = str2;
            return str2;
        }
    }

    /* JADX INFO: renamed from: g1.j0.l.e$b */
    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        Intrinsics2.m13090f(method, "putMethod");
        Intrinsics2.m13090f(method2, "getMethod");
        Intrinsics2.m13090f(method3, "removeMethod");
        Intrinsics2.m13090f(cls, "clientProviderClass");
        Intrinsics2.m13090f(cls2, "serverProviderClass");
        this.f30532e = method;
        this.f30533f = method2;
        this.f30534g = method3;
        this.f30535h = cls;
        this.f30536i = cls2;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: a */
    public void mo13603a(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        try {
            this.f30534g.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: d */
    public void mo13591d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        try {
            this.f30532e.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f30535h, this.f30536i}, new a(Platform.f30547c.m13606a(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: f */
    public String mo13592f(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f30533f.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new TypeCastException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            boolean z = aVar.f30537a;
            if (!z && aVar.f30538b == null) {
                Platform.m13604j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (z) {
                return null;
            }
            return aVar.f30538b;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
