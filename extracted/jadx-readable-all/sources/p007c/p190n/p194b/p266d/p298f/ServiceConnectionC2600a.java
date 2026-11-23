package p007c.p190n.p194b.p266d.p298f;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: c.n.b.d.f.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC2600a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public boolean f11549a = false;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue<IBinder> f11550b = new LinkedBlockingQueue();

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public IBinder m5193a(long j2, @RecentlyNonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C2622l.m5369g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f11549a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f11549a = true;
        IBinder iBinderPoll = this.f11550b.poll(j2, timeUnit);
        if (iBinderPoll != null) {
            return iBinderPoll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.f11550b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
    }
}
