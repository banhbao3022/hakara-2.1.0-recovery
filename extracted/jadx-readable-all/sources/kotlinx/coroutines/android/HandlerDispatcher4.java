package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p500e1.p501a.MainCoroutineDispatcher;
import p500e1.p501a.p502b2.HandlerDispatcher;
import p500e1.p501a.p502b2.HandlerDispatcher3;

/* JADX INFO: renamed from: kotlinx.coroutines.android.AndroidDispatcherFactory, reason: use source file name */
/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerDispatcher4 implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public /* bridge */ /* synthetic */ MainCoroutineDispatcher createDispatcher(List list) {
        return createDispatcher((List<? extends MainDispatcherFactory>) list);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public HandlerDispatcher createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new HandlerDispatcher(HandlerDispatcher3.m13124a(Looper.getMainLooper(), true), null, 2, 0 == true ? 1 : 0);
    }
}
