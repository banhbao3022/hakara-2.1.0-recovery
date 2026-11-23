package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p636z0.p644b.C7463b;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: f */
    public int f492f;

    /* JADX INFO: renamed from: g */
    public int f493g;

    /* JADX INFO: renamed from: h */
    public WeakReference<View> f494h;

    /* JADX INFO: renamed from: i */
    public LayoutInflater f495i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0091a f496j;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface InterfaceC0091a {
        /* JADX INFO: renamed from: a */
        void m255a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    public View m254a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f492f == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f495i;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f492f, viewGroup, false);
        int i = this.f493g;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f494h = new WeakReference<>(viewInflate);
        InterfaceC0091a interfaceC0091a = this.f496j;
        if (interfaceC0091a != null) {
            interfaceC0091a.m255a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f493g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f495i;
    }

    public int getLayoutResource() {
        return this.f492f;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f493g = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f495i = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f492f = i;
    }

    public void setOnInflateListener(InterfaceC0091a interfaceC0091a) {
        this.f496j = interfaceC0091a;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f494h;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m254a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f492f = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34410z, i, 0);
        this.f493g = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f492f = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
