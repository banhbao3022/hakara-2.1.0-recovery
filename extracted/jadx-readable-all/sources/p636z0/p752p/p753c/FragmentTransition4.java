package p636z0.p752p.p753c;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: z0.p.c.n0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentTransition4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f38482f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ FragmentTransitionImpl f38483g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ View f38484h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Fragment f38485i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ArrayList f38486j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ArrayList f38487k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ArrayList f38488l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f38489m;

    public FragmentTransition4(Object obj, FragmentTransitionImpl fragmentTransitionImpl, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f38482f = obj;
        this.f38483g = fragmentTransitionImpl;
        this.f38484h = view;
        this.f38485i = fragment;
        this.f38486j = arrayList;
        this.f38487k = arrayList2;
        this.f38488l = arrayList3;
        this.f38489m = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f38482f;
        if (obj != null) {
            this.f38483g.mo15479o(obj, this.f38484h);
            this.f38487k.addAll(FragmentTransition7.m16593h(this.f38483g, this.f38482f, this.f38485i, this.f38486j, this.f38484h));
        }
        if (this.f38488l != null) {
            if (this.f38489m != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f38484h);
                this.f38483g.mo15480p(this.f38489m, this.f38488l, arrayList);
            }
            this.f38488l.clear();
            this.f38488l.add(this.f38484h);
        }
    }
}
