package p007c.p190n.p194b.p209b.p243w1.p248w0.p249w;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.ImmutableMap;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.w.g, reason: use source file name */
/* JADX INFO: compiled from: HlsMediaPlaylist.java */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {

    /* JADX INFO: renamed from: d */
    public final int f9572d;

    /* JADX INFO: renamed from: e */
    public final long f9573e;

    /* JADX INFO: renamed from: f */
    public final long f9574f;

    /* JADX INFO: renamed from: g */
    public final boolean f9575g;

    /* JADX INFO: renamed from: h */
    public final int f9576h;

    /* JADX INFO: renamed from: i */
    public final long f9577i;

    /* JADX INFO: renamed from: j */
    public final int f9578j;

    /* JADX INFO: renamed from: k */
    public final long f9579k;

    /* JADX INFO: renamed from: l */
    public final long f9580l;

    /* JADX INFO: renamed from: m */
    public final boolean f9581m;

    /* JADX INFO: renamed from: n */
    public final boolean f9582n;

    /* JADX INFO: renamed from: o */
    public final DrmInitData f9583o;

    /* JADX INFO: renamed from: p */
    public final List<d> f9584p;

    /* JADX INFO: renamed from: q */
    public final List<b> f9585q;

    /* JADX INFO: renamed from: r */
    public final Map<Uri, c> f9586r;

    /* JADX INFO: renamed from: s */
    public final long f9587s;

    /* JADX INFO: renamed from: t */
    public final f f9588t;

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.g$b */
    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class b extends e {

        /* JADX INFO: renamed from: q */
        public final boolean f9589q;

        /* JADX INFO: renamed from: r */
        public final boolean f9590r;

        public b(String str, d dVar, long j2, int i, long j3, DrmInitData drmInitData, String str2, String str3, long j4, long j5, boolean z, boolean z2, boolean z3) {
            super(str, dVar, j2, i, j3, drmInitData, str2, str3, j4, j5, z, null);
            this.f9589q = z2;
            this.f9590r = z3;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.g$c */
    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final long f9591a;

        /* JADX INFO: renamed from: b */
        public final int f9592b;

        public c(Uri uri, long j2, int i) {
            this.f9591a = j2;
            this.f9592b = i;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.g$e */
    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static class e implements Comparable<Long> {

        /* JADX INFO: renamed from: f */
        public final String f9595f;

        /* JADX INFO: renamed from: g */
        public final d f9596g;

        /* JADX INFO: renamed from: h */
        public final long f9597h;

        /* JADX INFO: renamed from: i */
        public final int f9598i;

        /* JADX INFO: renamed from: j */
        public final long f9599j;

        /* JADX INFO: renamed from: k */
        public final DrmInitData f9600k;

        /* JADX INFO: renamed from: l */
        public final String f9601l;

        /* JADX INFO: renamed from: m */
        public final String f9602m;

        /* JADX INFO: renamed from: n */
        public final long f9603n;

        /* JADX INFO: renamed from: o */
        public final long f9604o;

        /* JADX INFO: renamed from: p */
        public final boolean f9605p;

        public e(String str, d dVar, long j2, int i, long j3, DrmInitData drmInitData, String str2, String str3, long j4, long j5, boolean z, a aVar) {
            this.f9595f = str;
            this.f9596g = dVar;
            this.f9597h = j2;
            this.f9598i = i;
            this.f9599j = j3;
            this.f9600k = drmInitData;
            this.f9601l = str2;
            this.f9602m = str3;
            this.f9603n = j4;
            this.f9604o = j5;
            this.f9605p = z;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l) {
            Long l2 = l;
            if (this.f9599j > l2.longValue()) {
                return 1;
            }
            return this.f9599j < l2.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.g$f */
    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final long f9606a;

        /* JADX INFO: renamed from: b */
        public final boolean f9607b;

        /* JADX INFO: renamed from: c */
        public final long f9608c;

        /* JADX INFO: renamed from: d */
        public final long f9609d;

        /* JADX INFO: renamed from: e */
        public final boolean f9610e;

        public f(long j2, boolean z, long j3, long j4, boolean z2) {
            this.f9606a = j2;
            this.f9607b = z;
            this.f9608c = j3;
            this.f9609d = j4;
            this.f9610e = z2;
        }
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j2, long j3, boolean z, int i2, long j4, int i3, long j5, long j6, boolean z2, boolean z3, boolean z4, DrmInitData drmInitData, List<d> list2, List<b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z2);
        this.f9572d = i;
        this.f9574f = j3;
        this.f9575g = z;
        this.f9576h = i2;
        this.f9577i = j4;
        this.f9578j = i3;
        this.f9579k = j5;
        this.f9580l = j6;
        this.f9581m = z3;
        this.f9582n = z4;
        this.f9583o = drmInitData;
        this.f9584p = ImmutableList2.m11642x(list2);
        this.f9585q = ImmutableList2.m11642x(list3);
        this.f9586r = ImmutableMap.m11651a(map);
        if (!list3.isEmpty()) {
            b bVar = (b) C4799a.m10965P(list3);
            this.f9587s = bVar.f9599j + bVar.f9597h;
        } else if (list2.isEmpty()) {
            this.f9587s = 0L;
        } else {
            d dVar = (d) C4799a.m10965P(list2);
            this.f9587s = dVar.f9599j + dVar.f9597h;
        }
        this.f9573e = j2 == -9223372036854775807L ? -9223372036854775807L : j2 >= 0 ? j2 : this.f9587s + j2;
        this.f9588t = fVar;
    }

    @Override // p007c.p190n.p194b.p209b.p242v1.FilterableManifest
    /* JADX INFO: renamed from: a */
    public HlsPlaylist mo4049a(List list) {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public long m4346b() {
        return this.f9574f + this.f9587s;
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.g$d */
    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class d extends e {

        /* JADX INFO: renamed from: q */
        public final String f9593q;

        /* JADX INFO: renamed from: r */
        public final List<b> f9594r;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(String str, long j2, long j3, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j2, j3, false, RegularImmutableList.f26218h);
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
        }

        public d(String str, d dVar, String str2, long j2, int i, long j3, DrmInitData drmInitData, String str3, String str4, long j4, long j5, boolean z, List<b> list) {
            super(str, dVar, j2, i, j3, drmInitData, str3, str4, j4, j5, z, null);
            this.f9593q = str2;
            this.f9594r = ImmutableList2.m11642x(list);
        }
    }
}
