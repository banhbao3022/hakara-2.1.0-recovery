package p007c.p165l.p178k0;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import p007c.p165l.FacebookSdk;

/* JADX INFO: renamed from: c.l.k0.w, reason: use source file name */
/* JADX INFO: compiled from: LockOnGetVariable.java */
/* JADX INFO: loaded from: classes.dex */
public class LockOnGetVariable<T> {

    /* JADX INFO: renamed from: a */
    public T f5039a;

    /* JADX INFO: renamed from: b */
    public CountDownLatch f5040b;

    /* JADX INFO: renamed from: c.l.k0.w$a */
    /* JADX INFO: compiled from: LockOnGetVariable.java */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f5041a;

        public a(Callable callable) {
            this.f5041a = callable;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            try {
                LockOnGetVariable.this.f5039a = (T) this.f5041a.call();
                return null;
            } finally {
                LockOnGetVariable.this.f5040b.countDown();
            }
        }
    }

    public LockOnGetVariable(T t) {
        this.f5039a = t;
    }

    public LockOnGetVariable(Callable<T> callable) {
        this.f5040b = new CountDownLatch(1);
        FacebookSdk.m2660b().execute(new FutureTask(new a(callable)));
    }
}
