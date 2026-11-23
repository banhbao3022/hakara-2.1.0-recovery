package kotlinx.coroutines.internal;

import java.util.List;
import p500e1.p501a.MainCoroutineDispatcher;

/* JADX INFO: compiled from: MainDispatcherFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public interface MainDispatcherFactory {
    MainCoroutineDispatcher createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
