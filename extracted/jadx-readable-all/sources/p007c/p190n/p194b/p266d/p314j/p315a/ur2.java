package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.Future;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ur2 implements AbstractC2717c.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lr2 f20416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3147io f20417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wr2 f20418c;

    public ur2(wr2 wr2Var, lr2 lr2Var, C3147io c3147io) {
        this.f20418c = wr2Var;
        this.f20416a = lr2Var;
        this.f20417b = c3147io;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: Q */
    public final void mo5562Q(int i) {
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: c0 */
    public final void mo5563c0(Bundle bundle) {
        synchronized (this.f20418c.f21317d) {
            wr2 wr2Var = this.f20418c;
            if (wr2Var.f21315b) {
                return;
            }
            wr2Var.f21315b = true;
            final kr2 kr2Var = wr2Var.f21314a;
            if (kr2Var != null) {
                lv1 lv1Var = C2962do.f13330a;
                final lr2 lr2Var = this.f20416a;
                final C3147io c3147io = this.f20417b;
                final kv1<?> kv1VarMo6692x0 = lv1Var.mo6692x0(new Runnable(this, kr2Var, lr2Var, c3147io) { // from class: c.n.b.d.j.a.qr2

                    /* JADX INFO: renamed from: f */
                    public final ur2 f18422f;

                    /* JADX INFO: renamed from: g */
                    public final kr2 f18423g;

                    /* JADX INFO: renamed from: h */
                    public final lr2 f18424h;

                    /* JADX INFO: renamed from: i */
                    public final C3147io f18425i;

                    {
                        this.f18422f = this;
                        this.f18423g = kr2Var;
                        this.f18424h = lr2Var;
                        this.f18425i = c3147io;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ur2 ur2Var = this.f18422f;
                        kr2 kr2Var2 = this.f18423g;
                        lr2 lr2Var2 = this.f18424h;
                        C3147io c3147io2 = this.f18425i;
                        try {
                            nr2 nr2Var = (nr2) kr2Var2.m5581u();
                            ir2 ir2VarM7933q3 = kr2Var2.m7542C() ? nr2Var.m7933q3(lr2Var2) : nr2Var.m7932K2(lr2Var2);
                            if (!ir2VarM7933q3.zza()) {
                                c3147io2.m7287b(new RuntimeException("No entry contents."));
                                wr2.m8670a(ur2Var.f20418c);
                                return;
                            }
                            sr2 sr2Var = new sr2(ur2Var, ir2VarM7933q3.m7293H());
                            int i = sr2Var.read();
                            if (i == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            sr2Var.unread(i);
                            c3147io2.m7286a(new yr2(sr2Var, ir2VarM7933q3.m7294K(), ir2VarM7933q3.m7297N(), ir2VarM7933q3.m7296M(), ir2VarM7933q3.m7295L()));
                        } catch (RemoteException | IOException e) {
                            C2622l.m5438t3("Unable to obtain a cache service instance.", e);
                            c3147io2.m7287b(e);
                            wr2.m8670a(ur2Var.f20418c);
                        }
                    }
                });
                final C3147io c3147io2 = this.f20417b;
                c3147io2.f15328f.mo6230f(new Runnable(c3147io2, kv1VarMo6692x0) { // from class: c.n.b.d.j.a.rr2

                    /* JADX INFO: renamed from: f */
                    public final C3147io f19052f;

                    /* JADX INFO: renamed from: g */
                    public final Future f19053g;

                    {
                        this.f19052f = c3147io2;
                        this.f19053g = kv1VarMo6692x0;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C3147io c3147io3 = this.f19052f;
                        Future future = this.f19053g;
                        if (c3147io3.isCancelled()) {
                            future.cancel(true);
                        }
                    }
                }, C2962do.f13335f);
            }
        }
    }
}
