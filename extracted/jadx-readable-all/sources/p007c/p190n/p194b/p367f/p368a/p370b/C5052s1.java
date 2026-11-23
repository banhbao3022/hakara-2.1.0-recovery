package p007c.p190n.p194b.p367f.p368a.p370b;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.f.a.b.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5052s1 {

    /* JADX INFO: renamed from: a */
    public final int f25950a;

    /* JADX INFO: renamed from: b */
    public final String f25951b;

    /* JADX INFO: renamed from: c */
    public final long f25952c;

    /* JADX INFO: renamed from: d */
    public final long f25953d;

    /* JADX INFO: renamed from: e */
    public final int f25954e;

    public C5052s1() {
    }

    public C5052s1(int i, String str, long j2, long j3, int i2) {
        this.f25950a = i;
        this.f25951b = str;
        this.f25952c = j2;
        this.f25953d = j3;
        this.f25954e = i2;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5052s1) {
            C5052s1 c5052s1 = (C5052s1) obj;
            if (this.f25950a == c5052s1.f25950a && ((str = this.f25951b) != null ? str.equals(c5052s1.f25951b) : c5052s1.f25951b == null) && this.f25952c == c5052s1.f25952c && this.f25953d == c5052s1.f25953d && this.f25954e == c5052s1.f25954e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f25950a ^ 1000003) * 1000003;
        String str = this.f25951b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f25952c;
        long j3 = this.f25953d;
        return ((((((i ^ iHashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f25954e;
    }

    public String toString() {
        int i = this.f25950a;
        String str = this.f25951b;
        long j2 = this.f25952c;
        long j3 = this.f25953d;
        int i2 = this.f25954e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        outline.m1570U(sb, ", fileOffset=", j2, ", remainingBytes=");
        sb.append(j3);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
