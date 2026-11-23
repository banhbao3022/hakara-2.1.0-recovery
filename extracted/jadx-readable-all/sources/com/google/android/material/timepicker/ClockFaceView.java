package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p343e0.RadialViewGroup;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public class ClockFaceView extends RadialViewGroup implements ClockHandView.InterfaceC5987c {

    /* JADX INFO: renamed from: B */
    public final ClockHandView f29204B;

    /* JADX INFO: renamed from: C */
    public final Rect f29205C;

    /* JADX INFO: renamed from: D */
    public final RectF f29206D;

    /* JADX INFO: renamed from: E */
    public final SparseArray<TextView> f29207E;

    /* JADX INFO: renamed from: F */
    public final AccessibilityDelegateCompat f29208F;

    /* JADX INFO: renamed from: G */
    public final int[] f29209G;

    /* JADX INFO: renamed from: H */
    public final float[] f29210H;

    /* JADX INFO: renamed from: I */
    public final int f29211I;

    /* JADX INFO: renamed from: J */
    public String[] f29212J;

    /* JADX INFO: renamed from: K */
    public float f29213K;

    /* JADX INFO: renamed from: L */
    public final ColorStateList f29214L;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    public class ViewTreeObserverOnPreDrawListenerC5983a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC5983a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ClockFaceView.this.getHeight() / 2;
            ClockFaceView clockFaceView = ClockFaceView.this;
            int i = (height - clockFaceView.f29204B.f29224m) - clockFaceView.f29211I;
            if (i != clockFaceView.f24974z) {
                clockFaceView.f24974z = i;
                clockFaceView.m11107k();
                ClockHandView clockHandView = clockFaceView.f29204B;
                clockHandView.f29232u = clockFaceView.f24974z;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    public class C5984b extends AccessibilityDelegateCompat {
        public C5984b() {
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (iIntValue > 0) {
                TextView textView = ClockFaceView.this.f29207E.get(iIntValue - 1);
                if (Build.VERSION.SDK_INT >= 22) {
                    accessibilityNodeInfoCompat.f38018b.setTraversalAfter(textView);
                }
            }
            accessibilityNodeInfoCompat.m16273q(AccessibilityNodeInfoCompat.c.m16278a(0, 1, iIntValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC5987c
    /* JADX INFO: renamed from: a */
    public void mo12889a(float f, boolean z) {
        if (Math.abs(this.f29213K - f) > 0.001f) {
            this.f29213K = f;
            m12890l();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m12890l() {
        RectF rectF = this.f29204B.f29227p;
        for (int i = 0; i < this.f29207E.size(); i++) {
            TextView textView = this.f29207E.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f29205C);
                this.f29205C.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f29205C);
                this.f29206D.set(this.f29205C);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.f29206D) ? null : new RadialGradient(rectF.centerX() - this.f29206D.left, rectF.centerY() - this.f29206D.top, 0.5f * rectF.width(), this.f29209G, this.f29210H, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) AccessibilityNodeInfoCompat.b.m16277a(1, this.f29212J.length, false, 1).f38033a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m12890l();
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29205C = new Rect();
        this.f29206D = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f29207E = sparseArray;
        this.f29210H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24755j, i, 2132017960);
        Resources resources = getResources();
        ColorStateList colorStateListM10961L = C4799a.m10961L(context, typedArrayObtainStyledAttributes, 1);
        this.f29214L = colorStateListM10961L;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f29204B = clockHandView;
        this.f29211I = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM10961L.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM10961L.getDefaultColor());
        this.f29209G = new int[]{colorForState, colorForState, colorStateListM10961L.getDefaultColor()};
        clockHandView.f29223l.add(this);
        int defaultColor = AppCompatResources.m14706a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM10961L2 = C4799a.m10961L(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM10961L2 != null ? colorStateListM10961L2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC5983a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f29208F = new C5984b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f29212J = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.f29212J.length, size); i2++) {
            TextView textView = this.f29207E.get(i2);
            if (i2 >= this.f29212J.length) {
                removeView(textView);
                this.f29207E.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.f29207E.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f29212J[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                ViewCompat.m16327u(textView, this.f29208F);
                textView.setTextColor(this.f29214L);
            }
        }
    }
}
