package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vv1<V> extends yu1<V> {

    /* JADX INFO: renamed from: m */
    @NullableDecl
    public kv1<V> f20951m;

    /* JADX INFO: renamed from: n */
    @NullableDecl
    public ScheduledFuture<?> f20952n;

    public vv1(kv1<V> kv1Var) {
        Objects.requireNonNull(kv1Var);
        this.f20951m = kv1Var;
    }

    /* JADX INFO: renamed from: g */
    public final String m8594g() {
        kv1<V> kv1Var = this.f20951m;
        ScheduledFuture<?> scheduledFuture = this.f20952n;
        if (kv1Var == null) {
            return null;
        }
        String strValueOf = String.valueOf(kv1Var);
        String strM1552C = outline.m1552C(new StringBuilder(strValueOf.length() + 14), "inputFuture=[", strValueOf, "]");
        if (scheduledFuture == null) {
            return strM1552C;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strM1552C;
        }
        String strValueOf2 = String.valueOf(strM1552C);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + 43);
        sb.append(strValueOf2);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public final void m8595i() {
        m6534o(this.f20951m);
        ScheduledFuture<?> scheduledFuture = this.f20952n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f20951m = null;
        this.f20952n = null;
    }
}
