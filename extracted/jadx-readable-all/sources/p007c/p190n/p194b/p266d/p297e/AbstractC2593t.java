package p007c.p190n.p194b.p266d.p297e;

import android.os.Bundle;
import android.util.Log;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.e.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2593t<T> {

    /* JADX INFO: renamed from: a */
    public final int f11537a;

    /* JADX INFO: renamed from: b */
    public final C4782j<T> f11538b = new C4782j<>();

    /* JADX INFO: renamed from: c */
    public final int f11539c;

    /* JADX INFO: renamed from: d */
    public final Bundle f11540d;

    public AbstractC2593t(int i, int i2, Bundle bundle) {
        this.f11537a = i;
        this.f11539c = i2;
        this.f11540d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5185a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public final void m5187b(C2592s c2592s) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(c2592s);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 14);
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11538b.f24683a.m10943p(c2592s);
    }

    /* JADX INFO: renamed from: c */
    public final void m5188c(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 16);
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11538b.f24683a.m10944q(t);
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo5186d();

    public String toString() {
        int i = this.f11539c;
        int i2 = this.f11537a;
        boolean zMo5186d = mo5186d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(zMo5186d);
        sb.append("}");
        return sb.toString();
    }
}
