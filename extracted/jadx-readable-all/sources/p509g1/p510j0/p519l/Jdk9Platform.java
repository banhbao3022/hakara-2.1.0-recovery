package p509g1.p510j0.p519l;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p477d1.TypeCastException;
import p477d1.p481d0.StringNumberConversions;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;

/* JADX INFO: renamed from: g1.j0.l.f, reason: use source file name */
/* JADX INFO: compiled from: Jdk9Platform.kt */
/* JADX INFO: loaded from: classes2.dex */
public class Jdk9Platform extends Platform {

    /* JADX INFO: renamed from: d */
    public static final boolean f30540d;

    /* JADX INFO: renamed from: e */
    public static final a f30541e = new a(null);

    /* JADX INFO: renamed from: g1.j0.l.f$a */
    /* JADX INFO: compiled from: Jdk9Platform.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM12986c = property != null ? StringNumberConversions.m12986c(property) : null;
        boolean z = true;
        if (numM12986c == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z = false;
            }
        } else if (numM12986c.intValue() < 9) {
            z = false;
        }
        f30540d = z;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: d */
    public void mo13591d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> listM13606a = Platform.f30547c.m13606a(list);
        Intrinsics2.m13086b(sSLParameters, "sslParameters");
        Object[] array = ((ArrayList) listM13606a).toArray(new String[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: f */
    public String mo13592f(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || Intrinsics2.m13085a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
        }
    }
}
