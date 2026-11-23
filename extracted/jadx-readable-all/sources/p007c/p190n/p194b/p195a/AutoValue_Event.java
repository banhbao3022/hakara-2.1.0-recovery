package p007c.p190n.p194b.p195a;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.a, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_Event.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_Event<T> extends Event<T> {

    /* JADX INFO: renamed from: a */
    public final Integer f5512a;

    /* JADX INFO: renamed from: b */
    public final T f5513b;

    /* JADX INFO: renamed from: c */
    public final Priority2 f5514c;

    public AutoValue_Event(Integer num, T t, Priority2 priority2) {
        this.f5512a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f5513b = t;
        Objects.requireNonNull(priority2, "Null priority");
        this.f5514c = priority2;
    }

    @Override // p007c.p190n.p194b.p195a.Event
    /* JADX INFO: renamed from: a */
    public Integer mo2745a() {
        return this.f5512a;
    }

    @Override // p007c.p190n.p194b.p195a.Event
    /* JADX INFO: renamed from: b */
    public T mo2746b() {
        return this.f5513b;
    }

    @Override // p007c.p190n.p194b.p195a.Event
    /* JADX INFO: renamed from: c */
    public Priority2 mo2747c() {
        return this.f5514c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.f5512a;
        if (num != null ? num.equals(event.mo2745a()) : event.mo2745a() == null) {
            if (this.f5513b.equals(event.mo2746b()) && this.f5514c.equals(event.mo2747c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f5512a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f5513b.hashCode()) * 1000003) ^ this.f5514c.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Event{code=");
        sbM1556G.append(this.f5512a);
        sbM1556G.append(", payload=");
        sbM1556G.append(this.f5513b);
        sbM1556G.append(", priority=");
        sbM1556G.append(this.f5514c);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
