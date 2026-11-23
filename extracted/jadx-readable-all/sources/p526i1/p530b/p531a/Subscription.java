package p526i1.p530b.p531a;

/* JADX INFO: renamed from: i1.b.a.q, reason: use source file name */
/* JADX INFO: compiled from: Subscription.java */
/* JADX INFO: loaded from: classes2.dex */
public final class Subscription {

    /* JADX INFO: renamed from: a */
    public final Object f30853a;

    /* JADX INFO: renamed from: b */
    public final SubscriberMethod f30854b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f30855c = true;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f30853a = obj;
        this.f30854b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.f30853a == subscription.f30853a && this.f30854b.equals(subscription.f30854b);
    }

    public int hashCode() {
        return this.f30854b.f30843f.hashCode() + this.f30853a.hashCode();
    }
}
