package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.Keep;
import p636z0.p725k.p729e.ColorUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class OuterHighlightDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f28597a;

    /* JADX INFO: renamed from: b */
    public float f28598b;

    /* JADX INFO: renamed from: c */
    public float f28599c;

    /* JADX INFO: renamed from: d */
    public float f28600d;

    public OuterHighlightDrawable(Context context) {
        new Rect();
        new Rect();
        Paint paint = new Paint();
        this.f28597a = paint;
        this.f28598b = 1.0f;
        this.f28599c = 0.0f;
        this.f28600d = 0.0f;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        paint.setColor(ColorUtils.m16165d(typedValue.data, 244));
        paint.getAlpha();
        invalidateSelf();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.cast_libraries_material_featurehighlight_center_threshold);
        resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.f33393xd1678993);
        resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.cast_libraries_material_featurehighlight_outer_padding);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawCircle(this.f28599c + 0.0f, this.f28600d + 0.0f, 0.0f * this.f28598b, this.f28597a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f28597a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f28597a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f28597a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f28598b = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f) {
        this.f28599c = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f) {
        this.f28600d = f;
        invalidateSelf();
    }
}
