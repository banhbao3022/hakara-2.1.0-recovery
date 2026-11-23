package p007c.p190n.p194b.p209b.p217p1;

import android.text.TextUtils;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.p1.g, reason: use source file name */
/* JADX INFO: compiled from: DecoderReuseEvaluation.java */
/* JADX INFO: loaded from: classes.dex */
public final class DecoderReuseEvaluation {

    /* JADX INFO: renamed from: a */
    public final String f7293a;

    /* JADX INFO: renamed from: b */
    public final Format f7294b;

    /* JADX INFO: renamed from: c */
    public final Format f7295c;

    /* JADX INFO: renamed from: d */
    public final int f7296d;

    /* JADX INFO: renamed from: e */
    public final int f7297e;

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i, int i2) {
        C2096e.m4566b(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f7293a = str;
        Objects.requireNonNull(format);
        this.f7294b = format;
        Objects.requireNonNull(format2);
        this.f7295c = format2;
        this.f7296d = i;
        this.f7297e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DecoderReuseEvaluation.class != obj.getClass()) {
            return false;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
        return this.f7296d == decoderReuseEvaluation.f7296d && this.f7297e == decoderReuseEvaluation.f7297e && this.f7293a.equals(decoderReuseEvaluation.f7293a) && this.f7294b.equals(decoderReuseEvaluation.f7294b) && this.f7295c.equals(decoderReuseEvaluation.f7295c);
    }

    public int hashCode() {
        return this.f7295c.hashCode() + ((this.f7294b.hashCode() + outline.m1569T(this.f7293a, (((this.f7296d + 527) * 31) + this.f7297e) * 31, 31)) * 31);
    }
}
