package p500e1.p501a.p503c2;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p000.ServiceLoader;
import p007c.p451o.p452a.C5729a;
import p477d1.p480c0.Sequences3;
import p477d1.p480c0._Sequences;
import p500e1.p501a.MainCoroutineDispatcher;

/* JADX INFO: renamed from: e1.a.c2.m, reason: use source file name */
/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MainDispatchers {

    /* JADX INFO: renamed from: a */
    public static final boolean f29665a;

    /* JADX INFO: renamed from: b */
    public static final MainCoroutineDispatcher f29666b;

    static {
        MainDispatchers mainDispatchers = new MainDispatchers();
        String strM12439L = C5729a.m12439L("kotlinx.coroutines.fast.service.loader");
        f29665a = strM12439L != null ? Boolean.parseBoolean(strM12439L) : true;
        f29666b = mainDispatchers.m13160a();
    }

    /* JADX INFO: renamed from: a */
    public final MainCoroutineDispatcher m13160a() {
        Object obj;
        List<? extends MainDispatcherFactory> listM12977b = _Sequences.m12977b(Sequences3.m12976a(ServiceLoader.m1b()));
        Iterator it = listM12977b.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
        if (mainDispatcherFactory != null) {
            try {
                MainCoroutineDispatcher mainCoroutineDispatcherCreateDispatcher = mainDispatcherFactory.createDispatcher(listM12977b);
                if (mainCoroutineDispatcherCreateDispatcher != null) {
                    return mainCoroutineDispatcherCreateDispatcher;
                }
            } catch (Throwable th) {
                mainDispatcherFactory.hintOnError();
                throw th;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
