package com.devbrackets.android.exomedia.p474ui.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: compiled from: FitsSystemWindowRelativeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FitsSystemWindowRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: f */
    public final Lazy3 f28202f;

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.FitsSystemWindowRelativeLayout$a */
    /* JADX INFO: compiled from: FitsSystemWindowRelativeLayout.kt */
    public static final class C5790a extends Lambda implements InterfaceC6153a<Rect> {
        public C5790a() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Rect mo2c() {
            return new Rect(FitsSystemWindowRelativeLayout.this.getPaddingLeft(), FitsSystemWindowRelativeLayout.this.getPaddingTop(), FitsSystemWindowRelativeLayout.this.getPaddingRight(), FitsSystemWindowRelativeLayout.this.getPaddingBottom());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitsSystemWindowRelativeLayout(Context context) {
        super(context);
        Intrinsics2.m13089e(context, "context");
        this.f28202f = LazyJVM.m13021b(new C5790a());
        m12569a();
    }

    private final Rect getOriginalPadding() {
        return (Rect) this.f28202f.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m12569a() {
        setFitsSystemWindows(true);
        m12570b(new Rect());
    }

    /* JADX INFO: renamed from: b */
    public final void m12570b(Rect rect) {
        setPadding(getOriginalPadding().left + rect.left, getOriginalPadding().top + rect.top, getOriginalPadding().right + rect.right, getOriginalPadding().bottom + rect.bottom);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        Intrinsics2.m13089e(rect, "insets");
        m12570b(rect);
        return false;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Intrinsics2.m13089e(windowInsets, "insets");
        fitSystemWindows(new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom()));
        return windowInsets;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics2.m13089e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Resources resources = getResources();
        Intrinsics2.m13088d(resources, "this.resources");
        if (resources.getConfiguration().smallestScreenWidthDp <= 600) {
            m12569a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitsSystemWindowRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f28202f = LazyJVM.m13021b(new C5790a());
        m12569a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitsSystemWindowRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f28202f = LazyJVM.m13021b(new C5790a());
        m12569a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitsSystemWindowRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f28202f = LazyJVM.m13021b(new C5790a());
        m12569a();
    }
}
