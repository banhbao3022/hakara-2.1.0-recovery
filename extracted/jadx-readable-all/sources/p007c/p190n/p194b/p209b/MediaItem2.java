package p007c.p190n.p194b.p209b;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p242v1.StreamKey;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s0, reason: use source file name */
/* JADX INFO: compiled from: MediaItem.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaItem2 {

    /* JADX INFO: renamed from: a */
    public final String f7465a;

    /* JADX INFO: renamed from: b */
    public final g f7466b;

    /* JADX INFO: renamed from: c */
    public final f f7467c;

    /* JADX INFO: renamed from: d */
    public final MediaMetadata f7468d;

    /* JADX INFO: renamed from: e */
    public final d f7469e;

    /* JADX INFO: renamed from: c.n.b.b.s0$b */
    /* JADX INFO: compiled from: MediaItem.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Uri f7470a;

        /* JADX INFO: renamed from: b */
        public final Object f7471b;

        public b(Uri uri, Object obj, a aVar) {
            this.f7470a = uri;
            this.f7471b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7470a.equals(bVar.f7470a) && Util6.m3113a(this.f7471b, bVar.f7471b);
        }

        public int hashCode() {
            int iHashCode = this.f7470a.hashCode() * 31;
            Object obj = this.f7471b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s0$c */
    /* JADX INFO: compiled from: MediaItem.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public String f7474a;

        /* JADX INFO: renamed from: b */
        public Uri f7475b;

        /* JADX INFO: renamed from: c */
        public String f7476c;

        /* JADX INFO: renamed from: d */
        public long f7477d;

        /* JADX INFO: renamed from: f */
        public boolean f7479f;

        /* JADX INFO: renamed from: g */
        public boolean f7480g;

        /* JADX INFO: renamed from: h */
        public boolean f7481h;

        /* JADX INFO: renamed from: i */
        public Uri f7482i;

        /* JADX INFO: renamed from: k */
        public UUID f7484k;

        /* JADX INFO: renamed from: l */
        public boolean f7485l;

        /* JADX INFO: renamed from: m */
        public boolean f7486m;

        /* JADX INFO: renamed from: n */
        public boolean f7487n;

        /* JADX INFO: renamed from: p */
        public byte[] f7489p;

        /* JADX INFO: renamed from: r */
        public String f7491r;

        /* JADX INFO: renamed from: t */
        public Uri f7493t;

        /* JADX INFO: renamed from: u */
        public Object f7494u;

        /* JADX INFO: renamed from: v */
        public Object f7495v;

        /* JADX INFO: renamed from: w */
        public MediaMetadata f7496w;

        /* JADX INFO: renamed from: e */
        public long f7478e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: o */
        public List<Integer> f7488o = Collections.emptyList();

        /* JADX INFO: renamed from: j */
        public Map<String, String> f7483j = Collections.emptyMap();

        /* JADX INFO: renamed from: q */
        public List<StreamKey> f7490q = Collections.emptyList();

        /* JADX INFO: renamed from: s */
        public List<?> f7492s = Collections.emptyList();

        /* JADX INFO: renamed from: x */
        public long f7497x = -9223372036854775807L;

        /* JADX INFO: renamed from: y */
        public long f7498y = -9223372036854775807L;

        /* JADX INFO: renamed from: z */
        public long f7499z = -9223372036854775807L;

        /* JADX INFO: renamed from: A */
        public float f7472A = -3.4028235E38f;

        /* JADX INFO: renamed from: B */
        public float f7473B = -3.4028235E38f;

        /* JADX INFO: renamed from: a */
        public MediaItem2 m3708a() {
            g gVar;
            C2096e.m4570f(this.f7482i == null || this.f7484k != null);
            Uri uri = this.f7475b;
            if (uri != null) {
                String str = this.f7476c;
                UUID uuid = this.f7484k;
                e eVar = uuid != null ? new e(uuid, this.f7482i, this.f7483j, this.f7485l, this.f7487n, this.f7486m, this.f7488o, this.f7489p, null) : null;
                Uri uri2 = this.f7493t;
                g gVar2 = new g(uri, str, eVar, uri2 != null ? new b(uri2, this.f7494u, null) : null, this.f7490q, this.f7491r, this.f7492s, this.f7495v, null);
                String string = this.f7474a;
                if (string == null) {
                    string = uri.toString();
                }
                this.f7474a = string;
                gVar = gVar2;
            } else {
                gVar = null;
            }
            String str2 = this.f7474a;
            Objects.requireNonNull(str2);
            d dVar = new d(this.f7477d, this.f7478e, this.f7479f, this.f7480g, this.f7481h, null);
            f fVar = new f(this.f7497x, this.f7498y, this.f7499z, this.f7472A, this.f7473B);
            MediaMetadata mediaMetadata = this.f7496w;
            if (mediaMetadata == null) {
                new MediaMetadata.b();
                mediaMetadata = new MediaMetadata(null, null);
            }
            return new MediaItem2(str2, dVar, gVar, fVar, mediaMetadata, null);
        }

        /* JADX INFO: renamed from: b */
        public c m3709b(List<StreamKey> list) {
            this.f7490q = !list.isEmpty() ? Collections.unmodifiableList(new ArrayList(list)) : Collections.emptyList();
            return this;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s0$d */
    /* JADX INFO: compiled from: MediaItem.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final long f7500a;

        /* JADX INFO: renamed from: b */
        public final long f7501b;

        /* JADX INFO: renamed from: c */
        public final boolean f7502c;

        /* JADX INFO: renamed from: d */
        public final boolean f7503d;

        /* JADX INFO: renamed from: e */
        public final boolean f7504e;

        public d(long j2, long j3, boolean z, boolean z2, boolean z3, a aVar) {
            this.f7500a = j2;
            this.f7501b = j3;
            this.f7502c = z;
            this.f7503d = z2;
            this.f7504e = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f7500a == dVar.f7500a && this.f7501b == dVar.f7501b && this.f7502c == dVar.f7502c && this.f7503d == dVar.f7503d && this.f7504e == dVar.f7504e;
        }

        public int hashCode() {
            long j2 = this.f7500a;
            int i = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.f7501b;
            return ((((((i + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f7502c ? 1 : 0)) * 31) + (this.f7503d ? 1 : 0)) * 31) + (this.f7504e ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s0$e */
    /* JADX INFO: compiled from: MediaItem.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final UUID f7505a;

        /* JADX INFO: renamed from: b */
        public final Uri f7506b;

        /* JADX INFO: renamed from: c */
        public final Map<String, String> f7507c;

        /* JADX INFO: renamed from: d */
        public final boolean f7508d;

        /* JADX INFO: renamed from: e */
        public final boolean f7509e;

        /* JADX INFO: renamed from: f */
        public final boolean f7510f;

        /* JADX INFO: renamed from: g */
        public final List<Integer> f7511g;

        /* JADX INFO: renamed from: h */
        public final byte[] f7512h;

        public e(UUID uuid, Uri uri, Map map, boolean z, boolean z2, boolean z3, List list, byte[] bArr, a aVar) {
            C2096e.m4566b((z2 && uri == null) ? false : true);
            this.f7505a = uuid;
            this.f7506b = uri;
            this.f7507c = map;
            this.f7508d = z;
            this.f7510f = z2;
            this.f7509e = z3;
            this.f7511g = list;
            this.f7512h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f7505a.equals(eVar.f7505a) && Util6.m3113a(this.f7506b, eVar.f7506b) && Util6.m3113a(this.f7507c, eVar.f7507c) && this.f7508d == eVar.f7508d && this.f7510f == eVar.f7510f && this.f7509e == eVar.f7509e && this.f7511g.equals(eVar.f7511g) && Arrays.equals(this.f7512h, eVar.f7512h);
        }

        public int hashCode() {
            int iHashCode = this.f7505a.hashCode() * 31;
            Uri uri = this.f7506b;
            return Arrays.hashCode(this.f7512h) + ((this.f7511g.hashCode() + ((((((((this.f7507c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f7508d ? 1 : 0)) * 31) + (this.f7510f ? 1 : 0)) * 31) + (this.f7509e ? 1 : 0)) * 31)) * 31);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s0$f */
    /* JADX INFO: compiled from: MediaItem.java */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final long f7513a;

        /* JADX INFO: renamed from: b */
        public final long f7514b;

        /* JADX INFO: renamed from: c */
        public final long f7515c;

        /* JADX INFO: renamed from: d */
        public final float f7516d;

        /* JADX INFO: renamed from: e */
        public final float f7517e;

        static {
            new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        }

        public f(long j2, long j3, long j4, float f, float f2) {
            this.f7513a = j2;
            this.f7514b = j3;
            this.f7515c = j4;
            this.f7516d = f;
            this.f7517e = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f7513a == fVar.f7513a && this.f7514b == fVar.f7514b && this.f7515c == fVar.f7515c && this.f7516d == fVar.f7516d && this.f7517e == fVar.f7517e;
        }

        public int hashCode() {
            long j2 = this.f7513a;
            long j3 = this.f7514b;
            int i = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f7515c;
            int i2 = (i + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            float f = this.f7516d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f7517e;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s0$g */
    /* JADX INFO: compiled from: MediaItem.java */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final Uri f7518a;

        /* JADX INFO: renamed from: b */
        public final String f7519b;

        /* JADX INFO: renamed from: c */
        public final e f7520c;

        /* JADX INFO: renamed from: d */
        public final b f7521d;

        /* JADX INFO: renamed from: e */
        public final List<StreamKey> f7522e;

        /* JADX INFO: renamed from: f */
        public final String f7523f;

        /* JADX INFO: renamed from: g */
        public final List<?> f7524g;

        /* JADX INFO: renamed from: h */
        public final Object f7525h;

        public g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj, a aVar) {
            this.f7518a = uri;
            this.f7519b = str;
            this.f7520c = eVar;
            this.f7521d = bVar;
            this.f7522e = list;
            this.f7523f = str2;
            this.f7524g = list2;
            this.f7525h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f7518a.equals(gVar.f7518a) && Util6.m3113a(this.f7519b, gVar.f7519b) && Util6.m3113a(this.f7520c, gVar.f7520c) && Util6.m3113a(this.f7521d, gVar.f7521d) && this.f7522e.equals(gVar.f7522e) && Util6.m3113a(this.f7523f, gVar.f7523f) && this.f7524g.equals(gVar.f7524g) && Util6.m3113a(this.f7525h, gVar.f7525h);
        }

        public int hashCode() {
            int iHashCode = this.f7518a.hashCode() * 31;
            String str = this.f7519b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.f7520c;
            int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            b bVar = this.f7521d;
            int iHashCode4 = (this.f7522e.hashCode() + ((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            String str2 = this.f7523f;
            int iHashCode5 = (this.f7524g.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f7525h;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public MediaItem2(String str, d dVar, g gVar, f fVar, MediaMetadata mediaMetadata, a aVar) {
        this.f7465a = str;
        this.f7466b = gVar;
        this.f7467c = fVar;
        this.f7468d = mediaMetadata;
        this.f7469e = dVar;
    }

    /* JADX INFO: renamed from: a */
    public c m3707a() {
        c cVar = new c();
        d dVar = this.f7469e;
        cVar.f7478e = dVar.f7501b;
        cVar.f7479f = dVar.f7502c;
        cVar.f7480g = dVar.f7503d;
        cVar.f7477d = dVar.f7500a;
        cVar.f7481h = dVar.f7504e;
        cVar.f7474a = this.f7465a;
        cVar.f7496w = this.f7468d;
        f fVar = this.f7467c;
        cVar.f7497x = fVar.f7513a;
        cVar.f7498y = fVar.f7514b;
        cVar.f7499z = fVar.f7515c;
        cVar.f7472A = fVar.f7516d;
        cVar.f7473B = fVar.f7517e;
        g gVar = this.f7466b;
        if (gVar != null) {
            cVar.f7491r = gVar.f7523f;
            cVar.f7476c = gVar.f7519b;
            cVar.f7475b = gVar.f7518a;
            cVar.f7490q = gVar.f7522e;
            cVar.f7492s = gVar.f7524g;
            cVar.f7495v = gVar.f7525h;
            e eVar = gVar.f7520c;
            if (eVar != null) {
                cVar.f7482i = eVar.f7506b;
                cVar.f7483j = eVar.f7507c;
                cVar.f7485l = eVar.f7508d;
                cVar.f7487n = eVar.f7510f;
                cVar.f7486m = eVar.f7509e;
                cVar.f7488o = eVar.f7511g;
                cVar.f7484k = eVar.f7505a;
                byte[] bArr = eVar.f7512h;
                cVar.f7489p = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
            }
            b bVar = gVar.f7521d;
            if (bVar != null) {
                cVar.f7493t = bVar.f7470a;
                cVar.f7494u = bVar.f7471b;
            }
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem2)) {
            return false;
        }
        MediaItem2 mediaItem2 = (MediaItem2) obj;
        return Util6.m3113a(this.f7465a, mediaItem2.f7465a) && this.f7469e.equals(mediaItem2.f7469e) && Util6.m3113a(this.f7466b, mediaItem2.f7466b) && Util6.m3113a(this.f7467c, mediaItem2.f7467c) && Util6.m3113a(this.f7468d, mediaItem2.f7468d);
    }

    public int hashCode() {
        int iHashCode = this.f7465a.hashCode() * 31;
        g gVar = this.f7466b;
        return this.f7468d.hashCode() + ((this.f7469e.hashCode() + ((this.f7467c.hashCode() + ((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
