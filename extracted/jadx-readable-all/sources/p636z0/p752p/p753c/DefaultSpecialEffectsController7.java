package p636z0.p752p.p753c;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: z0.p.c.i, reason: use source file name */
/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSpecialEffectsController7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ FragmentTransitionImpl f38345f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f38346g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Rect f38347h;

    public DefaultSpecialEffectsController7(DefaultSpecialEffectsController defaultSpecialEffectsController, FragmentTransitionImpl fragmentTransitionImpl, View view, Rect rect) {
        this.f38345f = fragmentTransitionImpl;
        this.f38346g = view;
        this.f38347h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f38345f.m16608j(this.f38346g, this.f38347h);
    }
}
