package com.stfalcon.imageviewer.common.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p479b0.KDeclarationContainer;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.FunctionReference;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Reflection;

/* JADX INFO: compiled from: MultiTouchViewPager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MultiTouchViewPager extends ViewPager {

    /* JADX INFO: renamed from: i0 */
    public boolean f29329i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f29330j0;

    /* JADX INFO: renamed from: k0 */
    public ViewPager.InterfaceC0201j f29331k0;

    /* JADX INFO: renamed from: com.stfalcon.imageviewer.common.pager.MultiTouchViewPager$a */
    /* JADX INFO: compiled from: MultiTouchViewPager.kt */
    public static final /* synthetic */ class C6007a extends FunctionReference implements InterfaceC6164l<Integer, Unit> {
        public C6007a(MultiTouchViewPager multiTouchViewPager) {
            super(1, multiTouchViewPager);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Integer num) {
            int iIntValue = num.intValue();
            ((MultiTouchViewPager) this.f29585g).f29329i0 = iIntValue == 0;
            return Unit.f29502a;
        }

        @Override // p477d1.p493x.p495c.CallableReference
        /* JADX INFO: renamed from: i */
        public final String mo12497i() {
            return "onPageScrollStateChanged";
        }

        @Override // p477d1.p493x.p495c.CallableReference
        /* JADX INFO: renamed from: j */
        public final KDeclarationContainer mo12498j() {
            return Reflection.m13097a(MultiTouchViewPager.class);
        }

        @Override // p477d1.p493x.p495c.CallableReference
        /* JADX INFO: renamed from: k */
        public final String mo12499k() {
            return "onPageScrollStateChanged(I)V";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiTouchViewPager(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MultiTouchViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics2.m13090f(motionEvent, "ev");
        if (motionEvent.getPointerCount() <= 1 || !this.f29330j0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f29330j0 = false;
        super.requestDisallowInterceptTouchEvent(false);
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f29330j0 = true;
        super.requestDisallowInterceptTouchEvent(true);
        return zDispatchTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29331k0 = C5729a.m12449d(this, null, null, new C6007a(this), 3);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        List<ViewPager.InterfaceC0201j> list;
        super.onDetachedFromWindow();
        ViewPager.InterfaceC0201j interfaceC0201j = this.f29331k0;
        if (interfaceC0201j == null || (list = this.f1247d0) == null) {
            return;
        }
        list.remove(interfaceC0201j);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics2.m13090f(motionEvent, "ev");
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics2.m13090f(motionEvent, "ev");
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        this.f29330j0 = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTouchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13090f(context, "context");
        this.f29329i0 = true;
    }
}
