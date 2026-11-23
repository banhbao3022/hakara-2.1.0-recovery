package p636z0.p752p.p753c;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: z0.p.c.f, reason: use source file name */
/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSpecialEffectsController4 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewGroup f38315f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f38316g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DefaultSpecialEffectsController.b f38317h;

    /* JADX INFO: renamed from: z0.p.c.f$a */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultSpecialEffectsController4 defaultSpecialEffectsController4 = DefaultSpecialEffectsController4.this;
            defaultSpecialEffectsController4.f38315f.endViewTransition(defaultSpecialEffectsController4.f38316g);
            DefaultSpecialEffectsController4.this.f38317h.m16466a();
        }
    }

    public DefaultSpecialEffectsController4(DefaultSpecialEffectsController defaultSpecialEffectsController, ViewGroup viewGroup, View view, DefaultSpecialEffectsController.b bVar) {
        this.f38315f = viewGroup;
        this.f38316g = view;
        this.f38317h = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f38315f.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
