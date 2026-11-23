package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.a.jy */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3194jy implements b70 {

    /* JADX INFO: renamed from: f */
    public final vi1 f15851f;

    public C3194jy(vi1 vi1Var) {
        this.f15851f = vi1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: a */
    public final void mo5929a(Context context) {
        try {
            vi1 vi1Var = this.f15851f;
            Objects.requireNonNull(vi1Var);
            try {
                vi1Var.f20804a.mo7846j();
            } catch (Throwable th) {
                throw new mi1(th);
            }
        } catch (mi1 e) {
            C2622l.m5241D3("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: t */
    public final void mo5930t(Context context) {
        try {
            vi1 vi1Var = this.f15851f;
            Objects.requireNonNull(vi1Var);
            try {
                vi1Var.f20804a.mo7845i();
            } catch (Throwable th) {
                throw new mi1(th);
            }
        } catch (mi1 e) {
            C2622l.m5241D3("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: v */
    public final void mo5931v(Context context) {
        try {
            vi1 vi1Var = this.f15851f;
            Objects.requireNonNull(vi1Var);
            try {
                vi1Var.f20804a.mo7848m();
                if (context != null) {
                    vi1 vi1Var2 = this.f15851f;
                    Objects.requireNonNull(vi1Var2);
                    try {
                        vi1Var2.f20804a.mo7840e0(new BinderC2800b(context));
                    } catch (Throwable th) {
                        throw new mi1(th);
                    }
                }
            } catch (Throwable th2) {
                throw new mi1(th2);
            }
        } catch (mi1 e) {
            C2622l.m5241D3("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
