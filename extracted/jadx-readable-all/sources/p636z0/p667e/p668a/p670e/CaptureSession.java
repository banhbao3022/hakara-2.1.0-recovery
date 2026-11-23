package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p669d.Camera2ImplConfig;
import p636z0.p667e.p668a.p669d.CameraEventCallback;
import p636z0.p667e.p668a.p669d.CameraEventCallbacks;
import p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat;
import p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat;
import p636z0.p667e.p668a.p670e.p671w1.p674q.StillCaptureFlow;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallback;
import p636z0.p667e.p676b.p677v1.CaptureConfig;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.MutableTagBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;
import p636z0.p667e.p676b.p677v1.SessionConfig;
import p636z0.p667e.p676b.p677v1.TagBundle;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureChain;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.ImmediateFuture;
import p636z0.p693h.p694a.CallbackToFutureAdapter;

/* JADX INFO: renamed from: z0.e.a.e.e1, reason: use source file name */
/* JADX INFO: compiled from: CaptureSession.java */
/* JADX INFO: loaded from: classes.dex */
public final class CaptureSession {

    /* JADX INFO: renamed from: e */
    public SynchronizedCaptureSessionOpener f35446e;

    /* JADX INFO: renamed from: f */
    public SynchronizedCaptureSession f35447f;

    /* JADX INFO: renamed from: g */
    public volatile SessionConfig f35448g;

    /* JADX INFO: renamed from: l */
    public c f35453l;

    /* JADX INFO: renamed from: m */
    public ListenableFuture<Void> f35454m;

    /* JADX INFO: renamed from: n */
    public CallbackToFutureAdapter<Void> f35455n;

    /* JADX INFO: renamed from: a */
    public final Object f35442a = new Object();

    /* JADX INFO: renamed from: b */
    public final List<CaptureConfig> f35443b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final CameraCaptureSession.CaptureCallback f35444c = new a(this);

    /* JADX INFO: renamed from: h */
    public volatile Config3 f35449h = OptionsBundle.f36110r;

    /* JADX INFO: renamed from: i */
    public CameraEventCallbacks f35450i = CameraEventCallbacks.m15074d();

    /* JADX INFO: renamed from: j */
    public Map<DeferrableSurface, Surface> f35451j = new HashMap();

    /* JADX INFO: renamed from: k */
    public List<DeferrableSurface> f35452k = Collections.emptyList();

    /* JADX INFO: renamed from: o */
    public final StillCaptureFlow f35456o = new StillCaptureFlow();

    /* JADX INFO: renamed from: d */
    public final d f35445d = new d();

    /* JADX INFO: renamed from: z0.e.a.e.e1$a */
    /* JADX INFO: compiled from: CaptureSession.java */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a(CaptureSession captureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.e1$b */
    /* JADX INFO: compiled from: CaptureSession.java */
    public class b implements FutureCallback<Void> {
        public b() {
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(Void r1) {
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
            CaptureSession.this.f35446e.m15198a();
            synchronized (CaptureSession.this.f35442a) {
                int iOrdinal = CaptureSession.this.f35453l.ordinal();
                if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                    Logger8.m15276e("CaptureSession", "Opening session with fail " + CaptureSession.this.f35453l, th);
                    CaptureSession.this.m15082b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.e1$c */
    /* JADX INFO: compiled from: CaptureSession.java */
    public enum c {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* JADX INFO: renamed from: z0.e.a.e.e1$d */
    /* JADX INFO: compiled from: CaptureSession.java */
    public final class d extends SynchronizedCaptureSession.a {
        public d() {
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: m */
        public void mo15092m(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f35442a) {
                if (CaptureSession.this.f35453l == c.UNINITIALIZED) {
                    throw new IllegalStateException("onClosed() should not be possible in state: " + CaptureSession.this.f35453l);
                }
                Logger8.m15272a("CaptureSession", "CameraCaptureSession.onClosed()", null);
                CaptureSession.this.m15082b();
            }
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: n */
        public void mo15093n(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f35442a) {
                switch (CaptureSession.this.f35453l) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                    case RELEASED:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.f35453l);
                    case OPENING:
                    case CLOSED:
                    case RELEASING:
                        CaptureSession.this.m15082b();
                        break;
                }
                Logger8.m15273b("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.f35453l, null);
            }
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: o */
        public void mo15094o(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f35442a) {
                switch (CaptureSession.this.f35453l) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                    case RELEASED:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.f35453l);
                    case OPENING:
                        CaptureSession captureSession = CaptureSession.this;
                        captureSession.f35453l = c.OPENED;
                        captureSession.f35447f = synchronizedCaptureSession;
                        if (captureSession.f35448g != null) {
                            CameraEventCallbacks.a aVarM15076c = CaptureSession.this.f35450i.m15076c();
                            ArrayList arrayList = new ArrayList();
                            Iterator<CameraEventCallback> it = aVarM15076c.f35422a.iterator();
                            while (it.hasNext()) {
                                Objects.requireNonNull(it.next());
                            }
                            if (!arrayList.isEmpty()) {
                                CaptureSession captureSession2 = CaptureSession.this;
                                captureSession2.m15083c(captureSession2.m15089j(arrayList));
                            }
                        }
                        Logger8.m15272a("CaptureSession", "Attempting to send capture request onConfigured", null);
                        CaptureSession.this.m15086f();
                        CaptureSession.this.m15085e();
                        break;
                    case CLOSED:
                        CaptureSession.this.f35447f = synchronizedCaptureSession;
                        break;
                    case RELEASING:
                        synchronizedCaptureSession.close();
                        break;
                }
                Logger8.m15272a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.f35453l, null);
            }
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: p */
        public void mo15095p(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f35442a) {
                if (CaptureSession.this.f35453l.ordinal() == 0) {
                    throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.f35453l);
                }
                Logger8.m15272a("CaptureSession", "CameraCaptureSession.onReady() " + CaptureSession.this.f35453l, null);
            }
        }
    }

    public CaptureSession() {
        this.f35453l = c.UNINITIALIZED;
        this.f35453l = c.INITIALIZED;
    }

    /* JADX INFO: renamed from: g */
    public static Config3 m15080g(List<CaptureConfig> list) {
        MutableOptionsBundle mutableOptionsBundleM15434y = MutableOptionsBundle.m15434y();
        Iterator<CaptureConfig> it = list.iterator();
        while (it.hasNext()) {
            Config3 config3 = it.next().f36144d;
            for (Config3.a<?> aVar : config3.mo15104c()) {
                Object objMo15105d = config3.mo15105d(aVar, null);
                if (mutableOptionsBundleM15434y.mo15103b(aVar)) {
                    Object objMo15105d2 = mutableOptionsBundleM15434y.mo15105d(aVar, null);
                    if (!Objects.equals(objMo15105d2, objMo15105d)) {
                        StringBuilder sbM1556G = outline.m1556G("Detect conflicting option ");
                        sbM1556G.append(aVar.mo15383a());
                        sbM1556G.append(" : ");
                        sbM1556G.append(objMo15105d);
                        sbM1556G.append(" != ");
                        sbM1556G.append(objMo15105d2);
                        Logger8.m15272a("CaptureSession", sbM1556G.toString(), null);
                    }
                } else {
                    mutableOptionsBundleM15434y.m15436A(aVar, Config3.c.OPTIONAL, objMo15105d);
                }
            }
        }
        return mutableOptionsBundleM15434y;
    }

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession.CaptureCallback m15081a(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback camera2CaptureCallbacks;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (CameraCaptureCallback cameraCaptureCallback : list) {
            if (cameraCaptureCallback == null) {
                camera2CaptureCallbacks = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                CaptureCallbackConverter.m15079a(cameraCaptureCallback, arrayList2);
                camera2CaptureCallbacks = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new Camera2CaptureCallbacks(arrayList2);
            }
            arrayList.add(camera2CaptureCallbacks);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new Camera2CaptureCallbacks(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public void m15082b() {
        c cVar = this.f35453l;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            Logger8.m15272a("CaptureSession", "Skipping finishClose due to being state RELEASED.", null);
            return;
        }
        this.f35453l = cVar2;
        this.f35447f = null;
        Iterator<DeferrableSurface> it = this.f35452k.iterator();
        while (it.hasNext()) {
            it.next().m15389b();
        }
        this.f35452k.clear();
        CallbackToFutureAdapter<Void> callbackToFutureAdapter = this.f35455n;
        if (callbackToFutureAdapter != null) {
            callbackToFutureAdapter.m15659a(null);
            this.f35455n = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15083c(List<CaptureConfig> list) {
        boolean z;
        if (list.isEmpty()) {
            return;
        }
        try {
            CameraBurstCaptureCallback cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
            ArrayList arrayList = new ArrayList();
            Logger8.m15272a("CaptureSession", "Issuing capture request.", null);
            boolean z2 = false;
            boolean z3 = false;
            for (CaptureConfig captureConfig : list) {
                if (captureConfig.m15362a().isEmpty()) {
                    Logger8.m15272a("CaptureSession", "Skipping issuing empty capture request.", null);
                } else {
                    Iterator<DeferrableSurface> it = captureConfig.m15362a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        DeferrableSurface next = it.next();
                        if (!this.f35451j.containsKey(next)) {
                            Logger8.m15272a("CaptureSession", "Skipping capture request with invalid surface: " + next, null);
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        if (captureConfig.f36145e == 2) {
                            z3 = true;
                        }
                        CaptureConfig.a aVar = new CaptureConfig.a(captureConfig);
                        if (this.f35448g != null) {
                            aVar.m15365c(this.f35448g.f36164f.f36144d);
                        }
                        aVar.m15365c(this.f35449h);
                        aVar.m15365c(captureConfig.f36144d);
                        CaptureRequest captureRequestM14565b = C7462a.m14565b(aVar.m15366d(), this.f35447f.mo15150f(), this.f35451j);
                        if (captureRequestM14565b == null) {
                            Logger8.m15272a("CaptureSession", "Skipping issuing request without surface.", null);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<CameraCaptureCallback> it2 = captureConfig.f36146f.iterator();
                        while (it2.hasNext()) {
                            CaptureCallbackConverter.m15079a(it2.next(), arrayList2);
                        }
                        List<CameraCaptureSession.CaptureCallback> list2 = cameraBurstCaptureCallback.f35710a.get(captureRequestM14565b);
                        if (list2 != null) {
                            ArrayList arrayList3 = new ArrayList(list2.size() + arrayList2.size());
                            arrayList3.addAll(arrayList2);
                            arrayList3.addAll(list2);
                            cameraBurstCaptureCallback.f35710a.put(captureRequestM14565b, arrayList3);
                        } else {
                            cameraBurstCaptureCallback.f35710a.put(captureRequestM14565b, arrayList2);
                        }
                        arrayList.add(captureRequestM14565b);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                Logger8.m15272a("CaptureSession", "Skipping issuing burst request due to no valid request elements", null);
                return;
            }
            if (this.f35456o.f35827a && z3) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    int iIntValue = ((Integer) ((CaptureRequest) it3.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                    if (iIntValue == 2 || iIntValue == 3) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (z2) {
                this.f35447f.mo15152h();
                cameraBurstCaptureCallback.f35711b = new C7724x(this);
            }
            this.f35447f.mo15147c(arrayList, cameraBurstCaptureCallback);
        } catch (CameraAccessException e) {
            StringBuilder sbM1556G = outline.m1556G("Unable to access camera: ");
            sbM1556G.append(e.getMessage());
            Logger8.m15273b("CaptureSession", sbM1556G.toString(), null);
            Thread.dumpStack();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m15084d(List<CaptureConfig> list) {
        synchronized (this.f35442a) {
            switch (this.f35453l) {
                case UNINITIALIZED:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f35453l);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.f35443b.addAll(list);
                    break;
                case OPENED:
                    this.f35443b.addAll(list);
                    m15085e();
                    break;
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m15085e() {
        if (this.f35443b.isEmpty()) {
            return;
        }
        try {
            m15083c(this.f35443b);
        } finally {
            this.f35443b.clear();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m15086f() {
        if (this.f35448g == null) {
            Logger8.m15272a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.", null);
            return;
        }
        CaptureConfig captureConfig = this.f35448g.f36164f;
        if (captureConfig.m15362a().isEmpty()) {
            Logger8.m15272a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.", null);
            try {
                this.f35447f.mo15152h();
                return;
            } catch (CameraAccessException e) {
                StringBuilder sbM1556G = outline.m1556G("Unable to access camera: ");
                sbM1556G.append(e.getMessage());
                Logger8.m15273b("CaptureSession", sbM1556G.toString(), null);
                Thread.dumpStack();
                return;
            }
        }
        try {
            Logger8.m15272a("CaptureSession", "Issuing request for session.", null);
            CaptureConfig.a aVar = new CaptureConfig.a(captureConfig);
            CameraEventCallbacks.a aVarM15076c = this.f35450i.m15076c();
            ArrayList arrayList = new ArrayList();
            Iterator<CameraEventCallback> it = aVarM15076c.f35422a.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
            this.f35449h = m15080g(arrayList);
            aVar.m15365c(this.f35449h);
            CaptureRequest captureRequestM14565b = C7462a.m14565b(aVar.m15366d(), this.f35447f.mo15150f(), this.f35451j);
            if (captureRequestM14565b == null) {
                Logger8.m15272a("CaptureSession", "Skipping issuing empty request for session.", null);
            } else {
                this.f35447f.mo15151g(captureRequestM14565b, m15081a(captureConfig.f36146f, this.f35444c));
            }
        } catch (CameraAccessException e2) {
            StringBuilder sbM1556G2 = outline.m1556G("Unable to access camera: ");
            sbM1556G2.append(e2.getMessage());
            Logger8.m15273b("CaptureSession", sbM1556G2.toString(), null);
            Thread.dumpStack();
        }
    }

    /* JADX INFO: renamed from: h */
    public ListenableFuture<Void> m15087h(final SessionConfig sessionConfig, final CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener) {
        synchronized (this.f35442a) {
            if (this.f35453l.ordinal() != 1) {
                Logger8.m15273b("CaptureSession", "Open not allowed in state: " + this.f35453l, null);
                return new ImmediateFuture.a(new IllegalStateException("open() should not allow the state: " + this.f35453l));
            }
            this.f35453l = c.GET_SURFACE;
            ArrayList arrayList = new ArrayList(sessionConfig.m15371b());
            this.f35452k = arrayList;
            this.f35446e = synchronizedCaptureSessionOpener;
            FutureChain futureChainM15425c = FutureChain.m15423a(synchronizedCaptureSessionOpener.f35666a.mo15188a(arrayList, 5000L)).m15425c(new AsyncFunction() { // from class: z0.e.a.e.w
                /* JADX WARN: Code duplicated, block: B:50:0x0155 A[Catch: all -> 0x0174, TryCatch #1 {, blocks: (B:4:0x000b, B:12:0x001c, B:13:0x0039, B:15:0x003c, B:16:0x0041, B:17:0x0048, B:19:0x004e, B:20:0x0064, B:21:0x00ba, B:23:0x00c0, B:24:0x00ca, B:25:0x00d5, B:27:0x00db, B:28:0x00e7, B:29:0x00f0, B:31:0x00f6, B:32:0x0105, B:33:0x0119, B:38:0x0131, B:39:0x0136, B:40:0x013e, B:36:0x0120, B:43:0x0141, B:44:0x0146, B:47:0x0149, B:48:0x0153, B:50:0x0155, B:51:0x0172), top: B:58:0x000b, inners: #0, #2 }] */
                /* JADX WARN: Instruction removed from duplicated block: B:50:0x0155, please report this as an issue */
                @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    ListenableFuture<Void> aVar;
                    CaptureSession captureSession = this.f35707a;
                    SessionConfig sessionConfig2 = sessionConfig;
                    CameraDevice cameraDevice2 = cameraDevice;
                    List list = (List) obj;
                    synchronized (captureSession.f35442a) {
                        int iOrdinal = captureSession.f35453l.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1) {
                            aVar = new ImmediateFuture.a<>(new IllegalStateException("openCaptureSession() should not be possible in state: " + captureSession.f35453l));
                        } else if (iOrdinal == 2) {
                            try {
                                C7462a.m14574k(captureSession.f35452k);
                                captureSession.f35451j.clear();
                                for (int i = 0; i < list.size(); i++) {
                                    captureSession.f35451j.put(captureSession.f35452k.get(i), (Surface) list.get(i));
                                }
                                ArrayList arrayList2 = new ArrayList(new HashSet(list));
                                captureSession.f35453l = CaptureSession.c.OPENING;
                                CaptureRequest captureRequestBuild = null;
                                Logger8.m15272a("CaptureSession", "Opening capture session.", null);
                                SynchronizedCaptureSessionStateCallbacks synchronizedCaptureSessionStateCallbacks = new SynchronizedCaptureSessionStateCallbacks(Arrays.asList(captureSession.f35445d, new SynchronizedCaptureSessionStateCallbacks.a(sessionConfig2.f36161c)));
                                CameraEventCallbacks cameraEventCallbacks = (CameraEventCallbacks) new Camera2ImplConfig(sessionConfig2.f36164f.f36144d).f35852r.mo15105d(Camera2ImplConfig.f35419w, CameraEventCallbacks.m15074d());
                                captureSession.f35450i = cameraEventCallbacks;
                                CameraEventCallbacks.a aVarM15076c = cameraEventCallbacks.m15076c();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<CameraEventCallback> it = aVarM15076c.f35422a.iterator();
                                while (it.hasNext()) {
                                    Objects.requireNonNull(it.next());
                                }
                                CaptureConfig.a aVar2 = new CaptureConfig.a(sessionConfig2.f36164f);
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    aVar2.m15365c(((CaptureConfig) it2.next()).f36144d);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new OutputConfigurationCompat((Surface) it3.next()));
                                }
                                SynchronizedCaptureSessionBaseImpl2 synchronizedCaptureSessionBaseImpl2 = (SynchronizedCaptureSessionBaseImpl2) captureSession.f35446e.f35666a;
                                synchronizedCaptureSessionBaseImpl2.f35642f = synchronizedCaptureSessionStateCallbacks;
                                SessionConfigurationCompat sessionConfigurationCompat = new SessionConfigurationCompat(0, arrayList4, synchronizedCaptureSessionBaseImpl2.f35640d, new SynchronizedCaptureSessionBaseImpl(synchronizedCaptureSessionBaseImpl2));
                                try {
                                    CaptureConfig captureConfigM15366d = aVar2.m15366d();
                                    if (cameraDevice2 != null) {
                                        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice2.createCaptureRequest(captureConfigM15366d.f36145e);
                                        C7462a.m14564a(builderCreateCaptureRequest, captureConfigM15366d.f36144d);
                                        captureRequestBuild = builderCreateCaptureRequest.build();
                                    }
                                    if (captureRequestBuild != null) {
                                        sessionConfigurationCompat.f35811a.mo15237g(captureRequestBuild);
                                    }
                                    aVar = captureSession.f35446e.f35666a.mo15189i(cameraDevice2, sessionConfigurationCompat);
                                } catch (CameraAccessException e) {
                                    aVar = new ImmediateFuture.a<>(e);
                                }
                            } catch (DeferrableSurface.a e2) {
                                captureSession.f35452k.clear();
                                aVar = new ImmediateFuture.a<>(e2);
                            }
                        } else if (iOrdinal != 4) {
                            aVar = new ImmediateFuture.a<>(new CancellationException("openCaptureSession() not execute in state: " + captureSession.f35453l));
                        } else {
                            aVar = new ImmediateFuture.a<>(new IllegalStateException("openCaptureSession() should not be possible in state: " + captureSession.f35453l));
                        }
                    }
                    return aVar;
                }
            }, ((SynchronizedCaptureSessionBaseImpl2) this.f35446e.f35666a).f35640d);
            b bVar = new b();
            futureChainM15425c.f36273f.mo11664h(new Futures2.d(futureChainM15425c, bVar), ((SynchronizedCaptureSessionBaseImpl2) this.f35446e.f35666a).f35640d);
            return Futures2.m15429d(futureChainM15425c);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m15088i(SessionConfig sessionConfig) {
        synchronized (this.f35442a) {
            switch (this.f35453l) {
                case UNINITIALIZED:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f35453l);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.f35448g = sessionConfig;
                    break;
                case OPENED:
                    this.f35448g = sessionConfig;
                    if (!this.f35451j.keySet().containsAll(sessionConfig.m15371b())) {
                        Logger8.m15273b("CaptureSession", "Does not have the proper configured lists", null);
                        return;
                    } else {
                        Logger8.m15272a("CaptureSession", "Attempting to submit CaptureRequest after setting", null);
                        m15086f();
                    }
                    break;
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public List<CaptureConfig> m15089j(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig captureConfig : list) {
            HashSet hashSet = new HashSet();
            MutableOptionsBundle.m15434y();
            ArrayList arrayList2 = new ArrayList();
            new ArrayMap();
            hashSet.addAll(captureConfig.f36143c);
            MutableOptionsBundle mutableOptionsBundleM15435z = MutableOptionsBundle.m15435z(captureConfig.f36144d);
            arrayList2.addAll(captureConfig.f36146f);
            boolean z = captureConfig.f36147g;
            TagBundle tagBundle = captureConfig.f36148h;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : tagBundle.f36213b.keySet()) {
                arrayMap.put(str, tagBundle.m15397a(str));
            }
            MutableTagBundle mutableTagBundle = new MutableTagBundle(arrayMap);
            Iterator<DeferrableSurface> it = this.f35448g.f36164f.m15362a().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            ArrayList arrayList3 = new ArrayList(hashSet);
            OptionsBundle optionsBundleM15339x = OptionsBundle.m15339x(mutableOptionsBundleM15435z);
            TagBundle tagBundle2 = TagBundle.f36212a;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str2 : mutableTagBundle.f36213b.keySet()) {
                arrayMap2.put(str2, mutableTagBundle.m15397a(str2));
            }
            arrayList.add(new CaptureConfig(arrayList3, optionsBundleM15339x, 1, arrayList2, z, new TagBundle(arrayMap2)));
        }
        return arrayList;
    }
}
