package p524h1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.a0, reason: use source file name */
/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public class Timeout2 {

    /* JADX INFO: renamed from: a */
    public static final Timeout2 f30690a;

    /* JADX INFO: renamed from: b */
    public boolean f30691b;

    /* JADX INFO: renamed from: c */
    public long f30692c;

    /* JADX INFO: renamed from: d */
    public long f30693d;

    /* JADX INFO: renamed from: h1.a0$a */
    /* JADX INFO: compiled from: Timeout.kt */
    public static final class a extends Timeout2 {
        @Override // p524h1.Timeout2
        /* JADX INFO: renamed from: d */
        public Timeout2 mo13699d(long j2) {
            return this;
        }

        @Override // p524h1.Timeout2
        /* JADX INFO: renamed from: f */
        public void mo13701f() {
        }

        @Override // p524h1.Timeout2
        /* JADX INFO: renamed from: g */
        public Timeout2 mo13702g(long j2, TimeUnit timeUnit) {
            Intrinsics2.m13090f(timeUnit, "unit");
            return this;
        }
    }

    /* JADX INFO: renamed from: h1.a0$b */
    /* JADX INFO: compiled from: Timeout.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new b(null);
        f30690a = new a();
    }

    /* JADX INFO: renamed from: a */
    public Timeout2 mo13696a() {
        this.f30691b = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Timeout2 mo13697b() {
        this.f30693d = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo13698c() {
        if (this.f30691b) {
            return this.f30692c;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* JADX INFO: renamed from: d */
    public Timeout2 mo13699d(long j2) {
        this.f30691b = true;
        this.f30692c = j2;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo13700e() {
        return this.f30691b;
    }

    /* JADX INFO: renamed from: f */
    public void mo13701f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f30691b && this.f30692c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public Timeout2 mo13702g(long j2, TimeUnit timeUnit) {
        Intrinsics2.m13090f(timeUnit, "unit");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(outline.m1594p("timeout < 0: ", j2).toString());
        }
        this.f30693d = timeUnit.toNanos(j2);
        return this;
    }
}
