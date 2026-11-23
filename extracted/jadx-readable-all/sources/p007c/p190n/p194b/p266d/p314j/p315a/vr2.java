package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vr2 implements AbstractC2717c.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3147io f20918a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wr2 f20919b;

    public vr2(wr2 wr2Var, C3147io c3147io) {
        this.f20919b = wr2Var;
        this.f20918a = c3147io;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.b
    /* JADX INFO: renamed from: W */
    public final void mo5565W(C2602b c2602b) {
        synchronized (this.f20919b.f21317d) {
            this.f20918a.m7287b(new RuntimeException("Connection failed."));
        }
    }
}
