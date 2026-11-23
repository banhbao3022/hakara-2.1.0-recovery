package p007c.p190n.p194b.p334e.p353n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.e.n.b, reason: use source file name */
/* JADX INFO: compiled from: CircularRevealFrameLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class CircularRevealFrameLayout extends FrameLayout implements CircularRevealWidget {

    /* JADX INFO: renamed from: f */
    public final CircularRevealHelper f25184f;

    public CircularRevealFrameLayout(Context context) {
        this(context, null);
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    /* JADX INFO: renamed from: a */
    public void mo11199a() {
        Objects.requireNonNull(this.f25184f);
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    /* JADX INFO: renamed from: b */
    public void mo11200b() {
        Objects.requireNonNull(this.f25184f);
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealHelper.a
    /* JADX INFO: renamed from: c */
    public void mo11201c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealHelper.a
    /* JADX INFO: renamed from: d */
    public boolean mo11202d() {
        return super.isOpaque();
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        CircularRevealHelper circularRevealHelper = this.f25184f;
        if (circularRevealHelper != null) {
            circularRevealHelper.m11203a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f25184f.f25191g;
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        return this.f25184f.f25189e.getColor();
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public CircularRevealWidget.e getRevealInfo() {
        return this.f25184f.m11205c();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        CircularRevealHelper circularRevealHelper = this.f25184f;
        return circularRevealHelper != null ? circularRevealHelper.m11206d() : super.isOpaque();
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        CircularRevealHelper circularRevealHelper = this.f25184f;
        circularRevealHelper.f25191g = drawable;
        circularRevealHelper.f25186b.invalidate();
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public void setCircularRevealScrimColor(int i) {
        CircularRevealHelper circularRevealHelper = this.f25184f;
        circularRevealHelper.f25189e.setColor(i);
        circularRevealHelper.f25186b.invalidate();
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public void setRevealInfo(CircularRevealWidget.e eVar) {
        this.f25184f.m11207e(eVar);
    }

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25184f = new CircularRevealHelper(this);
    }
}
