package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.k.o4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4280o4 {

    /* JADX INFO: renamed from: a */
    public static volatile C4280o4 f23378a;

    /* JADX INFO: renamed from: b */
    public static volatile C4280o4 f23379b;

    /* JADX INFO: renamed from: c */
    public static final C4280o4 f23380c = new C4280o4(true);

    /* JADX INFO: renamed from: d */
    public final Map<a, AbstractC4099b5.f<?, ?>> f23381d;

    /* JADX INFO: renamed from: c.n.b.d.j.k.o4$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f23382a;

        /* JADX INFO: renamed from: b */
        public final int f23383b;

        public a(Object obj, int i) {
            this.f23382a = obj;
            this.f23383b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23382a == aVar.f23382a && this.f23383b == aVar.f23383b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f23382a) * 65535) + this.f23383b;
        }
    }

    public C4280o4() {
        this.f23381d = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C4280o4 m10117a() {
        C4280o4 c4280o4 = f23378a;
        if (c4280o4 == null) {
            synchronized (C4280o4.class) {
                c4280o4 = f23378a;
                if (c4280o4 == null) {
                    c4280o4 = f23380c;
                    f23378a = c4280o4;
                }
            }
        }
        return c4280o4;
    }

    public C4280o4(boolean z) {
        this.f23381d = Collections.emptyMap();
    }
}
