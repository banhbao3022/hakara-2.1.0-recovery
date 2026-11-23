package p007c.p190n.p194b.p334e.p360t;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.e.t.g, reason: use source file name */
/* JADX INFO: compiled from: StaticLayoutBuilderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class StaticLayoutBuilderCompat {

    /* JADX INFO: renamed from: a */
    public static boolean f25486a;

    /* JADX INFO: renamed from: b */
    public static Constructor<StaticLayout> f25487b;

    /* JADX INFO: renamed from: c */
    public static Object f25488c;

    /* JADX INFO: renamed from: d */
    public CharSequence f25489d;

    /* JADX INFO: renamed from: e */
    public final TextPaint f25490e;

    /* JADX INFO: renamed from: f */
    public final int f25491f;

    /* JADX INFO: renamed from: g */
    public int f25492g;

    /* JADX INFO: renamed from: k */
    public boolean f25496k;

    /* JADX INFO: renamed from: h */
    public Layout.Alignment f25493h = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: i */
    public int f25494i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    public boolean f25495j = true;

    /* JADX INFO: renamed from: l */
    public TextUtils.TruncateAt f25497l = null;

    /* JADX INFO: renamed from: c.n.b.e.t.g$a */
    /* JADX INFO: compiled from: StaticLayoutBuilderCompat.java */
    public static class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public a(Throwable th) {
            StringBuilder sbM1556G = outline.m1556G("Error thrown initializing StaticLayout ");
            sbM1556G.append(th.getMessage());
            super(sbM1556G.toString(), th);
        }
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f25489d = charSequence;
        this.f25490e = textPaint;
        this.f25491f = i;
        this.f25492g = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public StaticLayout m11335a() throws a {
        if (this.f25489d == null) {
            this.f25489d = "";
        }
        int iMax = Math.max(0, this.f25491f);
        CharSequence charSequenceEllipsize = this.f25489d;
        if (this.f25494i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f25490e, iMax, this.f25497l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f25492g);
        this.f25492g = iMin;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (this.f25496k) {
                this.f25493h = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, this.f25490e, iMax);
            builderObtain.setAlignment(this.f25493h);
            builderObtain.setIncludePad(this.f25495j);
            builderObtain.setTextDirection(this.f25496k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f25497l;
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(this.f25494i);
            return builderObtain.build();
        }
        if (!f25486a) {
            try {
                f25488c = this.f25496k && i >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                f25487b = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f25486a = true;
            } catch (Exception e) {
                throw new a(e);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f25487b;
            Objects.requireNonNull(constructor);
            Object obj = f25488c;
            Objects.requireNonNull(obj);
            return constructor.newInstance(charSequenceEllipsize, 0, Integer.valueOf(this.f25492g), this.f25490e, Integer.valueOf(iMax), this.f25493h, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f25495j), null, Integer.valueOf(iMax), Integer.valueOf(this.f25494i));
        } catch (Exception e2) {
            throw new a(e2);
        }
    }
}
