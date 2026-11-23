package p636z0.p667e.p676b;

/* JADX INFO: renamed from: z0.e.b.p1, reason: use source file name */
/* JADX INFO: compiled from: SingleCloseImageProxy.java */
/* JADX INFO: loaded from: classes.dex */
public final class SingleCloseImageProxy extends ForwardingImageProxy {

    /* JADX INFO: renamed from: h */
    public boolean f35987h;

    public SingleCloseImageProxy(ImageProxy imageProxy) {
        super(imageProxy);
        this.f35987h = false;
    }

    @Override // p636z0.p667e.p676b.ForwardingImageProxy, p636z0.p667e.p676b.ImageProxy, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f35987h) {
            this.f35987h = true;
            super.close();
        }
    }
}
