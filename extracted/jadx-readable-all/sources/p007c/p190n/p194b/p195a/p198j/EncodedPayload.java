package p007c.p190n.p194b.p195a.p198j;

import java.util.Arrays;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.Encoding;

/* JADX INFO: renamed from: c.n.b.a.j.f, reason: use source file name */
/* JADX INFO: compiled from: EncodedPayload.java */
/* JADX INFO: loaded from: classes.dex */
public final class EncodedPayload {

    /* JADX INFO: renamed from: a */
    public final Encoding f5735a;

    /* JADX INFO: renamed from: b */
    public final byte[] f5736b;

    public EncodedPayload(Encoding encoding, byte[] bArr) {
        Objects.requireNonNull(encoding, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f5735a = encoding;
        this.f5736b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.f5735a.equals(encodedPayload.f5735a)) {
            return Arrays.equals(this.f5736b, encodedPayload.f5736b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5735a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5736b);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("EncodedPayload{encoding=");
        sbM1556G.append(this.f5735a);
        sbM1556G.append(", bytes=[...]}");
        return sbM1556G.toString();
    }
}
