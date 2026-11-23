package p477d1.p485u;

/* JADX INFO: renamed from: d1.u.e, reason: use source file name */
/* JADX INFO: compiled from: ContinuationInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
public interface ContinuationInterceptor extends CoroutineContext.a {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f29532c = 0;

    /* JADX INFO: renamed from: d1.u.e$a */
    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class a implements CoroutineContext.b<ContinuationInterceptor> {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ a f29533f = new a();
    }

    /* JADX INFO: renamed from: c */
    void mo13057c(Continuation<?> continuation);

    /* JADX INFO: renamed from: f */
    <T> Continuation<T> mo13058f(Continuation<? super T> continuation);
}
