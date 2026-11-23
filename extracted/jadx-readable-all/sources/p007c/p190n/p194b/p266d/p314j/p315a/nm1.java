package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nm1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2782b f17160a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f17161b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<String, Long> f17162c = new HashMap();

    public nm1(InterfaceC2782b interfaceC2782b) {
        this.f17160a = interfaceC2782b;
    }

    /* JADX INFO: renamed from: a */
    public final void m7883a(String str, String str2) {
        if (!this.f17161b.containsKey(str)) {
            this.f17161b.put(str, new ArrayList());
        }
        this.f17161b.get(str).add(str2);
    }
}
