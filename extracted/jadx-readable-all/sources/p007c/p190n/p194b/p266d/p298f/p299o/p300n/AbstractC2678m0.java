package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.m0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2678m0 {
    public AbstractC2678m0(int i) {
    }

    /* JADX INFO: renamed from: d */
    public static Status m5546d(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5547a(Status status);

    /* JADX INFO: renamed from: b */
    public abstract void mo5496b(C2664h1 c2664h1, boolean z);

    /* JADX INFO: renamed from: c */
    public abstract void mo5548c(RuntimeException runtimeException);

    /* JADX INFO: renamed from: e */
    public abstract void mo5549e(C2659g.a<?> aVar) throws DeadObjectException;
}
