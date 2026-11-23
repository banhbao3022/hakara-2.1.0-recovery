package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p290d.C2380d;
import p007c.p190n.p194b.p266d.p314j.p320f.HandlerC4025w;

/* JADX INFO: renamed from: c.n.b.d.d.s.e0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2526e0 extends AbstractBinderC2533i {

    /* JADX INFO: renamed from: f */
    public final AtomicReference<C2522c0> f11408f;

    /* JADX INFO: renamed from: g */
    public final Handler f11409g;

    public BinderC2526e0(C2522c0 c2522c0) {
        this.f11408f = new AtomicReference<>(c2522c0);
        this.f11409g = new HandlerC4025w(c2522c0.f11802d);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: A */
    public final void mo4970A(int i) {
        C2522c0 c2522c0 = null;
        C2522c0 andSet = this.f11408f.getAndSet(null);
        if (andSet != null) {
            C2518b c2518b = C2522c0.f11384A;
            andSet.m5130E();
            c2522c0 = andSet;
        }
        if (c2522c0 == null) {
            return;
        }
        C2522c0.f11384A.m5119a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            Handler handler = c2522c0.f11805g;
            handler.sendMessage(handler.obtainMessage(6, c2522c0.f11821w.get(), 2));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: A0 */
    public final void mo4971A0(int i) {
        C2522c0 c2522c0 = this.f11408f.get();
        if (c2522c0 == null) {
            return;
        }
        C2522c0.m5128C(c2522c0, i);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: C0 */
    public final void mo4972C0(String str, String str2) {
        C2522c0 c2522c0 = this.f11408f.get();
        if (c2522c0 == null) {
            return;
        }
        C2522c0.f11384A.m5119a("Receive (type=text, ns=%s) %s", str, str2);
        this.f11409g.post(new RunnableC2534i0(c2522c0, str, str2));
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: E4 */
    public final void mo4973E4(C2536j0 c2536j0) {
        C2522c0 c2522c0 = this.f11408f.get();
        if (c2522c0 == null) {
            return;
        }
        C2522c0.f11384A.m5119a("onDeviceStatusChanged", new Object[0]);
        this.f11409g.post(new RunnableC2530g0(c2522c0, c2536j0));
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: U5 */
    public final void mo4974U5(int i) {
        C2522c0 c2522c0 = this.f11408f.get();
        if (c2522c0 == null) {
            return;
        }
        c2522c0.f11402S = null;
        c2522c0.f11403T = null;
        C2522c0.m5128C(c2522c0, i);
        if (c2522c0.f11389F != null) {
            this.f11409g.post(new RunnableC2524d0(c2522c0, i));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: Y */
    public final void mo4975Y(int i) {
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: Z3 */
    public final void mo4976Z3(String str, byte[] bArr) {
        if (this.f11408f.get() == null) {
            return;
        }
        C2522c0.f11384A.m5119a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: d0 */
    public final void mo4977d0(int i) {
        if (this.f11408f.get() == null) {
            return;
        }
        synchronized (C2522c0.f11385B) {
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: h1 */
    public final void mo4978h1(String str, double d, boolean z) {
        C2522c0.f11384A.m5119a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: k6 */
    public final void mo4979k6(String str, long j2) {
        C2522c0 c2522c0 = this.f11408f.get();
        if (c2522c0 == null) {
            return;
        }
        C2522c0.m5129D(c2522c0, j2, 0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: l0 */
    public final void mo4980l0(C2380d c2380d, String str, String str2, boolean z) {
        C2522c0 c2522c0 = this.f11408f.get();
        if (c2522c0 == null) {
            return;
        }
        c2522c0.f11387D = c2380d;
        c2522c0.f11402S = c2380d.f11009f;
        c2522c0.f11403T = str2;
        c2522c0.f11394K = str;
        synchronized (C2522c0.f11385B) {
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: n3 */
    public final void mo4981n3(C2550u c2550u) {
        C2522c0 c2522c0 = this.f11408f.get();
        if (c2522c0 == null) {
            return;
        }
        C2522c0.f11384A.m5119a("onApplicationStatusChanged", new Object[0]);
        this.f11409g.post(new RunnableC2528f0(c2522c0, c2550u));
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: x0 */
    public final void mo4982x0(int i) {
        C2522c0 c2522c0 = this.f11408f.get();
        if (c2522c0 == null) {
            return;
        }
        C2522c0.m5128C(c2522c0, i);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: y */
    public final void mo4983y(int i) {
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: z2 */
    public final void mo4984z2(String str, long j2, int i) {
        C2522c0 c2522c0 = this.f11408f.get();
        if (c2522c0 == null) {
            return;
        }
        C2522c0.m5129D(c2522c0, j2, i);
    }
}
