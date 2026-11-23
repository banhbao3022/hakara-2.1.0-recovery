package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 extends AbstractBinderC3401pj implements q70 {

    /* JADX INFO: renamed from: f */
    public InterfaceC3438qj f22445f;

    /* JADX INFO: renamed from: g */
    public b21 f22446g;

    /* JADX INFO: renamed from: h */
    public r11 f22447h;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: H */
    public final synchronized void mo8210H(InterfaceC2799a interfaceC2799a) throws RemoteException {
        InterfaceC3438qj interfaceC3438qj = this.f22445f;
        if (interfaceC3438qj != null) {
            ((s11) interfaceC3438qj).f19445h.m7108A0(j70.f15502a);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: H2 */
    public final synchronized void mo8026H2(InterfaceC2799a interfaceC2799a, int i) throws RemoteException {
        b21 b21Var = this.f22446g;
        if (b21Var != null) {
            b21Var.m5919a(i);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: M4 */
    public final synchronized void mo8027M4(InterfaceC2799a interfaceC2799a) throws RemoteException {
        InterfaceC3438qj interfaceC3438qj = this.f22445f;
        if (interfaceC3438qj != null) {
            interfaceC3438qj.mo8027M4(interfaceC2799a);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: P2 */
    public final synchronized void mo8211P2(InterfaceC2799a interfaceC2799a, int i) throws RemoteException {
        r11 r11Var = this.f22447h;
        if (r11Var != null) {
            String strValueOf = String.valueOf(r11Var.f18688c.f13743a);
            C2622l.m5226A3(strValueOf.length() != 0 ? "Fail to initialize adapter ".concat(strValueOf) : new String("Fail to initialize adapter "));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: R */
    public final synchronized void mo8028R(InterfaceC2799a interfaceC2799a) throws RemoteException {
        InterfaceC3438qj interfaceC3438qj = this.f22445f;
        if (interfaceC3438qj != null) {
            ((s11) interfaceC3438qj).f19446i.zza();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: V0 */
    public final synchronized void mo8029V0(InterfaceC2799a interfaceC2799a, C3475rj c3475rj) throws RemoteException {
        InterfaceC3438qj interfaceC3438qj = this.f22445f;
        if (interfaceC3438qj != null) {
            ((s11) interfaceC3438qj).f19446i.m7108A0(new mc0(c3475rj));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: h0 */
    public final synchronized void mo8030h0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        final r11 r11Var = this.f22447h;
        if (r11Var != null) {
            Executor executor = r11Var.f18689d.f19751b;
            final di1 di1Var = r11Var.f18686a;
            final rh1 rh1Var = r11Var.f18687b;
            final ex0 ex0Var = r11Var.f18688c;
            executor.execute(new Runnable(r11Var, di1Var, rh1Var, ex0Var) { // from class: c.n.b.d.j.a.q11

                /* JADX INFO: renamed from: f */
                public final r11 f18167f;

                /* JADX INFO: renamed from: g */
                public final di1 f18168g;

                /* JADX INFO: renamed from: h */
                public final rh1 f18169h;

                /* JADX INFO: renamed from: i */
                public final ex0 f18170i;

                {
                    this.f18167f = r11Var;
                    this.f18168g = di1Var;
                    this.f18169h = rh1Var;
                    this.f18170i = ex0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    r11 r11Var2 = this.f18167f;
                    di1 di1Var2 = this.f18168g;
                    rh1 rh1Var2 = this.f18169h;
                    ex0 ex0Var2 = this.f18170i;
                    t11 t11Var = r11Var2.f18689d;
                    t11.m8383c(di1Var2, rh1Var2, ex0Var2);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.q70
    /* JADX INFO: renamed from: i4 */
    public final synchronized void mo8192i4(b21 b21Var) {
        this.f22446g = b21Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: k0 */
    public final synchronized void mo8031k0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        InterfaceC3438qj interfaceC3438qj = this.f22445f;
        if (interfaceC3438qj != null) {
            ((s11) interfaceC3438qj).f19443f.mo4698F3();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: l6 */
    public final synchronized void mo8032l6(InterfaceC2799a interfaceC2799a) throws RemoteException {
        InterfaceC3438qj interfaceC3438qj = this.f22445f;
        if (interfaceC3438qj != null) {
            ((s11) interfaceC3438qj).f19444g.m7108A0(f60.f13980a);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: q0 */
    public final synchronized void mo8033q0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        b21 b21Var = this.f22446g;
        if (b21Var != null) {
            synchronized (b21Var) {
                b21Var.f12508c.m7286a(null);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3438qj
    /* JADX INFO: renamed from: z1 */
    public final synchronized void mo8034z1(InterfaceC2799a interfaceC2799a) throws RemoteException {
        InterfaceC3438qj interfaceC3438qj = this.f22445f;
        if (interfaceC3438qj != null) {
            ((s11) interfaceC3438qj).f19445h.m7108A0(n70.f17034a);
        }
    }
}
