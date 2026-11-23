package com.developer.kalert;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.developer.progressx.ProgressWheel;

/* JADX INFO: loaded from: classes.dex */
public class ProgressHelper {
    private int barColor;
    private int barWidth;
    private int circleRadius;
    private boolean progress;
    private float progressValue;
    private ProgressWheel progressWheel;
    private int rimColor;
    private int rimWidth;
    private boolean spin = true;
    private float spinSpeed = 0.75f;

    public ProgressHelper(Context context) {
        this.barWidth = context.getResources().getDimensionPixelSize(C5801R.dimen.common_circle_width) + 1;
        if (Build.VERSION.SDK_INT >= 23) {
            this.barColor = context.getResources().getColor(C5801R.color.success_stroke_color, context.getTheme());
        } else {
            this.barColor = context.getResources().getColor(C5801R.color.success_stroke_color);
        }
        this.rimWidth = 0;
        this.rimColor = 0;
        this.progress = false;
        this.progressValue = -1.0f;
        this.circleRadius = context.getResources().getDimensionPixelOffset(C5801R.dimen.progress_circle_radius);
    }

    private void updatePropsIfNeed() {
        ProgressWheel progressWheel = this.progressWheel;
        if (progressWheel != null) {
            boolean z = this.spin;
            if (!z && progressWheel.f28267y) {
                progressWheel.f28267y = false;
                progressWheel.f28265w = 0.0f;
                progressWheel.f28266x = 0.0f;
                progressWheel.invalidate();
            } else if (z && !progressWheel.f28267y) {
                progressWheel.f28263u = SystemClock.uptimeMillis();
                progressWheel.f28267y = true;
                progressWheel.invalidate();
            }
            if (this.spinSpeed != this.progressWheel.getSpinSpeed()) {
                this.progressWheel.setSpinSpeed(this.spinSpeed);
            }
            if (this.barWidth != this.progressWheel.getBarWidth()) {
                this.progressWheel.setBarWidth(this.barWidth);
            }
            if (this.barColor != this.progressWheel.getBarColor()) {
                this.progressWheel.setBarColor(this.barColor);
            }
            if (this.rimWidth != this.progressWheel.getRimWidth()) {
                this.progressWheel.setRimWidth(this.rimWidth);
            }
            if (this.rimColor != this.progressWheel.getRimColor()) {
                this.progressWheel.setRimColor(this.rimColor);
            }
            if (this.progressValue != this.progressWheel.getProgress()) {
                if (this.progress) {
                    this.progressWheel.setInstantProgress(this.progressValue);
                } else {
                    this.progressWheel.setProgress(this.progressValue);
                }
            }
            if (this.circleRadius != this.progressWheel.getCircleRadius()) {
                this.progressWheel.setCircleRadius(this.circleRadius);
            }
        }
    }

    public int getBarColor() {
        return this.barColor;
    }

    public int getBarWidth() {
        return this.barWidth;
    }

    public int getCircleRadius() {
        return this.circleRadius;
    }

    public float getProgress() {
        return this.progressValue;
    }

    public ProgressWheel getProgressWheel() {
        return this.progressWheel;
    }

    public int getRimColor() {
        return this.rimColor;
    }

    public int getRimWidth() {
        return this.rimWidth;
    }

    public float getSpinSpeed() {
        return this.spinSpeed;
    }

    public boolean isSpinning() {
        return this.spin;
    }

    public void resetCount() {
        ProgressWheel progressWheel = this.progressWheel;
        if (progressWheel != null) {
            progressWheel.f28265w = 0.0f;
            progressWheel.f28266x = 0.0f;
            progressWheel.invalidate();
        }
    }

    public void setBarColor(int i) {
        this.barColor = i;
        updatePropsIfNeed();
    }

    public void setBarWidth(int i) {
        this.barWidth = i;
        updatePropsIfNeed();
    }

    public void setCircleRadius(int i) {
        this.circleRadius = i;
        updatePropsIfNeed();
    }

    public void setInstantProgress(float f) {
        this.progressValue = f;
        this.progress = true;
        updatePropsIfNeed();
    }

    public void setProgress(float f) {
        this.progress = false;
        this.progressValue = f;
        updatePropsIfNeed();
    }

    public void setProgressWheel(ProgressWheel progressWheel) {
        this.progressWheel = progressWheel;
        updatePropsIfNeed();
    }

    public void setRimColor(int i) {
        this.rimColor = i;
        updatePropsIfNeed();
    }

    public void setRimWidth(int i) {
        this.rimWidth = i;
        updatePropsIfNeed();
    }

    public void setSpinSpeed(float f) {
        this.spinSpeed = f;
        updatePropsIfNeed();
    }

    public void spin() {
        this.spin = true;
        updatePropsIfNeed();
    }

    public void stopSpinning() {
        this.spin = false;
        updatePropsIfNeed();
    }
}
