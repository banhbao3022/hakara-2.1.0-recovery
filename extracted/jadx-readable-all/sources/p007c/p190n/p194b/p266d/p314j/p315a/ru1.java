package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ru1<V> {

    /* JADX INFO: renamed from: u */
    public List<su1<V>> f19071u;

    public ru1(qs1 qs1Var) {
        List<su1<V>> arrayList;
        super(qs1Var, true, true);
        if (qs1Var.isEmpty()) {
            ns1<Object> ns1Var = ts1.f19979g;
            arrayList = bt1.f12860h;
        } else {
            int size = qs1Var.size();
            C2622l.m5229B1(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < qs1Var.size(); i++) {
            arrayList.add(null);
        }
        this.f19071u = arrayList;
        m7558y();
    }

    /* JADX INFO: renamed from: A */
    public final void m8325A(int i, Object obj) {
        List<su1<V>> list = this.f19071u;
        if (list != null) {
            list.set(i, new su1<>(obj));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8326B() {
        List<su1<V>> list = this.f19071u;
        if (list != null) {
            int size = list.size();
            C2622l.m5229B1(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            Iterator<su1<V>> it = list.iterator();
            while (it.hasNext()) {
                su1<V> next = it.next();
                arrayList.add(next != null ? next.f19705a : null);
            }
            mo6531l(Collections.unmodifiableList(arrayList));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8327t(int i) {
        this.f16040r = null;
        this.f19071u = null;
    }
}
