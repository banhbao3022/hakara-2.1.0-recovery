package p007c.p190n.p194b.p266d.p297e;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p306t.C2778a;
import p007c.p190n.p194b.p266d.p314j.p321g.HandlerC4061a;

/* JADX INFO: renamed from: c.n.b.d.e.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2582i implements ServiceConnection {

    /* JADX INFO: renamed from: c */
    public C2591r f11523c;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2581h f11526f;

    /* JADX INFO: renamed from: a */
    public int f11521a = 0;

    /* JADX INFO: renamed from: b */
    public final Messenger f11522b = new Messenger(new HandlerC4061a(Looper.getMainLooper(), new Handler.Callback(this) { // from class: c.n.b.d.e.l

        /* JADX INFO: renamed from: f */
        public final ServiceConnectionC2582i f11528f;

        {
            this.f11528f = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC2582i serviceConnectionC2582i = this.f11528f;
            Objects.requireNonNull(serviceConnectionC2582i);
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (serviceConnectionC2582i) {
                AbstractC2593t<?> abstractC2593t = serviceConnectionC2582i.f11525e.get(i);
                if (abstractC2593t == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                serviceConnectionC2582i.f11525e.remove(i);
                serviceConnectionC2582i.m5184c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    abstractC2593t.m5187b(new C2592s(4, "Not supported by GmsCore"));
                    return true;
                }
                abstractC2593t.mo5185a(data);
                return true;
            }
        }
    }));

    /* JADX INFO: renamed from: d */
    public final Queue<AbstractC2593t<?>> f11524d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final SparseArray<AbstractC2593t<?>> f11525e = new SparseArray<>();

    public ServiceConnectionC2582i(C2581h c2581h, C2583j c2583j) {
        this.f11526f = c2581h;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5182a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i2 = this.f11521a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                this.f11521a = 4;
                return;
            } else {
                if (i2 == 4) {
                    return;
                }
                int i3 = this.f11521a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f11521a = 4;
        C2778a.m5615b().m5617c(this.f11526f.f11517b, this);
        C2592s c2592s = new C2592s(i, str);
        Iterator<AbstractC2593t<?>> it = this.f11524d.iterator();
        while (it.hasNext()) {
            it.next().m5187b(c2592s);
        }
        this.f11524d.clear();
        for (int i4 = 0; i4 < this.f11525e.size(); i4++) {
            this.f11525e.valueAt(i4).m5187b(c2592s);
        }
        this.f11525e.clear();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m5183b(AbstractC2593t<?> abstractC2593t) {
        int i = this.f11521a;
        if (i == 0) {
            this.f11524d.add(abstractC2593t);
            C2622l.m5384j(this.f11521a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f11521a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (C2778a.m5615b().m5616a(this.f11526f.f11517b, intent, this, 1)) {
                this.f11526f.f11518c.schedule(new Runnable(this) { // from class: c.n.b.d.e.k

                    /* JADX INFO: renamed from: f */
                    public final ServiceConnectionC2582i f11527f;

                    {
                        this.f11527f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC2582i serviceConnectionC2582i = this.f11527f;
                        synchronized (serviceConnectionC2582i) {
                            if (serviceConnectionC2582i.f11521a == 1) {
                                serviceConnectionC2582i.m5182a(1, "Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m5182a(0, "Unable to bind to service");
            }
            return true;
        }
        if (i == 1) {
            this.f11524d.add(abstractC2593t);
            return true;
        }
        if (i == 2) {
            this.f11524d.add(abstractC2593t);
            this.f11526f.f11518c.execute(new RunnableC2586m(this));
            return true;
        }
        if (i != 3 && i != 4) {
            int i2 = this.f11521a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5184c() {
        if (this.f11521a == 2 && this.f11524d.isEmpty() && this.f11525e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f11521a = 3;
            C2778a.m5615b().m5617c(this.f11526f.f11517b, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f11526f.f11518c.execute(new Runnable(this, iBinder) { // from class: c.n.b.d.e.n

            /* JADX INFO: renamed from: f */
            public final ServiceConnectionC2582i f11530f;

            /* JADX INFO: renamed from: g */
            public final IBinder f11531g;

            {
                this.f11530f = this;
                this.f11531g = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2582i serviceConnectionC2582i = this.f11530f;
                IBinder iBinder2 = this.f11531g;
                synchronized (serviceConnectionC2582i) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC2582i.m5182a(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC2582i.f11523c = new C2591r(iBinder2);
                            serviceConnectionC2582i.f11521a = 2;
                            serviceConnectionC2582i.f11526f.f11518c.execute(new RunnableC2586m(serviceConnectionC2582i));
                        } catch (RemoteException e) {
                            serviceConnectionC2582i.m5182a(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f11526f.f11518c.execute(new Runnable(this) { // from class: c.n.b.d.e.p

            /* JADX INFO: renamed from: f */
            public final ServiceConnectionC2582i f11534f;

            {
                this.f11534f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11534f.m5182a(2, "Service disconnected");
            }
        });
    }
}
