package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dh1 implements dv1<dl0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w41 f13273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fh1 f13274b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh1 f13275c;

    public dh1(gh1 gh1Var, w41 w41Var, fh1 fh1Var) {
        this.f13275c = gh1Var;
        this.f13273a = w41Var;
        this.f13274b = fh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        hl0 hl0VarMo5769b = this.f13275c.f14584e.mo5769b();
        final yv2 yv2VarM5274K1 = hl0VarMo5769b == null ? C2622l.m5274K1(th, null) : C2622l.m5274K1(th, hl0VarMo5769b.mo7141b().f18187l);
        synchronized (this.f13275c) {
            try {
                if (hl0VarMo5769b != null) {
                    hl0VarMo5769b.mo7140a().m7108A0(new j60(yv2VarM5274K1));
                    this.f13275c.f14581b.execute(new Runnable(this, yv2VarM5274K1) { // from class: c.n.b.d.j.a.ch1

                        /* JADX INFO: renamed from: f */
                        public final dh1 f13003f;

                        /* JADX INFO: renamed from: g */
                        public final yv2 f13004g;

                        {
                            this.f13003f = this;
                            this.f13004g = yv2VarM5274K1;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            dh1 dh1Var = this.f13003f;
                            dh1Var.f13275c.f14583d.mo6216o0(this.f13004g);
                        }
                    });
                } else {
                    this.f13275c.f14583d.mo6216o0(yv2VarM5274K1);
                    this.f13275c.m7004c(this.f13274b).mo7309d().mo7141b().f18181f.m7108A0(aa0.f12047a);
                }
                cw0.m6233c(yv2VarM5274K1.f22116f, th, "RewardedAdLoader.onFailure");
                this.f13273a.zza();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(dl0 dl0Var) {
        dl0 dl0Var2 = dl0Var;
        synchronized (this.f13275c) {
            dl0Var2.f16670g.f14516f.f13530a.f14520j = this.f13275c.f14583d;
            this.f13273a.mo5986b(dl0Var2);
            gh1 gh1Var = this.f13275c;
            Executor executor = gh1Var.f14581b;
            final wg1 wg1Var = gh1Var.f14583d;
            wg1Var.getClass();
            executor.execute(new Runnable(wg1Var) { // from class: c.n.b.d.j.a.bh1

                /* JADX INFO: renamed from: f */
                public final wg1 f12632f;

                {
                    this.f12632f = wg1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12632f.mo5730a0();
                }
            });
            this.f13275c.f14583d.mo6977n();
        }
    }
}
