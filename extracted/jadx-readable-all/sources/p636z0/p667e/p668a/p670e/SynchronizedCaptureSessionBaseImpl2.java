package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p670e.p671w1.CameraCaptureSessionCompat;
import p636z0.p667e.p668a.p670e.p671w1.CameraDeviceCompat;
import p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureChain;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.ImmediateFuture;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.ListFuture;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p693h.p694a.ResolvableFuture;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.a.e.p1, reason: use source file name */
/* JADX INFO: compiled from: SynchronizedCaptureSessionBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class SynchronizedCaptureSessionBaseImpl2 extends SynchronizedCaptureSession.a implements SynchronizedCaptureSession, SynchronizedCaptureSessionOpener.b {

    /* JADX INFO: renamed from: b */
    public final CaptureSessionRepository f35638b;

    /* JADX INFO: renamed from: c */
    public final Handler f35639c;

    /* JADX INFO: renamed from: d */
    public final Executor f35640d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f35641e;

    /* JADX INFO: renamed from: f */
    public SynchronizedCaptureSession.a f35642f;

    /* JADX INFO: renamed from: g */
    public CameraCaptureSessionCompat f35643g;

    /* JADX INFO: renamed from: h */
    public ListenableFuture<Void> f35644h;

    /* JADX INFO: renamed from: i */
    public CallbackToFutureAdapter<Void> f35645i;

    /* JADX INFO: renamed from: j */
    public ListenableFuture<List<Surface>> f35646j;

    /* JADX INFO: renamed from: a */
    public final Object f35637a = new Object();

    /* JADX INFO: renamed from: k */
    public boolean f35647k = false;

    /* JADX INFO: renamed from: l */
    public boolean f35648l = false;

    public SynchronizedCaptureSessionBaseImpl2(CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f35638b = captureSessionRepository;
        this.f35639c = handler;
        this.f35640d = executor;
        this.f35641e = scheduledExecutorService;
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionOpener.b
    /* JADX INFO: renamed from: a */
    public ListenableFuture<List<Surface>> mo15188a(final List<DeferrableSurface> list, final long j2) {
        synchronized (this.f35637a) {
            if (this.f35648l) {
                return new ImmediateFuture.a(new CancellationException("Opener is disabled"));
            }
            final boolean z = false;
            final Executor executor = this.f35640d;
            final ScheduledExecutorService scheduledExecutorService = this.f35641e;
            final ArrayList arrayList = new ArrayList();
            Iterator<DeferrableSurface> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m15390c());
            }
            FutureChain futureChainM15425c = FutureChain.m15423a(C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.v1.g
                @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
                /* JADX INFO: renamed from: a */
                public final Object mo15078a(final CallbackToFutureAdapter callbackToFutureAdapter) {
                    List list2 = arrayList;
                    ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                    final Executor executor2 = executor;
                    final long j3 = j2;
                    boolean z2 = z;
                    final ListenableFuture listenableFutureM15432g = Futures2.m15432g(list2);
                    ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService2.schedule(new Runnable() { // from class: z0.e.b.v1.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            Executor executor3 = executor2;
                            final ListenableFuture listenableFuture = listenableFutureM15432g;
                            final CallbackToFutureAdapter callbackToFutureAdapter2 = callbackToFutureAdapter;
                            final long j4 = j3;
                            executor3.execute(new Runnable() { // from class: z0.e.b.v1.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ListenableFuture listenableFuture2 = listenableFuture;
                                    CallbackToFutureAdapter callbackToFutureAdapter3 = callbackToFutureAdapter2;
                                    long j5 = j4;
                                    if (listenableFuture2.isDone()) {
                                        return;
                                    }
                                    callbackToFutureAdapter3.m15661c(new TimeoutException(outline.m1594p("Cannot complete surfaceList within ", j5)));
                                    listenableFuture2.cancel(true);
                                }
                            });
                        }
                    }, j3, TimeUnit.MILLISECONDS);
                    Runnable runnable = new Runnable() { // from class: z0.e.b.v1.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenableFutureM15432g.cancel(true);
                        }
                    };
                    ResolvableFuture<Void> resolvableFuture = callbackToFutureAdapter.f36710c;
                    if (resolvableFuture != null) {
                        resolvableFuture.mo11664h(runnable, executor2);
                    }
                    ((ListFuture) listenableFutureM15432g).mo11664h(new Futures2.d(listenableFutureM15432g, new DeferrableSurfaces(z2, callbackToFutureAdapter, scheduledFutureSchedule)), executor2);
                    return "surfaceList";
                }
            })).m15425c(new AsyncFunction() { // from class: z0.e.a.e.c0
                @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35432a;
                    List list2 = list;
                    List list3 = (List) obj;
                    Objects.requireNonNull(synchronizedCaptureSessionBaseImpl2);
                    Logger8.m15272a("SyncCaptureSessionBase", "[" + synchronizedCaptureSessionBaseImpl2 + "] getSurface...done", null);
                    if (list3.contains(null)) {
                        return new ImmediateFuture.a(new DeferrableSurface.a("Surface closed", (DeferrableSurface) list2.get(list3.indexOf(null))));
                    }
                    return list3.isEmpty() ? new ImmediateFuture.a(new IllegalArgumentException("Unable to open capture session without surfaces")) : Futures2.m15428c(list3);
                }
            }, this.f35640d);
            this.f35646j = futureChainM15425c;
            return Futures2.m15429d(futureChainM15425c);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: b */
    public SynchronizedCaptureSession.a mo15146b() {
        return this;
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: c */
    public int mo15147c(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C8162a.m16063h(this.f35643g, "Need to call openCaptureSession before using this API.");
        CameraCaptureSessionCompat cameraCaptureSessionCompat = this.f35643g;
        return cameraCaptureSessionCompat.f35714a.mo15208b(list, this.f35640d, captureCallback);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    public void close() {
        C8162a.m16063h(this.f35643g, "Need to call openCaptureSession before using this API.");
        CaptureSessionRepository captureSessionRepository = this.f35638b;
        synchronized (captureSessionRepository.f35471b) {
            captureSessionRepository.f35473d.add(this);
        }
        this.f35643g.m15206a().close();
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: d */
    public CameraCaptureSessionCompat mo15148d() {
        Objects.requireNonNull(this.f35643g);
        return this.f35643g;
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: e */
    public void mo15149e() throws CameraAccessException {
        C8162a.m16063h(this.f35643g, "Need to call openCaptureSession before using this API.");
        this.f35643g.m15206a().abortCaptures();
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: f */
    public CameraDevice mo15150f() {
        Objects.requireNonNull(this.f35643g);
        return this.f35643g.m15206a().getDevice();
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: g */
    public int mo15151g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C8162a.m16063h(this.f35643g, "Need to call openCaptureSession before using this API.");
        CameraCaptureSessionCompat cameraCaptureSessionCompat = this.f35643g;
        return cameraCaptureSessionCompat.f35714a.mo15207a(captureRequest, this.f35640d, captureCallback);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: h */
    public void mo15152h() throws CameraAccessException {
        C8162a.m16063h(this.f35643g, "Need to call openCaptureSession before using this API.");
        this.f35643g.m15206a().stopRepeating();
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionOpener.b
    /* JADX INFO: renamed from: i */
    public ListenableFuture<Void> mo15189i(CameraDevice cameraDevice, final SessionConfigurationCompat sessionConfigurationCompat) {
        synchronized (this.f35637a) {
            if (this.f35648l) {
                return new ImmediateFuture.a(new CancellationException("Opener is disabled"));
            }
            CaptureSessionRepository captureSessionRepository = this.f35638b;
            synchronized (captureSessionRepository.f35471b) {
                captureSessionRepository.f35474e.add(this);
            }
            final CameraDeviceCompat cameraDeviceCompat = new CameraDeviceCompat(cameraDevice, this.f35639c);
            ListenableFuture<Void> listenableFutureM15540a = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.a.e.b0
                @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
                /* JADX INFO: renamed from: a */
                public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter) {
                    String str;
                    SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35427a;
                    CameraDeviceCompat cameraDeviceCompat2 = cameraDeviceCompat;
                    SessionConfigurationCompat sessionConfigurationCompat2 = sessionConfigurationCompat;
                    synchronized (synchronizedCaptureSessionBaseImpl2.f35637a) {
                        C8162a.m16065j(synchronizedCaptureSessionBaseImpl2.f35645i == null, "The openCaptureSessionCompleter can only set once!");
                        synchronizedCaptureSessionBaseImpl2.f35645i = callbackToFutureAdapter;
                        cameraDeviceCompat2.f35768a.mo15210a(sessionConfigurationCompat2);
                        str = "openCaptureSession[session=" + synchronizedCaptureSessionBaseImpl2 + "]";
                    }
                    return str;
                }
            });
            this.f35644h = listenableFutureM15540a;
            return Futures2.m15429d(listenableFutureM15540a);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: j */
    public ListenableFuture<Void> mo15153j(String str) {
        return Futures2.m15428c(null);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: k */
    public void mo15154k(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.f35642f.mo15154k(synchronizedCaptureSession);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: l */
    public void mo15155l(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.f35642f.mo15155l(synchronizedCaptureSession);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: m */
    public void mo15092m(final SynchronizedCaptureSession synchronizedCaptureSession) {
        ListenableFuture<Void> listenableFuture;
        synchronized (this.f35637a) {
            if (this.f35647k) {
                listenableFuture = null;
            } else {
                this.f35647k = true;
                C8162a.m16063h(this.f35644h, "Need to call openCaptureSession before using this API.");
                listenableFuture = this.f35644h;
            }
        }
        if (listenableFuture != null) {
            listenableFuture.mo11664h(new Runnable() { // from class: z0.e.a.e.d0
                @Override // java.lang.Runnable
                public final void run() {
                    SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = this.f35437f;
                    SynchronizedCaptureSession synchronizedCaptureSession2 = synchronizedCaptureSession;
                    CaptureSessionRepository captureSessionRepository = synchronizedCaptureSessionBaseImpl2.f35638b;
                    synchronized (captureSessionRepository.f35471b) {
                        captureSessionRepository.f35472c.remove(synchronizedCaptureSessionBaseImpl2);
                        captureSessionRepository.f35473d.remove(synchronizedCaptureSessionBaseImpl2);
                    }
                    synchronizedCaptureSessionBaseImpl2.f35642f.mo15092m(synchronizedCaptureSession2);
                }
            }, C7462a.m14569f());
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: n */
    public void mo15093n(SynchronizedCaptureSession synchronizedCaptureSession) {
        CaptureSessionRepository captureSessionRepository = this.f35638b;
        synchronized (captureSessionRepository.f35471b) {
            captureSessionRepository.f35474e.remove(this);
        }
        this.f35642f.mo15093n(synchronizedCaptureSession);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: o */
    public void mo15094o(SynchronizedCaptureSession synchronizedCaptureSession) {
        CaptureSessionRepository captureSessionRepository = this.f35638b;
        synchronized (captureSessionRepository.f35471b) {
            captureSessionRepository.f35472c.add(this);
            captureSessionRepository.f35474e.remove(this);
        }
        this.f35642f.mo15094o(synchronizedCaptureSession);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: p */
    public void mo15095p(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.f35642f.mo15095p(synchronizedCaptureSession);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: q */
    public void mo15156q(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        this.f35642f.mo15156q(synchronizedCaptureSession, surface);
    }

    /* JADX INFO: renamed from: r */
    public boolean m15190r() {
        boolean z;
        synchronized (this.f35637a) {
            z = this.f35644h != null;
        }
        return z;
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionOpener.b
    public boolean stop() {
        boolean z;
        ListenableFuture<List<Surface>> listenableFuture = null;
        try {
            synchronized (this.f35637a) {
                if (!this.f35648l) {
                    ListenableFuture<List<Surface>> listenableFuture2 = this.f35646j;
                    listenableFuture = listenableFuture2 != null ? listenableFuture2 : null;
                    this.f35648l = true;
                }
                z = !m15190r();
            }
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            return z;
        } catch (Throwable th) {
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            throw th;
        }
    }
}
