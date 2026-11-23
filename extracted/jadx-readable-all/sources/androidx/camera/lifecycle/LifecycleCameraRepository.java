package androidx.camera.lifecycle;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p636z0.p667e.p676b.UseCase;
import p636z0.p667e.p676b.ViewPort;
import p636z0.p667e.p676b.p681w1.CameraUseCaseAdapter;
import p636z0.p667e.p684c.AutoValue_LifecycleCameraRepository_Key;
import p636z0.p725k.C8162a;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.OnLifecycleEvent;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCameraRepository {

    /* JADX INFO: renamed from: a */
    public final Object f503a = new Object();

    /* JADX INFO: renamed from: b */
    public final Map<AbstractC0092a, LifecycleCamera> f504b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<LifecycleCameraRepositoryObserver, Set<AbstractC0092a>> f505c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<LifecycleOwner> f506d = new ArrayDeque<>();

    public static class LifecycleCameraRepositoryObserver implements LifecycleObserver {

        /* JADX INFO: renamed from: f */
        public final LifecycleCameraRepository f507f;

        /* JADX INFO: renamed from: g */
        public final LifecycleOwner f508g;

        public LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f508g = lifecycleOwner;
            this.f507f = lifecycleCameraRepository;
        }

        @OnLifecycleEvent(Lifecycle3.a.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            LifecycleCameraRepository lifecycleCameraRepository = this.f507f;
            synchronized (lifecycleCameraRepository.f503a) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverM261b = lifecycleCameraRepository.m261b(lifecycleOwner);
                if (lifecycleCameraRepositoryObserverM261b == null) {
                    return;
                }
                lifecycleCameraRepository.m265f(lifecycleOwner);
                Iterator<AbstractC0092a> it = lifecycleCameraRepository.f505c.get(lifecycleCameraRepositoryObserverM261b).iterator();
                while (it.hasNext()) {
                    lifecycleCameraRepository.f504b.remove(it.next());
                }
                lifecycleCameraRepository.f505c.remove(lifecycleCameraRepositoryObserverM261b);
                lifecycleCameraRepositoryObserverM261b.f508g.mo124b().mo16729c(lifecycleCameraRepositoryObserverM261b);
            }
        }

        @OnLifecycleEvent(Lifecycle3.a.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.f507f.m264e(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle3.a.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.f507f.m265f(lifecycleOwner);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$a */
    public static abstract class AbstractC0092a {
        /* JADX INFO: renamed from: a */
        public abstract CameraUseCaseAdapter.b mo268a();

        /* JADX INFO: renamed from: b */
        public abstract LifecycleOwner mo269b();
    }

    /* JADX INFO: renamed from: a */
    public void m260a(LifecycleCamera lifecycleCamera, ViewPort viewPort, Collection<UseCase> collection) {
        synchronized (this.f503a) {
            C8162a.m16060e(!collection.isEmpty());
            LifecycleOwner lifecycleOwnerM256j = lifecycleCamera.m256j();
            Iterator<AbstractC0092a> it = this.f505c.get(m261b(lifecycleOwnerM256j)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera2 = this.f504b.get(it.next());
                Objects.requireNonNull(lifecycleCamera2);
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.m257k().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                synchronized (lifecycleCamera.f501h.f36342m) {
                }
                synchronized (lifecycleCamera.f499f) {
                    lifecycleCamera.f501h.m15447a(collection);
                }
                if (lifecycleOwnerM256j.mo124b().mo16728b().isAtLeast(Lifecycle3.b.STARTED)) {
                    m264e(lifecycleOwnerM256j);
                }
            } catch (CameraUseCaseAdapter.a e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final LifecycleCameraRepositoryObserver m261b(LifecycleOwner lifecycleOwner) {
        synchronized (this.f503a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f505c.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.f508g)) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m262c(LifecycleOwner lifecycleOwner) {
        synchronized (this.f503a) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverM261b = m261b(lifecycleOwner);
            if (lifecycleCameraRepositoryObserverM261b == null) {
                return false;
            }
            Iterator<AbstractC0092a> it = this.f505c.get(lifecycleCameraRepositoryObserverM261b).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.f504b.get(it.next());
                Objects.requireNonNull(lifecycleCamera);
                if (!lifecycleCamera.m257k().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m263d(LifecycleCamera lifecycleCamera) {
        synchronized (this.f503a) {
            LifecycleOwner lifecycleOwnerM256j = lifecycleCamera.m256j();
            AutoValue_LifecycleCameraRepository_Key autoValue_LifecycleCameraRepository_Key = new AutoValue_LifecycleCameraRepository_Key(lifecycleOwnerM256j, lifecycleCamera.f501h.f36339j);
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverM261b = m261b(lifecycleOwnerM256j);
            Set<AbstractC0092a> hashSet = lifecycleCameraRepositoryObserverM261b != null ? this.f505c.get(lifecycleCameraRepositoryObserverM261b) : new HashSet<>();
            hashSet.add(autoValue_LifecycleCameraRepository_Key);
            this.f504b.put(autoValue_LifecycleCameraRepository_Key, lifecycleCamera);
            if (lifecycleCameraRepositoryObserverM261b == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(lifecycleOwnerM256j, this);
                this.f505c.put(lifecycleCameraRepositoryObserver, hashSet);
                lifecycleOwnerM256j.mo124b().mo16727a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m264e(LifecycleOwner lifecycleOwner) {
        synchronized (this.f503a) {
            if (m262c(lifecycleOwner)) {
                if (this.f506d.isEmpty()) {
                    this.f506d.push(lifecycleOwner);
                } else {
                    LifecycleOwner lifecycleOwnerPeek = this.f506d.peek();
                    if (!lifecycleOwner.equals(lifecycleOwnerPeek)) {
                        m266g(lifecycleOwnerPeek);
                        this.f506d.remove(lifecycleOwner);
                        this.f506d.push(lifecycleOwner);
                    }
                }
                m267h(lifecycleOwner);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m265f(LifecycleOwner lifecycleOwner) {
        synchronized (this.f503a) {
            this.f506d.remove(lifecycleOwner);
            m266g(lifecycleOwner);
            if (!this.f506d.isEmpty()) {
                m267h(this.f506d.peek());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m266g(LifecycleOwner lifecycleOwner) {
        synchronized (this.f503a) {
            Iterator<AbstractC0092a> it = this.f505c.get(m261b(lifecycleOwner)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.f504b.get(it.next());
                Objects.requireNonNull(lifecycleCamera);
                lifecycleCamera.m258l();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m267h(LifecycleOwner lifecycleOwner) {
        synchronized (this.f503a) {
            Iterator<AbstractC0092a> it = this.f505c.get(m261b(lifecycleOwner)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.f504b.get(it.next());
                Objects.requireNonNull(lifecycleCamera);
                if (!lifecycleCamera.m257k().isEmpty()) {
                    lifecycleCamera.m259m();
                }
            }
        }
    }
}
