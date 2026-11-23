package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4801b;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public TextView f29017f;

    /* JADX INFO: renamed from: g */
    public Button f29018g;

    /* JADX INFO: renamed from: h */
    public int f29019h;

    /* JADX INFO: renamed from: i */
    public int f29020i;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12815a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f29017f.getPaddingTop() == i2 && this.f29017f.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f29017f;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f29018g;
    }

    public TextView getMessageView() {
        return this.f29017f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f29017f = (TextView) findViewById(R.id.snackbar_text);
        this.f29018g = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f29019h > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.f29019h;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z = false;
        boolean z2 = this.f29017f.getLayout().getLineCount() > 1;
        if (!z2 || this.f29020i <= 0 || this.f29018g.getMeasuredWidth() <= this.f29020i) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (m12815a(0, dimensionPixelSize, dimensionPixelSize)) {
                z = true;
            }
        } else if (m12815a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.f29020i = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24739K);
        this.f29019h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f29020i = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
