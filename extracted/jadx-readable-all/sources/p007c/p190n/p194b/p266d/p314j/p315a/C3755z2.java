package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.z2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3755z2 {

    /* JADX INFO: renamed from: a */
    public final Collection<AbstractC3718y2<?>> f22156a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Collection<AbstractC3718y2<String>> f22157b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Collection<AbstractC3718y2<String>> f22158c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final List<String> m8843a() {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC3718y2<String>> it = this.f22157b.iterator();
        while (it.hasNext()) {
            String str = (String) C2862b.f12493a.f12496d.m6596a(it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        C2622l.m5230B2(arrayList2, C2979e4.m6602c("gad:dynamite_module:experiment_id", ""));
        C2622l.m5230B2(arrayList2, C3349o4.f17517a);
        C2622l.m5230B2(arrayList2, C3349o4.f17518b);
        C2622l.m5230B2(arrayList2, C3349o4.f17519c);
        C2622l.m5230B2(arrayList2, C3349o4.f17520d);
        C2622l.m5230B2(arrayList2, C3349o4.f17521e);
        C2622l.m5230B2(arrayList2, C3349o4.f17527k);
        C2622l.m5230B2(arrayList2, C3349o4.f17522f);
        C2622l.m5230B2(arrayList2, C3349o4.f17523g);
        C2622l.m5230B2(arrayList2, C3349o4.f17524h);
        C2622l.m5230B2(arrayList2, C3349o4.f17525i);
        C2622l.m5230B2(arrayList2, C3349o4.f17526j);
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
