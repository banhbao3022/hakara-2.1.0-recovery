package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p195a.TransportFactory;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.p308j.ThreadFactoryC2790a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4775f;
import p007c.p190n.p385d.DataCollectionDefaultChange;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p416p.Event2;
import p007c.p190n.p385d.p416p.EventHandler2;
import p007c.p190n.p385d.p416p.Subscriber;
import p007c.p190n.p385d.p417q.HeartBeatInfo;
import p007c.p190n.p385d.p418r.C5488n;
import p007c.p190n.p385d.p418r.C5491q;
import p007c.p190n.p385d.p420s.Provider2;
import p007c.p190n.p385d.p421t.FirebaseInstallationsApi;
import p007c.p190n.p385d.p428w.C5537c0;
import p007c.p190n.p385d.p429x.UserAgentPublisher;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"FirebaseUnknownNullness"})
    public static TransportFactory f29284a;

    /* JADX INFO: renamed from: b */
    public final Context f29285b;

    /* JADX INFO: renamed from: c */
    public final FirebaseApp2 f29286c;

    /* JADX INFO: renamed from: d */
    public final FirebaseInstanceId f29287d;

    /* JADX INFO: renamed from: e */
    public final C5996a f29288e;

    /* JADX INFO: renamed from: f */
    public final Executor f29289f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4781i<C5537c0> f29290g;

    /* JADX INFO: renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
    public class C5996a {

        /* JADX INFO: renamed from: a */
        public final Subscriber f29291a;

        /* JADX INFO: renamed from: b */
        public boolean f29292b;

        /* JADX INFO: renamed from: c */
        public EventHandler2<DataCollectionDefaultChange> f29293c;

        /* JADX INFO: renamed from: d */
        public Boolean f29294d;

        public C5996a(Subscriber subscriber) {
            this.f29291a = subscriber;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m12930a() {
            if (this.f29292b) {
                return;
            }
            Boolean boolM12932c = m12932c();
            this.f29294d = boolM12932c;
            if (boolM12932c == null) {
                EventHandler2<DataCollectionDefaultChange> eventHandler2 = new EventHandler2(this) { // from class: c.n.d.w.k

                    /* JADX INFO: renamed from: a */
                    public final FirebaseMessaging.C5996a f27276a;

                    {
                        this.f27276a = this;
                    }

                    @Override // p007c.p190n.p385d.p416p.EventHandler2
                    /* JADX INFO: renamed from: a */
                    public void mo11681a(Event2 event2) {
                        final FirebaseMessaging.C5996a c5996a = this.f27276a;
                        if (c5996a.m12931b()) {
                            FirebaseMessaging.this.f29289f.execute(new Runnable(c5996a) { // from class: c.n.d.w.l

                                /* JADX INFO: renamed from: f */
                                public final FirebaseMessaging.C5996a f27277f;

                                {
                                    this.f27277f = c5996a;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    FirebaseMessaging.this.f29287d.m12923i();
                                }
                            });
                        }
                    }
                };
                this.f29293c = eventHandler2;
                this.f29291a.mo11701a(DataCollectionDefaultChange.class, eventHandler2);
            }
            this.f29292b = true;
        }

        /* JADX INFO: renamed from: b */
        public synchronized boolean m12931b() {
            Boolean bool;
            m12930a();
            bool = this.f29294d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f29286c.m11671g();
        }

        /* JADX INFO: renamed from: c */
        public final Boolean m12932c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            FirebaseApp2 firebaseApp2 = FirebaseMessaging.this.f29286c;
            firebaseApp2.m11668a();
            Context context = firebaseApp2.f26303d;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp2 firebaseApp2, final FirebaseInstanceId firebaseInstanceId, Provider2<UserAgentPublisher> provider2, Provider2<HeartBeatInfo> provider3, FirebaseInstallationsApi firebaseInstallationsApi, TransportFactory transportFactory, Subscriber subscriber) {
        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceIdReceiver");
            f29284a = transportFactory;
            this.f29286c = firebaseApp2;
            this.f29287d = firebaseInstanceId;
            this.f29288e = new C5996a(subscriber);
            firebaseApp2.m11668a();
            final Context context = firebaseApp2.f26303d;
            this.f29285b = context;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC2790a("Firebase-Messaging-Init"));
            this.f29289f = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.execute(new Runnable(this, firebaseInstanceId) { // from class: c.n.d.w.h

                /* JADX INFO: renamed from: f */
                public final FirebaseMessaging f27272f;

                /* JADX INFO: renamed from: g */
                public final FirebaseInstanceId f27273g;

                {
                    this.f27272f = this;
                    this.f27273g = firebaseInstanceId;
                }

                @Override // java.lang.Runnable
                public void run() {
                    FirebaseMessaging firebaseMessaging = this.f27272f;
                    FirebaseInstanceId firebaseInstanceId2 = this.f27273g;
                    if (firebaseMessaging.f29288e.m12931b()) {
                        firebaseInstanceId2.m12923i();
                    }
                }
            });
            final C5491q c5491q = new C5491q(context);
            final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC2790a("Firebase-Messaging-Topics-Io"));
            int i = C5537c0.f27241b;
            final C5488n c5488n = new C5488n(firebaseApp2, c5491q, provider2, provider3, firebaseInstallationsApi);
            AbstractC4781i<C5537c0> abstractC4781iM10206c = C4340s8.m10206c(scheduledThreadPoolExecutor2, new Callable(context, scheduledThreadPoolExecutor2, firebaseInstanceId, c5491q, c5488n) { // from class: c.n.d.w.b0

                /* JADX INFO: renamed from: a */
                public final Context f27232a;

                /* JADX INFO: renamed from: b */
                public final ScheduledExecutorService f27233b;

                /* JADX INFO: renamed from: c */
                public final FirebaseInstanceId f27234c;

                /* JADX INFO: renamed from: d */
                public final C5491q f27235d;

                /* JADX INFO: renamed from: e */
                public final C5488n f27236e;

                {
                    this.f27232a = context;
                    this.f27233b = scheduledThreadPoolExecutor2;
                    this.f27234c = firebaseInstanceId;
                    this.f27235d = c5491q;
                    this.f27236e = c5488n;
                }

                @Override // java.util.concurrent.Callable
                public Object call() {
                    C5533a0 c5533a0;
                    Context context2 = this.f27232a;
                    ScheduledExecutorService scheduledExecutorService = this.f27233b;
                    FirebaseInstanceId firebaseInstanceId2 = this.f27234c;
                    C5491q c5491q2 = this.f27235d;
                    C5488n c5488n2 = this.f27236e;
                    synchronized (C5533a0.class) {
                        try {
                            WeakReference<C5533a0> weakReference = C5533a0.f27227a;
                            c5533a0 = weakReference != null ? weakReference.get() : null;
                            if (c5533a0 == null) {
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.android.gms.appid", 0);
                                C5533a0 c5533a1 = new C5533a0(sharedPreferences, scheduledExecutorService);
                                synchronized (c5533a1) {
                                    c5533a1.f27229c = C5560y.m12206a(sharedPreferences, "topic_operation_queue", scheduledExecutorService);
                                }
                                C5533a0.f27227a = new WeakReference<>(c5533a1);
                                c5533a0 = c5533a1;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return new C5537c0(firebaseInstanceId2, c5491q2, c5533a0, c5488n2, context2, scheduledExecutorService);
                }
            });
            this.f29290g = abstractC4781iM10206c;
            abstractC4781iM10206c.mo10932e(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2790a("Firebase-Messaging-Trigger-Topics-Io")), new InterfaceC4775f(this) { // from class: c.n.d.w.i

                /* JADX INFO: renamed from: a */
                public final FirebaseMessaging f27274a;

                {
                    this.f27274a = this;
                }

                @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4775f
                /* JADX INFO: renamed from: a */
                public void mo5107a(Object obj) {
                    boolean z;
                    C5537c0 c5537c0 = (C5537c0) obj;
                    if (this.f27274a.f29288e.m12931b()) {
                        if (c5537c0.f27249j.m12166a() != null) {
                            synchronized (c5537c0) {
                                z = c5537c0.f27248i;
                            }
                            if (z) {
                                return;
                            }
                            c5537c0.m12174g(0L);
                        }
                    }
                }
            });
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("FirebaseMessaging and FirebaseInstanceId versions not compatible. Update to latest version of firebase-messaging.");
        }
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(FirebaseApp2 firebaseApp2) {
        FirebaseMessaging firebaseMessaging;
        firebaseApp2.m11668a();
        firebaseMessaging = (FirebaseMessaging) firebaseApp2.f26306g.mo11684a(FirebaseMessaging.class);
        C2622l.m5379i(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }
}
