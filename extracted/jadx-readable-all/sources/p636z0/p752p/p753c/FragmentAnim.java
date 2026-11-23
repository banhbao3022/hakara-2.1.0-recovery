package p636z0.p752p.p753c;

import android.view.View;
import p636z0.p725k.p735h.CancellationSignal;

/* JADX INFO: renamed from: z0.p.c.o, reason: use source file name */
/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentAnim implements CancellationSignal.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Fragment f38490a;

    public FragmentAnim(Fragment fragment) {
        this.f38490a = fragment;
    }

    @Override // p636z0.p725k.p735h.CancellationSignal.a
    /* JADX INFO: renamed from: b */
    public void mo15489b() {
        if (this.f38490a.m16569v() != null) {
            View viewM16569v = this.f38490a.m16569v();
            this.f38490a.m16534J0(null);
            viewM16569v.clearAnimation();
        }
        this.f38490a.m16538L0(null);
    }
}
