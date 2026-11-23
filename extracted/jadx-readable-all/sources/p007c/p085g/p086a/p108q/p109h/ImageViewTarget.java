package p007c.p085g.p086a.p108q.p109h;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p007c.p085g.p086a.p108q.p110i.Transition;

/* JADX INFO: renamed from: c.g.a.q.h.e, reason: use source file name */
/* JADX INFO: compiled from: ImageViewTarget.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageViewTarget<Z> extends ViewTarget<ImageView, Z> implements Transition.a {

    /* JADX INFO: renamed from: i */
    public Animatable f3780i;

    public ImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: b */
    public void mo1932b(Z z, Transition<? super Z> transition) {
        if (transition == null || !transition.mo2032a(z, this)) {
            m2025l(z);
        } else {
            if (!(z instanceof Animatable)) {
                this.f3780i = null;
                return;
            }
            Animatable animatable = (Animatable) z;
            this.f3780i = animatable;
            animatable.start();
        }
    }

    @Override // p007c.p085g.p086a.p108q.p109h.BaseTarget, p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: d */
    public void mo2019d(Drawable drawable) {
        m2025l(null);
        ((ImageView) this.f3783g).setImageDrawable(drawable);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.BaseTarget, p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: e */
    public void mo1649e() {
        Animatable animatable = this.f3780i;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p007c.p085g.p086a.p108q.p109h.ViewTarget, p007c.p085g.p086a.p108q.p109h.BaseTarget, p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: f */
    public void mo2020f(Drawable drawable) {
        m2025l(null);
        ((ImageView) this.f3783g).setImageDrawable(drawable);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.ViewTarget, p007c.p085g.p086a.p108q.p109h.BaseTarget, p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: h */
    public void mo1933h(Drawable drawable) {
        this.f3784h.m2026a();
        Animatable animatable = this.f3780i;
        if (animatable != null) {
            animatable.stop();
        }
        m2025l(null);
        ((ImageView) this.f3783g).setImageDrawable(drawable);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.BaseTarget, p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: j */
    public void mo1650j() {
        Animatable animatable = this.f3780i;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo2022k(Z z);

    /* JADX INFO: renamed from: l */
    public final void m2025l(Z z) {
        mo2022k(z);
        if (!(z instanceof Animatable)) {
            this.f3780i = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f3780i = animatable;
        animatable.start();
    }

    @Deprecated
    public ImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
