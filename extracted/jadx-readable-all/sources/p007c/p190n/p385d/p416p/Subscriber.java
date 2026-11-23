package p007c.p190n.p385d.p416p;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.d.p.d, reason: use source file name */
/* JADX INFO: compiled from: Subscriber.java */
/* JADX INFO: loaded from: classes.dex */
public interface Subscriber {
    /* JADX INFO: renamed from: a */
    <T> void mo11701a(Class<T> cls, EventHandler2<? super T> eventHandler2);

    /* JADX INFO: renamed from: b */
    <T> void mo11702b(Class<T> cls, Executor executor, EventHandler2<? super T> eventHandler2);
}
