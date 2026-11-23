package p007c.p190n.p194b.p209b;

import android.util.Log;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DefaultAllocator;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.e0, reason: use source file name */
/* JADX INFO: compiled from: DefaultLoadControl.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultLoadControl implements LoadControl {

    /* JADX INFO: renamed from: a */
    public final DefaultAllocator f6572a;

    /* JADX INFO: renamed from: b */
    public final long f6573b;

    /* JADX INFO: renamed from: c */
    public final long f6574c;

    /* JADX INFO: renamed from: d */
    public final long f6575d;

    /* JADX INFO: renamed from: e */
    public final long f6576e;

    /* JADX INFO: renamed from: f */
    public final int f6577f;

    /* JADX INFO: renamed from: g */
    public final boolean f6578g;

    /* JADX INFO: renamed from: h */
    public final long f6579h;

    /* JADX INFO: renamed from: i */
    public final boolean f6580i;

    /* JADX INFO: renamed from: j */
    public int f6581j;

    /* JADX INFO: renamed from: k */
    public boolean f6582k;

    public DefaultLoadControl() {
        DefaultAllocator defaultAllocator = new DefaultAllocator(true, 65536);
        m3342j(2500, 0, "bufferForPlaybackMs", "0");
        m3342j(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m3342j(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m3342j(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m3342j(50000, 50000, "maxBufferMs", "minBufferMs");
        m3342j(0, 0, "backBufferDurationMs", "0");
        this.f6572a = defaultAllocator;
        long j2 = 50000;
        this.f6573b = C.m3236b(j2);
        this.f6574c = C.m3236b(j2);
        this.f6575d = C.m3236b(2500);
        this.f6576e = C.m3236b(5000);
        this.f6577f = -1;
        this.f6581j = 13107200;
        this.f6578g = false;
        this.f6579h = C.m3236b(0);
        this.f6580i = false;
    }

    /* JADX INFO: renamed from: j */
    public static void m3342j(int i, int i2, String str, String str2) {
        C2096e.m4567c(i >= i2, str + " cannot be less than " + str2);
    }

    @Override // p007c.p190n.p194b.p209b.LoadControl
    /* JADX INFO: renamed from: a */
    public void mo3343a() {
        m3352k(false);
    }

    @Override // p007c.p190n.p194b.p209b.LoadControl
    /* JADX INFO: renamed from: b */
    public boolean mo3344b() {
        return this.f6580i;
    }

    @Override // p007c.p190n.p194b.p209b.LoadControl
    /* JADX INFO: renamed from: c */
    public long mo3345c() {
        return this.f6579h;
    }

    @Override // p007c.p190n.p194b.p209b.LoadControl
    /* JADX INFO: renamed from: d */
    public void mo3346d(Renderer2[] renderer2Arr, TrackGroupArray trackGroupArray, ExoTrackSelection2[] exoTrackSelection2Arr) {
        int iMax = this.f6577f;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i >= renderer2Arr.length) {
                    iMax = Math.max(13107200, i2);
                    break;
                }
                if (exoTrackSelection2Arr[i] != null) {
                    int iMo3054x = renderer2Arr[i].mo3054x();
                    if (iMo3054x == 0) {
                        i3 = 144310272;
                    } else if (iMo3054x != 1) {
                        if (iMo3054x == 2) {
                            i3 = 131072000;
                        } else if (iMo3054x == 3 || iMo3054x == 5 || iMo3054x == 6) {
                            i3 = 131072;
                        } else {
                            if (iMo3054x != 7) {
                                throw new IllegalArgumentException();
                            }
                            i3 = 0;
                        }
                    }
                    i2 += i3;
                }
                i++;
            }
        }
        this.f6581j = iMax;
        this.f6572a.m3007b(iMax);
    }

    @Override // p007c.p190n.p194b.p209b.LoadControl
    /* JADX INFO: renamed from: e */
    public void mo3347e() {
        m3352k(true);
    }

    @Override // p007c.p190n.p194b.p209b.LoadControl
    /* JADX INFO: renamed from: f */
    public boolean mo3348f(long j2, float f, boolean z, long j3) {
        int i;
        long jM3138z = Util6.m3138z(j2, f);
        long jMin = z ? this.f6576e : this.f6575d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(j3 / 2, jMin);
        }
        if (jMin > 0 && jM3138z < jMin) {
            if (!this.f6578g) {
                DefaultAllocator defaultAllocator = this.f6572a;
                synchronized (defaultAllocator) {
                    i = defaultAllocator.f6162f * defaultAllocator.f6158b;
                }
                if (i >= this.f6581j) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.LoadControl
    /* JADX INFO: renamed from: g */
    public boolean mo3349g(long j2, long j3, float f) {
        int i;
        DefaultAllocator defaultAllocator = this.f6572a;
        synchronized (defaultAllocator) {
            i = defaultAllocator.f6162f * defaultAllocator.f6158b;
        }
        boolean z = true;
        boolean z2 = i >= this.f6581j;
        long jMin = this.f6573b;
        if (f > 1.0f) {
            jMin = Math.min(Util6.m3133u(jMin, f), this.f6574c);
        }
        if (j3 < Math.max(jMin, 500000L)) {
            if (!this.f6578g && z2) {
                z = false;
            }
            this.f6582k = z;
            if (!z && j3 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.f6574c || z2) {
            this.f6582k = false;
        }
        return this.f6582k;
    }

    @Override // p007c.p190n.p194b.p209b.LoadControl
    /* JADX INFO: renamed from: h */
    public Allocator mo3350h() {
        return this.f6572a;
    }

    @Override // p007c.p190n.p194b.p209b.LoadControl
    /* JADX INFO: renamed from: i */
    public void mo3351i() {
        m3352k(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m3352k(boolean z) {
        int i = this.f6577f;
        if (i == -1) {
            i = 13107200;
        }
        this.f6581j = i;
        this.f6582k = false;
        if (z) {
            DefaultAllocator defaultAllocator = this.f6572a;
            synchronized (defaultAllocator) {
                if (defaultAllocator.f6157a) {
                    defaultAllocator.m3007b(0);
                }
            }
        }
    }
}
