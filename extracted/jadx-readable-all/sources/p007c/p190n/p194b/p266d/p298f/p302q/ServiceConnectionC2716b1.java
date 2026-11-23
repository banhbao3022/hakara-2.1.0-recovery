package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.p306t.C2778a;

/* JADX INFO: renamed from: c.n.b.d.f.q.b1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2716b1 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Map<ServiceConnection, ServiceConnection> f11792a = new HashMap();

    /* JADX INFO: renamed from: b */
    public int f11793b = 2;

    /* JADX INFO: renamed from: c */
    public boolean f11794c;

    /* JADX INFO: renamed from: d */
    public IBinder f11795d;

    /* JADX INFO: renamed from: e */
    public final C2713a1 f11796e;

    /* JADX INFO: renamed from: f */
    public ComponentName f11797f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2722d1 f11798g;

    public ServiceConnectionC2716b1(C2722d1 c2722d1, C2713a1 c2713a1) {
        this.f11798g = c2722d1;
        this.f11796e = c2713a1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX INFO: renamed from: a */
    public final void m5566a(String str) {
        Intent component;
        Intent intent;
        boolean zM5618d;
        Bundle bundleCall;
        this.f11793b = 3;
        C2722d1 c2722d1 = this.f11798g;
        C2778a c2778a = c2722d1.f11845f;
        Context context = c2722d1.f11843d;
        C2713a1 c2713a1 = this.f11796e;
        if (c2713a1.f11786b != null) {
            component = null;
            if (c2713a1.f11790f) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", c2713a1.f11786b);
                try {
                    bundleCall = context.getContentResolver().call(C2713a1.f11785a, "serviceIntentCall", (String) null, bundle);
                } catch (IllegalArgumentException e) {
                    String strValueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                    sb.append("Dynamic intent resolution failed: ");
                    sb.append(strValueOf);
                    Log.w("ConnectionStatusConfig", sb.toString());
                    bundleCall = null;
                }
                component = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
                if (component == null) {
                    String strValueOf2 = String.valueOf(c2713a1.f11786b);
                    Log.w("ConnectionStatusConfig", strValueOf2.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(strValueOf2) : new String("Dynamic lookup for intent failed for action: "));
                }
            }
            if (component == null) {
                intent = new Intent(c2713a1.f11786b).setPackage(c2713a1.f11787c);
            }
            zM5618d = c2778a.m5618d(context, str, intent, this, this.f11796e.f11789e, true);
            this.f11794c = zM5618d;
            if (zM5618d) {
                Message messageObtainMessage = this.f11798g.f11844e.obtainMessage(1, this.f11796e);
                C2722d1 c2722d2 = this.f11798g;
                c2722d2.f11844e.sendMessageDelayed(messageObtainMessage, c2722d2.f11847h);
            } else {
                this.f11793b = 2;
                try {
                    C2722d1 c2722d3 = this.f11798g;
                    c2722d3.f11845f.m5617c(c2722d3.f11843d, this);
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
        component = new Intent().setComponent(c2713a1.f11788d);
        intent = component;
        zM5618d = c2778a.m5618d(context, str, intent, this, this.f11796e.f11789e, true);
        this.f11794c = zM5618d;
        if (zM5618d) {
            Message messageObtainMessage2 = this.f11798g.f11844e.obtainMessage(1, this.f11796e);
            C2722d1 c2722d4 = this.f11798g;
            c2722d4.f11844e.sendMessageDelayed(messageObtainMessage2, c2722d4.f11847h);
        } else {
            this.f11793b = 2;
            C2722d1 c2722d5 = this.f11798g;
            c2722d5.f11845f.m5617c(c2722d5.f11843d, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f11798g.f11842c) {
            this.f11798g.f11844e.removeMessages(1, this.f11796e);
            this.f11795d = iBinder;
            this.f11797f = componentName;
            Iterator<ServiceConnection> it = this.f11792a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f11793b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f11798g.f11842c) {
            this.f11798g.f11844e.removeMessages(1, this.f11796e);
            this.f11795d = null;
            this.f11797f = componentName;
            Iterator<ServiceConnection> it = this.f11792a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f11793b = 2;
        }
    }
}
