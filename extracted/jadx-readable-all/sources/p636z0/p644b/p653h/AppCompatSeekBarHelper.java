package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p644b.C7463b;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.h.u, reason: use source file name */
/* JADX INFO: compiled from: AppCompatSeekBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {

    /* JADX INFO: renamed from: d */
    public final SeekBar f35204d;

    /* JADX INFO: renamed from: e */
    public Drawable f35205e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f35206f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f35207g;

    /* JADX INFO: renamed from: h */
    public boolean f35208h;

    /* JADX INFO: renamed from: i */
    public boolean f35209i;

    public AppCompatSeekBarHelper(SeekBar seekBar) {
        super(seekBar);
        this.f35206f = null;
        this.f35207g = null;
        this.f35208h = false;
        this.f35209i = false;
        this.f35204d = seekBar;
    }

    @Override // p636z0.p644b.p653h.AppCompatProgressBarHelper
    /* JADX INFO: renamed from: a */
    public void mo14946a(AttributeSet attributeSet, int i) {
        super.mo14946a(attributeSet, i);
        Context context = this.f35204d.getContext();
        int[] iArr = C7463b.f34391g;
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f35204d;
        ViewCompat.m16326t(seekBar, seekBar.getContext(), iArr, attributeSet, tintTypedArrayM14998r.f35267b, i, 0);
        Drawable drawableM15006h = tintTypedArrayM14998r.m15006h(0);
        if (drawableM15006h != null) {
            this.f35204d.setThumb(drawableM15006h);
        }
        Drawable drawableM15005g = tintTypedArrayM14998r.m15005g(1);
        Drawable drawable = this.f35205e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f35205e = drawableM15005g;
        if (drawableM15005g != null) {
            drawableM15005g.setCallback(this.f35204d);
            SeekBar seekBar2 = this.f35204d;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            C8162a.m16043N(drawableM15005g, seekBar2.getLayoutDirection());
            if (drawableM15005g.isStateful()) {
                drawableM15005g.setState(this.f35204d.getDrawableState());
            }
            m14966c();
        }
        this.f35204d.invalidate();
        if (tintTypedArrayM14998r.m15014p(3)) {
            this.f35207g = DrawableUtils.m14887c(tintTypedArrayM14998r.m15008j(3, -1), this.f35207g);
            this.f35209i = true;
        }
        if (tintTypedArrayM14998r.m15014p(2)) {
            this.f35206f = tintTypedArrayM14998r.m15001c(2);
            this.f35208h = true;
        }
        tintTypedArrayM14998r.f35267b.recycle();
        m14966c();
    }

    /* JADX INFO: renamed from: c */
    public final void m14966c() {
        Drawable drawable = this.f35205e;
        if (drawable != null) {
            if (this.f35208h || this.f35209i) {
                Drawable drawableM16054Y = C8162a.m16054Y(drawable.mutate());
                this.f35205e = drawableM16054Y;
                if (this.f35208h) {
                    drawableM16054Y.setTintList(this.f35206f);
                }
                if (this.f35209i) {
                    this.f35205e.setTintMode(this.f35207g);
                }
                if (this.f35205e.isStateful()) {
                    this.f35205e.setState(this.f35204d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m14967d(Canvas canvas) {
        if (this.f35205e != null) {
            int max = this.f35204d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f35205e.getIntrinsicWidth();
                int intrinsicHeight = this.f35205e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f35205e.setBounds(-i, -i2, i, i2);
                float width = ((this.f35204d.getWidth() - this.f35204d.getPaddingLeft()) - this.f35204d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f35204d.getPaddingLeft(), this.f35204d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f35205e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
