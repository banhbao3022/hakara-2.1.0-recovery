package p007c.p190n.p194b.p334e.p360t;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p362v.CancelableFontCallback;
import p007c.p190n.p194b.p334e.p362v.TextAppearance;
import p636z0.p725k.p737j.TextDirectionHeuristicsCompat;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.t.a, reason: use source file name */
/* JADX INFO: compiled from: CollapsingTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class CollapsingTextHelper {

    /* JADX INFO: renamed from: A */
    public Bitmap f25414A;

    /* JADX INFO: renamed from: B */
    public float f25415B;

    /* JADX INFO: renamed from: C */
    public float f25416C;

    /* JADX INFO: renamed from: D */
    public int[] f25417D;

    /* JADX INFO: renamed from: E */
    public boolean f25418E;

    /* JADX INFO: renamed from: F */
    public final TextPaint f25419F;

    /* JADX INFO: renamed from: G */
    public final TextPaint f25420G;

    /* JADX INFO: renamed from: H */
    public TimeInterpolator f25421H;

    /* JADX INFO: renamed from: I */
    public TimeInterpolator f25422I;

    /* JADX INFO: renamed from: J */
    public float f25423J;

    /* JADX INFO: renamed from: K */
    public float f25424K;

    /* JADX INFO: renamed from: L */
    public float f25425L;

    /* JADX INFO: renamed from: M */
    public ColorStateList f25426M;

    /* JADX INFO: renamed from: N */
    public float f25427N;

    /* JADX INFO: renamed from: O */
    public float f25428O;

    /* JADX INFO: renamed from: P */
    public float f25429P;

    /* JADX INFO: renamed from: Q */
    public ColorStateList f25430Q;

    /* JADX INFO: renamed from: R */
    public float f25431R;

    /* JADX INFO: renamed from: S */
    public float f25432S;

    /* JADX INFO: renamed from: T */
    public StaticLayout f25433T;

    /* JADX INFO: renamed from: U */
    public float f25434U;

    /* JADX INFO: renamed from: V */
    public float f25435V;

    /* JADX INFO: renamed from: W */
    public float f25436W;

    /* JADX INFO: renamed from: X */
    public CharSequence f25437X;

    /* JADX INFO: renamed from: a */
    public final View f25439a;

    /* JADX INFO: renamed from: b */
    public boolean f25440b;

    /* JADX INFO: renamed from: c */
    public float f25441c;

    /* JADX INFO: renamed from: d */
    public final Rect f25442d;

    /* JADX INFO: renamed from: e */
    public final Rect f25443e;

    /* JADX INFO: renamed from: f */
    public final RectF f25444f;

    /* JADX INFO: renamed from: k */
    public ColorStateList f25449k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f25450l;

    /* JADX INFO: renamed from: m */
    public float f25451m;

    /* JADX INFO: renamed from: n */
    public float f25452n;

    /* JADX INFO: renamed from: o */
    public float f25453o;

    /* JADX INFO: renamed from: p */
    public float f25454p;

    /* JADX INFO: renamed from: q */
    public float f25455q;

    /* JADX INFO: renamed from: r */
    public float f25456r;

    /* JADX INFO: renamed from: s */
    public Typeface f25457s;

    /* JADX INFO: renamed from: t */
    public Typeface f25458t;

    /* JADX INFO: renamed from: u */
    public Typeface f25459u;

    /* JADX INFO: renamed from: v */
    public CancelableFontCallback f25460v;

    /* JADX INFO: renamed from: w */
    public CancelableFontCallback f25461w;

    /* JADX INFO: renamed from: x */
    public CharSequence f25462x;

    /* JADX INFO: renamed from: y */
    public CharSequence f25463y;

    /* JADX INFO: renamed from: z */
    public boolean f25464z;

    /* JADX INFO: renamed from: g */
    public int f25445g = 16;

    /* JADX INFO: renamed from: h */
    public int f25446h = 16;

    /* JADX INFO: renamed from: i */
    public float f25447i = 15.0f;

    /* JADX INFO: renamed from: j */
    public float f25448j = 15.0f;

    /* JADX INFO: renamed from: Y */
    public int f25438Y = 1;

    /* JADX INFO: renamed from: c.n.b.e.t.a$a */
    /* JADX INFO: compiled from: CollapsingTextHelper.java */
    public class a implements CancelableFontCallback.a {
        public a() {
        }

        @Override // p007c.p190n.p194b.p334e.p362v.CancelableFontCallback.a
        /* JADX INFO: renamed from: a */
        public void mo11329a(Typeface typeface) {
            CollapsingTextHelper.this.m11320r(typeface);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.t.a$b */
    /* JADX INFO: compiled from: CollapsingTextHelper.java */
    public class b implements CancelableFontCallback.a {
        public b() {
        }

        @Override // p007c.p190n.p194b.p334e.p362v.CancelableFontCallback.a
        /* JADX INFO: renamed from: a */
        public void mo11329a(Typeface typeface) {
            CollapsingTextHelper.this.m11324v(typeface);
        }
    }

    public CollapsingTextHelper(View view) {
        this.f25439a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f25419F = textPaint;
        this.f25420G = new TextPaint(textPaint);
        this.f25443e = new Rect();
        this.f25442d = new Rect();
        this.f25444f = new RectF();
    }

    /* JADX INFO: renamed from: a */
    public static int m11302a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: k */
    public static float m11303k(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AnimationUtils.m11030a(f, f2, f3);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m11304n(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* JADX INFO: renamed from: A */
    public void m11305A(Typeface typeface) {
        boolean z;
        CancelableFontCallback cancelableFontCallback = this.f25461w;
        boolean z2 = true;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f25522c = true;
        }
        if (this.f25457s != typeface) {
            this.f25457s = typeface;
            z = true;
        } else {
            z = false;
        }
        CancelableFontCallback cancelableFontCallback2 = this.f25460v;
        if (cancelableFontCallback2 != null) {
            cancelableFontCallback2.f25522c = true;
        }
        if (this.f25458t != typeface) {
            this.f25458t = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            m11316m();
        }
    }

    /* JADX INFO: renamed from: b */
    public float m11306b() {
        if (this.f25462x == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.f25420G;
        textPaint.setTextSize(this.f25448j);
        textPaint.setTypeface(this.f25457s);
        textPaint.setLetterSpacing(this.f25431R);
        TextPaint textPaint2 = this.f25420G;
        CharSequence charSequence = this.f25462x;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11307c(CharSequence charSequence) {
        View view = this.f25439a;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return ((TextDirectionHeuristicsCompat.c) (view.getLayoutDirection() == 1 ? TextDirectionHeuristicsCompat.f37966d : TextDirectionHeuristicsCompat.f37965c)).m16217b(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: d */
    public final void m11308d(float f) {
        this.f25444f.left = m11303k(this.f25442d.left, this.f25443e.left, f, this.f25421H);
        this.f25444f.top = m11303k(this.f25451m, this.f25452n, f, this.f25421H);
        this.f25444f.right = m11303k(this.f25442d.right, this.f25443e.right, f, this.f25421H);
        this.f25444f.bottom = m11303k(this.f25442d.bottom, this.f25443e.bottom, f, this.f25421H);
        this.f25455q = m11303k(this.f25453o, this.f25454p, f, this.f25421H);
        this.f25456r = m11303k(this.f25451m, this.f25452n, f, this.f25421H);
        m11326x(m11303k(this.f25447i, this.f25448j, f, this.f25422I));
        TimeInterpolator timeInterpolator = AnimationUtils.f24794b;
        this.f25434U = 1.0f - m11303k(0.0f, 1.0f, 1.0f - f, timeInterpolator);
        View view = this.f25439a;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        view.postInvalidateOnAnimation();
        this.f25435V = m11303k(1.0f, 0.0f, f, timeInterpolator);
        this.f25439a.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f25450l;
        ColorStateList colorStateList2 = this.f25449k;
        if (colorStateList != colorStateList2) {
            this.f25419F.setColor(m11302a(m11314j(colorStateList2), m11313i(), f));
        } else {
            this.f25419F.setColor(m11313i());
        }
        float f2 = this.f25431R;
        float f3 = this.f25432S;
        if (f2 != f3) {
            this.f25419F.setLetterSpacing(m11303k(f3, f2, f, timeInterpolator));
        } else {
            this.f25419F.setLetterSpacing(f2);
        }
        this.f25419F.setShadowLayer(m11303k(this.f25427N, this.f25423J, f, null), m11303k(this.f25428O, this.f25424K, f, null), m11303k(this.f25429P, this.f25425L, f, null), m11302a(m11314j(this.f25430Q), m11314j(this.f25426M), f));
        this.f25439a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: e */
    public final void m11309e(float f) {
        boolean z;
        float f2;
        StaticLayout staticLayoutM11335a;
        if (this.f25462x == null) {
            return;
        }
        float fWidth = this.f25443e.width();
        float fWidth2 = this.f25442d.width();
        if (Math.abs(f - this.f25448j) < 0.001f) {
            f2 = this.f25448j;
            this.f25415B = 1.0f;
            Typeface typeface = this.f25459u;
            Typeface typeface2 = this.f25457s;
            if (typeface != typeface2) {
                this.f25459u = typeface2;
                z = true;
            } else {
                z = false;
            }
        } else {
            float f3 = this.f25447i;
            Typeface typeface3 = this.f25459u;
            Typeface typeface4 = this.f25458t;
            if (typeface3 != typeface4) {
                this.f25459u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(f - f3) < 0.001f) {
                this.f25415B = 1.0f;
            } else {
                this.f25415B = f / this.f25447i;
            }
            float f4 = this.f25448j / this.f25447i;
            fWidth = fWidth2 * f4 > fWidth ? Math.min(fWidth / f4, fWidth2) : fWidth2;
            f2 = f3;
        }
        if (fWidth > 0.0f) {
            z = this.f25416C != f2 || this.f25418E || z;
            this.f25416C = f2;
            this.f25418E = false;
        }
        if (this.f25463y == null || z) {
            this.f25419F.setTextSize(this.f25416C);
            this.f25419F.setTypeface(this.f25459u);
            this.f25419F.setLinearText(this.f25415B != 1.0f);
            boolean zM11307c = m11307c(this.f25462x);
            this.f25464z = zM11307c;
            int i = this.f25438Y;
            int i2 = i > 1 && !zM11307c ? i : 1;
            try {
                StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.f25462x, this.f25419F, (int) fWidth);
                staticLayoutBuilderCompat.f25497l = TextUtils.TruncateAt.END;
                staticLayoutBuilderCompat.f25496k = zM11307c;
                staticLayoutBuilderCompat.f25493h = Layout.Alignment.ALIGN_NORMAL;
                staticLayoutBuilderCompat.f25495j = false;
                staticLayoutBuilderCompat.f25494i = i2;
                staticLayoutM11335a = staticLayoutBuilderCompat.m11335a();
            } catch (StaticLayoutBuilderCompat.a e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutM11335a = null;
            }
            Objects.requireNonNull(staticLayoutM11335a);
            this.f25433T = staticLayoutM11335a;
            this.f25463y = staticLayoutM11335a.getText();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11310f() {
        Bitmap bitmap = this.f25414A;
        if (bitmap != null) {
            bitmap.recycle();
            this.f25414A = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11311g(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f25463y == null || !this.f25440b) {
            return;
        }
        float lineLeft = (this.f25433T.getLineLeft(0) + this.f25455q) - (this.f25436W * 2.0f);
        this.f25419F.setTextSize(this.f25416C);
        float f = this.f25455q;
        float f2 = this.f25456r;
        float f3 = this.f25415B;
        if (f3 != 1.0f) {
            canvas.scale(f3, f3, f, f2);
        }
        if (this.f25438Y > 1 && !this.f25464z) {
            int alpha = this.f25419F.getAlpha();
            canvas.translate(lineLeft, f2);
            float f4 = alpha;
            this.f25419F.setAlpha((int) (this.f25435V * f4));
            this.f25433T.draw(canvas);
            this.f25419F.setAlpha((int) (this.f25434U * f4));
            int lineBaseline = this.f25433T.getLineBaseline(0);
            CharSequence charSequence = this.f25437X;
            float f5 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.f25419F);
            String strTrim = this.f25437X.toString().trim();
            if (strTrim.endsWith("…")) {
                strTrim = strTrim.substring(0, strTrim.length() - 1);
            }
            String str = strTrim;
            this.f25419F.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f25433T.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.f25419F);
        } else {
            canvas.translate(f, f2);
            this.f25433T.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: h */
    public float m11312h() {
        TextPaint textPaint = this.f25420G;
        textPaint.setTextSize(this.f25448j);
        textPaint.setTypeface(this.f25457s);
        textPaint.setLetterSpacing(this.f25431R);
        return -this.f25420G.ascent();
    }

    /* JADX INFO: renamed from: i */
    public int m11313i() {
        return m11314j(this.f25450l);
    }

    /* JADX INFO: renamed from: j */
    public final int m11314j(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f25417D;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: l */
    public void m11315l() {
        this.f25440b = this.f25443e.width() > 0 && this.f25443e.height() > 0 && this.f25442d.width() > 0 && this.f25442d.height() > 0;
    }

    /* JADX INFO: renamed from: m */
    public void m11316m() {
        StaticLayout staticLayout;
        if (this.f25439a.getHeight() <= 0 || this.f25439a.getWidth() <= 0) {
            return;
        }
        float f = this.f25416C;
        m11309e(this.f25448j);
        CharSequence charSequence = this.f25463y;
        if (charSequence != null && (staticLayout = this.f25433T) != null) {
            this.f25437X = TextUtils.ellipsize(charSequence, this.f25419F, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f25437X;
        float fMeasureText = charSequence2 != null ? this.f25419F.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f25446h, this.f25464z ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.f25452n = this.f25443e.top;
        } else if (i != 80) {
            this.f25452n = this.f25443e.centerY() - ((this.f25419F.descent() - this.f25419F.ascent()) / 2.0f);
        } else {
            this.f25452n = this.f25419F.ascent() + this.f25443e.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f25454p = this.f25443e.centerX() - (fMeasureText / 2.0f);
        } else if (i2 != 5) {
            this.f25454p = this.f25443e.left;
        } else {
            this.f25454p = this.f25443e.right - fMeasureText;
        }
        m11309e(this.f25447i);
        StaticLayout staticLayout2 = this.f25433T;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f25463y;
        float fMeasureText2 = charSequence3 != null ? this.f25419F.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.f25433T;
        if (staticLayout3 != null && this.f25438Y > 1 && !this.f25464z) {
            fMeasureText2 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f25433T;
        this.f25436W = staticLayout4 != null ? staticLayout4.getLineLeft(0) : 0.0f;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f25445g, this.f25464z ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.f25451m = this.f25442d.top;
        } else if (i3 != 80) {
            this.f25451m = this.f25442d.centerY() - (height / 2.0f);
        } else {
            this.f25451m = this.f25419F.descent() + (this.f25442d.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f25453o = this.f25442d.centerX() - (fMeasureText2 / 2.0f);
        } else if (i4 != 5) {
            this.f25453o = this.f25442d.left;
        } else {
            this.f25453o = this.f25442d.right - fMeasureText2;
        }
        m11310f();
        m11326x(f);
        m11308d(this.f25441c);
    }

    /* JADX INFO: renamed from: o */
    public void m11317o(int i) {
        TextAppearance textAppearance = new TextAppearance(this.f25439a.getContext(), i);
        ColorStateList colorStateList = textAppearance.f25523a;
        if (colorStateList != null) {
            this.f25450l = colorStateList;
        }
        float f = textAppearance.f25533k;
        if (f != 0.0f) {
            this.f25448j = f;
        }
        ColorStateList colorStateList2 = textAppearance.f25524b;
        if (colorStateList2 != null) {
            this.f25426M = colorStateList2;
        }
        this.f25424K = textAppearance.f25528f;
        this.f25425L = textAppearance.f25529g;
        this.f25423J = textAppearance.f25530h;
        this.f25431R = textAppearance.f25532j;
        CancelableFontCallback cancelableFontCallback = this.f25461w;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f25522c = true;
        }
        a aVar = new a();
        textAppearance.m11352a();
        this.f25461w = new CancelableFontCallback(aVar, textAppearance.f25536n);
        textAppearance.m11353b(this.f25439a.getContext(), this.f25461w);
        m11316m();
    }

    /* JADX INFO: renamed from: p */
    public void m11318p(ColorStateList colorStateList) {
        if (this.f25450l != colorStateList) {
            this.f25450l = colorStateList;
            m11316m();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11319q(int i) {
        if (this.f25446h != i) {
            this.f25446h = i;
            m11316m();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m11320r(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.f25461w;
        boolean z = true;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f25522c = true;
        }
        if (this.f25457s != typeface) {
            this.f25457s = typeface;
        } else {
            z = false;
        }
        if (z) {
            m11316m();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m11321s(int i) {
        TextAppearance textAppearance = new TextAppearance(this.f25439a.getContext(), i);
        ColorStateList colorStateList = textAppearance.f25523a;
        if (colorStateList != null) {
            this.f25449k = colorStateList;
        }
        float f = textAppearance.f25533k;
        if (f != 0.0f) {
            this.f25447i = f;
        }
        ColorStateList colorStateList2 = textAppearance.f25524b;
        if (colorStateList2 != null) {
            this.f25430Q = colorStateList2;
        }
        this.f25428O = textAppearance.f25528f;
        this.f25429P = textAppearance.f25529g;
        this.f25427N = textAppearance.f25530h;
        this.f25432S = textAppearance.f25532j;
        CancelableFontCallback cancelableFontCallback = this.f25460v;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f25522c = true;
        }
        b bVar = new b();
        textAppearance.m11352a();
        this.f25460v = new CancelableFontCallback(bVar, textAppearance.f25536n);
        textAppearance.m11353b(this.f25439a.getContext(), this.f25460v);
        m11316m();
    }

    /* JADX INFO: renamed from: t */
    public void m11322t(ColorStateList colorStateList) {
        if (this.f25449k != colorStateList) {
            this.f25449k = colorStateList;
            m11316m();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m11323u(int i) {
        if (this.f25445g != i) {
            this.f25445g = i;
            m11316m();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m11324v(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.f25460v;
        boolean z = true;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f25522c = true;
        }
        if (this.f25458t != typeface) {
            this.f25458t = typeface;
        } else {
            z = false;
        }
        if (z) {
            m11316m();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m11325w(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f25441c) {
            this.f25441c = f;
            m11308d(f);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11326x(float f) {
        m11309e(f);
        View view = this.f25439a;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m11327y(int[] iArr) {
        ColorStateList colorStateList;
        this.f25417D = iArr;
        ColorStateList colorStateList2 = this.f25450l;
        if (!((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f25449k) != null && colorStateList.isStateful()))) {
            return false;
        }
        m11316m();
        return true;
    }

    /* JADX INFO: renamed from: z */
    public void m11328z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f25462x, charSequence)) {
            this.f25462x = charSequence;
            this.f25463y = null;
            m11310f();
            m11316m();
        }
    }
}
