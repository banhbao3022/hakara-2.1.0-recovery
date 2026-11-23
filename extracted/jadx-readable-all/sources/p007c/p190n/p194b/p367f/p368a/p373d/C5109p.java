package p007c.p190n.p194b.p367f.p368a.p373d;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.d.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5109p<T extends IInterface> {

    /* JADX INFO: renamed from: a */
    public static final Map<String, Handler> f26056a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f26057b;

    /* JADX INFO: renamed from: c */
    public final C5089f f26058c;

    /* JADX INFO: renamed from: d */
    public final String f26059d;

    /* JADX INFO: renamed from: f */
    public boolean f26061f;

    /* JADX INFO: renamed from: g */
    public final Intent f26062g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5101l<T> f26063h;

    /* JADX INFO: renamed from: k */
    public ServiceConnection f26066k;

    /* JADX INFO: renamed from: l */
    public T f26067l;

    /* JADX INFO: renamed from: e */
    public final List<AbstractRunnableC5091g> f26060e = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final IBinder.DeathRecipient f26065j = new IBinder.DeathRecipient(this) { // from class: c.n.b.f.a.d.h

        /* JADX INFO: renamed from: a */
        public final C5109p f26045a;

        {
            this.f26045a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C5109p c5109p = this.f26045a;
            c5109p.f26058c.m11533b(4, "reportBinderDeath", new Object[0]);
            InterfaceC5099k interfaceC5099k = c5109p.f26064i.get();
            if (interfaceC5099k != null) {
                c5109p.f26058c.m11533b(4, "calling onBinderDied", new Object[0]);
                interfaceC5099k.m11538a();
                return;
            }
            c5109p.f26058c.m11533b(4, "%s : Binder has died.", new Object[]{c5109p.f26059d});
            for (AbstractRunnableC5091g abstractRunnableC5091g : c5109p.f26060e) {
                RemoteException remoteException = new RemoteException(String.valueOf(c5109p.f26059d).concat(" : Binder has died."));
                C5151o<?> c5151o = abstractRunnableC5091g.f26044f;
                if (c5151o != null) {
                    c5151o.m11572a(remoteException);
                }
            }
            c5109p.f26060e.clear();
        }
    };

    /* JADX INFO: renamed from: i */
    public final WeakReference<InterfaceC5099k> f26064i = new WeakReference<>(null);

    public C5109p(Context context, C5089f c5089f, String str, Intent intent, InterfaceC5101l<T> interfaceC5101l) {
        this.f26057b = context;
        this.f26058c = c5089f;
        this.f26059d = str;
        this.f26062g = intent;
        this.f26063h = interfaceC5101l;
    }

    /* JADX INFO: renamed from: a */
    public final void m11548a(AbstractRunnableC5091g abstractRunnableC5091g) {
        m11550c(new C5095i(this, abstractRunnableC5091g.f26044f, abstractRunnableC5091g));
    }

    /* JADX INFO: renamed from: b */
    public final void m11549b() {
        m11550c(new C5097j(this));
    }

    /* JADX INFO: renamed from: c */
    public final void m11550c(AbstractRunnableC5091g abstractRunnableC5091g) {
        Handler handler;
        Map<String, Handler> map = f26056a;
        synchronized (map) {
            if (!map.containsKey(this.f26059d)) {
                HandlerThread handlerThread = new HandlerThread(this.f26059d, 10);
                handlerThread.start();
                map.put(this.f26059d, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f26059d);
        }
        handler.post(abstractRunnableC5091g);
    }
}
