package p007c.p190n.p194b.p209b.p210a2.p211j0;

import java.util.ArrayList;
import java.util.TreeSet;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.k, reason: use source file name */
/* JADX INFO: compiled from: CachedContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class CachedContent {

    /* JADX INFO: renamed from: a */
    public final int f6080a;

    /* JADX INFO: renamed from: b */
    public final String f6081b;

    /* JADX INFO: renamed from: c */
    public final TreeSet<SimpleCacheSpan> f6082c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<a> f6083d;

    /* JADX INFO: renamed from: e */
    public DefaultContentMetadata f6084e;

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.k$a */
    /* JADX INFO: compiled from: CachedContent.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f6085a;

        /* JADX INFO: renamed from: b */
        public final long f6086b;

        public a(long j2, long j3) {
            this.f6085a = j2;
            this.f6086b = j3;
        }
    }

    public CachedContent(int i, String str) {
        this(i, str, DefaultContentMetadata.f6107a);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX INFO: renamed from: a */
    public boolean m2962a(long j2, long j3) {
        boolean z;
        for (int i = 0; i < this.f6083d.size(); i++) {
            a aVar = this.f6083d.get(i);
            long j4 = aVar.f6086b;
            if (j4 != -1) {
                if (j3 != -1) {
                    long j5 = aVar.f6085a;
                    if (j5 <= j2 && j2 + j3 <= j5 + j4) {
                        z = true;
                    }
                }
                z = false;
            } else if (j2 >= aVar.f6085a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CachedContent.class != obj.getClass()) {
            return false;
        }
        CachedContent cachedContent = (CachedContent) obj;
        return this.f6080a == cachedContent.f6080a && this.f6081b.equals(cachedContent.f6081b) && this.f6082c.equals(cachedContent.f6082c) && this.f6084e.equals(cachedContent.f6084e);
    }

    public int hashCode() {
        return this.f6084e.hashCode() + outline.m1569T(this.f6081b, this.f6080a * 31, 31);
    }

    public CachedContent(int i, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f6080a = i;
        this.f6081b = str;
        this.f6084e = defaultContentMetadata;
        this.f6082c = new TreeSet<>();
        this.f6083d = new ArrayList<>();
    }
}
