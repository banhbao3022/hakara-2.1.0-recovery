package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p80 extends ha0<r80> implements a70, g80 {

    /* JADX INFO: renamed from: g */
    public final rh1 f17876g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f17877h;

    public p80(Set<bc0<r80>> set, rh1 rh1Var) {
        super(set);
        this.f17877h = new AtomicBoolean();
        this.f17876g = rh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g80
    /* JADX INFO: renamed from: T */
    public final void mo6949T() {
        if (this.f17876g.f18805b == 1) {
            m8087b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8087b() {
        lw2 lw2Var;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14490z4)).booleanValue() && this.f17877h.compareAndSet(false, true) && (lw2Var = this.f17876g.f18802Z) != null && lw2Var.f16629f == 3) {
            m7108A0(new ga0(this) { // from class: c.n.b.d.j.a.o80

                /* JADX INFO: renamed from: a */
                public final p80 f17554a;

                {
                    this.f17554a = this;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ga0
                /* JADX INFO: renamed from: a */
                public final void mo5710a(Object obj) {
                    ((r80) obj).mo6968a(this.f17554a.f17876g.f18802Z);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final void mo5699i() {
        int i = this.f17876g.f18805b;
        if (i == 2 || i == 5 || i == 4 || i == 6) {
            m8087b();
        }
    }
}
