package p636z0.p752p.p753c;

import p636z0.p725k.p735h.CancellationSignal;

/* JADX INFO: renamed from: z0.p.c.k0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentTransition implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ FragmentTransition7.a f38377f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Fragment f38378g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CancellationSignal f38379h;

    public FragmentTransition(FragmentTransition7.a aVar, Fragment fragment, CancellationSignal cancellationSignal) {
        this.f38377f = aVar;
        this.f38378g = fragment;
        this.f38379h = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((FragmentManager.d) this.f38377f).m16711a(this.f38378g, this.f38379h);
    }
}
