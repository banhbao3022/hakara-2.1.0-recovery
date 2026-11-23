package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.j.k.nc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC4274nc extends AbstractBinderC4358tc {

    /* JADX INFO: renamed from: f */
    public final AtomicReference<Bundle> f23372f = new AtomicReference<>();

    /* JADX INFO: renamed from: g */
    public boolean f23373g;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r4 = r4.get("r");
     */
    /* JADX INFO: renamed from: i1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T m10097i1(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            if (r4 == 0) goto L37
            java.lang.String r0 = "r"
            java.lang.Object r4 = r4.get(r0)
            if (r4 == 0) goto L37
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> Lf
            return r4
        Lf:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received"
            java.lang.String r2 = ": %s, %s"
            java.lang.String r1 = r1.concat(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L37:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p325k.BinderC4274nc.m10097i1(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    /* JADX INFO: renamed from: K2 */
    public final Bundle m10098K2(long j2) {
        Bundle bundle;
        synchronized (this.f23372f) {
            if (!this.f23373g) {
                try {
                    this.f23372f.wait(j2);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f23372f.get();
        }
        return bundle;
    }

    /* JADX INFO: renamed from: T1 */
    public final String m10099T1(long j2) {
        return (String) m10097i1(m10098K2(j2), String.class);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc
    /* JADX INFO: renamed from: V */
    public final void mo10100V(Bundle bundle) {
        synchronized (this.f23372f) {
            try {
                this.f23372f.set(bundle);
                this.f23373g = true;
                this.f23372f.notify();
            } catch (Throwable th) {
                this.f23372f.notify();
                throw th;
            }
        }
    }
}
