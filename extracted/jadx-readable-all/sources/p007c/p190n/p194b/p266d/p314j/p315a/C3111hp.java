package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: c.n.b.d.j.a.hp */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3111hp extends C3321nd {
    public C3111hp() {
    }

    public C3111hp(InterfaceC3073go interfaceC3073go, SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: renamed from: a */
    public static List<tr2> m7152a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new tr2(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }
}
