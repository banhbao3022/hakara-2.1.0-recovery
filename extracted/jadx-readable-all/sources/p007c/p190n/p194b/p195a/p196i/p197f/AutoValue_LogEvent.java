package p007c.p190n.p194b.p195a.p196i.p197f;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.i.f.f, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_LogEvent.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_LogEvent extends LogEvent {

    /* JADX INFO: renamed from: a */
    public final long f5610a;

    /* JADX INFO: renamed from: b */
    public final Integer f5611b;

    /* JADX INFO: renamed from: c */
    public final long f5612c;

    /* JADX INFO: renamed from: d */
    public final byte[] f5613d;

    /* JADX INFO: renamed from: e */
    public final String f5614e;

    /* JADX INFO: renamed from: f */
    public final long f5615f;

    /* JADX INFO: renamed from: g */
    public final NetworkConnectionInfo f5616g;

    /* JADX INFO: renamed from: c.n.b.a.i.f.f$b */
    /* JADX INFO: compiled from: AutoValue_LogEvent.java */
    public static final class b extends LogEvent.a {

        /* JADX INFO: renamed from: a */
        public Long f5617a;

        /* JADX INFO: renamed from: b */
        public Integer f5618b;

        /* JADX INFO: renamed from: c */
        public Long f5619c;

        /* JADX INFO: renamed from: d */
        public byte[] f5620d;

        /* JADX INFO: renamed from: e */
        public String f5621e;

        /* JADX INFO: renamed from: f */
        public Long f5622f;

        /* JADX INFO: renamed from: g */
        public NetworkConnectionInfo f5623g;
    }

    public AutoValue_LogEvent(long j2, Integer num, long j3, byte[] bArr, String str, long j4, NetworkConnectionInfo networkConnectionInfo, a aVar) {
        this.f5610a = j2;
        this.f5611b = num;
        this.f5612c = j3;
        this.f5613d = bArr;
        this.f5614e = str;
        this.f5615f = j4;
        this.f5616g = networkConnectionInfo;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogEvent
    /* JADX INFO: renamed from: a */
    public Integer mo2776a() {
        return this.f5611b;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogEvent
    /* JADX INFO: renamed from: b */
    public long mo2777b() {
        return this.f5610a;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogEvent
    /* JADX INFO: renamed from: c */
    public long mo2778c() {
        return this.f5612c;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogEvent
    /* JADX INFO: renamed from: d */
    public NetworkConnectionInfo mo2779d() {
        return this.f5616g;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogEvent
    /* JADX INFO: renamed from: e */
    public byte[] mo2780e() {
        return this.f5613d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f5610a == logEvent.mo2777b() && ((num = this.f5611b) != null ? num.equals(logEvent.mo2776a()) : logEvent.mo2776a() == null) && this.f5612c == logEvent.mo2778c()) {
            if (Arrays.equals(this.f5613d, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).f5613d : logEvent.mo2780e()) && ((str = this.f5614e) != null ? str.equals(logEvent.mo2781f()) : logEvent.mo2781f() == null) && this.f5615f == logEvent.mo2782g()) {
                NetworkConnectionInfo networkConnectionInfo = this.f5616g;
                if (networkConnectionInfo == null) {
                    if (logEvent.mo2779d() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(logEvent.mo2779d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogEvent
    /* JADX INFO: renamed from: f */
    public String mo2781f() {
        return this.f5614e;
    }

    @Override // p007c.p190n.p194b.p195a.p196i.p197f.LogEvent
    /* JADX INFO: renamed from: g */
    public long mo2782g() {
        return this.f5615f;
    }

    public int hashCode() {
        long j2 = this.f5610a;
        int i = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f5611b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j3 = this.f5612c;
        int iHashCode2 = (((((i ^ iHashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f5613d)) * 1000003;
        String str = this.f5614e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f5615f;
        int i2 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f5616g;
        return i2 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("LogEvent{eventTimeMs=");
        sbM1556G.append(this.f5610a);
        sbM1556G.append(", eventCode=");
        sbM1556G.append(this.f5611b);
        sbM1556G.append(", eventUptimeMs=");
        sbM1556G.append(this.f5612c);
        sbM1556G.append(", sourceExtension=");
        sbM1556G.append(Arrays.toString(this.f5613d));
        sbM1556G.append(", sourceExtensionJsonProto3=");
        sbM1556G.append(this.f5614e);
        sbM1556G.append(", timezoneOffsetSeconds=");
        sbM1556G.append(this.f5615f);
        sbM1556G.append(", networkConnectionInfo=");
        sbM1556G.append(this.f5616g);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
