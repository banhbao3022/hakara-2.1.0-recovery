package p509g1.p510j0.p519l;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p483s.Iterables2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.OkHttpClient;
import p509g1.Protocol;
import p509g1.p510j0.p519l.p520i.AndroidLog;
import p509g1.p510j0.p519l.p520i.AndroidLog2;
import p509g1.p510j0.p522n.BasicCertificateChainCleaner;
import p509g1.p510j0.p522n.BasicTrustRootIndex;
import p509g1.p510j0.p522n.CertificateChainCleaner;
import p509g1.p510j0.p522n.TrustRootIndex;
import p524h1.Buffer3;

/* JADX INFO: renamed from: g1.j0.l.h, reason: use source file name */
/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes2.dex */
public class Platform {

    /* JADX INFO: renamed from: a */
    public static volatile Platform f30545a;

    /* JADX INFO: renamed from: b */
    public static final Logger f30546b;

    /* JADX INFO: renamed from: c */
    public static final a f30547c;

    /* JADX INFO: renamed from: g1.j0.l.h$a */
    /* JADX INFO: compiled from: Platform.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m13606a(List<? extends Protocol> list) {
            Intrinsics2.m13090f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(Iterables2.m13042g(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).f29918n);
            }
            return arrayList2;
        }

        /* JADX INFO: renamed from: b */
        public final byte[] m13607b(List<? extends Protocol> list) {
            Intrinsics2.m13090f(list, "protocols");
            Buffer3 buffer3 = new Buffer3();
            for (String str : (ArrayList) m13606a(list)) {
                buffer3.m13721J0(str.length());
                buffer3.m13729P0(str);
            }
            return buffer3.mo13756w();
        }

        /* JADX INFO: renamed from: c */
        public final boolean m13608c() {
            return Intrinsics2.m13085a("Dalvik", System.getProperty("java.vm.name"));
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:66:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v21, types: [g1.j0.l.h] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v43, types: [g1.j0.l.h] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r1v0, types: [d1.x.c.f] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    static {
        Provider provider;
        Provider provider2;
        ?? platform;
        String property;
        Jdk9Platform jdk9Platform;
        OpenJSSEPlatform openJSSEPlatform;
        BouncyCastlePlatform bouncyCastlePlatform;
        ConscryptPlatform conscryptPlatform;
        AndroidPlatform androidPlatform;
        Android10Platform android10Platform;
        ?? jdk8WithJettyBootPlatform = 0;
        jdk8WithJettyBootPlatform = 0;
        a aVar = new a(null);
        f30547c = aVar;
        if (aVar.m13608c()) {
            AndroidLog androidLog = AndroidLog.f30554c;
            for (Map.Entry<String, String> entry : AndroidLog.f30553b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Logger logger = Logger.getLogger(key);
                if (AndroidLog.f30552a.add(logger)) {
                    Intrinsics2.m13086b(logger, "logger");
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(AndroidLog2.f30555a);
                }
            }
            Objects.requireNonNull(Android10Platform.f30516e);
            if (Android10Platform.f30515d) {
                android10Platform = new Android10Platform();
            } else {
                platform = 0;
            }
            if (platform == 0) {
                Objects.requireNonNull(AndroidPlatform.f30519e);
                if (AndroidPlatform.f30518d) {
                    androidPlatform = new AndroidPlatform();
                } else {
                    platform = 0;
                }
                if (platform == 0) {
                    platform = android10Platform;
                    platform = android10Platform;
                    platform = androidPlatform;
                    Intrinsics2.m13095k();
                    throw null;
                }
            }
        } else {
            Provider provider3 = Security.getProviders()[0];
            Intrinsics2.m13086b(provider3, "Security.getProviders()[0]");
            if (Intrinsics2.m13085a("Conscrypt", provider3.getName())) {
                Objects.requireNonNull(ConscryptPlatform.f30528e);
                if (ConscryptPlatform.f30527d) {
                    conscryptPlatform = new ConscryptPlatform(jdk8WithJettyBootPlatform);
                } else {
                    platform = 0;
                }
                if (platform == 0) {
                    platform = conscryptPlatform;
                    provider = Security.getProviders()[0];
                    Intrinsics2.m13086b(provider, "Security.getProviders()[0]");
                    if (Intrinsics2.m13085a("BC", provider.getName())) {
                        Objects.requireNonNull(BouncyCastlePlatform.f30525e);
                        if (BouncyCastlePlatform.f30524d) {
                            bouncyCastlePlatform = new BouncyCastlePlatform(jdk8WithJettyBootPlatform);
                        } else {
                            platform = 0;
                        }
                        if (platform == 0) {
                            platform = bouncyCastlePlatform;
                            provider2 = Security.getProviders()[0];
                            Intrinsics2.m13086b(provider2, "Security.getProviders()[0]");
                            if (Intrinsics2.m13085a("OpenJSSE", provider2.getName())) {
                                Objects.requireNonNull(OpenJSSEPlatform.f30543e);
                                if (OpenJSSEPlatform.f30542d) {
                                    openJSSEPlatform = new OpenJSSEPlatform(jdk8WithJettyBootPlatform);
                                } else {
                                    platform = 0;
                                }
                                if (platform == 0) {
                                    platform = openJSSEPlatform;
                                    Objects.requireNonNull(Jdk9Platform.f30541e);
                                    if (Jdk9Platform.f30540d) {
                                        jdk9Platform = new Jdk9Platform();
                                    } else {
                                        platform = 0;
                                    }
                                    if (platform == 0) {
                                        platform = jdk9Platform;
                                        Objects.requireNonNull(Jdk8WithJettyBootPlatform.f30531d);
                                        property = System.getProperty("java.specification.version", "unknown");
                                        try {
                                            Intrinsics2.m13086b(property, "jvmVersion");
                                            if (Integer.parseInt(property) < 9) {
                                                try {
                                                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                                                    Method method2 = cls.getMethod("get", SSLSocket.class);
                                                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                                                    Intrinsics2.m13086b(method, "putMethod");
                                                    Intrinsics2.m13086b(method2, "getMethod");
                                                    Intrinsics2.m13086b(method3, "removeMethod");
                                                    Intrinsics2.m13086b(cls3, "clientProviderClass");
                                                    Intrinsics2.m13086b(cls4, "serverProviderClass");
                                                    jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
                                                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                                                }
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                        if (jdk8WithJettyBootPlatform != 0) {
                                            platform = jdk8WithJettyBootPlatform;
                                        } else {
                                            platform = new Platform();
                                        }
                                    }
                                }
                            } else {
                                platform = openJSSEPlatform;
                                Objects.requireNonNull(Jdk9Platform.f30541e);
                                if (Jdk9Platform.f30540d) {
                                    jdk9Platform = new Jdk9Platform();
                                } else {
                                    platform = 0;
                                }
                                if (platform == 0) {
                                    platform = jdk9Platform;
                                    Objects.requireNonNull(Jdk8WithJettyBootPlatform.f30531d);
                                    property = System.getProperty("java.specification.version", "unknown");
                                    Intrinsics2.m13086b(property, "jvmVersion");
                                    if (Integer.parseInt(property) < 9) {
                                        Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method method4 = cls5.getMethod("put", SSLSocket.class, cls6);
                                        Method method5 = cls5.getMethod("get", SSLSocket.class);
                                        Method method6 = cls5.getMethod("remove", SSLSocket.class);
                                        Intrinsics2.m13086b(method4, "putMethod");
                                        Intrinsics2.m13086b(method5, "getMethod");
                                        Intrinsics2.m13086b(method6, "removeMethod");
                                        Intrinsics2.m13086b(cls7, "clientProviderClass");
                                        Intrinsics2.m13086b(cls8, "serverProviderClass");
                                        jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(method4, method5, method6, cls7, cls8);
                                    }
                                    if (jdk8WithJettyBootPlatform != 0) {
                                        platform = jdk8WithJettyBootPlatform;
                                    } else {
                                        platform = new Platform();
                                    }
                                }
                            }
                        }
                    } else {
                        platform = bouncyCastlePlatform;
                        provider2 = Security.getProviders()[0];
                        Intrinsics2.m13086b(provider2, "Security.getProviders()[0]");
                        if (Intrinsics2.m13085a("OpenJSSE", provider2.getName())) {
                            Objects.requireNonNull(OpenJSSEPlatform.f30543e);
                            if (OpenJSSEPlatform.f30542d) {
                                openJSSEPlatform = new OpenJSSEPlatform(jdk8WithJettyBootPlatform);
                            } else {
                                platform = 0;
                            }
                            if (platform == 0) {
                                platform = openJSSEPlatform;
                                Objects.requireNonNull(Jdk9Platform.f30541e);
                                if (Jdk9Platform.f30540d) {
                                    jdk9Platform = new Jdk9Platform();
                                } else {
                                    platform = 0;
                                }
                                if (platform == 0) {
                                    platform = jdk9Platform;
                                    Objects.requireNonNull(Jdk8WithJettyBootPlatform.f30531d);
                                    property = System.getProperty("java.specification.version", "unknown");
                                    Intrinsics2.m13086b(property, "jvmVersion");
                                    if (Integer.parseInt(property) < 9) {
                                        Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method method7 = cls9.getMethod("put", SSLSocket.class, cls10);
                                        Method method8 = cls9.getMethod("get", SSLSocket.class);
                                        Method method9 = cls9.getMethod("remove", SSLSocket.class);
                                        Intrinsics2.m13086b(method7, "putMethod");
                                        Intrinsics2.m13086b(method8, "getMethod");
                                        Intrinsics2.m13086b(method9, "removeMethod");
                                        Intrinsics2.m13086b(cls11, "clientProviderClass");
                                        Intrinsics2.m13086b(cls12, "serverProviderClass");
                                        jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(method7, method8, method9, cls11, cls12);
                                    }
                                    if (jdk8WithJettyBootPlatform != 0) {
                                        platform = jdk8WithJettyBootPlatform;
                                    } else {
                                        platform = new Platform();
                                    }
                                }
                            }
                        } else {
                            platform = openJSSEPlatform;
                            Objects.requireNonNull(Jdk9Platform.f30541e);
                            if (Jdk9Platform.f30540d) {
                                jdk9Platform = new Jdk9Platform();
                            } else {
                                platform = 0;
                            }
                            if (platform == 0) {
                                platform = jdk9Platform;
                                Objects.requireNonNull(Jdk8WithJettyBootPlatform.f30531d);
                                property = System.getProperty("java.specification.version", "unknown");
                                Intrinsics2.m13086b(property, "jvmVersion");
                                if (Integer.parseInt(property) < 9) {
                                    Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method10 = cls13.getMethod("put", SSLSocket.class, cls14);
                                    Method method11 = cls13.getMethod("get", SSLSocket.class);
                                    Method method12 = cls13.getMethod("remove", SSLSocket.class);
                                    Intrinsics2.m13086b(method10, "putMethod");
                                    Intrinsics2.m13086b(method11, "getMethod");
                                    Intrinsics2.m13086b(method12, "removeMethod");
                                    Intrinsics2.m13086b(cls15, "clientProviderClass");
                                    Intrinsics2.m13086b(cls16, "serverProviderClass");
                                    jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(method10, method11, method12, cls15, cls16);
                                }
                                if (jdk8WithJettyBootPlatform != 0) {
                                    platform = jdk8WithJettyBootPlatform;
                                } else {
                                    platform = new Platform();
                                }
                            }
                        }
                    }
                }
            } else {
                platform = conscryptPlatform;
                provider = Security.getProviders()[0];
                Intrinsics2.m13086b(provider, "Security.getProviders()[0]");
                if (Intrinsics2.m13085a("BC", provider.getName())) {
                    Objects.requireNonNull(BouncyCastlePlatform.f30525e);
                    if (BouncyCastlePlatform.f30524d) {
                        bouncyCastlePlatform = new BouncyCastlePlatform(jdk8WithJettyBootPlatform);
                    } else {
                        platform = 0;
                    }
                    if (platform == 0) {
                        platform = bouncyCastlePlatform;
                        provider2 = Security.getProviders()[0];
                        Intrinsics2.m13086b(provider2, "Security.getProviders()[0]");
                        if (Intrinsics2.m13085a("OpenJSSE", provider2.getName())) {
                            Objects.requireNonNull(OpenJSSEPlatform.f30543e);
                            if (OpenJSSEPlatform.f30542d) {
                                openJSSEPlatform = new OpenJSSEPlatform(jdk8WithJettyBootPlatform);
                            } else {
                                platform = 0;
                            }
                            if (platform == 0) {
                                platform = openJSSEPlatform;
                                Objects.requireNonNull(Jdk9Platform.f30541e);
                                if (Jdk9Platform.f30540d) {
                                    jdk9Platform = new Jdk9Platform();
                                } else {
                                    platform = 0;
                                }
                                if (platform == 0) {
                                    platform = jdk9Platform;
                                    Objects.requireNonNull(Jdk8WithJettyBootPlatform.f30531d);
                                    property = System.getProperty("java.specification.version", "unknown");
                                    Intrinsics2.m13086b(property, "jvmVersion");
                                    if (Integer.parseInt(property) < 9) {
                                        Class<?> cls17 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls18 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> cls19 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> cls110 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method method13 = cls17.getMethod("put", SSLSocket.class, cls18);
                                        Method method14 = cls17.getMethod("get", SSLSocket.class);
                                        Method method15 = cls17.getMethod("remove", SSLSocket.class);
                                        Intrinsics2.m13086b(method13, "putMethod");
                                        Intrinsics2.m13086b(method14, "getMethod");
                                        Intrinsics2.m13086b(method15, "removeMethod");
                                        Intrinsics2.m13086b(cls19, "clientProviderClass");
                                        Intrinsics2.m13086b(cls110, "serverProviderClass");
                                        jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(method13, method14, method15, cls19, cls110);
                                    }
                                    if (jdk8WithJettyBootPlatform != 0) {
                                        platform = jdk8WithJettyBootPlatform;
                                    } else {
                                        platform = new Platform();
                                    }
                                }
                            }
                        } else {
                            platform = openJSSEPlatform;
                            Objects.requireNonNull(Jdk9Platform.f30541e);
                            if (Jdk9Platform.f30540d) {
                                jdk9Platform = new Jdk9Platform();
                            } else {
                                platform = 0;
                            }
                            if (platform == 0) {
                                platform = jdk9Platform;
                                Objects.requireNonNull(Jdk8WithJettyBootPlatform.f30531d);
                                property = System.getProperty("java.specification.version", "unknown");
                                Intrinsics2.m13086b(property, "jvmVersion");
                                if (Integer.parseInt(property) < 9) {
                                    Class<?> cls111 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls112 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls113 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls114 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method16 = cls111.getMethod("put", SSLSocket.class, cls112);
                                    Method method17 = cls111.getMethod("get", SSLSocket.class);
                                    Method method18 = cls111.getMethod("remove", SSLSocket.class);
                                    Intrinsics2.m13086b(method16, "putMethod");
                                    Intrinsics2.m13086b(method17, "getMethod");
                                    Intrinsics2.m13086b(method18, "removeMethod");
                                    Intrinsics2.m13086b(cls113, "clientProviderClass");
                                    Intrinsics2.m13086b(cls114, "serverProviderClass");
                                    jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(method16, method17, method18, cls113, cls114);
                                }
                                if (jdk8WithJettyBootPlatform != 0) {
                                    platform = jdk8WithJettyBootPlatform;
                                } else {
                                    platform = new Platform();
                                }
                            }
                        }
                    }
                } else {
                    platform = bouncyCastlePlatform;
                    provider2 = Security.getProviders()[0];
                    Intrinsics2.m13086b(provider2, "Security.getProviders()[0]");
                    if (Intrinsics2.m13085a("OpenJSSE", provider2.getName())) {
                        Objects.requireNonNull(OpenJSSEPlatform.f30543e);
                        if (OpenJSSEPlatform.f30542d) {
                            openJSSEPlatform = new OpenJSSEPlatform(jdk8WithJettyBootPlatform);
                        } else {
                            platform = 0;
                        }
                        if (platform == 0) {
                            platform = openJSSEPlatform;
                            Objects.requireNonNull(Jdk9Platform.f30541e);
                            if (Jdk9Platform.f30540d) {
                                jdk9Platform = new Jdk9Platform();
                            } else {
                                platform = 0;
                            }
                            if (platform == 0) {
                                platform = jdk9Platform;
                                Objects.requireNonNull(Jdk8WithJettyBootPlatform.f30531d);
                                property = System.getProperty("java.specification.version", "unknown");
                                Intrinsics2.m13086b(property, "jvmVersion");
                                if (Integer.parseInt(property) < 9) {
                                    Class<?> cls115 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls116 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls117 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls118 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method19 = cls115.getMethod("put", SSLSocket.class, cls116);
                                    Method method110 = cls115.getMethod("get", SSLSocket.class);
                                    Method method111 = cls115.getMethod("remove", SSLSocket.class);
                                    Intrinsics2.m13086b(method19, "putMethod");
                                    Intrinsics2.m13086b(method110, "getMethod");
                                    Intrinsics2.m13086b(method111, "removeMethod");
                                    Intrinsics2.m13086b(cls117, "clientProviderClass");
                                    Intrinsics2.m13086b(cls118, "serverProviderClass");
                                    jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(method19, method110, method111, cls117, cls118);
                                }
                                if (jdk8WithJettyBootPlatform != 0) {
                                    platform = jdk8WithJettyBootPlatform;
                                } else {
                                    platform = new Platform();
                                }
                            }
                        }
                    } else {
                        platform = openJSSEPlatform;
                        Objects.requireNonNull(Jdk9Platform.f30541e);
                        if (Jdk9Platform.f30540d) {
                            jdk9Platform = new Jdk9Platform();
                        } else {
                            platform = 0;
                        }
                        if (platform == 0) {
                            platform = jdk9Platform;
                            Objects.requireNonNull(Jdk8WithJettyBootPlatform.f30531d);
                            property = System.getProperty("java.specification.version", "unknown");
                            Intrinsics2.m13086b(property, "jvmVersion");
                            if (Integer.parseInt(property) < 9) {
                                Class<?> cls119 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls1110 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> cls1111 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> cls1112 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method method112 = cls119.getMethod("put", SSLSocket.class, cls1110);
                                Method method113 = cls119.getMethod("get", SSLSocket.class);
                                Method method114 = cls119.getMethod("remove", SSLSocket.class);
                                Intrinsics2.m13086b(method112, "putMethod");
                                Intrinsics2.m13086b(method113, "getMethod");
                                Intrinsics2.m13086b(method114, "removeMethod");
                                Intrinsics2.m13086b(cls1111, "clientProviderClass");
                                Intrinsics2.m13086b(cls1112, "serverProviderClass");
                                jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(method112, method113, method114, cls1111, cls1112);
                            }
                            if (jdk8WithJettyBootPlatform != 0) {
                                platform = jdk8WithJettyBootPlatform;
                            } else {
                                platform = new Platform();
                            }
                        }
                    }
                }
            }
        }
        platform = jdk9Platform;
        platform = openJSSEPlatform;
        platform = bouncyCastlePlatform;
        platform = conscryptPlatform;
        platform = android10Platform;
        platform = android10Platform;
        platform = androidPlatform;
        platform = android10Platform;
        f30545a = platform;
        f30546b = Logger.getLogger(OkHttpClient.class.getName());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m13604j(Platform platform, String str, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        int i3 = i2 & 4;
        platform.m13605i(str, i, null);
    }

    /* JADX INFO: renamed from: a */
    public void mo13603a(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
    }

    /* JADX INFO: renamed from: b */
    public CertificateChainCleaner mo13590b(X509TrustManager x509TrustManager) {
        Intrinsics2.m13090f(x509TrustManager, "trustManager");
        return new BasicCertificateChainCleaner(mo13594c(x509TrustManager));
    }

    /* JADX INFO: renamed from: c */
    public TrustRootIndex mo13594c(X509TrustManager x509TrustManager) {
        Intrinsics2.m13090f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        Intrinsics2.m13086b(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: d */
    public void mo13591d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
    }

    /* JADX INFO: renamed from: e */
    public void mo13595e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        Intrinsics2.m13090f(socket, "socket");
        Intrinsics2.m13090f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: f */
    public String mo13592f(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public Object mo13596g(String str) {
        Intrinsics2.m13090f(str, "closer");
        if (f30546b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo13593h(String str) {
        Intrinsics2.m13090f(str, "hostname");
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m13605i(String str, int i, Throwable th) {
        Intrinsics2.m13090f(str, "message");
        f30546b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: k */
    public void mo13597k(String str, Object obj) {
        Intrinsics2.m13090f(str, "message");
        if (obj == null) {
            str = outline.m1599u(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m13605i(str, 5, (Throwable) obj);
    }

    /* JADX INFO: renamed from: l */
    public SSLContext mo13599l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics2.m13086b(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    /* JADX INFO: renamed from: m */
    public SSLSocketFactory mo13601m(X509TrustManager x509TrustManager) {
        Intrinsics2.m13090f(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContextMo13599l = mo13599l();
            sSLContextMo13599l.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo13599l.getSocketFactory();
            Intrinsics2.m13086b(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* JADX INFO: renamed from: n */
    public X509TrustManager mo13600n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        Intrinsics2.m13086b(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new TypeCastException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sbM1556G = outline.m1556G("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics2.m13086b(string, "java.util.Arrays.toString(this)");
        sbM1556G.append(string);
        throw new IllegalStateException(sbM1556G.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics2.m13086b(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
