package mtp.media.karaoke.addon.seekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import mtp.media.karaoke.R;
import p555j.p556a.p557a.C6879f;

/* JADX INFO: loaded from: classes.dex */
public class StartPointSeekBar extends View {

    /* JADX INFO: renamed from: f */
    public static final Paint f33450f = new Paint(1);

    /* JADX INFO: renamed from: g */
    public static final int f33451g = Color.argb(255, 51, 181, 229);

    /* JADX INFO: renamed from: h */
    public double f33452h;

    /* JADX INFO: renamed from: i */
    public double f33453i;

    /* JADX INFO: renamed from: j */
    public final Bitmap f33454j;

    /* JADX INFO: renamed from: k */
    public final Bitmap f33455k;

    /* JADX INFO: renamed from: l */
    public final int f33456l;

    /* JADX INFO: renamed from: m */
    public final int f33457m;

    /* JADX INFO: renamed from: n */
    public final float f33458n;

    /* JADX INFO: renamed from: o */
    public final float f33459o;

    /* JADX INFO: renamed from: p */
    public final float f33460p;

    /* JADX INFO: renamed from: q */
    public final float f33461q;

    /* JADX INFO: renamed from: r */
    public final float f33462r;

    /* JADX INFO: renamed from: s */
    public int f33463s;

    /* JADX INFO: renamed from: t */
    public boolean f33464t;

    /* JADX INFO: renamed from: u */
    public boolean f33465u;

    /* JADX INFO: renamed from: v */
    public double f33466v;

    /* JADX INFO: renamed from: w */
    public boolean f33467w;

    /* JADX INFO: renamed from: x */
    public InterfaceC7238a f33468x;

    /* JADX INFO: renamed from: y */
    public float f33469y;

    /* JADX INFO: renamed from: z */
    public int f33470z;

    /* JADX INFO: renamed from: mtp.media.karaoke.addon.seekbar.StartPointSeekBar$a */
    public interface InterfaceC7238a {
        /* JADX INFO: renamed from: a */
        void mo13875a(StartPointSeekBar startPointSeekBar, double d, boolean z);
    }

    public StartPointSeekBar(Context context) {
        this(context, null);
    }

    private void setNormalizedValue(double d) {
        this.f33466v = Math.max(0.0d, d);
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    public final float m14340a(double d) {
        return (float) ((d * ((double) (getWidth() - (this.f33462r * 2.0f)))) + ((double) this.f33462r));
    }

    /* JADX INFO: renamed from: b */
    public final double m14341b(double d) {
        double d2 = this.f33452h;
        return ((this.f33453i - d2) * d) + d2;
    }

    /* JADX INFO: renamed from: c */
    public final void m14342c(MotionEvent motionEvent) {
        float x = motionEvent.getX(motionEvent.findPointerIndex(this.f33470z));
        float width = getWidth();
        float f = this.f33462r;
        float f2 = 2.0f * f;
        setNormalizedValue(width > f2 ? Math.min(1.0d, Math.max(0.0d, (x - f) / (width - f2))) : 0.0d);
    }

    /* JADX INFO: renamed from: d */
    public final double m14343d(double d) {
        double d2 = this.f33453i;
        double d3 = this.f33452h;
        if (0.0d == d2 - d3) {
            return 0.0d;
        }
        return (d - d3) / (d2 - d3);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(this.f33462r, (getHeight() - this.f33461q) * 0.5f, getWidth() - this.f33462r, (getHeight() + this.f33461q) * 0.5f);
        Paint paint = f33450f;
        paint.setColor(this.f33457m);
        canvas.drawRect(rectF, paint);
        if (m14340a(m14343d(0.0d)) < m14340a(this.f33466v)) {
            Log.d("View", "thumb: right");
            rectF.left = m14340a(m14343d(0.0d));
            rectF.right = m14340a(this.f33466v);
        } else {
            Log.d("View", "thumb: left");
            rectF.right = m14340a(m14343d(0.0d));
            rectF.left = m14340a(this.f33466v);
        }
        paint.setColor(this.f33456l);
        canvas.drawRect(rectF, paint);
        canvas.drawBitmap(this.f33465u ? this.f33455k : this.f33454j, m14340a(this.f33466v) - this.f33459o, (getHeight() * 0.5f) - this.f33460p, paint);
        Log.d("View", "thumb: " + m14341b(this.f33466v));
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getMode(i) != 0 ? View.MeasureSpec.getSize(i) : 200;
        int height = this.f33454j.getHeight();
        if (View.MeasureSpec.getMode(i2) != 0) {
            height = Math.min(height, View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(size, height);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC7238a interfaceC7238a;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            int pointerId = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            this.f33470z = pointerId;
            float x = motionEvent.getX(motionEvent.findPointerIndex(pointerId));
            this.f33469y = x;
            boolean z = Math.abs(x - m14340a(this.f33466v)) <= this.f33459o;
            this.f33465u = z;
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            setPressed(true);
            invalidate();
            this.f33464t = true;
            m14342c(motionEvent);
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1) {
            if (this.f33464t) {
                m14342c(motionEvent);
                this.f33464t = false;
                setPressed(false);
            } else {
                this.f33464t = true;
                m14342c(motionEvent);
                this.f33464t = false;
            }
            this.f33465u = false;
            invalidate();
            InterfaceC7238a interfaceC7238a2 = this.f33468x;
            if (interfaceC7238a2 != null) {
                interfaceC7238a2.mo13875a(this, m14341b(this.f33466v), true);
            }
        } else if (action != 2) {
            if (action == 3) {
                if (this.f33464t) {
                    this.f33464t = false;
                    setPressed(false);
                }
                invalidate();
            } else if (action == 5) {
                int pointerCount = motionEvent.getPointerCount() - 1;
                this.f33469y = motionEvent.getX(pointerCount);
                this.f33470z = motionEvent.getPointerId(pointerCount);
                invalidate();
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f33470z) {
                    int i = action2 == 0 ? 1 : 0;
                    this.f33469y = motionEvent.getX(i);
                    this.f33470z = motionEvent.getPointerId(i);
                }
                invalidate();
            }
        } else if (this.f33465u) {
            if (this.f33464t) {
                m14342c(motionEvent);
            } else if (Math.abs(motionEvent.getX(motionEvent.findPointerIndex(this.f33470z)) - this.f33469y) > this.f33463s) {
                setPressed(true);
                invalidate();
                this.f33464t = true;
                m14342c(motionEvent);
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            if (this.f33467w && (interfaceC7238a = this.f33468x) != null) {
                interfaceC7238a.mo13875a(this, m14341b(this.f33466v), false);
            }
        }
        return true;
    }

    public void setOnSeekBarChangeListener(InterfaceC7238a interfaceC7238a) {
        this.f33468x = interfaceC7238a;
    }

    public void setProgress(double d) {
        double dM14343d = m14343d(d);
        if (dM14343d > this.f33453i || dM14343d < this.f33452h) {
            throw new IllegalArgumentException("Value should be in the middle of max and min value");
        }
        this.f33466v = dM14343d;
        invalidate();
    }

    public StartPointSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StartPointSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33466v = 0.0d;
        this.f33467w = true;
        this.f33470z = 255;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6879f.f32094c, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(4);
        Bitmap bitmap = ((BitmapDrawable) (drawable == null ? getResources().getDrawable(R.drawable.seek_thumb_normal) : drawable)).getBitmap();
        this.f33454j = bitmap;
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
        this.f33455k = ((BitmapDrawable) (drawable2 == null ? getResources().getDrawable(R.drawable.seek_thumb_pressed) : drawable2)).getBitmap();
        this.f33452h = typedArrayObtainStyledAttributes.getFloat(3, -100.0f);
        this.f33453i = typedArrayObtainStyledAttributes.getFloat(2, 100.0f);
        this.f33457m = typedArrayObtainStyledAttributes.getColor(0, -7829368);
        this.f33456l = typedArrayObtainStyledAttributes.getColor(1, f33451g);
        typedArrayObtainStyledAttributes.recycle();
        float width = bitmap.getWidth();
        this.f33458n = width;
        float f = width * 0.5f;
        this.f33459o = f;
        float height = bitmap.getHeight() * 0.5f;
        this.f33460p = height;
        this.f33461q = height * 0.2f;
        this.f33462r = f;
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f33463s = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
