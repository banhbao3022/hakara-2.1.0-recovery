package p007c.p190n.p194b.p195a.p198j;

import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.j.a, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_EventInternal.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_EventInternal extends EventInternal {

    /* JADX INFO: renamed from: a */
    public final String f5700a;

    /* JADX INFO: renamed from: b */
    public final Integer f5701b;

    /* JADX INFO: renamed from: c */
    public final EncodedPayload f5702c;

    /* JADX INFO: renamed from: d */
    public final long f5703d;

    /* JADX INFO: renamed from: e */
    public final long f5704e;

    /* JADX INFO: renamed from: f */
    public final Map<String, String> f5705f;

    /* JADX INFO: renamed from: c.n.b.a.j.a$b */
    /* JADX INFO: compiled from: AutoValue_EventInternal.java */
    public static final class b extends EventInternal.a {

        /* JADX INFO: renamed from: a */
        public String f5706a;

        /* JADX INFO: renamed from: b */
        public Integer f5707b;

        /* JADX INFO: renamed from: c */
        public EncodedPayload f5708c;

        /* JADX INFO: renamed from: d */
        public Long f5709d;

        /* JADX INFO: renamed from: e */
        public Long f5710e;

        /* JADX INFO: renamed from: f */
        public Map<String, String> f5711f;

        @Override // p007c.p190n.p194b.p195a.p198j.EventInternal.a
        /* JADX INFO: renamed from: b */
        public EventInternal mo2800b() {
            String strM1599u = this.f5706a == null ? " transportName" : "";
            if (this.f5708c == null) {
                strM1599u = outline.m1599u(strM1599u, " encodedPayload");
            }
            if (this.f5709d == null) {
                strM1599u = outline.m1599u(strM1599u, " eventMillis");
            }
            if (this.f5710e == null) {
                strM1599u = outline.m1599u(strM1599u, " uptimeMillis");
            }
            if (this.f5711f == null) {
                strM1599u = outline.m1599u(strM1599u, " autoMetadata");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_EventInternal(this.f5706a, this.f5707b, this.f5708c, this.f5709d.longValue(), this.f5710e.longValue(), this.f5711f, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        @Override // p007c.p190n.p194b.p195a.p198j.EventInternal.a
        /* JADX INFO: renamed from: c */
        public Map<String, String> mo2801c() {
            Map<String, String> map = this.f5711f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: renamed from: d */
        public EventInternal.a m2802d(Map<String, String> map) {
            this.f5711f = map;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public EventInternal.a m2803e(Integer num) {
            this.f5707b = num;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public EventInternal.a m2804f(EncodedPayload encodedPayload) {
            Objects.requireNonNull(encodedPayload, "Null encodedPayload");
            this.f5708c = encodedPayload;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public EventInternal.a m2805g(long j2) {
            this.f5709d = Long.valueOf(j2);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public EventInternal.a m2806h(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f5706a = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public EventInternal.a m2807i(long j2) {
            this.f5710e = Long.valueOf(j2);
            return this;
        }
    }

    public AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j2, long j3, Map map, a aVar) {
        this.f5700a = str;
        this.f5701b = num;
        this.f5702c = encodedPayload;
        this.f5703d = j2;
        this.f5704e = j3;
        this.f5705f = map;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.EventInternal
    /* JADX INFO: renamed from: b */
    public Map<String, String> mo2794b() {
        return this.f5705f;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.EventInternal
    /* JADX INFO: renamed from: c */
    public Integer mo2795c() {
        return this.f5701b;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.EventInternal
    /* JADX INFO: renamed from: d */
    public EncodedPayload mo2796d() {
        return this.f5702c;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.EventInternal
    /* JADX INFO: renamed from: e */
    public long mo2797e() {
        return this.f5703d;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        return this.f5700a.equals(eventInternal.mo2798g()) && ((num = this.f5701b) != null ? num.equals(eventInternal.mo2795c()) : eventInternal.mo2795c() == null) && this.f5702c.equals(eventInternal.mo2796d()) && this.f5703d == eventInternal.mo2797e() && this.f5704e == eventInternal.mo2799h() && this.f5705f.equals(eventInternal.mo2794b());
    }

    @Override // p007c.p190n.p194b.p195a.p198j.EventInternal
    /* JADX INFO: renamed from: g */
    public String mo2798g() {
        return this.f5700a;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.EventInternal
    /* JADX INFO: renamed from: h */
    public long mo2799h() {
        return this.f5704e;
    }

    public int hashCode() {
        int iHashCode = (this.f5700a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5701b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f5702c.hashCode()) * 1000003;
        long j2 = this.f5703d;
        int i = (iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f5704e;
        return ((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f5705f.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("EventInternal{transportName=");
        sbM1556G.append(this.f5700a);
        sbM1556G.append(", code=");
        sbM1556G.append(this.f5701b);
        sbM1556G.append(", encodedPayload=");
        sbM1556G.append(this.f5702c);
        sbM1556G.append(", eventMillis=");
        sbM1556G.append(this.f5703d);
        sbM1556G.append(", uptimeMillis=");
        sbM1556G.append(this.f5704e);
        sbM1556G.append(", autoMetadata=");
        sbM1556G.append(this.f5705f);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
