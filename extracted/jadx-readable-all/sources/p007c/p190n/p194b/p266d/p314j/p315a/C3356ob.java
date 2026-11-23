package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.d.j.a.ob */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3356ob implements InterfaceC3464r8<InterfaceC2987ec> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2913cc f17587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3689xa f17588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2950dc f17589c;

    public C3356ob(C2950dc c2950dc, C2913cc c2913cc, InterfaceC3689xa interfaceC3689xa) {
        this.f17589c = c2950dc;
        this.f17587a = c2913cc;
        this.f17588b = interfaceC3689xa;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC2987ec interfaceC2987ec, Map map) {
        synchronized (this.f17589c.f13224a) {
            if (this.f17587a.m8130c() != -1 && this.f17587a.m8130c() != 1) {
                this.f17589c.f13230g = 0;
                InterfaceC3689xa interfaceC3689xa = this.f17588b;
                interfaceC3689xa.mo6618e("/log", C3427q8.f18219h);
                interfaceC3689xa.mo6618e("/result", C3427q8.f18227p);
                this.f17587a.f18041a.m7286a((T) this.f17588b);
                this.f17589c.f13229f = this.f17587a;
                C2096e.m4590z("Successfully loaded JS Engine.");
            }
        }
    }
}
