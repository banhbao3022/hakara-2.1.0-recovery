package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: c.n.d.l.e.k.j, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsBackgroundWorker3<T> implements InterfaceC4767b<Void, T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Callable f26525a;

    public CrashlyticsBackgroundWorker3(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, Callable callable) {
        this.f26525a = callable;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
    /* JADX INFO: renamed from: a */
    public T mo5191a(AbstractC4781i<Void> abstractC4781i) throws Exception {
        return (T) this.f26525a.call();
    }
}
