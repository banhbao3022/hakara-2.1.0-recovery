package p524h1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.m, reason: use source file name */
/* JADX INFO: compiled from: ForwardingTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ForwardingTimeout extends Timeout2 {

    /* JADX INFO: renamed from: e */
    public Timeout2 f30718e;

    public ForwardingTimeout(Timeout2 timeout2) {
        Intrinsics2.m13090f(timeout2, "delegate");
        this.f30718e = timeout2;
    }

    @Override // p524h1.Timeout2
    /* JADX INFO: renamed from: a */
    public Timeout2 mo13696a() {
        return this.f30718e.mo13696a();
    }

    @Override // p524h1.Timeout2
    /* JADX INFO: renamed from: b */
    public Timeout2 mo13697b() {
        return this.f30718e.mo13697b();
    }

    @Override // p524h1.Timeout2
    /* JADX INFO: renamed from: c */
    public long mo13698c() {
        return this.f30718e.mo13698c();
    }

    @Override // p524h1.Timeout2
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13699d(long j2) {
        return this.f30718e.mo13699d(j2);
    }

    @Override // p524h1.Timeout2
    /* JADX INFO: renamed from: e */
    public boolean mo13700e() {
        return this.f30718e.mo13700e();
    }

    @Override // p524h1.Timeout2
    /* JADX INFO: renamed from: f */
    public void mo13701f() throws IOException {
        this.f30718e.mo13701f();
    }

    @Override // p524h1.Timeout2
    /* JADX INFO: renamed from: g */
    public Timeout2 mo13702g(long j2, TimeUnit timeUnit) {
        Intrinsics2.m13090f(timeUnit, "unit");
        return this.f30718e.mo13702g(j2, timeUnit);
    }
}
