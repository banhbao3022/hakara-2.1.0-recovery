package p636z0.p644b.p653h;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p636z0.p725k.p729e.p730l.WrappedDrawable;

/* JADX INFO: renamed from: z0.b.h.p, reason: use source file name */
/* JADX INFO: compiled from: AppCompatProgressBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatProgressBarHelper {

    /* JADX INFO: renamed from: a */
    public static final int[] f35142a = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: b */
    public final ProgressBar f35143b;

    /* JADX INFO: renamed from: c */
    public Bitmap f35144c;

    public AppCompatProgressBarHelper(ProgressBar progressBar) {
        this.f35143b = progressBar;
    }

    /* JADX INFO: renamed from: a */
    public void mo14946a(AttributeSet attributeSet, int i) {
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(this.f35143b.getContext(), attributeSet, f35142a, i, 0);
        Drawable drawableM15006h = tintTypedArrayM14998r.m15006h(0);
        if (drawableM15006h != null) {
            ProgressBar progressBar = this.f35143b;
            if (drawableM15006h instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM15006h;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM14947b = m14947b(animationDrawable.getFrame(i2), true);
                    drawableM14947b.setLevel(10000);
                    animationDrawable2.addFrame(drawableM14947b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM15006h = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableM15006h);
        }
        Drawable drawableM15006h2 = tintTypedArrayM14998r.m15006h(1);
        if (drawableM15006h2 != null) {
            this.f35143b.setProgressDrawable(m14947b(drawableM15006h2, false));
        }
        tintTypedArrayM14998r.f35267b.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Drawable m14947b(Drawable drawable, boolean z) {
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable drawableMo16197b = wrappedDrawable.mo16197b();
            if (drawableMo16197b != null) {
                wrappedDrawable.mo16196a(m14947b(drawableMo16197b, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m14947b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f35144c == null) {
                    this.f35144c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
