package p007c.p451o.p452a.p461e.p465d;

import android.widget.ImageView;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.o.a.e.d.i, reason: use source file name */
/* JADX INFO: compiled from: TransitionImageAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TransitionImageAnimator2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TransitionImageAnimator f27928g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC6153a f27929h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionImageAnimator2(TransitionImageAnimator transitionImageAnimator, InterfaceC6153a interfaceC6153a) {
        super(0);
        this.f27928g = transitionImageAnimator;
        this.f27929h = interfaceC6153a;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        TransitionImageAnimator transitionImageAnimator = this.f27928g;
        InterfaceC6153a interfaceC6153a = this.f27929h;
        ImageView imageView = transitionImageAnimator.f27924c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        transitionImageAnimator.f27925d.post(new TransitionImageAnimator3(interfaceC6153a));
        transitionImageAnimator.f27922a = false;
        return Unit.f29502a;
    }
}
