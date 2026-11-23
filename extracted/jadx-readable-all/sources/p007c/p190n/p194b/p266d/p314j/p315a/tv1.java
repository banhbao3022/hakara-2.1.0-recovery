package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tv1<V> implements Runnable {

    /* JADX INFO: renamed from: f */
    @NullableDecl
    public vv1<V> f20085f;

    public tv1(vv1<V> vv1Var) {
        this.f20085f = vv1Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        kv1<V> kv1Var;
        vv1<V> vv1Var = this.f20085f;
        if (vv1Var == null || (kv1Var = vv1Var.f20951m) == null) {
            return;
        }
        this.f20085f = null;
        if (kv1Var.isDone()) {
            vv1Var.m6533n((kv1<? extends V>) kv1Var);
            return;
        }
        try {
            ScheduledFuture<?> scheduledFuture = vv1Var.f20952n;
            vv1Var.f20952n = null;
            String string = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    vv1Var.mo6532m(new uv1("Timed out"));
                    throw th;
                }
            }
            String strValueOf = String.valueOf(string);
            String strValueOf2 = String.valueOf(kv1Var);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(": ");
            sb2.append(strValueOf2);
            vv1Var.mo6532m(new uv1(sb2.toString()));
            kv1Var.cancel(true);
        } catch (Throwable th2) {
            kv1Var.cancel(true);
            throw th2;
        }
    }
}
