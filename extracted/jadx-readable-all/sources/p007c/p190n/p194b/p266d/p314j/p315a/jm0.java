package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jm0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, im0> f15656a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final im0 m7362a(List<String> list) {
        im0 im0Var;
        for (String str : list) {
            synchronized (this) {
                im0Var = this.f15656a.get(str);
            }
            if (im0Var != null) {
                return im0Var;
            }
        }
        return null;
    }
}
