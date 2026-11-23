package mtp.media.karaoke.p628ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;

/* JADX INFO: loaded from: classes2.dex */
public class VideoTextureView extends TextureView {
    public VideoTextureView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float rotation = getRotation();
        if (rotation == 90.0f || rotation == 270.0f) {
            i2 = i;
            i = i2;
        }
        setMeasuredDimension(TextureView.getDefaultSize(0, i), TextureView.getDefaultSize(0, i2));
    }

    @Override // android.view.View
    public void setRotation(float f) {
        if (f != getRotation()) {
            super.setRotation(f);
            requestLayout();
        }
    }

    public VideoTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
