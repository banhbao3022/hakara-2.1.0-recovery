package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class h92 {
    /* JADX INFO: renamed from: a */
    public static final int m7105a(int i, Object obj, Object obj2) {
        g92 g92Var = (g92) obj;
        if (g92Var.isEmpty()) {
            return 0;
        }
        Iterator it = g92Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m7106b(Object obj) {
        return !((g92) obj).f14524g;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m7107c(Object obj, Object obj2) {
        g92 g92VarM6980b = (g92) obj;
        g92 g92Var = (g92) obj2;
        if (!g92Var.isEmpty()) {
            if (!g92VarM6980b.f14524g) {
                g92VarM6980b = g92VarM6980b.m6980b();
            }
            g92VarM6980b.m6981e();
            if (!g92Var.isEmpty()) {
                g92VarM6980b.putAll(g92Var);
            }
        }
        return g92VarM6980b;
    }
}
