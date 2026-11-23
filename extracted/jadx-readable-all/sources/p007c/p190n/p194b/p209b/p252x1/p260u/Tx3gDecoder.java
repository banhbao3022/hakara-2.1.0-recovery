package p007c.p190n.p194b.p209b.p252x1.p260u;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p252x1.SubtitleDecoderException;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.x1.u.a, reason: use source file name */
/* JADX INFO: compiled from: Tx3gDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class Tx3gDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: n */
    public final ParsableByteArray f10113n;

    /* JADX INFO: renamed from: o */
    public final boolean f10114o;

    /* JADX INFO: renamed from: p */
    public final int f10115p;

    /* JADX INFO: renamed from: q */
    public final int f10116q;

    /* JADX INFO: renamed from: r */
    public final String f10117r;

    /* JADX INFO: renamed from: s */
    public final float f10118s;

    /* JADX INFO: renamed from: t */
    public final int f10119t;

    public Tx3gDecoder(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f10113n = new ParsableByteArray();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f10115p = 0;
            this.f10116q = -1;
            this.f10117r = "sans-serif";
            this.f10114o = false;
            this.f10118s = 0.85f;
            this.f10119t = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f10115p = bArr[24];
        this.f10116q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f10117r = "Serif".equals(Util6.m3128p(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f10119t = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f10114o = z;
        if (z) {
            this.f10118s = Util6.m3120h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f10118s = 0.85f;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m4475k(boolean z) throws SubtitleDecoderException {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m4476l(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    @Override // p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder
    /* JADX INFO: renamed from: j */
    public Subtitle mo4394j(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        String strM3212q;
        ParsableByteArray parsableByteArray = this.f10113n;
        parsableByteArray.f6392a = bArr;
        parsableByteArray.f6394c = i;
        parsableByteArray.f6393b = 0;
        int i2 = 2;
        int i3 = 1;
        m4475k(parsableByteArray.m3196a() >= 2);
        int iM3219x = parsableByteArray.m3219x();
        if (iM3219x == 0) {
            strM3212q = "";
        } else if (parsableByteArray.m3196a() >= 2) {
            byte[] bArr2 = parsableByteArray.f6392a;
            int i4 = parsableByteArray.f6393b;
            char c2 = (char) ((bArr2[i4 + 1] & 255) | ((bArr2[i4] & 255) << 8));
            if (c2 == 65279 || c2 == 65534) {
                strM3212q = parsableByteArray.m3212q(iM3219x, Charsets.f26133e);
            } else {
                strM3212q = parsableByteArray.m3212q(iM3219x, Charsets.f26131c);
            }
        } else {
            strM3212q = parsableByteArray.m3212q(iM3219x, Charsets.f26131c);
        }
        if (strM3212q.isEmpty()) {
            return Tx3gSubtitle.f10120f;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM3212q);
        m4476l(spannableStringBuilder, this.f10115p, 0, 0, spannableStringBuilder.length(), 16711680);
        int i5 = this.f10116q;
        int length = spannableStringBuilder.length();
        if (i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i5 >>> 8) | ((i5 & 255) << 24)), 0, length, 16711713);
        }
        String str = this.f10117r;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fM3120h = this.f10118s;
        for (int i6 = 8; this.f10113n.m3196a() >= i6; i6 = 8) {
            ParsableByteArray parsableByteArray2 = this.f10113n;
            int i7 = parsableByteArray2.f6393b;
            int iM3201f = parsableByteArray2.m3201f();
            int iM3201f2 = this.f10113n.m3201f();
            if (iM3201f2 == 1937013100) {
                m4475k(this.f10113n.m3196a() >= i2);
                int iM3219x2 = this.f10113n.m3219x();
                int i8 = 0;
                while (i8 < iM3219x2) {
                    ParsableByteArray parsableByteArray3 = this.f10113n;
                    m4475k(parsableByteArray3.m3196a() >= 12);
                    int iM3219x3 = parsableByteArray3.m3219x();
                    int iM3219x4 = parsableByteArray3.m3219x();
                    parsableByteArray3.m3195E(i2);
                    int iM3214s = parsableByteArray3.m3214s();
                    parsableByteArray3.m3195E(i3);
                    int iM3201f3 = parsableByteArray3.m3201f();
                    if (iM3219x4 > spannableStringBuilder.length()) {
                        StringBuilder sbM1557H = outline.m1557H("Truncating styl end (", iM3219x4, ") to cueText.length() (");
                        sbM1557H.append(spannableStringBuilder.length());
                        sbM1557H.append(").");
                        Log.w("Tx3gDecoder", sbM1557H.toString());
                        iM3219x4 = spannableStringBuilder.length();
                    }
                    int i9 = iM3219x4;
                    if (iM3219x3 >= i9) {
                        Log.w("Tx3gDecoder", outline.m1593o("Ignoring styl with start (", iM3219x3, ") >= end (", i9, ")."));
                    } else {
                        m4476l(spannableStringBuilder, iM3214s, this.f10115p, iM3219x3, i9, 0);
                        if (iM3201f3 != this.f10116q) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((iM3201f3 & 255) << 24) | (iM3201f3 >>> 8)), iM3219x3, i9, 33);
                        }
                    }
                    i8++;
                    i2 = 2;
                    i3 = 1;
                }
            } else if (iM3201f2 == 1952608120 && this.f10114o) {
                m4475k(this.f10113n.m3196a() >= 2);
                fM3120h = Util6.m3120h(this.f10113n.m3219x() / this.f10119t, 0.0f, 0.95f);
            }
            this.f10113n.m3194D(i7 + iM3201f);
            i2 = 2;
            i3 = 1;
        }
        Cue.b bVar = new Cue.b();
        bVar.f9803a = spannableStringBuilder;
        bVar.f9806d = fM3120h;
        bVar.f9807e = 0;
        bVar.f9808f = 0;
        return new Tx3gSubtitle(bVar.m4392a());
    }
}
