package p007c.p190n.p438f.p446m.p447b;

/* JADX INFO: renamed from: c.n.f.m.b.b, reason: use source file name */
/* JADX INFO: compiled from: BarcodeRow.java */
/* JADX INFO: loaded from: classes.dex */
public final class BarcodeRow {

    /* JADX INFO: renamed from: a */
    public final byte[] f27749a;

    /* JADX INFO: renamed from: b */
    public int f27750b = 0;

    public BarcodeRow(int i) {
        this.f27749a = new byte[i];
    }

    /* JADX INFO: renamed from: a */
    public void m12401a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f27750b;
            this.f27750b = i3 + 1;
            this.f27749a[i3] = z ? (byte) 1 : (byte) 0;
        }
    }
}
