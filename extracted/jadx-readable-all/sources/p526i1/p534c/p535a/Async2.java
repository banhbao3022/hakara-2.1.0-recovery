package p526i1.p534c.p535a;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: i1.c.a.b, reason: use source file name */
/* JADX INFO: compiled from: Async.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Async2 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6164l<Throwable, Unit> f30859a = b.f30862g;

    /* JADX INFO: renamed from: i1.c.a.b$a */
    /* JADX INFO: compiled from: Async.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC6164l f30860f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Activity f30861g;

        public a(InterfaceC6164l interfaceC6164l, Activity activity) {
            this.f30860f = interfaceC6164l;
            this.f30861g = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f30860f.mo3b(this.f30861g);
        }
    }

    /* JADX INFO: renamed from: i1.c.a.b$b */
    /* JADX INFO: compiled from: Async.kt */
    public static final class b extends Lambda implements InterfaceC6164l<Throwable, Unit> {

        /* JADX INFO: renamed from: g */
        public static final b f30862g = new b();

        public b() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Throwable th) {
            Throwable th2 = th;
            Intrinsics2.m13090f(th2, "throwable");
            th2.printStackTrace();
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T extends Activity> boolean m13838a(Async<T> async, InterfaceC6164l<? super T, Unit> interfaceC6164l) {
        Intrinsics2.m13090f(async, "receiver$0");
        Intrinsics2.m13090f(interfaceC6164l, "f");
        T t = async.f30858a.get();
        if (t == null) {
            return false;
        }
        Intrinsics2.m13086b(t, "weakRef.get() ?: return false");
        if (t.isFinishing()) {
            return false;
        }
        t.runOnUiThread(new a(interfaceC6164l, t));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static Future m13839b(Object obj, InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, int i) {
        InterfaceC6164l<Throwable, Unit> interfaceC6164l3 = (i & 1) != 0 ? f30859a : null;
        Intrinsics2.m13090f(interfaceC6164l2, "task");
        Async async = new Async(new WeakReference(obj));
        Async5 async5 = Async5.f30868b;
        Async3 async3 = new Async3(interfaceC6164l2, async, interfaceC6164l3);
        Intrinsics2.m13090f(async3, "task");
        Future futureSubmit = Async5.f30867a.submit(new Async4(async3));
        Intrinsics2.m13086b(futureSubmit, "executor.submit(task)");
        return futureSubmit;
    }
}
