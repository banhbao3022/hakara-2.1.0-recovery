package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.os.RemoteException;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class h41 implements z80, u70, l60, a70, uv2, i60, r80, mg2, w60 {

    /* JADX INFO: renamed from: n */
    public final im1 f14756n;

    /* JADX INFO: renamed from: f */
    public final AtomicReference<InterfaceC3122i> f14748f = new AtomicReference<>();

    /* JADX INFO: renamed from: g */
    public final AtomicReference<InterfaceC2863b0> f14749g = new AtomicReference<>();

    /* JADX INFO: renamed from: h */
    public final AtomicReference<InterfaceC2864b1> f14750h = new AtomicReference<>();

    /* JADX INFO: renamed from: i */
    public final AtomicReference<InterfaceC3233l> f14751i = new AtomicReference<>();

    /* JADX INFO: renamed from: j */
    public final AtomicReference<InterfaceC3123i0> f14752j = new AtomicReference<>();

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f14753k = new AtomicBoolean(true);

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f14754l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f14755m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o */
    public final BlockingQueue<Pair<String, String>> f14757o = new ArrayBlockingQueue(((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14379j5)).intValue());

    public h41(im1 im1Var) {
        this.f14756n = im1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: Q */
    public final void mo6214Q(di1 di1Var) {
        this.f14753k.set(true);
        this.f14755m.set(false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.r80
    /* JADX INFO: renamed from: a */
    public final void mo6968a(lw2 lw2Var) {
        cw0.m6234d(this.f14750h, new t31(lw2Var));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final synchronized void mo5730a0() {
        cw0.m6234d(this.f14748f, c41.f12937a);
        cw0.m6234d(this.f14751i, d41.f13174a);
        this.f14755m.set(true);
        m7055p();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: b */
    public final void mo6969b() {
        cw0.m6234d(this.f14748f, e41.f13492a);
        cw0.m6234d(this.f14752j, f41.f13784a);
        cw0.m6234d(this.f14752j, q31.f18188a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: c */
    public final void mo6970c() {
        cw0.m6234d(this.f14748f, b41.f12524a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mg2
    @TargetApi(5)
    /* JADX INFO: renamed from: d */
    public final synchronized void mo6971d(final String str, final String str2) {
        if (!this.f14753k.get()) {
            cw0.m6234d(this.f14749g, new ze1(str, str2) { // from class: c.n.b.d.j.a.u31

                /* JADX INFO: renamed from: a */
                public final String f20208a;

                /* JADX INFO: renamed from: b */
                public final String f20209b;

                {
                    this.f20208a = str;
                    this.f20209b = str2;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
                /* JADX INFO: renamed from: a */
                public final void mo5685a(Object obj) throws RemoteException {
                    ((InterfaceC2863b0) obj).mo5896Z(this.f20208a, this.f20209b);
                }
            });
            return;
        }
        if (!this.f14757o.offer(new Pair<>(str, str2))) {
            C2622l.m5318U2("The queue for app events is full, dropping the new event.");
            im1 im1Var = this.f14756n;
            if (im1Var != null) {
                hm1 hm1VarM7144a = hm1.m7144a("dae_action");
                hm1VarM7144a.f14911a.put("dae_name", str);
                hm1VarM7144a.f14911a.put("dae_data", str2);
                im1Var.mo7280b(hm1VarM7144a);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: e */
    public final void mo6972e() {
        cw0.m6234d(this.f14748f, p31.f17821a);
        cw0.m6234d(this.f14752j, x31.f21433a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: f */
    public final void mo6973f() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: g */
    public final void mo6974g() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final void mo5699i() {
        cw0.m6234d(this.f14748f, s31.f19460a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        cw0.m6234d(this.f14748f, r31.f18703a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: j */
    public final void mo6975j(InterfaceC3068gj interfaceC3068gj, String str, String str2) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: m */
    public final void mo6215m(C3437qi c3437qi) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w60
    /* JADX INFO: renamed from: m0 */
    public final void mo6976m0(yv2 yv2Var) {
        cw0.m6234d(this.f14752j, new v31(yv2Var));
    }

    /* JADX INFO: renamed from: n */
    public final synchronized InterfaceC3122i m7054n() {
        return this.f14748f.get();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final void mo6216o0(final yv2 yv2Var) {
        cw0.m6234d(this.f14748f, new ze1(yv2Var) { // from class: c.n.b.d.j.a.y31

            /* JADX INFO: renamed from: a */
            public final yv2 f21739a;

            {
                this.f21739a = yv2Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
            /* JADX INFO: renamed from: a */
            public final void mo5685a(Object obj) throws RemoteException {
                ((InterfaceC3122i) obj).mo5870D0(this.f21739a);
            }
        });
        cw0.m6234d(this.f14748f, new ze1(yv2Var) { // from class: c.n.b.d.j.a.z31

            /* JADX INFO: renamed from: a */
            public final yv2 f22165a;

            {
                this.f22165a = yv2Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
            /* JADX INFO: renamed from: a */
            public final void mo5685a(Object obj) throws RemoteException {
                ((InterfaceC3122i) obj).mo5871L(this.f22165a.f22116f);
            }
        });
        cw0.m6234d(this.f14751i, new ze1(yv2Var) { // from class: c.n.b.d.j.a.a41

            /* JADX INFO: renamed from: a */
            public final yv2 f12015a;

            {
                this.f12015a = yv2Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
            /* JADX INFO: renamed from: a */
            public final void mo5685a(Object obj) throws RemoteException {
                ((InterfaceC3233l) obj).mo6114d6(this.f12015a);
            }
        });
        this.f14753k.set(false);
        this.f14757o.clear();
    }

    @TargetApi(5)
    /* JADX INFO: renamed from: p */
    public final void m7055p() {
        if (this.f14754l.get() && this.f14755m.get()) {
            Iterator it = this.f14757o.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                cw0.m6234d(this.f14749g, new ze1(pair) { // from class: c.n.b.d.j.a.w31

                    /* JADX INFO: renamed from: a */
                    public final Pair f20984a;

                    {
                        this.f20984a = pair;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
                    /* JADX INFO: renamed from: a */
                    public final void mo5685a(Object obj) throws RemoteException {
                        Pair pair2 = this.f20984a;
                        ((InterfaceC2863b0) obj).mo5896Z((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f14757o.clear();
            this.f14753k.set(false);
        }
    }
}
