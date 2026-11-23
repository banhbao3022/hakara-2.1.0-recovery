package p007c.p190n.p385d.p390k;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p007c.p190n.p385d.p416p.Event2;
import p007c.p190n.p385d.p416p.EventHandler2;
import p007c.p190n.p385d.p416p.Publisher;
import p007c.p190n.p385d.p416p.Subscriber;

/* JADX INFO: renamed from: c.n.d.k.w, reason: use source file name */
/* JADX INFO: compiled from: EventBus.java */
/* JADX INFO: loaded from: classes.dex */
public class EventBus2 implements Subscriber, Publisher {

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<EventHandler2<Object>, Executor>> f26405a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Queue<Event2<?>> f26406b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final Executor f26407c;

    public EventBus2(Executor executor) {
        this.f26407c = executor;
    }

    @Override // p007c.p190n.p385d.p416p.Subscriber
    /* JADX INFO: renamed from: a */
    public <T> void mo11701a(Class<T> cls, EventHandler2<? super T> eventHandler2) {
        mo11702b(cls, this.f26407c, eventHandler2);
    }

    @Override // p007c.p190n.p385d.p416p.Subscriber
    /* JADX INFO: renamed from: b */
    public synchronized <T> void mo11702b(Class<T> cls, Executor executor, EventHandler2<? super T> eventHandler2) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(eventHandler2);
        Objects.requireNonNull(executor);
        if (!this.f26405a.containsKey(cls)) {
            this.f26405a.put(cls, new ConcurrentHashMap<>());
        }
        this.f26405a.get(cls).put(eventHandler2, executor);
    }
}
