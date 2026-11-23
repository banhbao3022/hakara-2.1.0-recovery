package p500e1.p501a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p494b.InterfaceC6164l;

/* JADX INFO: renamed from: e1.a.c1, reason: use source file name */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes.dex */
public interface Job extends CoroutineContext.a {

    /* JADX INFO: renamed from: e */
    public static final a f29633e = a.f29634f;

    /* JADX INFO: renamed from: e1.a.c1$a */
    /* JADX INFO: compiled from: Job.kt */
    public static final class a implements CoroutineContext.b<Job> {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ a f29634f = new a();

        static {
            int i = CoroutineExceptionHandler.f33299d;
        }
    }

    /* JADX INFO: renamed from: D */
    Job2 mo13125D(boolean z, boolean z2, InterfaceC6164l<? super Throwable, Unit> interfaceC6164l);

    /* JADX INFO: renamed from: D0 */
    Job3 mo13126D0(Job5 job5);

    /* JADX INFO: renamed from: H */
    CancellationException mo13127H();

    /* JADX INFO: renamed from: a */
    boolean mo13115a();

    /* JADX INFO: renamed from: b0 */
    Job2 mo13128b0(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l);

    boolean start();

    /* JADX INFO: renamed from: t0 */
    void mo13129t0(CancellationException cancellationException);

    /* JADX INFO: renamed from: u */
    Object mo13130u(Continuation<? super Unit> continuation);
}
