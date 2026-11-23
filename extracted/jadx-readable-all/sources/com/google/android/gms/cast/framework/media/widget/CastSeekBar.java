package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p266d.p290d.p291r.C2434g;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.p294j.C2477a;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class CastSeekBar extends View {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f28628f = 0;

    /* JADX INFO: renamed from: g */
    public C5896c f28629g;

    /* JADX INFO: renamed from: h */
    public List<C5894a> f28630h;

    /* JADX INFO: renamed from: i */
    public final float f28631i;

    /* JADX INFO: renamed from: j */
    public final float f28632j;

    /* JADX INFO: renamed from: k */
    public final float f28633k;

    /* JADX INFO: renamed from: l */
    public final float f28634l;

    /* JADX INFO: renamed from: m */
    public final float f28635m;

    /* JADX INFO: renamed from: n */
    public final Paint f28636n;

    /* JADX INFO: renamed from: o */
    public final int f28637o;

    /* JADX INFO: renamed from: p */
    public final int f28638p;

    /* JADX INFO: renamed from: q */
    public final int f28639q;

    /* JADX INFO: renamed from: r */
    public final int f28640r;

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.widget.CastSeekBar$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static class C5894a {

        /* JADX INFO: renamed from: a */
        public int f28641a;

        public C5894a(int i) {
            this.f28641a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5894a) && this.f28641a == ((C5894a) obj).f28641a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.f28641a).hashCode();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.widget.CastSeekBar$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class C5895b extends View.AccessibilityDelegate {
        public C5895b(C2477a c2477a) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SeekBar.class.getName());
            accessibilityEvent.setItemCount(CastSeekBar.this.f28629g.f28643a);
            accessibilityEvent.setCurrentItemIndex(CastSeekBar.this.getProgress());
        }

        @Override // android.view.View.AccessibilityDelegate
        @TargetApi(16)
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(SeekBar.class.getName());
            if (view.isEnabled()) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        @TargetApi(16)
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (!view.isEnabled()) {
                return false;
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096 || i == 8192) {
                CastSeekBar castSeekBar = CastSeekBar.this;
                int i2 = CastSeekBar.f28628f;
                Objects.requireNonNull(castSeekBar);
                CastSeekBar castSeekBar2 = CastSeekBar.this;
                int i3 = castSeekBar2.f28629g.f28643a / 20;
                castSeekBar2.getProgress();
                Objects.requireNonNull(castSeekBar2.f28629g);
                Objects.requireNonNull(CastSeekBar.this);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.widget.CastSeekBar$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static class C5896c {

        /* JADX INFO: renamed from: a */
        public int f28643a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5896c)) {
                return false;
            }
            C5896c c5896c = (C5896c) obj;
            Objects.requireNonNull(c5896c);
            return this.f28643a == c5896c.f28643a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.f28643a), 0, 0, 0, Boolean.FALSE});
        }
    }

    public CastSeekBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m12653a(Canvas canvas, int i, int i2, int i3, int i4) {
        this.f28636n.setColor(i4);
        float f = this.f28629g.f28643a;
        float f2 = i3;
        float f3 = this.f28633k;
        canvas.drawRect(((i * 1.0f) / f) * f2, -f3, ((i2 * 1.0f) / f) * f2, f3, this.f28636n);
    }

    public int getMaxProgress() {
        return this.f28629g.f28643a;
    }

    public int getProgress() {
        Objects.requireNonNull(this.f28629g);
        return 0;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int iSave = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int iSave2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        Objects.requireNonNull(this.f28629g);
        Objects.requireNonNull(this.f28629g);
        int iMax = Math.max(0, 0);
        if (iMax > 0) {
            m12653a(canvas, 0, iMax, measuredWidth, this.f28639q);
        }
        if (progress > iMax) {
            m12653a(canvas, iMax, progress, measuredWidth, this.f28637o);
        }
        int i2 = this.f28629g.f28643a;
        if (i2 > progress) {
            m12653a(canvas, progress, i2, measuredWidth, this.f28639q);
        }
        canvas.restoreToCount(iSave2);
        List<C5894a> list = this.f28630h;
        if (list != null && !list.isEmpty()) {
            this.f28636n.setColor(this.f28640r);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            for (C5894a c5894a : this.f28630h) {
                if (c5894a != null && (i = c5894a.f28641a) >= 0) {
                    canvas.drawCircle((Math.min(i, this.f28629g.f28643a) * measuredWidth2) / this.f28629g.f28643a, measuredHeight2 / 2, this.f28635m, this.f28636n);
                }
            }
        }
        if (isEnabled()) {
            Objects.requireNonNull(this.f28629g);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f28631i + getPaddingLeft() + getPaddingRight()), i, 0), View.resolveSizeAndState((int) (this.f28632j + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        Objects.requireNonNull(this.f28629g);
        return false;
    }

    public final void setAdBreaks(List<C5894a> list) {
        if (C2622l.m5459y(this.f28630h, list)) {
            return;
        }
        this.f28630h = list == null ? null : new ArrayList(list);
        postInvalidate();
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28630h = new ArrayList();
        setAccessibilityDelegate(new C5895b(null));
        Paint paint = new Paint(1);
        this.f28636n = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f28631i = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.f28632j = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.f28633k = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        this.f28634l = context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size) / 2.0f;
        this.f28635m = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_radius);
        C5896c c5896c = new C5896c();
        this.f28629g = c5896c;
        c5896c.f28643a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C2434g.f11185a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f28637o = context.getResources().getColor(resourceId);
        this.f28638p = context.getResources().getColor(resourceId2);
        this.f28639q = context.getResources().getColor(resourceId3);
        this.f28640r = context.getResources().getColor(resourceId4);
        typedArrayObtainStyledAttributes.recycle();
    }
}
