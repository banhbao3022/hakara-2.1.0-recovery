package p636z0.p759s;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: renamed from: z0.s.q, reason: use source file name */
/* JADX INFO: compiled from: LifecycleService.java */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleService extends Service implements LifecycleOwner {

    /* JADX INFO: renamed from: f */
    public final ServiceLifecycleDispatcher f38714f = new ServiceLifecycleDispatcher(this);

    @Override // p636z0.p759s.LifecycleOwner
    /* JADX INFO: renamed from: b */
    public Lifecycle3 mo124b() {
        return this.f38714f.f38675a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ServiceLifecycleDispatcher serviceLifecycleDispatcher = this.f38714f;
        Objects.requireNonNull(serviceLifecycleDispatcher);
        serviceLifecycleDispatcher.m16717a(Lifecycle3.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        ServiceLifecycleDispatcher serviceLifecycleDispatcher = this.f38714f;
        Objects.requireNonNull(serviceLifecycleDispatcher);
        serviceLifecycleDispatcher.m16717a(Lifecycle3.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ServiceLifecycleDispatcher serviceLifecycleDispatcher = this.f38714f;
        Objects.requireNonNull(serviceLifecycleDispatcher);
        serviceLifecycleDispatcher.m16717a(Lifecycle3.a.ON_STOP);
        serviceLifecycleDispatcher.m16717a(Lifecycle3.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        ServiceLifecycleDispatcher serviceLifecycleDispatcher = this.f38714f;
        Objects.requireNonNull(serviceLifecycleDispatcher);
        serviceLifecycleDispatcher.m16717a(Lifecycle3.a.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
