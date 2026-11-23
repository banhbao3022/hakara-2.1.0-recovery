package p636z0.p774z.p775b;

/* JADX INFO: renamed from: z0.z.b.f, reason: use source file name */
/* JADX INFO: compiled from: BatchingListUpdateCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {

    /* JADX INFO: renamed from: a */
    public final ListUpdateCallback f39171a;

    /* JADX INFO: renamed from: b */
    public int f39172b = 0;

    /* JADX INFO: renamed from: c */
    public int f39173c = -1;

    /* JADX INFO: renamed from: d */
    public int f39174d = -1;

    /* JADX INFO: renamed from: e */
    public Object f39175e = null;

    public BatchingListUpdateCallback(ListUpdateCallback listUpdateCallback) {
        this.f39171a = listUpdateCallback;
    }

    @Override // p636z0.p774z.p775b.ListUpdateCallback
    /* JADX INFO: renamed from: a */
    public void mo16976a(int i, int i2) {
        m17000e();
        this.f39171a.mo16976a(i, i2);
    }

    @Override // p636z0.p774z.p775b.ListUpdateCallback
    /* JADX INFO: renamed from: b */
    public void mo16977b(int i, int i2) {
        int i3;
        if (this.f39172b == 1 && i >= (i3 = this.f39173c)) {
            int i4 = this.f39174d;
            if (i <= i3 + i4) {
                this.f39174d = i4 + i2;
                this.f39173c = Math.min(i, i3);
                return;
            }
        }
        m17000e();
        this.f39173c = i;
        this.f39174d = i2;
        this.f39172b = 1;
    }

    @Override // p636z0.p774z.p775b.ListUpdateCallback
    /* JADX INFO: renamed from: c */
    public void mo16978c(int i, int i2) {
        int i3;
        if (this.f39172b == 2 && (i3 = this.f39173c) >= i && i3 <= i + i2) {
            this.f39174d += i2;
            this.f39173c = i;
        } else {
            m17000e();
            this.f39173c = i;
            this.f39174d = i2;
            this.f39172b = 2;
        }
    }

    @Override // p636z0.p774z.p775b.ListUpdateCallback
    /* JADX INFO: renamed from: d */
    public void mo16979d(int i, int i2, Object obj) {
        int i3;
        if (this.f39172b == 3) {
            int i4 = this.f39173c;
            int i5 = this.f39174d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f39175e == obj) {
                this.f39173c = Math.min(i, i4);
                this.f39174d = Math.max(i5 + i4, i3) - this.f39173c;
                return;
            }
        }
        m17000e();
        this.f39173c = i;
        this.f39174d = i2;
        this.f39175e = obj;
        this.f39172b = 3;
    }

    /* JADX INFO: renamed from: e */
    public void m17000e() {
        int i = this.f39172b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f39171a.mo16977b(this.f39173c, this.f39174d);
        } else if (i == 2) {
            this.f39171a.mo16978c(this.f39173c, this.f39174d);
        } else if (i == 3) {
            this.f39171a.mo16979d(this.f39173c, this.f39174d, this.f39175e);
        }
        this.f39175e = null;
        this.f39172b = 0;
    }
}
