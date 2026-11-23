package p636z0.p774z.p775b;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.b, reason: use source file name */
/* JADX INFO: compiled from: AdapterListUpdateCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class AdapterListUpdateCallback implements ListUpdateCallback {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.AbstractC0152e f39136a;

    public AdapterListUpdateCallback(RecyclerView.AbstractC0152e abstractC0152e) {
        this.f39136a = abstractC0152e;
    }

    @Override // p636z0.p774z.p775b.ListUpdateCallback
    /* JADX INFO: renamed from: a */
    public void mo16976a(int i, int i2) {
        this.f39136a.f1023a.m674c(i, i2);
    }

    @Override // p636z0.p774z.p775b.ListUpdateCallback
    /* JADX INFO: renamed from: b */
    public void mo16977b(int i, int i2) {
        this.f39136a.f1023a.m676e(i, i2);
    }

    @Override // p636z0.p774z.p775b.ListUpdateCallback
    /* JADX INFO: renamed from: c */
    public void mo16978c(int i, int i2) {
        this.f39136a.f1023a.m677f(i, i2);
    }

    @Override // p636z0.p774z.p775b.ListUpdateCallback
    /* JADX INFO: renamed from: d */
    public void mo16979d(int i, int i2, Object obj) {
        this.f39136a.f1023a.m675d(i, i2, obj);
    }
}
