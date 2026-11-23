package p007c.p190n.p194b.p334e.p359s;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: c.n.b.e.s.j, reason: use source file name */
/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButtonImpl5 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ FloatingActionButtonImpl3 f25413f;

    public FloatingActionButtonImpl5(FloatingActionButtonImpl3 floatingActionButtonImpl3) {
        this.f25413f = floatingActionButtonImpl3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        FloatingActionButtonImpl3 floatingActionButtonImpl3 = this.f25413f;
        float rotation = floatingActionButtonImpl3.f25378F.getRotation();
        if (floatingActionButtonImpl3.f25402y == rotation) {
            return true;
        }
        floatingActionButtonImpl3.f25402y = rotation;
        floatingActionButtonImpl3.mo11291u();
        return true;
    }
}
