package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.b.h.o, reason: use source file name */
/* JADX INFO: compiled from: AppCompatPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14945a(context, attributeSet, i, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m14945a(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34402r, i, i2);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            C8162a.m16045P(this, typedArrayObtainStyledAttributes.getBoolean(2, false));
        }
        setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AppCompatResources.m14707b(context, resourceId));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m14945a(context, attributeSet, i, i2);
    }
}
