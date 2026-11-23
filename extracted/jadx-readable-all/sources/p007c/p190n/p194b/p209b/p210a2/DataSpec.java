package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.a2.p, reason: use source file name */
/* JADX INFO: compiled from: DataSpec.java */
/* JADX INFO: loaded from: classes.dex */
public final class DataSpec {

    /* JADX INFO: renamed from: a */
    public final Uri f6137a;

    /* JADX INFO: renamed from: b */
    public final long f6138b;

    /* JADX INFO: renamed from: c */
    public final int f6139c;

    /* JADX INFO: renamed from: d */
    public final byte[] f6140d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f6141e;

    /* JADX INFO: renamed from: f */
    public final long f6142f;

    /* JADX INFO: renamed from: g */
    public final long f6143g;

    /* JADX INFO: renamed from: h */
    public final String f6144h;

    /* JADX INFO: renamed from: i */
    public final int f6145i;

    /* JADX INFO: renamed from: j */
    public final Object f6146j;

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    /* JADX INFO: renamed from: b */
    public static String m3000b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: a */
    public b m3001a() {
        return new b(this, null);
    }

    /* JADX INFO: renamed from: c */
    public boolean m3002c(int i) {
        return (this.f6145i & i) == i;
    }

    /* JADX INFO: renamed from: d */
    public DataSpec m3003d(long j2) {
        long j3 = this.f6143g;
        return m3004e(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    /* JADX INFO: renamed from: e */
    public DataSpec m3004e(long j2, long j3) {
        return (j2 == 0 && this.f6143g == j3) ? this : new DataSpec(this.f6137a, this.f6138b, this.f6139c, this.f6140d, this.f6141e, this.f6142f + j2, j3, this.f6144h, this.f6145i, this.f6146j);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("DataSpec[");
        sbM1556G.append(m3000b(this.f6139c));
        sbM1556G.append(" ");
        sbM1556G.append(this.f6137a);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6142f);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6143g);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6144h);
        sbM1556G.append(", ");
        return outline.m1603y(sbM1556G, this.f6145i, "]");
    }

    public DataSpec(Uri uri, long j2, long j3) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j2, j3, null, 0, null);
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.p$b */
    /* JADX INFO: compiled from: DataSpec.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Uri f6147a;

        /* JADX INFO: renamed from: b */
        public long f6148b;

        /* JADX INFO: renamed from: c */
        public int f6149c;

        /* JADX INFO: renamed from: d */
        public byte[] f6150d;

        /* JADX INFO: renamed from: e */
        public Map<String, String> f6151e;

        /* JADX INFO: renamed from: f */
        public long f6152f;

        /* JADX INFO: renamed from: g */
        public long f6153g;

        /* JADX INFO: renamed from: h */
        public String f6154h;

        /* JADX INFO: renamed from: i */
        public int f6155i;

        /* JADX INFO: renamed from: j */
        public Object f6156j;

        public b() {
            this.f6149c = 1;
            this.f6151e = Collections.emptyMap();
            this.f6153g = -1L;
        }

        /* JADX INFO: renamed from: a */
        public DataSpec m3005a() {
            C2096e.m4573i(this.f6147a, "The uri must be set.");
            return new DataSpec(this.f6147a, this.f6148b, this.f6149c, this.f6150d, this.f6151e, this.f6152f, this.f6153g, this.f6154h, this.f6155i, this.f6156j);
        }

        public b(DataSpec dataSpec, a aVar) {
            this.f6147a = dataSpec.f6137a;
            this.f6148b = dataSpec.f6138b;
            this.f6149c = dataSpec.f6139c;
            this.f6150d = dataSpec.f6140d;
            this.f6151e = dataSpec.f6141e;
            this.f6152f = dataSpec.f6142f;
            this.f6153g = dataSpec.f6143g;
            this.f6154h = dataSpec.f6144h;
            this.f6155i = dataSpec.f6145i;
            this.f6156j = dataSpec.f6146j;
        }
    }

    @Deprecated
    public DataSpec(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    @Deprecated
    public DataSpec(Uri uri, long j2, long j3, String str) {
        this(uri, j2, j2, j3, str, 0);
    }

    @Deprecated
    public DataSpec(Uri uri, long j2, long j3, String str, int i) {
        this(uri, j2, j2, j3, str, i);
    }

    @Deprecated
    public DataSpec(Uri uri, long j2, long j3, String str, int i, Map<String, String> map) {
        this(uri, 1, null, j2, j2, j3, str, i, map);
    }

    @Deprecated
    public DataSpec(Uri uri, long j2, long j3, long j4, String str, int i) {
        this(uri, null, j2, j3, j4, str, i);
    }

    @Deprecated
    public DataSpec(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j2, j3, j4, str, i);
    }

    @Deprecated
    public DataSpec(Uri uri, int i, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        this(uri, i, bArr, j2, j3, j4, str, i2, Collections.emptyMap());
    }

    @Deprecated
    public DataSpec(Uri uri, int i, byte[] bArr, long j2, long j3, long j4, String str, int i2, Map<String, String> map) {
        this(uri, j2 - j3, i, bArr, map, j3, j4, str, i2, null);
    }

    public DataSpec(Uri uri, long j2, int i, byte[] bArr, Map<String, String> map, long j3, long j4, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        boolean z = true;
        C2096e.m4566b(j2 + j3 >= 0);
        C2096e.m4566b(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        C2096e.m4566b(z);
        this.f6137a = uri;
        this.f6138b = j2;
        this.f6139c = i;
        this.f6140d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f6141e = Collections.unmodifiableMap(new HashMap(map));
        this.f6142f = j3;
        this.f6143g = j4;
        this.f6144h = str;
        this.f6145i = i2;
        this.f6146j = obj;
    }
}
