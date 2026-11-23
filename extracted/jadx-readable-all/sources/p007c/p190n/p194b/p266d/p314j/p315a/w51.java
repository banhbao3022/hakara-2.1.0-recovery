package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w51 implements ia1<ha1<Bundle>> {

    /* JADX INFO: renamed from: a */
    public final Set<String> f21006a;

    public w51(Set<String> set) {
        this.f21006a = set;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<ha1<Bundle>> zza() {
        final ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f21006a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return cw0.m6231a(new ha1(arrayList) { // from class: c.n.b.d.j.a.v51

            /* JADX INFO: renamed from: a */
            public final ArrayList f20699a;

            {
                this.f20699a = arrayList;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
            /* JADX INFO: renamed from: d */
            public final void mo5696d(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.f20699a);
            }
        });
    }
}
