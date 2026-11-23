package p636z0.p752p.p753c;

import p636z0.p725k.p735h.CancellationSignal;

/* JADX INFO: renamed from: z0.p.c.m0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentTransition3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ FragmentTransition7.a f38471f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Fragment f38472g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CancellationSignal f38473h;

    public FragmentTransition3(FragmentTransition7.a aVar, Fragment fragment, CancellationSignal cancellationSignal) {
        this.f38471f = aVar;
        this.f38472g = fragment;
        this.f38473h = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((FragmentManager.d) this.f38471f).m16711a(this.f38472g, this.f38473h);
    }
}
