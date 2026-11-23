package p636z0.p667e.p676b;

import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import java.util.Objects;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallback;
import p636z0.p667e.p676b.p677v1.CaptureProcessor;
import p636z0.p667e.p676b.p677v1.CaptureStage;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.ImageReaderProxy;
import p636z0.p667e.p676b.p677v1.SingleImageProxyBundle;
import p636z0.p667e.p676b.p677v1.p678r1.p679b.HandlerScheduledExecutorService;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;

/* JADX INFO: renamed from: z0.e.b.m1, reason: use source file name */
/* JADX INFO: compiled from: ProcessingSurface.java */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessingSurface extends DeferrableSurface {

    /* JADX INFO: renamed from: i */
    public final Object f35951i = new Object();

    /* JADX INFO: renamed from: j */
    public final ImageReaderProxy.a f35952j;

    /* JADX INFO: renamed from: k */
    public boolean f35953k;

    /* JADX INFO: renamed from: l */
    public final Size f35954l;

    /* JADX INFO: renamed from: m */
    public final MetadataImageReader f35955m;

    /* JADX INFO: renamed from: n */
    public final Surface f35956n;

    /* JADX INFO: renamed from: o */
    public final Handler f35957o;

    /* JADX INFO: renamed from: p */
    public final CaptureStage f35958p;

    /* JADX INFO: renamed from: q */
    public final CaptureProcessor f35959q;

    /* JADX INFO: renamed from: r */
    public final CameraCaptureCallback f35960r;

    /* JADX INFO: renamed from: s */
    public final DeferrableSurface f35961s;

    /* JADX INFO: renamed from: t */
    public String f35962t;

    /* JADX INFO: renamed from: z0.e.b.m1$a */
    /* JADX INFO: compiled from: ProcessingSurface.java */
    public class a implements FutureCallback<Surface> {
        public a() {
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(Surface surface) {
            Surface surface2 = surface;
            synchronized (ProcessingSurface.this.f35951i) {
                ProcessingSurface.this.f35959q.m15367a(surface2, 1);
            }
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
            Logger8.m15273b("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th);
        }
    }

    public ProcessingSurface(int i, int i2, int i3, Handler handler, CaptureStage captureStage, CaptureProcessor captureProcessor, DeferrableSurface deferrableSurface, String str) {
        ImageReaderProxy.a aVar = new ImageReaderProxy.a() { // from class: z0.e.b.x
            @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy.a
            /* JADX INFO: renamed from: a */
            public final void mo15254a(ImageReaderProxy imageReaderProxy) {
                ProcessingSurface processingSurface = this.f36354a;
                synchronized (processingSurface.f35951i) {
                    processingSurface.m15289h(imageReaderProxy);
                }
            }
        };
        this.f35952j = aVar;
        this.f35953k = false;
        Size size = new Size(i, i2);
        this.f35954l = size;
        this.f35957o = handler;
        HandlerScheduledExecutorService handlerScheduledExecutorService = new HandlerScheduledExecutorService(handler);
        MetadataImageReader metadataImageReader = new MetadataImageReader(i, i2, i3, 2);
        this.f35955m = metadataImageReader;
        metadataImageReader.mo15271g(aVar, handlerScheduledExecutorService);
        this.f35956n = metadataImageReader.mo15266a();
        this.f35960r = metadataImageReader.f35920b;
        this.f35959q = captureProcessor;
        captureProcessor.m15368b(size);
        this.f35958p = captureStage;
        this.f35961s = deferrableSurface;
        this.f35962t = str;
        ListenableFuture<Surface> listenableFutureM15390c = deferrableSurface.m15390c();
        a aVar2 = new a();
        listenableFutureM15390c.mo11664h(new Futures2.d(listenableFutureM15390c, aVar2), C7462a.m14569f());
        m15391d().mo11664h(new Runnable() { // from class: z0.e.b.w
            @Override // java.lang.Runnable
            public final void run() {
                ProcessingSurface processingSurface = this.f36312f;
                synchronized (processingSurface.f35951i) {
                    if (processingSurface.f35953k) {
                        return;
                    }
                    processingSurface.f35955m.close();
                    processingSurface.f35956n.release();
                    processingSurface.f35961s.m15388a();
                    processingSurface.f35953k = true;
                }
            }
        }, C7462a.m14569f());
    }

    @Override // p636z0.p667e.p676b.p677v1.DeferrableSurface
    /* JADX INFO: renamed from: g */
    public ListenableFuture<Surface> mo15288g() {
        ListenableFuture<Surface> listenableFutureM15428c;
        synchronized (this.f35951i) {
            listenableFutureM15428c = Futures2.m15428c(this.f35956n);
        }
        return listenableFutureM15428c;
    }

    /* JADX INFO: renamed from: h */
    public void m15289h(ImageReaderProxy imageReaderProxy) {
        ImageProxy imageProxyMo15270f;
        if (this.f35953k) {
            return;
        }
        try {
            imageProxyMo15270f = imageReaderProxy.mo15270f();
        } catch (IllegalStateException e) {
            Logger8.m15273b("ProcessingSurfaceTextur", "Failed to acquire next image.", e);
            imageProxyMo15270f = null;
        }
        if (imageProxyMo15270f == null) {
            return;
        }
        ImageInfo imageInfoMo15262Z = imageProxyMo15270f.mo15262Z();
        if (imageInfoMo15262Z == null) {
            imageProxyMo15270f.close();
            return;
        }
        Integer numM15397a = imageInfoMo15262Z.mo15259a().m15397a(this.f35962t);
        if (numM15397a == null) {
            imageProxyMo15270f.close();
            return;
        }
        Objects.requireNonNull(this.f35958p);
        if (numM15397a.intValue() == 0) {
            SingleImageProxyBundle singleImageProxyBundle = new SingleImageProxyBundle(imageProxyMo15270f, this.f35962t);
            this.f35959q.m15369c(singleImageProxyBundle);
            singleImageProxyBundle.f36177a.close();
        } else {
            Logger8.m15276e("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + numM15397a, null);
            imageProxyMo15270f.close();
        }
    }
}
