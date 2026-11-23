package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.f.m4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3933m4 {

    /* JADX INFO: renamed from: a */
    public static volatile C3933m4 f22787a;

    /* JADX INFO: renamed from: b */
    public static final C3933m4 f22788b = new C3933m4(true);

    /* JADX INFO: renamed from: c */
    public final Map<Object, Object> f22789c;

    public C3933m4() {
        new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C3933m4 m9111a() {
        C3933m4 c3933m4 = f22787a;
        if (c3933m4 == null) {
            synchronized (C3933m4.class) {
                c3933m4 = f22787a;
                if (c3933m4 == null) {
                    c3933m4 = f22788b;
                    f22787a = c3933m4;
                }
            }
        }
        return c3933m4;
    }

    public C3933m4(boolean z) {
        this.f22789c = Collections.emptyMap();
    }
}
