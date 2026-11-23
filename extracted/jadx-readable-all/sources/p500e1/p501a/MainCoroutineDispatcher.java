package p500e1.p501a;

import p007c.p451o.p452a.C5729a;
import p500e1.p501a.p503c2.MainDispatchers;

/* JADX INFO: renamed from: e1.a.k1, reason: use source file name */
/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    /* JADX INFO: renamed from: H0 */
    public abstract MainCoroutineDispatcher mo13122H0();

    /* JADX INFO: renamed from: I0 */
    public final String m13272I0() {
        MainCoroutineDispatcher mainCoroutineDispatcherMo13122H0;
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatchers.f29666b;
        if (this == mainCoroutineDispatcher) {
            return "Dispatchers.Main";
        }
        try {
            mainCoroutineDispatcherMo13122H0 = mainCoroutineDispatcher.mo13122H0();
        } catch (UnsupportedOperationException unused) {
            mainCoroutineDispatcherMo13122H0 = null;
        }
        if (this == mainCoroutineDispatcherMo13122H0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    public String toString() {
        String strM13272I0 = m13272I0();
        if (strM13272I0 != null) {
            return strM13272I0;
        }
        return getClass().getSimpleName() + '@' + C5729a.m12463r(this);
    }
}
