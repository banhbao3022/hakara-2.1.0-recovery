package com.theartofdev.edmodo.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Arrays;
import java.util.Objects;
import p007c.p466p.p467a.p468a.BitmapUtils2;
import p007c.p466p.p467a.p468a.CropImageOptions;
import p007c.p466p.p467a.p468a.CropWindowHandler;
import p007c.p466p.p467a.p468a.CropWindowMoveHandler;

/* JADX INFO: loaded from: classes.dex */
public class CropOverlayView extends View {

    /* JADX INFO: renamed from: A */
    public int f29395A;

    /* JADX INFO: renamed from: B */
    public int f29396B;

    /* JADX INFO: renamed from: C */
    public float f29397C;

    /* JADX INFO: renamed from: D */
    public CropImageView.EnumC6011d f29398D;

    /* JADX INFO: renamed from: E */
    public CropImageView.EnumC6010c f29399E;

    /* JADX INFO: renamed from: F */
    public final Rect f29400F;

    /* JADX INFO: renamed from: G */
    public boolean f29401G;

    /* JADX INFO: renamed from: f */
    public ScaleGestureDetector f29402f;

    /* JADX INFO: renamed from: g */
    public boolean f29403g;

    /* JADX INFO: renamed from: h */
    public final CropWindowHandler f29404h;

    /* JADX INFO: renamed from: i */
    public InterfaceC6019b f29405i;

    /* JADX INFO: renamed from: j */
    public final RectF f29406j;

    /* JADX INFO: renamed from: k */
    public Paint f29407k;

    /* JADX INFO: renamed from: l */
    public Paint f29408l;

    /* JADX INFO: renamed from: m */
    public Paint f29409m;

    /* JADX INFO: renamed from: n */
    public Paint f29410n;

    /* JADX INFO: renamed from: o */
    public Path f29411o;

    /* JADX INFO: renamed from: p */
    public final float[] f29412p;

    /* JADX INFO: renamed from: q */
    public final RectF f29413q;

    /* JADX INFO: renamed from: r */
    public int f29414r;

    /* JADX INFO: renamed from: s */
    public int f29415s;

    /* JADX INFO: renamed from: t */
    public float f29416t;

    /* JADX INFO: renamed from: u */
    public float f29417u;

    /* JADX INFO: renamed from: v */
    public float f29418v;

    /* JADX INFO: renamed from: w */
    public float f29419w;

    /* JADX INFO: renamed from: x */
    public float f29420x;

    /* JADX INFO: renamed from: y */
    public CropWindowMoveHandler f29421y;

    /* JADX INFO: renamed from: z */
    public boolean f29422z;

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$b */
    public interface InterfaceC6019b {
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$c */
    public class C6020c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C6020c(C6018a c6018a) {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        @TargetApi(11)
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF rectFM12536e = CropOverlayView.this.f29404h.m12536e();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 >= f3 || f > f4 || f2 < 0.0f || f3 > CropOverlayView.this.f29404h.m12533b() || f < 0.0f || f4 > CropOverlayView.this.f29404h.m12532a()) {
                return true;
            }
            rectFM12536e.set(f2, f, f3, f4);
            CropOverlayView.this.f29404h.f28042a.set(rectFM12536e);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    public static Paint m12954e(float f, int i) {
        if (f <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12955a(RectF rectF) {
        float fM12519q = BitmapUtils2.m12519q(this.f29412p);
        float fM12521s = BitmapUtils2.m12521s(this.f29412p);
        float fM12520r = BitmapUtils2.m12520r(this.f29412p);
        float fM12514l = BitmapUtils2.m12514l(this.f29412p);
        if (!m12960g()) {
            this.f29413q.set(fM12519q, fM12521s, fM12520r, fM12514l);
            return false;
        }
        float[] fArr = this.f29412p;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[4];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f = fArr[6];
                f2 = fArr[7];
                f3 = fArr[2];
                f4 = fArr[3];
                f5 = fArr[4];
                f6 = fArr[5];
            } else {
                f = fArr[4];
                f2 = fArr[5];
                f3 = fArr[0];
                f4 = fArr[1];
                f5 = fArr[2];
                f6 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f = fArr[2];
            f2 = fArr[3];
            f3 = fArr[6];
            f4 = fArr[7];
            f5 = fArr[0];
            f6 = fArr[1];
        }
        float f7 = (f6 - f2) / (f5 - f);
        float f8 = (-1.0f) / f7;
        float f9 = f2 - (f7 * f);
        float f10 = f2 - (f * f8);
        float f11 = f4 - (f7 * f3);
        float f12 = f4 - (f3 * f8);
        float fCenterY = rectF.centerY() - rectF.top;
        float fCenterX = rectF.centerX();
        float f13 = rectF.left;
        float f14 = fCenterY / (fCenterX - f13);
        float f15 = -f14;
        float f16 = rectF.top;
        float f17 = f16 - (f13 * f14);
        float f18 = rectF.right;
        float f19 = f16 - (f15 * f18);
        float f20 = f7 - f14;
        float f21 = (f17 - f9) / f20;
        float fMax = Math.max(fM12519q, f21 < f18 ? f21 : fM12519q);
        float f22 = (f17 - f10) / (f8 - f14);
        if (f22 >= rectF.right) {
            f22 = fMax;
        }
        float fMax2 = Math.max(fMax, f22);
        float f23 = f8 - f15;
        float f24 = (f19 - f12) / f23;
        if (f24 >= rectF.right) {
            f24 = fMax2;
        }
        float fMax3 = Math.max(fMax2, f24);
        float f25 = (f19 - f10) / f23;
        if (f25 <= rectF.left) {
            f25 = fM12520r;
        }
        float fMin = Math.min(fM12520r, f25);
        float f26 = (f19 - f11) / (f7 - f15);
        if (f26 <= rectF.left) {
            f26 = fMin;
        }
        float fMin2 = Math.min(fMin, f26);
        float f27 = (f17 - f11) / f20;
        if (f27 <= rectF.left) {
            f27 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f27);
        float fMax4 = Math.max(fM12521s, Math.max((f7 * fMax3) + f9, (f8 * fMin3) + f10));
        float fMin4 = Math.min(fM12514l, Math.min((f8 * fMax3) + f12, (f7 * fMin3) + f11));
        RectF rectF2 = this.f29413q;
        rectF2.left = fMax3;
        rectF2.top = fMax4;
        rectF2.right = fMin3;
        rectF2.bottom = fMin4;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m12956b(boolean z) {
        try {
            InterfaceC6019b interfaceC6019b = this.f29405i;
            if (interfaceC6019b != null) {
                CropImageView.C6008a c6008a = (CropImageView.C6008a) interfaceC6019b;
                CropImageView cropImageView = CropImageView.this;
                int i = CropImageView.f29335f;
                cropImageView.m12943c(z, true);
                CropImageView cropImageView2 = CropImageView.this;
                CropImageView.InterfaceC6014g interfaceC6014g = cropImageView2.f29338C;
                if (interfaceC6014g != null && !z) {
                    interfaceC6014g.m12952a(cropImageView2.getCropRect());
                }
                CropImageView cropImageView3 = CropImageView.this;
                CropImageView.InterfaceC6013f interfaceC6013f = cropImageView3.f29339D;
                if (interfaceC6013f == null || !z) {
                    return;
                }
                interfaceC6013f.m12951a(cropImageView3.getCropRect());
            }
        } catch (Exception e) {
            Log.e("AIC", "Exception in crop window changed", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12957c(Canvas canvas) {
        if (this.f29409m != null) {
            Paint paint = this.f29407k;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF rectFM12536e = this.f29404h.m12536e();
            rectFM12536e.inset(strokeWidth, strokeWidth);
            float fWidth = rectFM12536e.width() / 3.0f;
            float fHeight = rectFM12536e.height() / 3.0f;
            if (this.f29399E != CropImageView.EnumC6010c.OVAL) {
                float f = rectFM12536e.left + fWidth;
                float f2 = rectFM12536e.right - fWidth;
                canvas.drawLine(f, rectFM12536e.top, f, rectFM12536e.bottom, this.f29409m);
                canvas.drawLine(f2, rectFM12536e.top, f2, rectFM12536e.bottom, this.f29409m);
                float f3 = rectFM12536e.top + fHeight;
                float f4 = rectFM12536e.bottom - fHeight;
                canvas.drawLine(rectFM12536e.left, f3, rectFM12536e.right, f3, this.f29409m);
                canvas.drawLine(rectFM12536e.left, f4, rectFM12536e.right, f4, this.f29409m);
                return;
            }
            float fWidth2 = (rectFM12536e.width() / 2.0f) - strokeWidth;
            float fHeight2 = (rectFM12536e.height() / 2.0f) - strokeWidth;
            float f5 = rectFM12536e.left + fWidth;
            float f6 = rectFM12536e.right - fWidth;
            float fSin = (float) (Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)) * ((double) fHeight2));
            canvas.drawLine(f5, (rectFM12536e.top + fHeight2) - fSin, f5, (rectFM12536e.bottom - fHeight2) + fSin, this.f29409m);
            canvas.drawLine(f6, (rectFM12536e.top + fHeight2) - fSin, f6, (rectFM12536e.bottom - fHeight2) + fSin, this.f29409m);
            float f7 = rectFM12536e.top + fHeight;
            float f8 = rectFM12536e.bottom - fHeight;
            float fCos = (float) (Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)) * ((double) fWidth2));
            canvas.drawLine((rectFM12536e.left + fWidth2) - fCos, f7, (rectFM12536e.right - fWidth2) + fCos, f7, this.f29409m);
            canvas.drawLine((rectFM12536e.left + fWidth2) - fCos, f8, (rectFM12536e.right - fWidth2) + fCos, f8, this.f29409m);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12958d(RectF rectF) {
        if (rectF.width() < this.f29404h.m12535d()) {
            float fM12535d = (this.f29404h.m12535d() - rectF.width()) / 2.0f;
            rectF.left -= fM12535d;
            rectF.right += fM12535d;
        }
        if (rectF.height() < this.f29404h.m12534c()) {
            float fM12534c = (this.f29404h.m12534c() - rectF.height()) / 2.0f;
            rectF.top -= fM12534c;
            rectF.bottom += fM12534c;
        }
        if (rectF.width() > this.f29404h.m12533b()) {
            float fWidth = (rectF.width() - this.f29404h.m12533b()) / 2.0f;
            rectF.left += fWidth;
            rectF.right -= fWidth;
        }
        if (rectF.height() > this.f29404h.m12532a()) {
            float fHeight = (rectF.height() - this.f29404h.m12532a()) / 2.0f;
            rectF.top += fHeight;
            rectF.bottom -= fHeight;
        }
        m12955a(rectF);
        if (this.f29413q.width() > 0.0f && this.f29413q.height() > 0.0f) {
            float fMax = Math.max(this.f29413q.left, 0.0f);
            float fMax2 = Math.max(this.f29413q.top, 0.0f);
            float fMin = Math.min(this.f29413q.right, getWidth());
            float fMin2 = Math.min(this.f29413q.bottom, getHeight());
            if (rectF.left < fMax) {
                rectF.left = fMax;
            }
            if (rectF.top < fMax2) {
                rectF.top = fMax2;
            }
            if (rectF.right > fMin) {
                rectF.right = fMin;
            }
            if (rectF.bottom > fMin2) {
                rectF.bottom = fMin2;
            }
        }
        if (!this.f29422z || Math.abs(rectF.width() - (rectF.height() * this.f29397C)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.f29397C) {
            float fAbs = Math.abs((rectF.height() * this.f29397C) - rectF.width()) / 2.0f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rectF.width() / this.f29397C) - rectF.height()) / 2.0f;
            rectF.top += fAbs2;
            rectF.bottom -= fAbs2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12959f() {
        float fMax = Math.max(BitmapUtils2.m12519q(this.f29412p), 0.0f);
        float fMax2 = Math.max(BitmapUtils2.m12521s(this.f29412p), 0.0f);
        float fMin = Math.min(BitmapUtils2.m12520r(this.f29412p), getWidth());
        float fMin2 = Math.min(BitmapUtils2.m12514l(this.f29412p), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.f29401G = true;
        float f = this.f29418v;
        float f2 = fMin - fMax;
        float f3 = f * f2;
        float f4 = fMin2 - fMax2;
        float f5 = f * f4;
        if (this.f29400F.width() > 0 && this.f29400F.height() > 0) {
            Rect rect = this.f29400F;
            float f6 = rect.left;
            CropWindowHandler cropWindowHandler = this.f29404h;
            float f7 = (f6 / cropWindowHandler.f28052k) + fMax;
            rectF.left = f7;
            rectF.top = (rect.top / cropWindowHandler.f28053l) + fMax2;
            rectF.right = (rect.width() / this.f29404h.f28052k) + f7;
            rectF.bottom = (this.f29400F.height() / this.f29404h.f28053l) + rectF.top;
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.f29422z || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f3;
            rectF.top = fMax2 + f5;
            rectF.right = fMin - f3;
            rectF.bottom = fMin2 - f5;
        } else if (f2 / f4 > this.f29397C) {
            rectF.top = fMax2 + f5;
            rectF.bottom = fMin2 - f5;
            float width = getWidth() / 2.0f;
            this.f29397C = this.f29395A / this.f29396B;
            float fMax3 = Math.max(this.f29404h.m12535d(), rectF.height() * this.f29397C) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f3;
            rectF.right = fMin - f3;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(this.f29404h.m12534c(), rectF.width() / this.f29397C) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        m12958d(rectF);
        this.f29404h.f28042a.set(rectF);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12960g() {
        float[] fArr = this.f29412p;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    public int getAspectRatioX() {
        return this.f29395A;
    }

    public int getAspectRatioY() {
        return this.f29396B;
    }

    public CropImageView.EnumC6010c getCropShape() {
        return this.f29399E;
    }

    public RectF getCropWindowRect() {
        return this.f29404h.m12536e();
    }

    public CropImageView.EnumC6011d getGuidelines() {
        return this.f29398D;
    }

    public Rect getInitialCropWindowRect() {
        return this.f29400F;
    }

    /* JADX INFO: renamed from: h */
    public void m12961h() {
        if (this.f29401G) {
            setCropWindowRect(BitmapUtils2.f27971b);
            m12959f();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m12962i(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.f29412p, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f29412p, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f29412p, 0, fArr.length);
            }
            this.f29414r = i;
            this.f29415s = i2;
            RectF rectFM12536e = this.f29404h.m12536e();
            if (rectFM12536e.width() == 0.0f || rectFM12536e.height() == 0.0f) {
                m12959f();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m12963j(boolean z) {
        if (this.f29403g == z) {
            return false;
        }
        this.f29403g = z;
        if (!z || this.f29402f != null) {
            return true;
        }
        this.f29402f = new ScaleGestureDetector(getContext(), new C6020c(null));
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectFM12536e = this.f29404h.m12536e();
        float fMax = Math.max(BitmapUtils2.m12519q(this.f29412p), 0.0f);
        float fMax2 = Math.max(BitmapUtils2.m12521s(this.f29412p), 0.0f);
        float fMin = Math.min(BitmapUtils2.m12520r(this.f29412p), getWidth());
        float fMin2 = Math.min(BitmapUtils2.m12514l(this.f29412p), getHeight());
        CropImageView.EnumC6010c enumC6010c = this.f29399E;
        CropImageView.EnumC6010c enumC6010c2 = CropImageView.EnumC6010c.RECTANGLE;
        if (enumC6010c != enumC6010c2) {
            this.f29411o.reset();
            int i = Build.VERSION.SDK_INT;
            this.f29406j.set(rectFM12536e.left, rectFM12536e.top, rectFM12536e.right, rectFM12536e.bottom);
            this.f29411o.addOval(this.f29406j, Path.Direction.CW);
            canvas.save();
            if (i >= 26) {
                canvas.clipOutPath(this.f29411o);
            } else {
                canvas.clipPath(this.f29411o, Region.Op.XOR);
            }
            canvas.drawRect(fMax, fMax2, fMin, fMin2, this.f29410n);
            canvas.restore();
        } else if (m12960g()) {
            int i2 = Build.VERSION.SDK_INT;
            this.f29411o.reset();
            Path path = this.f29411o;
            float[] fArr = this.f29412p;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.f29411o;
            float[] fArr2 = this.f29412p;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.f29411o;
            float[] fArr3 = this.f29412p;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.f29411o;
            float[] fArr4 = this.f29412p;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.f29411o.close();
            canvas.save();
            if (i2 >= 26) {
                canvas.clipOutPath(this.f29411o);
            } else {
                canvas.clipPath(this.f29411o, Region.Op.INTERSECT);
            }
            canvas.clipRect(rectFM12536e, Region.Op.XOR);
            canvas.drawRect(fMax, fMax2, fMin, fMin2, this.f29410n);
            canvas.restore();
        } else {
            canvas.drawRect(fMax, fMax2, fMin, rectFM12536e.top, this.f29410n);
            canvas.drawRect(fMax, rectFM12536e.bottom, fMin, fMin2, this.f29410n);
            canvas.drawRect(fMax, rectFM12536e.top, rectFM12536e.left, rectFM12536e.bottom, this.f29410n);
            canvas.drawRect(rectFM12536e.right, rectFM12536e.top, fMin, rectFM12536e.bottom, this.f29410n);
        }
        if (this.f29404h.m12537j()) {
            CropImageView.EnumC6011d enumC6011d = this.f29398D;
            if (enumC6011d == CropImageView.EnumC6011d.ON) {
                m12957c(canvas);
            } else if (enumC6011d == CropImageView.EnumC6011d.ON_TOUCH && this.f29421y != null) {
                m12957c(canvas);
            }
        }
        Paint paint = this.f29407k;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF rectFM12536e2 = this.f29404h.m12536e();
            float f = strokeWidth / 2.0f;
            rectFM12536e2.inset(f, f);
            if (this.f29399E == enumC6010c2) {
                canvas.drawRect(rectFM12536e2, this.f29407k);
            } else {
                canvas.drawOval(rectFM12536e2, this.f29407k);
            }
        }
        if (this.f29408l != null) {
            Paint paint2 = this.f29407k;
            float strokeWidth2 = paint2 != null ? paint2.getStrokeWidth() : 0.0f;
            float strokeWidth3 = this.f29408l.getStrokeWidth();
            float f2 = strokeWidth3 / 2.0f;
            float f3 = (this.f29399E == enumC6010c2 ? this.f29416t : 0.0f) + f2;
            RectF rectFM12536e3 = this.f29404h.m12536e();
            rectFM12536e3.inset(f3, f3);
            float f4 = (strokeWidth3 - strokeWidth2) / 2.0f;
            float f5 = f2 + f4;
            float f6 = rectFM12536e3.left - f4;
            float f7 = rectFM12536e3.top;
            canvas.drawLine(f6, f7 - f5, f6, f7 + this.f29417u, this.f29408l);
            float f8 = rectFM12536e3.left;
            float f9 = rectFM12536e3.top - f4;
            canvas.drawLine(f8 - f5, f9, f8 + this.f29417u, f9, this.f29408l);
            float f10 = rectFM12536e3.right + f4;
            float f11 = rectFM12536e3.top;
            canvas.drawLine(f10, f11 - f5, f10, f11 + this.f29417u, this.f29408l);
            float f12 = rectFM12536e3.right;
            float f13 = rectFM12536e3.top - f4;
            canvas.drawLine(f12 + f5, f13, f12 - this.f29417u, f13, this.f29408l);
            float f14 = rectFM12536e3.left - f4;
            float f15 = rectFM12536e3.bottom;
            canvas.drawLine(f14, f15 + f5, f14, f15 - this.f29417u, this.f29408l);
            float f16 = rectFM12536e3.left;
            float f17 = rectFM12536e3.bottom + f4;
            canvas.drawLine(f16 - f5, f17, f16 + this.f29417u, f17, this.f29408l);
            float f18 = rectFM12536e3.right + f4;
            float f19 = rectFM12536e3.bottom;
            canvas.drawLine(f18, f19 + f5, f18, f19 - this.f29417u, this.f29408l);
            float f20 = rectFM12536e3.right;
            float f21 = rectFM12536e3.bottom + f4;
            canvas.drawLine(f20 + f5, f21, f20 - this.f29417u, f21, this.f29408l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:130:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:138:0x0401  */
    /* JADX WARN: Code duplicated, block: B:141:0x0416  */
    /* JADX WARN: Code duplicated, block: B:144:0x042a  */
    /* JADX WARN: Code duplicated, block: B:147:0x043d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CropWindowMoveHandler.a aVar = CropWindowMoveHandler.a.CENTER;
        if (!isEnabled()) {
            return false;
        }
        if (this.f29403g) {
            this.f29402f.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            CropWindowHandler cropWindowHandler = this.f29404h;
            float f = this.f29419w;
            CropImageView.EnumC6010c enumC6010c = this.f29399E;
            CropWindowMoveHandler.a aVar2 = CropWindowMoveHandler.a.RIGHT;
            CropWindowMoveHandler.a aVar3 = CropWindowMoveHandler.a.LEFT;
            CropWindowMoveHandler.a aVar4 = CropWindowMoveHandler.a.BOTTOM;
            CropWindowMoveHandler.a aVar5 = CropWindowMoveHandler.a.TOP;
            CropWindowMoveHandler.a aVar6 = CropWindowMoveHandler.a.BOTTOM_RIGHT;
            CropWindowMoveHandler.a aVar7 = CropWindowMoveHandler.a.BOTTOM_LEFT;
            CropWindowMoveHandler.a aVar8 = CropWindowMoveHandler.a.TOP_RIGHT;
            CropWindowMoveHandler.a aVar9 = CropWindowMoveHandler.a.TOP_LEFT;
            if (enumC6010c == CropImageView.EnumC6010c.OVAL) {
                float fWidth = cropWindowHandler.f28042a.width() / 6.0f;
                RectF rectF = cropWindowHandler.f28042a;
                float f2 = rectF.left;
                float f3 = f2 + fWidth;
                float f4 = (fWidth * 5.0f) + f2;
                float fHeight = rectF.height() / 6.0f;
                float f5 = cropWindowHandler.f28042a.top;
                float f6 = f5 + fHeight;
                float f7 = (fHeight * 5.0f) + f5;
                if (x < f3) {
                    if (y < f6) {
                        aVar = aVar9;
                    } else if (y < f7) {
                        aVar = aVar3;
                    } else {
                        aVar = aVar7;
                    }
                } else if (x < f4) {
                    if (y < f6) {
                        aVar = aVar5;
                    } else if (y >= f7) {
                        aVar = aVar4;
                    }
                } else if (y < f6) {
                    aVar = aVar8;
                } else if (y < f7) {
                    aVar = aVar2;
                } else {
                    aVar = aVar6;
                }
            } else {
                RectF rectF2 = cropWindowHandler.f28042a;
                if (CropWindowHandler.m12529g(x, y, rectF2.left, rectF2.top, f)) {
                    aVar = aVar9;
                } else {
                    RectF rectF3 = cropWindowHandler.f28042a;
                    if (CropWindowHandler.m12529g(x, y, rectF3.right, rectF3.top, f)) {
                        aVar = aVar8;
                    } else {
                        RectF rectF4 = cropWindowHandler.f28042a;
                        if (CropWindowHandler.m12529g(x, y, rectF4.left, rectF4.bottom, f)) {
                            aVar = aVar7;
                        } else {
                            RectF rectF5 = cropWindowHandler.f28042a;
                            if (CropWindowHandler.m12529g(x, y, rectF5.right, rectF5.bottom, f)) {
                                aVar = aVar6;
                            } else {
                                RectF rectF6 = cropWindowHandler.f28042a;
                                if (!CropWindowHandler.m12528f(x, y, rectF6.left, rectF6.top, rectF6.right, rectF6.bottom) || !(!cropWindowHandler.m12537j())) {
                                    RectF rectF7 = cropWindowHandler.f28042a;
                                    if (CropWindowHandler.m12530h(x, y, rectF7.left, rectF7.right, rectF7.top, f)) {
                                        aVar = aVar5;
                                    } else {
                                        RectF rectF8 = cropWindowHandler.f28042a;
                                        if (CropWindowHandler.m12530h(x, y, rectF8.left, rectF8.right, rectF8.bottom, f)) {
                                            aVar = aVar4;
                                        } else {
                                            RectF rectF9 = cropWindowHandler.f28042a;
                                            if (CropWindowHandler.m12531i(x, y, rectF9.left, rectF9.top, rectF9.bottom, f)) {
                                                aVar = aVar3;
                                            } else {
                                                RectF rectF10 = cropWindowHandler.f28042a;
                                                if (CropWindowHandler.m12531i(x, y, rectF10.right, rectF10.top, rectF10.bottom, f)) {
                                                    aVar = aVar2;
                                                } else {
                                                    RectF rectF11 = cropWindowHandler.f28042a;
                                                    if (!CropWindowHandler.m12528f(x, y, rectF11.left, rectF11.top, rectF11.right, rectF11.bottom) || (!cropWindowHandler.m12537j())) {
                                                        aVar = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            CropWindowMoveHandler cropWindowMoveHandler = aVar != null ? new CropWindowMoveHandler(aVar, cropWindowHandler, x, y) : null;
            this.f29421y = cropWindowMoveHandler;
            if (cropWindowMoveHandler != null) {
                invalidate();
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (this.f29421y != null) {
                    float f8 = this.f29420x;
                    RectF rectFM12536e = this.f29404h.m12536e();
                    if (m12955a(rectFM12536e)) {
                        f8 = 0.0f;
                    }
                    CropWindowMoveHandler cropWindowMoveHandler2 = this.f29421y;
                    RectF rectF12 = this.f29413q;
                    int i = this.f29414r;
                    int i2 = this.f29415s;
                    boolean z = this.f29422z;
                    float f9 = this.f29397C;
                    PointF pointF = cropWindowMoveHandler2.f28059f;
                    float f10 = x2 + pointF.x;
                    float f11 = pointF.y + y2;
                    CropWindowMoveHandler.a aVar10 = cropWindowMoveHandler2.f28058e;
                    if (aVar10 == aVar) {
                        float fCenterX = f10 - rectFM12536e.centerX();
                        float fCenterY = f11 - rectFM12536e.centerY();
                        float f12 = rectFM12536e.left + fCenterX;
                        if (f12 >= 0.0f) {
                            float f13 = rectFM12536e.right + fCenterX;
                            if (f13 > i || f12 < rectF12.left || f13 > rectF12.right) {
                                fCenterX /= 1.05f;
                                cropWindowMoveHandler2.f28059f.x -= fCenterX / 2.0f;
                            }
                        } else {
                            fCenterX /= 1.05f;
                            cropWindowMoveHandler2.f28059f.x -= fCenterX / 2.0f;
                        }
                        float f14 = rectFM12536e.top + fCenterY;
                        if (f14 >= 0.0f) {
                            float f15 = rectFM12536e.bottom + fCenterY;
                            if (f15 > i2 || f14 < rectF12.top || f15 > rectF12.bottom) {
                                fCenterY /= 1.05f;
                                cropWindowMoveHandler2.f28059f.y -= fCenterY / 2.0f;
                            }
                        } else {
                            fCenterY /= 1.05f;
                            cropWindowMoveHandler2.f28059f.y -= fCenterY / 2.0f;
                        }
                        rectFM12536e.offset(fCenterX, fCenterY);
                        float f16 = rectFM12536e.left;
                        float f17 = rectF12.left;
                        if (f16 < f17 + f8) {
                            rectFM12536e.offset(f17 - f16, 0.0f);
                        }
                        float f18 = rectFM12536e.top;
                        float f19 = rectF12.top;
                        if (f18 < f19 + f8) {
                            rectFM12536e.offset(0.0f, f19 - f18);
                        }
                        float f20 = rectFM12536e.right;
                        float f21 = rectF12.right;
                        if (f20 > f21 - f8) {
                            rectFM12536e.offset(f21 - f20, 0.0f);
                        }
                        float f22 = rectFM12536e.bottom;
                        float f23 = rectF12.bottom;
                        if (f22 > f23 - f8) {
                            rectFM12536e.offset(0.0f, f23 - f22);
                        }
                    } else if (z) {
                        switch (aVar10.ordinal()) {
                            case 0:
                                if (CropWindowMoveHandler.m12538g(f10, f11, rectFM12536e.right, rectFM12536e.bottom) >= f9) {
                                    cropWindowMoveHandler2.m12540b(rectFM12536e, f10, rectF12, f8, f9, true, false);
                                    rectFM12536e.top = rectFM12536e.bottom - (rectFM12536e.width() / f9);
                                } else {
                                    cropWindowMoveHandler2.m12543e(rectFM12536e, f11, rectF12, f8, f9, true, false);
                                    rectFM12536e.left = rectFM12536e.right - (rectFM12536e.height() * f9);
                                }
                                break;
                            case 1:
                                if (CropWindowMoveHandler.m12538g(rectFM12536e.left, f11, f10, rectFM12536e.bottom) >= f9) {
                                    cropWindowMoveHandler2.m12542d(rectFM12536e, f10, rectF12, i, f8, f9, true, false);
                                    rectFM12536e.top = rectFM12536e.bottom - (rectFM12536e.width() / f9);
                                } else {
                                    cropWindowMoveHandler2.m12543e(rectFM12536e, f11, rectF12, f8, f9, false, true);
                                    rectFM12536e.right = (rectFM12536e.height() * f9) + rectFM12536e.left;
                                }
                                break;
                            case 2:
                                if (CropWindowMoveHandler.m12538g(f10, rectFM12536e.top, rectFM12536e.right, f11) >= f9) {
                                    cropWindowMoveHandler2.m12540b(rectFM12536e, f10, rectF12, f8, f9, false, true);
                                    rectFM12536e.bottom = (rectFM12536e.width() / f9) + rectFM12536e.top;
                                } else {
                                    cropWindowMoveHandler2.m12539a(rectFM12536e, f11, rectF12, i2, f8, f9, true, false);
                                    rectFM12536e.left = rectFM12536e.right - (rectFM12536e.height() * f9);
                                }
                                break;
                            case 3:
                                if (CropWindowMoveHandler.m12538g(rectFM12536e.left, rectFM12536e.top, f10, f11) >= f9) {
                                    cropWindowMoveHandler2.m12542d(rectFM12536e, f10, rectF12, i, f8, f9, false, true);
                                    rectFM12536e.bottom = (rectFM12536e.width() / f9) + rectFM12536e.top;
                                } else {
                                    cropWindowMoveHandler2.m12539a(rectFM12536e, f11, rectF12, i2, f8, f9, false, true);
                                    rectFM12536e.right = (rectFM12536e.height() * f9) + rectFM12536e.left;
                                }
                                break;
                            case 4:
                                cropWindowMoveHandler2.m12540b(rectFM12536e, f10, rectF12, f8, f9, true, true);
                                cropWindowMoveHandler2.m12544f(rectFM12536e, rectF12, f9);
                                break;
                            case 5:
                                cropWindowMoveHandler2.m12543e(rectFM12536e, f11, rectF12, f8, f9, true, true);
                                cropWindowMoveHandler2.m12541c(rectFM12536e, rectF12, f9);
                                break;
                            case 6:
                                cropWindowMoveHandler2.m12542d(rectFM12536e, f10, rectF12, i, f8, f9, true, true);
                                cropWindowMoveHandler2.m12544f(rectFM12536e, rectF12, f9);
                                break;
                            case 7:
                                cropWindowMoveHandler2.m12539a(rectFM12536e, f11, rectF12, i2, f8, f9, true, true);
                                cropWindowMoveHandler2.m12541c(rectFM12536e, rectF12, f9);
                                break;
                        }
                    } else {
                        switch (aVar10.ordinal()) {
                            case 0:
                                float f24 = f8;
                                cropWindowMoveHandler2.m12543e(rectFM12536e, f11, rectF12, f24, 0.0f, false, false);
                                cropWindowMoveHandler2.m12540b(rectFM12536e, f10, rectF12, f24, 0.0f, false, false);
                                break;
                            case 1:
                                cropWindowMoveHandler2.m12543e(rectFM12536e, f11, rectF12, f8, 0.0f, false, false);
                                cropWindowMoveHandler2.m12542d(rectFM12536e, f10, rectF12, i, f8, 0.0f, false, false);
                                break;
                            case 2:
                                cropWindowMoveHandler2.m12539a(rectFM12536e, f11, rectF12, i2, f8, 0.0f, false, false);
                                cropWindowMoveHandler2.m12540b(rectFM12536e, f10, rectF12, f8, 0.0f, false, false);
                                break;
                            case 3:
                                float f25 = f8;
                                cropWindowMoveHandler2.m12539a(rectFM12536e, f11, rectF12, i2, f25, 0.0f, false, false);
                                cropWindowMoveHandler2.m12542d(rectFM12536e, f10, rectF12, i, f25, 0.0f, false, false);
                                break;
                            case 4:
                                cropWindowMoveHandler2.m12540b(rectFM12536e, f10, rectF12, f8, 0.0f, false, false);
                                break;
                            case 5:
                                cropWindowMoveHandler2.m12543e(rectFM12536e, f11, rectF12, f8, 0.0f, false, false);
                                break;
                            case 6:
                                cropWindowMoveHandler2.m12542d(rectFM12536e, f10, rectF12, i, f8, 0.0f, false, false);
                                break;
                            case 7:
                                cropWindowMoveHandler2.m12539a(rectFM12536e, f11, rectF12, i2, f8, 0.0f, false, false);
                                break;
                        }
                    }
                    this.f29404h.f28042a.set(rectFM12536e);
                    m12956b(true);
                    invalidate();
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        if (this.f29421y != null) {
            this.f29421y = null;
            m12956b(false);
            invalidate();
        }
        return true;
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f29395A != i) {
            this.f29395A = i;
            this.f29397C = i / this.f29396B;
            if (this.f29401G) {
                m12959f();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f29396B != i) {
            this.f29396B = i;
            this.f29397C = this.f29395A / i;
            if (this.f29401G) {
                m12959f();
                invalidate();
            }
        }
    }

    public void setCropShape(CropImageView.EnumC6010c enumC6010c) {
        if (this.f29399E != enumC6010c) {
            this.f29399E = enumC6010c;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(InterfaceC6019b interfaceC6019b) {
        this.f29405i = interfaceC6019b;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f29404h.f28042a.set(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f29422z != z) {
            this.f29422z = z;
            if (this.f29401G) {
                m12959f();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.EnumC6011d enumC6011d) {
        if (this.f29398D != enumC6011d) {
            this.f29398D = enumC6011d;
            if (this.f29401G) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        CropWindowHandler cropWindowHandler = this.f29404h;
        Objects.requireNonNull(cropWindowHandler);
        cropWindowHandler.f28044c = cropImageOptions.f27996C;
        cropWindowHandler.f28045d = cropImageOptions.f27997D;
        cropWindowHandler.f28048g = cropImageOptions.f27998E;
        cropWindowHandler.f28049h = cropImageOptions.f27999F;
        cropWindowHandler.f28050i = cropImageOptions.f28000G;
        cropWindowHandler.f28051j = cropImageOptions.f28001H;
        setCropShape(cropImageOptions.f28021f);
        setSnapRadius(cropImageOptions.f28022g);
        setGuidelines(cropImageOptions.f28024i);
        setFixedAspectRatio(cropImageOptions.f28032q);
        setAspectRatioX(cropImageOptions.f28033r);
        setAspectRatioY(cropImageOptions.f28034s);
        m12963j(cropImageOptions.f28029n);
        this.f29419w = cropImageOptions.f28023h;
        this.f29418v = cropImageOptions.f28031p;
        this.f29407k = m12954e(cropImageOptions.f28035t, cropImageOptions.f28036u);
        this.f29416t = cropImageOptions.f28038w;
        this.f29417u = cropImageOptions.f28039x;
        this.f29408l = m12954e(cropImageOptions.f28037v, cropImageOptions.f28040y);
        this.f29409m = m12954e(cropImageOptions.f28041z, cropImageOptions.f27994A);
        int i = cropImageOptions.f27995B;
        Paint paint = new Paint();
        paint.setColor(i);
        this.f29410n = paint;
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f29400F;
        if (rect == null) {
            rect = BitmapUtils2.f27970a;
        }
        rect2.set(rect);
        if (this.f29401G) {
            m12959f();
            invalidate();
            m12956b(false);
        }
    }

    public void setSnapRadius(float f) {
        this.f29420x = f;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29404h = new CropWindowHandler();
        this.f29406j = new RectF();
        this.f29411o = new Path();
        this.f29412p = new float[8];
        this.f29413q = new RectF();
        this.f29397C = this.f29395A / this.f29396B;
        this.f29400F = new Rect();
    }
}
