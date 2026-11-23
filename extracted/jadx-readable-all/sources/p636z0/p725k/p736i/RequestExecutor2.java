package p636z0.p725k.p736i;

import android.os.Handler;
import java.util.concurrent.Callable;
import p636z0.p725k.p738k.Consumer2;

/* JADX INFO: renamed from: z0.k.i.o, reason: use source file name */
/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class RequestExecutor2<T> implements Runnable {

    /* JADX INFO: renamed from: f */
    public Callable<T> f37934f;

    /* JADX INFO: renamed from: g */
    public Consumer2<T> f37935g;

    /* JADX INFO: renamed from: h */
    public Handler f37936h;

    /* JADX INFO: renamed from: z0.k.i.o$a */
    /* JADX INFO: compiled from: RequestExecutor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Consumer2 f37937f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Object f37938g;

        public a(RequestExecutor2 requestExecutor2, Consumer2 consumer2, Object obj) {
            this.f37937f = consumer2;
            this.f37938g = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.f37937f.mo2060a(this.f37938g);
        }
    }

    public RequestExecutor2(Handler handler, Callable<T> callable, Consumer2<T> consumer2) {
        this.f37934f = callable;
        this.f37935g = consumer2;
        this.f37936h = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        T tCall;
        try {
            tCall = this.f37934f.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.f37936h.post(new a(this, this.f37935g, tCall));
    }
}
