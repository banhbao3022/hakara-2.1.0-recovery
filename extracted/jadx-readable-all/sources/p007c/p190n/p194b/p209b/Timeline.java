package p007c.p190n.p194b.p209b;

import android.net.Uri;
import android.util.Pair;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.p244t0.AdPlaybackState;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.l1, reason: use source file name */
/* JADX INFO: compiled from: Timeline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Timeline {

    /* JADX INFO: renamed from: a */
    public static final Timeline f6743a = new a();

    /* JADX INFO: renamed from: c.n.b.b.l1$a */
    /* JADX INFO: compiled from: Timeline.java */
    public class a extends Timeline {
        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: b */
        public int mo3457b(Object obj) {
            return -1;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: g */
        public b mo3462g(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: i */
        public int mo3355i() {
            return 0;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: m */
        public Object mo3467m(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: o */
        public c mo3469o(int i, c cVar, long j2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: p */
        public int mo3356p() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.l1$b */
    /* JADX INFO: compiled from: Timeline.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Object f6744a;

        /* JADX INFO: renamed from: b */
        public Object f6745b;

        /* JADX INFO: renamed from: c */
        public int f6746c;

        /* JADX INFO: renamed from: d */
        public long f6747d;

        /* JADX INFO: renamed from: e */
        public long f6748e;

        /* JADX INFO: renamed from: f */
        public AdPlaybackState f6749f = AdPlaybackState.f9074a;

        /* JADX INFO: renamed from: a */
        public long m3471a(int i, int i2) {
            AdPlaybackState.a aVar = this.f6749f.f9078e[i];
            if (aVar.f9081a != -1) {
                return aVar.f9084d[i2];
            }
            return -9223372036854775807L;
        }

        /* JADX INFO: renamed from: b */
        public int m3472b(long j2) {
            AdPlaybackState adPlaybackState = this.f6749f;
            long j3 = this.f6747d;
            Objects.requireNonNull(adPlaybackState);
            if (j2 == Long.MIN_VALUE) {
                return -1;
            }
            if (j3 != -9223372036854775807L && j2 >= j3) {
                return -1;
            }
            int i = 0;
            while (true) {
                long[] jArr = adPlaybackState.f9077d;
                if (i >= jArr.length || jArr[i] == Long.MIN_VALUE || (j2 < jArr[i] && adPlaybackState.f9078e[i].m4195b())) {
                    break;
                }
                i++;
            }
            if (i < adPlaybackState.f9077d.length) {
                return i;
            }
            return -1;
        }

        /* JADX INFO: renamed from: c */
        public int m3473c(long j2) {
            AdPlaybackState adPlaybackState = this.f6749f;
            long j3 = this.f6747d;
            int length = adPlaybackState.f9077d.length - 1;
            while (length >= 0) {
                boolean z = false;
                if (j2 != Long.MIN_VALUE) {
                    long j4 = adPlaybackState.f9077d[length];
                    if (j4 != Long.MIN_VALUE ? j2 < j4 : !(j3 != -9223372036854775807L && j2 >= j3)) {
                        z = true;
                    }
                }
                if (!z) {
                    break;
                }
                length--;
            }
            if (length < 0 || !adPlaybackState.f9078e[length].m4195b()) {
                return -1;
            }
            return length;
        }

        /* JADX INFO: renamed from: d */
        public long m3474d(int i) {
            return this.f6749f.f9077d[i];
        }

        /* JADX INFO: renamed from: e */
        public int m3475e(int i) {
            return this.f6749f.f9078e[i].m4194a(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return Util6.m3113a(this.f6744a, bVar.f6744a) && Util6.m3113a(this.f6745b, bVar.f6745b) && this.f6746c == bVar.f6746c && this.f6747d == bVar.f6747d && this.f6748e == bVar.f6748e && Util6.m3113a(this.f6749f, bVar.f6749f);
        }

        /* JADX INFO: renamed from: f */
        public b m3476f(Object obj, Object obj2, int i, long j2, long j3) {
            AdPlaybackState adPlaybackState = AdPlaybackState.f9074a;
            this.f6744a = obj;
            this.f6745b = obj2;
            this.f6746c = i;
            this.f6747d = j2;
            this.f6748e = j3;
            this.f6749f = adPlaybackState;
            return this;
        }

        public int hashCode() {
            Object obj = this.f6744a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f6745b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f6746c) * 31;
            long j2 = this.f6747d;
            int i = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f6748e;
            return this.f6749f.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.l1$c */
    /* JADX INFO: compiled from: Timeline.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final Object f6750a = new Object();

        /* JADX INFO: renamed from: b */
        public static final MediaItem2 f6751b;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public Object f6753d;

        /* JADX INFO: renamed from: f */
        public Object f6755f;

        /* JADX INFO: renamed from: g */
        public long f6756g;

        /* JADX INFO: renamed from: h */
        public long f6757h;

        /* JADX INFO: renamed from: i */
        public long f6758i;

        /* JADX INFO: renamed from: j */
        public boolean f6759j;

        /* JADX INFO: renamed from: k */
        public boolean f6760k;

        /* JADX INFO: renamed from: l */
        @Deprecated
        public boolean f6761l;

        /* JADX INFO: renamed from: m */
        public MediaItem2.f f6762m;

        /* JADX INFO: renamed from: n */
        public boolean f6763n;

        /* JADX INFO: renamed from: o */
        public int f6764o;

        /* JADX INFO: renamed from: p */
        public int f6765p;

        /* JADX INFO: renamed from: q */
        public long f6766q;

        /* JADX INFO: renamed from: r */
        public long f6767r;

        /* JADX INFO: renamed from: s */
        public long f6768s;

        /* JADX INFO: renamed from: c */
        public Object f6752c = f6750a;

        /* JADX INFO: renamed from: e */
        public MediaItem2 f6754e = f6751b;

        static {
            MediaItem2.c cVar = new MediaItem2.c();
            cVar.f7474a = "com.google.android.exoplayer2.Timeline";
            cVar.f7475b = Uri.EMPTY;
            f6751b = cVar.m3708a();
        }

        /* JADX INFO: renamed from: a */
        public long m3477a() {
            return C.m3237c(this.f6766q);
        }

        /* JADX INFO: renamed from: b */
        public long m3478b() {
            return C.m3237c(this.f6767r);
        }

        /* JADX INFO: renamed from: c */
        public boolean m3479c() {
            C2096e.m4570f(this.f6761l == (this.f6762m != null));
            return this.f6762m != null;
        }

        /* JADX INFO: renamed from: d */
        public c m3480d(Object obj, MediaItem2 mediaItem2, Object obj2, long j2, long j3, long j4, boolean z, boolean z2, MediaItem2.f fVar, long j5, long j6, int i, int i2, long j7) {
            MediaItem2.g gVar;
            this.f6752c = obj;
            this.f6754e = mediaItem2 != null ? mediaItem2 : f6751b;
            this.f6753d = (mediaItem2 == null || (gVar = mediaItem2.f7466b) == null) ? null : gVar.f7525h;
            this.f6755f = obj2;
            this.f6756g = j2;
            this.f6757h = j3;
            this.f6758i = j4;
            this.f6759j = z;
            this.f6760k = z2;
            this.f6761l = fVar != null;
            this.f6762m = fVar;
            this.f6766q = j5;
            this.f6767r = j6;
            this.f6764o = i;
            this.f6765p = i2;
            this.f6768s = j7;
            this.f6763n = false;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return Util6.m3113a(this.f6752c, cVar.f6752c) && Util6.m3113a(this.f6754e, cVar.f6754e) && Util6.m3113a(this.f6755f, cVar.f6755f) && Util6.m3113a(this.f6762m, cVar.f6762m) && this.f6756g == cVar.f6756g && this.f6757h == cVar.f6757h && this.f6758i == cVar.f6758i && this.f6759j == cVar.f6759j && this.f6760k == cVar.f6760k && this.f6763n == cVar.f6763n && this.f6766q == cVar.f6766q && this.f6767r == cVar.f6767r && this.f6764o == cVar.f6764o && this.f6765p == cVar.f6765p && this.f6768s == cVar.f6768s;
        }

        public int hashCode() {
            int iHashCode = (this.f6754e.hashCode() + ((this.f6752c.hashCode() + 217) * 31)) * 31;
            Object obj = this.f6755f;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem2.f fVar = this.f6762m;
            int iHashCode3 = (iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
            long j2 = this.f6756g;
            int i = (iHashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f6757h;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f6758i;
            int i3 = (((((((i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f6759j ? 1 : 0)) * 31) + (this.f6760k ? 1 : 0)) * 31) + (this.f6763n ? 1 : 0)) * 31;
            long j5 = this.f6766q;
            int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f6767r;
            int i5 = (((((i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f6764o) * 31) + this.f6765p) * 31;
            long j7 = this.f6768s;
            return i5 + ((int) (j7 ^ (j7 >>> 32)));
        }
    }

    /* JADX INFO: renamed from: a */
    public int mo3456a(boolean z) {
        return m3470q() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo3457b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo3458c(boolean z) {
        if (m3470q()) {
            return -1;
        }
        return mo3356p() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m3459d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = mo3462g(i, bVar, false).f6746c;
        if (m3468n(i3, cVar).f6765p != i) {
            return i + 1;
        }
        int iMo3460e = mo3460e(i3, i2, z);
        if (iMo3460e == -1) {
            return -1;
        }
        return m3468n(iMo3460e, cVar).f6764o;
    }

    /* JADX INFO: renamed from: e */
    public int mo3460e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo3458c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo3458c(z) ? mo3456a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.mo3356p() != mo3356p() || timeline.mo3355i() != mo3355i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i = 0; i < mo3356p(); i++) {
            if (!m3468n(i, cVar).equals(timeline.m3468n(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo3355i(); i2++) {
            if (!mo3462g(i2, bVar, true).equals(timeline.mo3462g(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final b m3461f(int i, b bVar) {
        return mo3462g(i, bVar, false);
    }

    /* JADX INFO: renamed from: g */
    public abstract b mo3462g(int i, b bVar, boolean z);

    /* JADX INFO: renamed from: h */
    public b mo3463h(Object obj, b bVar) {
        return mo3462g(mo3457b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iMo3356p = mo3356p() + 217;
        for (int i = 0; i < mo3356p(); i++) {
            iMo3356p = (iMo3356p * 31) + m3468n(i, cVar).hashCode();
        }
        int iMo3355i = mo3355i() + (iMo3356p * 31);
        for (int i2 = 0; i2 < mo3355i(); i2++) {
            iMo3355i = (iMo3355i * 31) + mo3462g(i2, bVar, true).hashCode();
        }
        return iMo3355i;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo3355i();

    /* JADX INFO: renamed from: j */
    public final Pair<Object, Long> m3464j(c cVar, b bVar, int i, long j2) {
        Pair<Object, Long> pairM3465k = m3465k(cVar, bVar, i, j2, 0L);
        Objects.requireNonNull(pairM3465k);
        return pairM3465k;
    }

    /* JADX INFO: renamed from: k */
    public final Pair<Object, Long> m3465k(c cVar, b bVar, int i, long j2, long j3) {
        C2096e.m4569e(i, 0, mo3356p());
        mo3469o(i, cVar, j3);
        if (j2 == -9223372036854775807L) {
            j2 = cVar.f6766q;
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f6764o;
        long j4 = cVar.f6768s + j2;
        long j5 = mo3462g(i2, bVar, true).f6747d;
        while (j5 != -9223372036854775807L && j4 >= j5 && i2 < cVar.f6765p) {
            j4 -= j5;
            i2++;
            j5 = mo3462g(i2, bVar, true).f6747d;
        }
        Object obj = bVar.f6745b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(j4));
    }

    /* JADX INFO: renamed from: l */
    public int mo3466l(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo3456a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo3456a(z) ? mo3458c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: m */
    public abstract Object mo3467m(int i);

    /* JADX INFO: renamed from: n */
    public final c m3468n(int i, c cVar) {
        return mo3469o(i, cVar, 0L);
    }

    /* JADX INFO: renamed from: o */
    public abstract c mo3469o(int i, c cVar, long j2);

    /* JADX INFO: renamed from: p */
    public abstract int mo3356p();

    /* JADX INFO: renamed from: q */
    public final boolean m3470q() {
        return mo3356p() == 0;
    }
}
