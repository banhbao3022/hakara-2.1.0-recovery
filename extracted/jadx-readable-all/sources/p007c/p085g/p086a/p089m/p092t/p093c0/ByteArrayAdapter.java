package p007c.p085g.p086a.p089m.p092t.p093c0;

/* JADX INFO: renamed from: c.g.a.m.t.c0.f, reason: use source file name */
/* JADX INFO: compiled from: ByteArrayAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayAdapter implements ArrayAdapterInterface<byte[]> {
    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayAdapterInterface
    /* JADX INFO: renamed from: a */
    public int mo1738a() {
        return 1;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayAdapterInterface
    /* JADX INFO: renamed from: b */
    public int mo1739b(byte[] bArr) {
        return bArr.length;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayAdapterInterface
    public byte[] newArray(int i) {
        return new byte[i];
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayAdapterInterface
    /* JADX INFO: renamed from: w0 */
    public String mo1740w0() {
        return "ByteArrayPool";
    }
}
