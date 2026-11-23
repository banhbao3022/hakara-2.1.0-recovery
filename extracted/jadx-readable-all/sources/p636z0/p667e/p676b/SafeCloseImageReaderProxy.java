package p636z0.p667e.p676b;

import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.Executor;
import p636z0.p667e.p676b.p677v1.ImageReaderProxy;

/* JADX INFO: renamed from: z0.e.b.n1, reason: use source file name */
/* JADX INFO: compiled from: SafeCloseImageReaderProxy.java */
/* JADX INFO: loaded from: classes.dex */
public class SafeCloseImageReaderProxy implements ImageReaderProxy {

    /* JADX INFO: renamed from: d */
    public final ImageReaderProxy f35971d;

    /* JADX INFO: renamed from: e */
    public final Surface f35972e;

    /* JADX INFO: renamed from: a */
    public final Object f35968a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile int f35969b = 0;

    /* JADX INFO: renamed from: c */
    public volatile boolean f35970c = false;

    /* JADX INFO: renamed from: f */
    public ForwardingImageProxy.a f35973f = new ForwardingImageProxy.a() { // from class: z0.e.b.z
        @Override // p636z0.p667e.p676b.ForwardingImageProxy.a
        /* JADX INFO: renamed from: b */
        public final void mo15277b(ImageProxy imageProxy) {
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f36366a;
            synchronized (safeCloseImageReaderProxy.f35968a) {
                safeCloseImageReaderProxy.f35969b--;
                if (safeCloseImageReaderProxy.f35970c && safeCloseImageReaderProxy.f35969b == 0) {
                    safeCloseImageReaderProxy.close();
                }
            }
        }
    };

    public SafeCloseImageReaderProxy(ImageReaderProxy imageReaderProxy) {
        this.f35971d = imageReaderProxy;
        this.f35972e = imageReaderProxy.mo15266a();
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: a */
    public Surface mo15266a() {
        Surface surfaceMo15266a;
        synchronized (this.f35968a) {
            surfaceMo15266a = this.f35971d.mo15266a();
        }
        return surfaceMo15266a;
    }

    /* JADX INFO: renamed from: b */
    public final ImageProxy m15291b(ImageProxy imageProxy) {
        synchronized (this.f35968a) {
            try {
                if (imageProxy == null) {
                    return null;
                }
                this.f35969b++;
                SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxy);
                singleCloseImageProxy.m15456a(this.f35973f);
                return singleCloseImageProxy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: c */
    public ImageProxy mo15267c() {
        ImageProxy imageProxyM15291b;
        synchronized (this.f35968a) {
            imageProxyM15291b = m15291b(this.f35971d.mo15267c());
        }
        return imageProxyM15291b;
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    public void close() {
        synchronized (this.f35968a) {
            Surface surface = this.f35972e;
            if (surface != null) {
                surface.release();
            }
            this.f35971d.close();
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: d */
    public void mo15268d() {
        synchronized (this.f35968a) {
            this.f35971d.mo15268d();
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: e */
    public int mo15269e() {
        int iMo15269e;
        synchronized (this.f35968a) {
            iMo15269e = this.f35971d.mo15269e();
        }
        return iMo15269e;
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: f */
    public ImageProxy mo15270f() {
        ImageProxy imageProxyM15291b;
        synchronized (this.f35968a) {
            imageProxyM15291b = m15291b(this.f35971d.mo15270f());
        }
        return imageProxyM15291b;
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: g */
    public void mo15271g(final ImageReaderProxy.a aVar, Executor executor) {
        synchronized (this.f35968a) {
            this.f35971d.mo15271g(new ImageReaderProxy.a() { // from class: z0.e.b.y
                @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy.a
                /* JADX INFO: renamed from: a */
                public final void mo15254a(ImageReaderProxy imageReaderProxy) {
                    SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f36364a;
                    ImageReaderProxy.a aVar2 = aVar;
                    Objects.requireNonNull(safeCloseImageReaderProxy);
                    aVar2.mo15254a(safeCloseImageReaderProxy);
                }
            }, executor);
        }
    }
}
