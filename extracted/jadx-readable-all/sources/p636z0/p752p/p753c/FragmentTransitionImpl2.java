package p636z0.p752p.p753c;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.p.c.t0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransitionImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionImpl2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ArrayList f38553f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Map f38554g;

    public FragmentTransitionImpl2(FragmentTransitionImpl fragmentTransitionImpl, ArrayList arrayList, Map map) {
        this.f38553f = arrayList;
        this.f38554g = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f38553f.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f38553f.get(i);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                Iterator it = this.f38554g.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (transitionName.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
