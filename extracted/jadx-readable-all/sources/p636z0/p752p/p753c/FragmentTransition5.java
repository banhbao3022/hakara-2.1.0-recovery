package p636z0.p752p.p753c;

import android.graphics.Rect;
import android.view.View;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: z0.p.c.o0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentTransition5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f38491f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Fragment f38492g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f38493h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ArrayMap f38494i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ View f38495j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ FragmentTransitionImpl f38496k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Rect f38497l;

    public FragmentTransition5(Fragment fragment, Fragment fragment2, boolean z, ArrayMap arrayMap, View view, FragmentTransitionImpl fragmentTransitionImpl, Rect rect) {
        this.f38491f = fragment;
        this.f38492g = fragment2;
        this.f38493h = z;
        this.f38494i = arrayMap;
        this.f38495j = view;
        this.f38496k = fragmentTransitionImpl;
        this.f38497l = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        FragmentTransition7.m16588c(this.f38491f, this.f38492g, this.f38493h, this.f38494i, false);
        View view = this.f38495j;
        if (view != null) {
            this.f38496k.m16608j(view, this.f38497l);
        }
    }
}
