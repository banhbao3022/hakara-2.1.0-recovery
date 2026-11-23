package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p636z0.p644b.p653h.FitWindowsViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public FitWindowsViewGroup f364f;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        FitWindowsViewGroup fitWindowsViewGroup = this.f364f;
        if (fitWindowsViewGroup != null) {
            fitWindowsViewGroup.m14892a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(FitWindowsViewGroup fitWindowsViewGroup) {
        this.f364f = fitWindowsViewGroup;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
