package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p306t.C2778a;
import p007c.p190n.p194b.p266d.p314j.p322h.HandlerC4065d;

/* JADX INFO: renamed from: c.n.b.d.f.q.d1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2722d1 extends AbstractC2738j {

    /* JADX INFO: renamed from: d */
    public final Context f11843d;

    /* JADX INFO: renamed from: e */
    public final Handler f11844e;

    /* JADX INFO: renamed from: c */
    public final HashMap<C2713a1, ServiceConnectionC2716b1> f11842c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public final C2778a f11845f = C2778a.m5615b();

    /* JADX INFO: renamed from: g */
    public final long f11846g = 5000;

    /* JADX INFO: renamed from: h */
    public final long f11847h = 300000;

    public C2722d1(Context context) {
        this.f11843d = context.getApplicationContext();
        this.f11844e = new HandlerC4065d(context.getMainLooper(), new C2719c1(this));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2738j
    /* JADX INFO: renamed from: b */
    public final boolean mo5585b(C2713a1 c2713a1, ServiceConnection serviceConnection, String str) {
        boolean z;
        C2622l.m5379i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f11842c) {
            try {
                ServiceConnectionC2716b1 serviceConnectionC2716b1 = this.f11842c.get(c2713a1);
                if (serviceConnectionC2716b1 == null) {
                    serviceConnectionC2716b1 = new ServiceConnectionC2716b1(this, c2713a1);
                    serviceConnectionC2716b1.f11792a.put(serviceConnection, serviceConnection);
                    serviceConnectionC2716b1.m5566a(str);
                    this.f11842c.put(c2713a1, serviceConnectionC2716b1);
                } else {
                    this.f11844e.removeMessages(0, c2713a1);
                    if (serviceConnectionC2716b1.f11792a.containsKey(serviceConnection)) {
                        String strValueOf = String.valueOf(c2713a1);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(strValueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                    serviceConnectionC2716b1.f11792a.put(serviceConnection, serviceConnection);
                    int i = serviceConnectionC2716b1.f11793b;
                    if (i == 1) {
                        ((ServiceConnectionC2758s0) serviceConnection).onServiceConnected(serviceConnectionC2716b1.f11797f, serviceConnectionC2716b1.f11795d);
                    } else if (i == 2) {
                        serviceConnectionC2716b1.m5566a(str);
                    }
                }
                z = serviceConnectionC2716b1.f11794c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2738j
    /* JADX INFO: renamed from: c */
    public final void mo5586c(C2713a1 c2713a1, ServiceConnection serviceConnection, String str) {
        C2622l.m5379i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f11842c) {
            ServiceConnectionC2716b1 serviceConnectionC2716b1 = this.f11842c.get(c2713a1);
            if (serviceConnectionC2716b1 == null) {
                String strValueOf = String.valueOf(c2713a1);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!serviceConnectionC2716b1.f11792a.containsKey(serviceConnection)) {
                String strValueOf2 = String.valueOf(c2713a1);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(strValueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            serviceConnectionC2716b1.f11792a.remove(serviceConnection);
            if (serviceConnectionC2716b1.f11792a.isEmpty()) {
                this.f11844e.sendMessageDelayed(this.f11844e.obtainMessage(0, c2713a1), this.f11846g);
            }
        }
    }
}
