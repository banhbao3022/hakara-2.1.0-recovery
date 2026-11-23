package p007c.p190n.p194b.p266d.p314j.p315a;

import android.media.MediaCodec;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sk2 extends Exception {
    public sk2(ch2 ch2Var, Throwable th, boolean z, int i) {
        String strValueOf = String.valueOf(ch2Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        String str = ch2Var.f13016k;
        Math.abs(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sk2(ch2 ch2Var, Throwable th, boolean z, String str) {
        String strValueOf = String.valueOf(ch2Var);
        super(outline.m1553D(new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length()), "Decoder init failed: ", str, ", ", strValueOf), th);
        String str2 = ch2Var.f13016k;
        if (jo2.f15673a < 21 || !(th instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) th).getDiagnosticInfo();
    }
}
