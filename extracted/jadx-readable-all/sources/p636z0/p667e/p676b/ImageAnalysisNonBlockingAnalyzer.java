package p636z0.p667e.p676b;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.p677v1.ImageReaderProxy;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;

/* JADX INFO: renamed from: z0.e.b.d1, reason: use source file name */
/* JADX INFO: compiled from: ImageAnalysisNonBlockingAnalyzer.java */
/* JADX INFO: loaded from: classes.dex */
public final class ImageAnalysisNonBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {

    /* JADX INFO: renamed from: f */
    public final Executor f35884f;

    /* JADX INFO: renamed from: g */
    public final Object f35885g = new Object();

    /* JADX INFO: renamed from: h */
    public ImageProxy f35886h;

    /* JADX INFO: renamed from: i */
    public b f35887i;

    /* JADX INFO: renamed from: z0.e.b.d1$a */
    /* JADX INFO: compiled from: ImageAnalysisNonBlockingAnalyzer.java */
    public class a implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f35888a;

        public a(ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer, b bVar) {
            this.f35888a = bVar;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(Void r1) {
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
            this.f35888a.close();
        }
    }

    /* JADX INFO: renamed from: z0.e.b.d1$b */
    /* JADX INFO: compiled from: ImageAnalysisNonBlockingAnalyzer.java */
    public static class b extends ForwardingImageProxy {

        /* JADX INFO: renamed from: h */
        public final WeakReference<ImageAnalysisNonBlockingAnalyzer> f35889h;

        public b(ImageProxy imageProxy, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
            super(imageProxy);
            this.f35889h = new WeakReference<>(imageAnalysisNonBlockingAnalyzer);
            m15456a(new ForwardingImageProxy.a() { // from class: z0.e.b.r
                @Override // p636z0.p667e.p676b.ForwardingImageProxy.a
                /* JADX INFO: renamed from: b */
                public final void mo15277b(ImageProxy imageProxy2) {
                    final ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer2 = this.f36005a.f35889h.get();
                    if (imageAnalysisNonBlockingAnalyzer2 != null) {
                        imageAnalysisNonBlockingAnalyzer2.f35884f.execute(new Runnable() { // from class: z0.e.b.h0
                            @Override // java.lang.Runnable
                            public final void run() {
                                ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer3 = imageAnalysisNonBlockingAnalyzer2;
                                synchronized (imageAnalysisNonBlockingAnalyzer3.f35885g) {
                                    imageAnalysisNonBlockingAnalyzer3.f35887i = null;
                                    ImageProxy imageProxy3 = imageAnalysisNonBlockingAnalyzer3.f35886h;
                                    if (imageProxy3 != null) {
                                        imageAnalysisNonBlockingAnalyzer3.f35886h = null;
                                        imageAnalysisNonBlockingAnalyzer3.mo15258e(imageProxy3);
                                    }
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public ImageAnalysisNonBlockingAnalyzer(Executor executor) {
        this.f35884f = executor;
    }

    @Override // p636z0.p667e.p676b.ImageAnalysisAbstractAnalyzer
    /* JADX INFO: renamed from: b */
    public ImageProxy mo15255b(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.mo15267c();
    }

    @Override // p636z0.p667e.p676b.ImageAnalysisAbstractAnalyzer
    /* JADX INFO: renamed from: d */
    public void mo15257d() {
        synchronized (this.f35885g) {
            ImageProxy imageProxy = this.f35886h;
            if (imageProxy != null) {
                imageProxy.close();
                this.f35886h = null;
            }
        }
    }

    @Override // p636z0.p667e.p676b.ImageAnalysisAbstractAnalyzer
    /* JADX INFO: renamed from: e */
    public void mo15258e(ImageProxy imageProxy) {
        synchronized (this.f35885g) {
            if (!this.f35875e) {
                imageProxy.close();
                return;
            }
            if (this.f35887i != null) {
                if (imageProxy.mo15262Z().mo15260b() <= this.f35887i.mo15262Z().mo15260b()) {
                    imageProxy.close();
                } else {
                    ImageProxy imageProxy2 = this.f35886h;
                    if (imageProxy2 != null) {
                        imageProxy2.close();
                    }
                    this.f35886h = imageProxy;
                }
                return;
            }
            b bVar = new b(imageProxy, this);
            this.f35887i = bVar;
            ListenableFuture<Void> listenableFutureM15256c = m15256c(bVar);
            a aVar = new a(this, bVar);
            listenableFutureM15256c.mo11664h(new Futures2.d(listenableFutureM15256c, aVar), C7462a.m14569f());
        }
    }
}
