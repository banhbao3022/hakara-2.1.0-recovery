package p007c.p190n.p194b.p266d.p297e;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c.n.b.d.e.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2586m implements Runnable {

    /* JADX INFO: renamed from: f */
    public final ServiceConnectionC2582i f11529f;

    public RunnableC2586m(ServiceConnectionC2582i serviceConnectionC2582i) {
        this.f11529f = serviceConnectionC2582i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ServiceConnectionC2582i serviceConnectionC2582i = this.f11529f;
        while (true) {
            synchronized (serviceConnectionC2582i) {
                if (serviceConnectionC2582i.f11521a != 2) {
                    return;
                }
                if (serviceConnectionC2582i.f11524d.isEmpty()) {
                    serviceConnectionC2582i.m5184c();
                    return;
                }
                final AbstractC2593t<?> abstractC2593tPoll = serviceConnectionC2582i.f11524d.poll();
                serviceConnectionC2582i.f11525e.put(abstractC2593tPoll.f11537a, abstractC2593tPoll);
                serviceConnectionC2582i.f11526f.f11518c.schedule(new Runnable(serviceConnectionC2582i, abstractC2593tPoll) { // from class: c.n.b.d.e.o

                    /* JADX INFO: renamed from: f */
                    public final ServiceConnectionC2582i f11532f;

                    /* JADX INFO: renamed from: g */
                    public final AbstractC2593t f11533g;

                    {
                        this.f11532f = serviceConnectionC2582i;
                        this.f11533g = abstractC2593tPoll;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC2582i serviceConnectionC2582i2 = this.f11532f;
                        int i = this.f11533g.f11537a;
                        synchronized (serviceConnectionC2582i2) {
                            AbstractC2593t<?> abstractC2593t = serviceConnectionC2582i2.f11525e.get(i);
                            if (abstractC2593t != null) {
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("Timing out request: ");
                                sb.append(i);
                                Log.w("MessengerIpcClient", sb.toString());
                                serviceConnectionC2582i2.f11525e.remove(i);
                                abstractC2593t.m5187b(new C2592s(3, "Timed out waiting for response"));
                                serviceConnectionC2582i2.m5184c();
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String strValueOf = String.valueOf(abstractC2593tPoll);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                    sb.append("Sending ");
                    sb.append(strValueOf);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                Context context = serviceConnectionC2582i.f11526f.f11517b;
                Messenger messenger = serviceConnectionC2582i.f11522b;
                Message messageObtain = Message.obtain();
                messageObtain.what = abstractC2593tPoll.f11539c;
                messageObtain.arg1 = abstractC2593tPoll.f11537a;
                messageObtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", abstractC2593tPoll.mo5186d());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle("data", abstractC2593tPoll.f11540d);
                messageObtain.setData(bundle);
                try {
                    C2591r c2591r = serviceConnectionC2582i.f11523c;
                    Messenger messenger2 = c2591r.f11535a;
                    if (messenger2 != null) {
                        messenger2.send(messageObtain);
                    } else {
                        C2577d c2577d = c2591r.f11536b;
                        if (c2577d == null) {
                            throw new IllegalStateException("Both messengers are null");
                        }
                        Messenger messenger3 = c2577d.f11510f;
                        Objects.requireNonNull(messenger3);
                        messenger3.send(messageObtain);
                    }
                } catch (RemoteException e) {
                    serviceConnectionC2582i.m5182a(2, e.getMessage());
                }
            }
        }
    }
}
