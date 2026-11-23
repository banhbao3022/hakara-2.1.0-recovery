package p007c.p451o.p452a.p461e.p465d;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p007c.p451o.p452a.C5729a;
import p007c.p451o.p452a.p453c.p454a.Transition2;
import p477d1.TypeCastException;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p636z0.p685e0.AutoTransition;
import p636z0.p685e0.Transition3;

/* JADX INFO: renamed from: c.o.a.e.d.h, reason: use source file name */
/* JADX INFO: compiled from: TransitionImageAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TransitionImageAnimator {

    /* JADX INFO: renamed from: a */
    public boolean f27922a;

    /* JADX INFO: renamed from: b */
    public boolean f27923b;

    /* JADX INFO: renamed from: c */
    public final ImageView f27924c;

    /* JADX INFO: renamed from: d */
    public final ImageView f27925d;

    /* JADX INFO: renamed from: e */
    public final FrameLayout f27926e;

    /* JADX INFO: renamed from: c.o.a.e.d.h$a */
    /* JADX INFO: compiled from: TransitionImageAnimator.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.o.a.e.d.h$b */
    /* JADX INFO: compiled from: TransitionImageAnimator.kt */
    public static final class b extends Lambda implements InterfaceC6164l<Transition3, Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC6153a f27927g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6153a interfaceC6153a) {
            super(1);
            this.f27927g = interfaceC6153a;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Transition3 transition3) {
            Intrinsics2.m13090f(transition3, "it");
            InterfaceC6153a interfaceC6153a = this.f27927g;
            if (interfaceC6153a != null) {
            }
            return Unit.f29502a;
        }
    }

    static {
        new a(null);
    }

    public TransitionImageAnimator(ImageView imageView, ImageView imageView2, FrameLayout frameLayout) {
        Intrinsics2.m13090f(imageView2, "internalImage");
        Intrinsics2.m13090f(frameLayout, "internalImageContainer");
        this.f27924c = imageView;
        this.f27925d = imageView2;
        this.f27926e = frameLayout;
    }

    /* JADX INFO: renamed from: a */
    public final Transition3 m12500a(InterfaceC6153a<Unit> interfaceC6153a) {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.m15526Q(this.f27923b ? 250L : 200L);
        autoTransition.m15527R(new DecelerateInterpolator());
        Intrinsics2.m13086b(autoTransition, "AutoTransition()\n       …DecelerateInterpolator())");
        b bVar = new b(interfaceC6153a);
        Intrinsics2.m13090f(autoTransition, "$this$addListener");
        autoTransition.mo15505a(new Transition2(bVar, null, null, null, null));
        Intrinsics2.m13086b(autoTransition, "addListener(\n    object …nsition)\n        }\n    })");
        return autoTransition;
    }

    /* JADX INFO: renamed from: b */
    public final ViewGroup m12501b() {
        ViewParent parent = this.f27926e.getParent();
        if (parent != null) {
            return (ViewGroup) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX INFO: renamed from: c */
    public final void m12502c() {
        ImageView imageView = this.f27924c;
        if (imageView != null) {
            if (C5729a.m12471z(imageView)) {
                ImageView imageView2 = this.f27924c;
                Rect rect = new Rect();
                if (imageView2 != null) {
                    imageView2.getLocalVisibleRect(rect);
                }
                C5729a.m12433F(this.f27925d, imageView.getWidth(), imageView.getHeight());
                C5729a.m12451f(this.f27925d, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), null, null);
                ImageView imageView3 = this.f27924c;
                Rect rect2 = new Rect();
                if (imageView3 != null) {
                    imageView3.getGlobalVisibleRect(rect2);
                }
                C5729a.m12433F(this.f27926e, rect2.width(), rect2.height());
                C5729a.m12451f(this.f27926e, Integer.valueOf(rect2.left), Integer.valueOf(rect2.top), Integer.valueOf(rect2.right), Integer.valueOf(rect2.bottom));
            }
            m12501b().animate().translationY(0.0f).setDuration(this.f27923b ? 250L : 200L).start();
        }
    }
}
