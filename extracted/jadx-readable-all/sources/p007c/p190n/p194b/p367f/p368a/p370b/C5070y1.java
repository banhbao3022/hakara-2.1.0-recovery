package p007c.p190n.p194b.p367f.p368a.p370b;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.f.a.b.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5070y1 {

    /* JADX INFO: renamed from: a */
    public final String f26021a;

    /* JADX INFO: renamed from: b */
    public final long f26022b;

    /* JADX INFO: renamed from: c */
    public final int f26023c;

    /* JADX INFO: renamed from: d */
    public final boolean f26024d;

    /* JADX INFO: renamed from: e */
    public final boolean f26025e;

    /* JADX INFO: renamed from: f */
    public final byte[] f26026f;

    public C5070y1() {
    }

    public C5070y1(String str, long j2, int i, boolean z, boolean z2, byte[] bArr) {
        this.f26021a = str;
        this.f26022b = j2;
        this.f26023c = i;
        this.f26024d = z;
        this.f26025e = z2;
        this.f26026f = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11522a() {
        String str = this.f26021a;
        if (str == null) {
            return false;
        }
        return str.endsWith("/");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11523b() {
        return this.f26023c == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5070y1) {
            C5070y1 c5070y1 = (C5070y1) obj;
            String str = this.f26021a;
            if (str != null ? str.equals(c5070y1.f26021a) : c5070y1.f26021a == null) {
                if (this.f26022b == c5070y1.f26022b && this.f26023c == c5070y1.f26023c && this.f26024d == c5070y1.f26024d && this.f26025e == c5070y1.f26025e && Arrays.equals(this.f26026f, c5070y1.f26026f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26021a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f26022b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f26023c) * 1000003) ^ (true != this.f26024d ? 1237 : 1231)) * 1000003) ^ (true == this.f26025e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f26026f);
    }

    public String toString() {
        String str = this.f26021a;
        long j2 = this.f26022b;
        int i = this.f26023c;
        boolean z = this.f26024d;
        boolean z2 = this.f26025e;
        String string = Arrays.toString(this.f26026f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(string).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return outline.m1552C(sb, ", headerBytes=", string, "}");
    }
}
