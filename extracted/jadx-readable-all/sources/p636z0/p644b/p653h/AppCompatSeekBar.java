package p636z0.p644b.p653h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: z0.b.h.t, reason: use source file name */
/* JADX INFO: compiled from: AppCompatSeekBar.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* JADX INFO: renamed from: f */
    public final AppCompatSeekBarHelper f35196f;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatSeekBarHelper appCompatSeekBarHelper = this.f35196f;
        Drawable drawable = appCompatSeekBarHelper.f35205e;
        if (drawable != null && drawable.isStateful() && drawable.setState(appCompatSeekBarHelper.f35204d.getDrawableState())) {
            appCompatSeekBarHelper.f35204d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f35196f.f35205e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f35196f.m14967d(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ThemeUtils.m14962a(this, getContext());
        AppCompatSeekBarHelper appCompatSeekBarHelper = new AppCompatSeekBarHelper(this);
        this.f35196f = appCompatSeekBarHelper;
        appCompatSeekBarHelper.mo14946a(attributeSet, i);
    }
}
