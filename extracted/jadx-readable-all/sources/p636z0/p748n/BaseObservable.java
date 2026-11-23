package p636z0.p748n;

/* JADX INFO: renamed from: z0.n.a, reason: use source file name */
/* JADX INFO: compiled from: BaseObservable.java */
/* JADX INFO: loaded from: classes.dex */
public class BaseObservable implements Observable {

    /* JADX INFO: renamed from: a */
    public transient PropertyChangeRegistry f38193a;

    /* JADX INFO: renamed from: a */
    public void m16396a(int i) {
        synchronized (this) {
            PropertyChangeRegistry propertyChangeRegistry = this.f38193a;
            if (propertyChangeRegistry == null) {
                return;
            }
            propertyChangeRegistry.m16398b(this, i, null);
        }
    }
}
