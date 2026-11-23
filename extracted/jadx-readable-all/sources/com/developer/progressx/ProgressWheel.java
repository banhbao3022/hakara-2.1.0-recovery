package com.developer.progressx;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import p007c.p151i.p153b.C0961a;

/* JADX INFO: loaded from: classes.dex */
public class ProgressWheel extends View {

    /* JADX INFO: renamed from: A */
    public boolean f28247A;

    /* JADX INFO: renamed from: f */
    public int f28248f;

    /* JADX INFO: renamed from: g */
    public int f28249g;

    /* JADX INFO: renamed from: h */
    public int f28250h;

    /* JADX INFO: renamed from: i */
    public boolean f28251i;

    /* JADX INFO: renamed from: j */
    public double f28252j;

    /* JADX INFO: renamed from: k */
    public double f28253k;

    /* JADX INFO: renamed from: l */
    public float f28254l;

    /* JADX INFO: renamed from: m */
    public boolean f28255m;

    /* JADX INFO: renamed from: n */
    public long f28256n;

    /* JADX INFO: renamed from: o */
    public int f28257o;

    /* JADX INFO: renamed from: p */
    public int f28258p;

    /* JADX INFO: renamed from: q */
    public final Paint f28259q;

    /* JADX INFO: renamed from: r */
    public final Paint f28260r;

    /* JADX INFO: renamed from: s */
    public RectF f28261s;

    /* JADX INFO: renamed from: t */
    public float f28262t;

    /* JADX INFO: renamed from: u */
    public long f28263u;

    /* JADX INFO: renamed from: v */
    public boolean f28264v;

    /* JADX INFO: renamed from: w */
    public float f28265w;

    /* JADX INFO: renamed from: x */
    public float f28266x;

    /* JADX INFO: renamed from: y */
    public boolean f28267y;

    /* JADX INFO: renamed from: z */
    public InterfaceC5804b f28268z;

    /* JADX INFO: renamed from: com.developer.progressx.ProgressWheel$b */
    public interface InterfaceC5804b {
        /* JADX INFO: renamed from: a */
        void m12583a(float f);
    }

    /* JADX INFO: renamed from: com.developer.progressx.ProgressWheel$c */
    public static class C5805c extends View.BaseSavedState {
        public static final Parcelable.Creator<C5805c> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public float f28269f;

        /* JADX INFO: renamed from: g */
        public float f28270g;

        /* JADX INFO: renamed from: h */
        public boolean f28271h;

        /* JADX INFO: renamed from: i */
        public float f28272i;

        /* JADX INFO: renamed from: j */
        public int f28273j;

        /* JADX INFO: renamed from: k */
        public int f28274k;

        /* JADX INFO: renamed from: l */
        public int f28275l;

        /* JADX INFO: renamed from: m */
        public int f28276m;

        /* JADX INFO: renamed from: n */
        public int f28277n;

        /* JADX INFO: renamed from: o */
        public boolean f28278o;

        /* JADX INFO: renamed from: p */
        public boolean f28279p;

        /* JADX INFO: renamed from: com.developer.progressx.ProgressWheel$c$a */
        public static class a implements Parcelable.Creator<C5805c> {
            @Override // android.os.Parcelable.Creator
            public C5805c createFromParcel(Parcel parcel) {
                return new C5805c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public C5805c[] newArray(int i) {
                return new C5805c[i];
            }
        }

        public C5805c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f28269f);
            parcel.writeFloat(this.f28270g);
            parcel.writeByte(this.f28271h ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.f28272i);
            parcel.writeInt(this.f28273j);
            parcel.writeInt(this.f28274k);
            parcel.writeInt(this.f28275l);
            parcel.writeInt(this.f28276m);
            parcel.writeInt(this.f28277n);
            parcel.writeByte(this.f28278o ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f28279p ? (byte) 1 : (byte) 0);
        }

        public C5805c(Parcel parcel, C5803a c5803a) {
            super(parcel);
            this.f28269f = parcel.readFloat();
            this.f28270g = parcel.readFloat();
            this.f28271h = parcel.readByte() != 0;
            this.f28272i = parcel.readFloat();
            this.f28273j = parcel.readInt();
            this.f28274k = parcel.readInt();
            this.f28275l = parcel.readInt();
            this.f28276m = parcel.readInt();
            this.f28277n = parcel.readInt();
            this.f28278o = parcel.readByte() != 0;
            this.f28279p = parcel.readByte() != 0;
        }
    }

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28248f = 28;
        this.f28249g = 4;
        this.f28250h = 4;
        this.f28251i = false;
        this.f28252j = 0.0d;
        this.f28253k = 460.0d;
        this.f28254l = 0.0f;
        this.f28255m = true;
        this.f28256n = 0L;
        this.f28257o = -1442840576;
        this.f28258p = 16777215;
        this.f28259q = new Paint();
        this.f28260r = new Paint();
        this.f28261s = new RectF();
        this.f28262t = 230.0f;
        this.f28263u = 0L;
        this.f28265w = 0.0f;
        this.f28266x = 0.0f;
        this.f28267y = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0961a.f4406a);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f28249g = (int) TypedValue.applyDimension(1, this.f28249g, displayMetrics);
        this.f28250h = (int) TypedValue.applyDimension(1, this.f28250h, displayMetrics);
        int iApplyDimension = (int) TypedValue.applyDimension(1, this.f28248f, displayMetrics);
        this.f28248f = iApplyDimension;
        this.f28248f = (int) typedArrayObtainStyledAttributes.getDimension(3, iApplyDimension);
        this.f28251i = typedArrayObtainStyledAttributes.getBoolean(4, false);
        this.f28249g = (int) typedArrayObtainStyledAttributes.getDimension(2, this.f28249g);
        this.f28250h = (int) typedArrayObtainStyledAttributes.getDimension(8, this.f28250h);
        this.f28262t = typedArrayObtainStyledAttributes.getFloat(9, this.f28262t / 360.0f) * 360.0f;
        this.f28253k = typedArrayObtainStyledAttributes.getInt(1, (int) this.f28253k);
        this.f28257o = typedArrayObtainStyledAttributes.getColor(0, this.f28257o);
        this.f28258p = typedArrayObtainStyledAttributes.getColor(7, this.f28258p);
        this.f28264v = typedArrayObtainStyledAttributes.getBoolean(5, false);
        if (typedArrayObtainStyledAttributes.getBoolean(6, false)) {
            this.f28263u = SystemClock.uptimeMillis();
            this.f28267y = true;
            invalidate();
        }
        typedArrayObtainStyledAttributes.recycle();
        m12581b();
    }

    /* JADX INFO: renamed from: a */
    public final void m12580a() {
        if (this.f28268z != null) {
            this.f28268z.m12583a(Math.round((this.f28265w * 100.0f) / 360.0f) / 100.0f);
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public final void m12581b() {
        this.f28247A = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final void m12582c() {
        this.f28259q.setColor(this.f28257o);
        this.f28259q.setAntiAlias(true);
        this.f28259q.setStyle(Paint.Style.STROKE);
        this.f28259q.setStrokeWidth(this.f28249g);
        this.f28260r.setColor(this.f28258p);
        this.f28260r.setAntiAlias(true);
        this.f28260r.setStyle(Paint.Style.STROKE);
        this.f28260r.setStrokeWidth(this.f28250h);
    }

    public int getBarColor() {
        return this.f28257o;
    }

    public int getBarWidth() {
        return this.f28249g;
    }

    public int getCircleRadius() {
        return this.f28248f;
    }

    public float getProgress() {
        if (this.f28267y) {
            return -1.0f;
        }
        return this.f28265w / 360.0f;
    }

    public int getRimColor() {
        return this.f28258p;
    }

    public int getRimWidth() {
        return this.f28250h;
    }

    public float getSpinSpeed() {
        return this.f28262t / 360.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        canvas.drawArc(this.f28261s, 360.0f, 360.0f, false, this.f28260r);
        if (this.f28247A) {
            float fPow = 0.0f;
            boolean z = true;
            if (this.f28267y) {
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f28263u;
                float f3 = (jUptimeMillis * this.f28262t) / 1000.0f;
                long j2 = this.f28256n;
                if (j2 >= 200) {
                    double d = this.f28252j + jUptimeMillis;
                    this.f28252j = d;
                    double d2 = this.f28253k;
                    if (d > d2) {
                        this.f28252j = d - d2;
                        this.f28256n = 0L;
                        this.f28255m = !this.f28255m;
                    }
                    float fCos = (((float) Math.cos(((this.f28252j / d2) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    float f4 = 254;
                    if (this.f28255m) {
                        this.f28254l = fCos * f4;
                    } else {
                        float f5 = (1.0f - fCos) * f4;
                        this.f28265w = (this.f28254l - f5) + this.f28265w;
                        this.f28254l = f5;
                    }
                } else {
                    this.f28256n = j2 + jUptimeMillis;
                }
                float f6 = this.f28265w + f3;
                this.f28265w = f6;
                if (f6 > 360.0f) {
                    this.f28265w = f6 - 360.0f;
                    InterfaceC5804b interfaceC5804b = this.f28268z;
                    if (interfaceC5804b != null) {
                        interfaceC5804b.m12583a(-1.0f);
                    }
                }
                this.f28263u = SystemClock.uptimeMillis();
                float f7 = this.f28265w - 90.0f;
                float f8 = this.f28254l + 16.0f;
                if (isInEditMode()) {
                    f = 0.0f;
                    f2 = 135.0f;
                } else {
                    f = f7;
                    f2 = f8;
                }
                canvas.drawArc(this.f28261s, f, f2, false, this.f28259q);
            } else {
                float f9 = this.f28265w;
                if (f9 != this.f28266x) {
                    this.f28265w = Math.min(this.f28265w + (((SystemClock.uptimeMillis() - this.f28263u) / 1000.0f) * this.f28262t), this.f28266x);
                    this.f28263u = SystemClock.uptimeMillis();
                } else {
                    z = false;
                }
                if (f9 != this.f28265w) {
                    m12580a();
                }
                float fPow2 = this.f28265w;
                if (!this.f28264v) {
                    fPow = ((float) (1.0d - Math.pow(1.0f - (fPow2 / 360.0f), 4.0f))) * 360.0f;
                    fPow2 = ((float) (1.0d - Math.pow(1.0f - (this.f28265w / 360.0f), 2.0f))) * 360.0f;
                }
                canvas.drawArc(this.f28261s, fPow - 90.0f, isInEditMode() ? 360.0f : fPow2, false, this.f28259q);
            }
            if (z) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.f28248f;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f28248f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingRight = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5805c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5805c c5805c = (C5805c) parcelable;
        super.onRestoreInstanceState(c5805c.getSuperState());
        this.f28265w = c5805c.f28269f;
        this.f28266x = c5805c.f28270g;
        this.f28267y = c5805c.f28271h;
        this.f28262t = c5805c.f28272i;
        this.f28249g = c5805c.f28273j;
        this.f28257o = c5805c.f28274k;
        this.f28250h = c5805c.f28275l;
        this.f28258p = c5805c.f28276m;
        this.f28248f = c5805c.f28277n;
        this.f28264v = c5805c.f28278o;
        this.f28251i = c5805c.f28279p;
        this.f28263u = SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C5805c c5805c = new C5805c(super.onSaveInstanceState());
        c5805c.f28269f = this.f28265w;
        c5805c.f28270g = this.f28266x;
        c5805c.f28271h = this.f28267y;
        c5805c.f28272i = this.f28262t;
        c5805c.f28273j = this.f28249g;
        c5805c.f28274k = this.f28257o;
        c5805c.f28275l = this.f28250h;
        c5805c.f28276m = this.f28258p;
        c5805c.f28277n = this.f28248f;
        c5805c.f28278o = this.f28264v;
        c5805c.f28279p = this.f28251i;
        return c5805c;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f28251i) {
            int i5 = this.f28249g;
            this.f28261s = new RectF(paddingLeft + i5, paddingTop + i5, (i - paddingRight) - i5, (i2 - paddingBottom) - i5);
        } else {
            int i6 = (i - paddingLeft) - paddingRight;
            int iMin = Math.min(Math.min(i6, (i2 - paddingBottom) - paddingTop), (this.f28248f * 2) - (this.f28249g * 2));
            int i7 = ((i6 - iMin) / 2) + paddingLeft;
            int i8 = ((((i2 - paddingTop) - paddingBottom) - iMin) / 2) + paddingTop;
            int i9 = this.f28249g;
            this.f28261s = new RectF(i7 + i9, i8 + i9, (i7 + iMin) - i9, (i8 + iMin) - i9);
        }
        m12582c();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f28263u = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i) {
        this.f28257o = i;
        m12582c();
        if (this.f28267y) {
            return;
        }
        invalidate();
    }

    public void setBarWidth(int i) {
        this.f28249g = i;
        if (this.f28267y) {
            return;
        }
        invalidate();
    }

    public void setCallback(InterfaceC5804b interfaceC5804b) {
        this.f28268z = interfaceC5804b;
        if (this.f28267y) {
            return;
        }
        m12580a();
    }

    public void setCircleRadius(int i) {
        this.f28248f = i;
        if (this.f28267y) {
            return;
        }
        invalidate();
    }

    public void setInstantProgress(float f) {
        if (this.f28267y) {
            this.f28265w = 0.0f;
            this.f28267y = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f == this.f28266x) {
            return;
        }
        float fMin = Math.min(f * 360.0f, 360.0f);
        this.f28266x = fMin;
        this.f28265w = fMin;
        this.f28263u = SystemClock.uptimeMillis();
        invalidate();
    }

    public void setLinearProgress(boolean z) {
        this.f28264v = z;
        if (this.f28267y) {
            return;
        }
        invalidate();
    }

    public void setProgress(float f) {
        if (this.f28267y) {
            this.f28265w = 0.0f;
            this.f28267y = false;
            m12580a();
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f28266x;
        if (f == f2) {
            return;
        }
        if (this.f28265w == f2) {
            this.f28263u = SystemClock.uptimeMillis();
        }
        this.f28266x = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    public void setRimColor(int i) {
        this.f28258p = i;
        m12582c();
        if (this.f28267y) {
            return;
        }
        invalidate();
    }

    public void setRimWidth(int i) {
        this.f28250h = i;
        if (this.f28267y) {
            return;
        }
        invalidate();
    }

    public void setSpinSpeed(float f) {
        this.f28262t = f * 360.0f;
    }

    public ProgressWheel(Context context) {
        super(context);
        this.f28248f = 28;
        this.f28249g = 4;
        this.f28250h = 4;
        this.f28251i = false;
        this.f28252j = 0.0d;
        this.f28253k = 460.0d;
        this.f28254l = 0.0f;
        this.f28255m = true;
        this.f28256n = 0L;
        this.f28257o = -1442840576;
        this.f28258p = 16777215;
        this.f28259q = new Paint();
        this.f28260r = new Paint();
        this.f28261s = new RectF();
        this.f28262t = 230.0f;
        this.f28263u = 0L;
        this.f28265w = 0.0f;
        this.f28266x = 0.0f;
        this.f28267y = false;
        m12581b();
    }
}
