package p007c.p085g.p086a.p108q.p110i;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import p007c.p085g.p086a.p108q.p109h.ImageViewTarget;

/* JADX INFO: renamed from: c.g.a.q.i.b, reason: use source file name */
/* JADX INFO: compiled from: DrawableCrossFadeTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class DrawableCrossFadeTransition implements Transition<Drawable> {

    /* JADX INFO: renamed from: a */
    public final int f3794a;

    /* JADX INFO: renamed from: b */
    public final boolean f3795b;

    public DrawableCrossFadeTransition(int i, boolean z) {
        this.f3794a = i;
        this.f3795b = z;
    }

    @Override // p007c.p085g.p086a.p108q.p110i.Transition
    /* JADX INFO: renamed from: a */
    public boolean mo2032a(Drawable drawable, Transition.a aVar) {
        Drawable drawable2 = drawable;
        ImageViewTarget imageViewTarget = (ImageViewTarget) aVar;
        Drawable drawable3 = ((ImageView) imageViewTarget.f3783g).getDrawable();
        if (drawable3 == null) {
            drawable3 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable3, drawable2});
        transitionDrawable.setCrossFadeEnabled(this.f3795b);
        transitionDrawable.startTransition(this.f3794a);
        ((ImageView) imageViewTarget.f3783g).setImageDrawable(transitionDrawable);
        return true;
    }
}
