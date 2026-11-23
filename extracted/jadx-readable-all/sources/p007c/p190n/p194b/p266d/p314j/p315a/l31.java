package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p279w.C2198a;
import p007c.p190n.p194b.p266d.p267a.p279w.C2204g;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class l31 extends AbstractBinderC3418q {

    /* JADX INFO: renamed from: f */
    public final Context f16269f;

    /* JADX INFO: renamed from: g */
    public final AbstractC3264lu f16270g;

    /* JADX INFO: renamed from: h */
    public final hi1 f16271h;

    /* JADX INFO: renamed from: i */
    public final lg0 f16272i;

    /* JADX INFO: renamed from: j */
    public InterfaceC3122i f16273j;

    public l31(AbstractC3264lu abstractC3264lu, Context context, String str) {
        hi1 hi1Var = new hi1();
        this.f16271h = hi1Var;
        this.f16272i = new lg0();
        this.f16270g = abstractC3264lu;
        hi1Var.f14857c = str;
        this.f16269f = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: B6 */
    public final void mo5666B6(String str, InterfaceC3536t6 interfaceC3536t6, InterfaceC3425q6 interfaceC3425q6) {
        lg0 lg0Var = this.f16272i;
        lg0Var.f16352f.put(str, interfaceC3536t6);
        if (interfaceC3425q6 != null) {
            lg0Var.f16353g.put(str, interfaceC3425q6);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: C5 */
    public final void mo5667C5(C3165j5 c3165j5) {
        this.f16271h.f14862h = c3165j5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: E1 */
    public final void mo5668E1(InterfaceC3240l6 interfaceC3240l6) {
        this.f16272i.f16348b = interfaceC3240l6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: I2 */
    public final void mo5669I2(C2198a c2198a) {
        hi1 hi1Var = this.f16271h;
        hi1Var.f14864j = c2198a;
        if (c2198a != null) {
            hi1Var.f14859e = c2198a.f10596f;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: K0 */
    public final void mo5670K0(InterfaceC3122i interfaceC3122i) {
        this.f16273j = interfaceC3122i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: L5 */
    public final void mo5671L5(InterfaceC3314n6 interfaceC3314n6) {
        this.f16272i.f16347a = interfaceC3314n6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: Q0 */
    public final void mo5672Q0(InterfaceC3503sa interfaceC3503sa) {
        this.f16272i.f16351e = interfaceC3503sa;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: c */
    public final InterfaceC3344o mo5673c() {
        lg0 lg0Var = this.f16272i;
        Objects.requireNonNull(lg0Var);
        mg0 mg0Var = new mg0(lg0Var);
        hi1 hi1Var = this.f16271h;
        ArrayList<String> arrayList = new ArrayList<>();
        if (mg0Var.f16750d != null) {
            arrayList.add(Integer.toString(6));
        }
        if (mg0Var.f16748b != null) {
            arrayList.add(Integer.toString(1));
        }
        if (mg0Var.f16749c != null) {
            arrayList.add(Integer.toString(2));
        }
        if (mg0Var.f16753g.f36667l > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (mg0Var.f16752f != null) {
            arrayList.add(Integer.toString(7));
        }
        hi1Var.f14860f = arrayList;
        hi1 hi1Var2 = this.f16271h;
        ArrayList<String> arrayList2 = new ArrayList<>(mg0Var.f16753g.f36667l);
        int i = 0;
        while (true) {
            SimpleArrayMap<String, InterfaceC3536t6> simpleArrayMap = mg0Var.f16753g;
            if (i >= simpleArrayMap.f36667l) {
                break;
            }
            arrayList2.add(simpleArrayMap.m15611h(i));
            i++;
        }
        hi1Var2.f14861g = arrayList2;
        hi1 hi1Var3 = this.f16271h;
        if (hi1Var3.f14856b == null) {
            hi1Var3.f14856b = jw2.m7416H();
        }
        return new m31(this.f16269f, this.f16270g, this.f16271h, mg0Var, this.f16273j);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: c5 */
    public final void mo5674c5(InterfaceC3759z6 interfaceC3759z6) {
        this.f16272i.f16349c = interfaceC3759z6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: p3 */
    public final void mo5675p3(C2204g c2204g) {
        hi1 hi1Var = this.f16271h;
        hi1Var.f14865k = c2204g;
        if (c2204g != null) {
            hi1Var.f14859e = c2204g.f10612f;
            hi1Var.f14866l = c2204g.f10613g;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: q5 */
    public final void mo5676q5(C3170ja c3170ja) {
        hi1 hi1Var = this.f16271h;
        hi1Var.f14868n = c3170ja;
        hi1Var.f14858d = new C3310n2(false, true, false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: s3 */
    public final void mo5677s3(C3012f0 c3012f0) {
        this.f16271h.f14872r = c3012f0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: w2 */
    public final void mo5678w2(InterfaceC3648w6 interfaceC3648w6, jw2 jw2Var) {
        this.f16272i.f16350d = interfaceC3648w6;
        this.f16271h.f14856b = jw2Var;
    }
}
