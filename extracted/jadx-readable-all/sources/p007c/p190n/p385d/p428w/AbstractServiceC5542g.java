package p007c.p190n.p385d.p428w;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.p307u.p308j.ThreadFactoryC2790a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p194b.p266d.p333n.C4793u;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4771d;
import p007c.p190n.p385d.p418r.BinderC5471a0;
import p007c.p190n.p385d.p418r.C5499y;

/* JADX INFO: renamed from: c.n.d.w.g */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class AbstractServiceC5542g extends Service {

    /* JADX INFO: renamed from: f */
    public final ExecutorService f27266f;

    /* JADX INFO: renamed from: g */
    public Binder f27267g;

    /* JADX INFO: renamed from: h */
    public final Object f27268h;

    /* JADX INFO: renamed from: i */
    public int f27269i;

    /* JADX INFO: renamed from: j */
    public int f27270j;

    /* JADX INFO: renamed from: c.n.d.w.g$a */
    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
    public class a implements BinderC5471a0.a {
        public a() {
        }
    }

    public AbstractServiceC5542g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2790a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f27266f = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f27268h = new Object();
        this.f27270j = 0;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void m12185e(Intent intent) {
        if (intent != null) {
            synchronized (C5499y.f27115b) {
                if (C5499y.f27116c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    C5499y.f27116c.m10920b();
                }
            }
        }
        synchronized (this.f27268h) {
            try {
                int i = this.f27270j - 1;
                this.f27270j = i;
                if (i == 0) {
                    stopSelfResult(this.f27269i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Intent mo12182b(Intent intent) {
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo12183c(Intent intent);

    /* JADX INFO: renamed from: d */
    public boolean mo12184d(Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC4781i<Void> m12186f(final Intent intent) {
        if (mo12184d(intent)) {
            return C4340s8.m10208e(null);
        }
        final C4782j c4782j = new C4782j();
        this.f27266f.execute(new Runnable(this, intent, c4782j) { // from class: c.n.d.w.d

            /* JADX INFO: renamed from: f */
            public final AbstractServiceC5542g f27250f;

            /* JADX INFO: renamed from: g */
            public final Intent f27251g;

            /* JADX INFO: renamed from: h */
            public final C4782j f27252h;

            {
                this.f27250f = this;
                this.f27251g = intent;
                this.f27252h = c4782j;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                AbstractServiceC5542g abstractServiceC5542g = this.f27250f;
                Intent intent2 = this.f27251g;
                C4782j c4782j2 = this.f27252h;
                Objects.requireNonNull(abstractServiceC5542g);
                try {
                    abstractServiceC5542g.mo12183c(intent2);
                } finally {
                    c4782j2.f24683a.m10944q(null);
                }
            }
        });
        return c4782j.f24683a;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f27267g == null) {
            this.f27267g = new BinderC5471a0(new a());
        }
        return this.f27267g;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f27266f.shutdown();
        super.onDestroy();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f27268h) {
            this.f27269i = i2;
            this.f27270j++;
        }
        Intent intentMo12182b = mo12182b(intent);
        if (intentMo12182b == null) {
            m12185e(intent);
            return 2;
        }
        AbstractC4781i<Void> abstractC4781iM12186f = m12186f(intentMo12182b);
        if (abstractC4781iM12186f.mo10940m()) {
            m12185e(intent);
            return 2;
        }
        C4778g0 c4778g0 = (C4778g0) abstractC4781iM12186f;
        c4778g0.f24676b.m10927b(new C4793u(ExecutorC5540e.f27263f, new InterfaceC4771d(this, intent) { // from class: c.n.d.w.f

            /* JADX INFO: renamed from: a */
            public final AbstractServiceC5542g f27264a;

            /* JADX INFO: renamed from: b */
            public final Intent f27265b;

            {
                this.f27264a = this;
                this.f27265b = intent;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4771d
            /* JADX INFO: renamed from: b */
            public void mo5171b(AbstractC4781i abstractC4781i) {
                this.f27264a.m12185e(this.f27265b);
            }
        }));
        c4778g0.m10946s();
        return 3;
    }
}
