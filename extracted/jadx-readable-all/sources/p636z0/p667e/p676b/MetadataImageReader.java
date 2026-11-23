package p636z0.p667e.p676b;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p636z0.p667e.p668a.p670e.Camera2CameraCaptureResult;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallback;
import p636z0.p667e.p676b.p677v1.CameraCaptureResult;
import p636z0.p667e.p676b.p677v1.ImageReaderProxy;
import p636z0.p667e.p676b.p681w1.CameraCaptureResultImageInfo;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.b.k1, reason: use source file name */
/* JADX INFO: compiled from: MetadataImageReader.java */
/* JADX INFO: loaded from: classes.dex */
public class MetadataImageReader implements ImageReaderProxy, ForwardingImageProxy.a {

    /* JADX INFO: renamed from: a */
    public final Object f35919a;

    /* JADX INFO: renamed from: b */
    public CameraCaptureCallback f35920b;

    /* JADX INFO: renamed from: c */
    public ImageReaderProxy.a f35921c;

    /* JADX INFO: renamed from: d */
    public boolean f35922d;

    /* JADX INFO: renamed from: e */
    public final ImageReaderProxy f35923e;

    /* JADX INFO: renamed from: f */
    public ImageReaderProxy.a f35924f;

    /* JADX INFO: renamed from: g */
    public Executor f35925g;

    /* JADX INFO: renamed from: h */
    public final LongSparseArray<ImageInfo> f35926h;

    /* JADX INFO: renamed from: i */
    public final LongSparseArray<ImageProxy> f35927i;

    /* JADX INFO: renamed from: j */
    public int f35928j;

    /* JADX INFO: renamed from: k */
    public final List<ImageProxy> f35929k;

    /* JADX INFO: renamed from: l */
    public final List<ImageProxy> f35930l;

    /* JADX INFO: renamed from: z0.e.b.k1$a */
    /* JADX INFO: compiled from: MetadataImageReader.java */
    public class a extends CameraCaptureCallback {
        public a() {
        }

        @Override // p636z0.p667e.p676b.p677v1.CameraCaptureCallback
        /* JADX INFO: renamed from: b */
        public void mo15131b(CameraCaptureResult cameraCaptureResult) {
            MetadataImageReader metadataImageReader = MetadataImageReader.this;
            synchronized (metadataImageReader.f35919a) {
                if (metadataImageReader.f35922d) {
                    return;
                }
                Camera2CameraCaptureResult camera2CameraCaptureResult = (Camera2CameraCaptureResult) cameraCaptureResult;
                metadataImageReader.f35926h.put(camera2CameraCaptureResult.m15101a(), new CameraCaptureResultImageInfo(camera2CameraCaptureResult));
                metadataImageReader.m15279i();
            }
        }
    }

    public MetadataImageReader(int i, int i2, int i3, int i4) {
        AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(i, i2, i3, i4));
        this.f35919a = new Object();
        this.f35920b = new a();
        this.f35921c = new ImageReaderProxy.a() { // from class: z0.e.b.s
            @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy.a
            /* JADX INFO: renamed from: a */
            public final void mo15254a(ImageReaderProxy imageReaderProxy) {
                MetadataImageReader metadataImageReader = this.f36008a;
                synchronized (metadataImageReader.f35919a) {
                    if (metadataImageReader.f35922d) {
                        return;
                    }
                    int i5 = 0;
                    do {
                        ImageProxy imageProxyMo15270f = null;
                        try {
                            imageProxyMo15270f = imageReaderProxy.mo15270f();
                            if (imageProxyMo15270f != null) {
                                i5++;
                                metadataImageReader.f35927i.put(imageProxyMo15270f.mo15262Z().mo15260b(), imageProxyMo15270f);
                                metadataImageReader.m15279i();
                            }
                        } catch (IllegalStateException e) {
                            Logger8.m15272a("MetadataImageReader", "Failed to acquire next image.", e);
                        }
                        if (imageProxyMo15270f == null) {
                            break;
                        }
                    } while (i5 < imageReaderProxy.mo15269e());
                }
            }
        };
        this.f35922d = false;
        this.f35926h = new LongSparseArray<>();
        this.f35927i = new LongSparseArray<>();
        this.f35930l = new ArrayList();
        this.f35923e = androidImageReaderProxy;
        this.f35928j = 0;
        this.f35929k = new ArrayList(mo15269e());
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: a */
    public Surface mo15266a() {
        Surface surfaceMo15266a;
        synchronized (this.f35919a) {
            surfaceMo15266a = this.f35923e.mo15266a();
        }
        return surfaceMo15266a;
    }

    @Override // p636z0.p667e.p676b.ForwardingImageProxy.a
    /* JADX INFO: renamed from: b */
    public void mo15277b(ImageProxy imageProxy) {
        synchronized (this.f35919a) {
            synchronized (this.f35919a) {
                int iIndexOf = this.f35929k.indexOf(imageProxy);
                if (iIndexOf >= 0) {
                    this.f35929k.remove(iIndexOf);
                    int i = this.f35928j;
                    if (iIndexOf <= i) {
                        this.f35928j = i - 1;
                    }
                }
                this.f35930l.remove(imageProxy);
            }
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: c */
    public ImageProxy mo15267c() {
        synchronized (this.f35919a) {
            if (this.f35929k.isEmpty()) {
                return null;
            }
            if (this.f35928j >= this.f35929k.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f35929k.size() - 1; i++) {
                if (!this.f35930l.contains(this.f35929k.get(i))) {
                    arrayList.add(this.f35929k.get(i));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ImageProxy) it.next()).close();
            }
            int size = this.f35929k.size() - 1;
            this.f35928j = size;
            List<ImageProxy> list = this.f35929k;
            this.f35928j = size + 1;
            ImageProxy imageProxy = list.get(size);
            this.f35930l.add(imageProxy);
            return imageProxy;
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    public void close() {
        synchronized (this.f35919a) {
            if (this.f35922d) {
                return;
            }
            Iterator it = new ArrayList(this.f35929k).iterator();
            while (it.hasNext()) {
                ((ImageProxy) it.next()).close();
            }
            this.f35929k.clear();
            this.f35923e.close();
            this.f35922d = true;
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: d */
    public void mo15268d() {
        synchronized (this.f35919a) {
            this.f35924f = null;
            this.f35925g = null;
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: e */
    public int mo15269e() {
        int iMo15269e;
        synchronized (this.f35919a) {
            iMo15269e = this.f35923e.mo15269e();
        }
        return iMo15269e;
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: f */
    public ImageProxy mo15270f() {
        synchronized (this.f35919a) {
            if (this.f35929k.isEmpty()) {
                return null;
            }
            if (this.f35928j >= this.f35929k.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            List<ImageProxy> list = this.f35929k;
            int i = this.f35928j;
            this.f35928j = i + 1;
            ImageProxy imageProxy = list.get(i);
            this.f35930l.add(imageProxy);
            return imageProxy;
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: g */
    public void mo15271g(ImageReaderProxy.a aVar, Executor executor) {
        synchronized (this.f35919a) {
            Objects.requireNonNull(aVar);
            this.f35924f = aVar;
            Objects.requireNonNull(executor);
            this.f35925g = executor;
            this.f35923e.mo15271g(this.f35921c, executor);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m15278h(SettableImageProxy settableImageProxy) {
        final ImageReaderProxy.a aVar;
        Executor executor;
        synchronized (this.f35919a) {
            aVar = null;
            if (this.f35929k.size() < mo15269e()) {
                settableImageProxy.m15456a(this);
                this.f35929k.add(settableImageProxy);
                aVar = this.f35924f;
                executor = this.f35925g;
            } else {
                Logger8.m15272a("TAG", "Maximum image number reached.", null);
                settableImageProxy.close();
                executor = null;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: z0.e.b.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        MetadataImageReader metadataImageReader = this.f36024f;
                        ImageReaderProxy.a aVar2 = aVar;
                        Objects.requireNonNull(metadataImageReader);
                        aVar2.mo15254a(metadataImageReader);
                    }
                });
            } else {
                aVar.mo15254a(this);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15279i() {
        synchronized (this.f35919a) {
            for (int size = this.f35926h.size() - 1; size >= 0; size--) {
                ImageInfo imageInfoValueAt = this.f35926h.valueAt(size);
                long jMo15260b = imageInfoValueAt.mo15260b();
                ImageProxy imageProxy = this.f35927i.get(jMo15260b);
                if (imageProxy != null) {
                    this.f35927i.remove(jMo15260b);
                    this.f35926h.removeAt(size);
                    m15278h(new SettableImageProxy(imageProxy, imageInfoValueAt));
                }
            }
            m15280j();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15280j() {
        synchronized (this.f35919a) {
            if (this.f35927i.size() != 0 && this.f35926h.size() != 0) {
                Long lValueOf = Long.valueOf(this.f35927i.keyAt(0));
                Long lValueOf2 = Long.valueOf(this.f35926h.keyAt(0));
                C8162a.m16060e(lValueOf2.equals(lValueOf) ? false : true);
                if (lValueOf2.longValue() > lValueOf.longValue()) {
                    for (int size = this.f35927i.size() - 1; size >= 0; size--) {
                        if (this.f35927i.keyAt(size) < lValueOf2.longValue()) {
                            this.f35927i.valueAt(size).close();
                            this.f35927i.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f35926h.size() - 1; size2 >= 0; size2--) {
                        if (this.f35926h.keyAt(size2) < lValueOf.longValue()) {
                            this.f35926h.removeAt(size2);
                        }
                    }
                }
            }
        }
    }
}
