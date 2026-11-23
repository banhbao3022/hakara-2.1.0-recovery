package p007c.p190n.p194b.p334e.p365y;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p364x.ShadowRenderer;
import p636z0.p725k.p729e.ColorUtils;
import p636z0.p725k.p729e.p730l.TintAwareDrawable;

/* JADX INFO: renamed from: c.n.b.e.y.g, reason: use source file name */
/* JADX INFO: compiled from: MaterialShapeDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {

    /* JADX INFO: renamed from: f */
    public static final String f25569f = MaterialShapeDrawable.class.getSimpleName();

    /* JADX INFO: renamed from: g */
    public static final Paint f25570g = new Paint(1);

    /* JADX INFO: renamed from: A */
    public PorterDuffColorFilter f25571A;

    /* JADX INFO: renamed from: B */
    public final RectF f25572B;

    /* JADX INFO: renamed from: C */
    public boolean f25573C;

    /* JADX INFO: renamed from: h */
    public b f25574h;

    /* JADX INFO: renamed from: i */
    public final ShapePath3.f[] f25575i;

    /* JADX INFO: renamed from: j */
    public final ShapePath3.f[] f25576j;

    /* JADX INFO: renamed from: k */
    public final BitSet f25577k;

    /* JADX INFO: renamed from: l */
    public boolean f25578l;

    /* JADX INFO: renamed from: m */
    public final Matrix f25579m;

    /* JADX INFO: renamed from: n */
    public final Path f25580n;

    /* JADX INFO: renamed from: o */
    public final Path f25581o;

    /* JADX INFO: renamed from: p */
    public final RectF f25582p;

    /* JADX INFO: renamed from: q */
    public final RectF f25583q;

    /* JADX INFO: renamed from: r */
    public final Region f25584r;

    /* JADX INFO: renamed from: s */
    public final Region f25585s;

    /* JADX INFO: renamed from: t */
    public ShapeAppearanceModel f25586t;

    /* JADX INFO: renamed from: u */
    public final Paint f25587u;

    /* JADX INFO: renamed from: v */
    public final Paint f25588v;

    /* JADX INFO: renamed from: w */
    public final ShadowRenderer f25589w;

    /* JADX INFO: renamed from: x */
    public final ShapeAppearancePathProvider.b f25590x;

    /* JADX INFO: renamed from: y */
    public final ShapeAppearancePathProvider f25591y;

    /* JADX INFO: renamed from: z */
    public PorterDuffColorFilter f25592z;

    /* JADX INFO: renamed from: c.n.b.e.y.g$a */
    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public class a implements ShapeAppearancePathProvider.b {
        public a() {
        }
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    /* JADX INFO: renamed from: A */
    public final void m11365A() {
        b bVar = this.f25574h;
        float f = bVar.f25608o + bVar.f25609p;
        bVar.f25611r = (int) Math.ceil(0.75f * f);
        this.f25574h.f25612s = (int) Math.ceil(f * 0.25f);
        m11390z();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public final void m11366b(RectF rectF, Path path) {
        m11367c(rectF, path);
        if (this.f25574h.f25603j != 1.0f) {
            this.f25579m.reset();
            Matrix matrix = this.f25579m;
            float f = this.f25574h.f25603j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f25579m);
        }
        path.computeBounds(this.f25572B, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m11367c(RectF rectF, Path path) {
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.f25591y;
        b bVar = this.f25574h;
        shapeAppearancePathProvider.m11404a(bVar.f25594a, bVar.f25604k, rectF, this.f25590x, path);
    }

    /* JADX INFO: renamed from: d */
    public final PorterDuffColorFilter m11368d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iM11369e;
        if (colorStateList == null || mode == null) {
            return (!z || (iM11369e = m11369e((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iM11369e, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m11369e(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        this.f25587u.setColorFilter(this.f25592z);
        int alpha = this.f25587u.getAlpha();
        Paint paint = this.f25587u;
        int i = this.f25574h.f25606m;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        this.f25588v.setColorFilter(this.f25571A);
        this.f25588v.setStrokeWidth(this.f25574h.f25605l);
        int alpha2 = this.f25588v.getAlpha();
        Paint paint2 = this.f25588v;
        int i2 = this.f25574h.f25606m;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        if (this.f25578l) {
            float f = -m11375k();
            ShapeAppearanceModel shapeAppearanceModel = this.f25574h.f25594a;
            Objects.requireNonNull(shapeAppearanceModel);
            ShapeAppearanceModel.b bVar = new ShapeAppearanceModel.b(shapeAppearanceModel);
            CornerSize adjustedCornerSize = shapeAppearanceModel.f25623f;
            if (!(adjustedCornerSize instanceof RelativeCornerSize)) {
                adjustedCornerSize = new AdjustedCornerSize(f, adjustedCornerSize);
            }
            bVar.f25635e = adjustedCornerSize;
            CornerSize adjustedCornerSize2 = shapeAppearanceModel.f25624g;
            if (!(adjustedCornerSize2 instanceof RelativeCornerSize)) {
                adjustedCornerSize2 = new AdjustedCornerSize(f, adjustedCornerSize2);
            }
            bVar.f25636f = adjustedCornerSize2;
            CornerSize adjustedCornerSize3 = shapeAppearanceModel.f25626i;
            if (!(adjustedCornerSize3 instanceof RelativeCornerSize)) {
                adjustedCornerSize3 = new AdjustedCornerSize(f, adjustedCornerSize3);
            }
            bVar.f25638h = adjustedCornerSize3;
            CornerSize adjustedCornerSize4 = shapeAppearanceModel.f25625h;
            if (!(adjustedCornerSize4 instanceof RelativeCornerSize)) {
                adjustedCornerSize4 = new AdjustedCornerSize(f, adjustedCornerSize4);
            }
            bVar.f25637g = adjustedCornerSize4;
            ShapeAppearanceModel shapeAppearanceModelM11398a = bVar.m11398a();
            this.f25586t = shapeAppearanceModelM11398a;
            ShapeAppearancePathProvider shapeAppearancePathProvider = this.f25591y;
            float f2 = this.f25574h.f25604k;
            this.f25583q.set(m11372h());
            float fM11375k = m11375k();
            this.f25583q.inset(fM11375k, fM11375k);
            shapeAppearancePathProvider.m11404a(shapeAppearanceModelM11398a, f2, this.f25583q, null, this.f25581o);
            m11366b(m11372h(), this.f25580n);
            this.f25578l = false;
        }
        b bVar2 = this.f25574h;
        int i3 = bVar2.f25610q;
        if (i3 == 1 || bVar2.f25611r <= 0) {
            z = false;
        } else {
            if (i3 != 2) {
                if (!((m11379o() || this.f25580n.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true)) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            canvas.save();
            canvas.translate(m11373i(), m11374j());
            if (this.f25573C) {
                int iWidth = (int) (this.f25572B.width() - getBounds().width());
                int iHeight = (int) (this.f25572B.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(outline.m1591m(this.f25574h.f25611r, 2, (int) this.f25572B.width(), iWidth), outline.m1591m(this.f25574h.f25611r, 2, (int) this.f25572B.height(), iHeight), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.f25574h.f25611r) - iWidth;
                float f4 = (getBounds().top - this.f25574h.f25611r) - iHeight;
                canvas2.translate(-f3, -f4);
                m11370f(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                m11370f(canvas);
                canvas.restore();
            }
        }
        b bVar3 = this.f25574h;
        Paint.Style style = bVar3.f25615v;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m11371g(canvas, this.f25587u, this.f25580n, bVar3.f25594a, m11372h());
        }
        if (m11377m()) {
            Paint paint3 = this.f25588v;
            Path path = this.f25581o;
            ShapeAppearanceModel shapeAppearanceModel2 = this.f25586t;
            this.f25583q.set(m11372h());
            float fM11375k2 = m11375k();
            this.f25583q.inset(fM11375k2, fM11375k2);
            m11371g(canvas, paint3, path, shapeAppearanceModel2, this.f25583q);
        }
        this.f25587u.setAlpha(alpha);
        this.f25588v.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public int m11369e(int i) {
        b bVar = this.f25574h;
        float f = bVar.f25608o + bVar.f25609p + bVar.f25607n;
        ElevationOverlayProvider elevationOverlayProvider = bVar.f25595b;
        if (elevationOverlayProvider == null || !elevationOverlayProvider.f25322a) {
            return i;
        }
        if (!(ColorUtils.m16165d(i, 255) == elevationOverlayProvider.f25324c)) {
            return i;
        }
        float f2 = elevationOverlayProvider.f25325d;
        float fMin = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            fMin = Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return ColorUtils.m16165d(C4799a.m10989g0(ColorUtils.m16165d(i, 255), elevationOverlayProvider.f25323b, fMin), Color.alpha(i));
    }

    /* JADX INFO: renamed from: f */
    public final void m11370f(Canvas canvas) {
        if (this.f25577k.cardinality() > 0) {
            Log.w(f25569f, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f25574h.f25612s != 0) {
            canvas.drawPath(this.f25580n, this.f25589w.f25557e);
        }
        for (int i = 0; i < 4; i++) {
            ShapePath3.f fVar = this.f25575i[i];
            ShadowRenderer shadowRenderer = this.f25589w;
            int i2 = this.f25574h.f25611r;
            Matrix matrix = ShapePath3.f.f25680a;
            fVar.mo11406a(matrix, shadowRenderer, i2, canvas);
            this.f25576j[i].mo11406a(matrix, this.f25589w, this.f25574h.f25611r, canvas);
        }
        if (this.f25573C) {
            int iM11373i = m11373i();
            int iM11374j = m11374j();
            canvas.translate(-iM11373i, -iM11374j);
            canvas.drawPath(this.f25580n, f25570g);
            canvas.translate(iM11373i, iM11374j);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11371g(Canvas canvas, Paint paint, Path path, ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        if (!shapeAppearanceModel.m11395e(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo11363a = shapeAppearanceModel.f25624g.mo11363a(rectF) * this.f25574h.f25604k;
            canvas.drawRoundRect(rectF, fMo11363a, fMo11363a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f25574h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f25574h.f25610q == 2) {
            return;
        }
        if (m11379o()) {
            outline.setRoundRect(getBounds(), m11376l() * this.f25574h.f25604k);
            return;
        }
        m11366b(m11372h(), this.f25580n);
        if (this.f25580n.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f25580n);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f25574h.f25602i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f25584r.set(getBounds());
        m11366b(m11372h(), this.f25580n);
        this.f25585s.setPath(this.f25580n, this.f25584r);
        this.f25584r.op(this.f25585s, Region.Op.DIFFERENCE);
        return this.f25584r;
    }

    /* JADX INFO: renamed from: h */
    public RectF m11372h() {
        this.f25582p.set(getBounds());
        return this.f25582p;
    }

    /* JADX INFO: renamed from: i */
    public int m11373i() {
        b bVar = this.f25574h;
        return (int) (Math.sin(Math.toRadians(bVar.f25613t)) * ((double) bVar.f25612s));
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f25578l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f25574h.f25600g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f25574h.f25599f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f25574h.f25598e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f25574h.f25597d) != null && colorStateList4.isStateful())));
    }

    /* JADX INFO: renamed from: j */
    public int m11374j() {
        b bVar = this.f25574h;
        return (int) (Math.cos(Math.toRadians(bVar.f25613t)) * ((double) bVar.f25612s));
    }

    /* JADX INFO: renamed from: k */
    public final float m11375k() {
        if (m11377m()) {
            return this.f25588v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: l */
    public float m11376l() {
        return this.f25574h.f25594a.f25623f.mo11363a(m11372h());
    }

    /* JADX INFO: renamed from: m */
    public final boolean m11377m() {
        Paint.Style style = this.f25574h.f25615v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f25588v.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f25574h = new b(this.f25574h);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public void m11378n(Context context) {
        this.f25574h.f25595b = new ElevationOverlayProvider(context);
        m11365A();
    }

    /* JADX INFO: renamed from: o */
    public boolean m11379o() {
        return this.f25574h.f25594a.m11395e(m11372h());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f25578l = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p007c.p190n.p194b.p334e.p360t.TextDrawableHelper.b
    public boolean onStateChange(int[] iArr) {
        boolean z = m11389y(iArr) || m11390z();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public void m11380p(float f) {
        b bVar = this.f25574h;
        if (bVar.f25608o != f) {
            bVar.f25608o = f;
            m11365A();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11381q(ColorStateList colorStateList) {
        b bVar = this.f25574h;
        if (bVar.f25597d != colorStateList) {
            bVar.f25597d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: r */
    public void m11382r(float f) {
        b bVar = this.f25574h;
        if (bVar.f25604k != f) {
            bVar.f25604k = f;
            this.f25578l = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m11383s(Paint.Style style) {
        this.f25574h.f25615v = style;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.f25574h;
        if (bVar.f25606m != i) {
            bVar.f25606m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25574h.f25596c = colorFilter;
        super.invalidateSelf();
    }

    @Override // p007c.p190n.p194b.p334e.p365y.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.f25574h.f25594a = shapeAppearanceModel;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f25574h.f25600g = colorStateList;
        m11390z();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f25574h;
        if (bVar.f25601h != mode) {
            bVar.f25601h = mode;
            m11390z();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m11384t(int i) {
        this.f25589w.m11362a(i);
        this.f25574h.f25614u = false;
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: u */
    public void m11385u(int i) {
        b bVar = this.f25574h;
        if (bVar.f25610q != i) {
            bVar.f25610q = i;
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m11386v(float f, int i) {
        this.f25574h.f25605l = f;
        invalidateSelf();
        m11388x(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: w */
    public void m11387w(float f, ColorStateList colorStateList) {
        this.f25574h.f25605l = f;
        invalidateSelf();
        m11388x(colorStateList);
    }

    /* JADX INFO: renamed from: x */
    public void m11388x(ColorStateList colorStateList) {
        b bVar = this.f25574h;
        if (bVar.f25598e != colorStateList) {
            bVar.f25598e = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m11389y(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f25574h.f25597d == null || color2 == (colorForState2 = this.f25574h.f25597d.getColorForState(iArr, (color2 = this.f25587u.getColor())))) {
            z = false;
        } else {
            this.f25587u.setColor(colorForState2);
            z = true;
        }
        if (this.f25574h.f25598e == null || color == (colorForState = this.f25574h.f25598e.getColorForState(iArr, (color = this.f25588v.getColor())))) {
            return z;
        }
        this.f25588v.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m11390z() {
        PorterDuffColorFilter porterDuffColorFilter = this.f25592z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f25571A;
        b bVar = this.f25574h;
        this.f25592z = m11368d(bVar.f25600g, bVar.f25601h, this.f25587u, true);
        b bVar2 = this.f25574h;
        this.f25571A = m11368d(bVar2.f25599f, bVar2.f25601h, this.f25588v, false);
        b bVar3 = this.f25574h;
        if (bVar3.f25614u) {
            this.f25589w.m11362a(bVar3.f25600g.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.f25592z) && Objects.equals(porterDuffColorFilter2, this.f25571A)) ? false : true;
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        this(ShapeAppearanceModel.m11392b(context, attributeSet, i, i2).m11398a());
    }

    @Deprecated
    public MaterialShapeDrawable(ShapePathModel shapePathModel) {
        this((ShapeAppearanceModel) shapePathModel);
    }

    public MaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this(new b(shapeAppearanceModel, null));
    }

    public MaterialShapeDrawable(b bVar) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.f25575i = new ShapePath3.f[4];
        this.f25576j = new ShapePath3.f[4];
        this.f25577k = new BitSet(8);
        this.f25579m = new Matrix();
        this.f25580n = new Path();
        this.f25581o = new Path();
        this.f25582p = new RectF();
        this.f25583q = new RectF();
        this.f25584r = new Region();
        this.f25585s = new Region();
        Paint paint = new Paint(1);
        this.f25587u = paint;
        Paint paint2 = new Paint(1);
        this.f25588v = paint2;
        this.f25589w = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.a.f25655a;
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.f25591y = shapeAppearancePathProvider;
        this.f25572B = new RectF();
        this.f25573C = true;
        this.f25574h = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f25570g;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m11390z();
        m11389y(getState());
        this.f25590x = new a();
    }

    /* JADX INFO: renamed from: c.n.b.e.y.g$b */
    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public ShapeAppearanceModel f25594a;

        /* JADX INFO: renamed from: b */
        public ElevationOverlayProvider f25595b;

        /* JADX INFO: renamed from: c */
        public ColorFilter f25596c;

        /* JADX INFO: renamed from: d */
        public ColorStateList f25597d;

        /* JADX INFO: renamed from: e */
        public ColorStateList f25598e;

        /* JADX INFO: renamed from: f */
        public ColorStateList f25599f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f25600g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f25601h;

        /* JADX INFO: renamed from: i */
        public Rect f25602i;

        /* JADX INFO: renamed from: j */
        public float f25603j;

        /* JADX INFO: renamed from: k */
        public float f25604k;

        /* JADX INFO: renamed from: l */
        public float f25605l;

        /* JADX INFO: renamed from: m */
        public int f25606m;

        /* JADX INFO: renamed from: n */
        public float f25607n;

        /* JADX INFO: renamed from: o */
        public float f25608o;

        /* JADX INFO: renamed from: p */
        public float f25609p;

        /* JADX INFO: renamed from: q */
        public int f25610q;

        /* JADX INFO: renamed from: r */
        public int f25611r;

        /* JADX INFO: renamed from: s */
        public int f25612s;

        /* JADX INFO: renamed from: t */
        public int f25613t;

        /* JADX INFO: renamed from: u */
        public boolean f25614u;

        /* JADX INFO: renamed from: v */
        public Paint.Style f25615v;

        public b(ShapeAppearanceModel shapeAppearanceModel, ElevationOverlayProvider elevationOverlayProvider) {
            this.f25597d = null;
            this.f25598e = null;
            this.f25599f = null;
            this.f25600g = null;
            this.f25601h = PorterDuff.Mode.SRC_IN;
            this.f25602i = null;
            this.f25603j = 1.0f;
            this.f25604k = 1.0f;
            this.f25606m = 255;
            this.f25607n = 0.0f;
            this.f25608o = 0.0f;
            this.f25609p = 0.0f;
            this.f25610q = 0;
            this.f25611r = 0;
            this.f25612s = 0;
            this.f25613t = 0;
            this.f25614u = false;
            this.f25615v = Paint.Style.FILL_AND_STROKE;
            this.f25594a = shapeAppearanceModel;
            this.f25595b = elevationOverlayProvider;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f25578l = true;
            return materialShapeDrawable;
        }

        public b(b bVar) {
            this.f25597d = null;
            this.f25598e = null;
            this.f25599f = null;
            this.f25600g = null;
            this.f25601h = PorterDuff.Mode.SRC_IN;
            this.f25602i = null;
            this.f25603j = 1.0f;
            this.f25604k = 1.0f;
            this.f25606m = 255;
            this.f25607n = 0.0f;
            this.f25608o = 0.0f;
            this.f25609p = 0.0f;
            this.f25610q = 0;
            this.f25611r = 0;
            this.f25612s = 0;
            this.f25613t = 0;
            this.f25614u = false;
            this.f25615v = Paint.Style.FILL_AND_STROKE;
            this.f25594a = bVar.f25594a;
            this.f25595b = bVar.f25595b;
            this.f25605l = bVar.f25605l;
            this.f25596c = bVar.f25596c;
            this.f25597d = bVar.f25597d;
            this.f25598e = bVar.f25598e;
            this.f25601h = bVar.f25601h;
            this.f25600g = bVar.f25600g;
            this.f25606m = bVar.f25606m;
            this.f25603j = bVar.f25603j;
            this.f25612s = bVar.f25612s;
            this.f25610q = bVar.f25610q;
            this.f25614u = bVar.f25614u;
            this.f25604k = bVar.f25604k;
            this.f25607n = bVar.f25607n;
            this.f25608o = bVar.f25608o;
            this.f25609p = bVar.f25609p;
            this.f25611r = bVar.f25611r;
            this.f25613t = bVar.f25613t;
            this.f25599f = bVar.f25599f;
            this.f25615v = bVar.f25615v;
            if (bVar.f25602i != null) {
                this.f25602i = new Rect(bVar.f25602i);
            }
        }
    }
}
