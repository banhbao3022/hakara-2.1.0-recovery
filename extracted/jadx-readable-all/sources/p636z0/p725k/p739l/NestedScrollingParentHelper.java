package p636z0.p725k.p739l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: z0.k.l.k, reason: use source file name */
/* JADX INFO: compiled from: NestedScrollingParentHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollingParentHelper {

    /* JADX INFO: renamed from: a */
    public int f38067a;

    /* JADX INFO: renamed from: b */
    public int f38068b;

    public NestedScrollingParentHelper(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: a */
    public int m16301a() {
        return this.f38067a | this.f38068b;
    }

    /* JADX INFO: renamed from: b */
    public void m16302b(int i) {
        if (i == 1) {
            this.f38068b = 0;
        } else {
            this.f38067a = 0;
        }
    }
}
