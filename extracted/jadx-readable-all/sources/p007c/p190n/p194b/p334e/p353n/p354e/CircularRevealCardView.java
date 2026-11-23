package p007c.p190n.p194b.p334e.p353n.p354e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.Objects;
import p007c.p190n.p194b.p334e.p350k.MaterialCardView;
import p007c.p190n.p194b.p334e.p353n.CircularRevealHelper;
import p007c.p190n.p194b.p334e.p353n.CircularRevealWidget;

/* JADX INFO: renamed from: c.n.b.e.n.e.a, reason: use source file name */
/* JADX INFO: compiled from: CircularRevealCardView.java */
/* JADX INFO: loaded from: classes.dex */
public class CircularRevealCardView extends MaterialCardView implements CircularRevealWidget {

    /* JADX INFO: renamed from: w */
    public final CircularRevealHelper f25199w;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    /* JADX INFO: renamed from: a */
    public void mo11199a() {
        Objects.requireNonNull(this.f25199w);
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    /* JADX INFO: renamed from: b */
    public void mo11200b() {
        Objects.requireNonNull(this.f25199w);
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
    public void draw(Canvas canvas) {
        CircularRevealHelper circularRevealHelper = this.f25199w;
        if (circularRevealHelper != null) {
            circularRevealHelper.m11203a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f25199w.f25191g;
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        return this.f25199w.f25189e.getColor();
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public CircularRevealWidget.e getRevealInfo() {
        return this.f25199w.m11205c();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        CircularRevealHelper circularRevealHelper = this.f25199w;
        return circularRevealHelper != null ? circularRevealHelper.m11206d() : super.isOpaque();
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        CircularRevealHelper circularRevealHelper = this.f25199w;
        circularRevealHelper.f25191g = drawable;
        circularRevealHelper.f25186b.invalidate();
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public void setCircularRevealScrimColor(int i) {
        CircularRevealHelper circularRevealHelper = this.f25199w;
        circularRevealHelper.f25189e.setColor(i);
        circularRevealHelper.f25186b.invalidate();
    }

    @Override // p007c.p190n.p194b.p334e.p353n.CircularRevealWidget
    public void setRevealInfo(CircularRevealWidget.e eVar) {
        this.f25199w.m11207e(eVar);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25199w = new CircularRevealHelper(this);
    }
}
