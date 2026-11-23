package p636z0.p759s;

import androidx.lifecycle.LiveData;
import p636z0.p655c.p656a.p657a.ArchTaskExecutor;

/* JADX INFO: renamed from: z0.s.t, reason: use source file name */
/* JADX INFO: compiled from: MutableLiveData.java */
/* JADX INFO: loaded from: classes.dex */
public class MutableLiveData<T> extends LiveData<T> {
    public MutableLiveData(T t) {
        super(t);
    }

    @Override // androidx.lifecycle.LiveData
    /* JADX INFO: renamed from: j */
    public void mo427j(T t) {
        LiveData.m418a("setValue");
        this.f774h++;
        this.f772f = t;
        m420c(null);
    }

    /* JADX INFO: renamed from: k */
    public void m16742k(T t) {
        boolean z;
        synchronized (this.f768b) {
            z = this.f773g == LiveData.f767a;
            this.f773g = t;
        }
        if (z) {
            ArchTaskExecutor.m15023d().f35304c.mo15026c(this.f777k);
        }
    }

    public MutableLiveData() {
    }
}
