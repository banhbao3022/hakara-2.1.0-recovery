package p636z0.p752p.p753c;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.p.c.u0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransitionImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionImpl3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ArrayList f38556f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Map f38557g;

    public FragmentTransitionImpl3(FragmentTransitionImpl fragmentTransitionImpl, ArrayList arrayList, Map map) {
        this.f38556f = arrayList;
        this.f38557g = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f38556f.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f38556f.get(i);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view.setTransitionName((String) this.f38557g.get(view.getTransitionName()));
        }
    }
}
