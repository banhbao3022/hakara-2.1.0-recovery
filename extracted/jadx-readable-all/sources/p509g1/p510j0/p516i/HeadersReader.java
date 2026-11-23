package p509g1.p510j0.p516i;

import java.io.IOException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Headers2;
import p524h1.BufferedSource;

/* JADX INFO: renamed from: g1.j0.i.a, reason: use source file name */
/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HeadersReader {

    /* JADX INFO: renamed from: a */
    public long f30304a;

    /* JADX INFO: renamed from: b */
    public final BufferedSource f30305b;

    /* JADX INFO: renamed from: g1.j0.i.a$a */
    /* JADX INFO: compiled from: HeadersReader.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public HeadersReader(BufferedSource bufferedSource) {
        Intrinsics2.m13090f(bufferedSource, "source");
        this.f30305b = bufferedSource;
        this.f30304a = 262144;
    }

    /* JADX INFO: renamed from: a */
    public final Headers2 m13499a() throws IOException {
        Headers2.a aVar = new Headers2.a();
        while (true) {
            String strM13500b = m13500b();
            if (strM13500b.length() == 0) {
                return aVar.m13658d();
            }
            aVar.m13656b(strM13500b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m13500b() throws IOException {
        String strMo13719I = this.f30305b.mo13719I(this.f30304a);
        this.f30304a -= (long) strMo13719I.length();
        return strMo13719I;
    }
}
