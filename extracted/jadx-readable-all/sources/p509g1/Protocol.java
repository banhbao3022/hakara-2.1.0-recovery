package p509g1;

import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.b0, reason: use source file name */
/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: m */
    public static final a f29917m = new a(null);

    /* JADX INFO: renamed from: n */
    public final String f29918n;

    /* JADX INFO: renamed from: g1.b0$a */
    /* JADX INFO: compiled from: Protocol.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final Protocol m13302a(String str) throws IOException {
            Intrinsics2.m13090f(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!Intrinsics2.m13085a(str, "http/1.0")) {
                protocol = Protocol.HTTP_1_1;
                if (!Intrinsics2.m13085a(str, "http/1.1")) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!Intrinsics2.m13085a(str, "h2_prior_knowledge")) {
                        protocol = Protocol.HTTP_2;
                        if (!Intrinsics2.m13085a(str, "h2")) {
                            protocol = Protocol.SPDY_3;
                            if (!Intrinsics2.m13085a(str, "spdy/3.1")) {
                                protocol = Protocol.QUIC;
                                if (!Intrinsics2.m13085a(str, "quic")) {
                                    throw new IOException(outline.m1599u("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    Protocol(String str) {
        this.f29918n = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f29918n;
    }
}
