package p007c.p085g.p086a.p089m.p098v.p101f;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import p007c.p085g.p086a.p089m.p092t.Initializable;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p098v.p103h.GifDrawable;

/* JADX INFO: renamed from: c.g.a.m.v.f.b, reason: use source file name */
/* JADX INFO: compiled from: DrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class DrawableResource<T extends Drawable> implements Resource2<T>, Initializable {

    /* JADX INFO: renamed from: f */
    public final T f3606f;

    public DrawableResource(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f3606f = t;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Initializable
    /* JADX INFO: renamed from: a */
    public void mo1840a() {
        T t = this.f3606f;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof GifDrawable) {
            ((GifDrawable) t).m1925b().prepareToDraw();
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    public Object get() {
        Drawable.ConstantState constantState = this.f3606f.getConstantState();
        return constantState == null ? this.f3606f : constantState.newDrawable();
    }
}
