package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import mtp.media.karaoke.R;
import p636z0.p644b.p653h.AppCompatSeekBar;

/* JADX INFO: loaded from: classes.dex */
public class MediaRouteVolumeSlider extends AppCompatSeekBar {

    /* JADX INFO: renamed from: g */
    public final float f821g;

    /* JADX INFO: renamed from: h */
    public Drawable f822h;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    @Override // p636z0.p644b.p653h.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.f821g * 255.0f);
        this.f822h.setColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.f822h.setAlpha(i);
        getProgressDrawable().setColorFilter(0, PorterDuff.Mode.SRC_IN);
        getProgressDrawable().setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f822h = drawable;
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        this.f821g = context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true) ? typedValue.getFloat() : 0.5f;
    }
}
