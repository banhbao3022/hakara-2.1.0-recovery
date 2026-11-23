package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.p302q.C2759t;
import p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2745m;
import p007c.p190n.p194b.p266d.p330l.p331b.C4758l;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.r0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2688r0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4758l f11751f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BinderC2684p0 f11752g;

    public RunnableC2688r0(BinderC2684p0 binderC2684p0, C4758l c4758l) {
        this.f11752g = binderC2684p0;
        this.f11751f = c4758l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC2684p0 binderC2684p0 = this.f11752g;
        C4758l c4758l = this.f11751f;
        Objects.requireNonNull(binderC2684p0);
        C2602b c2602b = c4758l.f24649g;
        if (c2602b.m5197K()) {
            C2759t c2759t = c4758l.f24650h;
            C2602b c2602b2 = c2759t.f11913h;
            if (!c2602b2.m5197K()) {
                String strValueOf = String.valueOf(c2602b2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                ((C2659g.b) binderC2684p0.f11745m).m5536b(c2602b2);
                binderC2684p0.f11744l.mo5133J();
                return;
            }
            InterfaceC2686q0 interfaceC2686q0 = binderC2684p0.f11745m;
            InterfaceC2745m interfaceC2745mM5610H = c2759t.m5610H();
            Set<Scope> set = binderC2684p0.f11742j;
            C2659g.b bVar = (C2659g.b) interfaceC2686q0;
            Objects.requireNonNull(bVar);
            if (interfaceC2745mM5610H == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                bVar.m5536b(new C2602b(4));
            } else {
                bVar.f11688c = interfaceC2745mM5610H;
                bVar.f11689d = set;
                if (bVar.f11690e) {
                    bVar.f11686a.m5473b(interfaceC2745mM5610H, set);
                }
            }
        } else {
            ((C2659g.b) binderC2684p0.f11745m).m5536b(c2602b);
        }
        binderC2684p0.f11744l.mo5133J();
    }
}
