package p007c.p190n.p194b.p209b;

import android.util.Pair;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p212b2.Log;
import p007c.p190n.p194b.p209b.p243w1.ClippingMediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.EmptySampleStream;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p262y1.TrackSelector;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectorResult;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.u0, reason: use source file name */
/* JADX INFO: compiled from: MediaPeriodHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaPeriodHolder {

    /* JADX INFO: renamed from: a */
    public final MediaPeriod f8646a;

    /* JADX INFO: renamed from: b */
    public final Object f8647b;

    /* JADX INFO: renamed from: c */
    public final SampleStream[] f8648c;

    /* JADX INFO: renamed from: d */
    public boolean f8649d;

    /* JADX INFO: renamed from: e */
    public boolean f8650e;

    /* JADX INFO: renamed from: f */
    public MediaPeriodInfo f8651f;

    /* JADX INFO: renamed from: g */
    public boolean f8652g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f8653h;

    /* JADX INFO: renamed from: i */
    public final RendererCapabilities[] f8654i;

    /* JADX INFO: renamed from: j */
    public final TrackSelector f8655j;

    /* JADX INFO: renamed from: k */
    public final MediaSourceList f8656k;

    /* JADX INFO: renamed from: l */
    public MediaPeriodHolder f8657l;

    /* JADX INFO: renamed from: m */
    public TrackGroupArray f8658m;

    /* JADX INFO: renamed from: n */
    public TrackSelectorResult f8659n;

    /* JADX INFO: renamed from: o */
    public long f8660o;

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j2, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
        this.f8654i = rendererCapabilitiesArr;
        this.f8660o = j2;
        this.f8655j = trackSelector;
        this.f8656k = mediaSourceList;
        MediaSource2.a aVar = mediaPeriodInfo.f8809a;
        this.f8647b = aVar.f8857a;
        this.f8651f = mediaPeriodInfo;
        this.f8658m = TrackGroupArray.f9067f;
        this.f8659n = trackSelectorResult;
        this.f8648c = new SampleStream[rendererCapabilitiesArr.length];
        this.f8653h = new boolean[rendererCapabilitiesArr.length];
        long j3 = mediaPeriodInfo.f8810b;
        long j4 = mediaPeriodInfo.f8812d;
        Objects.requireNonNull(mediaSourceList);
        Object obj = aVar.f8857a;
        int i = AbstractConcatenatedTimeline.f10369b;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        MediaSource2.a aVarM4097b = aVar.m4097b(pair.second);
        MediaSourceList.c cVar = mediaSourceList.f10181c.get(obj2);
        Objects.requireNonNull(cVar);
        mediaSourceList.f10186h.add(cVar);
        MediaSourceList.b bVar = mediaSourceList.f10185g.get(cVar);
        if (bVar != null) {
            bVar.f10194a.mo4096o(bVar.f10195b);
        }
        cVar.f10199c.add(aVarM4097b);
        MediaPeriod mediaPeriodM4389A = cVar.f10197a.mo4084a(aVarM4097b, allocator, j3);
        mediaSourceList.f10180b.put(mediaPeriodM4389A, cVar);
        mediaSourceList.m4498d();
        if (j4 != -9223372036854775807L && j4 != Long.MIN_VALUE) {
            mediaPeriodM4389A = new ClippingMediaPeriod(mediaPeriodM4389A, true, 0L, j4);
        }
        this.f8646a = mediaPeriodM4389A;
    }

    /* JADX INFO: renamed from: a */
    public long m3999a(TrackSelectorResult trackSelectorResult, long j2, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= trackSelectorResult.f10365a) {
                break;
            }
            boolean[] zArr2 = this.f8653h;
            if (z || !trackSelectorResult.m4547a(this.f8659n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        SampleStream[] sampleStreamArr = this.f8648c;
        int i2 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.f8654i;
            if (i2 >= rendererCapabilitiesArr.length) {
                break;
            }
            if (((BaseRenderer) rendererCapabilitiesArr[i2]).f6248f == 7) {
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        m4000b();
        this.f8659n = trackSelectorResult;
        m4001c();
        long jMo4078r = this.f8646a.mo4078r(trackSelectorResult.f10367c, this.f8653h, this.f8648c, zArr, j2);
        SampleStream[] sampleStreamArr2 = this.f8648c;
        int i3 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr2 = this.f8654i;
            if (i3 >= rendererCapabilitiesArr2.length) {
                break;
            }
            if (((BaseRenderer) rendererCapabilitiesArr2[i3]).f6248f == 7 && this.f8659n.m4548b(i3)) {
                sampleStreamArr2[i3] = new EmptySampleStream();
            }
            i3++;
        }
        this.f8650e = false;
        int i4 = 0;
        while (true) {
            SampleStream[] sampleStreamArr3 = this.f8648c;
            if (i4 >= sampleStreamArr3.length) {
                return jMo4078r;
            }
            if (sampleStreamArr3[i4] != null) {
                C2096e.m4570f(trackSelectorResult.m4548b(i4));
                if (((BaseRenderer) this.f8654i[i4]).f6248f != 7) {
                    this.f8650e = true;
                }
            } else {
                C2096e.m4570f(trackSelectorResult.f10367c[i4] == null);
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4000b() {
        if (!m4005g()) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.f8659n;
            if (i >= trackSelectorResult.f10365a) {
                return;
            }
            boolean zM4548b = trackSelectorResult.m4548b(i);
            ExoTrackSelection2 exoTrackSelection2 = this.f8659n.f10367c[i];
            if (zM4548b && exoTrackSelection2 != null) {
                exoTrackSelection2.mo4507h();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4001c() {
        if (!m4005g()) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.f8659n;
            if (i >= trackSelectorResult.f10365a) {
                return;
            }
            boolean zM4548b = trackSelectorResult.m4548b(i);
            ExoTrackSelection2 exoTrackSelection2 = this.f8659n.f10367c[i];
            if (zM4548b && exoTrackSelection2 != null) {
                exoTrackSelection2.mo4506g();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public long m4002d() {
        if (!this.f8649d) {
            return this.f8651f.f8810b;
        }
        long jMo4072g = this.f8650e ? this.f8646a.mo4072g() : Long.MIN_VALUE;
        return jMo4072g == Long.MIN_VALUE ? this.f8651f.f8813e : jMo4072g;
    }

    /* JADX INFO: renamed from: e */
    public long m4003e() {
        return this.f8651f.f8810b + this.f8660o;
    }

    /* JADX INFO: renamed from: f */
    public boolean m4004f() {
        return this.f8649d && (!this.f8650e || this.f8646a.mo4072g() == Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4005g() {
        return this.f8657l == null;
    }

    /* JADX INFO: renamed from: h */
    public void m4006h() {
        m4000b();
        long j2 = this.f8651f.f8812d;
        MediaSourceList mediaSourceList = this.f8656k;
        MediaPeriod mediaPeriod = this.f8646a;
        try {
            if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
                mediaSourceList.m4502h(mediaPeriod);
            } else {
                mediaSourceList.m4502h(((ClippingMediaPeriod) mediaPeriod).f9027f);
            }
        } catch (RuntimeException e) {
            Log.m3154b("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: i */
    public TrackSelectorResult m4007i(float f, Timeline timeline) throws ExoPlaybackException {
        TrackSelectorResult trackSelectorResultMo4544b = this.f8655j.mo4544b(this.f8654i, this.f8658m, this.f8651f.f8809a, timeline);
        for (ExoTrackSelection2 exoTrackSelection2 : trackSelectorResultMo4544b.f10367c) {
            if (exoTrackSelection2 != null) {
                exoTrackSelection2.mo4509p(f);
            }
        }
        return trackSelectorResultMo4544b;
    }
}
