package p007c.p190n.p194b.p209b.p262y1;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.p245u0.Chunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.y1.e, reason: use source file name */
/* JADX INFO: compiled from: BaseTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection2 {

    /* JADX INFO: renamed from: a */
    public final TrackGroup f10226a;

    /* JADX INFO: renamed from: b */
    public final int f10227b;

    /* JADX INFO: renamed from: c */
    public final int[] f10228c;

    /* JADX INFO: renamed from: d */
    public final Format[] f10229d;

    /* JADX INFO: renamed from: e */
    public final long[] f10230e;

    /* JADX INFO: renamed from: f */
    public int f10231f;

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        int i = 0;
        C2096e.m4570f(iArr.length > 0);
        Objects.requireNonNull(trackGroup);
        this.f10226a = trackGroup;
        int length = iArr.length;
        this.f10227b = length;
        this.f10229d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f10229d[i2] = trackGroup.f9065g[iArr[i2]];
        }
        Arrays.sort(this.f10229d, new Comparator() { // from class: c.n.b.b.y1.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Format) obj2).f6930m - ((Format) obj).f6930m;
            }
        });
        this.f10228c = new int[this.f10227b];
        while (true) {
            int i3 = this.f10227b;
            if (i >= i3) {
                this.f10230e = new long[i3];
                return;
            } else {
                this.f10228c[i] = trackGroup.m4192a(this.f10229d[i]);
                i++;
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelection
    /* JADX INFO: renamed from: a */
    public final TrackGroup mo4512a() {
        return this.f10226a;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: c */
    public final boolean mo4513c(int i, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zM4524u = m4524u(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f10227b && !zM4524u) {
            zM4524u = (i2 == i || m4524u(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zM4524u) {
            return false;
        }
        long[] jArr = this.f10230e;
        long j3 = jArr[i];
        int i3 = Util6.f6307a;
        long j4 = jElapsedRealtime + j2;
        jArr[i] = Math.max(j3, ((j2 ^ j4) & (jElapsedRealtime ^ j4)) >= 0 ? j4 : Long.MAX_VALUE);
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean mo4514d(long j2, Chunk chunk, List list) {
        return ExoTrackSelection.m4542d(this, j2, chunk, list);
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void mo4515e(boolean z) {
        ExoTrackSelection.m4540b(this, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        return this.f10226a == baseTrackSelection.f10226a && Arrays.equals(this.f10228c, baseTrackSelection.f10228c);
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelection
    /* JADX INFO: renamed from: f */
    public final Format mo4516f(int i) {
        return this.f10229d[i];
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: g */
    public void mo4506g() {
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: h */
    public void mo4507h() {
    }

    public int hashCode() {
        if (this.f10231f == 0) {
            this.f10231f = Arrays.hashCode(this.f10228c) + (System.identityHashCode(this.f10226a) * 31);
        }
        return this.f10231f;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelection
    /* JADX INFO: renamed from: i */
    public final int mo4517i(int i) {
        return this.f10228c[i];
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: j */
    public int mo4508j(long j2, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelection
    /* JADX INFO: renamed from: k */
    public final int mo4518k(Format format) {
        for (int i = 0; i < this.f10227b; i++) {
            if (this.f10229d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelection
    public final int length() {
        return this.f10228c.length;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: m */
    public final int mo4519m() {
        return this.f10228c[mo4302b()];
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: n */
    public final Format mo4520n() {
        return this.f10229d[mo4302b()];
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: p */
    public void mo4509p(float f) {
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void mo4521r() {
        ExoTrackSelection.m4539a(this);
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void mo4522s() {
        ExoTrackSelection.m4541c(this);
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelection
    /* JADX INFO: renamed from: t */
    public final int mo4523t(int i) {
        for (int i2 = 0; i2 < this.f10227b; i2++) {
            if (this.f10228c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4524u(int i, long j2) {
        return this.f10230e[i] > j2;
    }
}
