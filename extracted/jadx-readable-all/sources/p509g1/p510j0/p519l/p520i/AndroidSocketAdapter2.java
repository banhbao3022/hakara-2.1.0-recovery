package p509g1.p510j0.p519l.p520i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;
import p509g1.p510j0.p519l.AndroidPlatform;
import p509g1.p510j0.p519l.Platform;

/* JADX INFO: renamed from: g1.j0.l.i.f, reason: use source file name */
/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public class AndroidSocketAdapter2 implements SocketAdapter {

    /* JADX INFO: renamed from: a */
    public static final DeferredSocketAdapter.a f30557a;

    /* JADX INFO: renamed from: b */
    public static final a f30558b;

    /* JADX INFO: renamed from: c */
    public final Method f30559c;

    /* JADX INFO: renamed from: d */
    public final Method f30560d;

    /* JADX INFO: renamed from: e */
    public final Method f30561e;

    /* JADX INFO: renamed from: f */
    public final Method f30562f;

    /* JADX INFO: renamed from: g */
    public final Class<? super SSLSocket> f30563g;

    /* JADX INFO: renamed from: g1.j0.l.i.f$a */
    /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        a aVar = new a(null);
        f30558b = aVar;
        Objects.requireNonNull(aVar);
        Intrinsics2.m13090f("com.google.android.gms.org.conscrypt", "packageName");
        f30557a = new AndroidSocketAdapter("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter2(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        Intrinsics2.m13090f(cls, "sslSocketClass");
        this.f30563g = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics2.m13086b(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f30559c = declaredMethod;
        this.f30560d = cls.getMethod("setHostname", String.class);
        this.f30561e = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f30562f = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: a */
    public boolean mo13609a(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        return this.f30563g.isInstance(sSLSocket);
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: b */
    public boolean mo13610b() {
        Objects.requireNonNull(AndroidPlatform.f30519e);
        return AndroidPlatform.f30518d;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: c */
    public String mo13611c(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        if (!mo13609a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f30561e.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics2.m13086b(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if (Intrinsics2.m13085a(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: d */
    public void mo13612d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        if (mo13609a(sSLSocket)) {
            try {
                this.f30559c.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f30560d.invoke(sSLSocket, str);
                }
                this.f30562f.invoke(sSLSocket, Platform.f30547c.m13607b(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
