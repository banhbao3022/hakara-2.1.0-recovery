package p636z0.p752p.p753c;

import android.view.View;
import android.view.ViewGroup;
import p636z0.p725k.p735h.CancellationSignal;

/* JADX INFO: renamed from: z0.p.c.g, reason: use source file name */
/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSpecialEffectsController5 implements CancellationSignal.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f38319a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f38320b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DefaultSpecialEffectsController.b f38321c;

    public DefaultSpecialEffectsController5(DefaultSpecialEffectsController defaultSpecialEffectsController, View view, ViewGroup viewGroup, DefaultSpecialEffectsController.b bVar) {
        this.f38319a = view;
        this.f38320b = viewGroup;
        this.f38321c = bVar;
    }

    @Override // p636z0.p725k.p735h.CancellationSignal.a
    /* JADX INFO: renamed from: b */
    public void mo15489b() {
        this.f38319a.clearAnimation();
        this.f38320b.endViewTransition(this.f38319a);
        this.f38321c.m16466a();
    }
}
