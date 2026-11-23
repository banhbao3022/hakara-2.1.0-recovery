package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: renamed from: c.n.b.d.j.a.kz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3232kz implements ip2 {

    /* JADX INFO: renamed from: f */
    public InterfaceC3410ps f16234f;

    /* JADX INFO: renamed from: g */
    public final Executor f16235g;

    /* JADX INFO: renamed from: h */
    public final C3639vy f16236h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2782b f16237i;

    /* JADX INFO: renamed from: j */
    public boolean f16238j = false;

    /* JADX INFO: renamed from: k */
    public boolean f16239k = false;

    /* JADX INFO: renamed from: l */
    public final C3750yy f16240l = new C3750yy();

    public C3232kz(Executor executor, C3639vy c3639vy, InterfaceC2782b interfaceC2782b) {
        this.f16235g = executor;
        this.f16236h = c3639vy;
        this.f16237i = interfaceC2782b;
    }

    /* JADX INFO: renamed from: a */
    public final void m7566a() {
        try {
            final JSONObject jSONObjectMo7491b = this.f16236h.mo7491b(this.f16240l);
            if (this.f16234f != null) {
                this.f16235g.execute(new Runnable(this, jSONObjectMo7491b) { // from class: c.n.b.d.j.a.jz

                    /* JADX INFO: renamed from: f */
                    public final C3232kz f15856f;

                    /* JADX INFO: renamed from: g */
                    public final JSONObject f15857g;

                    {
                        this.f15856f = this;
                        this.f15857g = jSONObjectMo7491b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C3232kz c3232kz = this.f15856f;
                        c3232kz.f16234f.mo6507u0("AFMA_updateActiveView", this.f15857g);
                    }
                });
            }
        } catch (JSONException e) {
            C2096e.m4554C("Failed to call video active view js", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
    /* JADX INFO: renamed from: q0 */
    public final void mo6352q0(hp2 hp2Var) {
        C3750yy c3750yy = this.f16240l;
        c3750yy.f22133a = this.f16239k ? false : hp2Var.f14934j;
        c3750yy.f22135c = this.f16237i.mo5621a();
        this.f16240l.f22137e = hp2Var;
        if (this.f16238j) {
            m7566a();
        }
    }
}
