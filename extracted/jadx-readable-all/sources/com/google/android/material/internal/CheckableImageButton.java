package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import p636z0.p644b.p653h.AppCompatImageButton;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: h */
    public static final int[] f28998h = {R.attr.state_checked};

    /* JADX INFO: renamed from: i */
    public boolean f28999i;

    /* JADX INFO: renamed from: j */
    public boolean f29000j;

    /* JADX INFO: renamed from: k */
    public boolean f29001k;

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C5960a extends AccessibilityDelegateCompat {
        public C5960a() {
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: c */
        public void mo381c(View view, AccessibilityEvent accessibilityEvent) {
            this.f37977b.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            accessibilityNodeInfoCompat.f38018b.setCheckable(CheckableImageButton.this.f29000j);
            accessibilityNodeInfoCompat.f38018b.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$b */
    public static class C5961b extends AbsSavedState {
        public static final Parcelable.Creator<C5961b> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public boolean f29003h;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        public static class a implements Parcelable.ClassLoaderCreator<C5961b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C5961b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5961b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C5961b[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C5961b(parcel, null);
            }
        }

        public C5961b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            parcel.writeInt(this.f29003h ? 1 : 0);
        }

        public C5961b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29003h = parcel.readInt() == 1;
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f28999i;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f28999i) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f28998h;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5961b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5961b c5961b = (C5961b) parcelable;
        super.onRestoreInstanceState(c5961b.f38150g);
        setChecked(c5961b.f29003h);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C5961b c5961b = new C5961b(super.onSaveInstanceState());
        c5961b.f29003h = this.f28999i;
        return c5961b;
    }

    public void setCheckable(boolean z) {
        if (this.f29000j != z) {
            this.f29000j = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f29000j || this.f28999i == z) {
            return;
        }
        this.f28999i = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f29001k = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f29001k) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f28999i);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29000j = true;
        this.f29001k = true;
        ViewCompat.m16327u(this, new C5960a());
    }
}
