package p007c.p451o.p452a.p461e.p465d;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p636z0.p685e0.TransitionManager;

/* JADX INFO: renamed from: c.o.a.e.d.j, reason: use source file name */
/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
public final class View2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f27930f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TransitionImageAnimator f27931g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC6153a f27932h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int[] f27933i;

    /* JADX INFO: renamed from: c.o.a.e.d.j$a */
    /* JADX INFO: compiled from: View.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ View f27934f;

        public a(View view) {
            this.f27934f = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((ImageView) this.f27934f).setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: c.o.a.e.d.j$b */
    /* JADX INFO: compiled from: TransitionImageAnimator.kt */
    public static final class b extends Lambda implements InterfaceC6153a<Unit> {
        public b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            View2 view2 = View2.this;
            TransitionImageAnimator transitionImageAnimator = view2.f27931g;
            if (!transitionImageAnimator.f27923b) {
                transitionImageAnimator.f27922a = false;
                view2.f27932h.mo2c();
            }
            return Unit.f29502a;
        }
    }

    public View2(View view, TransitionImageAnimator transitionImageAnimator, InterfaceC6153a interfaceC6153a, int[] iArr) {
        this.f27930f = view;
        this.f27931g = transitionImageAnimator;
        this.f27932h = interfaceC6153a;
        this.f27933i = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.f27931g.f27924c;
        if (imageView != null) {
            imageView.postDelayed(new a(imageView), 50L);
        }
        TransitionManager.m15519a(this.f27931g.m12501b(), this.f27931g.m12500a(new b()));
        FrameLayout frameLayout = this.f27931g.f27926e;
        Intrinsics2.m13090f(frameLayout, "$this$makeViewMatchParent");
        C5729a.m12451f(frameLayout, 0, 0, 0, 0);
        C5729a.m12433F(frameLayout, -1, -1);
        ImageView imageView2 = this.f27931g.f27925d;
        Intrinsics2.m13090f(imageView2, "$this$makeViewMatchParent");
        C5729a.m12451f(imageView2, 0, 0, 0, 0);
        C5729a.m12433F(imageView2, -1, -1);
        C5729a.m12451f(this.f27931g.m12501b(), Integer.valueOf(this.f27933i[0]), Integer.valueOf(this.f27933i[1]), Integer.valueOf(this.f27933i[2]), Integer.valueOf(this.f27933i[3]));
        this.f27931g.f27926e.requestLayout();
    }
}
