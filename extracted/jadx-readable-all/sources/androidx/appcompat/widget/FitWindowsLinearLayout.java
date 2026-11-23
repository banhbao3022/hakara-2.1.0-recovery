package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p636z0.p644b.p653h.FitWindowsViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public FitWindowsViewGroup f365f;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        FitWindowsViewGroup fitWindowsViewGroup = this.f365f;
        if (fitWindowsViewGroup != null) {
            fitWindowsViewGroup.m14892a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(FitWindowsViewGroup fitWindowsViewGroup) {
        this.f365f = fitWindowsViewGroup;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
