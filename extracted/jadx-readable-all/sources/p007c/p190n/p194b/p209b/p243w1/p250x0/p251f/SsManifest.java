package p007c.p190n.p194b.p209b.p243w1.p250x0.p251f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.p228k0.TrackEncryptionBox;
import p007c.p190n.p194b.p209b.p242v1.FilterableManifest;
import p007c.p190n.p194b.p209b.p242v1.StreamKey;

/* JADX INFO: renamed from: c.n.b.b.w1.x0.f.a, reason: use source file name */
/* JADX INFO: compiled from: SsManifest.java */
/* JADX INFO: loaded from: classes.dex */
public class SsManifest implements FilterableManifest<SsManifest> {

    /* JADX INFO: renamed from: a */
    public final int f9698a;

    /* JADX INFO: renamed from: b */
    public final int f9699b;

    /* JADX INFO: renamed from: c */
    public final int f9700c;

    /* JADX INFO: renamed from: d */
    public final boolean f9701d;

    /* JADX INFO: renamed from: e */
    public final a f9702e;

    /* JADX INFO: renamed from: f */
    public final b[] f9703f;

    /* JADX INFO: renamed from: g */
    public final long f9704g;

    /* JADX INFO: renamed from: h */
    public final long f9705h;

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.f.a$a */
    /* JADX INFO: compiled from: SsManifest.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final UUID f9706a;

        /* JADX INFO: renamed from: b */
        public final byte[] f9707b;

        /* JADX INFO: renamed from: c */
        public final TrackEncryptionBox[] f9708c;

        public a(UUID uuid, byte[] bArr, TrackEncryptionBox[] trackEncryptionBoxArr) {
            this.f9706a = uuid;
            this.f9707b = bArr;
            this.f9708c = trackEncryptionBoxArr;
        }
    }

    public SsManifest(int i, int i2, long j2, long j3, long j4, int i3, boolean z, a aVar, b[] bVarArr) {
        long jM3104M = j3 == 0 ? -9223372036854775807L : Util6.m3104M(j3, 1000000L, j2);
        long jM3104M2 = j4 != 0 ? Util6.m3104M(j4, 1000000L, j2) : -9223372036854775807L;
        this.f9698a = i;
        this.f9699b = i2;
        this.f9704g = jM3104M;
        this.f9705h = jM3104M2;
        this.f9700c = i3;
        this.f9701d = z;
        this.f9702e = aVar;
        this.f9703f = bVarArr;
    }

    @Override // p007c.p190n.p194b.p209b.p242v1.FilterableManifest
    /* JADX INFO: renamed from: a */
    public SsManifest mo4049a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            b bVar2 = this.f9703f[streamKey.f8820g];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.m4371a((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f9718j[streamKey.f8821h]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.m4371a((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new SsManifest(this.f9698a, this.f9699b, this.f9704g, this.f9705h, this.f9700c, this.f9701d, this.f9702e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.f.a$b */
    /* JADX INFO: compiled from: SsManifest.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f9709a;

        /* JADX INFO: renamed from: b */
        public final String f9710b;

        /* JADX INFO: renamed from: c */
        public final long f9711c;

        /* JADX INFO: renamed from: d */
        public final String f9712d;

        /* JADX INFO: renamed from: e */
        public final int f9713e;

        /* JADX INFO: renamed from: f */
        public final int f9714f;

        /* JADX INFO: renamed from: g */
        public final int f9715g;

        /* JADX INFO: renamed from: h */
        public final int f9716h;

        /* JADX INFO: renamed from: i */
        public final String f9717i;

        /* JADX INFO: renamed from: j */
        public final Format[] f9718j;

        /* JADX INFO: renamed from: k */
        public final int f9719k;

        /* JADX INFO: renamed from: l */
        public final String f9720l;

        /* JADX INFO: renamed from: m */
        public final String f9721m;

        /* JADX INFO: renamed from: n */
        public final List<Long> f9722n;

        /* JADX INFO: renamed from: o */
        public final long[] f9723o;

        /* JADX INFO: renamed from: p */
        public final long f9724p;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(String str, String str2, int i, String str3, long j2, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long j3) {
            int i6 = Util6.f6307a;
            int size = list.size();
            long[] jArr = new long[size];
            int i7 = 0;
            if (j2 >= 1000000 && j2 % 1000000 == 0) {
                long j4 = j2 / 1000000;
                while (i7 < size) {
                    jArr[i7] = list.get(i7).longValue() / j4;
                    i7++;
                }
            } else if (j2 >= 1000000 || 1000000 % j2 != 0) {
                double d = 1000000 / j2;
                while (i7 < size) {
                    jArr[i7] = (long) (list.get(i7).longValue() * d);
                    i7++;
                }
            } else {
                long j5 = 1000000 / j2;
                while (i7 < size) {
                    jArr[i7] = list.get(i7).longValue() * j5;
                    i7++;
                }
            }
            this(str, str2, i, str3, j2, str4, i2, i3, i4, i5, str5, formatArr, list, jArr, Util6.m3104M(j3, 1000000L, j2));
        }

        /* JADX INFO: renamed from: a */
        public b m4371a(Format[] formatArr) {
            return new b(this.f9720l, this.f9721m, this.f9709a, this.f9710b, this.f9711c, this.f9712d, this.f9713e, this.f9714f, this.f9715g, this.f9716h, this.f9717i, formatArr, this.f9722n, this.f9723o, this.f9724p);
        }

        /* JADX INFO: renamed from: b */
        public long m4372b(int i) {
            if (i == this.f9719k - 1) {
                return this.f9724p;
            }
            long[] jArr = this.f9723o;
            return jArr[i + 1] - jArr[i];
        }

        /* JADX INFO: renamed from: c */
        public int m4373c(long j2) {
            return Util6.m3118f(this.f9723o, j2, true, true);
        }

        public b(String str, String str2, int i, String str3, long j2, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j3) {
            this.f9720l = str;
            this.f9721m = str2;
            this.f9709a = i;
            this.f9710b = str3;
            this.f9711c = j2;
            this.f9712d = str4;
            this.f9713e = i2;
            this.f9714f = i3;
            this.f9715g = i4;
            this.f9716h = i5;
            this.f9717i = str5;
            this.f9718j = formatArr;
            this.f9722n = list;
            this.f9723o = jArr;
            this.f9724p = j3;
            this.f9719k = list.size();
        }
    }

    public SsManifest(int i, int i2, long j2, long j3, int i3, boolean z, a aVar, b[] bVarArr) {
        this.f9698a = i;
        this.f9699b = i2;
        this.f9704g = j2;
        this.f9705h = j3;
        this.f9700c = i3;
        this.f9701d = z;
        this.f9702e = aVar;
        this.f9703f = bVarArr;
    }
}
