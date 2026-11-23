package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p669d.Camera2ImplConfig;
import p636z0.p667e.p668a.p670e.Camera2CameraControlImpl;
import p636z0.p667e.p668a.p670e.RunnableC7619a0;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;
import p636z0.p667e.p668a.p670e.p671w1.p673p.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import p636z0.p667e.p668a.p670e.p671w1.p673p.DeviceQuirks;
import p636z0.p667e.p668a.p670e.p671w1.p674q.AeFpsRange;
import p636z0.p667e.p668a.p670e.p671w1.p674q.AutoFlashAEModeDisabler;
import p636z0.p667e.p668a.p675f.Camera2CameraControl;
import p636z0.p667e.p668a.p675f.CaptureRequestOptions;
import p636z0.p667e.p676b.CameraControl;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.ZoomState;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallback;
import p636z0.p667e.p676b.p677v1.CameraCaptureFailure;
import p636z0.p667e.p676b.p677v1.CameraCaptureResult;
import p636z0.p667e.p676b.p677v1.CameraControlInternal;
import p636z0.p667e.p676b.p677v1.CaptureConfig;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.MutableTagBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;
import p636z0.p667e.p676b.p677v1.Quirks;
import p636z0.p667e.p676b.p677v1.SessionConfig;
import p636z0.p667e.p676b.p677v1.TagBundle;
import p636z0.p667e.p676b.p677v1.UseCaseAttachState;
import p636z0.p667e.p676b.p677v1.p678r1.p679b.SequentialExecutor;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p667e.p676b.p681w1.ImmutableZoomState;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;

/* JADX INFO: renamed from: z0.e.a.e.m0, reason: use source file name */
/* JADX INFO: compiled from: Camera2CameraControlImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class Camera2CameraControlImpl implements CameraControlInternal {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f35525a = 0;

    /* JADX INFO: renamed from: b */
    public final b f35526b;

    /* JADX INFO: renamed from: c */
    public final Executor f35527c;

    /* JADX INFO: renamed from: d */
    public final Object f35528d = new Object();

    /* JADX INFO: renamed from: e */
    public final CameraCharacteristicsCompat f35529e;

    /* JADX INFO: renamed from: f */
    public final CameraControlInternal.a f35530f;

    /* JADX INFO: renamed from: g */
    public final SessionConfig.b f35531g;

    /* JADX INFO: renamed from: h */
    public final FocusMeteringControl f35532h;

    /* JADX INFO: renamed from: i */
    public final ZoomControl f35533i;

    /* JADX INFO: renamed from: j */
    public final TorchControl f35534j;

    /* JADX INFO: renamed from: k */
    public final ExposureControl f35535k;

    /* JADX INFO: renamed from: l */
    public final Camera2CameraControl f35536l;

    /* JADX INFO: renamed from: m */
    public final AeFpsRange f35537m;

    /* JADX INFO: renamed from: n */
    public int f35538n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f35539o;

    /* JADX INFO: renamed from: p */
    public volatile int f35540p;

    /* JADX INFO: renamed from: q */
    public final AutoFlashAEModeDisabler f35541q;

    /* JADX INFO: renamed from: r */
    public final a f35542r;

    /* JADX INFO: renamed from: z0.e.a.e.m0$a */
    /* JADX INFO: compiled from: Camera2CameraControlImpl.java */
    public static final class a extends CameraCaptureCallback {

        /* JADX INFO: renamed from: a */
        public Set<CameraCaptureCallback> f35543a = new HashSet();

        /* JADX INFO: renamed from: b */
        public Map<CameraCaptureCallback, Executor> f35544b = new ArrayMap();

        @Override // p636z0.p667e.p676b.p677v1.CameraCaptureCallback
        /* JADX INFO: renamed from: a */
        public void mo15130a() {
            for (final CameraCaptureCallback cameraCaptureCallback : this.f35543a) {
                try {
                    this.f35544b.get(cameraCaptureCallback).execute(new Runnable() { // from class: z0.e.a.e.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraCaptureCallback.mo15130a();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger8.m15273b("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // p636z0.p667e.p676b.p677v1.CameraCaptureCallback
        /* JADX INFO: renamed from: b */
        public void mo15131b(final CameraCaptureResult cameraCaptureResult) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.f35543a) {
                try {
                    this.f35544b.get(cameraCaptureCallback).execute(new Runnable() { // from class: z0.e.a.e.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraCaptureCallback.mo15131b(cameraCaptureResult);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger8.m15273b("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // p636z0.p667e.p676b.p677v1.CameraCaptureCallback
        /* JADX INFO: renamed from: c */
        public void mo15132c(final CameraCaptureFailure cameraCaptureFailure) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.f35543a) {
                try {
                    this.f35544b.get(cameraCaptureCallback).execute(new Runnable() { // from class: z0.e.a.e.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraCaptureCallback.mo15132c(cameraCaptureFailure);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger8.m15273b("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.m0$b */
    /* JADX INFO: compiled from: Camera2CameraControlImpl.java */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        public final Set<c> f35545a = new HashSet();

        /* JADX INFO: renamed from: b */
        public final Executor f35546b;

        public b(Executor executor) {
            this.f35546b = executor;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f35546b.execute(new Runnable() { // from class: z0.e.a.e.e
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraControlImpl.b bVar = this.f35439f;
                    TotalCaptureResult totalCaptureResult2 = totalCaptureResult;
                    Objects.requireNonNull(bVar);
                    HashSet hashSet = new HashSet();
                    for (Camera2CameraControlImpl.c cVar : bVar.f35545a) {
                        if (cVar.mo15133a(totalCaptureResult2)) {
                            hashSet.add(cVar);
                        }
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    bVar.f35545a.removeAll(hashSet);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.m0$c */
    /* JADX INFO: compiled from: Camera2CameraControlImpl.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean mo15133a(TotalCaptureResult totalCaptureResult);
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.a aVar, Quirks quirks) {
        SessionConfig.b bVar = new SessionConfig.b();
        this.f35531g = bVar;
        this.f35538n = 0;
        this.f35539o = false;
        this.f35540p = 2;
        this.f35541q = new AutoFlashAEModeDisabler();
        a aVar2 = new a();
        this.f35542r = aVar2;
        this.f35529e = cameraCharacteristicsCompat;
        this.f35530f = aVar;
        this.f35527c = executor;
        b bVar2 = new b(executor);
        this.f35526b = bVar2;
        bVar.f36166b.f36151c = 1;
        bVar.f36166b.m15364b(new CaptureCallbackContainer(bVar2));
        bVar.f36166b.m15364b(aVar2);
        this.f35535k = new ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.f35532h = new FocusMeteringControl(this, scheduledExecutorService, executor);
        this.f35533i = new ZoomControl(this, cameraCharacteristicsCompat, executor);
        this.f35534j = new TorchControl(this, cameraCharacteristicsCompat, executor);
        this.f35537m = new AeFpsRange(quirks);
        this.f35536l = new Camera2CameraControl(this, executor);
        SequentialExecutor sequentialExecutor = (SequentialExecutor) executor;
        sequentialExecutor.execute(new Runnable() { // from class: z0.e.a.e.f
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl camera2CameraControlImpl = this.f35468f;
                camera2CameraControlImpl.m15121d(camera2CameraControlImpl.f35536l.f35851h);
            }
        });
        sequentialExecutor.execute(new RunnableC7619a0(this));
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraControlInternal
    /* JADX INFO: renamed from: a */
    public void mo15118a(Config3 config3) {
        final Camera2CameraControl camera2CameraControl = this.f35536l;
        CaptureRequestOptions captureRequestOptionsM15245c = CaptureRequestOptions.a.m15244d(config3).m15245c();
        synchronized (camera2CameraControl.f35848e) {
            for (Config3.a<?> aVar : captureRequestOptionsM15245c.mo15104c()) {
                camera2CameraControl.f35849f.f35421a.m15436A(aVar, Config3.c.OPTIONAL, captureRequestOptionsM15245c.mo15102a(aVar));
            }
        }
        Futures2.m15429d(C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.a.f.f
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(final CallbackToFutureAdapter callbackToFutureAdapter) {
                final Camera2CameraControl camera2CameraControl2 = camera2CameraControl;
                camera2CameraControl2.f35847d.execute(new Runnable() { // from class: z0.e.a.f.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        camera2CameraControl2.m15243b(callbackToFutureAdapter);
                    }
                });
                return "addCaptureRequestOptions";
            }
        })).mo11664h(new Runnable() { // from class: z0.e.a.e.h
            @Override // java.lang.Runnable
            public final void run() {
                int i = Camera2CameraControlImpl.f35525a;
            }
        }, C7462a.m14569f());
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraControlInternal
    /* JADX INFO: renamed from: b */
    public Config3 mo15119b() {
        return this.f35536l.m15242a();
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraControlInternal
    /* JADX INFO: renamed from: c */
    public void mo15120c() {
        final Camera2CameraControl camera2CameraControl = this.f35536l;
        synchronized (camera2CameraControl.f35848e) {
            camera2CameraControl.f35849f = new Camera2ImplConfig.a();
        }
        Futures2.m15429d(C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.a.f.d
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(final CallbackToFutureAdapter callbackToFutureAdapter) {
                final Camera2CameraControl camera2CameraControl2 = camera2CameraControl;
                camera2CameraControl2.f35847d.execute(new Runnable() { // from class: z0.e.a.f.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        camera2CameraControl2.m15243b(callbackToFutureAdapter);
                    }
                });
                return "clearCaptureRequestOptions";
            }
        })).mo11664h(new Runnable() { // from class: z0.e.a.e.g
            @Override // java.lang.Runnable
            public final void run() {
                int i = Camera2CameraControlImpl.f35525a;
            }
        }, C7462a.m14569f());
    }

    /* JADX INFO: renamed from: d */
    public void m15121d(c cVar) {
        this.f35526b.f35545a.add(cVar);
    }

    /* JADX INFO: renamed from: e */
    public void m15122e() {
        synchronized (this.f35528d) {
            int i = this.f35538n;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.f35538n = i - 1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m15123f(int i) {
        int[] iArr = (int[]) this.f35529e.m15209a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m15125h(i, iArr)) {
            return i;
        }
        return m15125h(1, iArr) ? 1 : 0;
    }

    /* JADX INFO: renamed from: g */
    public int m15124g(int i) {
        int[] iArr = (int[]) this.f35529e.m15209a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m15125h(i, iArr)) {
            return i;
        }
        if (m15125h(4, iArr)) {
            return 4;
        }
        return m15125h(1, iArr) ? 1 : 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15125h(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m15126i(c cVar) {
        this.f35526b.f35545a.remove(cVar);
    }

    /* JADX INFO: renamed from: j */
    public void m15127j(final boolean z) {
        ZoomState zoomStateM15453a;
        FocusMeteringControl focusMeteringControl = this.f35532h;
        if (z != focusMeteringControl.f35503c) {
            focusMeteringControl.f35503c = z;
            if (!focusMeteringControl.f35503c) {
                focusMeteringControl.f35501a.m15126i(focusMeteringControl.f35504d);
                CallbackToFutureAdapter<Void> callbackToFutureAdapter = focusMeteringControl.f35511k;
                if (callbackToFutureAdapter != null) {
                    callbackToFutureAdapter.m15661c(new CameraControl("Cancelled by another cancelFocusAndMetering()"));
                    focusMeteringControl.f35511k = null;
                }
                focusMeteringControl.f35501a.m15126i(null);
                focusMeteringControl.f35511k = null;
                if ((focusMeteringControl.f35505e.length > 0) && focusMeteringControl.f35503c) {
                    CaptureConfig.a aVar = new CaptureConfig.a();
                    aVar.f36153e = true;
                    aVar.f36151c = 1;
                    Camera2ImplConfig.a aVar2 = new Camera2ImplConfig.a();
                    aVar2.m15073d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    aVar.m15365c(aVar2.m15072c());
                    focusMeteringControl.f35501a.m15128k(Collections.singletonList(aVar.m15366d()));
                }
                focusMeteringControl.f35505e = new MeteringRectangle[0];
                focusMeteringControl.f35506f = new MeteringRectangle[0];
                focusMeteringControl.f35507g = new MeteringRectangle[0];
                focusMeteringControl.f35501a.m15129l();
            }
        }
        ZoomControl zoomControl = this.f35533i;
        if (zoomControl.f35697f != z) {
            zoomControl.f35697f = z;
            if (!z) {
                synchronized (zoomControl.f35694c) {
                    zoomControl.f35694c.m15202a(1.0f);
                    zoomStateM15453a = ImmutableZoomState.m15453a(zoomControl.f35694c);
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    zoomControl.f35695d.mo427j(zoomStateM15453a);
                } else {
                    zoomControl.f35695d.m16742k(zoomStateM15453a);
                }
                zoomControl.f35696e.mo15100e();
                zoomControl.f35692a.m15129l();
            }
        }
        TorchControl torchControl = this.f35534j;
        if (torchControl.f35686d != z) {
            torchControl.f35686d = z;
        }
        ExposureControl exposureControl = this.f35535k;
        if (z != exposureControl.f35490d) {
            exposureControl.f35490d = z;
            if (!z) {
                ExposureStateImpl exposureStateImpl = exposureControl.f35488b;
                synchronized (exposureStateImpl.f35494a) {
                    exposureStateImpl.f35495b = 0;
                }
            }
        }
        final Camera2CameraControl camera2CameraControl = this.f35536l;
        camera2CameraControl.f35847d.execute(new Runnable() { // from class: z0.e.a.f.e
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControl camera2CameraControl2 = camera2CameraControl;
                boolean z2 = z;
                if (camera2CameraControl2.f35844a == z2) {
                    return;
                }
                camera2CameraControl2.f35844a = z2;
                if (z2) {
                    if (camera2CameraControl2.f35845b) {
                        Camera2CameraControlImpl camera2CameraControlImpl = camera2CameraControl2.f35846c;
                        camera2CameraControlImpl.f35527c.execute(new RunnableC7619a0(camera2CameraControlImpl));
                        camera2CameraControl2.f35845b = false;
                        return;
                    }
                    return;
                }
                synchronized (camera2CameraControl2.f35848e) {
                    camera2CameraControl2.f35849f = new Camera2ImplConfig.a();
                }
                CallbackToFutureAdapter<Void> callbackToFutureAdapter2 = camera2CameraControl2.f35850g;
                if (callbackToFutureAdapter2 != null) {
                    callbackToFutureAdapter2.m15661c(new CameraControl("The camera control has became inactive."));
                    camera2CameraControl2.f35850g = null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m15128k(List<CaptureConfig> list) {
        Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
        Objects.requireNonNull(list);
        Objects.requireNonNull(camera2CameraImpl);
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig captureConfig : list) {
            HashSet hashSet = new HashSet();
            MutableOptionsBundle.m15434y();
            ArrayList arrayList2 = new ArrayList();
            new ArrayMap();
            hashSet.addAll(captureConfig.f36143c);
            MutableOptionsBundle mutableOptionsBundleM15435z = MutableOptionsBundle.m15435z(captureConfig.f36144d);
            int i = captureConfig.f36145e;
            arrayList2.addAll(captureConfig.f36146f);
            boolean z = captureConfig.f36147g;
            TagBundle tagBundle = captureConfig.f36148h;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : tagBundle.f36213b.keySet()) {
                arrayMap.put(str, tagBundle.m15397a(str));
            }
            MutableTagBundle mutableTagBundle = new MutableTagBundle(arrayMap);
            if (captureConfig.m15362a().isEmpty() && captureConfig.f36147g) {
                boolean z2 = false;
                if (hashSet.isEmpty()) {
                    Iterator it = Collections.unmodifiableCollection(camera2CameraImpl.f35582f.m15400c(new UseCaseAttachState.a() { // from class: z0.e.b.v1.k
                        @Override // p636z0.p667e.p676b.p677v1.UseCaseAttachState.a
                        /* JADX INFO: renamed from: a */
                        public final boolean mo15380a(UseCaseAttachState.b bVar) {
                            return bVar.f36225c && bVar.f36224b;
                        }
                    })).iterator();
                    while (it.hasNext()) {
                        List<DeferrableSurface> listM15362a = ((SessionConfig) it.next()).f36164f.m15362a();
                        if (!listM15362a.isEmpty()) {
                            Iterator<DeferrableSurface> it2 = listM15362a.iterator();
                            while (it2.hasNext()) {
                                hashSet.add(it2.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        Logger8.m15276e("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig", null);
                    } else {
                        z2 = true;
                    }
                } else {
                    Logger8.m15276e("Camera2CameraImpl", "The capture config builder already has surface inside.", null);
                }
                if (!z2) {
                }
            }
            ArrayList arrayList3 = new ArrayList(hashSet);
            OptionsBundle optionsBundleM15339x = OptionsBundle.m15339x(mutableOptionsBundleM15435z);
            TagBundle tagBundle2 = TagBundle.f36212a;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str2 : mutableTagBundle.f36213b.keySet()) {
                arrayMap2.put(str2, mutableTagBundle.m15397a(str2));
            }
            arrayList.add(new CaptureConfig(arrayList3, optionsBundleM15339x, i, arrayList2, z, new TagBundle(arrayMap2)));
        }
        camera2CameraImpl.m15170m("Issue capture request", null);
        camera2CameraImpl.f35592p.m15084d(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc A[LOOP:0: B:41:0x00d6->B:43:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public void m15129l() {
        int i;
        int[] iArr;
        ExposureStateImpl exposureStateImpl;
        Camera2ImplConfig camera2ImplConfigM15242a;
        Object objMo15105d;
        SessionConfig.b bVar = this.f35531g;
        Camera2ImplConfig.a aVar = new Camera2ImplConfig.a();
        int i2 = 1;
        aVar.m15073d(CaptureRequest.CONTROL_MODE, 1);
        FocusMeteringControl focusMeteringControl = this.f35532h;
        Objects.requireNonNull(focusMeteringControl);
        aVar.m15073d(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(focusMeteringControl.f35501a.m15124g(4)));
        MeteringRectangle[] meteringRectangleArr = focusMeteringControl.f35505e;
        if (meteringRectangleArr.length != 0) {
            aVar.m15073d(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = focusMeteringControl.f35506f;
        if (meteringRectangleArr2.length != 0) {
            aVar.m15073d(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = focusMeteringControl.f35507g;
        if (meteringRectangleArr3.length != 0) {
            aVar.m15073d(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
        Range<Integer> range = this.f35537m.f35825a;
        if (range != null) {
            aVar.m15073d(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
        this.f35533i.f35696e.mo15097b(aVar);
        if (!this.f35539o) {
            int i3 = this.f35540p;
            if (i3 == 0) {
                Objects.requireNonNull(this.f35541q);
                i = ((CrashWhenTakingPhotoWithAutoFlashAEModeQuirk) DeviceQuirks.m15238a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class)) != null ? 1 : 2;
            } else if (i3 == 1) {
                i = 3;
            }
            aVar.m15073d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m15123f(i)));
            CaptureRequest.Key key = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.f35529e.m15209a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!m15125h(1, iArr) && !m15125h(1, iArr))) {
                i2 = 0;
            }
            aVar.m15073d(key, Integer.valueOf(i2));
            ExposureControl exposureControl = this.f35535k;
            Objects.requireNonNull(exposureControl);
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            exposureStateImpl = exposureControl.f35488b;
            synchronized (exposureStateImpl.f35494a) {
                int i4 = exposureStateImpl.f35495b;
            }
            aVar.m15073d(key2, Integer.valueOf(i4));
            camera2ImplConfigM15242a = this.f35536l.m15242a();
            for (Config3.a<?> aVar2 : camera2ImplConfigM15242a.mo15104c()) {
                aVar.f35421a.m15436A(aVar2, Config3.c.ALWAYS_OVERRIDE, camera2ImplConfigM15242a.mo15102a(aVar2));
            }
            Camera2ImplConfig camera2ImplConfigM15072c = aVar.m15072c();
            CaptureConfig.a aVar3 = bVar.f36166b;
            Objects.requireNonNull(aVar3);
            aVar3.f36150b = MutableOptionsBundle.m15435z(camera2ImplConfigM15072c);
            objMo15105d = this.f35536l.m15242a().f35852r.mo15105d(Camera2ImplConfig.f35420x, null);
            if (objMo15105d != null && (objMo15105d instanceof Integer)) {
                this.f35531g.f36166b.f36154f.f36213b.put("Camera2CameraControl", (Integer) objMo15105d);
            }
            CameraControlInternal.a aVar4 = this.f35530f;
            SessionConfig sessionConfigM15377e = this.f35531g.m15377e();
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f35593q = sessionConfigM15377e;
            camera2CameraImpl.m15180x();
        }
        aVar.m15073d(CaptureRequest.FLASH_MODE, 2);
        i = 1;
        aVar.m15073d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m15123f(i)));
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.f35529e.m15209a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            i2 = 0;
        } else {
            i2 = 0;
        }
        aVar.m15073d(key3, Integer.valueOf(i2));
        ExposureControl exposureControl2 = this.f35535k;
        Objects.requireNonNull(exposureControl2);
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        exposureStateImpl = exposureControl2.f35488b;
        synchronized (exposureStateImpl.f35494a) {
            int i5 = exposureStateImpl.f35495b;
            aVar.m15073d(key4, Integer.valueOf(i5));
            camera2ImplConfigM15242a = this.f35536l.m15242a();
            while (r3.hasNext()) {
                aVar.f35421a.m15436A(aVar2, Config3.c.ALWAYS_OVERRIDE, camera2ImplConfigM15242a.mo15102a(aVar2));
            }
            Camera2ImplConfig camera2ImplConfigM15072c2 = aVar.m15072c();
            CaptureConfig.a aVar5 = bVar.f36166b;
            Objects.requireNonNull(aVar5);
            aVar5.f36150b = MutableOptionsBundle.m15435z(camera2ImplConfigM15072c2);
            objMo15105d = this.f35536l.m15242a().f35852r.mo15105d(Camera2ImplConfig.f35420x, null);
            if (objMo15105d != null) {
                this.f35531g.f36166b.f36154f.f36213b.put("Camera2CameraControl", (Integer) objMo15105d);
            }
            CameraControlInternal.a aVar6 = this.f35530f;
            SessionConfig sessionConfigM15377e2 = this.f35531g.m15377e();
            Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
            camera2CameraImpl2.f35593q = sessionConfigM15377e2;
            camera2CameraImpl2.m15180x();
        }
    }
}
