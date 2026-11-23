package com.cgfay.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import mtp.media.karaoke.R;
import p007c.p114h.p115a.p121f.PreviewMeasureListener;

/* JADX INFO: loaded from: classes.dex */
public class CameraMeasureFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public InterfaceC5780a f28160f;

    /* JADX INFO: renamed from: com.cgfay.camera.widget.CameraMeasureFrameLayout$a */
    public interface InterfaceC5780a {
    }

    public CameraMeasureFrameLayout(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        InterfaceC5780a interfaceC5780a = this.f28160f;
        if (interfaceC5780a != null) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            PreviewMeasureListener previewMeasureListener = (PreviewMeasureListener) interfaceC5780a;
            if (previewMeasureListener.f3960a.get() != null) {
                CameraMeasureFrameLayout cameraMeasureFrameLayout = previewMeasureListener.f3960a.get();
                float dimension = cameraMeasureFrameLayout.getResources().getDimension(R.dimen.camera_tab_height);
                float f = size * 1.0f;
                float f2 = size2;
                if (f / f2 > 0.5625f) {
                    ViewGroup.LayoutParams layoutParams = cameraMeasureFrameLayout.getLayoutParams();
                    layoutParams.width = (int) (f2 * 0.5625f);
                    layoutParams.height = size2;
                    cameraMeasureFrameLayout.setLayoutParams(layoutParams);
                } else {
                    float f3 = f2 - dimension;
                    if (f / f3 < 0.5625f) {
                        ViewGroup.LayoutParams layoutParams2 = cameraMeasureFrameLayout.getLayoutParams();
                        layoutParams2.width = size;
                        layoutParams2.height = (int) f3;
                        cameraMeasureFrameLayout.setLayoutParams(layoutParams2);
                    }
                }
                cameraMeasureFrameLayout.requestLayout();
                previewMeasureListener.f3960a.get().setOnMeasureListener(null);
            }
        }
    }

    public void setOnMeasureListener(InterfaceC5780a interfaceC5780a) {
        this.f28160f = interfaceC5780a;
    }

    public CameraMeasureFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraMeasureFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
