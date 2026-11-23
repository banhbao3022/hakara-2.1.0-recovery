package p509g1;

import java.util.List;
import p477d1.p483s.Collections4;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.p, reason: use source file name */
/* JADX INFO: compiled from: CookieJar.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface CookieJar {

    /* JADX INFO: renamed from: a */
    public static final CookieJar f30615a;

    /* JADX INFO: renamed from: g1.p$a */
    /* JADX INFO: compiled from: CookieJar.kt */
    public static final class a {

        /* JADX INFO: renamed from: g1.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CookieJar.kt */
        public static final class C8545a implements CookieJar {
            @Override // p509g1.CookieJar
            /* JADX INFO: renamed from: a */
            public void mo13637a(HttpUrl httpUrl, List<Cookie> list) {
                Intrinsics2.m13090f(httpUrl, "url");
                Intrinsics2.m13090f(list, "cookies");
            }

            @Override // p509g1.CookieJar
            /* JADX INFO: renamed from: b */
            public List<Cookie> mo13638b(HttpUrl httpUrl) {
                Intrinsics2.m13090f(httpUrl, "url");
                return Collections4.f29519f;
            }
        }

        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f30615a = new a.C8545a();
    }

    /* JADX INFO: renamed from: a */
    void mo13637a(HttpUrl httpUrl, List<Cookie> list);

    /* JADX INFO: renamed from: b */
    List<Cookie> mo13638b(HttpUrl httpUrl);
}
