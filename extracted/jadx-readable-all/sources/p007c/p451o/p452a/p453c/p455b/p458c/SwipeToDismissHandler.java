package p007c.p451o.p452a.p453c.p455b.p458c;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.o.a.c.b.c.a, reason: use source file name */
/* JADX INFO: compiled from: SwipeToDismissHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SwipeToDismissHandler implements View.OnTouchListener {

    /* JADX INFO: renamed from: f */
    public int f27842f;

    /* JADX INFO: renamed from: g */
    public boolean f27843g;

    /* JADX INFO: renamed from: h */
    public float f27844h;

    /* JADX INFO: renamed from: i */
    public final View f27845i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC6153a<Unit> f27846j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6168p<Float, Integer, Unit> f27847k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC6153a<Boolean> f27848l;

    /* JADX INFO: renamed from: c.o.a.c.b.c.a$a */
    /* JADX INFO: compiled from: SwipeToDismissHandler.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.o.a.c.b.c.a$b */
    /* JADX INFO: compiled from: SwipeToDismissHandler.kt */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwipeToDismissHandler swipeToDismissHandler = SwipeToDismissHandler.this;
            swipeToDismissHandler.f27847k.mo5l(Float.valueOf(swipeToDismissHandler.f27845i.getTranslationY()), Integer.valueOf(SwipeToDismissHandler.this.f27842f));
        }
    }

    /* JADX INFO: renamed from: c.o.a.c.b.c.a$c */
    /* JADX INFO: compiled from: SwipeToDismissHandler.kt */
    public static final class c extends Lambda implements InterfaceC6164l<Animator, Unit> {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ float f27851h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f) {
            super(1);
            this.f27851h = f;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Animator animator) {
            if (this.f27851h != 0.0f) {
                SwipeToDismissHandler.this.f27846j.mo2c();
            }
            SwipeToDismissHandler.this.f27845i.animate().setUpdateListener(null);
            return Unit.f29502a;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissHandler(View view, InterfaceC6153a<Unit> interfaceC6153a, InterfaceC6168p<? super Float, ? super Integer, Unit> interfaceC6168p, InterfaceC6153a<Boolean> interfaceC6153a2) {
        Intrinsics2.m13090f(view, "swipeView");
        Intrinsics2.m13090f(interfaceC6153a, "onDismiss");
        Intrinsics2.m13090f(interfaceC6168p, "onSwipeViewMove");
        Intrinsics2.m13090f(interfaceC6153a2, "shouldAnimateDismiss");
        this.f27845i = view;
        this.f27846j = interfaceC6153a;
        this.f27847k = interfaceC6168p;
        this.f27848l = interfaceC6153a2;
        this.f27842f = view.getHeight() / 4;
    }

    /* JADX INFO: renamed from: a */
    public final void m12478a(float f) {
        ViewPropertyAnimator updateListener = this.f27845i.animate().translationY(f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setUpdateListener(new b());
        Intrinsics2.m13086b(updateListener, "swipeView.animate()\n    …ionY, translationLimit) }");
        c cVar = new c(f);
        Intrinsics2.m13090f(updateListener, "$this$setAnimatorListener");
        updateListener.setListener(new p007c.p451o.p452a.p453c.p454a.ViewPropertyAnimator(cVar, null)).start();
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        Intrinsics2.m13090f(view, "v");
        Intrinsics2.m13090f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            View view2 = this.f27845i;
            Rect rect = new Rect();
            if (view2 != null) {
                view2.getHitRect(rect);
            }
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.f27843g = true;
            }
            this.f27844h = motionEvent.getY();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (this.f27843g) {
                    float y = motionEvent.getY() - this.f27844h;
                    this.f27845i.setTranslationY(y);
                    this.f27847k.mo5l(Float.valueOf(y), Integer.valueOf(this.f27842f));
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (this.f27843g) {
            this.f27843g = false;
            int height = view.getHeight();
            if (this.f27845i.getTranslationY() < (-this.f27842f)) {
                f = -height;
            } else {
                f = this.f27845i.getTranslationY() > ((float) this.f27842f) ? height : 0.0f;
            }
            if (f == 0.0f || this.f27848l.mo2c().booleanValue()) {
                m12478a(f);
            } else {
                this.f27846j.mo2c();
            }
        }
        return true;
    }
}
