package p509g1.p510j0.p512e;

import java.util.Date;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Headers2;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p515h.dates;

/* JADX INFO: renamed from: g1.j0.e.d, reason: use source file name */
/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CacheStrategy {

    /* JADX INFO: renamed from: a */
    public static final a f30085a = new a(null);

    /* JADX INFO: renamed from: b */
    public final Request3 f30086b;

    /* JADX INFO: renamed from: c */
    public final Response3 f30087c;

    /* JADX INFO: renamed from: g1.j0.e.d$a */
    /* JADX INFO: compiled from: CacheStrategy.kt */
    public static final class a {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0039  */
        /* JADX INFO: renamed from: a */
        public final boolean m13393a(Response3 response3, Request3 request3) {
            Intrinsics2.m13090f(response3, "response");
            Intrinsics2.m13090f(request3, "request");
            int i = response3.f29993j;
            if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
                if (i == 307) {
                    if (Response3.m13336c(response3, "Expires", null, 2) == null && response3.m13337a().f29964d == -1 && !response3.m13337a().f29967g && !response3.m13337a().f29966f) {
                        return false;
                    }
                } else if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (Response3.m13336c(response3, "Expires", null, 2) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response3.m13337a().f29963c || request3.m13311a().f29963c) ? false : true;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.e.d$b */
    /* JADX INFO: compiled from: CacheStrategy.kt */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Date f30088a;

        /* JADX INFO: renamed from: b */
        public String f30089b;

        /* JADX INFO: renamed from: c */
        public Date f30090c;

        /* JADX INFO: renamed from: d */
        public String f30091d;

        /* JADX INFO: renamed from: e */
        public Date f30092e;

        /* JADX INFO: renamed from: f */
        public long f30093f;

        /* JADX INFO: renamed from: g */
        public long f30094g;

        /* JADX INFO: renamed from: h */
        public String f30095h;

        /* JADX INFO: renamed from: i */
        public int f30096i;

        /* JADX INFO: renamed from: j */
        public final long f30097j;

        /* JADX INFO: renamed from: k */
        public final Request3 f30098k;

        /* JADX INFO: renamed from: l */
        public final Response3 f30099l;

        public b(long j2, Request3 request3, Response3 response3) {
            Intrinsics2.m13090f(request3, "request");
            this.f30097j = j2;
            this.f30098k = request3;
            this.f30099l = response3;
            this.f30096i = -1;
            if (response3 != null) {
                this.f30093f = response3.f30000q;
                this.f30094g = response3.f30001r;
                Headers2 headers2 = response3.f29995l;
                int size = headers2.size();
                for (int i = 0; i < size; i++) {
                    String strM13650f = headers2.m13650f(i);
                    String strM13653m = headers2.m13653m(i);
                    if (StringsJVM.m12989f(strM13650f, "Date", true)) {
                        this.f30088a = dates.m13476a(strM13653m);
                        this.f30089b = strM13653m;
                    } else if (StringsJVM.m12989f(strM13650f, "Expires", true)) {
                        this.f30092e = dates.m13476a(strM13653m);
                    } else if (StringsJVM.m12989f(strM13650f, "Last-Modified", true)) {
                        this.f30090c = dates.m13476a(strM13653m);
                        this.f30091d = strM13653m;
                    } else if (StringsJVM.m12989f(strM13650f, "ETag", true)) {
                        this.f30095h = strM13653m;
                    } else if (StringsJVM.m12989f(strM13650f, "Age", true)) {
                        this.f30096i = Util9.m13385y(strM13653m, -1);
                    }
                }
            }
        }
    }

    public CacheStrategy(Request3 request3, Response3 response3) {
        this.f30086b = request3;
        this.f30087c = response3;
    }
}
