package p007c.p190n.p194b.p367f.p368a.p373d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: c.n.b.f.a.d.o */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC5107o implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5109p f26055a;

    public /* synthetic */ ServiceConnectionC5107o(C5109p c5109p) {
        this.f26055a = c5109p;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f26055a.f26058c.m11533b(4, "ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
        this.f26055a.m11550c(new C5103m(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f26055a.f26058c.m11533b(4, "ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
        this.f26055a.m11550c(new C5105n(this));
    }
}
