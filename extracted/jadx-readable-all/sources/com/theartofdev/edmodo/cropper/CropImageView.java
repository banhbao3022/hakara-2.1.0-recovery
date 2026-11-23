package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;
import mtp.media.karaoke.R;
import p007c.p466p.p467a.p468a.BitmapCroppingWorkerTask;
import p007c.p466p.p467a.p468a.BitmapLoadingWorkerTask;
import p007c.p466p.p467a.p468a.BitmapUtils2;
import p007c.p466p.p467a.p468a.C5768k;
import p007c.p466p.p467a.p468a.CropImageAnimation;
import p007c.p466p.p467a.p468a.CropImageOptions;
import p007c.p466p.p467a.p468a.CropWindowHandler;

/* JADX INFO: loaded from: classes.dex */
public class CropImageView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f29335f = 0;

    /* JADX INFO: renamed from: A */
    public boolean f29336A;

    /* JADX INFO: renamed from: B */
    public int f29337B;

    /* JADX INFO: renamed from: C */
    public InterfaceC6014g f29338C;

    /* JADX INFO: renamed from: D */
    public InterfaceC6013f f29339D;

    /* JADX INFO: renamed from: E */
    public InterfaceC6015h f29340E;

    /* JADX INFO: renamed from: F */
    public InterfaceC6016i f29341F;

    /* JADX INFO: renamed from: G */
    public InterfaceC6012e f29342G;

    /* JADX INFO: renamed from: H */
    public Uri f29343H;

    /* JADX INFO: renamed from: I */
    public int f29344I;

    /* JADX INFO: renamed from: J */
    public float f29345J;

    /* JADX INFO: renamed from: K */
    public float f29346K;

    /* JADX INFO: renamed from: L */
    public float f29347L;

    /* JADX INFO: renamed from: M */
    public RectF f29348M;

    /* JADX INFO: renamed from: N */
    public int f29349N;

    /* JADX INFO: renamed from: O */
    public boolean f29350O;

    /* JADX INFO: renamed from: P */
    public Uri f29351P;

    /* JADX INFO: renamed from: Q */
    public WeakReference<BitmapLoadingWorkerTask> f29352Q;

    /* JADX INFO: renamed from: R */
    public WeakReference<BitmapCroppingWorkerTask> f29353R;

    /* JADX INFO: renamed from: g */
    public final ImageView f29354g;

    /* JADX INFO: renamed from: h */
    public final CropOverlayView f29355h;

    /* JADX INFO: renamed from: i */
    public final Matrix f29356i;

    /* JADX INFO: renamed from: j */
    public final Matrix f29357j;

    /* JADX INFO: renamed from: k */
    public final ProgressBar f29358k;

    /* JADX INFO: renamed from: l */
    public final float[] f29359l;

    /* JADX INFO: renamed from: m */
    public final float[] f29360m;

    /* JADX INFO: renamed from: n */
    public CropImageAnimation f29361n;

    /* JADX INFO: renamed from: o */
    public Bitmap f29362o;

    /* JADX INFO: renamed from: p */
    public int f29363p;

    /* JADX INFO: renamed from: q */
    public int f29364q;

    /* JADX INFO: renamed from: r */
    public boolean f29365r;

    /* JADX INFO: renamed from: s */
    public boolean f29366s;

    /* JADX INFO: renamed from: t */
    public int f29367t;

    /* JADX INFO: renamed from: u */
    public int f29368u;

    /* JADX INFO: renamed from: v */
    public int f29369v;

    /* JADX INFO: renamed from: w */
    public EnumC6017j f29370w;

    /* JADX INFO: renamed from: x */
    public boolean f29371x;

    /* JADX INFO: renamed from: y */
    public boolean f29372y;

    /* JADX INFO: renamed from: z */
    public boolean f29373z;

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$a */
    public class C6008a implements CropOverlayView.InterfaceC6019b {
        public C6008a() {
        }
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$b */
    public static class C6009b {

        /* JADX INFO: renamed from: f */
        public final Uri f29375f;

        /* JADX INFO: renamed from: g */
        public final Uri f29376g;

        /* JADX INFO: renamed from: h */
        public final Exception f29377h;

        /* JADX INFO: renamed from: i */
        public final float[] f29378i;

        /* JADX INFO: renamed from: j */
        public final Rect f29379j;

        /* JADX INFO: renamed from: k */
        public final Rect f29380k;

        /* JADX INFO: renamed from: l */
        public final int f29381l;

        /* JADX INFO: renamed from: m */
        public final int f29382m;

        public C6009b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            this.f29375f = uri;
            this.f29376g = uri2;
            this.f29377h = exc;
            this.f29378i = fArr;
            this.f29379j = rect;
            this.f29380k = rect2;
            this.f29381l = i;
            this.f29382m = i2;
        }
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$c */
    public enum EnumC6010c {
        RECTANGLE,
        OVAL
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$d */
    public enum EnumC6011d {
        OFF,
        ON_TOUCH,
        ON
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$e */
    public interface InterfaceC6012e {
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$f */
    public interface InterfaceC6013f {
        /* JADX INFO: renamed from: a */
        void m12951a(Rect rect);
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$g */
    public interface InterfaceC6014g {
        /* JADX INFO: renamed from: a */
        void m12952a(Rect rect);
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$h */
    public interface InterfaceC6015h {
        /* JADX INFO: renamed from: a */
        void m12953a();
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$i */
    public interface InterfaceC6016i {
    }

    /* JADX INFO: renamed from: com.theartofdev.edmodo.cropper.CropImageView$j */
    public enum EnumC6017j {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m12941a(float f, float f2, boolean z, boolean z2) {
        if (this.f29362o != null) {
            if (f <= 0.0f || f2 <= 0.0f) {
                return;
            }
            this.f29356i.invert(this.f29357j);
            RectF cropWindowRect = this.f29355h.getCropWindowRect();
            this.f29357j.mapRect(cropWindowRect);
            this.f29356i.reset();
            this.f29356i.postTranslate((f - this.f29362o.getWidth()) / 2.0f, (f2 - this.f29362o.getHeight()) / 2.0f);
            m12944d();
            int i = this.f29364q;
            if (i > 0) {
                this.f29356i.postRotate(i, BitmapUtils2.m12515m(this.f29359l), BitmapUtils2.m12516n(this.f29359l));
                m12944d();
            }
            float fMin = Math.min(f / BitmapUtils2.m12522t(this.f29359l), f2 / BitmapUtils2.m12518p(this.f29359l));
            EnumC6017j enumC6017j = this.f29370w;
            if (enumC6017j == EnumC6017j.FIT_CENTER || ((enumC6017j == EnumC6017j.CENTER_INSIDE && fMin < 1.0f) || (fMin > 1.0f && this.f29336A))) {
                this.f29356i.postScale(fMin, fMin, BitmapUtils2.m12515m(this.f29359l), BitmapUtils2.m12516n(this.f29359l));
                m12944d();
            }
            float f3 = this.f29365r ? -this.f29345J : this.f29345J;
            float f4 = this.f29366s ? -this.f29345J : this.f29345J;
            this.f29356i.postScale(f3, f4, BitmapUtils2.m12515m(this.f29359l), BitmapUtils2.m12516n(this.f29359l));
            m12944d();
            this.f29356i.mapRect(cropWindowRect);
            if (z) {
                this.f29346K = f > BitmapUtils2.m12522t(this.f29359l) ? 0.0f : Math.max(Math.min((f / 2.0f) - cropWindowRect.centerX(), -BitmapUtils2.m12519q(this.f29359l)), getWidth() - BitmapUtils2.m12520r(this.f29359l)) / f3;
                this.f29347L = f2 <= BitmapUtils2.m12518p(this.f29359l) ? Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerY(), -BitmapUtils2.m12521s(this.f29359l)), getHeight() - BitmapUtils2.m12514l(this.f29359l)) / f4 : 0.0f;
            } else {
                this.f29346K = Math.min(Math.max(this.f29346K * f3, -cropWindowRect.left), (-cropWindowRect.right) + f) / f3;
                this.f29347L = Math.min(Math.max(this.f29347L * f4, -cropWindowRect.top), (-cropWindowRect.bottom) + f2) / f4;
            }
            this.f29356i.postTranslate(this.f29346K * f3, this.f29347L * f4);
            cropWindowRect.offset(this.f29346K * f3, this.f29347L * f4);
            this.f29355h.setCropWindowRect(cropWindowRect);
            m12944d();
            this.f29355h.invalidate();
            if (z2) {
                CropImageAnimation cropImageAnimation = this.f29361n;
                float[] fArr = this.f29359l;
                Matrix matrix = this.f29356i;
                System.arraycopy(fArr, 0, cropImageAnimation.f27986i, 0, 8);
                cropImageAnimation.f27988k.set(cropImageAnimation.f27984g.getCropWindowRect());
                matrix.getValues(cropImageAnimation.f27990m);
                this.f29354g.startAnimation(this.f29361n);
            } else {
                this.f29354g.setImageMatrix(this.f29356i);
            }
            m12950j(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12942b() {
        Bitmap bitmap = this.f29362o;
        if (bitmap != null && (this.f29369v > 0 || this.f29343H != null)) {
            bitmap.recycle();
        }
        this.f29362o = null;
        this.f29369v = 0;
        this.f29343H = null;
        this.f29344I = 1;
        this.f29364q = 0;
        this.f29345J = 1.0f;
        this.f29346K = 0.0f;
        this.f29347L = 0.0f;
        this.f29356i.reset();
        this.f29351P = null;
        this.f29354g.setImageBitmap(null);
        m12947g();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX INFO: renamed from: c */
    public final void m12943c(boolean z, boolean z2) {
        float fMax;
        int width = getWidth();
        int height = getHeight();
        if (this.f29362o == null || width <= 0 || height <= 0) {
            return;
        }
        RectF cropWindowRect = this.f29355h.getCropWindowRect();
        if (!z) {
            if (this.f29336A || this.f29345J > 1.0f) {
                if (this.f29345J < this.f29337B) {
                    float f = width;
                    if (cropWindowRect.width() < f * 0.5f) {
                        float f2 = height;
                        if (cropWindowRect.height() < 0.5f * f2) {
                            fMax = Math.min(this.f29337B, Math.min(f / ((cropWindowRect.width() / this.f29345J) / 0.64f), f2 / ((cropWindowRect.height() / this.f29345J) / 0.64f)));
                        } else {
                            fMax = 0.0f;
                        }
                    } else {
                        fMax = 0.0f;
                    }
                } else {
                    fMax = 0.0f;
                }
                if (this.f29345J > 1.0f) {
                    float f3 = width;
                    if (cropWindowRect.width() > f3 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                        fMax = Math.max(1.0f, Math.min(f3 / ((cropWindowRect.width() / this.f29345J) / 0.51f), height / ((cropWindowRect.height() / this.f29345J) / 0.51f)));
                    }
                }
                float f4 = this.f29336A ? fMax : 1.0f;
                if (f4 > 0.0f && f4 != this.f29345J) {
                    if (z2) {
                        if (this.f29361n == null) {
                            this.f29361n = new CropImageAnimation(this.f29354g, this.f29355h);
                        }
                        CropImageAnimation cropImageAnimation = this.f29361n;
                        float[] fArr = this.f29359l;
                        Matrix matrix = this.f29356i;
                        cropImageAnimation.reset();
                        System.arraycopy(fArr, 0, cropImageAnimation.f27985h, 0, 8);
                        cropImageAnimation.f27987j.set(cropImageAnimation.f27984g.getCropWindowRect());
                        matrix.getValues(cropImageAnimation.f27989l);
                    }
                    this.f29345J = f4;
                    m12941a(width, height, true, z2);
                }
            }
        } else if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > width || cropWindowRect.bottom > height) {
            m12941a(width, height, false, false);
        }
        InterfaceC6015h interfaceC6015h = this.f29340E;
        if (interfaceC6015h == null || z) {
            return;
        }
        interfaceC6015h.m12953a();
    }

    /* JADX INFO: renamed from: d */
    public final void m12944d() {
        float[] fArr = this.f29359l;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.f29362o.getWidth();
        float[] fArr2 = this.f29359l;
        fArr2[3] = 0.0f;
        fArr2[4] = this.f29362o.getWidth();
        this.f29359l[5] = this.f29362o.getHeight();
        float[] fArr3 = this.f29359l;
        fArr3[6] = 0.0f;
        fArr3[7] = this.f29362o.getHeight();
        this.f29356i.mapPoints(this.f29359l);
        float[] fArr4 = this.f29360m;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.f29356i.mapPoints(fArr4);
    }

    /* JADX INFO: renamed from: e */
    public void m12945e(int i) {
        if (this.f29362o != null) {
            int i2 = i < 0 ? (i % 360) + 360 : i % 360;
            CropOverlayView cropOverlayView = this.f29355h;
            boolean z = !cropOverlayView.f29422z && ((i2 > 45 && i2 < 135) || (i2 > 215 && i2 < 305));
            RectF rectF = BitmapUtils2.f27972c;
            rectF.set(cropOverlayView.getCropWindowRect());
            float fHeight = (z ? rectF.height() : rectF.width()) / 2.0f;
            float fWidth = (z ? rectF.width() : rectF.height()) / 2.0f;
            if (z) {
                boolean z2 = this.f29365r;
                this.f29365r = this.f29366s;
                this.f29366s = z2;
            }
            this.f29356i.invert(this.f29357j);
            float[] fArr = BitmapUtils2.f27973d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f29357j.mapPoints(fArr);
            this.f29364q = (this.f29364q + i2) % 360;
            m12941a(getWidth(), getHeight(), true, false);
            Matrix matrix = this.f29356i;
            float[] fArr2 = BitmapUtils2.f27974e;
            matrix.mapPoints(fArr2, fArr);
            float fSqrt = (float) (((double) this.f29345J) / Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d)));
            this.f29345J = fSqrt;
            this.f29345J = Math.max(fSqrt, 1.0f);
            m12941a(getWidth(), getHeight(), true, false);
            this.f29356i.mapPoints(fArr2, fArr);
            double dSqrt = Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d));
            float f = (float) (((double) fHeight) * dSqrt);
            float f2 = (float) (((double) fWidth) * dSqrt);
            rectF.set(fArr2[0] - f, fArr2[1] - f2, fArr2[0] + f, fArr2[1] + f2);
            this.f29355h.m12961h();
            this.f29355h.setCropWindowRect(rectF);
            m12941a(getWidth(), getHeight(), true, false);
            m12943c(false, false);
            CropOverlayView cropOverlayView2 = this.f29355h;
            RectF cropWindowRect = cropOverlayView2.getCropWindowRect();
            cropOverlayView2.m12958d(cropWindowRect);
            cropOverlayView2.f29404h.f28042a.set(cropWindowRect);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12946f(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        Bitmap bitmap2 = this.f29362o;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f29354g.clearAnimation();
            m12942b();
            this.f29362o = bitmap;
            this.f29354g.setImageBitmap(bitmap);
            this.f29343H = uri;
            this.f29369v = i;
            this.f29344I = i2;
            this.f29364q = i3;
            m12941a(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f29355h;
            if (cropOverlayView != null) {
                cropOverlayView.m12961h();
                m12947g();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12947g() {
        CropOverlayView cropOverlayView = this.f29355h;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f29372y || this.f29362o == null) ? 4 : 0);
        }
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.f29355h.getAspectRatioX()), Integer.valueOf(this.f29355h.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f29355h.getCropWindowRect();
        float[] fArr = new float[8];
        float f = cropWindowRect.left;
        fArr[0] = f;
        float f2 = cropWindowRect.top;
        fArr[1] = f2;
        float f3 = cropWindowRect.right;
        fArr[2] = f3;
        fArr[3] = f2;
        fArr[4] = f3;
        float f4 = cropWindowRect.bottom;
        fArr[5] = f4;
        fArr[6] = f;
        fArr[7] = f4;
        this.f29356i.invert(this.f29357j);
        this.f29357j.mapPoints(fArr);
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * this.f29344I;
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i = this.f29344I;
        Bitmap bitmap = this.f29362o;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i;
        int height = i * bitmap.getHeight();
        CropOverlayView cropOverlayView = this.f29355h;
        return BitmapUtils2.m12517o(cropPoints, width, height, cropOverlayView.f29422z, cropOverlayView.getAspectRatioX(), this.f29355h.getAspectRatioY());
    }

    public EnumC6010c getCropShape() {
        return this.f29355h.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f29355h;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        Bitmap bitmap;
        if (this.f29362o == null) {
            return null;
        }
        this.f29354g.clearAnimation();
        if (this.f29343H == null || this.f29344I <= 1) {
            Bitmap bitmap2 = this.f29362o;
            float[] cropPoints = getCropPoints();
            int i = this.f29364q;
            CropOverlayView cropOverlayView = this.f29355h;
            bitmap = BitmapUtils2.m12507e(bitmap2, cropPoints, i, cropOverlayView.f29422z, cropOverlayView.getAspectRatioX(), this.f29355h.getAspectRatioY(), this.f29365r, this.f29366s).f27977a;
        } else {
            int width = this.f29362o.getWidth() * this.f29344I;
            int height = this.f29362o.getHeight() * this.f29344I;
            Context context = getContext();
            Uri uri = this.f29343H;
            float[] cropPoints2 = getCropPoints();
            int i2 = this.f29364q;
            CropOverlayView cropOverlayView2 = this.f29355h;
            bitmap = BitmapUtils2.m12505c(context, uri, cropPoints2, i2, width, height, cropOverlayView2.f29422z, cropOverlayView2.getAspectRatioX(), this.f29355h.getAspectRatioY(), 0, 0, this.f29365r, this.f29366s).f27977a;
        }
        return BitmapUtils2.m12523u(bitmap, 0, 0, 1);
    }

    public void getCroppedImageAsync() {
        if (this.f29342G == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m12949i(0, 0, 1, null, null, 0);
    }

    public EnumC6011d getGuidelines() {
        return this.f29355h.getGuidelines();
    }

    public int getImageResource() {
        return this.f29369v;
    }

    public Uri getImageUri() {
        return this.f29343H;
    }

    public int getMaxZoom() {
        return this.f29337B;
    }

    public int getRotatedDegrees() {
        return this.f29364q;
    }

    public EnumC6017j getScaleType() {
        return this.f29370w;
    }

    public Rect getWholeImageRect() {
        int i = this.f29344I;
        Bitmap bitmap = this.f29362o;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    /* JADX INFO: renamed from: h */
    public final void m12948h() {
        this.f29358k.setVisibility(this.f29373z && ((this.f29362o == null && this.f29352Q != null) || this.f29353R != null) ? 0 : 4);
    }

    /* JADX INFO: renamed from: i */
    public void m12949i(int i, int i2, int i3, Uri uri, Bitmap.CompressFormat compressFormat, int i4) {
        CropImageView cropImageView;
        Bitmap bitmap = this.f29362o;
        if (bitmap != null) {
            this.f29354g.clearAnimation();
            WeakReference<BitmapCroppingWorkerTask> weakReference = this.f29353R;
            BitmapCroppingWorkerTask bitmapCroppingWorkerTask = weakReference != null ? weakReference.get() : null;
            if (bitmapCroppingWorkerTask != null) {
                bitmapCroppingWorkerTask.cancel(true);
            }
            int i5 = i3 != 1 ? i : 0;
            int i6 = i3 != 1 ? i2 : 0;
            int width = bitmap.getWidth() * this.f29344I;
            int height = bitmap.getHeight();
            int i7 = this.f29344I;
            int i8 = height * i7;
            if (this.f29343H == null || (i7 <= 1 && i3 != 2)) {
                float[] cropPoints = getCropPoints();
                int i9 = this.f29364q;
                CropOverlayView cropOverlayView = this.f29355h;
                cropImageView = this;
                cropImageView.f29353R = new WeakReference<>(new BitmapCroppingWorkerTask(this, bitmap, cropPoints, i9, cropOverlayView.f29422z, cropOverlayView.getAspectRatioX(), this.f29355h.getAspectRatioY(), i5, i6, this.f29365r, this.f29366s, i3, uri, compressFormat, i4));
            } else {
                Uri uri2 = this.f29343H;
                float[] cropPoints2 = getCropPoints();
                int i10 = this.f29364q;
                CropOverlayView cropOverlayView2 = this.f29355h;
                this.f29353R = new WeakReference<>(new BitmapCroppingWorkerTask(this, uri2, cropPoints2, i10, width, i8, cropOverlayView2.f29422z, cropOverlayView2.getAspectRatioX(), this.f29355h.getAspectRatioY(), i5, i6, this.f29365r, this.f29366s, i3, uri, compressFormat, i4));
                cropImageView = this;
            }
            cropImageView.f29353R.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m12948h();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12950j(boolean z) {
        if (this.f29362o != null && !z) {
            float fM12522t = (this.f29344I * 100.0f) / BitmapUtils2.m12522t(this.f29360m);
            float fM12518p = (this.f29344I * 100.0f) / BitmapUtils2.m12518p(this.f29360m);
            CropOverlayView cropOverlayView = this.f29355h;
            float width = getWidth();
            float height = getHeight();
            CropWindowHandler cropWindowHandler = cropOverlayView.f29404h;
            cropWindowHandler.f28046e = width;
            cropWindowHandler.f28047f = height;
            cropWindowHandler.f28052k = fM12522t;
            cropWindowHandler.f28053l = fM12518p;
        }
        this.f29355h.m12962i(z ? null : this.f29359l, getWidth(), getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f29367t <= 0 || this.f29368u <= 0) {
            m12950j(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f29367t;
        layoutParams.height = this.f29368u;
        setLayoutParams(layoutParams);
        if (this.f29362o == null) {
            m12950j(true);
            return;
        }
        float f = i3 - i;
        float f2 = i4 - i2;
        m12941a(f, f2, true, false);
        if (this.f29348M == null) {
            if (this.f29350O) {
                this.f29350O = false;
                m12943c(false, false);
                return;
            }
            return;
        }
        int i5 = this.f29349N;
        if (i5 != this.f29363p) {
            this.f29364q = i5;
            m12941a(f, f2, true, false);
        }
        this.f29356i.mapRect(this.f29348M);
        this.f29355h.setCropWindowRect(this.f29348M);
        m12943c(false, false);
        CropOverlayView cropOverlayView = this.f29355h;
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        cropOverlayView.m12958d(cropWindowRect);
        cropOverlayView.f29404h.f28042a.set(cropWindowRect);
        this.f29348M = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int width;
        int height;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f29362o;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < this.f29362o.getWidth() ? ((double) size) / ((double) this.f29362o.getWidth()) : Double.POSITIVE_INFINITY;
        double height2 = size2 < this.f29362o.getHeight() ? ((double) size2) / ((double) this.f29362o.getHeight()) : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = this.f29362o.getWidth();
            height = this.f29362o.getHeight();
        } else if (width2 <= height2) {
            height = (int) (((double) this.f29362o.getHeight()) * width2);
            width = size;
        } else {
            width = (int) (((double) this.f29362o.getWidth()) * height2);
            height = size2;
        }
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(width, size) : width;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(height, size2) : height;
        }
        this.f29367t = size;
        this.f29368u = size2;
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        if (this.f29352Q == null && this.f29343H == null && this.f29362o == null && this.f29369v == 0) {
            Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
            if (uri != null) {
                String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                if (string != null) {
                    Pair<String, WeakReference<Bitmap>> pair = BitmapUtils2.f27976g;
                    Bitmap bitmap = (pair == null || !((String) pair.first).equals(string)) ? null : (Bitmap) ((WeakReference) BitmapUtils2.f27976g.second).get();
                    BitmapUtils2.f27976g = null;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        m12946f(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                    }
                }
                if (this.f29343H == null) {
                    setImageUriAsync(uri);
                }
            } else {
                int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                if (i > 0) {
                    setImageResource(i);
                } else {
                    Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                    if (uri2 != null) {
                        setImageUriAsync(uri2);
                    }
                }
            }
            int i2 = bundle.getInt("DEGREES_ROTATED");
            this.f29349N = i2;
            this.f29364q = i2;
            Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
            if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                this.f29355h.setInitialCropWindowRect(rect);
            }
            RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
            if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                this.f29348M = rectF;
            }
            this.f29355h.setCropShape(EnumC6010c.valueOf(bundle.getString("CROP_SHAPE")));
            this.f29336A = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
            this.f29337B = bundle.getInt("CROP_MAX_ZOOM");
            this.f29365r = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
            this.f29366s = bundle.getBoolean("CROP_FLIP_VERTICALLY");
        }
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        BitmapLoadingWorkerTask bitmapLoadingWorkerTask;
        boolean z = true;
        if (this.f29343H == null && this.f29362o == null && this.f29369v < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.f29343H;
        if (this.f29371x && uri == null && this.f29369v < 1) {
            Context context = getContext();
            Bitmap bitmap = this.f29362o;
            Uri uriFromFile = this.f29351P;
            Rect rect = BitmapUtils2.f27970a;
            try {
                if (uriFromFile == null) {
                    uriFromFile = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                } else if (new File(uriFromFile.getPath()).exists()) {
                    z = false;
                }
                if (z) {
                    BitmapUtils2.m12524v(context, bitmap, uriFromFile, Bitmap.CompressFormat.JPEG, 95);
                }
                uri = uriFromFile;
            } catch (Exception e) {
                Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e);
                uri = null;
            }
            this.f29351P = uri;
        }
        if (uri != null && this.f29362o != null) {
            String string = UUID.randomUUID().toString();
            BitmapUtils2.f27976g = new Pair<>(string, new WeakReference(this.f29362o));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference<BitmapLoadingWorkerTask> weakReference = this.f29352Q;
        if (weakReference != null && (bitmapLoadingWorkerTask = weakReference.get()) != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bitmapLoadingWorkerTask.f27961b);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f29369v);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f29344I);
        bundle.putInt("DEGREES_ROTATED", this.f29364q);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f29355h.getInitialCropWindowRect());
        RectF rectF = BitmapUtils2.f27972c;
        rectF.set(this.f29355h.getCropWindowRect());
        this.f29356i.invert(this.f29357j);
        this.f29357j.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", this.f29355h.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f29336A);
        bundle.putInt("CROP_MAX_ZOOM", this.f29337B);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f29365r);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f29366s);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f29350O = i3 > 0 && i4 > 0;
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f29336A != z) {
            this.f29336A = z;
            m12943c(false, false);
            this.f29355h.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f29355h.setInitialCropWindowRect(rect);
    }

    public void setCropShape(EnumC6010c enumC6010c) {
        this.f29355h.setCropShape(enumC6010c);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f29355h.setFixedAspectRatio(z);
    }

    public void setFlippedHorizontally(boolean z) {
        if (this.f29365r != z) {
            this.f29365r = z;
            m12941a(getWidth(), getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z) {
        if (this.f29366s != z) {
            this.f29366s = z;
            m12941a(getWidth(), getHeight(), true, false);
        }
    }

    public void setGuidelines(EnumC6011d enumC6011d) {
        this.f29355h.setGuidelines(enumC6011d);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f29355h.setInitialCropWindowRect(null);
        m12946f(bitmap, 0, null, 1, 0);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.f29355h.setInitialCropWindowRect(null);
            m12946f(BitmapFactory.decodeResource(getResources(), i), i, null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference<BitmapLoadingWorkerTask> weakReference = this.f29352Q;
            BitmapLoadingWorkerTask bitmapLoadingWorkerTask = weakReference != null ? weakReference.get() : null;
            if (bitmapLoadingWorkerTask != null) {
                bitmapLoadingWorkerTask.cancel(true);
            }
            m12942b();
            this.f29348M = null;
            this.f29349N = 0;
            this.f29355h.setInitialCropWindowRect(null);
            WeakReference<BitmapLoadingWorkerTask> weakReference2 = new WeakReference<>(new BitmapLoadingWorkerTask(this, uri));
            this.f29352Q = weakReference2;
            weakReference2.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m12948h();
        }
    }

    public void setMaxZoom(int i) {
        if (this.f29337B == i || i <= 0) {
            return;
        }
        this.f29337B = i;
        m12943c(false, false);
        this.f29355h.invalidate();
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.f29355h.m12963j(z)) {
            m12943c(false, false);
            this.f29355h.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(InterfaceC6012e interfaceC6012e) {
        this.f29342G = interfaceC6012e;
    }

    public void setOnCropWindowChangedListener(InterfaceC6015h interfaceC6015h) {
        this.f29340E = interfaceC6015h;
    }

    public void setOnSetCropOverlayMovedListener(InterfaceC6013f interfaceC6013f) {
        this.f29339D = interfaceC6013f;
    }

    public void setOnSetCropOverlayReleasedListener(InterfaceC6014g interfaceC6014g) {
        this.f29338C = interfaceC6014g;
    }

    public void setOnSetImageUriCompleteListener(InterfaceC6016i interfaceC6016i) {
        this.f29341F = interfaceC6016i;
    }

    public void setRotatedDegrees(int i) {
        int i2 = this.f29364q;
        if (i2 != i) {
            m12945e(i - i2);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z) {
        this.f29371x = z;
    }

    public void setScaleType(EnumC6017j enumC6017j) {
        if (enumC6017j != this.f29370w) {
            this.f29370w = enumC6017j;
            this.f29345J = 1.0f;
            this.f29347L = 0.0f;
            this.f29346K = 0.0f;
            this.f29355h.m12961h();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f29372y != z) {
            this.f29372y = z;
            m12947g();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f29373z != z) {
            this.f29373z = z;
            m12948h();
        }
    }

    public void setSnapRadius(float f) {
        if (f >= 0.0f) {
            this.f29355h.setSnapRadius(f);
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        Bundle bundleExtra;
        super(context, attributeSet);
        this.f29356i = new Matrix();
        this.f29357j = new Matrix();
        this.f29359l = new float[8];
        this.f29360m = new float[8];
        this.f29371x = false;
        this.f29372y = true;
        this.f29373z = true;
        this.f29336A = true;
        this.f29344I = 1;
        this.f29345J = 1.0f;
        CropImageOptions cropImageOptions = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            cropImageOptions = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5768k.f28070a, 0, 0);
                try {
                    cropImageOptions.f28032q = typedArrayObtainStyledAttributes.getBoolean(10, cropImageOptions.f28032q);
                    cropImageOptions.f28033r = typedArrayObtainStyledAttributes.getInteger(0, cropImageOptions.f28033r);
                    cropImageOptions.f28034s = typedArrayObtainStyledAttributes.getInteger(1, cropImageOptions.f28034s);
                    cropImageOptions.f28025j = EnumC6017j.values()[typedArrayObtainStyledAttributes.getInt(26, cropImageOptions.f28025j.ordinal())];
                    cropImageOptions.f28028m = typedArrayObtainStyledAttributes.getBoolean(2, cropImageOptions.f28028m);
                    cropImageOptions.f28029n = typedArrayObtainStyledAttributes.getBoolean(24, cropImageOptions.f28029n);
                    cropImageOptions.f28030o = typedArrayObtainStyledAttributes.getInteger(19, cropImageOptions.f28030o);
                    cropImageOptions.f28021f = EnumC6010c.values()[typedArrayObtainStyledAttributes.getInt(27, cropImageOptions.f28021f.ordinal())];
                    cropImageOptions.f28024i = EnumC6011d.values()[typedArrayObtainStyledAttributes.getInt(13, cropImageOptions.f28024i.ordinal())];
                    cropImageOptions.f28022g = typedArrayObtainStyledAttributes.getDimension(30, cropImageOptions.f28022g);
                    cropImageOptions.f28023h = typedArrayObtainStyledAttributes.getDimension(31, cropImageOptions.f28023h);
                    cropImageOptions.f28031p = typedArrayObtainStyledAttributes.getFloat(16, cropImageOptions.f28031p);
                    cropImageOptions.f28035t = typedArrayObtainStyledAttributes.getDimension(9, cropImageOptions.f28035t);
                    cropImageOptions.f28036u = typedArrayObtainStyledAttributes.getInteger(8, cropImageOptions.f28036u);
                    cropImageOptions.f28037v = typedArrayObtainStyledAttributes.getDimension(7, cropImageOptions.f28037v);
                    cropImageOptions.f28038w = typedArrayObtainStyledAttributes.getDimension(6, cropImageOptions.f28038w);
                    cropImageOptions.f28039x = typedArrayObtainStyledAttributes.getDimension(5, cropImageOptions.f28039x);
                    cropImageOptions.f28040y = typedArrayObtainStyledAttributes.getInteger(4, cropImageOptions.f28040y);
                    cropImageOptions.f28041z = typedArrayObtainStyledAttributes.getDimension(15, cropImageOptions.f28041z);
                    cropImageOptions.f27994A = typedArrayObtainStyledAttributes.getInteger(14, cropImageOptions.f27994A);
                    cropImageOptions.f27995B = typedArrayObtainStyledAttributes.getInteger(3, cropImageOptions.f27995B);
                    cropImageOptions.f28026k = typedArrayObtainStyledAttributes.getBoolean(28, this.f29372y);
                    cropImageOptions.f28027l = typedArrayObtainStyledAttributes.getBoolean(29, this.f29373z);
                    cropImageOptions.f28037v = typedArrayObtainStyledAttributes.getDimension(7, cropImageOptions.f28037v);
                    cropImageOptions.f27996C = (int) typedArrayObtainStyledAttributes.getDimension(23, cropImageOptions.f27996C);
                    cropImageOptions.f27997D = (int) typedArrayObtainStyledAttributes.getDimension(22, cropImageOptions.f27997D);
                    cropImageOptions.f27998E = (int) typedArrayObtainStyledAttributes.getFloat(21, cropImageOptions.f27998E);
                    cropImageOptions.f27999F = (int) typedArrayObtainStyledAttributes.getFloat(20, cropImageOptions.f27999F);
                    cropImageOptions.f28000G = (int) typedArrayObtainStyledAttributes.getFloat(18, cropImageOptions.f28000G);
                    cropImageOptions.f28001H = (int) typedArrayObtainStyledAttributes.getFloat(17, cropImageOptions.f28001H);
                    cropImageOptions.f28017X = typedArrayObtainStyledAttributes.getBoolean(11, cropImageOptions.f28017X);
                    cropImageOptions.f28018Y = typedArrayObtainStyledAttributes.getBoolean(11, cropImageOptions.f28018Y);
                    this.f29371x = typedArrayObtainStyledAttributes.getBoolean(25, this.f29371x);
                    if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.hasValue(0) && !typedArrayObtainStyledAttributes.hasValue(10)) {
                        cropImageOptions.f28032q = true;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
        }
        cropImageOptions.m12527a();
        this.f29370w = cropImageOptions.f28025j;
        this.f29336A = cropImageOptions.f28028m;
        this.f29337B = cropImageOptions.f28030o;
        this.f29372y = cropImageOptions.f28026k;
        this.f29373z = cropImageOptions.f28027l;
        this.f29365r = cropImageOptions.f28017X;
        this.f29366s = cropImageOptions.f28018Y;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.crop_image_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.ImageView_image);
        this.f29354g = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(R.id.CropOverlayView);
        this.f29355h = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(new C6008a());
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        this.f29358k = (ProgressBar) viewInflate.findViewById(R.id.CropProgressBar);
        m12948h();
    }
}
