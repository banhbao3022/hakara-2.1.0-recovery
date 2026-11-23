package p007c.p190n.p194b.p195a.p198j.p199s;

import android.content.Context;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.s.c, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CreationContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CreationContext extends CreationContext {

    /* JADX INFO: renamed from: a */
    public final Context f5765a;

    /* JADX INFO: renamed from: b */
    public final Clock f5766b;

    /* JADX INFO: renamed from: c */
    public final Clock f5767c;

    /* JADX INFO: renamed from: d */
    public final String f5768d;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f5765a = context;
        Objects.requireNonNull(clock, "Null wallClock");
        this.f5766b = clock;
        Objects.requireNonNull(clock2, "Null monotonicClock");
        this.f5767c = clock2;
        Objects.requireNonNull(str, "Null backendName");
        this.f5768d = str;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.CreationContext
    /* JADX INFO: renamed from: a */
    public Context mo2827a() {
        return this.f5765a;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.CreationContext
    /* JADX INFO: renamed from: b */
    public String mo2828b() {
        return this.f5768d;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.CreationContext
    /* JADX INFO: renamed from: c */
    public Clock mo2829c() {
        return this.f5767c;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.CreationContext
    /* JADX INFO: renamed from: d */
    public Clock mo2830d() {
        return this.f5766b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.f5765a.equals(creationContext.mo2827a()) && this.f5766b.equals(creationContext.mo2830d()) && this.f5767c.equals(creationContext.mo2829c()) && this.f5768d.equals(creationContext.mo2828b());
    }

    public int hashCode() {
        return ((((((this.f5765a.hashCode() ^ 1000003) * 1000003) ^ this.f5766b.hashCode()) * 1000003) ^ this.f5767c.hashCode()) * 1000003) ^ this.f5768d.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CreationContext{applicationContext=");
        sbM1556G.append(this.f5765a);
        sbM1556G.append(", wallClock=");
        sbM1556G.append(this.f5766b);
        sbM1556G.append(", monotonicClock=");
        sbM1556G.append(this.f5767c);
        sbM1556G.append(", backendName=");
        return outline.m1550A(sbM1556G, this.f5768d, "}");
    }
}
