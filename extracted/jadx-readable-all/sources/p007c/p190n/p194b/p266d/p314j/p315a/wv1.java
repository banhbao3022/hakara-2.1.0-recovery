package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wv1 extends jv1<kv1> {

    /* JADX INFO: renamed from: i */
    public final pu1 f21377i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ yv1 f21378j;

    public wv1(yv1 yv1Var, pu1 pu1Var) {
        this.f21378j = yv1Var;
        Objects.requireNonNull(pu1Var);
        this.f21377i = pu1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ kv1 mo7401a() throws Exception {
        kv1 kv1VarZza = this.f21377i.zza();
        C2622l.m5427r2(kv1VarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f21377i);
        return kv1VarZza;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: b */
    public final String mo7402b() {
        return this.f21377i.toString();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: c */
    public final boolean mo7403c() {
        return this.f21378j.isDone();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo7404d(kv1 kv1Var, Throwable th) {
        kv1 kv1Var2 = kv1Var;
        if (th == null) {
            this.f21378j.m6533n(kv1Var2);
        } else {
            this.f21378j.mo6532m(th);
        }
    }
}
