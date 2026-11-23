package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import mtp.media.karaoke.R;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class InnerZoneDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f28591a;

    /* JADX INFO: renamed from: b */
    public final Paint f28592b;

    /* JADX INFO: renamed from: c */
    public final int f28593c;

    /* JADX INFO: renamed from: d */
    public float f28594d;

    /* JADX INFO: renamed from: e */
    public float f28595e;

    /* JADX INFO: renamed from: f */
    public float f28596f;

    public InnerZoneDrawable(Context context) {
        Paint paint = new Paint();
        this.f28591a = paint;
        Paint paint2 = new Paint();
        this.f28592b = paint2;
        new Rect();
        this.f28594d = 1.0f;
        Resources resources = context.getResources();
        resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_inner_radius);
        this.f28593c = resources.getInteger(R.integer.cast_libraries_material_featurehighlight_pulse_base_alpha);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint2.setColor(-1);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f = this.f28596f;
        if (f > 0.0f) {
            float f2 = this.f28595e * 0.0f;
            this.f28592b.setAlpha((int) (this.f28593c * f));
            canvas.drawCircle(0.0f, 0.0f, f2, this.f28592b);
        }
        canvas.drawCircle(0.0f, 0.0f, this.f28594d * 0.0f, this.f28591a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f28591a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f28591a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.f28596f = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        this.f28595e = f;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f28594d = f;
        invalidateSelf();
    }
}
