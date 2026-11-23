package p636z0.p760t.p762b;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p725k.p735h.OperationCanceledException;
import p636z0.p760t.p761a.LoaderManagerImpl;

/* JADX INFO: renamed from: z0.t.b.a, reason: use source file name */
/* JADX INFO: compiled from: AsyncTaskLoader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncTaskLoader<D> extends Loader2<D> {

    /* JADX INFO: renamed from: g */
    public final Executor f38750g;

    /* JADX INFO: renamed from: h */
    public volatile AsyncTaskLoader<D>.a f38751h;

    /* JADX INFO: renamed from: i */
    public volatile AsyncTaskLoader<D>.a f38752i;

    /* JADX INFO: renamed from: j */
    public long f38753j;

    /* JADX INFO: renamed from: z0.t.b.a$a */
    /* JADX INFO: compiled from: AsyncTaskLoader.java */
    public final class a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: o */
        public final CountDownLatch f38754o = new CountDownLatch(1);

        public a() {
        }

        @Override // p636z0.p760t.p762b.ModernAsyncTask
        /* JADX INFO: renamed from: a */
        public Object mo16758a(Void[] voidArr) {
            try {
                return AsyncTaskLoader.this.mo4922f();
            } catch (OperationCanceledException e) {
                if (this.f38769m.get()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // p636z0.p760t.p762b.ModernAsyncTask
        /* JADX INFO: renamed from: b */
        public void mo16759b(D d) {
            try {
                AsyncTaskLoader asyncTaskLoader = AsyncTaskLoader.this;
                if (asyncTaskLoader.f38752i == this) {
                    asyncTaskLoader.f38753j = SystemClock.uptimeMillis();
                    asyncTaskLoader.f38752i = null;
                    asyncTaskLoader.m16756e();
                }
            } finally {
                this.f38754o.countDown();
            }
        }

        @Override // p636z0.p760t.p762b.ModernAsyncTask
        /* JADX INFO: renamed from: c */
        public void mo16760c(D d) {
            try {
                AsyncTaskLoader.this.m16755d(this, d);
            } finally {
                this.f38754o.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncTaskLoader.this.m16756e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskLoader(Context context) {
        super(context);
        Executor executor = ModernAsyncTask.f38764h;
        this.f38753j = -10000L;
        this.f38750g = executor;
    }

    @Override // p636z0.p760t.p762b.Loader2
    @Deprecated
    /* JADX INFO: renamed from: a */
    public void mo16753a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo16753a(str, fileDescriptor, printWriter, strArr);
        if (this.f38751h != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f38751h);
            printWriter.print(" waiting=");
            Objects.requireNonNull(this.f38751h);
            printWriter.println(false);
        }
        if (this.f38752i != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f38752i);
            printWriter.print(" waiting=");
            Objects.requireNonNull(this.f38752i);
            printWriter.println(false);
        }
    }

    @Override // p636z0.p760t.p762b.Loader2
    /* JADX INFO: renamed from: b */
    public boolean mo16754b() {
        if (this.f38751h == null) {
            return false;
        }
        if (!this.f38758c) {
            this.f38761f = true;
        }
        if (this.f38752i != null) {
            Objects.requireNonNull(this.f38751h);
            this.f38751h = null;
            return false;
        }
        Objects.requireNonNull(this.f38751h);
        AsyncTaskLoader<D>.a aVar = this.f38751h;
        aVar.f38769m.set(true);
        boolean zCancel = aVar.f38767k.cancel(false);
        if (zCancel) {
            this.f38752i = this.f38751h;
        }
        this.f38751h = null;
        return zCancel;
    }

    /* JADX INFO: renamed from: d */
    public void m16755d(AsyncTaskLoader<D>.a aVar, D d) {
        if (this.f38751h != aVar) {
            if (this.f38752i == aVar) {
                this.f38753j = SystemClock.uptimeMillis();
                this.f38752i = null;
                m16756e();
                return;
            }
            return;
        }
        if (this.f38759d) {
            return;
        }
        this.f38753j = SystemClock.uptimeMillis();
        this.f38751h = null;
        Loader2.a<D> aVar2 = this.f38757b;
        if (aVar2 != null) {
            LoaderManagerImpl.a aVar3 = (LoaderManagerImpl.a) aVar2;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aVar3.mo427j(d);
            } else {
                aVar3.m16742k(d);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m16756e() {
        if (this.f38752i != null || this.f38751h == null) {
            return;
        }
        Objects.requireNonNull(this.f38751h);
        AsyncTaskLoader<D>.a aVar = this.f38751h;
        Executor executor = this.f38750g;
        if (aVar.f38768l == 1) {
            aVar.f38768l = 2;
            aVar.f38766j.f38776a = null;
            executor.execute(aVar.f38767k);
        } else {
            int iM15315d = C7804v0.m15315d(aVar.f38768l);
            if (iM15315d == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iM15315d == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract D mo4922f();

    /* JADX INFO: renamed from: g */
    public void m16757g() {
        mo16754b();
        this.f38751h = new a();
        m16756e();
    }
}
