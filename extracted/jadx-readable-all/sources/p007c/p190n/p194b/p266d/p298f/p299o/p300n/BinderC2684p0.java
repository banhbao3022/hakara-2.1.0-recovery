package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;
import p007c.p190n.p194b.p266d.p330l.C4746a;
import p007c.p190n.p194b.p266d.p330l.C4760d;
import p007c.p190n.p194b.p266d.p330l.InterfaceC4761e;
import p007c.p190n.p194b.p266d.p330l.p331b.BinderC4751e;
import p007c.p190n.p194b.p266d.p330l.p331b.C4758l;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.p0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2684p0 extends BinderC4751e implements AbstractC2632e.a, AbstractC2632e.b {

    /* JADX INFO: renamed from: f */
    public static C2628a.a<? extends InterfaceC4761e, C4746a> f11738f = C4760d.f24653c;

    /* JADX INFO: renamed from: g */
    public final Context f11739g;

    /* JADX INFO: renamed from: h */
    public final Handler f11740h;

    /* JADX INFO: renamed from: i */
    public final C2628a.a<? extends InterfaceC4761e, C4746a> f11741i;

    /* JADX INFO: renamed from: j */
    public Set<Scope> f11742j;

    /* JADX INFO: renamed from: k */
    public C2720d f11743k;

    /* JADX INFO: renamed from: l */
    public InterfaceC4761e f11744l;

    /* JADX INFO: renamed from: m */
    public InterfaceC2686q0 f11745m;

    public BinderC2684p0(Context context, Handler handler, C2720d c2720d) {
        this(context, handler, c2720d, f11738f);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2656f
    /* JADX INFO: renamed from: Q */
    public final void mo5510Q(int i) {
        this.f11744l.mo5133J();
    }

    @Override // p007c.p190n.p194b.p266d.p330l.p331b.BinderC4751e, p007c.p190n.p194b.p266d.p330l.p331b.InterfaceC4750d
    /* JADX INFO: renamed from: V1 */
    public final void mo5550V1(C4758l c4758l) {
        this.f11740h.post(new RunnableC2688r0(this, c4758l));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2674l
    /* JADX INFO: renamed from: W */
    public final void mo5517W(C2602b c2602b) {
        ((C2659g.b) this.f11745m).m5536b(c2602b);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2656f
    /* JADX INFO: renamed from: c0 */
    public final void mo5511c0(Bundle bundle) {
        this.f11744l.mo10917c(this);
    }

    public BinderC2684p0(Context context, Handler handler, C2720d c2720d, C2628a.a<? extends InterfaceC4761e, C4746a> aVar) {
        this.f11739g = context;
        this.f11740h = handler;
        C2622l.m5379i(c2720d, "ClientSettings must not be null");
        this.f11743k = c2720d;
        this.f11742j = c2720d.f11825b;
        this.f11741i = aVar;
    }
}
