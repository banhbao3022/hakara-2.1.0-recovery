package p636z0.p752p.p753c;

import android.view.ViewGroup;
import android.view.animation.Animation;
import p636z0.p725k.p735h.CancellationSignal;

/* JADX INFO: renamed from: z0.p.c.p, reason: use source file name */
/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentAnim2 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewGroup f38498f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Fragment f38499g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ FragmentTransition7.a f38500h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CancellationSignal f38501i;

    /* JADX INFO: renamed from: z0.p.c.p$a */
    /* JADX INFO: compiled from: FragmentAnim.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FragmentAnim2.this.f38499g.m16569v() != null) {
                FragmentAnim2.this.f38499g.m16534J0(null);
                FragmentAnim2 fragmentAnim2 = FragmentAnim2.this;
                ((FragmentManager.d) fragmentAnim2.f38500h).m16711a(fragmentAnim2.f38499g, fragmentAnim2.f38501i);
            }
        }
    }

    public FragmentAnim2(ViewGroup viewGroup, Fragment fragment, FragmentTransition7.a aVar, CancellationSignal cancellationSignal) {
        this.f38498f = viewGroup;
        this.f38499g = fragment;
        this.f38500h = aVar;
        this.f38501i = cancellationSignal;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f38498f.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
