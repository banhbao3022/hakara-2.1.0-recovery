package p007c.p190n.p194b.p209b;

import android.os.Handler;
import android.util.Pair;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsCollector;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.p244t0.AdPlaybackState;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;

/* JADX INFO: renamed from: c.n.b.b.w0, reason: use source file name */
/* JADX INFO: compiled from: MediaPeriodQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaPeriodQueue {

    /* JADX INFO: renamed from: a */
    public final Timeline.b f8825a = new Timeline.b();

    /* JADX INFO: renamed from: b */
    public final Timeline.c f8826b = new Timeline.c();

    /* JADX INFO: renamed from: c */
    public final AnalyticsCollector f8827c;

    /* JADX INFO: renamed from: d */
    public final Handler f8828d;

    /* JADX INFO: renamed from: e */
    public long f8829e;

    /* JADX INFO: renamed from: f */
    public int f8830f;

    /* JADX INFO: renamed from: g */
    public boolean f8831g;

    /* JADX INFO: renamed from: h */
    public MediaPeriodHolder f8832h;

    /* JADX INFO: renamed from: i */
    public MediaPeriodHolder f8833i;

    /* JADX INFO: renamed from: j */
    public MediaPeriodHolder f8834j;

    /* JADX INFO: renamed from: k */
    public int f8835k;

    /* JADX INFO: renamed from: l */
    public Object f8836l;

    /* JADX INFO: renamed from: m */
    public long f8837m;

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, Handler handler) {
        this.f8827c = analyticsCollector;
        this.f8828d = handler;
    }

    /* JADX INFO: renamed from: o */
    public static MediaSource2.a m4050o(Timeline timeline, Object obj, long j2, long j3, Timeline.b bVar) {
        timeline.mo3463h(obj, bVar);
        int iM3473c = bVar.m3473c(j2);
        return iM3473c == -1 ? new MediaSource2.a(obj, j3, bVar.m3472b(j2)) : new MediaSource2.a(obj, iM3473c, bVar.m3475e(iM3473c), j3);
    }

    /* JADX INFO: renamed from: a */
    public MediaPeriodHolder m4051a() {
        MediaPeriodHolder mediaPeriodHolder = this.f8832h;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.f8833i) {
            this.f8833i = mediaPeriodHolder.f8657l;
        }
        mediaPeriodHolder.m4006h();
        int i = this.f8835k - 1;
        this.f8835k = i;
        if (i == 0) {
            this.f8834j = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.f8832h;
            this.f8836l = mediaPeriodHolder2.f8647b;
            this.f8837m = mediaPeriodHolder2.f8651f.f8809a.f8860d;
        }
        this.f8832h = this.f8832h.f8657l;
        m4061k();
        return this.f8832h;
    }

    /* JADX INFO: renamed from: b */
    public void m4052b() {
        if (this.f8835k == 0) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder = this.f8832h;
        C2096e.m4572h(mediaPeriodHolder);
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder;
        this.f8836l = mediaPeriodHolder2.f8647b;
        this.f8837m = mediaPeriodHolder2.f8651f.f8809a.f8860d;
        while (mediaPeriodHolder2 != null) {
            mediaPeriodHolder2.m4006h();
            mediaPeriodHolder2 = mediaPeriodHolder2.f8657l;
        }
        this.f8832h = null;
        this.f8834j = null;
        this.f8833i = null;
        this.f8835k = 0;
        m4061k();
    }

    /* JADX INFO: renamed from: c */
    public final MediaPeriodInfo m4053c(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j2) {
        long j3;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f8651f;
        long j4 = (mediaPeriodHolder.f8660o + mediaPeriodInfo.f8813e) - j2;
        if (mediaPeriodInfo.f8814f) {
            long j5 = 0;
            int iM3459d = timeline.m3459d(timeline.mo3457b(mediaPeriodInfo.f8809a.f8857a), this.f8825a, this.f8826b, this.f8830f, this.f8831g);
            if (iM3459d == -1) {
                return null;
            }
            int i = timeline.mo3462g(iM3459d, this.f8825a, true).f6746c;
            Object obj = this.f8825a.f6745b;
            long j6 = mediaPeriodInfo.f8809a.f8860d;
            if (timeline.m3468n(i, this.f8826b).f6764o == iM3459d) {
                Pair<Object, Long> pairM3465k = timeline.m3465k(this.f8826b, this.f8825a, i, -9223372036854775807L, Math.max(0L, j4));
                if (pairM3465k == null) {
                    return null;
                }
                obj = pairM3465k.first;
                long jLongValue = ((Long) pairM3465k.second).longValue();
                MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder.f8657l;
                if (mediaPeriodHolder2 == null || !mediaPeriodHolder2.f8647b.equals(obj)) {
                    j6 = this.f8829e;
                    this.f8829e = 1 + j6;
                } else {
                    j6 = mediaPeriodHolder2.f8651f.f8809a.f8860d;
                }
                j3 = jLongValue;
                j5 = -9223372036854775807L;
            } else {
                j3 = 0;
            }
            return m4054d(timeline, m4050o(timeline, obj, j3, j6, this.f8825a), j5, j3);
        }
        MediaSource2.a aVar = mediaPeriodInfo.f8809a;
        timeline.mo3463h(aVar.f8857a, this.f8825a);
        if (!aVar.m4081a()) {
            int iM3473c = this.f8825a.m3473c(mediaPeriodInfo.f8812d);
            if (iM3473c != -1) {
                return m4055e(timeline, aVar.f8857a, iM3473c, this.f8825a.m3475e(iM3473c), mediaPeriodInfo.f8813e, aVar.f8860d);
            }
            Object obj2 = aVar.f8857a;
            long j7 = mediaPeriodInfo.f8813e;
            return m4056f(timeline, obj2, j7, j7, aVar.f8860d);
        }
        int i2 = aVar.f8858b;
        AdPlaybackState.a[] aVarArr = this.f8825a.f6749f.f9078e;
        int i3 = aVarArr[i2].f9081a;
        if (i3 == -1) {
            return null;
        }
        int iM4194a = aVarArr[i2].m4194a(aVar.f8859c);
        if (iM4194a < i3) {
            return m4055e(timeline, aVar.f8857a, i2, iM4194a, mediaPeriodInfo.f8811c, aVar.f8860d);
        }
        long jLongValue2 = mediaPeriodInfo.f8811c;
        if (jLongValue2 == -9223372036854775807L) {
            Timeline.c cVar = this.f8826b;
            Timeline.b bVar = this.f8825a;
            Pair<Object, Long> pairM3465k2 = timeline.m3465k(cVar, bVar, bVar.f6746c, -9223372036854775807L, Math.max(0L, j4));
            if (pairM3465k2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairM3465k2.second).longValue();
        }
        return m4056f(timeline, aVar.f8857a, jLongValue2, mediaPeriodInfo.f8811c, aVar.f8860d);
    }

    /* JADX INFO: renamed from: d */
    public final MediaPeriodInfo m4054d(Timeline timeline, MediaSource2.a aVar, long j2, long j3) {
        timeline.mo3463h(aVar.f8857a, this.f8825a);
        return aVar.m4081a() ? m4055e(timeline, aVar.f8857a, aVar.f8858b, aVar.f8859c, j2, aVar.f8860d) : m4056f(timeline, aVar.f8857a, j3, j2, aVar.f8860d);
    }

    /* JADX INFO: renamed from: e */
    public final MediaPeriodInfo m4055e(Timeline timeline, Object obj, int i, int i2, long j2, long j3) {
        MediaSource2.a aVar = new MediaSource2.a(obj, i, i2, j3);
        long jM3471a = timeline.mo3463h(aVar.f8857a, this.f8825a).m3471a(aVar.f8858b, aVar.f8859c);
        long j4 = i2 == this.f8825a.f6749f.f9078e[i].m4194a(-1) ? this.f8825a.f6749f.f9079f : 0L;
        return new MediaPeriodInfo(aVar, (jM3471a == -9223372036854775807L || j4 < jM3471a) ? j4 : Math.max(0L, jM3471a - 1), j2, -9223372036854775807L, jM3471a, false, false, false);
    }

    /* JADX INFO: renamed from: f */
    public final MediaPeriodInfo m4056f(Timeline timeline, Object obj, long j2, long j3, long j4) {
        long jMax = j2;
        timeline.mo3463h(obj, this.f8825a);
        int iM3472b = this.f8825a.m3472b(jMax);
        MediaSource2.a aVar = new MediaSource2.a(obj, j4, iM3472b);
        boolean zM4058h = m4058h(aVar);
        boolean zM4060j = m4060j(timeline, aVar);
        boolean zM4059i = m4059i(timeline, aVar, zM4058h);
        long jM3474d = iM3472b != -1 ? this.f8825a.m3474d(iM3472b) : -9223372036854775807L;
        long j5 = (jM3474d == -9223372036854775807L || jM3474d == Long.MIN_VALUE) ? this.f8825a.f6747d : jM3474d;
        if (j5 != -9223372036854775807L && jMax >= j5) {
            jMax = Math.max(0L, j5 - 1);
        }
        return new MediaPeriodInfo(aVar, jMax, j3, jM3474d, j5, zM4058h, zM4060j, zM4059i);
    }

    /* JADX INFO: renamed from: g */
    public MediaPeriodInfo m4057g(Timeline timeline, MediaPeriodInfo mediaPeriodInfo) {
        long jM3471a;
        MediaSource2.a aVar = mediaPeriodInfo.f8809a;
        boolean zM4058h = m4058h(aVar);
        boolean zM4060j = m4060j(timeline, aVar);
        boolean zM4059i = m4059i(timeline, aVar, zM4058h);
        timeline.mo3463h(mediaPeriodInfo.f8809a.f8857a, this.f8825a);
        if (aVar.m4081a()) {
            jM3471a = this.f8825a.m3471a(aVar.f8858b, aVar.f8859c);
        } else {
            jM3471a = mediaPeriodInfo.f8812d;
            if (jM3471a == -9223372036854775807L || jM3471a == Long.MIN_VALUE) {
                jM3471a = this.f8825a.f6747d;
            }
        }
        return new MediaPeriodInfo(aVar, mediaPeriodInfo.f8810b, mediaPeriodInfo.f8811c, mediaPeriodInfo.f8812d, jM3471a, zM4058h, zM4060j, zM4059i);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4058h(MediaSource2.a aVar) {
        return !aVar.m4081a() && aVar.f8861e == -1;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4059i(Timeline timeline, MediaSource2.a aVar, boolean z) {
        int iMo3457b = timeline.mo3457b(aVar.f8857a);
        if (timeline.m3468n(timeline.m3461f(iMo3457b, this.f8825a).f6746c, this.f8826b).f6760k) {
            return false;
        }
        return (timeline.m3459d(iMo3457b, this.f8825a, this.f8826b, this.f8830f, this.f8831g) == -1) && z;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4060j(Timeline timeline, MediaSource2.a aVar) {
        if (m4058h(aVar)) {
            return timeline.m3468n(timeline.mo3463h(aVar.f8857a, this.f8825a).f6746c, this.f8826b).f6765p == timeline.mo3457b(aVar.f8857a);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m4061k() {
        if (this.f8827c != null) {
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            final ImmutableList2.a aVar = new ImmutableList2.a();
            for (MediaPeriodHolder mediaPeriodHolder = this.f8832h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f8657l) {
                aVar.m11646b(mediaPeriodHolder.f8651f.f8809a);
            }
            MediaPeriodHolder mediaPeriodHolder2 = this.f8833i;
            final MediaSource2.a aVar2 = mediaPeriodHolder2 == null ? null : mediaPeriodHolder2.f8651f.f8809a;
            this.f8828d.post(new Runnable() { // from class: c.n.b.b.w
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPeriodQueue mediaPeriodQueue = this.f8822f;
                    ImmutableList2.a aVar3 = aVar;
                    MediaSource2.a aVar4 = aVar2;
                    AnalyticsCollector analyticsCollector = mediaPeriodQueue.f8827c;
                    ImmutableList2 immutableList2M11647c = aVar3.m11647c();
                    AnalyticsCollector.a aVar5 = analyticsCollector.f6900i;
                    Player2 player2 = analyticsCollector.f6903l;
                    Objects.requireNonNull(player2);
                    Objects.requireNonNull(aVar5);
                    aVar5.f6906b = ImmutableList2.m11642x(immutableList2M11647c);
                    if (!immutableList2M11647c.isEmpty()) {
                        aVar5.f6909e = (MediaSource2.a) immutableList2M11647c.get(0);
                        Objects.requireNonNull(aVar4);
                        aVar5.f6910f = aVar4;
                    }
                    if (aVar5.f6908d == null) {
                        aVar5.f6908d = AnalyticsCollector.a.m3510b(player2, aVar5.f6906b, aVar5.f6909e, aVar5.f6905a);
                    }
                    aVar5.m3513d(player2.mo3341p());
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public void m4062l(long j2) {
        MediaPeriodHolder mediaPeriodHolder = this.f8834j;
        if (mediaPeriodHolder != null) {
            C2096e.m4570f(mediaPeriodHolder.m4005g());
            if (mediaPeriodHolder.f8649d) {
                mediaPeriodHolder.f8646a.mo4073h(j2 - mediaPeriodHolder.f8660o);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m4063m(MediaPeriodHolder mediaPeriodHolder) {
        boolean z = false;
        C2096e.m4570f(mediaPeriodHolder != null);
        if (mediaPeriodHolder.equals(this.f8834j)) {
            return false;
        }
        this.f8834j = mediaPeriodHolder;
        while (true) {
            mediaPeriodHolder = mediaPeriodHolder.f8657l;
            if (mediaPeriodHolder == null) {
                break;
            }
            if (mediaPeriodHolder == this.f8833i) {
                this.f8833i = this.f8832h;
                z = true;
            }
            mediaPeriodHolder.m4006h();
            this.f8835k--;
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.f8834j;
        if (mediaPeriodHolder2.f8657l != null) {
            mediaPeriodHolder2.m4000b();
            mediaPeriodHolder2.f8657l = null;
            mediaPeriodHolder2.m4001c();
        }
        m4061k();
        return z;
    }

    /* JADX INFO: renamed from: n */
    public MediaSource2.a m4064n(Timeline timeline, Object obj, long j2) {
        long j3;
        int iMo3457b;
        int i = timeline.mo3463h(obj, this.f8825a).f6746c;
        Object obj2 = this.f8836l;
        if (obj2 == null || (iMo3457b = timeline.mo3457b(obj2)) == -1 || timeline.m3461f(iMo3457b, this.f8825a).f6746c != i) {
            for (MediaPeriodHolder mediaPeriodHolder = this.f8832h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f8657l) {
                if (mediaPeriodHolder.f8647b.equals(obj)) {
                    j3 = mediaPeriodHolder.f8651f.f8809a.f8860d;
                }
            }
            for (MediaPeriodHolder mediaPeriodHolder2 = this.f8832h; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.f8657l) {
                int iMo3457b2 = timeline.mo3457b(mediaPeriodHolder2.f8647b);
                if (iMo3457b2 != -1 && timeline.m3461f(iMo3457b2, this.f8825a).f6746c == i) {
                    j3 = mediaPeriodHolder2.f8651f.f8809a.f8860d;
                }
            }
            j3 = this.f8829e;
            this.f8829e = 1 + j3;
            if (this.f8832h == null) {
                this.f8836l = obj;
                this.f8837m = j3;
            }
        } else {
            j3 = this.f8837m;
        }
        return m4050o(timeline, obj, j2, j3, this.f8825a);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4065p(Timeline timeline) {
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodHolder mediaPeriodHolder2 = this.f8832h;
        if (mediaPeriodHolder2 == null) {
            return true;
        }
        int iMo3457b = timeline.mo3457b(mediaPeriodHolder2.f8647b);
        while (true) {
            iMo3457b = timeline.m3459d(iMo3457b, this.f8825a, this.f8826b, this.f8830f, this.f8831g);
            while (true) {
                mediaPeriodHolder = mediaPeriodHolder2.f8657l;
                if (mediaPeriodHolder == null || mediaPeriodHolder2.f8651f.f8814f) {
                    break;
                }
                mediaPeriodHolder2 = mediaPeriodHolder;
            }
            if (iMo3457b == -1 || mediaPeriodHolder == null || timeline.mo3457b(mediaPeriodHolder.f8647b) != iMo3457b) {
                break;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
        }
        boolean zM4063m = m4063m(mediaPeriodHolder2);
        mediaPeriodHolder2.f8651f = m4057g(timeline, mediaPeriodHolder2.f8651f);
        return !zM4063m;
    }

    /* JADX INFO: renamed from: q */
    public boolean m4066q(Timeline timeline, long j2, long j3) {
        boolean zM4063m;
        MediaPeriodInfo mediaPeriodInfoM4057g;
        MediaPeriodHolder mediaPeriodHolder = this.f8832h;
        MediaPeriodHolder mediaPeriodHolder2 = null;
        while (mediaPeriodHolder != null) {
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f8651f;
            if (mediaPeriodHolder2 != null) {
                MediaPeriodInfo mediaPeriodInfoM4053c = m4053c(timeline, mediaPeriodHolder2, j2);
                if (mediaPeriodInfoM4053c == null) {
                    zM4063m = m4063m(mediaPeriodHolder2);
                } else {
                    if (mediaPeriodInfo.f8810b == mediaPeriodInfoM4053c.f8810b && mediaPeriodInfo.f8809a.equals(mediaPeriodInfoM4053c.f8809a)) {
                        mediaPeriodInfoM4057g = mediaPeriodInfoM4053c;
                    } else {
                        zM4063m = m4063m(mediaPeriodHolder2);
                    }
                }
                return !zM4063m;
            }
            mediaPeriodInfoM4057g = m4057g(timeline, mediaPeriodInfo);
            mediaPeriodHolder.f8651f = mediaPeriodInfoM4057g.m4047a(mediaPeriodInfo.f8811c);
            long j4 = mediaPeriodInfo.f8813e;
            long j5 = mediaPeriodInfoM4057g.f8813e;
            if (!(j4 == -9223372036854775807L || j4 == j5)) {
                return (m4063m(mediaPeriodHolder) || (mediaPeriodHolder == this.f8833i && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : mediaPeriodHolder.f8660o + j5) ? 1 : (j3 == ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : mediaPeriodHolder.f8660o + j5) ? 0 : -1)) >= 0))) ? false : true;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            mediaPeriodHolder = mediaPeriodHolder.f8657l;
        }
        return true;
    }
}
