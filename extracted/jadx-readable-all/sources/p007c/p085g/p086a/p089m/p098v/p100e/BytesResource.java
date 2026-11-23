package p007c.p085g.p086a.p089m.p098v.p100e;

import java.util.Objects;
import p007c.p085g.p086a.p089m.p092t.Resource2;

/* JADX INFO: renamed from: c.g.a.m.v.e.b, reason: use source file name */
/* JADX INFO: compiled from: BytesResource.java */
/* JADX INFO: loaded from: classes.dex */
public class BytesResource implements Resource2<byte[]> {

    /* JADX INFO: renamed from: f */
    public final byte[] f3604f;

    public BytesResource(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f3604f = bArr;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: b */
    public void mo1830b() {
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: c */
    public int mo1831c() {
        return this.f3604f.length;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: d */
    public Class<byte[]> mo1832d() {
        return byte[].class;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    public byte[] get() {
        return this.f3604f;
    }
}
