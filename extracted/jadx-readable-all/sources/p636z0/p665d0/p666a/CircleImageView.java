package p636z0.p665d0.p666a;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.d0.a.a, reason: use source file name */
/* JADX INFO: compiled from: CircleImageView.java */
/* JADX INFO: loaded from: classes.dex */
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: f */
    public Animation.AnimationListener f35375f;

    /* JADX INFO: renamed from: g */
    public int f35376g;

    public CircleImageView(Context context, int i) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f35376g = (int) (3.5f * f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(i);
        setBackground(shapeDrawable);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f35375f;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f35375f;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
