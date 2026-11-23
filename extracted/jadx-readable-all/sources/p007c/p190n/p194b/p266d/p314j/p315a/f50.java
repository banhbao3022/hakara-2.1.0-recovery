package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2277l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class f50 implements zc2<cs1<rh1, C2277l>> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f13787a;

    /* JADX INFO: renamed from: b */
    public final gd2<C3702xn> f13788b;

    /* JADX INFO: renamed from: c */
    public final gd2<ii1> f13789c;

    public f50(gd2<Context> gd2Var, gd2<C3702xn> gd2Var2, gd2<ii1> gd2Var3) {
        this.f13787a = gd2Var;
        this.f13788b = gd2Var2;
        this.f13789c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo4613a() {
        final Context contextMo4613a = this.f13787a.mo4613a();
        final C3702xn c3702xnM8831b = ((C3746yu) this.f13788b).m8831b();
        final ii1 ii1VarM8778b = ((y50) this.f13789c).m8778b();
        return new cs1(contextMo4613a, c3702xnM8831b, ii1VarM8778b) { // from class: c.n.b.d.j.a.e50

            /* JADX INFO: renamed from: a */
            public final Context f13505a;

            /* JADX INFO: renamed from: b */
            public final C3702xn f13506b;

            /* JADX INFO: renamed from: c */
            public final ii1 f13507c;

            {
                this.f13505a = contextMo4613a;
                this.f13506b = c3702xnM8831b;
                this.f13507c = ii1VarM8778b;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
            public final Object apply(Object obj) {
                Context context = this.f13505a;
                C3702xn c3702xn = this.f13506b;
                ii1 ii1Var = this.f13507c;
                rh1 rh1Var = (rh1) obj;
                C2277l c2277l = new C2277l(context);
                c2277l.f10734b = rh1Var.f18777A;
                c2277l.f10737e = rh1Var.f18778B.toString();
                c2277l.f10736d = c3702xn.f21615f;
                c2277l.f10735c = ii1Var.f15193f;
                return c2277l;
            }
        };
    }
}
