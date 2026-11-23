package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jo1 implements ho1 {

    /* JADX INFO: renamed from: a */
    public final ho1 f15672a;

    public jo1(ho1 ho1Var) {
        this.f15672a = ho1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ho1
    /* JADX INFO: renamed from: a */
    public final void mo7150a(View view, JSONObject jSONObject, go1 go1Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        yn1 yn1Var = yn1.f21931a;
        if (yn1Var != null) {
            Collection<nn1> collectionM8807b = yn1Var.m8807b();
            int size = collectionM8807b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator<nn1> it = collectionM8807b.iterator();
            while (it.hasNext()) {
                View viewM7897g = it.next().m7897g();
                if (viewM7897g != null && viewM7897g.isAttachedToWindow() && viewM7897g.isShown()) {
                    View view2 = viewM7897g;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewM7897g.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z2 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z2) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            ((zo1) go1Var).m8895a((View) arrayList.get(i2), this.f15672a, jSONObject);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ho1
    /* JADX INFO: renamed from: c */
    public final JSONObject mo7151c(View view) {
        throw null;
    }
}
