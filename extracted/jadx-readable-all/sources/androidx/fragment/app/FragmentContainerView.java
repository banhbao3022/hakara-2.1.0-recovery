package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;
import p636z0.p752p.C8311b;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p752p.p753c.FragmentStateManager;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public ArrayList<View> f747f;

    /* JADX INFO: renamed from: g */
    public ArrayList<View> f748g;

    /* JADX INFO: renamed from: h */
    public View.OnApplyWindowInsetsListener f749h;

    /* JADX INFO: renamed from: i */
    public boolean f750i;

    public FragmentContainerView(Context context) {
        super(context);
        this.f750i = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m413a(View view) {
        ArrayList<View> arrayList = this.f748g;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f747f == null) {
            this.f747f = new ArrayList<>();
        }
        this.f747f.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompatM16225j = WindowInsetsCompat.m16225j(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f749h;
        WindowInsetsCompat windowInsetsCompatM16224i = onApplyWindowInsetsListener != null ? WindowInsetsCompat.m16224i(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : ViewCompat.m16321o(this, windowInsetsCompatM16225j);
        if (!windowInsetsCompatM16224i.m16231g()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewCompat.m16311e(getChildAt(i), windowInsetsCompatM16224i);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f750i && this.f747f != null) {
            for (int i = 0; i < this.f747f.size(); i++) {
                super.drawChild(canvas, this.f747f.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f750i || (arrayList = this.f747f) == null || arrayList.size() <= 0 || !this.f747f.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f748g;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f747f;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f750i = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m413a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m413a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m413a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m413a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m413a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m413a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m413a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f750i = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f749h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f748g == null) {
                this.f748g = new ArrayList<>();
            }
            this.f748g.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        this.f750i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8311b.f38260b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        View view;
        super(context, attributeSet);
        this.f750i = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8311b.f38260b);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentM16655H = fragmentManager.m16655H(id);
        if (classAttribute != null && fragmentM16655H == null) {
            if (id <= 0) {
                throw new IllegalStateException(outline.m1600v("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? outline.m1599u(" with tag ", string) : ""));
            }
            Fragment fragmentMo16614a = fragmentManager.m16658K().mo16614a(context.getClassLoader(), classAttribute);
            fragmentMo16614a.mo468m0(context, attributeSet, null);
            BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
            backStackRecord.f38367p = true;
            fragmentMo16614a.f38415L = this;
            backStackRecord.mo16448g(getId(), fragmentMo16614a, string, 1);
            backStackRecord.mo16446e();
        }
        for (FragmentStateManager fragmentStateManager : (ArrayList) fragmentManager.f38617c.m16498f()) {
            Fragment fragment = fragmentStateManager.f38341c;
            if (fragment.f38407D == getId() && (view = fragment.f38416M) != null && view.getParent() == null) {
                fragment.f38415L = this;
                fragmentStateManager.m16476b();
            }
        }
    }
}
