package p007c.p085g.p086a.p089m.p098v.p099d;

import android.os.Build;
import android.util.Log;
import com.cgfay.media.IMediaPlayer;
import java.io.File;

/* JADX INFO: renamed from: c.g.a.m.v.d.s, reason: use source file name */
/* JADX INFO: compiled from: HardwareConfigState.java */
/* JADX INFO: loaded from: classes.dex */
public final class HardwareConfigState {

    /* JADX INFO: renamed from: a */
    public static final File f3576a = new File("/proc/self/fd");

    /* JADX INFO: renamed from: b */
    public static volatile HardwareConfigState f3577b;

    /* JADX INFO: renamed from: c */
    public final boolean f3578c;

    /* JADX INFO: renamed from: d */
    public final int f3579d;

    /* JADX INFO: renamed from: e */
    public final int f3580e;

    /* JADX INFO: renamed from: f */
    public int f3581f;

    /* JADX INFO: renamed from: g */
    public boolean f3582g = true;

    public HardwareConfigState() {
        boolean z = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String strSubstring = str.substring(0, 7);
            strSubstring.hashCode();
            switch (strSubstring) {
                case "SM-A520":
                case "SM-G930":
                case "SM-G935":
                case "SM-G960":
                case "SM-G965":
                case "SM-J720":
                case "SM-N935":
                    if (Build.VERSION.SDK_INT == 26) {
                        z = false;
                        break;
                    }
                    break;
            }
        }
        this.f3578c = z;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3579d = 20000;
            this.f3580e = 0;
        } else {
            this.f3579d = IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
            this.f3580e = 128;
        }
    }

    /* JADX INFO: renamed from: a */
    public static HardwareConfigState m1908a() {
        if (f3577b == null) {
            synchronized (HardwareConfigState.class) {
                if (f3577b == null) {
                    f3577b = new HardwareConfigState();
                }
            }
        }
        return f3577b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1909b(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        if (!z || !this.f3578c || Build.VERSION.SDK_INT < 26 || z2 || i < (i3 = this.f3580e) || i2 < i3) {
            return false;
        }
        synchronized (this) {
            int i4 = this.f3581f + 1;
            this.f3581f = i4;
            if (i4 >= 50) {
                this.f3581f = 0;
                int length = f3576a.list().length;
                boolean z4 = length < this.f3579d;
                this.f3582g = z4;
                if (!z4 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f3579d);
                }
            }
            z3 = this.f3582g;
        }
        return z3;
    }
}
