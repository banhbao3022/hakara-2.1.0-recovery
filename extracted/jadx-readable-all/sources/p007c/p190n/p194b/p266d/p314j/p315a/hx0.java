package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hx0 {

    /* JADX INFO: renamed from: c */
    public rh1 f15046c = null;

    /* JADX INFO: renamed from: b */
    public final Map<String, ow2> f15045b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a */
    public final List<ow2> f15044a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a */
    public final void m7179a(rh1 rh1Var, long j2, yv2 yv2Var) {
        String str = rh1Var.f18831v;
        if (this.f15045b.containsKey(str)) {
            if (this.f15046c == null) {
                this.f15046c = rh1Var;
            }
            ow2 ow2Var = this.f15045b.get(str);
            ow2Var.f17775g = j2;
            ow2Var.f17776h = yv2Var;
        }
    }
}
