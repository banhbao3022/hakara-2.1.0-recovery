package p509g1;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.i0, reason: use source file name */
/* JADX INFO: compiled from: TlsVersion.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: l */
    public static final a f30045l = new a(null);

    /* JADX INFO: renamed from: m */
    public final String f30046m;

    /* JADX INFO: renamed from: g1.i0$a */
    /* JADX INFO: compiled from: TlsVersion.kt */
    public static final class a {
        public a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: a */
        public final TlsVersion m13355a(String str) {
            Intrinsics2.m13090f(str, "javaName");
            int iHashCode = str.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException(outline.m1599u("Unexpected TLS version: ", str));
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    TlsVersion(String str) {
        this.f30046m = str;
    }
}
