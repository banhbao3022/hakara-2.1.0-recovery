package p636z0.p752p.p753c;

import android.animation.Animator;
import p636z0.p725k.p735h.CancellationSignal;

/* JADX INFO: renamed from: z0.p.c.e, reason: use source file name */
/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSpecialEffectsController3 implements CancellationSignal.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Animator f38309a;

    public DefaultSpecialEffectsController3(DefaultSpecialEffectsController defaultSpecialEffectsController, Animator animator) {
        this.f38309a = animator;
    }

    @Override // p636z0.p725k.p735h.CancellationSignal.a
    /* JADX INFO: renamed from: b */
    public void mo15489b() {
        this.f38309a.end();
    }
}
