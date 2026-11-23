package p007c.p085g.p086a.p089m.p092t.p093c0;

/* JADX INFO: renamed from: c.g.a.m.t.c0.h, reason: use source file name */
/* JADX INFO: compiled from: IntegerArrayAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class IntegerArrayAdapter implements ArrayAdapterInterface<int[]> {
    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayAdapterInterface
    /* JADX INFO: renamed from: a */
    public int mo1738a() {
        return 4;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayAdapterInterface
    /* JADX INFO: renamed from: b */
    public int mo1739b(int[] iArr) {
        return iArr.length;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayAdapterInterface
    public int[] newArray(int i) {
        return new int[i];
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayAdapterInterface
    /* JADX INFO: renamed from: w0 */
    public String mo1740w0() {
        return "IntegerArrayPool";
    }
}
