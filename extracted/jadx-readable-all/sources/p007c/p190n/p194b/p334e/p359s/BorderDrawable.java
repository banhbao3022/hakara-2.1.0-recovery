package p007c.p190n.p194b.p334e.p359s;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearancePathProvider;
import p636z0.p725k.p729e.ColorUtils;

/* JADX INFO: renamed from: c.n.b.e.s.c, reason: use source file name */
/* JADX INFO: compiled from: BorderDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class BorderDrawable extends Drawable {

    /* JADX INFO: renamed from: b */
    public final Paint f25338b;

    /* JADX INFO: renamed from: h */
    public float f25344h;

    /* JADX INFO: renamed from: i */
    public int f25345i;

    /* JADX INFO: renamed from: j */
    public int f25346j;

    /* JADX INFO: renamed from: k */
    public int f25347k;

    /* JADX INFO: renamed from: l */
    public int f25348l;

    /* JADX INFO: renamed from: m */
    public int f25349m;

    /* JADX INFO: renamed from: o */
    public ShapeAppearanceModel f25351o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f25352p;

    /* JADX INFO: renamed from: a */
    public final ShapeAppearancePathProvider f25337a = ShapeAppearancePathProvider.a.f25655a;

    /* JADX INFO: renamed from: c */
    public final Path f25339c = new Path();

    /* JADX INFO: renamed from: d */
    public final Rect f25340d = new Rect();

    /* JADX INFO: renamed from: e */
    public final RectF f25341e = new RectF();

    /* JADX INFO: renamed from: f */
    public final RectF f25342f = new RectF();

    /* JADX INFO: renamed from: g */
    public final b f25343g = new b(null);

    /* JADX INFO: renamed from: n */
    public boolean f25350n = true;

    /* JADX INFO: renamed from: c.n.b.e.s.c$b */
    /* JADX INFO: compiled from: BorderDrawable.java */
    public class b extends Drawable.ConstantState {
        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return BorderDrawable.this;
        }
    }

    public BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this.f25351o = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.f25338b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: a */
    public RectF m11269a() {
        this.f25342f.set(getBounds());
        return this.f25342f;
    }

    /* JADX INFO: renamed from: b */
    public void m11270b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f25349m = colorStateList.getColorForState(getState(), this.f25349m);
        }
        this.f25352p = colorStateList;
        this.f25350n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f25350n) {
            Paint paint = this.f25338b;
            Rect rect = this.f25340d;
            copyBounds(rect);
            float fHeight = this.f25344h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{ColorUtils.m16163b(this.f25345i, this.f25349m), ColorUtils.m16163b(this.f25346j, this.f25349m), ColorUtils.m16163b(ColorUtils.m16165d(this.f25346j, 0), this.f25349m), ColorUtils.m16163b(ColorUtils.m16165d(this.f25348l, 0), this.f25349m), ColorUtils.m16163b(this.f25348l, this.f25349m), ColorUtils.m16163b(this.f25347k, this.f25349m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f25350n = false;
        }
        float strokeWidth = this.f25338b.getStrokeWidth() / 2.0f;
        copyBounds(this.f25340d);
        this.f25341e.set(this.f25340d);
        float fMin = Math.min(this.f25351o.f25623f.mo11363a(m11269a()), this.f25341e.width() / 2.0f);
        if (this.f25351o.m11395e(m11269a())) {
            this.f25341e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f25341e, fMin, fMin, this.f25338b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f25343g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f25344h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f25351o.m11395e(m11269a())) {
            outline.setRoundRect(getBounds(), this.f25351o.f25623f.mo11363a(m11269a()));
            return;
        }
        copyBounds(this.f25340d);
        this.f25341e.set(this.f25340d);
        this.f25337a.m11404a(this.f25351o, 1.0f, this.f25341e, null, this.f25339c);
        if (this.f25339c.isConvex()) {
            outline.setConvexPath(this.f25339c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f25351o.m11395e(m11269a())) {
            return true;
        }
        int iRound = Math.round(this.f25344h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f25352p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f25350n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f25352p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f25349m)) != this.f25349m) {
            this.f25350n = true;
            this.f25349m = colorForState;
        }
        if (this.f25350n) {
            invalidateSelf();
        }
        return this.f25350n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f25338b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25338b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
