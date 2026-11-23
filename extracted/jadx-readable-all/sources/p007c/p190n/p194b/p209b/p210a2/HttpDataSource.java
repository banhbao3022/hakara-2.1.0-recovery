package p007c.p190n.p194b.p209b.p210a2;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.a2.z, reason: use source file name */
/* JADX INFO: compiled from: HttpDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface HttpDataSource extends DataSource3 {

    /* JADX INFO: renamed from: c.n.b.b.a2.z$a */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static abstract class a implements c {

        /* JADX INFO: renamed from: a */
        public final g f6241a = new g();

        @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3.a
        /* JADX INFO: renamed from: a */
        public DataSource3 mo2953a() {
            return mo3023b(this.f6241a);
        }

        /* JADX INFO: renamed from: b */
        public abstract HttpDataSource mo3023b(g gVar);

        @Override // p007c.p190n.p194b.p209b.p210a2.HttpDataSource.c, p007c.p190n.p194b.p209b.p210a2.DataSource3.a
        /* JADX INFO: renamed from: a */
        public final HttpDataSource mo2953a() {
            return mo3023b(this.f6241a);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.z$b */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static final class b extends d {
        public b(IOException iOException, DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, dataSpec, 1);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.z$c */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public interface c extends DataSource3.a {
        @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3.a
        /* JADX INFO: renamed from: a */
        HttpDataSource mo2953a();
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.z$d */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static class d extends IOException {
        public d(DataSpec dataSpec, int i) {
        }

        public d(String str, DataSpec dataSpec, int i) {
            super(str);
        }

        public d(IOException iOException, DataSpec dataSpec, int i) {
            super(iOException);
        }

        public d(String str, IOException iOException, DataSpec dataSpec, int i) {
            super(str, iOException);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.z$e */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static final class e extends d {
        public e(String str, DataSpec dataSpec) {
            super(outline.m1599u("Invalid content type: ", str), dataSpec, 1);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.z$f */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static final class f extends d {

        /* JADX INFO: renamed from: f */
        public final int f6242f;

        /* JADX INFO: renamed from: g */
        public final Map<String, List<String>> f6243g;

        @Deprecated
        public f(int i, Map<String, List<String>> map, DataSpec dataSpec) {
            this(i, null, map, dataSpec, Util6.f6312f);
        }

        @Deprecated
        public f(int i, String str, Map<String, List<String>> map, DataSpec dataSpec) {
            this(i, str, map, dataSpec, Util6.f6312f);
        }

        public f(int i, String str, Map<String, List<String>> map, DataSpec dataSpec, byte[] bArr) {
            super(outline.m1590l("Response code: ", i), dataSpec, 1);
            this.f6242f = i;
            this.f6243g = map;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.z$g */
    /* JADX INFO: compiled from: HttpDataSource.java */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final Map<String, String> f6244a = new HashMap();

        /* JADX INFO: renamed from: b */
        public Map<String, String> f6245b;

        /* JADX INFO: renamed from: a */
        public synchronized Map<String, String> m3028a() {
            if (this.f6245b == null) {
                this.f6245b = Collections.unmodifiableMap(new HashMap(this.f6244a));
            }
            return this.f6245b;
        }
    }
}
