package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class po0 {

    /* JADX INFO: renamed from: a */
    public final uo0 f18043a;

    /* JADX INFO: renamed from: b */
    public final Executor f18044b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f18045c;

    public po0(uo0 uo0Var, Executor executor) {
        this.f18043a = uo0Var;
        Objects.requireNonNull(uo0Var);
        this.f18045c = new HashMap(uo0Var.f21275a);
        this.f18044b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final oo0 m8131a() {
        oo0 oo0Var = new oo0(this);
        oo0Var.f17700a.putAll(this.f18045c);
        return oo0Var;
    }
}
