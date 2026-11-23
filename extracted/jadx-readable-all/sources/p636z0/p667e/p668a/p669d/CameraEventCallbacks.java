package p636z0.p667e.p668a.p669d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p636z0.p667e.p676b.p677v1.MultiValueSet;

/* JADX INFO: renamed from: z0.e.a.d.c, reason: use source file name */
/* JADX INFO: compiled from: CameraEventCallbacks.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraEventCallbacks extends MultiValueSet<CameraEventCallback> {

    /* JADX INFO: renamed from: z0.e.a.d.c$a */
    /* JADX INFO: compiled from: CameraEventCallbacks.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<CameraEventCallback> f35422a = new ArrayList();

        public a(List<CameraEventCallback> list) {
            Iterator<CameraEventCallback> it = list.iterator();
            while (it.hasNext()) {
                this.f35422a.add(it.next());
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public CameraEventCallbacks(CameraEventCallback... cameraEventCallbackArr) {
        this.f36311a.addAll(Arrays.asList(cameraEventCallbackArr));
    }

    /* JADX INFO: renamed from: d */
    public static CameraEventCallbacks m15074d() {
        return new CameraEventCallbacks(new CameraEventCallback[0]);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p636z0.p667e.p676b.p677v1.MultiValueSet
    /* JADX INFO: renamed from: a */
    public MultiValueSet<CameraEventCallback> clone() {
        CameraEventCallbacks cameraEventCallbacksM15074d = m15074d();
        cameraEventCallbacksM15074d.f36311a.addAll(m15433b());
        return cameraEventCallbacksM15074d;
    }

    /* JADX INFO: renamed from: c */
    public a m15076c() {
        return new a(m15433b());
    }
}
