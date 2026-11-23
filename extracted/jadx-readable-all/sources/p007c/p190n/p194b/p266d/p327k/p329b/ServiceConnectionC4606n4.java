package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractBinderC4195i3;
import p007c.p190n.p194b.p266d.p314j.p325k.C4181h3;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4180h2;

/* JADX INFO: renamed from: c.n.b.d.k.b.n4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC4606n4 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final String f24175a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4618o4 f24176b;

    public ServiceConnectionC4606n4(C4618o4 c4618o4, String str) {
        this.f24176b = c4618o4;
        this.f24175a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f24176b.f24227a.mo10684l().f24421i.m10811a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = AbstractBinderC4195i3.f23236f;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            InterfaceC4180h2 c4181h3 = iInterfaceQueryLocalInterface instanceof InterfaceC4180h2 ? (InterfaceC4180h2) iInterfaceQueryLocalInterface : new C4181h3(iBinder);
            if (c4181h3 == null) {
                this.f24176b.f24227a.mo10684l().f24421i.m10811a("Install Referrer Service implementation was not found");
            } else {
                this.f24176b.f24227a.mo10684l().f24426n.m10811a("Install Referrer Service connected");
                this.f24176b.f24227a.mo10686n().m10758v(new RunnableC4641q4(this, c4181h3, this));
            }
        } catch (Exception e) {
            this.f24176b.f24227a.mo10684l().f24421i.m10812b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f24176b.f24227a.mo10684l().f24426n.m10811a("Install Referrer Service disconnected");
    }
}
