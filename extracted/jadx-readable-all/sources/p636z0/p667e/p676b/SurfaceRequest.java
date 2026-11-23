package p636z0.p667e.p676b;

import android.util.Size;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.b.q1, reason: use source file name */
/* JADX INFO: compiled from: SurfaceRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceRequest {

    /* JADX INFO: renamed from: a */
    public final Size f35992a;

    /* JADX INFO: renamed from: b */
    public final CameraInternal2 f35993b;

    /* JADX INFO: renamed from: c */
    public final ListenableFuture<Surface> f35994c;

    /* JADX INFO: renamed from: d */
    public final CallbackToFutureAdapter<Surface> f35995d;

    /* JADX INFO: renamed from: e */
    public final ListenableFuture<Void> f35996e;

    /* JADX INFO: renamed from: f */
    public final CallbackToFutureAdapter<Void> f35997f;

    /* JADX INFO: renamed from: g */
    public final DeferrableSurface f35998g;

    /* JADX INFO: renamed from: z0.e.b.q1$a */
    /* JADX INFO: compiled from: SurfaceRequest.java */
    public class a implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter f35999a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ListenableFuture f36000b;

        public a(SurfaceRequest surfaceRequest, CallbackToFutureAdapter callbackToFutureAdapter, ListenableFuture listenableFuture) {
            this.f35999a = callbackToFutureAdapter;
            this.f36000b = listenableFuture;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(Void r2) {
            C8162a.m16065j(this.f35999a.m15659a(null), null);
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
            if (th instanceof d) {
                C8162a.m16065j(this.f36000b.cancel(false), null);
            } else {
                C8162a.m16065j(this.f35999a.m15659a(null), null);
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.b.q1$b */
    /* JADX INFO: compiled from: SurfaceRequest.java */
    public class b extends DeferrableSurface {
        public b() {
        }

        @Override // p636z0.p667e.p676b.p677v1.DeferrableSurface
        /* JADX INFO: renamed from: g */
        public ListenableFuture<Surface> mo15288g() {
            return SurfaceRequest.this.f35994c;
        }
    }

    /* JADX INFO: renamed from: z0.e.b.q1$c */
    /* JADX INFO: compiled from: SurfaceRequest.java */
    public class c implements FutureCallback<Surface> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ListenableFuture f36002a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CallbackToFutureAdapter f36003b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f36004c;

        public c(SurfaceRequest surfaceRequest, ListenableFuture listenableFuture, CallbackToFutureAdapter callbackToFutureAdapter, String str) {
            this.f36002a = listenableFuture;
            this.f36003b = callbackToFutureAdapter;
            this.f36004c = str;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(Surface surface) {
            Futures2.m15430e(this.f36002a, this.f36003b);
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
            if (th instanceof CancellationException) {
                C8162a.m16065j(this.f36003b.m15661c(new d(outline.m1550A(new StringBuilder(), this.f36004c, " cancelled."), th)), null);
            } else {
                this.f36003b.m15659a(null);
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.b.q1$d */
    /* JADX INFO: compiled from: SurfaceRequest.java */
    public static final class d extends RuntimeException {
        public d(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: z0.e.b.q1$e */
    /* JADX INFO: compiled from: SurfaceRequest.java */
    public static abstract class e {
        /* JADX INFO: renamed from: a */
        public abstract int mo15286a();

        /* JADX INFO: renamed from: b */
        public abstract Surface mo15287b();
    }

    public SurfaceRequest(Size size, CameraInternal2 cameraInternal2, boolean z) {
        this.f35992a = size;
        this.f35993b = cameraInternal2;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        ListenableFuture listenableFutureM15540a = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.e0
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter) {
                AtomicReference atomicReference2 = atomicReference;
                String str2 = str;
                atomicReference2.set(callbackToFutureAdapter);
                return str2 + "-cancellation";
            }
        });
        CallbackToFutureAdapter<Void> callbackToFutureAdapter = (CallbackToFutureAdapter) atomicReference.get();
        Objects.requireNonNull(callbackToFutureAdapter);
        this.f35997f = callbackToFutureAdapter;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        ListenableFuture<Void> listenableFutureM15540a2 = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.f0
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter2) {
                AtomicReference atomicReference3 = atomicReference2;
                String str2 = str;
                atomicReference3.set(callbackToFutureAdapter2);
                return str2 + "-status";
            }
        });
        this.f35996e = listenableFutureM15540a2;
        listenableFutureM15540a2.mo11664h(new Futures2.d(listenableFutureM15540a2, new a(this, callbackToFutureAdapter, listenableFutureM15540a)), C7462a.m14569f());
        CallbackToFutureAdapter callbackToFutureAdapter2 = (CallbackToFutureAdapter) atomicReference2.get();
        Objects.requireNonNull(callbackToFutureAdapter2);
        final AtomicReference atomicReference3 = new AtomicReference(null);
        ListenableFuture<Surface> listenableFutureM15540a3 = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.d0
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter3) {
                AtomicReference atomicReference4 = atomicReference3;
                String str2 = str;
                atomicReference4.set(callbackToFutureAdapter3);
                return str2 + "-Surface";
            }
        });
        this.f35994c = listenableFutureM15540a3;
        CallbackToFutureAdapter<Surface> callbackToFutureAdapter3 = (CallbackToFutureAdapter) atomicReference3.get();
        Objects.requireNonNull(callbackToFutureAdapter3);
        this.f35995d = callbackToFutureAdapter3;
        b bVar = new b();
        this.f35998g = bVar;
        ListenableFuture<Void> listenableFutureM15391d = bVar.m15391d();
        listenableFutureM15540a3.mo11664h(new Futures2.d(listenableFutureM15540a3, new c(this, listenableFutureM15391d, callbackToFutureAdapter2, str)), C7462a.m14569f());
        listenableFutureM15391d.mo11664h(new Runnable() { // from class: z0.e.b.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f35878f.f35994c.cancel(true);
            }
        }, C7462a.m14569f());
    }
}
