package p636z0.p667e.p676b;

import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p667e.p676b.p677v1.ImageReaderProxy;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.ImmediateFuture;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p725k.p735h.OperationCanceledException;

/* JADX INFO: renamed from: z0.e.b.b1, reason: use source file name */
/* JADX INFO: compiled from: ImageAnalysisAbstractAnalyzer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageAnalysisAbstractAnalyzer implements ImageReaderProxy.a {

    /* JADX INFO: renamed from: a */
    public ImageAnalysis.a f35871a;

    /* JADX INFO: renamed from: b */
    public volatile int f35872b;

    /* JADX INFO: renamed from: c */
    public Executor f35873c;

    /* JADX INFO: renamed from: d */
    public final Object f35874d = new Object();

    /* JADX INFO: renamed from: e */
    public boolean f35875e = true;

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy.a
    /* JADX INFO: renamed from: a */
    public void mo15254a(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyMo15255b = mo15255b(imageReaderProxy);
            if (imageProxyMo15255b != null) {
                mo15258e(imageProxyMo15255b);
            }
        } catch (IllegalStateException e) {
            Logger8.m15273b("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract ImageProxy mo15255b(ImageReaderProxy imageReaderProxy);

    /* JADX INFO: renamed from: c */
    public ListenableFuture<Void> m15256c(final ImageProxy imageProxy) {
        final Executor executor;
        final ImageAnalysis.a aVar;
        synchronized (this.f35874d) {
            executor = this.f35873c;
            aVar = this.f35871a;
        }
        return (aVar == null || executor == null) ? new ImmediateFuture.a(new OperationCanceledException("No analyzer or executor currently set.")) : C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.q
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(final CallbackToFutureAdapter callbackToFutureAdapter) {
                final ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.f35988a;
                Executor executor2 = executor;
                final ImageProxy imageProxy2 = imageProxy;
                final ImageAnalysis.a aVar2 = aVar;
                Objects.requireNonNull(imageAnalysisAbstractAnalyzer);
                executor2.execute(new Runnable() { // from class: z0.e.b.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer2 = imageAnalysisAbstractAnalyzer;
                        ImageProxy imageProxy3 = imageProxy2;
                        ImageAnalysis.a aVar3 = aVar2;
                        CallbackToFutureAdapter callbackToFutureAdapter2 = callbackToFutureAdapter;
                        if (!imageAnalysisAbstractAnalyzer2.f35875e) {
                            callbackToFutureAdapter2.m15661c(new OperationCanceledException("ImageAnalysis is detached"));
                        } else {
                            aVar3.mo2064a(new SettableImageProxy(imageProxy3, new AutoValue_ImmutableImageInfo(imageProxy3.mo15262Z().mo15259a(), imageProxy3.mo15262Z().mo15260b(), imageAnalysisAbstractAnalyzer2.f35872b)));
                            callbackToFutureAdapter2.m15659a(null);
                        }
                    }
                });
                return "analyzeImage";
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo15257d();

    /* JADX INFO: renamed from: e */
    public abstract void mo15258e(ImageProxy imageProxy);
}
