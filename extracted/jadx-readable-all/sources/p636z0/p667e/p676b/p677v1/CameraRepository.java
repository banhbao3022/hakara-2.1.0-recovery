package p636z0.p667e.p676b.p677v1;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p667e.p668a.p670e.Camera2CameraFactory;
import p636z0.p667e.p676b.CameraUnavailableException;
import p636z0.p667e.p676b.InitializationException;
import p636z0.p667e.p676b.Logger8;
import p636z0.p693h.p694a.CallbackToFutureAdapter;

/* JADX INFO: renamed from: z0.e.b.v1.c0, reason: use source file name */
/* JADX INFO: compiled from: CameraRepository.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraRepository {

    /* JADX INFO: renamed from: a */
    public final Object f36114a = new Object();

    /* JADX INFO: renamed from: b */
    public final Map<String, CameraInternal2> f36115b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final Set<CameraInternal2> f36116c = new HashSet();

    /* JADX INFO: renamed from: d */
    public ListenableFuture<Void> f36117d;

    /* JADX INFO: renamed from: e */
    public CallbackToFutureAdapter<Void> f36118e;

    /* JADX INFO: renamed from: a */
    public LinkedHashSet<CameraInternal2> m15340a() {
        LinkedHashSet<CameraInternal2> linkedHashSet;
        synchronized (this.f36114a) {
            linkedHashSet = new LinkedHashSet<>(this.f36115b.values());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public void m15341b(CameraFactory cameraFactory) throws InitializationException {
        synchronized (this.f36114a) {
            try {
                try {
                    Camera2CameraFactory camera2CameraFactory = (Camera2CameraFactory) cameraFactory;
                    for (String str : camera2CameraFactory.m15143a()) {
                        Logger8.m15272a("CameraRepository", "Added camera: " + str, null);
                        this.f36115b.put(str, camera2CameraFactory.m15144b(str));
                    }
                } catch (CameraUnavailableException e) {
                    throw new InitializationException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
