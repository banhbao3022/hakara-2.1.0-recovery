package p007c.p190n.p194b.p266d.p327k.p329b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: c.n.b.d.k.b.k9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4575k9 extends AbstractC4587l9 {

    /* JADX INFO: renamed from: d */
    public final AlarmManager f24083d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4541i f24084e;

    /* JADX INFO: renamed from: f */
    public Integer f24085f;

    public C4575k9(C4611n9 c4611n9) {
        super(c4611n9);
        this.f24083d = (AlarmManager) this.f24476a.f24528b.getSystemService("alarm");
        this.f24084e = new C4563j9(this, c4611n9.f24201k, c4611n9);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4587l9
    /* JADX INFO: renamed from: p */
    public final boolean mo10577p() {
        this.f24083d.cancel(m10633u());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        ((JobScheduler) this.f24476a.f24528b.getSystemService("jobscheduler")).cancel(m10632t());
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m10631s() {
        m10642i();
        mo10684l().f24426n.m10811a("Unscheduling upload");
        this.f24083d.cancel(m10633u());
        this.f24084e.m10597c();
        if (Build.VERSION.SDK_INT >= 24) {
            ((JobScheduler) this.f24476a.f24528b.getSystemService("jobscheduler")).cancel(m10632t());
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m10632t() {
        if (this.f24085f == null) {
            String strValueOf = String.valueOf(this.f24476a.f24528b.getPackageName());
            this.f24085f = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f24085f.intValue();
    }

    /* JADX INFO: renamed from: u */
    public final PendingIntent m10633u() {
        Context context = this.f24476a.f24528b;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }
}
