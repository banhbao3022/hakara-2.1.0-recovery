package p636z0.p725k.p737j;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.k.j.b, reason: use source file name */
/* JADX INFO: compiled from: PrecomputedTextCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class PrecomputedTextCompat implements Spannable {
    @Override // java.lang.CharSequence
    public char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }

    /* JADX INFO: renamed from: z0.k.j.b$a */
    /* JADX INFO: compiled from: PrecomputedTextCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TextPaint f37955a;

        /* JADX INFO: renamed from: b */
        public final TextDirectionHeuristic f37956b;

        /* JADX INFO: renamed from: c */
        public final int f37957c;

        /* JADX INFO: renamed from: d */
        public final int f37958d;

        /* JADX INFO: renamed from: z0.k.j.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PrecomputedTextCompat.java */
        public static class C8571a {

            /* JADX INFO: renamed from: a */
            public final TextPaint f37959a;

            /* JADX INFO: renamed from: b */
            public TextDirectionHeuristic f37960b;

            /* JADX INFO: renamed from: c */
            public int f37961c;

            /* JADX INFO: renamed from: d */
            public int f37962d;

            public C8571a(TextPaint textPaint) {
                this.f37959a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f37961c = 1;
                    this.f37962d = 1;
                } else {
                    this.f37962d = 0;
                    this.f37961c = 0;
                }
                this.f37960b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }

        @SuppressLint({"NewApi"})
        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f37955a = textPaint;
            this.f37956b = textDirectionHeuristic;
            this.f37957c = i;
            this.f37958d = i2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m16214a(a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f37957c != aVar.f37957c || this.f37958d != aVar.f37958d)) || this.f37955a.getTextSize() != aVar.f37955a.getTextSize() || this.f37955a.getTextScaleX() != aVar.f37955a.getTextScaleX() || this.f37955a.getTextSkewX() != aVar.f37955a.getTextSkewX() || this.f37955a.getLetterSpacing() != aVar.f37955a.getLetterSpacing() || !TextUtils.equals(this.f37955a.getFontFeatureSettings(), aVar.f37955a.getFontFeatureSettings()) || this.f37955a.getFlags() != aVar.f37955a.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f37955a.getTextLocales().equals(aVar.f37955a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f37955a.getTextLocale().equals(aVar.f37955a.getTextLocale())) {
                return false;
            }
            if (this.f37955a.getTypeface() == null) {
                return aVar.f37955a.getTypeface() == null;
            }
            return this.f37955a.getTypeface().equals(aVar.f37955a.getTypeface());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m16214a(aVar) && this.f37956b == aVar.f37956b;
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? Objects.hash(Float.valueOf(this.f37955a.getTextSize()), Float.valueOf(this.f37955a.getTextScaleX()), Float.valueOf(this.f37955a.getTextSkewX()), Float.valueOf(this.f37955a.getLetterSpacing()), Integer.valueOf(this.f37955a.getFlags()), this.f37955a.getTextLocales(), this.f37955a.getTypeface(), Boolean.valueOf(this.f37955a.isElegantTextHeight()), this.f37956b, Integer.valueOf(this.f37957c), Integer.valueOf(this.f37958d)) : Objects.hash(Float.valueOf(this.f37955a.getTextSize()), Float.valueOf(this.f37955a.getTextScaleX()), Float.valueOf(this.f37955a.getTextSkewX()), Float.valueOf(this.f37955a.getLetterSpacing()), Integer.valueOf(this.f37955a.getFlags()), this.f37955a.getTextLocale(), this.f37955a.getTypeface(), Boolean.valueOf(this.f37955a.isElegantTextHeight()), this.f37956b, Integer.valueOf(this.f37957c), Integer.valueOf(this.f37958d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sbM1556G = outline.m1556G("textSize=");
            sbM1556G.append(this.f37955a.getTextSize());
            sb.append(sbM1556G.toString());
            sb.append(", textScaleX=" + this.f37955a.getTextScaleX());
            sb.append(", textSkewX=" + this.f37955a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            StringBuilder sbM1556G2 = outline.m1556G(", letterSpacing=");
            sbM1556G2.append(this.f37955a.getLetterSpacing());
            sb.append(sbM1556G2.toString());
            sb.append(", elegantTextHeight=" + this.f37955a.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder sbM1556G3 = outline.m1556G(", textLocale=");
                sbM1556G3.append(this.f37955a.getTextLocales());
                sb.append(sbM1556G3.toString());
            } else {
                StringBuilder sbM1556G4 = outline.m1556G(", textLocale=");
                sbM1556G4.append(this.f37955a.getTextLocale());
                sb.append(sbM1556G4.toString());
            }
            StringBuilder sbM1556G5 = outline.m1556G(", typeface=");
            sbM1556G5.append(this.f37955a.getTypeface());
            sb.append(sbM1556G5.toString());
            if (i >= 26) {
                StringBuilder sbM1556G6 = outline.m1556G(", variationSettings=");
                sbM1556G6.append(this.f37955a.getFontVariationSettings());
                sb.append(sbM1556G6.toString());
            }
            StringBuilder sbM1556G7 = outline.m1556G(", textDir=");
            sbM1556G7.append(this.f37956b);
            sb.append(sbM1556G7.toString());
            sb.append(", breakStrategy=" + this.f37957c);
            sb.append(", hyphenationFrequency=" + this.f37958d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f37955a = params.getTextPaint();
            this.f37956b = params.getTextDirection();
            this.f37957c = params.getBreakStrategy();
            this.f37958d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }
    }
}
