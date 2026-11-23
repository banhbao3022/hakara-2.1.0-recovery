package p636z0.p752p.p753c;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: z0.p.c.p0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentTransition6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ FragmentTransitionImpl f38503f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ArrayMap f38504g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f38505h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ FragmentTransition7.b f38506i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ArrayList f38507j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f38508k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Fragment f38509l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Fragment f38510m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean f38511n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ ArrayList f38512o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f38513p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Rect f38514q;

    public FragmentTransition6(FragmentTransitionImpl fragmentTransitionImpl, ArrayMap arrayMap, Object obj, FragmentTransition7.b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f38503f = fragmentTransitionImpl;
        this.f38504g = arrayMap;
        this.f38505h = obj;
        this.f38506i = bVar;
        this.f38507j = arrayList;
        this.f38508k = view;
        this.f38509l = fragment;
        this.f38510m = fragment2;
        this.f38511n = z;
        this.f38512o = arrayList2;
        this.f38513p = obj2;
        this.f38514q = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayMap<String, View> arrayMapM16590e = FragmentTransition7.m16590e(this.f38503f, this.f38504g, this.f38505h, this.f38506i);
        if (arrayMapM16590e != null) {
            this.f38507j.addAll(arrayMapM16590e.values());
            this.f38507j.add(this.f38508k);
        }
        FragmentTransition7.m16588c(this.f38509l, this.f38510m, this.f38511n, arrayMapM16590e, false);
        Object obj = this.f38505h;
        if (obj != null) {
            this.f38503f.mo15487x(obj, this.f38512o, this.f38507j);
            View viewM16596k = FragmentTransition7.m16596k(arrayMapM16590e, this.f38506i, this.f38513p, this.f38511n);
            if (viewM16596k != null) {
                this.f38503f.m16608j(viewM16596k, this.f38514q);
            }
        }
    }
}
