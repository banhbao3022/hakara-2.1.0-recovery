package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.f.q.c1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2719c1 implements Handler.Callback {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2722d1 f11823f;

    public /* synthetic */ C2719c1(C2722d1 c2722d1) {
        this.f11823f = c2722d1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f11823f.f11842c) {
                C2713a1 c2713a1 = (C2713a1) message.obj;
                ServiceConnectionC2716b1 serviceConnectionC2716b1 = this.f11823f.f11842c.get(c2713a1);
                if (serviceConnectionC2716b1 != null && serviceConnectionC2716b1.f11792a.isEmpty()) {
                    if (serviceConnectionC2716b1.f11794c) {
                        serviceConnectionC2716b1.f11798g.f11844e.removeMessages(1, serviceConnectionC2716b1.f11796e);
                        C2722d1 c2722d1 = serviceConnectionC2716b1.f11798g;
                        c2722d1.f11845f.m5617c(c2722d1.f11843d, serviceConnectionC2716b1);
                        serviceConnectionC2716b1.f11794c = false;
                        serviceConnectionC2716b1.f11793b = 2;
                    }
                    this.f11823f.f11842c.remove(c2713a1);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f11823f.f11842c) {
            C2713a1 c2713a2 = (C2713a1) message.obj;
            ServiceConnectionC2716b1 serviceConnectionC2716b2 = this.f11823f.f11842c.get(c2713a2);
            if (serviceConnectionC2716b2 != null && serviceConnectionC2716b2.f11793b == 3) {
                String strValueOf = String.valueOf(c2713a2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(strValueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentName = serviceConnectionC2716b2.f11797f;
                if (componentName == null) {
                    componentName = c2713a2.f11788d;
                }
                if (componentName == null) {
                    String str = c2713a2.f11787c;
                    Objects.requireNonNull(str, "null reference");
                    componentName = new ComponentName(str, "unknown");
                }
                serviceConnectionC2716b2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
