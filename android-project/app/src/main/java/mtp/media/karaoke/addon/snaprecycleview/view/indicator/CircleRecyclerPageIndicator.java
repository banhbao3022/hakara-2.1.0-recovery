package mtp.media.karaoke.addon.snaprecycleview.view.indicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import mtp.media.karaoke.R;
import p555j.p556a.p557a.C6879f;
import p555j.p556a.p557a.p597g.p601d.p603f.p604a.BaseRecyclerPageIndicator;

/* JADX INFO: loaded from: classes.dex */
public class CircleRecyclerPageIndicator extends BaseRecyclerPageIndicator {

    /* JADX INFO: renamed from: k */
    public float f33471k;

    /* JADX INFO: renamed from: l */
    public final Paint f33472l;

    /* JADX INFO: renamed from: m */
    public final Paint f33473m;

    /* JADX INFO: renamed from: n */
    public final Paint f33474n;

    /* JADX INFO: renamed from: o */
    public int f33475o;

    /* JADX INFO: renamed from: p */
    public boolean f33476p;

    /* JADX INFO: renamed from: mtp.media.karaoke.addon.snaprecycleview.view.indicator.CircleRecyclerPageIndicator$b */
    public static class C7240b extends View.BaseSavedState {
        public static final Parcelable.Creator<C7240b> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public int f33477f;

        /* JADX INFO: renamed from: mtp.media.karaoke.addon.snaprecycleview.view.indicator.CircleRecyclerPageIndicator$b$a */
        public class a implements Parcelable.Creator<C7240b> {
            @Override // android.os.Parcelable.Creator
            public C7240b createFromParcel(Parcel parcel) {
                return new C7240b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public C7240b[] newArray(int i) {
                return new C7240b[i];
            }
        }

        public C7240b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f33477f);
        }

        public C7240b(Parcel parcel, C7239a c7239a) {
            super(parcel);
            this.f33477f = parcel.readInt();
        }
    }

    public CircleRecyclerPageIndicator(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    public final int m14344e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.f32193f == null) {
            return size;
        }
        int iM14028d = m14028d();
        float paddingRight = getPaddingRight() + getPaddingLeft();
        float f = this.f33471k;
        int i2 = (int) (((iM14028d - 1) * f) + (iM14028d * 2 * f) + paddingRight + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    /* JADX INFO: renamed from: f */
    public final int m14345f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f33471k * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public int getFillColor() {
        return this.f33474n.getColor();
    }

    public int getOrientation() {
        return this.f33475o;
    }

    public int getPageColor() {
        return this.f33472l.getColor();
    }

    public float getRadius() {
        return this.f33471k;
    }

    public int getStrokeColor() {
        return this.f33473m.getColor();
    }

    public float getStrokeWidth() {
        return this.f33473m.getStrokeWidth();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int iM14028d;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f32193f == null || (iM14028d = m14028d()) == 0) {
            return;
        }
        if (this.f32196i >= iM14028d) {
            setCurrentItem(iM14028d - 1);
            return;
        }
        if (this.f33475o == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float strokeWidth = this.f33471k;
        float f3 = 3.0f * strokeWidth;
        float f4 = paddingLeft + strokeWidth;
        float f5 = paddingTop + strokeWidth;
        if (this.f33476p) {
            f5 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((iM14028d * f3) / 2.0f);
        }
        if (this.f33473m.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.f33473m.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < iM14028d; i++) {
            float f6 = (i * f3) + f5;
            if (this.f33475o == 0) {
                f2 = f4;
            } else {
                f2 = f6;
                f6 = f4;
            }
            if (this.f33472l.getAlpha() > 0) {
                canvas.drawCircle(f6, f2, strokeWidth, this.f33472l);
            }
            float f7 = this.f33471k;
            if (strokeWidth != f7) {
                canvas.drawCircle(f6, f2, f7, this.f33473m);
            }
        }
        float f8 = this.f32196i * f3;
        if (this.f33475o == 0) {
            float f9 = f5 + f8;
            f = f4;
            f4 = f9;
        } else {
            f = f5 + f8;
        }
        canvas.drawCircle(f4, f, this.f33471k, this.f33474n);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f33475o == 0) {
            setMeasuredDimension(m14344e(i), m14345f(i2));
        } else {
            setMeasuredDimension(m14345f(i), m14344e(i2));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C7240b c7240b = (C7240b) parcelable;
        super.onRestoreInstanceState(c7240b.getSuperState());
        this.f32196i = c7240b.f33477f;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C7240b c7240b = new C7240b(super.onSaveInstanceState());
        c7240b.f33477f = this.f32196i;
        return c7240b;
    }

    public void setCentered(boolean z) {
        this.f33476p = z;
        invalidate();
    }

    public void setFillColor(int i) {
        this.f33474n.setColor(i);
        invalidate();
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.f33475o = i;
        requestLayout();
    }

    public void setPageColor(int i) {
        this.f33472l.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.f33471k = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f33473m.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f33473m.setStrokeWidth(f);
        invalidate();
    }

    public CircleRecyclerPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CircleRecyclerPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f33472l = paint;
        Paint paint2 = new Paint(1);
        this.f33473m = paint2;
        Paint paint3 = new Paint(1);
        this.f33474n = paint3;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_circle_indicator_page_color);
        int color2 = resources.getColor(R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R.dimen.default_circle_indicator_radius);
        boolean z = resources.getBoolean(R.bool.default_circle_indicator_centered);
        boolean z2 = resources.getBoolean(R.bool.default_circle_indicator_snap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6879f.f32093b, i, 0);
        this.f33476p = typedArrayObtainStyledAttributes.getBoolean(2, z);
        this.f33475o = typedArrayObtainStyledAttributes.getInt(0, integer);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(4, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(7, color3));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(8, dimension));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(3, color2));
        this.f33471k = typedArrayObtainStyledAttributes.getDimension(5, dimension2);
        typedArrayObtainStyledAttributes.getBoolean(6, z2);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
