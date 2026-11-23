package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureChain;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p693h.p694a.CallbackToFutureAdapter4;

/* JADX INFO: renamed from: z0.e.a.e.q1, reason: use source file name */
/* JADX INFO: compiled from: SynchronizedCaptureSessionImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class SynchronizedCaptureSessionImpl extends SynchronizedCaptureSessionBaseImpl2 {

    /* JADX INFO: renamed from: m */
    public final Object f35652m;

    /* JADX INFO: renamed from: n */
    public final Set<String> f35653n;

    /* JADX INFO: renamed from: o */
    public final ListenableFuture<Void> f35654o;

    /* JADX INFO: renamed from: p */
    public CallbackToFutureAdapter<Void> f35655p;

    /* JADX INFO: renamed from: q */
    public final ListenableFuture<Void> f35656q;

    /* JADX INFO: renamed from: r */
    public CallbackToFutureAdapter<Void> f35657r;

    /* JADX INFO: renamed from: s */
    public List<DeferrableSurface> f35658s;

    /* JADX INFO: renamed from: t */
    public ListenableFuture<Void> f35659t;

    /* JADX INFO: renamed from: u */
    public ListenableFuture<List<Surface>> f35660u;

    /* JADX INFO: renamed from: v */
    public boolean f35661v;

    /* JADX INFO: renamed from: w */
    public final CameraCaptureSession.CaptureCallback f35662w;

    /* JADX INFO: renamed from: z0.e.a.e.q1$a */
    /* JADX INFO: compiled from: SynchronizedCaptureSessionImpl.java */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            CallbackToFutureAdapter<Void> callbackToFutureAdapter = SynchronizedCaptureSessionImpl.this.f35655p;
            if (callbackToFutureAdapter != null) {
                callbackToFutureAdapter.f36711d = true;
                CallbackToFutureAdapter4<Void> callbackToFutureAdapter4 = callbackToFutureAdapter.f36709b;
                if (callbackToFutureAdapter4 != null && callbackToFutureAdapter4.f36713g.cancel(true)) {
                    callbackToFutureAdapter.m15660b();
                }
                SynchronizedCaptureSessionImpl.this.f35655p = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
            CallbackToFutureAdapter<Void> callbackToFutureAdapter = SynchronizedCaptureSessionImpl.this.f35655p;
            if (callbackToFutureAdapter != null) {
                callbackToFutureAdapter.m15659a(null);
                SynchronizedCaptureSessionImpl.this.f35655p = null;
            }
        }
    }

    public SynchronizedCaptureSessionImpl(Set<String> set, CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(captureSessionRepository, executor, scheduledExecutorService, handler);
        this.f35652m = new Object();
        this.f35662w = new a();
        this.f35653n = set;
        if (set.contains("wait_for_request")) {
            this.f35654o = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.a.e.i0
                @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
                /* JADX INFO: renamed from: a */
                public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter) {
                    SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl = this.f35493a;
                    synchronizedCaptureSessionImpl.f35655p = callbackToFutureAdapter;
                    return "StartStreamingFuture[session=" + synchronizedCaptureSessionImpl + "]";
                }
            });
        } else {
            this.f35654o = Futures2.m15428c(null);
        }
        if (set.contains("deferrableSurface_close")) {
            this.f35656q = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.a.e.e0
                @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
                /* JADX INFO: renamed from: a */
                public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter) {
                    SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl = this.f35441a;
                    synchronizedCaptureSessionImpl.f35657r = callbackToFutureAdapter;
                    return "ClosingDeferrableSurfaceFuture[session=" + synchronizedCaptureSessionImpl + "]";
                }
            });
        } else {
            this.f35656q = Futures2.m15428c(null);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionBaseImpl2, p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionOpener.b
    /* JADX INFO: renamed from: a */
    public ListenableFuture<List<Surface>> mo15188a(final List<DeferrableSurface> list, final long j2) {
        ListenableFuture<List<Surface>> listenableFutureM15429d;
        HashMap map;
        synchronized (this.f35652m) {
            try {
                this.f35658s = list;
                List<ListenableFuture<Void>> listEmptyList = Collections.emptyList();
                if (this.f35653n.contains("force_close")) {
                    CaptureSessionRepository captureSessionRepository = this.f35638b;
                    synchronized (captureSessionRepository.f35471b) {
                        captureSessionRepository.f35475f.put(this, list);
                        map = new HashMap(captureSessionRepository.f35475f);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getKey() != this && !Collections.disjoint((Collection) entry.getValue(), this.f35658s)) {
                            arrayList.add((SynchronizedCaptureSession) entry.getKey());
                        }
                    }
                    listEmptyList = m15193u("deferrableSurface_close", arrayList);
                }
                FutureChain futureChainM15425c = FutureChain.m15423a(Futures2.m15432g(listEmptyList)).m15425c(new AsyncFunction() { // from class: z0.e.a.e.g0
                    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return this.f35479a.m15196x(list, j2, (List) obj);
                    }
                }, this.f35640d);
                this.f35660u = futureChainM15425c;
                listenableFutureM15429d = Futures2.m15429d(futureChainM15425c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return listenableFutureM15429d;
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionBaseImpl2, p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    public void close() {
        m15192t("Session call close()");
        if (this.f35653n.contains("wait_for_request")) {
            synchronized (this.f35652m) {
                if (!this.f35661v) {
                    this.f35654o.cancel(true);
                }
            }
        }
        this.f35654o.mo11664h(new Runnable() { // from class: z0.e.a.e.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f35469f.m15194v();
            }
        }, this.f35640d);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionBaseImpl2, p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: g */
    public int mo15151g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        int iMo15151g;
        if (!this.f35653n.contains("wait_for_request")) {
            return super.mo15151g(captureRequest, captureCallback);
        }
        synchronized (this.f35652m) {
            this.f35661v = true;
            iMo15151g = super.mo15151g(captureRequest, new Camera2CaptureCallbacks(Arrays.asList(this.f35662w, captureCallback)));
        }
        return iMo15151g;
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionBaseImpl2, p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionOpener.b
    /* JADX INFO: renamed from: i */
    public ListenableFuture<Void> mo15189i(final CameraDevice cameraDevice, final SessionConfigurationCompat sessionConfigurationCompat) {
        ArrayList arrayList;
        ListenableFuture<Void> listenableFutureM15429d;
        synchronized (this.f35652m) {
            CaptureSessionRepository captureSessionRepository = this.f35638b;
            synchronized (captureSessionRepository.f35471b) {
                arrayList = new ArrayList(captureSessionRepository.f35473d);
            }
            FutureChain futureChainM15425c = FutureChain.m15423a(Futures2.m15432g(m15193u("wait_for_request", arrayList))).m15425c(new AsyncFunction() { // from class: z0.e.a.e.h0
                @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.f35484a.m15195w(cameraDevice, sessionConfigurationCompat, (List) obj);
                }
            }, C7462a.m14569f());
            this.f35659t = futureChainM15425c;
            listenableFutureM15429d = Futures2.m15429d(futureChainM15425c);
        }
        return listenableFutureM15429d;
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionBaseImpl2, p636z0.p667e.p668a.p670e.SynchronizedCaptureSession
    /* JADX INFO: renamed from: j */
    public ListenableFuture<Void> mo15153j(String str) {
        str.hashCode();
        if (str.equals("wait_for_request")) {
            return Futures2.m15429d(this.f35654o);
        }
        return !str.equals("deferrableSurface_close") ? Futures2.m15428c(null) : Futures2.m15429d(this.f35656q);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionBaseImpl2, p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: m */
    public void mo15092m(SynchronizedCaptureSession synchronizedCaptureSession) {
        m15191s();
        m15192t("onClosed()");
        super.mo15092m(synchronizedCaptureSession);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionBaseImpl2, p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: o */
    public void mo15094o(SynchronizedCaptureSession synchronizedCaptureSession) {
        ArrayList arrayList;
        SynchronizedCaptureSession synchronizedCaptureSession2;
        ArrayList arrayList2;
        SynchronizedCaptureSession synchronizedCaptureSession3;
        m15192t("Session onConfigured()");
        if (this.f35653n.contains("force_close")) {
            LinkedHashSet<SynchronizedCaptureSession> linkedHashSet = new LinkedHashSet();
            CaptureSessionRepository captureSessionRepository = this.f35638b;
            synchronized (captureSessionRepository.f35471b) {
                arrayList2 = new ArrayList(captureSessionRepository.f35474e);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext() && (synchronizedCaptureSession3 = (SynchronizedCaptureSession) it.next()) != synchronizedCaptureSession) {
                linkedHashSet.add(synchronizedCaptureSession3);
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession4 : linkedHashSet) {
                synchronizedCaptureSession4.mo15146b().mo15093n(synchronizedCaptureSession4);
            }
        }
        super.mo15094o(synchronizedCaptureSession);
        if (this.f35653n.contains("force_close")) {
            LinkedHashSet<SynchronizedCaptureSession> linkedHashSet2 = new LinkedHashSet();
            CaptureSessionRepository captureSessionRepository2 = this.f35638b;
            synchronized (captureSessionRepository2.f35471b) {
                arrayList = new ArrayList(captureSessionRepository2.f35472c);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it2.next()) != synchronizedCaptureSession) {
                linkedHashSet2.add(synchronizedCaptureSession2);
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession5 : linkedHashSet2) {
                synchronizedCaptureSession5.mo15146b().mo15092m(synchronizedCaptureSession5);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m15191s() {
        synchronized (this.f35652m) {
            if (this.f35658s == null) {
                m15192t("deferrableSurface == null, maybe forceClose, skip close");
                return;
            }
            if (this.f35653n.contains("deferrableSurface_close")) {
                Iterator<DeferrableSurface> it = this.f35658s.iterator();
                while (it.hasNext()) {
                    it.next().m15388a();
                }
                m15192t("deferrableSurface closed");
                m15197y();
            }
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionBaseImpl2, p636z0.p667e.p668a.p670e.SynchronizedCaptureSessionOpener.b
    public boolean stop() {
        boolean zStop;
        synchronized (this.f35652m) {
            if (m15190r()) {
                m15191s();
            } else {
                ListenableFuture<Void> listenableFuture = this.f35659t;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
                ListenableFuture<List<Surface>> listenableFuture2 = this.f35660u;
                if (listenableFuture2 != null) {
                    listenableFuture2.cancel(true);
                }
                m15197y();
            }
            zStop = super.stop();
        }
        return zStop;
    }

    /* JADX INFO: renamed from: t */
    public void m15192t(String str) {
        Logger8.m15272a("SyncCaptureSessionImpl", "[" + this + "] " + str, null);
    }

    /* JADX INFO: renamed from: u */
    public final List<ListenableFuture<Void>> m15193u(String str, List<SynchronizedCaptureSession> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SynchronizedCaptureSession> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo15153j(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m15194v() {
        m15192t("Session call super.close()");
        super.close();
    }

    /* JADX INFO: renamed from: w */
    public /* synthetic */ ListenableFuture m15195w(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return super.mo15189i(cameraDevice, sessionConfigurationCompat);
    }

    /* JADX INFO: renamed from: x */
    public /* synthetic */ ListenableFuture m15196x(List list, long j2, List list2) {
        return super.mo15188a(list, j2);
    }

    /* JADX INFO: renamed from: y */
    public void m15197y() {
        if (this.f35653n.contains("deferrableSurface_close")) {
            CaptureSessionRepository captureSessionRepository = this.f35638b;
            synchronized (captureSessionRepository.f35471b) {
                captureSessionRepository.f35475f.remove(this);
            }
            CallbackToFutureAdapter<Void> callbackToFutureAdapter = this.f35657r;
            if (callbackToFutureAdapter != null) {
                callbackToFutureAdapter.m15659a(null);
            }
        }
    }
}
