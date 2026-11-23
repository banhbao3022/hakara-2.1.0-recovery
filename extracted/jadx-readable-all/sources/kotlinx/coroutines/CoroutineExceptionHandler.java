package kotlinx.coroutines;

import p477d1.p485u.CoroutineContext;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public interface CoroutineExceptionHandler extends CoroutineContext.a {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f33299d = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    public static final class C7217a implements CoroutineContext.b<CoroutineExceptionHandler> {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ C7217a f33300f = new C7217a();
    }

    void handleException(CoroutineContext coroutineContext, Throwable th);
}
