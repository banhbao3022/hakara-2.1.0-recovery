package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class ro2 extends tk2 {

    /* JADX INFO: renamed from: Q */
    public static final int[] f18989Q = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: R */
    public final Context f18990R;

    /* JADX INFO: renamed from: S */
    public final to2 f18991S;

    /* JADX INFO: renamed from: T */
    public final cp2 f18992T;

    /* JADX INFO: renamed from: U */
    public final boolean f18993U;

    /* JADX INFO: renamed from: V */
    public final long[] f18994V;

    /* JADX INFO: renamed from: W */
    public ch2[] f18995W;

    /* JADX INFO: renamed from: X */
    public qo2 f18996X;

    /* JADX INFO: renamed from: Y */
    public Surface f18997Y;

    /* JADX INFO: renamed from: Z */
    public Surface f18998Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f18999a0;

    /* JADX INFO: renamed from: b0 */
    public long f19000b0;

    /* JADX INFO: renamed from: c0 */
    public long f19001c0;

    /* JADX INFO: renamed from: d0 */
    public int f19002d0;

    /* JADX INFO: renamed from: e0 */
    public int f19003e0;

    /* JADX INFO: renamed from: f0 */
    public int f19004f0;

    /* JADX INFO: renamed from: g0 */
    public float f19005g0;

    /* JADX INFO: renamed from: h0 */
    public int f19006h0;

    /* JADX INFO: renamed from: i0 */
    public int f19007i0;

    /* JADX INFO: renamed from: j0 */
    public int f19008j0;

    /* JADX INFO: renamed from: k0 */
    public float f19009k0;

    /* JADX INFO: renamed from: l0 */
    public int f19010l0;

    /* JADX INFO: renamed from: m0 */
    public int f19011m0;

    /* JADX INFO: renamed from: n0 */
    public int f19012n0;

    /* JADX INFO: renamed from: o0 */
    public float f19013o0;

    /* JADX INFO: renamed from: p0 */
    public long f19014p0;

    /* JADX INFO: renamed from: q0 */
    public int f19015q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro2(Context context, vk2 vk2Var, long j2, Handler handler, dp2 dp2Var, int i) {
        super(2, vk2Var, null, false);
        boolean z = false;
        this.f18990R = context.getApplicationContext();
        this.f18991S = new to2(context);
        this.f18992T = new cp2(handler, dp2Var);
        if (jo2.f15673a <= 22 && "foster".equals(jo2.f15674b) && "NVIDIA".equals(jo2.f15675c)) {
            z = true;
        }
        this.f18993U = z;
        this.f18994V = new long[10];
        this.f19014p0 = -9223372036854775807L;
        this.f19000b0 = -9223372036854775807L;
        this.f19006h0 = -1;
        this.f19007i0 = -1;
        this.f19009k0 = -1.0f;
        this.f19005g0 = -1.0f;
        m8313W();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX INFO: renamed from: a0 */
    public static int m8303a0(String str, int i, int i2) {
        byte b;
        int iM7370b;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i3 = 4;
        switch (str) {
            case "video/3gpp":
                b = 0;
                break;
            case "video/hevc":
                b = 4;
                break;
            case "video/mp4v-es":
                b = 1;
                break;
            case "video/avc":
                b = 2;
                break;
            case "video/x-vnd.on2.vp8":
                b = 3;
                break;
            case "video/x-vnd.on2.vp9":
                b = 5;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1) {
            iM7370b = i * i2;
            i3 = 2;
        } else if (b != 2) {
            if (b == 3) {
                iM7370b = i * i2;
                i3 = 2;
            } else {
                if (b != 4 && b != 5) {
                    return -1;
                }
                iM7370b = i * i2;
            }
        } else {
            if ("BRAVIA 4K 2015".equals(jo2.f15676d)) {
                return -1;
            }
            iM7370b = jo2.m7370b(i2, 16) * jo2.m7370b(i, 16) * 256;
            i3 = 2;
        }
        return (iM7370b * 3) / (i3 + i3);
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m8304b0(boolean z, ch2 ch2Var, ch2 ch2Var2) {
        if (ch2Var.f13016k.equals(ch2Var2.f13016k)) {
            int i = ch2Var.f13023r;
            if (i == -1) {
                i = 0;
            }
            int i2 = ch2Var2.f13023r;
            if (i2 == -1) {
                i2 = 0;
            }
            if (i == i2) {
                if (z) {
                    return true;
                }
                if (ch2Var.f13020o == ch2Var2.f13020o && ch2Var.f13021p == ch2Var2.f13021p) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2, p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: A */
    public final void mo7701A() {
        this.f19006h0 = -1;
        this.f19007i0 = -1;
        this.f19009k0 = -1.0f;
        this.f19005g0 = -1.0f;
        this.f19014p0 = -9223372036854775807L;
        this.f19015q0 = 0;
        m8313W();
        this.f18999a0 = false;
        int i = jo2.f15673a;
        to2 to2Var = this.f18991S;
        if (to2Var.f19934b) {
            to2Var.f19933a.f19641h.sendEmptyMessage(2);
        }
        try {
            super.mo7701A();
            synchronized (this.f19887P) {
            }
        } finally {
            synchronized (this.f19887P) {
                cp2 cp2Var = this.f18992T;
                cp2Var.f13077a.post(new bp2(cp2Var, this.f19887P));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x0153  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: B */
    public final int mo7702B(vk2 vk2Var, ch2 ch2Var) throws xk2 {
        boolean z;
        int i;
        int i2;
        String str;
        byte b;
        int i3;
        Pair pair;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer numValueOf;
        Integer numValueOf2;
        String str2 = ch2Var.f13016k;
        boolean zM8294a = false;
        if (!C2622l.m5329X1(str2)) {
            return 0;
        }
        yi2 yi2Var = ch2Var.f13019n;
        if (yi2Var != null) {
            boolean z2 = false;
            for (int i4 = 0; i4 < yi2Var.f21901h; i4++) {
                z2 |= yi2Var.f21899f[i4].f21556j;
            }
            if (true != z2) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        rk2 rk2VarM6039a = bl2.m6039a(str2, z);
        if (rk2VarM6039a == null) {
            return 1;
        }
        String str3 = ch2Var.f13013h;
        if (str3 == null || rk2VarM6039a.f18918e == null) {
            zM8294a = true;
        } else {
            String strTrim = str3.trim();
            if (strTrim.startsWith("avc1") || strTrim.startsWith("avc3")) {
                str = "video/avc";
            } else if (strTrim.startsWith("hev1") || strTrim.startsWith("hvc1")) {
                str = "video/hevc";
            } else if (strTrim.startsWith("vp9")) {
                str = "video/x-vnd.on2.vp9";
            } else if (strTrim.startsWith("vp8")) {
                str = "video/x-vnd.on2.vp8";
            } else if (strTrim.startsWith("mp4a")) {
                str = "audio/mp4a-latm";
            } else if (strTrim.startsWith("ac-3") || strTrim.startsWith("dac3")) {
                str = "audio/ac3";
            } else if (strTrim.startsWith("ec-3") || strTrim.startsWith("dec3")) {
                str = "audio/eac3";
            } else if (strTrim.startsWith("dtsc") || strTrim.startsWith("dtse")) {
                str = "audio/vnd.dts";
            } else if (strTrim.startsWith("dtsh") || strTrim.startsWith("dtsl")) {
                str = "audio/vnd.dts.hd";
            } else if (strTrim.startsWith("opus")) {
                str = "audio/opus";
            } else {
                str = strTrim.startsWith("vorbis") ? "audio/vorbis" : null;
            }
            if (str == null) {
                zM8294a = true;
            } else if (rk2VarM6039a.f18918e.equals(str)) {
                Pattern pattern = bl2.f12726a;
                String[] strArrSplit = str3.split("\\.");
                switch (strArrSplit[0]) {
                    case "avc1":
                        b = 2;
                        break;
                    case "avc2":
                        b = 3;
                        break;
                    case "hev1":
                        b = 0;
                        break;
                    case "hvc1":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0 || b == 1) {
                    if (strArrSplit.length < 4) {
                        Log.w("MediaCodecUtil", str3.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str3) : new String("Ignoring malformed HEVC codec string: "));
                    } else {
                        Matcher matcher = bl2.f12726a.matcher(strArrSplit[1]);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            if ("1".equals(strGroup)) {
                                i3 = 1;
                            } else if ("2".equals(strGroup)) {
                                i3 = 2;
                            } else {
                                String strValueOf = String.valueOf(strGroup);
                                Log.w("MediaCodecUtil", strValueOf.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf) : new String("Unknown HEVC profile string: "));
                            }
                            Integer num = bl2.f12730e.get(strArrSplit[3]);
                            if (num == null) {
                                String strValueOf2 = String.valueOf(matcher.group(1));
                                Log.w("MediaCodecUtil", strValueOf2.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf2) : new String("Unknown HEVC level string: "));
                            } else {
                                pair = new Pair(Integer.valueOf(i3), num);
                            }
                        } else {
                            Log.w("MediaCodecUtil", str3.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str3) : new String("Ignoring malformed HEVC codec string: "));
                        }
                    }
                    pair = null;
                } else if (b == 2 || b == 3) {
                    int length = strArrSplit.length;
                    if (length < 2) {
                        Log.w("MediaCodecUtil", str3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str3) : new String("Ignoring malformed AVC codec string: "));
                    } else {
                        try {
                            if (strArrSplit[1].length() == 6) {
                                numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                                numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
                            } else if (length >= 3) {
                                numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                                numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
                            } else {
                                Log.w("MediaCodecUtil", str3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str3) : new String("Ignoring malformed AVC codec string: "));
                            }
                            pair = new Pair(Integer.valueOf(bl2.f12728c.get(numValueOf.intValue())), Integer.valueOf(bl2.f12729d.get(numValueOf2.intValue())));
                        } catch (NumberFormatException unused) {
                            Log.w("MediaCodecUtil", str3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str3) : new String("Ignoring malformed AVC codec string: "));
                        }
                    }
                    pair = null;
                } else {
                    pair = null;
                }
                if (pair != null) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = rk2VarM6039a.f18919f;
                    if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    int length2 = codecProfileLevelArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i5];
                            if (codecProfileLevel.profile != ((Integer) pair.first).intValue() || codecProfileLevel.level < ((Integer) pair.second).intValue()) {
                                i5++;
                            } else {
                                zM8294a = true;
                            }
                        } else {
                            rk2VarM6039a.m8295b(outline.m1553D(new StringBuilder(str3.length() + 22 + str.length()), "codec.profileLevel, ", str3, ", ", str));
                            zM8294a = false;
                        }
                    }
                } else {
                    zM8294a = true;
                }
            } else {
                rk2VarM6039a.m8295b(outline.m1553D(new StringBuilder(str3.length() + 13 + str.length()), "codec.mime ", str3, ", ", str));
            }
        }
        if (zM8294a && (i = ch2Var.f13020o) > 0 && (i2 = ch2Var.f13021p) > 0) {
            if (jo2.f15673a >= 21) {
                zM8294a = rk2VarM6039a.m8294a(i, i2, ch2Var.f13022q);
            } else {
                zM8294a = i * i2 <= bl2.m6040b();
                if (!zM8294a) {
                    int i6 = ch2Var.f13020o;
                    int i7 = ch2Var.f13021p;
                    String str4 = jo2.f15677e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i6);
                    sb.append("x");
                    sb.append(i7);
                    sb.append("] [");
                    sb.append(str4);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        return (true != rk2VarM6039a.f18916c ? 0 : 16) | (true == rk2VarM6039a.f18915b ? 8 : 4) | (true != zM8294a ? 2 : 3);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0112 A[SYNTHETIC] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: E */
    public final void mo7704E(rk2 rk2Var, MediaCodec mediaCodec, ch2 ch2Var, MediaCrypto mediaCrypto) throws xk2 {
        qo2 qo2Var;
        Point point;
        Point point2;
        Point point3;
        ch2[] ch2VarArr = this.f18995W;
        int iMax = ch2Var.f13020o;
        int iMax2 = ch2Var.f13021p;
        int iMax3 = ch2Var.f13017l;
        if (iMax3 == -1) {
            iMax3 = m8303a0(ch2Var.f13016k, iMax, iMax2);
        }
        if (ch2VarArr.length == 1) {
            qo2Var = new qo2(iMax, iMax2, iMax3);
        } else {
            boolean z = false;
            for (ch2 ch2Var2 : ch2VarArr) {
                if (m8304b0(rk2Var.f18915b, ch2Var, ch2Var2)) {
                    int i = ch2Var2.f13020o;
                    z |= i == -1 || ch2Var2.f13021p == -1;
                    iMax = Math.max(iMax, i);
                    iMax2 = Math.max(iMax2, ch2Var2.f13021p);
                    int iM8303a0 = ch2Var2.f13017l;
                    if (iM8303a0 == -1) {
                        iM8303a0 = m8303a0(ch2Var2.f13016k, ch2Var2.f13020o, ch2Var2.f13021p);
                    }
                    iMax3 = Math.max(iMax3, iM8303a0);
                }
            }
            if (z) {
                Log.w("MediaCodecVideoRenderer", outline.m1586h(66, "Resolutions unknown. Codec max resolution: ", iMax, "x", iMax2));
                int i2 = ch2Var.f13021p;
                int i3 = ch2Var.f13020o;
                int i4 = i2 > i3 ? i2 : i3;
                int i5 = i2 <= i3 ? i2 : i3;
                float f = i5 / i4;
                int[] iArr = f18989Q;
                int i6 = 0;
                while (true) {
                    if (i6 < 9) {
                        int i7 = iArr[i6];
                        int[] iArr2 = iArr;
                        int i8 = (int) (i7 * f);
                        if (i7 > i4 && i8 > i5) {
                            int i9 = i4;
                            int i10 = i5;
                            if (jo2.f15673a >= 21) {
                                int i11 = i2 <= i3 ? i7 : i8;
                                if (i2 <= i3) {
                                    i7 = i8;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = rk2Var.f18919f;
                                if (codecCapabilities == null) {
                                    rk2Var.m8295b("align.caps");
                                } else {
                                    MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
                                    if (videoCapabilities == null) {
                                        rk2Var.m8295b("align.vCaps");
                                    } else {
                                        int widthAlignment = videoCapabilities.getWidthAlignment();
                                        int heightAlignment = videoCapabilities.getHeightAlignment();
                                        point2 = new Point(jo2.m7370b(i11, widthAlignment) * widthAlignment, jo2.m7370b(i7, heightAlignment) * heightAlignment);
                                    }
                                    point3 = point2;
                                    if (rk2Var.m8294a(point2.x, point2.y, ch2Var.f13022q)) {
                                        point = point3;
                                        break;
                                    }
                                    i6++;
                                    iArr = iArr2;
                                    i4 = i9;
                                    i5 = i10;
                                    f = f;
                                }
                                point2 = null;
                                point3 = point2;
                                if (rk2Var.m8294a(point2.x, point2.y, ch2Var.f13022q)) {
                                    point = point3;
                                    break;
                                }
                                i6++;
                                iArr = iArr2;
                                i4 = i9;
                                i5 = i10;
                                f = f;
                            } else {
                                f = f;
                                int iM7370b = jo2.m7370b(i7, 16) * 16;
                                int iM7370b2 = jo2.m7370b(i8, 16) * 16;
                                if (iM7370b * iM7370b2 <= bl2.m6040b()) {
                                    int i12 = i2 <= i3 ? iM7370b : iM7370b2;
                                    if (i2 <= i3) {
                                        iM7370b = iM7370b2;
                                    }
                                    point = new Point(i12, iM7370b);
                                    break;
                                }
                                i6++;
                                iArr = iArr2;
                                i4 = i9;
                                i5 = i10;
                                f = f;
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iMax3 = Math.max(iMax3, m8303a0(ch2Var.f13016k, iMax, iMax2));
                    Log.w("MediaCodecVideoRenderer", outline.m1586h(57, "Codec max resolution adjusted to: ", iMax, "x", iMax2));
                }
            }
            qo2Var = new qo2(iMax, iMax2, iMax3);
        }
        this.f18996X = qo2Var;
        boolean z2 = this.f18993U;
        MediaFormat mediaFormatM6188g = ch2Var.m6188g();
        mediaFormatM6188g.setInteger("max-width", qo2Var.f18398a);
        mediaFormatM6188g.setInteger("max-height", qo2Var.f18399b);
        int i13 = qo2Var.f18400c;
        if (i13 != -1) {
            mediaFormatM6188g.setInteger("max-input-size", i13);
        }
        if (z2) {
            mediaFormatM6188g.setInteger("auto-frc", 0);
        }
        if (this.f18997Y == null) {
            C2622l.m5322V2(m8312V(rk2Var.f18917d));
            if (this.f18998Z == null) {
                this.f18998Z = oo2.m8049b(this.f18990R, rk2Var.f18917d);
            }
            this.f18997Y = this.f18998Z;
        }
        mediaCodec.configure(mediaFormatM6188g, this.f18997Y, (MediaCrypto) null, 0);
        int i14 = jo2.f15673a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: F */
    public final void mo7705F(String str, long j2, long j3) {
        cp2 cp2Var = this.f18992T;
        cp2Var.f13077a.post(new vo2(cp2Var, str));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: G */
    public final void mo7706G(ch2 ch2Var) throws pg2 {
        super.mo7706G(ch2Var);
        cp2 cp2Var = this.f18992T;
        cp2Var.f13077a.post(new wo2(cp2Var, ch2Var));
        float f = ch2Var.f13024s;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f19005g0 = f;
        int i = ch2Var.f13023r;
        if (i == -1) {
            i = 0;
        }
        this.f19004f0 = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: H */
    public final void mo7707H(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.f19006h0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f19007i0 = integer;
        float f = this.f19005g0;
        this.f19009k0 = f;
        if (jo2.f15673a >= 21) {
            int i = this.f19004f0;
            if (i == 90 || i == 270) {
                int i2 = this.f19006h0;
                this.f19006h0 = integer;
                this.f19007i0 = i2;
                this.f19009k0 = 1.0f / f;
            }
        } else {
            this.f19008j0 = this.f19004f0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: J */
    public final boolean mo7708J(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j4, boolean z) {
        long j5;
        long j6;
        long j7;
        while (true) {
            int i3 = this.f19015q0;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.f18994V;
            long j8 = jArr[0];
            if (j4 < j8) {
                break;
            }
            this.f19014p0 = j8;
            int i4 = i3 - 1;
            this.f19015q0 = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        if (z) {
            C2622l.m5441u1("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            C2622l.m5305R1();
            this.f19887P.f19849e++;
            return true;
        }
        long j9 = j4 - j2;
        if (this.f18997Y == this.f18998Z) {
            if (!(j9 < -30000)) {
                return false;
            }
            C2622l.m5441u1("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            C2622l.m5305R1();
            this.f19887P.f19849e++;
            return true;
        }
        if (!this.f18999a0) {
            if (jo2.f15673a >= 21) {
                m8310T(mediaCodec, i, System.nanoTime());
            } else {
                m8309S(mediaCodec, i);
            }
            return true;
        }
        if (this.f17096d != 2) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jNanoTime = System.nanoTime();
        to2 to2Var = this.f18991S;
        long j10 = ((j9 - ((jElapsedRealtime * 1000) - j3)) * 1000) + jNanoTime;
        long j11 = j4 * 1000;
        if (to2Var.f19940h) {
            if (j4 != to2Var.f19937e) {
                to2Var.f19943k++;
                to2Var.f19938f = to2Var.f19939g;
            }
            long j12 = to2Var.f19943k;
            if (j12 >= 6) {
                j6 = to2Var.f19938f + ((j11 - to2Var.f19942j) / j12);
                if (to2Var.m8438a(j6, j10)) {
                    to2Var.f19940h = false;
                } else {
                    j5 = (to2Var.f19941i + j6) - to2Var.f19942j;
                }
            } else if (to2Var.m8438a(j11, j10)) {
                to2Var.f19940h = false;
            }
            j5 = j10;
            j6 = j11;
        } else {
            j5 = j10;
            j6 = j11;
        }
        if (!to2Var.f19940h) {
            to2Var.f19942j = j11;
            to2Var.f19941i = j10;
            to2Var.f19943k = 0L;
            to2Var.f19940h = true;
        }
        to2Var.f19937e = j4;
        to2Var.f19939g = j6;
        so2 so2Var = to2Var.f19933a;
        if (so2Var != null && so2Var.f19640g != 0) {
            long j13 = to2Var.f19933a.f19640g;
            long j14 = to2Var.f19935c;
            long j15 = (((j5 - j13) / j14) * j14) + j13;
            if (j5 <= j15) {
                j7 = j15 - j14;
            } else {
                j7 = j15;
                j15 = j14 + j15;
            }
            if (j15 - j5 >= j5 - j7) {
                j15 = j7;
            }
            j5 = j15 - to2Var.f19936d;
        }
        long j16 = (j5 - jNanoTime) / 1000;
        if (j16 < -30000) {
            C2622l.m5441u1("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            C2622l.m5305R1();
            ti2 ti2Var = this.f19887P;
            ti2Var.f19850f++;
            this.f19002d0++;
            int i5 = this.f19003e0 + 1;
            this.f19003e0 = i5;
            ti2Var.f19851g = Math.max(i5, ti2Var.f19851g);
            if (this.f19002d0 == -1) {
                m8316Z();
            }
            return true;
        }
        if (jo2.f15673a >= 21) {
            if (j16 >= 50000) {
                return false;
            }
            m8310T(mediaCodec, i, j5);
            return true;
        }
        if (j16 >= 30000) {
            return false;
        }
        if (j16 > 11000) {
            try {
                Thread.sleep((j16 - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        m8309S(mediaCodec, i);
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2, p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: M */
    public final boolean mo7119M() {
        Surface surface;
        if (super.mo7119M() && (this.f18999a0 || (((surface = this.f18998Z) != null && this.f18997Y == surface) || this.f19895q == null))) {
            this.f19000b0 = -9223372036854775807L;
            return true;
        }
        if (this.f19000b0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f19000b0) {
            return true;
        }
        this.f19000b0 = -9223372036854775807L;
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: O */
    public final boolean mo8305O(rk2 rk2Var) {
        return this.f18997Y != null || m8312V(rk2Var.f18917d);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: P */
    public final void mo8306P() {
        try {
            super.mo8306P();
        } finally {
            Surface surface = this.f18998Z;
            if (surface != null) {
                if (this.f18997Y == surface) {
                    this.f18997Y = null;
                }
                surface.release();
                this.f18998Z = null;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: Q */
    public final void mo8307Q(ui2 ui2Var) {
        int i = jo2.f15673a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: R */
    public final boolean mo8308R(MediaCodec mediaCodec, boolean z, ch2 ch2Var, ch2 ch2Var2) {
        if (!m8304b0(z, ch2Var, ch2Var2)) {
            return false;
        }
        int i = ch2Var2.f13020o;
        qo2 qo2Var = this.f18996X;
        return i <= qo2Var.f18398a && ch2Var2.f13021p <= qo2Var.f18399b && ch2Var2.f13017l <= qo2Var.f18400c;
    }

    /* JADX INFO: renamed from: S */
    public final void m8309S(MediaCodec mediaCodec, int i) {
        m8314X();
        C2622l.m5441u1("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C2622l.m5305R1();
        this.f19887P.f19848d++;
        this.f19003e0 = 0;
        m8311U();
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: T */
    public final void m8310T(MediaCodec mediaCodec, int i, long j2) {
        m8314X();
        C2622l.m5441u1("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C2622l.m5305R1();
        this.f19887P.f19848d++;
        this.f19003e0 = 0;
        m8311U();
    }

    /* JADX INFO: renamed from: U */
    public final void m8311U() {
        if (this.f18999a0) {
            return;
        }
        this.f18999a0 = true;
        cp2 cp2Var = this.f18992T;
        cp2Var.f13077a.post(new ap2(cp2Var, this.f18997Y));
    }

    /* JADX INFO: renamed from: V */
    public final boolean m8312V(boolean z) {
        return jo2.f15673a >= 23 && (!z || oo2.m8048a(this.f18990R));
    }

    /* JADX INFO: renamed from: W */
    public final void m8313W() {
        this.f19010l0 = -1;
        this.f19011m0 = -1;
        this.f19013o0 = -1.0f;
        this.f19012n0 = -1;
    }

    /* JADX INFO: renamed from: X */
    public final void m8314X() {
        int i = this.f19010l0;
        int i2 = this.f19006h0;
        if (i == i2 && this.f19011m0 == this.f19007i0 && this.f19012n0 == this.f19008j0 && this.f19013o0 == this.f19009k0) {
            return;
        }
        this.f18992T.m6221a(i2, this.f19007i0, this.f19008j0, this.f19009k0);
        this.f19010l0 = this.f19006h0;
        this.f19011m0 = this.f19007i0;
        this.f19012n0 = this.f19008j0;
        this.f19013o0 = this.f19009k0;
    }

    /* JADX INFO: renamed from: Y */
    public final void m8315Y() {
        if (this.f19010l0 == -1 && this.f19011m0 == -1) {
            return;
        }
        this.f18992T.m6221a(this.f19006h0, this.f19007i0, this.f19008j0, this.f19009k0);
    }

    /* JADX INFO: renamed from: Z */
    public final void m8316Z() {
        if (this.f19002d0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f19001c0;
            cp2 cp2Var = this.f18992T;
            cp2Var.f13077a.post(new xo2(cp2Var, this.f19002d0, jElapsedRealtime - j2));
            this.f19002d0 = 0;
            this.f19001c0 = jElapsedRealtime;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2, p007c.p190n.p194b.p266d.p314j.p315a.rg2
    /* JADX INFO: renamed from: g */
    public final void mo7710g(int i, Object obj) throws pg2 {
        if (i == 1) {
            Surface surfaceM8049b = (Surface) obj;
            if (surfaceM8049b == null) {
                Surface surface = this.f18998Z;
                if (surface != null) {
                    surfaceM8049b = surface;
                } else {
                    rk2 rk2Var = this.f19896r;
                    if (rk2Var != null && m8312V(rk2Var.f18917d)) {
                        surfaceM8049b = oo2.m8049b(this.f18990R, rk2Var.f18917d);
                        this.f18998Z = surfaceM8049b;
                    }
                }
            }
            if (this.f18997Y == surfaceM8049b) {
                if (surfaceM8049b == null || surfaceM8049b == this.f18998Z) {
                    return;
                }
                m8315Y();
                if (this.f18999a0) {
                    cp2 cp2Var = this.f18992T;
                    cp2Var.f13077a.post(new ap2(cp2Var, this.f18997Y));
                    return;
                }
                return;
            }
            this.f18997Y = surfaceM8049b;
            int i2 = this.f17096d;
            if (i2 == 1 || i2 == 2) {
                MediaCodec mediaCodec = this.f19895q;
                if (jo2.f15673a < 23 || mediaCodec == null || surfaceM8049b == null) {
                    mo8306P();
                    m8421N();
                } else {
                    mediaCodec.setOutputSurface(surfaceM8049b);
                }
            }
            if (surfaceM8049b == null || surfaceM8049b == this.f18998Z) {
                m8313W();
                this.f18999a0 = false;
                int i3 = jo2.f15673a;
            } else {
                m8315Y();
                this.f18999a0 = false;
                int i4 = jo2.f15673a;
                if (i2 == 2) {
                    this.f19000b0 = -9223372036854775807L;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2, p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: v */
    public final void mo7711v(boolean z) throws pg2 {
        super.mo7711v(z);
        Objects.requireNonNull(this.f17094b);
        cp2 cp2Var = this.f18992T;
        cp2Var.f13077a.post(new uo2(cp2Var, this.f19887P));
        to2 to2Var = this.f18991S;
        to2Var.f19940h = false;
        if (to2Var.f19934b) {
            to2Var.f19933a.f19641h.sendEmptyMessage(1);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: w */
    public final void mo7861w(ch2[] ch2VarArr, long j2) throws pg2 {
        this.f18995W = ch2VarArr;
        if (this.f19014p0 == -9223372036854775807L) {
            this.f19014p0 = j2;
            return;
        }
        int i = this.f19015q0;
        if (i == 10) {
            long j3 = this.f18994V[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.f19015q0 = i + 1;
        }
        this.f18994V[this.f19015q0 - 1] = j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2, p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: x */
    public final void mo7712x(long j2, boolean z) throws pg2 {
        super.mo7712x(j2, z);
        this.f18999a0 = false;
        int i = jo2.f15673a;
        this.f19003e0 = 0;
        int i2 = this.f19015q0;
        if (i2 != 0) {
            this.f19014p0 = this.f18994V[i2 - 1];
            this.f19015q0 = 0;
        }
        this.f19000b0 = -9223372036854775807L;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: y */
    public final void mo7713y() {
        this.f19002d0 = 0;
        this.f19001c0 = SystemClock.elapsedRealtime();
        this.f19000b0 = -9223372036854775807L;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: z */
    public final void mo7714z() {
        m8316Z();
    }
}
