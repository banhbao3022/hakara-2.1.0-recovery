package p007c.p190n.p194b.p195a.p198j.p203v.p205i;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.p198j.EventInternal;
import p007c.p190n.p194b.p195a.p198j.TransportContext;

/* JADX INFO: renamed from: c.n.b.a.j.v.i.b, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_PersistedEvent.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_PersistedEvent extends PersistedEvent {

    /* JADX INFO: renamed from: a */
    public final long f5880a;

    /* JADX INFO: renamed from: b */
    public final TransportContext f5881b;

    /* JADX INFO: renamed from: c */
    public final EventInternal f5882c;

    public AutoValue_PersistedEvent(long j2, TransportContext transportContext, EventInternal eventInternal) {
        this.f5880a = j2;
        Objects.requireNonNull(transportContext, "Null transportContext");
        this.f5881b = transportContext;
        Objects.requireNonNull(eventInternal, "Null event");
        this.f5882c = eventInternal;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.PersistedEvent
    /* JADX INFO: renamed from: a */
    public EventInternal mo2856a() {
        return this.f5882c;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.PersistedEvent
    /* JADX INFO: renamed from: b */
    public long mo2857b() {
        return this.f5880a;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.PersistedEvent
    /* JADX INFO: renamed from: c */
    public TransportContext mo2858c() {
        return this.f5881b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.f5880a == persistedEvent.mo2857b() && this.f5881b.equals(persistedEvent.mo2858c()) && this.f5882c.equals(persistedEvent.mo2856a());
    }

    public int hashCode() {
        long j2 = this.f5880a;
        return this.f5882c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f5881b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("PersistedEvent{id=");
        sbM1556G.append(this.f5880a);
        sbM1556G.append(", transportContext=");
        sbM1556G.append(this.f5881b);
        sbM1556G.append(", event=");
        sbM1556G.append(this.f5882c);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
