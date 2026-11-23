package p007c.p190n.p194b.p266d.p290d;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import p007c.p190n.p194b.p266d.p290d.p295s.C2522c0;
import p007c.p190n.p194b.p266d.p290d.p295s.C2535j;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;

/* JADX INFO: renamed from: c.n.b.d.d.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2383e {

    /* JADX INFO: renamed from: a */
    public static final C2628a.a<C2522c0, b> f11017a;

    /* JADX INFO: renamed from: c.n.b.d.d.e$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public interface a extends InterfaceC2638k {
        /* JADX INFO: renamed from: D */
        String mo4951D();

        /* JADX INFO: renamed from: c */
        boolean mo4952c();

        /* JADX INFO: renamed from: f */
        String mo4953f();

        /* JADX INFO: renamed from: t */
        C2380d mo4954t();
    }

    /* JADX INFO: renamed from: c.n.b.d.d.e$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class b implements C2628a.d {

        /* JADX INFO: renamed from: f */
        public final CastDevice f11018f;

        /* JADX INFO: renamed from: g */
        public final c f11019g;

        /* JADX INFO: renamed from: h */
        public final Bundle f11020h;

        /* JADX INFO: renamed from: i */
        public final String f11021i = UUID.randomUUID().toString();

        /* JADX INFO: renamed from: c.n.b.d.d.e$b$a */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public CastDevice f11022a;

            /* JADX INFO: renamed from: b */
            public c f11023b;

            /* JADX INFO: renamed from: c */
            public Bundle f11024c;

            public a(CastDevice castDevice, c cVar) {
                C2622l.m5379i(castDevice, "CastDevice parameter cannot be null");
                C2622l.m5379i(cVar, "CastListener parameter cannot be null");
                this.f11022a = castDevice;
                this.f11023b = cVar;
            }
        }

        public b(a aVar, C2412n1 c2412n1) {
            this.f11018f = aVar.f11022a;
            this.f11019g = aVar.f11023b;
            this.f11020h = aVar.f11024c;
        }

        public final boolean equals(Object obj) {
            boolean z;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C2622l.m5459y(this.f11018f, bVar.f11018f)) {
                Bundle bundle = this.f11020h;
                Bundle bundle2 = bVar.f11020h;
                if (bundle == null || bundle2 == null) {
                    z = bundle == bundle2;
                } else {
                    if (bundle.size() == bundle2.size()) {
                        Set<String> setKeySet = bundle.keySet();
                        if (setKeySet.containsAll(bundle2.keySet())) {
                            Iterator<String> it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    String next = it.next();
                                    if (!C2622l.m5459y(bundle.get(next), bundle2.get(next))) {
                                    }
                                }
                            }
                        }
                    }
                }
                if (z && C2622l.m5459y(this.f11021i, bVar.f11021i)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f11018f, this.f11020h, 0, this.f11021i});
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.e$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static class c {
        /* JADX INFO: renamed from: a */
        public void mo4955a(int i) {
        }

        /* JADX INFO: renamed from: b */
        public void mo4956b(int i) {
        }

        /* JADX INFO: renamed from: c */
        public void mo4957c(C2380d c2380d) {
        }

        /* JADX INFO: renamed from: d */
        public void mo4958d() {
        }

        /* JADX INFO: renamed from: e */
        public void mo4959e(int i) {
        }

        /* JADX INFO: renamed from: f */
        public void mo4960f() {
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.e$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo4961a(CastDevice castDevice, String str, String str2);
    }

    static {
        C2412n1 c2412n1 = new C2412n1();
        f11017a = c2412n1;
        new C2628a("Cast.API", c2412n1, C2535j.f11422a);
        new C2386f();
    }
}
