package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w81 implements ia1<x81> {

    /* JADX INFO: renamed from: a */
    public final lv1 f21017a;

    /* JADX INFO: renamed from: b */
    public final Context f21018b;

    /* JADX INFO: renamed from: c */
    public final Set<String> f21019c;

    public w81(lv1 lv1Var, Context context, Set<String> set) {
        this.f21017a = lv1Var;
        this.f21018b = context;
        this.f21019c = set;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<x81> zza() {
        return this.f21017a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.v81

            /* JADX INFO: renamed from: a */
            public final w81 f20711a;

            {
                this.f20711a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                w81 w81Var = this.f20711a;
                Objects.requireNonNull(w81Var);
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue()) {
                    Set<String> set = w81Var.f21019c;
                    if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                        return new x81(C2330u.f10884a.f10908w.mo5886q0(w81Var.f21018b));
                    }
                }
                return new x81(null);
            }
        });
    }
}
