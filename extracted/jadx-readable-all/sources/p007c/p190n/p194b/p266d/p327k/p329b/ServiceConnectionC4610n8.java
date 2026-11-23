package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;
import p007c.p190n.p194b.p266d.p298f.p306t.C2778a;

/* JADX INFO: renamed from: c.n.b.d.k.b.n8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC4610n8 implements ServiceConnection, AbstractC2717c.a, AbstractC2717c.b {

    /* JADX INFO: renamed from: a */
    public volatile boolean f24187a;

    /* JADX INFO: renamed from: b */
    public volatile C4673t3 f24188b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4677t7 f24189c;

    public ServiceConnectionC4610n8(C4677t7 c4677t7) {
        this.f24189c = c4677t7;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: Q */
    public final void mo5562Q(int i) {
        C2622l.m5354d("MeasurementServiceConnection.onConnectionSuspended");
        this.f24189c.mo10684l().f24425m.m10811a("Service connection suspended");
        this.f24189c.mo10686n().m10758v(new RunnableC4656r8(this));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.b
    /* JADX INFO: renamed from: W */
    public final void mo5565W(C2602b c2602b) {
        C2622l.m5354d("MeasurementServiceConnection.onConnectionFailed");
        C4707w4 c4707w4 = this.f24189c.f24476a;
        C4662s3 c4662s3 = c4707w4.f24536j;
        C4662s3 c4662s4 = (c4662s3 == null || !c4662s3.m10762i()) ? null : c4707w4.f24536j;
        if (c4662s4 != null) {
            c4662s4.f24421i.m10812b("Service connection failed", c2602b);
        }
        synchronized (this) {
            this.f24187a = false;
            this.f24188b = null;
        }
        this.f24189c.mo10686n().m10758v(new RunnableC4645q8(this));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: c0 */
    public final void mo5563c0(Bundle bundle) {
        C2622l.m5354d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f24189c.mo10686n().m10758v(new RunnableC4622o8(this, this.f24188b.m5581u()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f24188b = null;
                this.f24187a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2622l.m5354d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f24187a = false;
                this.f24189c.mo10684l().f24418f.m10811a("Service connected with null binder");
                return;
            }
            InterfaceC4569k3 c4593m3 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c4593m3 = iInterfaceQueryLocalInterface instanceof InterfaceC4569k3 ? (InterfaceC4569k3) iInterfaceQueryLocalInterface : new C4593m3(iBinder);
                    this.f24189c.mo10684l().f24426n.m10811a("Bound to IMeasurementService interface");
                } else {
                    this.f24189c.mo10684l().f24418f.m10812b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f24189c.mo10684l().f24418f.m10811a("Service connect failed to get IMeasurementService");
            }
            if (c4593m3 == null) {
                this.f24187a = false;
                try {
                    C2778a c2778aM5615b = C2778a.m5615b();
                    C4677t7 c4677t7 = this.f24189c;
                    c2778aM5615b.m5617c(c4677t7.f24476a.f24528b, c4677t7.f24454c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f24189c.mo10686n().m10758v(new RunnableC4598m8(this, c4593m3));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2622l.m5354d("MeasurementServiceConnection.onServiceDisconnected");
        this.f24189c.mo10684l().f24425m.m10811a("Service disconnected");
        this.f24189c.mo10686n().m10758v(new RunnableC4634p8(this, componentName));
    }
}
