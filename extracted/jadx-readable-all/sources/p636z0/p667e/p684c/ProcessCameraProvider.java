package p636z0.p667e.p684c;

import androidx.activity.ComponentActivity;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.Camera2;
import p636z0.p667e.p676b.CameraFilter;
import p636z0.p667e.p676b.CameraSelector;
import p636z0.p667e.p676b.CameraX2;
import p636z0.p667e.p676b.UseCase;
import p636z0.p667e.p676b.p677v1.CameraDeviceSurfaceManager;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;
import p636z0.p667e.p676b.p681w1.CameraUseCaseAdapter;
import p636z0.p725k.C8162a;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: renamed from: z0.e.c.c, reason: use source file name */
/* JADX INFO: compiled from: ProcessCameraProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessCameraProvider {

    /* JADX INFO: renamed from: a */
    public static final ProcessCameraProvider f36372a = new ProcessCameraProvider();

    /* JADX INFO: renamed from: b */
    public final LifecycleCameraRepository f36373b = new LifecycleCameraRepository();

    /* JADX INFO: renamed from: c */
    public CameraX2 f36374c;

    /* JADX INFO: renamed from: a */
    public Camera2 m15457a(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCaseArr) {
        LifecycleCamera lifecycleCamera;
        Collection<LifecycleCamera> collectionUnmodifiableCollection;
        LifecycleCamera lifecycleCamera2;
        boolean zContains;
        C7462a.m14566c();
        LinkedHashSet linkedHashSet = new LinkedHashSet(cameraSelector.f36011c);
        for (UseCase useCase : useCaseArr) {
            CameraSelector cameraSelectorMo15115t = useCase.f36018f.mo15115t(null);
            if (cameraSelectorMo15115t != null) {
                Iterator<CameraFilter> it = cameraSelectorMo15115t.f36011c.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next());
                }
            }
        }
        LinkedHashSet<CameraInternal2> linkedHashSetM15295a = new CameraSelector(linkedHashSet).m15295a(this.f36374c.f36318f.m15340a());
        CameraUseCaseAdapter.b bVar = new CameraUseCaseAdapter.b(linkedHashSetM15295a);
        LifecycleCameraRepository lifecycleCameraRepository = this.f36373b;
        synchronized (lifecycleCameraRepository.f503a) {
            lifecycleCamera = lifecycleCameraRepository.f504b.get(new AutoValue_LifecycleCameraRepository_Key(lifecycleOwner, bVar));
        }
        LifecycleCameraRepository lifecycleCameraRepository2 = this.f36373b;
        synchronized (lifecycleCameraRepository2.f503a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(lifecycleCameraRepository2.f504b.values());
        }
        for (UseCase useCase2 : useCaseArr) {
            for (LifecycleCamera lifecycleCamera3 : collectionUnmodifiableCollection) {
                synchronized (lifecycleCamera3.f499f) {
                    zContains = ((ArrayList) lifecycleCamera3.f501h.m15451j()).contains(useCase2);
                }
                if (zContains && lifecycleCamera3 != lifecycleCamera) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", useCase2));
                }
            }
        }
        if (lifecycleCamera == null) {
            LifecycleCameraRepository lifecycleCameraRepository3 = this.f36373b;
            CameraX2 cameraX2 = this.f36374c;
            CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX2.f36325m;
            if (cameraDeviceSurfaceManager == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            UseCaseConfigFactory useCaseConfigFactory = cameraX2.f36326n;
            if (useCaseConfigFactory == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(linkedHashSetM15295a, cameraDeviceSurfaceManager, useCaseConfigFactory);
            synchronized (lifecycleCameraRepository3.f503a) {
                C8162a.m16061f(lifecycleCameraRepository3.f504b.get(new AutoValue_LifecycleCameraRepository_Key(lifecycleOwner, cameraUseCaseAdapter.f36339j)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                if (((ComponentActivity) lifecycleOwner).f139h.f38705b == Lifecycle3.b.DESTROYED) {
                    throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                }
                lifecycleCamera2 = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter);
                if (((ArrayList) cameraUseCaseAdapter.m15451j()).isEmpty()) {
                    lifecycleCamera2.m258l();
                }
                lifecycleCameraRepository3.m263d(lifecycleCamera2);
            }
            lifecycleCamera = lifecycleCamera2;
        }
        if (useCaseArr.length != 0) {
            this.f36373b.m260a(lifecycleCamera, null, Arrays.asList(useCaseArr));
        }
        return lifecycleCamera;
    }

    /* JADX INFO: renamed from: b */
    public void m15458b() {
        C7462a.m14566c();
        LifecycleCameraRepository lifecycleCameraRepository = this.f36373b;
        synchronized (lifecycleCameraRepository.f503a) {
            Iterator<LifecycleCameraRepository.AbstractC0092a> it = lifecycleCameraRepository.f504b.keySet().iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = lifecycleCameraRepository.f504b.get(it.next());
                synchronized (lifecycleCamera.f499f) {
                    CameraUseCaseAdapter cameraUseCaseAdapter = lifecycleCamera.f501h;
                    cameraUseCaseAdapter.m15452k(cameraUseCaseAdapter.m15451j());
                }
                lifecycleCameraRepository.m265f(lifecycleCamera.m256j());
            }
        }
    }
}
