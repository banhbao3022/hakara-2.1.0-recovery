package p636z0.p752p.p753c;

import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: z0.p.c.h, reason: use source file name */
/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSpecialEffectsController6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SpecialEffectsController.d f38335f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SpecialEffectsController.d f38336g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f38337h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ArrayMap f38338i;

    public DefaultSpecialEffectsController6(DefaultSpecialEffectsController defaultSpecialEffectsController, SpecialEffectsController.d dVar, SpecialEffectsController.d dVar2, boolean z, ArrayMap arrayMap) {
        this.f38335f = dVar;
        this.f38336g = dVar2;
        this.f38337h = z;
        this.f38338i = arrayMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        FragmentTransition7.m16588c(this.f38335f.f38585c, this.f38336g.f38585c, this.f38337h, this.f38338i, false);
    }
}
