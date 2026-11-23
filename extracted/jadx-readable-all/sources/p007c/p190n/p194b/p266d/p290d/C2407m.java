package p007c.p190n.p194b.p266d.p290d;

import java.util.Arrays;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2407m {

    /* JADX INFO: renamed from: a */
    public final long f11084a;

    /* JADX INFO: renamed from: b */
    public final int f11085b;

    /* JADX INFO: renamed from: c */
    public final boolean f11086c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f11087d;

    /* JADX INFO: renamed from: c.n.b.d.d.m$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f11088a;

        /* JADX INFO: renamed from: b */
        public int f11089b = 0;

        /* JADX INFO: renamed from: c */
        public JSONObject f11090c;
    }

    public C2407m(long j2, int i, boolean z, JSONObject jSONObject, C2388f1 c2388f1) {
        this.f11084a = j2;
        this.f11085b = i;
        this.f11086c = z;
        this.f11087d = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2407m)) {
            return false;
        }
        C2407m c2407m = (C2407m) obj;
        return this.f11084a == c2407m.f11084a && this.f11085b == c2407m.f11085b && this.f11086c == c2407m.f11086c && C2622l.m5459y(this.f11087d, c2407m.f11087d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11084a), Integer.valueOf(this.f11085b), Boolean.valueOf(this.f11086c), this.f11087d});
    }
}
