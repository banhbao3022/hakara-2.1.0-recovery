package p007c.p190n.p194b.p209b.p233t1;

import android.graphics.Point;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;

/* JADX INFO: renamed from: c.n.b.b.t1.k, reason: use source file name */
/* JADX INFO: compiled from: MediaCodecInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecInfo {

    /* JADX INFO: renamed from: a */
    public final String f8552a;

    /* JADX INFO: renamed from: b */
    public final String f8553b;

    /* JADX INFO: renamed from: c */
    public final String f8554c;

    /* JADX INFO: renamed from: d */
    public final android.media.MediaCodecInfo.CodecCapabilities f8555d;

    /* JADX INFO: renamed from: e */
    public final boolean f8556e;

    /* JADX INFO: renamed from: f */
    public final boolean f8557f;

    /* JADX INFO: renamed from: g */
    public final boolean f8558g;

    public MediaCodecInfo(String str, String str2, String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.f8552a = str;
        this.f8553b = str2;
        this.f8554c = str3;
        this.f8555d = codecCapabilities;
        this.f8556e = z4;
        this.f8557f = z6;
        this.f8558g = MimeTypes.m3171m(str2);
    }

    /* JADX INFO: renamed from: a */
    public static Point m3950a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util6.m3119g(i, widthAlignment) * widthAlignment, Util6.m3119g(i2, heightAlignment) * heightAlignment);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3951b(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointM3950a = m3950a(videoCapabilities, i, i2);
        int i3 = pointM3950a.x;
        int i4 = pointM3950a.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX INFO: renamed from: i */
    public static MediaCodecInfo m3952i(String str, String str2, String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (z4 || codecCapabilities == null) {
            z6 = false;
        } else {
            int i = Util6.f6307a;
            if (i >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (i <= 22) {
                    String str4 = Util6.f6310d;
                    if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                if (z9) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } else {
                z6 = false;
            }
        }
        if (codecCapabilities == null) {
            z7 = false;
        } else {
            if (Util6.f6307a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
                z7 = true;
            } else {
                z7 = false;
            }
        }
        if (!z5) {
            if (codecCapabilities != null) {
                z8 = Util6.f6307a >= 21 && codecCapabilities.isFeatureSupported("secure-playback");
            }
        }
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z8);
    }

    /* JADX INFO: renamed from: c */
    public DecoderReuseEvaluation m3953c(Format format, Format format2) {
        boolean z = false;
        int i = !Util6.m3113a(format.f6934q, format2.f6934q) ? 8 : 0;
        if (this.f8558g) {
            if (format.f6942y != format2.f6942y) {
                i |= 1024;
            }
            if (!this.f8556e && (format.f6939v != format2.f6939v || format.f6940w != format2.f6940w)) {
                i |= 512;
            }
            if (!Util6.m3113a(format.f6914C, format2.f6914C)) {
                i |= 2048;
            }
            String str = this.f8552a;
            if (Util6.f6310d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
                z = true;
            }
            if (z && !format.m3517c(format2)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f8552a, format, format2, format.m3517c(format2) ? 3 : 2, 0);
            }
        } else {
            if (format.f6915D != format2.f6915D) {
                i |= 4096;
            }
            if (format.f6916E != format2.f6916E) {
                i |= 8192;
            }
            if (format.f6917F != format2.f6917F) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f8553b)) {
                Pair<Integer, Integer> pairM3986c = MediaCodecUtil.m3986c(format);
                Pair<Integer, Integer> pairM3986c2 = MediaCodecUtil.m3986c(format2);
                if (pairM3986c != null && pairM3986c2 != null) {
                    int iIntValue = ((Integer) pairM3986c.first).intValue();
                    int iIntValue2 = ((Integer) pairM3986c2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f8552a, format, format2, 3, 0);
                    }
                }
            }
            if (!format.m3517c(format2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f8553b)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f8552a, format, format2, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f8552a, format, format2, 0, i);
    }

    /* JADX INFO: renamed from: d */
    public android.media.MediaCodecInfo.CodecProfileLevel[] m3954d() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8555d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public boolean m3955e(Format format) throws MediaCodecUtil.c {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        String strM3163e;
        int i2;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = format.f6931n;
        int i3 = 16;
        if (str == null || this.f8553b == null || (strM3163e = MimeTypes.m3163e(str)) == null) {
            z = true;
        } else {
            if (this.f8553b.equals(strM3163e)) {
                Pair<Integer, Integer> pairM3986c = MediaCodecUtil.m3986c(format);
                if (pairM3986c != null) {
                    int iIntValue = ((Integer) pairM3986c.first).intValue();
                    int iIntValue2 = ((Integer) pairM3986c.second).intValue();
                    if (this.f8558g || iIntValue == 42) {
                        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM3954d = m3954d();
                        if (Util6.f6307a <= 23 && "video/x-vnd.on2.vp9".equals(this.f8553b) && codecProfileLevelArrM3954d.length == 0) {
                            android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8555d;
                            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                            if (iIntValue3 >= 180000000) {
                                i2 = 1024;
                            } else if (iIntValue3 >= 120000000) {
                                i2 = 512;
                            } else if (iIntValue3 >= 60000000) {
                                i2 = 256;
                            } else if (iIntValue3 >= 30000000) {
                                i2 = 128;
                            } else if (iIntValue3 >= 18000000) {
                                i2 = 64;
                            } else if (iIntValue3 >= 12000000) {
                                i2 = 32;
                            } else if (iIntValue3 >= 7200000) {
                                i2 = 16;
                            } else if (iIntValue3 >= 3600000) {
                                i2 = 8;
                            } else if (iIntValue3 >= 1800000) {
                                i2 = 4;
                            } else {
                                i2 = iIntValue3 >= 800000 ? 2 : 1;
                            }
                            android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel.profile = 1;
                            codecProfileLevel.level = i2;
                            codecProfileLevelArrM3954d = new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                        }
                        int length = codecProfileLevelArrM3954d.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArrM3954d[i4];
                                if (codecProfileLevel2.profile != iIntValue || codecProfileLevel2.level < iIntValue2) {
                                    i4++;
                                }
                            } else {
                                StringBuilder sbM1556G = outline.m1556G("codec.profileLevel, ");
                                sbM1556G.append(format.f6931n);
                                sbM1556G.append(", ");
                                sbM1556G.append(strM3163e);
                                m3958h(sbM1556G.toString());
                            }
                        }
                    }
                }
                z = true;
            } else {
                StringBuilder sbM1556G2 = outline.m1556G("codec.mime ");
                sbM1556G2.append(format.f6931n);
                sbM1556G2.append(", ");
                sbM1556G2.append(strM3163e);
                m3958h(sbM1556G2.toString());
            }
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f8558g) {
            int i5 = format.f6939v;
            if (i5 <= 0 || (i = format.f6940w) <= 0) {
                return true;
            }
            if (Util6.f6307a >= 21) {
                return m3957g(i5, i, format.f6941x);
            }
            boolean z4 = i5 * i <= MediaCodecUtil.m3992i();
            if (!z4) {
                StringBuilder sbM1556G3 = outline.m1556G("legacyFrameSize, ");
                sbM1556G3.append(format.f6939v);
                sbM1556G3.append("x");
                sbM1556G3.append(format.f6940w);
                m3958h(sbM1556G3.toString());
            }
            return z4;
        }
        int i6 = Util6.f6307a;
        if (i6 >= 21) {
            int i7 = format.f6916E;
            if (i7 != -1) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f8555d;
                if (codecCapabilities2 == null) {
                    m3958h("sampleRate.caps");
                } else {
                    android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        m3958h("sampleRate.aCaps");
                    } else {
                        if (audioCapabilities.isSampleRateSupported(i7)) {
                            z3 = true;
                        } else {
                            m3958h("sampleRate.support, " + i7);
                        }
                        if (!z3) {
                            return false;
                        }
                    }
                }
                z3 = false;
                if (!z3) {
                    return false;
                }
            }
            int i8 = format.f6915D;
            if (i8 != -1) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f8555d;
                if (codecCapabilities3 == null) {
                    m3958h("channelCount.caps");
                } else {
                    android.media.MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        m3958h("channelCount.aCaps");
                    } else {
                        String str2 = this.f8552a;
                        String str3 = this.f8553b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                            if ("audio/ac3".equals(str3)) {
                                i3 = 6;
                            } else if (!"audio/eac3".equals(str3)) {
                                i3 = 30;
                            }
                            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str2 + ", [" + maxInputChannelCount + " to " + i3 + "]");
                            maxInputChannelCount = i3;
                        }
                        if (maxInputChannelCount < i8) {
                            m3958h("channelCount.support, " + i8);
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            return false;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3956f(Format format) {
        if (this.f8558g) {
            return this.f8556e;
        }
        Pair<Integer, Integer> pairM3986c = MediaCodecUtil.m3986c(format);
        return pairM3986c != null && ((Integer) pairM3986c.first).intValue() == 42;
    }

    /* JADX INFO: renamed from: g */
    public boolean m3957g(int i, int i2, double d) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8555d;
        if (codecCapabilities == null) {
            m3958h("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m3958h("sizeAndRate.vCaps");
            return false;
        }
        if (!m3951b(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                if ((("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f8552a) && "mcv5a".equals(Util6.f6308b)) ? false : true) && m3951b(videoCapabilities, i2, i, d)) {
                    StringBuilder sbM1559J = outline.m1559J("sizeAndRate.rotated, ", i, "x", i2, "x");
                    sbM1559J.append(d);
                    StringBuilder sbM1562M = outline.m1562M("AssumedSupport [", sbM1559J.toString(), "] [");
                    sbM1562M.append(this.f8552a);
                    sbM1562M.append(", ");
                    sbM1562M.append(this.f8553b);
                    sbM1562M.append("] [");
                    sbM1562M.append(Util6.f6311e);
                    sbM1562M.append("]");
                    Log.d("MediaCodecInfo", sbM1562M.toString());
                }
            }
            StringBuilder sbM1559J2 = outline.m1559J("sizeAndRate.support, ", i, "x", i2, "x");
            sbM1559J2.append(d);
            m3958h(sbM1559J2.toString());
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m3958h(String str) {
        StringBuilder sbM1562M = outline.m1562M("NoSupport [", str, "] [");
        sbM1562M.append(this.f8552a);
        sbM1562M.append(", ");
        sbM1562M.append(this.f8553b);
        sbM1562M.append("] [");
        sbM1562M.append(Util6.f6311e);
        sbM1562M.append("]");
        Log.d("MediaCodecInfo", sbM1562M.toString());
    }

    public String toString() {
        return this.f8552a;
    }
}
