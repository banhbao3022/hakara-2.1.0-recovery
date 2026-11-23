package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.k */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5018k extends BinderC5010i<List<String>> {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5030n f25846h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5018k(C5030n c5030n, C5151o<List<String>> c5151o) {
        super(c5030n, c5151o);
        this.f25846h = c5030n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p367f.p368a.p370b.BinderC5010i, p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5110p0
    /* JADX INFO: renamed from: M5 */
    public final void mo11452M5(List<Bundle> list) {
        this.f25824g.f25881e.m11549b();
        C5030n.f25877a.m11533b(4, "onGetSessionStates", new Object[0]);
        C5030n c5030n = this.f25846h;
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : list) {
            C5027m0 c5027m0 = c5030n.f25880d;
            ArrayList<String> arrayList2 = new ArrayList();
            InterfaceC5050s interfaceC5050s = C5053t.f25955a;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            HashMap map = new HashMap();
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                map.put(str, AssetPackState.m12911e(bundle, str, c5027m0, interfaceC5050s));
            }
            for (String str2 : arrayList2) {
                map.put(str2, AssetPackState.m12910d(str2, 4, 0, 0L, 0L, 0.0d, 1, ""));
            }
            AssetPackState next = new C4979a0(bundle.getLong("total_bytes_to_download"), map).f25696b.values().iterator().next();
            if (next == null) {
                C5030n.f25877a.m11533b(6, "onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C4799a.m10955F(next.mo11519h())) {
                arrayList.add(next.mo11518g());
            }
        }
        this.f25823f.m11573b((T) arrayList);
    }
}
