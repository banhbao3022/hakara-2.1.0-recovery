package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class rk2 {

    /* JADX INFO: renamed from: a */
    public final String f18914a;

    /* JADX INFO: renamed from: b */
    public final boolean f18915b;

    /* JADX INFO: renamed from: c */
    public final boolean f18916c;

    /* JADX INFO: renamed from: d */
    public final boolean f18917d;

    /* JADX INFO: renamed from: e */
    public final String f18918e;

    /* JADX INFO: renamed from: f */
    public final MediaCodecInfo.CodecCapabilities f18919f;

    public rk2(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.f18914a = str;
        this.f18918e = str2;
        this.f18919f = codecCapabilities;
        boolean z3 = true;
        this.f18915b = !z && codecCapabilities != null && jo2.f15673a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f18916c = codecCapabilities != null && jo2.f15673a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || jo2.f15673a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.f18917d = z3;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: c */
    public static boolean m8293c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public final boolean m8294a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18919f;
        if (codecCapabilities == null) {
            m8295b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m8295b("sizeAndRate.vCaps");
            return false;
        }
        if (m8293c(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i >= i2 || !m8293c(videoCapabilities, i2, i, d)) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.support, ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("x");
            sb.append(d);
            m8295b(sb.toString());
            return false;
        }
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("sizeAndRate.rotated, ");
        sb2.append(i);
        sb2.append("x");
        sb2.append(i2);
        sb2.append("x");
        sb2.append(d);
        String string = sb2.toString();
        String str = this.f18914a;
        String str2 = this.f18918e;
        String str3 = jo2.f15677e;
        int length = String.valueOf(string).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb3 = new StringBuilder(length + 25 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        outline.m1572W(sb3, "AssumedSupport [", string, "] [", str);
        outline.m1572W(sb3, ", ", str2, "] [", str3);
        sb3.append("]");
        Log.d("MediaCodecInfo", sb3.toString());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8295b(String str) {
        String str2 = this.f18914a;
        String str3 = this.f18918e;
        String str4 = jo2.f15677e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 20 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        outline.m1572W(sb, "NoSupport [", str, "] [", str2);
        outline.m1572W(sb, ", ", str3, "] [", str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }
}
