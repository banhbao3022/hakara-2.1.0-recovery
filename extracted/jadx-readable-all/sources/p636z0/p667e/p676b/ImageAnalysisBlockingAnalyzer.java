package p636z0.p667e.p676b;

import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.p677v1.ImageReaderProxy;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;

/* JADX INFO: renamed from: z0.e.b.c1, reason: use source file name */
/* JADX INFO: compiled from: ImageAnalysisBlockingAnalyzer.java */
/* JADX INFO: loaded from: classes.dex */
public final class ImageAnalysisBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {

    /* JADX INFO: renamed from: z0.e.b.c1$a */
    /* JADX INFO: compiled from: ImageAnalysisBlockingAnalyzer.java */
    public class a implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageProxy f35879a;

        public a(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, ImageProxy imageProxy) {
            this.f35879a = imageProxy;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(Void r1) {
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
            this.f35879a.close();
        }
    }

    @Override // p636z0.p667e.p676b.ImageAnalysisAbstractAnalyzer
    /* JADX INFO: renamed from: b */
    public ImageProxy mo15255b(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.mo15270f();
    }

    @Override // p636z0.p667e.p676b.ImageAnalysisAbstractAnalyzer
    /* JADX INFO: renamed from: d */
    public void mo15257d() {
    }

    @Override // p636z0.p667e.p676b.ImageAnalysisAbstractAnalyzer
    /* JADX INFO: renamed from: e */
    public void mo15258e(ImageProxy imageProxy) {
        ListenableFuture<Void> listenableFutureM15256c = m15256c(imageProxy);
        a aVar = new a(this, imageProxy);
        listenableFutureM15256c.mo11664h(new Futures2.d(listenableFutureM15256c, aVar), C7462a.m14569f());
    }
}
