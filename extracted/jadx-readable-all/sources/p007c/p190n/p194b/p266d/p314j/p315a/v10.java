package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class v10 extends n00 {

    /* JADX INFO: renamed from: i */
    public final InterfaceC2908c7 f20687i;

    /* JADX INFO: renamed from: j */
    public final Runnable f20688j;

    /* JADX INFO: renamed from: k */
    public final Executor f20689k;

    public v10(l20 l20Var, InterfaceC2908c7 interfaceC2908c7, Runnable runnable, Executor executor) {
        super(l20Var);
        this.f20687i = interfaceC2908c7;
        this.f20688j = runnable;
        this.f20689k = executor;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m20
    /* JADX INFO: renamed from: a */
    public final void mo7653a() {
        final AtomicReference atomicReference = new AtomicReference(this.f20688j);
        final Runnable runnable = new Runnable(atomicReference) { // from class: c.n.b.d.j.a.t10

            /* JADX INFO: renamed from: f */
            public final AtomicReference f19749f;

            {
                this.f19749f = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.f19749f.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.f20689k.execute(new Runnable(this, runnable) { // from class: c.n.b.d.j.a.u10

            /* JADX INFO: renamed from: f */
            public final v10 f20197f;

            /* JADX INFO: renamed from: g */
            public final Runnable f20198g;

            {
                this.f20197f = this;
                this.f20198g = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v10 v10Var = this.f20197f;
                Runnable runnable2 = this.f20198g;
                Objects.requireNonNull(v10Var);
                try {
                    if (v10Var.f20687i.mo5698t0(new BinderC2800b(runnable2))) {
                        return;
                    }
                    runnable2.run();
                } catch (RemoteException unused) {
                    runnable2.run();
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: c */
    public final View mo7743c() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: d */
    public final void mo7744d(ViewGroup viewGroup, jw2 jw2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: e */
    public final InterfaceC3087h1 mo7745e() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: f */
    public final sh1 mo7746f() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: g */
    public final sh1 mo7747g() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: h */
    public final int mo7748h() {
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: i */
    public final void mo7749i() {
    }
}
