package p636z0.p641a0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p636z0.p655c.p656a.p658b.SafeIterableMap;

/* JADX INFO: renamed from: z0.a0.o, reason: use source file name */
/* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationClient {

    /* JADX INFO: renamed from: a */
    public final Context f34284a;

    /* JADX INFO: renamed from: b */
    public final String f34285b;

    /* JADX INFO: renamed from: c */
    public int f34286c;

    /* JADX INFO: renamed from: d */
    public final InvalidationTracker f34287d;

    /* JADX INFO: renamed from: e */
    public final InvalidationTracker.c f34288e;

    /* JADX INFO: renamed from: f */
    public IMultiInstanceInvalidationService f34289f;

    /* JADX INFO: renamed from: g */
    public final Executor f34290g;

    /* JADX INFO: renamed from: h */
    public final IMultiInstanceInvalidationCallback f34291h = new a();

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f34292i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    public final ServiceConnection f34293j;

    /* JADX INFO: renamed from: k */
    public final Runnable f34294k;

    /* JADX INFO: renamed from: l */
    public final Runnable f34295l;

    /* JADX INFO: renamed from: z0.a0.o$a */
    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class a extends IMultiInstanceInvalidationCallback.a {

        /* JADX INFO: renamed from: z0.a0.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
        public class RunnableC8561a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ String[] f34297f;

            public RunnableC8561a(String[] strArr) {
                this.f34297f = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                InvalidationTracker invalidationTracker = MultiInstanceInvalidationClient.this.f34287d;
                String[] strArr = this.f34297f;
                synchronized (invalidationTracker.f34271k) {
                    Iterator<Map.Entry<InvalidationTracker.c, InvalidationTracker.d>> it = invalidationTracker.f34271k.iterator();
                    while (true) {
                        SafeIterableMap.e eVar = (SafeIterableMap.e) it;
                        if (eVar.hasNext()) {
                            Map.Entry entry = (Map.Entry) eVar.next();
                            InvalidationTracker.c cVar = (InvalidationTracker.c) entry.getKey();
                            Objects.requireNonNull(cVar);
                            if (!(cVar instanceof e)) {
                                ((InvalidationTracker.d) entry.getValue()).m14525a(strArr);
                            }
                        }
                    }
                }
            }
        }

        public a() {
        }

        @Override // p636z0.p641a0.IMultiInstanceInvalidationCallback
        /* JADX INFO: renamed from: L1 */
        public void mo14514L1(String[] strArr) {
            MultiInstanceInvalidationClient.this.f34290g.execute(new RunnableC8561a(strArr));
        }
    }

    /* JADX INFO: renamed from: z0.a0.o$b */
    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IMultiInstanceInvalidationService c8560a;
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            int i = IMultiInstanceInvalidationService.a.f34259f;
            if (iBinder == null) {
                c8560a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                c8560a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationService)) ? new IMultiInstanceInvalidationService.a.C8560a(iBinder) : (IMultiInstanceInvalidationService) iInterfaceQueryLocalInterface;
            }
            multiInstanceInvalidationClient.f34289f = c8560a;
            MultiInstanceInvalidationClient multiInstanceInvalidationClient2 = MultiInstanceInvalidationClient.this;
            multiInstanceInvalidationClient2.f34290g.execute(multiInstanceInvalidationClient2.f34294k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            multiInstanceInvalidationClient.f34290g.execute(multiInstanceInvalidationClient.f34295l);
            MultiInstanceInvalidationClient.this.f34289f = null;
        }
    }

    /* JADX INFO: renamed from: z0.a0.o$c */
    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f34289f;
                if (iMultiInstanceInvalidationService != null) {
                    multiInstanceInvalidationClient.f34286c = iMultiInstanceInvalidationService.mo866j2(multiInstanceInvalidationClient.f34291h, multiInstanceInvalidationClient.f34285b);
                    MultiInstanceInvalidationClient multiInstanceInvalidationClient2 = MultiInstanceInvalidationClient.this;
                    multiInstanceInvalidationClient2.f34287d.m14516a(multiInstanceInvalidationClient2.f34288e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* JADX INFO: renamed from: z0.a0.o$d */
    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InvalidationTracker.d dVarMo15030m;
            boolean z;
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            InvalidationTracker invalidationTracker = multiInstanceInvalidationClient.f34287d;
            InvalidationTracker.c cVar = multiInstanceInvalidationClient.f34288e;
            synchronized (invalidationTracker.f34271k) {
                dVarMo15030m = invalidationTracker.f34271k.mo15030m(cVar);
            }
            if (dVarMo15030m != null) {
                InvalidationTracker.b bVar = invalidationTracker.f34270j;
                int[] iArr = dVarMo15030m.f34280a;
                synchronized (bVar) {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = bVar.f34274a;
                        long j2 = jArr[i];
                        jArr[i] = j2 - 1;
                        if (j2 == 1) {
                            bVar.f34277d = true;
                            z = true;
                        }
                    }
                }
                if (z) {
                    invalidationTracker.m14520e();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.a0.o$e */
    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class e extends InvalidationTracker.c {
        public e(String[] strArr) {
            super(strArr);
        }

        @Override // p636z0.p641a0.InvalidationTracker.c
        /* JADX INFO: renamed from: a */
        public void mo14524a(Set<String> set) {
            if (MultiInstanceInvalidationClient.this.f34292i.get()) {
                return;
            }
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f34289f;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.mo865S5(multiInstanceInvalidationClient.f34286c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    public MultiInstanceInvalidationClient(Context context, String str, InvalidationTracker invalidationTracker, Executor executor) {
        b bVar = new b();
        this.f34293j = bVar;
        this.f34294k = new c();
        this.f34295l = new d();
        Context applicationContext = context.getApplicationContext();
        this.f34284a = applicationContext;
        this.f34285b = str;
        this.f34287d = invalidationTracker;
        this.f34290g = executor;
        this.f34288e = new e((String[]) invalidationTracker.f34262b.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
