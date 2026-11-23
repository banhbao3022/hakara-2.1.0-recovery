package p007c.p190n.p194b.p334e.p353n;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Objects;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.e.n.c, reason: use source file name */
/* JADX INFO: compiled from: CircularRevealHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class CircularRevealHelper {

    /* JADX INFO: renamed from: a */
    public final a f25185a;

    /* JADX INFO: renamed from: b */
    public final View f25186b;

    /* JADX INFO: renamed from: c */
    public final Path f25187c;

    /* JADX INFO: renamed from: d */
    public final Paint f25188d;

    /* JADX INFO: renamed from: e */
    public final Paint f25189e;

    /* JADX INFO: renamed from: f */
    public CircularRevealWidget.e f25190f;

    /* JADX INFO: renamed from: g */
    public Drawable f25191g;

    /* JADX INFO: renamed from: c.n.b.e.n.c$a */
    /* JADX INFO: compiled from: CircularRevealHelper.java */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo11201c(Canvas canvas);

        /* JADX INFO: renamed from: d */
        boolean mo11202d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(a aVar) {
        this.f25185a = aVar;
        View view = (View) aVar;
        this.f25186b = view;
        view.setWillNotDraw(false);
        this.f25187c = new Path();
        this.f25188d = new Paint(7);
        Paint paint = new Paint(1);
        this.f25189e = paint;
        paint.setColor(0);
    }

    /* JADX INFO: renamed from: a */
    public void m11203a(Canvas canvas) {
        if (m11208f()) {
            this.f25185a.mo11201c(canvas);
            if (m11209g()) {
                canvas.drawRect(0.0f, 0.0f, this.f25186b.getWidth(), this.f25186b.getHeight(), this.f25189e);
            }
        } else {
            this.f25185a.mo11201c(canvas);
            if (m11209g()) {
                canvas.drawRect(0.0f, 0.0f, this.f25186b.getWidth(), this.f25186b.getHeight(), this.f25189e);
            }
        }
        Drawable drawable = this.f25191g;
        if ((drawable == null || this.f25190f == null) ? false : true) {
            Rect bounds = drawable.getBounds();
            float fWidth = this.f25190f.f25196a - (bounds.width() / 2.0f);
            float fHeight = this.f25190f.f25197b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f25191g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m11204b(CircularRevealWidget.e eVar) {
        return C4799a.m11018x(eVar.f25196a, eVar.f25197b, 0.0f, 0.0f, this.f25186b.getWidth(), this.f25186b.getHeight());
    }

    /* JADX INFO: renamed from: c */
    public CircularRevealWidget.e m11205c() {
        CircularRevealWidget.e eVar = this.f25190f;
        if (eVar == null) {
            return null;
        }
        CircularRevealWidget.e eVar2 = new CircularRevealWidget.e(eVar);
        if (eVar2.f25198c == Float.MAX_VALUE) {
            eVar2.f25198c = m11204b(eVar2);
        }
        return eVar2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m11206d() {
        return this.f25185a.mo11202d() && !m11208f();
    }

    /* JADX INFO: renamed from: e */
    public void m11207e(CircularRevealWidget.e eVar) {
        if (eVar == null) {
            this.f25190f = null;
        } else {
            CircularRevealWidget.e eVar2 = this.f25190f;
            if (eVar2 == null) {
                this.f25190f = new CircularRevealWidget.e(eVar);
            } else {
                Objects.requireNonNull(eVar2);
                float f = eVar.f25196a;
                float f2 = eVar.f25197b;
                float f3 = eVar.f25198c;
                eVar2.f25196a = f;
                eVar2.f25197b = f2;
                eVar2.f25198c = f3;
            }
            if (eVar.f25198c + 1.0E-4f >= m11204b(eVar)) {
                this.f25190f.f25198c = Float.MAX_VALUE;
            }
        }
        this.f25186b.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    /* JADX INFO: renamed from: f */
    public final boolean m11208f() {
        boolean z;
        CircularRevealWidget.e eVar = this.f25190f;
        if (eVar != null) {
            z = (eVar.f25198c > Float.MAX_VALUE ? 1 : (eVar.f25198c == Float.MAX_VALUE ? 0 : -1)) == 0;
        }
        return !z;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11209g() {
        return Color.alpha(this.f25189e.getColor()) != 0;
    }
}
