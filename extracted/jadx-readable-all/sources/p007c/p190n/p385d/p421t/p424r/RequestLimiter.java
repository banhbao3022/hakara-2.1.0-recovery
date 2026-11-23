package p007c.p190n.p385d.p421t.p424r;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p385d.p421t.Utils6;

/* JADX INFO: renamed from: c.n.d.t.r.e, reason: use source file name */
/* JADX INFO: compiled from: RequestLimiter.java */
/* JADX INFO: loaded from: classes.dex */
public class RequestLimiter {

    /* JADX INFO: renamed from: a */
    public static final long f27211a = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: b */
    public static final long f27212b = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: c */
    public final Utils6 f27213c = Utils6.m12114c();

    /* JADX INFO: renamed from: d */
    public long f27214d;

    /* JADX INFO: renamed from: e */
    public int f27215e;

    /* JADX INFO: renamed from: a */
    public synchronized boolean m12161a() {
        return this.f27215e == 0 || this.f27213c.m12115a() > this.f27214d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m12162b(int i) {
        long jMin;
        boolean z = false;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f27215e = 0;
            }
            return;
        }
        this.f27215e++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                z = true;
            }
            try {
                if (z) {
                    double dPow = Math.pow(2.0d, this.f27215e);
                    Objects.requireNonNull(this.f27213c);
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f27212b);
                } else {
                    jMin = f27211a;
                }
                this.f27214d = this.f27213c.m12115a() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
