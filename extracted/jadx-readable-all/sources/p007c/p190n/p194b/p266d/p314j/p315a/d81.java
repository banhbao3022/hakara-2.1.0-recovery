package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d81 implements ia1<e81> {

    /* JADX INFO: renamed from: a */
    public final lv1 f13187a;

    /* JADX INFO: renamed from: b */
    public final br0 f13188b;

    public d81(lv1 lv1Var, br0 br0Var) {
        this.f13187a = lv1Var;
        this.f13188b = br0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<e81> zza() {
        return this.f13187a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.c81

            /* JADX INFO: renamed from: a */
            public final d81 f12956a;

            {
                this.f12956a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                br0 br0Var = this.f12956a.f13188b;
                synchronized (br0Var) {
                    if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14400m5)).booleanValue() || !br0Var.f12797k) {
                        str = "";
                    } else if (br0Var.f12795i < C2330u.f10884a.f10896k.mo5624d() / 1000) {
                        br0Var.f12794h = "{}";
                        str = "";
                    } else {
                        str = br0Var.f12794h.equals("{}") ? "" : br0Var.f12794h;
                    }
                }
                return new e81(str);
            }
        });
    }
}
