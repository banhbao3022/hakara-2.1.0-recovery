package p007c.p190n.p194b.p209b;

import android.os.SystemClock;
import android.text.TextUtils;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriodId;

/* JADX INFO: renamed from: c.n.b.b.g0, reason: use source file name */
/* JADX INFO: compiled from: ExoPlaybackException.java */
/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends Exception {

    /* JADX INFO: renamed from: f */
    public final int f6611f;

    /* JADX INFO: renamed from: g */
    public final String f6612g;

    /* JADX INFO: renamed from: h */
    public final int f6613h;

    /* JADX INFO: renamed from: i */
    public final Format f6614i;

    /* JADX INFO: renamed from: j */
    public final int f6615j;

    /* JADX INFO: renamed from: k */
    public final long f6616k;

    /* JADX INFO: renamed from: l */
    public final MediaPeriodId f6617l;

    /* JADX INFO: renamed from: m */
    public final boolean f6618m;

    /* JADX INFO: renamed from: n */
    public final Throwable f6619n;

    public ExoPlaybackException(int i, Throwable th) {
        this(i, th, null, null, -1, null, 4, false);
    }

    /* JADX INFO: renamed from: a */
    public ExoPlaybackException m3364a(MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException(getMessage(), this.f6619n, this.f6611f, this.f6612g, this.f6613h, this.f6614i, this.f6615j, mediaPeriodId, this.f6616k, this.f6618m);
    }

    public ExoPlaybackException(String str, Throwable th, int i, String str2, int i2, Format format, int i3, MediaPeriodId mediaPeriodId, long j2, boolean z) {
        super(str, th);
        this.f6611f = i;
        this.f6619n = th;
        this.f6612g = str2;
        this.f6613h = i2;
        this.f6614i = format;
        this.f6615j = i3;
        this.f6617l = mediaPeriodId;
        this.f6616k = j2;
        this.f6618m = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Throwable th, String str, String str2, int i2, Format format, int i3, boolean z) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + format + ", format_supported=" + C.m3235a(i3);
        }
        this(TextUtils.isEmpty(null) ? str3 : outline.m1600v(str3, ": ", null), th, i, str2, i2, format, i3, null, SystemClock.elapsedRealtime(), z);
    }
}
