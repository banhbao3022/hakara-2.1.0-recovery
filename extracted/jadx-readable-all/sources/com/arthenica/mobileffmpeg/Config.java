package com.arthenica.mobileffmpeg;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p007c.p080e.p081a.FFmpegExecution;
import p007c.p080e.p081a.Level;
import p007c.p080e.p081a.Packages;
import p007c.p080e.p081a.Statistics;
import p007c.p080e.p081a.StatisticsCallback;

/* JADX INFO: loaded from: classes.dex */
public class Config {

    /* JADX INFO: renamed from: a */
    public static Level f28135a;

    /* JADX INFO: renamed from: b */
    public static StatisticsCallback f28136b;

    /* JADX INFO: renamed from: c */
    public static Statistics f28137c;

    /* JADX INFO: renamed from: d */
    public static final List<FFmpegExecution> f28138d;

    /* JADX WARN: Code duplicated, block: B:102:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x026e  */
    /* JADX WARN: Code duplicated, block: B:155:0x027e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0284  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:181:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:200:0x0312 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x0314  */
    /* JADX WARN: Code duplicated, block: B:203:0x031c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0347  */
    /* JADX WARN: Code duplicated, block: B:216:0x0355  */
    /* JADX WARN: Code duplicated, block: B:218:0x035b  */
    /* JADX WARN: Code duplicated, block: B:221:0x0364 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x0366  */
    /* JADX WARN: Code duplicated, block: B:224:0x036c  */
    /* JADX WARN: Code duplicated, block: B:231:0x0381  */
    /* JADX WARN: Code duplicated, block: B:233:0x0387  */
    /* JADX WARN: Code duplicated, block: B:234:0x038a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0393  */
    /* JADX WARN: Code duplicated, block: B:238:0x0396  */
    /* JADX WARN: Code duplicated, block: B:241:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:242:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str;
        String nativeAbi;
        String nativeVersion;
        Log.i("mobile-ffmpeg", "Loading mobile-ffmpeg.");
        if (!"arm-v7a".equals(AbiDetect.getNativeAbi())) {
            z = false;
        } else if (AbiDetect.isNativeLTSBuild()) {
            try {
                System.loadLibrary("mobileffmpeg_armv7a_neon");
                try {
                    AbiDetect.f28134a = true;
                    z = true;
                } catch (UnsatisfiedLinkError e) {
                    e = e;
                    z = true;
                    Log.i("mobile-ffmpeg", "NEON supported armeabi-v7a library not found. Loading default armeabi-v7a library.", e);
                }
            } catch (UnsatisfiedLinkError e2) {
                e = e2;
                z = false;
            }
        } else {
            AbiDetect.f28134a = true;
            z = false;
        }
        if (!z) {
            System.loadLibrary("mobileffmpeg");
        }
        Object[] objArr = new Object[4];
        ArrayList arrayList = (ArrayList) Packages.m1609a();
        boolean zContains = arrayList.contains("speex");
        boolean zContains2 = arrayList.contains("fribidi");
        boolean zContains3 = arrayList.contains("gnutls");
        boolean zContains4 = arrayList.contains("xvid");
        if (zContains && zContains2) {
            z2 = false;
            z3 = false;
            z4 = false;
            if (zContains4) {
                z5 = false;
                z6 = false;
                z7 = true;
            } else {
                z5 = false;
                z6 = true;
            }
            z8 = false;
            z9 = z8;
            z10 = z5;
            z11 = z4;
            z12 = z3;
            z13 = z2;
            z14 = z6;
            if (z7) {
                if (!arrayList.contains("fontconfig")) {
                    str = "custom";
                } else {
                    str = "custom";
                }
            } else if (z14) {
                if (!arrayList.contains("fontconfig")) {
                    str = "custom";
                } else {
                    str = "custom";
                }
            } else if (z13) {
                if (!arrayList.contains("fontconfig")) {
                    str = "custom";
                } else {
                    str = "custom";
                }
            } else if (z12) {
                if (!arrayList.contains("mp3lame")) {
                    str = "custom";
                } else {
                    str = "custom";
                }
            } else if (z11) {
                if (!arrayList.contains("gmp")) {
                    str = "custom";
                } else {
                    str = "custom";
                }
            } else if (z10) {
                if (arrayList.contains("gmp")) {
                    str = "custom";
                } else {
                    str = "custom";
                }
            } else if (z9) {
                if (!arrayList.contains("libvidstab")) {
                    str = "custom";
                } else {
                    str = "custom";
                }
            } else if (arrayList.size() == 0) {
                str = "min";
            } else {
                str = "custom";
            }
            objArr[0] = str;
            if (AbiDetect.f28134a) {
                nativeAbi = "arm-v7a-neon";
            } else {
                nativeAbi = AbiDetect.getNativeAbi();
            }
            objArr[1] = nativeAbi;
            if (AbiDetect.isNativeLTSBuild()) {
                nativeVersion = String.format("%s-lts", getNativeVersion());
            } else {
                nativeVersion = getNativeVersion();
            }
            objArr[2] = nativeVersion;
            objArr[3] = getNativeBuildDate();
            Log.i("mobile-ffmpeg", String.format("Loaded mobile-ffmpeg-%s-%s-%s-%s.", objArr));
            f28135a = Level.m1608f(getNativeLogLevel());
            f28137c = new Statistics();
            enableNativeRedirection();
            f28138d = Collections.synchronizedList(new ArrayList());
        }
        if (zContains) {
            z2 = false;
            z3 = true;
        } else {
            if (!zContains2) {
                z2 = false;
                if (zContains4) {
                    z3 = false;
                    if (zContains3) {
                        z4 = true;
                        z5 = false;
                        z6 = false;
                    } else {
                        z4 = false;
                        z5 = false;
                        z6 = false;
                        z7 = false;
                        z8 = true;
                    }
                } else {
                    if (zContains3) {
                        z3 = false;
                        z4 = false;
                        z5 = true;
                    }
                    z6 = false;
                }
                z9 = z8;
                z10 = z5;
                z11 = z4;
                z12 = z3;
                z13 = z2;
                z14 = z6;
                if (z7) {
                    if (!arrayList.contains("fontconfig") && arrayList.contains("freetype") && arrayList.contains("fribidi") && arrayList.contains("gmp") && arrayList.contains("gnutls") && arrayList.contains("kvazaar") && arrayList.contains("mp3lame") && arrayList.contains("libaom") && arrayList.contains("libass") && arrayList.contains("iconv") && arrayList.contains("libilbc") && arrayList.contains("libtheora") && arrayList.contains("libvidstab") && arrayList.contains("libvorbis") && arrayList.contains("libvpx") && arrayList.contains("libwebp") && arrayList.contains("libxml2") && arrayList.contains("opencore-amr") && arrayList.contains("opus") && arrayList.contains("shine") && arrayList.contains("snappy") && arrayList.contains("soxr") && arrayList.contains("speex") && arrayList.contains("twolame") && arrayList.contains("wavpack") && arrayList.contains("x264") && arrayList.contains("x265") && arrayList.contains("xvid")) {
                        str = "full-gpl";
                    } else {
                        str = "custom";
                    }
                } else if (z14) {
                    if (!arrayList.contains("fontconfig") && arrayList.contains("freetype") && arrayList.contains("fribidi") && arrayList.contains("gmp") && arrayList.contains("gnutls") && arrayList.contains("kvazaar") && arrayList.contains("mp3lame") && arrayList.contains("libaom") && arrayList.contains("libass") && arrayList.contains("iconv") && arrayList.contains("libilbc") && arrayList.contains("libtheora") && arrayList.contains("libvorbis") && arrayList.contains("libvpx") && arrayList.contains("libwebp") && arrayList.contains("libxml2") && arrayList.contains("opencore-amr") && arrayList.contains("opus") && arrayList.contains("shine") && arrayList.contains("snappy") && arrayList.contains("soxr") && arrayList.contains("speex") && arrayList.contains("twolame") && arrayList.contains("wavpack")) {
                        str = "full";
                    } else {
                        str = "custom";
                    }
                } else if (z13) {
                    if (!arrayList.contains("fontconfig") && arrayList.contains("freetype") && arrayList.contains("fribidi") && arrayList.contains("kvazaar") && arrayList.contains("libaom") && arrayList.contains("libass") && arrayList.contains("iconv") && arrayList.contains("libtheora") && arrayList.contains("libvpx") && arrayList.contains("libwebp") && arrayList.contains("snappy")) {
                        str = "video";
                    } else {
                        str = "custom";
                    }
                } else if (z12) {
                    if (!arrayList.contains("mp3lame") && arrayList.contains("libilbc") && arrayList.contains("libvorbis") && arrayList.contains("opencore-amr") && arrayList.contains("opus") && arrayList.contains("shine") && arrayList.contains("soxr") && arrayList.contains("speex") && arrayList.contains("twolame") && arrayList.contains("wavpack")) {
                        str = "audio";
                    } else {
                        str = "custom";
                    }
                } else if (z11) {
                    if (!arrayList.contains("gmp") && arrayList.contains("gnutls") && arrayList.contains("libvidstab") && arrayList.contains("x264") && arrayList.contains("x265") && arrayList.contains("xvid")) {
                        str = "https-gpl";
                    } else {
                        str = "custom";
                    }
                } else if (z10) {
                    if (arrayList.contains("gmp") || !arrayList.contains("gnutls")) {
                        str = "custom";
                    } else {
                        str = "https";
                    }
                } else if (z9) {
                    if (!arrayList.contains("libvidstab") && arrayList.contains("x264") && arrayList.contains("x265") && arrayList.contains("xvid")) {
                        str = "min-gpl";
                    } else {
                        str = "custom";
                    }
                } else if (arrayList.size() == 0) {
                    str = "min";
                } else {
                    str = "custom";
                }
                objArr[0] = str;
                if (AbiDetect.f28134a) {
                    nativeAbi = "arm-v7a-neon";
                } else {
                    nativeAbi = AbiDetect.getNativeAbi();
                }
                objArr[1] = nativeAbi;
                if (AbiDetect.isNativeLTSBuild()) {
                    nativeVersion = String.format("%s-lts", getNativeVersion());
                } else {
                    nativeVersion = getNativeVersion();
                }
                objArr[2] = nativeVersion;
                objArr[3] = getNativeBuildDate();
                Log.i("mobile-ffmpeg", String.format("Loaded mobile-ffmpeg-%s-%s-%s-%s.", objArr));
                f28135a = Level.m1608f(getNativeLogLevel());
                f28137c = new Statistics();
                enableNativeRedirection();
                f28138d = Collections.synchronizedList(new ArrayList());
            }
            z2 = true;
            z3 = false;
        }
        z4 = false;
        z5 = false;
        z6 = false;
        z7 = false;
        z8 = false;
        z9 = z8;
        z10 = z5;
        z11 = z4;
        z12 = z3;
        z13 = z2;
        z14 = z6;
        if (z7) {
            if (!arrayList.contains("fontconfig")) {
                str = "custom";
            } else {
                str = "custom";
            }
        } else if (z14) {
            if (!arrayList.contains("fontconfig")) {
                str = "custom";
            } else {
                str = "custom";
            }
        } else if (z13) {
            if (!arrayList.contains("fontconfig")) {
                str = "custom";
            } else {
                str = "custom";
            }
        } else if (z12) {
            if (!arrayList.contains("mp3lame")) {
                str = "custom";
            } else {
                str = "custom";
            }
        } else if (z11) {
            if (!arrayList.contains("gmp")) {
                str = "custom";
            } else {
                str = "custom";
            }
        } else if (z10) {
            if (arrayList.contains("gmp")) {
                str = "custom";
            } else {
                str = "custom";
            }
        } else if (z9) {
            if (!arrayList.contains("libvidstab")) {
                str = "custom";
            } else {
                str = "custom";
            }
        } else if (arrayList.size() == 0) {
            str = "min";
        } else {
            str = "custom";
        }
        objArr[0] = str;
        if (AbiDetect.f28134a) {
            nativeAbi = "arm-v7a-neon";
        } else {
            nativeAbi = AbiDetect.getNativeAbi();
        }
        objArr[1] = nativeAbi;
        if (AbiDetect.isNativeLTSBuild()) {
            nativeVersion = String.format("%s-lts", getNativeVersion());
        } else {
            nativeVersion = getNativeVersion();
        }
        objArr[2] = nativeVersion;
        objArr[3] = getNativeBuildDate();
        Log.i("mobile-ffmpeg", String.format("Loaded mobile-ffmpeg-%s-%s-%s-%s.", objArr));
        f28135a = Level.m1608f(getNativeLogLevel());
        f28137c = new Statistics();
        enableNativeRedirection();
        f28138d = Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: a */
    public static int m12558a(long j2, String[] strArr) {
        FFmpegExecution fFmpegExecution = new FFmpegExecution(j2, strArr);
        f28138d.add(fFmpegExecution);
        try {
            return nativeFFmpegExecute(j2, strArr);
        } finally {
            f28138d.remove(fFmpegExecution);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m12559b() {
        String nativeLastCommandOutput = getNativeLastCommandOutput();
        return nativeLastCommandOutput != null ? nativeLastCommandOutput.replace('\r', '\n') : nativeLastCommandOutput;
    }

    private static native void disableNativeRedirection();

    private static native void enableNativeRedirection();

    private static native String getNativeBuildDate();

    private static native String getNativeFFmpegVersion();

    private static native String getNativeLastCommandOutput();

    private static native int getNativeLogLevel();

    private static native String getNativeVersion();

    private static native void ignoreNativeSignal(int i);

    private static void log(long j2, int i, byte[] bArr) {
        Level levelM1608f = Level.m1608f(i);
        String str = new String(bArr);
        if ((f28135a != Level.AV_LOG_QUIET || i == -16) && i <= f28135a.f2806q) {
            switch (levelM1608f) {
                case AV_LOG_STDERR:
                case AV_LOG_VERBOSE:
                    Log.v("mobile-ffmpeg", str);
                    break;
                case AV_LOG_QUIET:
                    break;
                case AV_LOG_PANIC:
                case AV_LOG_FATAL:
                case AV_LOG_ERROR:
                    Log.e("mobile-ffmpeg", str);
                    break;
                case AV_LOG_WARNING:
                    Log.w("mobile-ffmpeg", str);
                    break;
                case AV_LOG_INFO:
                    Log.i("mobile-ffmpeg", str);
                    break;
                case AV_LOG_DEBUG:
                case AV_LOG_TRACE:
                    Log.d("mobile-ffmpeg", str);
                    break;
                default:
                    Log.v("mobile-ffmpeg", str);
                    break;
            }
        }
    }

    public static native void nativeFFmpegCancel(long j2);

    private static native int nativeFFmpegExecute(long j2, String[] strArr);

    public static native int nativeFFprobeExecute(String[] strArr);

    private static native int registerNewNativeFFmpegPipe(String str);

    private static native int setNativeEnvironmentVariable(String str, String str2);

    private static native void setNativeLogLevel(int i);

    private static void statistics(long j2, int i, float f, float f2, long j3, int i2, double d, double d2) {
        Statistics statistics = new Statistics(j2, i, f, f2, j3, i2, d, d2);
        Statistics statistics2 = f28137c;
        Objects.requireNonNull(statistics2);
        statistics2.f2808a = statistics.f2808a;
        int i3 = statistics.f2809b;
        if (i3 > 0) {
            statistics2.f2809b = i3;
        }
        float f3 = statistics.f2810c;
        if (f3 > 0.0f) {
            statistics2.f2810c = f3;
        }
        float f4 = statistics.f2811d;
        if (f4 > 0.0f) {
            statistics2.f2811d = f4;
        }
        long j4 = statistics.f2812e;
        if (j4 > 0) {
            statistics2.f2812e = j4;
        }
        int i4 = statistics.f2813f;
        if (i4 > 0) {
            statistics2.f2813f = i4;
        }
        double d3 = statistics.f2814g;
        if (d3 > 0.0d) {
            statistics2.f2814g = d3;
        }
        double d4 = statistics.f2815h;
        if (d4 > 0.0d) {
            statistics2.f2815h = d4;
        }
        StatisticsCallback statisticsCallback = f28136b;
        if (statisticsCallback != null) {
            try {
                statisticsCallback.mo1610a(f28137c);
            } catch (Exception e) {
                Log.e("mobile-ffmpeg", "Exception thrown inside StatisticsCallback block", e);
            }
        }
    }
}
