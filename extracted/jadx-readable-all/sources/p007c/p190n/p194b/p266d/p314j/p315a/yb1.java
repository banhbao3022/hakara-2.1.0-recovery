package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 implements ia1<zb1> {

    /* JADX INFO: renamed from: a */
    public final lv1 f21836a;

    public yb1(C3627vm c3627vm, lv1 lv1Var, String str, byte[] bArr) {
        this.f21836a = lv1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<zb1> zza() {
        new C3147io();
        final kv1 kv1VarM6231a = cw0.m6231a(null);
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14468w3)).booleanValue()) {
            kv1VarM6231a = cw0.m6231a(null);
        }
        final kv1 kv1VarM6231a2 = cw0.m6231a(null);
        return cw0.m6251u(kv1VarM6231a, kv1VarM6231a2).m6889a(new Callable(kv1VarM6231a, kv1VarM6231a2) { // from class: c.n.b.d.j.a.xb1

            /* JADX INFO: renamed from: a */
            public final kv1 f21480a;

            /* JADX INFO: renamed from: b */
            public final kv1 f21481b;

            {
                this.f21480a = kv1VarM6231a;
                this.f21481b = kv1VarM6231a2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zb1((String) this.f21480a.get(), (String) this.f21481b.get());
            }
        }, C2962do.f13330a);
    }
}
