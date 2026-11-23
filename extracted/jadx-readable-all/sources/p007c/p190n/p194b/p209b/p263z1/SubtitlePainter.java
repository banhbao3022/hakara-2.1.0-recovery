package p007c.p190n.p194b.p209b.p263z1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.b.z1.h, reason: use source file name */
/* JADX INFO: compiled from: SubtitlePainter.java */
/* JADX INFO: loaded from: classes.dex */
public final class SubtitlePainter {

    /* JADX INFO: renamed from: A */
    public int f10397A;

    /* JADX INFO: renamed from: B */
    public int f10398B;

    /* JADX INFO: renamed from: C */
    public int f10399C;

    /* JADX INFO: renamed from: D */
    public int f10400D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f10401E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f10402F;

    /* JADX INFO: renamed from: G */
    public int f10403G;

    /* JADX INFO: renamed from: H */
    public int f10404H;

    /* JADX INFO: renamed from: I */
    public int f10405I;

    /* JADX INFO: renamed from: J */
    public Rect f10406J;

    /* JADX INFO: renamed from: a */
    public final float f10407a;

    /* JADX INFO: renamed from: b */
    public final float f10408b;

    /* JADX INFO: renamed from: c */
    public final float f10409c;

    /* JADX INFO: renamed from: d */
    public final float f10410d;

    /* JADX INFO: renamed from: e */
    public final float f10411e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f10412f;

    /* JADX INFO: renamed from: g */
    public final Paint f10413g;

    /* JADX INFO: renamed from: h */
    public final Paint f10414h;

    /* JADX INFO: renamed from: i */
    public CharSequence f10415i;

    /* JADX INFO: renamed from: j */
    public Layout.Alignment f10416j;

    /* JADX INFO: renamed from: k */
    public Bitmap f10417k;

    /* JADX INFO: renamed from: l */
    public float f10418l;

    /* JADX INFO: renamed from: m */
    public int f10419m;

    /* JADX INFO: renamed from: n */
    public int f10420n;

    /* JADX INFO: renamed from: o */
    public float f10421o;

    /* JADX INFO: renamed from: p */
    public int f10422p;

    /* JADX INFO: renamed from: q */
    public float f10423q;

    /* JADX INFO: renamed from: r */
    public float f10424r;

    /* JADX INFO: renamed from: s */
    public int f10425s;

    /* JADX INFO: renamed from: t */
    public int f10426t;

    /* JADX INFO: renamed from: u */
    public int f10427u;

    /* JADX INFO: renamed from: v */
    public int f10428v;

    /* JADX INFO: renamed from: w */
    public int f10429w;

    /* JADX INFO: renamed from: x */
    public float f10430x;

    /* JADX INFO: renamed from: y */
    public float f10431y;

    /* JADX INFO: renamed from: z */
    public float f10432z;

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f10411e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10410d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f10407a = fRound;
        this.f10408b = fRound;
        this.f10409c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f10412f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f10413g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f10414h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m4592a(Canvas canvas, boolean z) {
        if (!z) {
            Objects.requireNonNull(this.f10406J);
            Objects.requireNonNull(this.f10417k);
            canvas.drawBitmap(this.f10417k, (Rect) null, this.f10406J, this.f10414h);
            return;
        }
        StaticLayout staticLayout = this.f10401E;
        StaticLayout staticLayout2 = this.f10402F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f10403G, this.f10404H);
        if (Color.alpha(this.f10427u) > 0) {
            this.f10413g.setColor(this.f10427u);
            canvas.drawRect(-this.f10405I, 0.0f, staticLayout.getWidth() + this.f10405I, staticLayout.getHeight(), this.f10413g);
        }
        int i = this.f10429w;
        if (i == 1) {
            this.f10412f.setStrokeJoin(Paint.Join.ROUND);
            this.f10412f.setStrokeWidth(this.f10407a);
            this.f10412f.setColor(this.f10428v);
            this.f10412f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.f10412f;
            float f = this.f10408b;
            float f2 = this.f10409c;
            textPaint.setShadowLayer(f, f2, f2, this.f10428v);
        } else if (i == 3 || i == 4) {
            boolean z2 = i == 3;
            int i2 = z2 ? -1 : this.f10428v;
            int i3 = z2 ? this.f10428v : -1;
            float f3 = this.f10408b / 2.0f;
            this.f10412f.setColor(this.f10425s);
            this.f10412f.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.f10412f.setShadowLayer(this.f10408b, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.f10412f.setShadowLayer(this.f10408b, f3, f3, i3);
        }
        this.f10412f.setColor(this.f10425s);
        this.f10412f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f10412f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }
}
