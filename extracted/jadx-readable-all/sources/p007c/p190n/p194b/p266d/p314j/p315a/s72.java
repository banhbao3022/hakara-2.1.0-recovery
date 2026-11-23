package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s72 {

    /* JADX INFO: renamed from: a */
    public static volatile s72 f19479a;

    /* JADX INFO: renamed from: b */
    public static volatile s72 f19480b;

    /* JADX INFO: renamed from: c */
    public static final s72 f19481c = new s72(true);

    /* JADX INFO: renamed from: d */
    public final Map<r72, f82<?, ?>> f19482d;

    public s72() {
        this.f19482d = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static s72 m8347a() {
        s72 s72Var = f19479a;
        if (s72Var == null) {
            synchronized (s72.class) {
                s72Var = f19479a;
                if (s72Var == null) {
                    s72Var = f19481c;
                    f19479a = s72Var;
                }
            }
        }
        return s72Var;
    }

    /* JADX INFO: renamed from: b */
    public static s72 m8348b() {
        s72 s72Var = f19480b;
        if (s72Var != null) {
            return s72Var;
        }
        synchronized (s72.class) {
            s72 s72Var2 = f19480b;
            if (s72Var2 != null) {
                return s72Var2;
            }
            s72 s72VarM5933b = b82.m5933b(s72.class);
            f19480b = s72VarM5933b;
            return s72VarM5933b;
        }
    }

    public s72(boolean z) {
        this.f19482d = Collections.emptyMap();
    }
}
