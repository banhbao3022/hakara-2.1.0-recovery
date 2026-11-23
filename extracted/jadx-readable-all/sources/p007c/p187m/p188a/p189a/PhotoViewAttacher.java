package p007c.p187m.p188a.p189a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.m.a.a.k, reason: use source file name */
/* JADX INFO: compiled from: PhotoViewAttacher.java */
/* JADX INFO: loaded from: classes.dex */
public class PhotoViewAttacher implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: A */
    public OnScaleChangedListener f5443A;

    /* JADX INFO: renamed from: B */
    public OnSingleFlingListener f5444B;

    /* JADX INFO: renamed from: C */
    public OnViewDragListener f5445C;

    /* JADX INFO: renamed from: D */
    public f f5446D;

    /* JADX INFO: renamed from: m */
    public ImageView f5458m;

    /* JADX INFO: renamed from: n */
    public GestureDetector f5459n;

    /* JADX INFO: renamed from: o */
    public CustomGestureDetector f5460o;

    /* JADX INFO: renamed from: u */
    public OnMatrixChangedListener f5466u;

    /* JADX INFO: renamed from: v */
    public OnPhotoTapListener f5467v;

    /* JADX INFO: renamed from: w */
    public OnOutsidePhotoTapListener f5468w;

    /* JADX INFO: renamed from: x */
    public OnViewTapListener f5469x;

    /* JADX INFO: renamed from: y */
    public View.OnClickListener f5470y;

    /* JADX INFO: renamed from: z */
    public View.OnLongClickListener f5471z;

    /* JADX INFO: renamed from: f */
    public Interpolator f5451f = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: g */
    public int f5452g = 200;

    /* JADX INFO: renamed from: h */
    public float f5453h = 1.0f;

    /* JADX INFO: renamed from: i */
    public float f5454i = 1.75f;

    /* JADX INFO: renamed from: j */
    public float f5455j = 3.0f;

    /* JADX INFO: renamed from: k */
    public boolean f5456k = true;

    /* JADX INFO: renamed from: l */
    public boolean f5457l = false;

    /* JADX INFO: renamed from: p */
    public final Matrix f5461p = new Matrix();

    /* JADX INFO: renamed from: q */
    public final Matrix f5462q = new Matrix();

    /* JADX INFO: renamed from: r */
    public final Matrix f5463r = new Matrix();

    /* JADX INFO: renamed from: s */
    public final RectF f5464s = new RectF();

    /* JADX INFO: renamed from: t */
    public final float[] f5465t = new float[9];

    /* JADX INFO: renamed from: E */
    public int f5447E = 2;

    /* JADX INFO: renamed from: F */
    public boolean f5448F = true;

    /* JADX INFO: renamed from: G */
    public ImageView.ScaleType f5449G = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: H */
    public OnGestureListener f5450H = new a();

    /* JADX INFO: renamed from: c.m.a.a.k$a */
    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class a implements OnGestureListener {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m2731a(float f, float f2, float f3) {
            float fM2725l = PhotoViewAttacher.this.m2725l();
            PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
            if (fM2725l < photoViewAttacher.f5455j || f < 1.0f) {
                float fM2725l2 = photoViewAttacher.m2725l();
                PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                if (fM2725l2 > photoViewAttacher2.f5453h || f > 1.0f) {
                    OnScaleChangedListener onScaleChangedListener = photoViewAttacher2.f5443A;
                    if (onScaleChangedListener != null) {
                        onScaleChangedListener.m2715a(f, f2, f3);
                    }
                    PhotoViewAttacher.this.f5463r.postScale(f, f, f2, f3);
                    PhotoViewAttacher.this.m2718a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.m.a.a.k$b */
    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
            if (photoViewAttacher.f5444B == null || photoViewAttacher.m2725l() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                return false;
            }
            return PhotoViewAttacher.this.f5444B.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
            View.OnLongClickListener onLongClickListener = photoViewAttacher.f5471z;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(photoViewAttacher.f5458m);
            }
        }
    }

    /* JADX INFO: renamed from: c.m.a.a.k$c */
    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029 A[Catch: ArrayIndexOutOfBoundsException -> 0x002e, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002e, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001f, B:10:0x0025, B:11:0x0029), top: B:15:0x0001 }] */
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fM2725l = PhotoViewAttacher.this.m2725l();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                float f = photoViewAttacher.f5454i;
                if (fM2725l < f) {
                    photoViewAttacher.m2727o(f, x, y, true);
                } else if (fM2725l >= f) {
                    float f2 = photoViewAttacher.f5455j;
                    if (fM2725l < f2) {
                        photoViewAttacher.m2727o(f2, x, y, true);
                    } else {
                        photoViewAttacher.m2727o(photoViewAttacher.f5453h, x, y, true);
                    }
                } else {
                    photoViewAttacher.m2727o(photoViewAttacher.f5453h, x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
            View.OnClickListener onClickListener = photoViewAttacher.f5470y;
            if (onClickListener != null) {
                onClickListener.onClick(photoViewAttacher.f5458m);
            }
            RectF rectFM2720c = PhotoViewAttacher.this.m2720c();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
            OnViewTapListener onViewTapListener = photoViewAttacher2.f5469x;
            if (onViewTapListener != null) {
                onViewTapListener.m2717a(photoViewAttacher2.f5458m, x, y);
            }
            if (rectFM2720c == null) {
                return false;
            }
            if (!rectFM2720c.contains(x, y)) {
                PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                OnOutsidePhotoTapListener onOutsidePhotoTapListener = photoViewAttacher3.f5468w;
                if (onOutsidePhotoTapListener == null) {
                    return false;
                }
                onOutsidePhotoTapListener.m2713a(photoViewAttacher3.f5458m);
                return false;
            }
            float fWidth = (x - rectFM2720c.left) / rectFM2720c.width();
            float fHeight = (y - rectFM2720c.top) / rectFM2720c.height();
            PhotoViewAttacher photoViewAttacher4 = PhotoViewAttacher.this;
            OnPhotoTapListener onPhotoTapListener = photoViewAttacher4.f5467v;
            if (onPhotoTapListener == null) {
                return true;
            }
            onPhotoTapListener.m2714a(photoViewAttacher4.f5458m, fWidth, fHeight);
            return true;
        }
    }

    /* JADX INFO: renamed from: c.m.a.a.k$d */
    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5475a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f5475a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5475a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5475a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5475a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: c.m.a.a.k$e */
    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: f */
        public final float f5476f;

        /* JADX INFO: renamed from: g */
        public final float f5477g;

        /* JADX INFO: renamed from: h */
        public final long f5478h = System.currentTimeMillis();

        /* JADX INFO: renamed from: i */
        public final float f5479i;

        /* JADX INFO: renamed from: j */
        public final float f5480j;

        public e(float f, float f2, float f3, float f4) {
            this.f5476f = f3;
            this.f5477g = f4;
            this.f5479i = f;
            this.f5480j = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            float interpolation = PhotoViewAttacher.this.f5451f.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f5478h) * 1.0f) / PhotoViewAttacher.this.f5452g));
            float f = this.f5479i;
            ((a) PhotoViewAttacher.this.f5450H).m2731a(outline.m1576a(this.f5480j, f, interpolation, f) / PhotoViewAttacher.this.m2725l(), this.f5476f, this.f5477g);
            if (interpolation < 1.0f) {
                PhotoViewAttacher.this.f5458m.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: renamed from: c.m.a.a.k$f */
    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: f */
        public final OverScroller f5482f;

        /* JADX INFO: renamed from: g */
        public int f5483g;

        /* JADX INFO: renamed from: h */
        public int f5484h;

        public f(Context context) {
            this.f5482f = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f5482f.isFinished() && this.f5482f.computeScrollOffset()) {
                int currX = this.f5482f.getCurrX();
                int currY = this.f5482f.getCurrY();
                PhotoViewAttacher.this.f5463r.postTranslate(this.f5483g - currX, this.f5484h - currY);
                PhotoViewAttacher.this.m2718a();
                this.f5483g = currX;
                this.f5484h = currY;
                PhotoViewAttacher.this.f5458m.postOnAnimation(this);
            }
        }
    }

    public PhotoViewAttacher(ImageView imageView) {
        this.f5458m = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f5460o = new CustomGestureDetector(imageView.getContext(), this.f5450H);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f5459n = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    /* JADX INFO: renamed from: a */
    public final void m2718a() {
        RectF rectFM2721d;
        if (m2719b()) {
            Matrix matrixM2722e = m2722e();
            this.f5458m.setImageMatrix(matrixM2722e);
            if (this.f5466u == null || (rectFM2721d = m2721d(matrixM2722e)) == null) {
                return;
            }
            this.f5466u.m2712a(rectFM2721d);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2719b() {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        RectF rectFM2721d = m2721d(m2722e());
        if (rectFM2721d == null) {
            return false;
        }
        float fHeight = rectFM2721d.height();
        float fWidth = rectFM2721d.width();
        float fM2723f = m2723f(this.f5458m);
        float f7 = 0.0f;
        if (fHeight <= fM2723f) {
            int i = d.f5475a[this.f5449G.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    fM2723f = (fM2723f - fHeight) / 2.0f;
                    f3 = rectFM2721d.top;
                } else {
                    fM2723f -= fHeight;
                    f3 = rectFM2721d.top;
                }
            } else {
                f2 = rectFM2721d.top;
                f4 = -f2;
            }
        } else {
            f2 = rectFM2721d.top;
            if (f2 > 0.0f) {
                f4 = -f2;
            } else {
                f3 = rectFM2721d.bottom;
                f4 = f3 < fM2723f ? fM2723f - f3 : 0.0f;
            }
        }
        float fM2724i = m2724i(this.f5458m);
        if (fWidth <= fM2724i) {
            int i2 = d.f5475a[this.f5449G.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f5 = (fM2724i - fWidth) / 2.0f;
                    f6 = rectFM2721d.left;
                } else {
                    f5 = fM2724i - fWidth;
                    f6 = rectFM2721d.left;
                }
                f7 = f5 - f6;
            } else {
                f7 = -rectFM2721d.left;
            }
            this.f5447E = 2;
        } else {
            float f8 = rectFM2721d.left;
            if (f8 > 0.0f) {
                this.f5447E = 0;
                f7 = -f8;
            } else {
                float f9 = rectFM2721d.right;
                if (f9 < fM2724i) {
                    f7 = fM2724i - f9;
                    this.f5447E = 1;
                } else {
                    this.f5447E = -1;
                }
            }
        }
        this.f5463r.postTranslate(f7, f4);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public RectF m2720c() {
        m2719b();
        return m2721d(m2722e());
    }

    /* JADX INFO: renamed from: d */
    public final RectF m2721d(Matrix matrix) {
        Drawable drawable = this.f5458m.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f5464s.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f5464s);
        return this.f5464s;
    }

    /* JADX INFO: renamed from: e */
    public final Matrix m2722e() {
        this.f5462q.set(this.f5461p);
        this.f5462q.postConcat(this.f5463r);
        return this.f5462q;
    }

    /* JADX INFO: renamed from: f */
    public final int m2723f(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* JADX INFO: renamed from: i */
    public final int m2724i(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* JADX INFO: renamed from: l */
    public float m2725l() {
        this.f5463r.getValues(this.f5465t);
        float fPow = (float) Math.pow(this.f5465t[0], 2.0d);
        this.f5463r.getValues(this.f5465t);
        return (float) Math.sqrt(fPow + ((float) Math.pow(this.f5465t[3], 2.0d)));
    }

    /* JADX INFO: renamed from: m */
    public final void m2726m() {
        RectF rectFM2721d;
        this.f5463r.reset();
        this.f5463r.postRotate(0.0f);
        m2718a();
        Matrix matrixM2722e = m2722e();
        this.f5458m.setImageMatrix(matrixM2722e);
        if (this.f5466u != null && (rectFM2721d = m2721d(matrixM2722e)) != null) {
            this.f5466u.m2712a(rectFM2721d);
        }
        m2719b();
    }

    /* JADX INFO: renamed from: o */
    public void m2727o(float f2, float f3, float f4, boolean z) {
        if (f2 < this.f5453h || f2 > this.f5455j) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f5458m.post(new e(m2725l(), f2, f3, f4));
        } else {
            this.f5463r.setScale(f2, f2, f3, f4);
            m2718a();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        m2730s(this.f5458m.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        CustomGestureDetector customGestureDetector;
        boolean z2;
        GestureDetector gestureDetector;
        boolean zM2710c;
        boolean z3;
        boolean z4;
        boolean z5;
        RectF rectFM2720c;
        boolean z6 = false;
        if (!this.f5448F) {
            return false;
        }
        if (!(((ImageView) view).getDrawable() != null)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (m2725l() < this.f5453h) {
                    RectF rectFM2720c2 = m2720c();
                    if (rectFM2720c2 != null) {
                        view.post(new e(m2725l(), this.f5453h, rectFM2720c2.centerX(), rectFM2720c2.centerY()));
                        z = true;
                    }
                } else if (m2725l() > this.f5455j && (rectFM2720c = m2720c()) != null) {
                    view.post(new e(m2725l(), this.f5455j, rectFM2720c.centerX(), rectFM2720c.centerY()));
                    z = true;
                }
            }
            customGestureDetector = this.f5460o;
            if (customGestureDetector != null) {
                zM2710c = customGestureDetector.m2710c();
                CustomGestureDetector customGestureDetector2 = this.f5460o;
                z3 = customGestureDetector2.f5434e;
                try {
                    customGestureDetector2.f5432c.onTouchEvent(motionEvent);
                    customGestureDetector2.m2711d(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                if (!zM2710c || this.f5460o.m2710c()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 || this.f5460o.f5434e) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z4 && z5) {
                    z6 = true;
                }
                this.f5457l = z6;
                z2 = true;
            } else {
                z2 = z;
            }
            gestureDetector = this.f5459n;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        f fVar = this.f5446D;
        if (fVar != null) {
            fVar.f5482f.forceFinished(true);
            this.f5446D = null;
        }
        z = false;
        customGestureDetector = this.f5460o;
        if (customGestureDetector != null) {
            zM2710c = customGestureDetector.m2710c();
            CustomGestureDetector customGestureDetector3 = this.f5460o;
            z3 = customGestureDetector3.f5434e;
            customGestureDetector3.f5432c.onTouchEvent(motionEvent);
            customGestureDetector3.m2711d(motionEvent);
            if (zM2710c) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z3) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z4) {
                z6 = true;
            }
            this.f5457l = z6;
            z2 = true;
        } else {
            z2 = z;
        }
        gestureDetector = this.f5459n;
        return gestureDetector == null ? z2 : z2;
    }

    /* JADX INFO: renamed from: q */
    public void m2728q(float f2, boolean z) {
        m2727o(f2, this.f5458m.getRight() / 2, this.f5458m.getBottom() / 2, z);
    }

    /* JADX INFO: renamed from: r */
    public void m2729r() {
        if (this.f5448F) {
            m2730s(this.f5458m.getDrawable());
        } else {
            m2726m();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2730s(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fM2724i = m2724i(this.f5458m);
        float fM2723f = m2723f(this.f5458m);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f5461p.reset();
        float f2 = intrinsicWidth;
        float f3 = fM2724i / f2;
        float f4 = intrinsicHeight;
        float f5 = fM2723f / f4;
        ImageView.ScaleType scaleType = this.f5449G;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f5461p.postTranslate((fM2724i - f2) / 2.0f, (fM2723f - f4) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f3, f5);
            this.f5461p.postScale(fMax, fMax);
            this.f5461p.postTranslate((fM2724i - (f2 * fMax)) / 2.0f, (fM2723f - (f4 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f3, f5));
            this.f5461p.postScale(fMin, fMin);
            this.f5461p.postTranslate((fM2724i - (f2 * fMin)) / 2.0f, (fM2723f - (f4 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM2724i, fM2723f);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f4, f2);
            }
            int i = d.f5475a[this.f5449G.ordinal()];
            if (i == 1) {
                this.f5461p.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                this.f5461p.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.f5461p.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.f5461p.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m2726m();
    }
}
