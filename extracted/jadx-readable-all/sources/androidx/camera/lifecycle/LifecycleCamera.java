package androidx.camera.lifecycle;

import java.util.Collections;
import java.util.List;
import p636z0.p667e.p676b.Camera2;
import p636z0.p667e.p676b.UseCase;
import p636z0.p667e.p676b.p681w1.CameraUseCaseAdapter;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.OnLifecycleEvent;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCamera implements LifecycleObserver, Camera2 {

    /* JADX INFO: renamed from: g */
    public final LifecycleOwner f500g;

    /* JADX INFO: renamed from: h */
    public final CameraUseCaseAdapter f501h;

    /* JADX INFO: renamed from: f */
    public final Object f499f = new Object();

    /* JADX INFO: renamed from: i */
    public boolean f502i = false;

    public LifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f500g = lifecycleOwner;
        this.f501h = cameraUseCaseAdapter;
        if (lifecycleOwner.mo124b().mo16728b().isAtLeast(Lifecycle3.b.STARTED)) {
            cameraUseCaseAdapter.m15448b();
        } else {
            cameraUseCaseAdapter.m15450d();
        }
        lifecycleOwner.mo124b().mo16727a(this);
    }

    /* JADX INFO: renamed from: j */
    public LifecycleOwner m256j() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f499f) {
            lifecycleOwner = this.f500g;
        }
        return lifecycleOwner;
    }

    /* JADX INFO: renamed from: k */
    public List<UseCase> m257k() {
        List<UseCase> listUnmodifiableList;
        synchronized (this.f499f) {
            listUnmodifiableList = Collections.unmodifiableList(this.f501h.m15451j());
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: l */
    public void m258l() {
        synchronized (this.f499f) {
            if (this.f502i) {
                return;
            }
            onStop(this.f500g);
            this.f502i = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m259m() {
        synchronized (this.f499f) {
            if (this.f502i) {
                this.f502i = false;
                if (this.f500g.mo124b().mo16728b().isAtLeast(Lifecycle3.b.STARTED)) {
                    onStart(this.f500g);
                }
            }
        }
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.f499f) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f501h;
            cameraUseCaseAdapter.m15452k(cameraUseCaseAdapter.m15451j());
        }
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.f499f) {
            if (!this.f502i) {
                this.f501h.m15448b();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.f499f) {
            if (!this.f502i) {
                this.f501h.m15450d();
            }
        }
    }
}
