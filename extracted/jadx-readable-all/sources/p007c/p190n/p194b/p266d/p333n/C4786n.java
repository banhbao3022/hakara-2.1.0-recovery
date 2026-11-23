package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: c.n.b.d.n.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4786n implements InterfaceC4785m {

    /* JADX INFO: renamed from: a */
    public final Object f24688a = new Object();

    /* JADX INFO: renamed from: b */
    public final int f24689b;

    /* JADX INFO: renamed from: c */
    public final C4778g0<Void> f24690c;

    /* JADX INFO: renamed from: d */
    public int f24691d;

    /* JADX INFO: renamed from: e */
    public int f24692e;

    /* JADX INFO: renamed from: f */
    public int f24693f;

    /* JADX INFO: renamed from: g */
    public Exception f24694g;

    /* JADX INFO: renamed from: h */
    public boolean f24695h;

    public C4786n(int i, C4778g0<Void> c4778g0) {
        this.f24689b = i;
        this.f24690c = c4778g0;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4775f
    /* JADX INFO: renamed from: a */
    public final void mo5107a(Object obj) {
        synchronized (this.f24688a) {
            this.f24691d++;
            m10949b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10949b() {
        if (this.f24691d + this.f24692e + this.f24693f == this.f24689b) {
            if (this.f24694g == null) {
                if (this.f24695h) {
                    this.f24690c.m10945r();
                    return;
                } else {
                    this.f24690c.m10944q(null);
                    return;
                }
            }
            C4778g0<Void> c4778g0 = this.f24690c;
            int i = this.f24692e;
            int i2 = this.f24689b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            c4778g0.m10943p(new ExecutionException(sb.toString(), this.f24694g));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4773e
    /* JADX INFO: renamed from: c */
    public final void mo8822c(Exception exc) {
        synchronized (this.f24688a) {
            this.f24692e++;
            this.f24694g = exc;
            m10949b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4769c
    /* JADX INFO: renamed from: d */
    public final void mo10925d() {
        synchronized (this.f24688a) {
            this.f24693f++;
            this.f24695h = true;
            m10949b();
        }
    }
}
