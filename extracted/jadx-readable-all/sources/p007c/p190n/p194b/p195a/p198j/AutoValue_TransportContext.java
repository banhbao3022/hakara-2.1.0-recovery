package p007c.p190n.p194b.p195a.p198j;

import java.util.Arrays;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.Priority2;

/* JADX INFO: renamed from: c.n.b.a.j.c, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_TransportContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_TransportContext extends TransportContext {

    /* JADX INFO: renamed from: a */
    public final String f5717a;

    /* JADX INFO: renamed from: b */
    public final byte[] f5718b;

    /* JADX INFO: renamed from: c */
    public final Priority2 f5719c;

    /* JADX INFO: renamed from: c.n.b.a.j.c$b */
    /* JADX INFO: compiled from: AutoValue_TransportContext.java */
    public static final class b extends TransportContext.a {

        /* JADX INFO: renamed from: a */
        public String f5720a;

        /* JADX INFO: renamed from: b */
        public byte[] f5721b;

        /* JADX INFO: renamed from: c */
        public Priority2 f5722c;

        @Override // p007c.p190n.p194b.p195a.p198j.TransportContext.a
        /* JADX INFO: renamed from: a */
        public TransportContext mo2811a() {
            String strM1599u = this.f5720a == null ? " backendName" : "";
            if (this.f5722c == null) {
                strM1599u = outline.m1599u(strM1599u, " priority");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_TransportContext(this.f5720a, this.f5721b, this.f5722c, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        @Override // p007c.p190n.p194b.p195a.p198j.TransportContext.a
        /* JADX INFO: renamed from: b */
        public TransportContext.a mo2812b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f5720a = str;
            return this;
        }

        @Override // p007c.p190n.p194b.p195a.p198j.TransportContext.a
        /* JADX INFO: renamed from: c */
        public TransportContext.a mo2813c(byte[] bArr) {
            this.f5721b = bArr;
            return this;
        }

        @Override // p007c.p190n.p194b.p195a.p198j.TransportContext.a
        /* JADX INFO: renamed from: d */
        public TransportContext.a mo2814d(Priority2 priority2) {
            Objects.requireNonNull(priority2, "Null priority");
            this.f5722c = priority2;
            return this;
        }
    }

    public AutoValue_TransportContext(String str, byte[] bArr, Priority2 priority2, a aVar) {
        this.f5717a = str;
        this.f5718b = bArr;
        this.f5719c = priority2;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.TransportContext
    /* JADX INFO: renamed from: b */
    public String mo2808b() {
        return this.f5717a;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.TransportContext
    /* JADX INFO: renamed from: c */
    public byte[] mo2809c() {
        return this.f5718b;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.TransportContext
    /* JADX INFO: renamed from: d */
    public Priority2 mo2810d() {
        return this.f5719c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f5717a.equals(transportContext.mo2808b())) {
            if (Arrays.equals(this.f5718b, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).f5718b : transportContext.mo2809c()) && this.f5719c.equals(transportContext.mo2810d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5717a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5718b)) * 1000003) ^ this.f5719c.hashCode();
    }
}
