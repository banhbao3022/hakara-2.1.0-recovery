package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p61 implements ia1 {

    /* JADX INFO: renamed from: a */
    public static final Object f17864a = new Object();

    /* JADX INFO: renamed from: b */
    public final String f17865b;

    /* JADX INFO: renamed from: c */
    public final String f17866c;

    /* JADX INFO: renamed from: d */
    public final y30 f17867d;

    /* JADX INFO: renamed from: e */
    public final dj1 f17868e;

    /* JADX INFO: renamed from: f */
    public final ii1 f17869f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2305w0 f17870g = C2330u.f10884a.f10893h.m6649f();

    public p61(String str, String str2, y30 y30Var, dj1 dj1Var, ii1 ii1Var) {
        this.f17865b = str;
        this.f17866c = str2;
        this.f17867d = y30Var;
        this.f17868e = dj1Var;
        this.f17869f = ii1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1 zza() {
        final Bundle bundle = new Bundle();
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14398m3)).booleanValue()) {
            this.f17867d.m8776a(this.f17869f.f15191d);
            bundle.putAll(this.f17868e.m6359a());
        }
        return cw0.m6231a(new ha1(this, bundle) { // from class: c.n.b.d.j.a.o61

            /* JADX INFO: renamed from: a */
            public final p61 f17544a;

            /* JADX INFO: renamed from: b */
            public final Bundle f17545b;

            {
                this.f17544a = this;
                this.f17545b = bundle;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
            /* JADX INFO: renamed from: d */
            public final void mo5696d(Object obj) {
                p61 p61Var = this.f17544a;
                Bundle bundle2 = this.f17545b;
                Bundle bundle3 = (Bundle) obj;
                Objects.requireNonNull(p61Var);
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14398m3;
                C2862b c2862b = C2862b.f12493a;
                if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                    bundle3.putBundle("quality_signals", bundle2);
                } else {
                    if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14391l3)).booleanValue()) {
                        synchronized (p61.f17864a) {
                            p61Var.f17867d.m8776a(p61Var.f17869f.f15191d);
                            bundle3.putBundle("quality_signals", p61Var.f17868e.m6359a());
                        }
                    } else {
                        p61Var.f17867d.m8776a(p61Var.f17869f.f15191d);
                        bundle3.putBundle("quality_signals", p61Var.f17868e.m6359a());
                    }
                }
                bundle3.putString("seq_num", p61Var.f17865b);
                bundle3.putString("session_id", p61Var.f17870g.mo4811O() ? "" : p61Var.f17866c);
            }
        });
    }
}
