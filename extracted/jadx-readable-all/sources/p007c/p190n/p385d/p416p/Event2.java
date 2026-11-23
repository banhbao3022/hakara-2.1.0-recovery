package p007c.p190n.p385d.p416p;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.d.p.a, reason: use source file name */
/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes.dex */
public class Event2<T> {

    /* JADX INFO: renamed from: a */
    public final Class<T> f27033a;

    /* JADX INFO: renamed from: b */
    public final T f27034b;

    public Event2(Class<T> cls, T t) {
        Objects.requireNonNull(cls);
        this.f27033a = cls;
        Objects.requireNonNull(t);
        this.f27034b = t;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f27033a, this.f27034b);
    }
}
