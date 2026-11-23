package p636z0.p667e.p676b.p677v1;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p667e.p676b.Logger8;

/* JADX INFO: renamed from: z0.e.b.v1.h1, reason: use source file name */
/* JADX INFO: compiled from: SessionConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class SessionConfig {

    /* JADX INFO: renamed from: a */
    public final List<DeferrableSurface> f36159a;

    /* JADX INFO: renamed from: b */
    public final List<CameraDevice.StateCallback> f36160b;

    /* JADX INFO: renamed from: c */
    public final List<CameraCaptureSession.StateCallback> f36161c;

    /* JADX INFO: renamed from: d */
    public final List<CameraCaptureCallback> f36162d;

    /* JADX INFO: renamed from: e */
    public final List<c> f36163e;

    /* JADX INFO: renamed from: f */
    public final CaptureConfig f36164f;

    /* JADX INFO: renamed from: z0.e.b.v1.h1$a */
    /* JADX INFO: compiled from: SessionConfig.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Set<DeferrableSurface> f36165a = new HashSet();

        /* JADX INFO: renamed from: b */
        public final CaptureConfig.a f36166b = new CaptureConfig.a();

        /* JADX INFO: renamed from: c */
        public final List<CameraDevice.StateCallback> f36167c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final List<CameraCaptureSession.StateCallback> f36168d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final List<c> f36169e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public final List<CameraCaptureCallback> f36170f = new ArrayList();
    }

    /* JADX INFO: renamed from: z0.e.b.v1.h1$b */
    /* JADX INFO: compiled from: SessionConfig.java */
    public static class b extends a {
        /* JADX INFO: renamed from: f */
        public static b m15372f(UseCaseConfig2<?> useCaseConfig2) {
            d dVarMo15117v = useCaseConfig2.mo15117v(null);
            if (dVarMo15117v != null) {
                b bVar = new b();
                dVarMo15117v.mo15200a(useCaseConfig2, bVar);
                return bVar;
            }
            StringBuilder sbM1556G = outline.m1556G("Implementation is missing option unpacker for ");
            sbM1556G.append(useCaseConfig2.mo15112o(useCaseConfig2.toString()));
            throw new IllegalStateException(sbM1556G.toString());
        }

        /* JADX INFO: renamed from: a */
        public void m15373a(CameraCaptureCallback cameraCaptureCallback) {
            this.f36166b.m15364b(cameraCaptureCallback);
            this.f36170f.add(cameraCaptureCallback);
        }

        /* JADX INFO: renamed from: b */
        public void m15374b(CameraDevice.StateCallback stateCallback) {
            if (this.f36167c.contains(stateCallback)) {
                throw new IllegalArgumentException("Duplicate device state callback.");
            }
            this.f36167c.add(stateCallback);
        }

        /* JADX INFO: renamed from: c */
        public void m15375c(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f36168d.contains(stateCallback)) {
                throw new IllegalArgumentException("Duplicate session state callback.");
            }
            this.f36168d.add(stateCallback);
        }

        /* JADX INFO: renamed from: d */
        public void m15376d(DeferrableSurface deferrableSurface) {
            this.f36165a.add(deferrableSurface);
            this.f36166b.f36149a.add(deferrableSurface);
        }

        /* JADX INFO: renamed from: e */
        public SessionConfig m15377e() {
            return new SessionConfig(new ArrayList(this.f36165a), this.f36167c, this.f36168d, this.f36170f, this.f36169e, this.f36166b.m15366d());
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.h1$c */
    /* JADX INFO: compiled from: SessionConfig.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo15290a(SessionConfig sessionConfig, e eVar);
    }

    /* JADX INFO: renamed from: z0.e.b.v1.h1$d */
    /* JADX INFO: compiled from: SessionConfig.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo15200a(UseCaseConfig2<?> useCaseConfig2, b bVar);
    }

    /* JADX INFO: renamed from: z0.e.b.v1.h1$e */
    /* JADX INFO: compiled from: SessionConfig.java */
    public enum e {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* JADX INFO: renamed from: z0.e.b.v1.h1$f */
    /* JADX INFO: compiled from: SessionConfig.java */
    public static final class f extends a {

        /* JADX INFO: renamed from: g */
        public boolean f36174g = true;

        /* JADX INFO: renamed from: h */
        public boolean f36175h = false;

        /* JADX INFO: renamed from: a */
        public void m15378a(SessionConfig sessionConfig) {
            Map<String, Integer> map;
            CaptureConfig captureConfig = sessionConfig.f36164f;
            int i = captureConfig.f36145e;
            if (i != -1) {
                if (!this.f36175h) {
                    this.f36166b.f36151c = i;
                    this.f36175h = true;
                } else if (this.f36166b.f36151c != i) {
                    StringBuilder sbM1556G = outline.m1556G("Invalid configuration due to template type: ");
                    sbM1556G.append(this.f36166b.f36151c);
                    sbM1556G.append(" != ");
                    sbM1556G.append(captureConfig.f36145e);
                    Logger8.m15272a("ValidatingBuilder", sbM1556G.toString(), null);
                    this.f36174g = false;
                }
            }
            TagBundle tagBundle = sessionConfig.f36164f.f36148h;
            Map<String, Integer> map2 = this.f36166b.f36154f.f36213b;
            if (map2 != null && (map = tagBundle.f36213b) != null) {
                map2.putAll(map);
            }
            this.f36167c.addAll(sessionConfig.f36160b);
            this.f36168d.addAll(sessionConfig.f36161c);
            this.f36166b.m15363a(sessionConfig.f36164f.f36146f);
            this.f36170f.addAll(sessionConfig.f36162d);
            this.f36169e.addAll(sessionConfig.f36163e);
            this.f36165a.addAll(sessionConfig.m15371b());
            this.f36166b.f36149a.addAll(captureConfig.m15362a());
            if (!this.f36165a.containsAll(this.f36166b.f36149a)) {
                Logger8.m15272a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces", null);
                this.f36174g = false;
            }
            this.f36166b.m15365c(captureConfig.f36144d);
        }

        /* JADX INFO: renamed from: b */
        public SessionConfig m15379b() {
            if (this.f36174g) {
                return new SessionConfig(new ArrayList(this.f36165a), this.f36167c, this.f36168d, this.f36170f, this.f36169e, this.f36166b.m15366d());
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
    }

    public SessionConfig(List<DeferrableSurface> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<CameraCaptureCallback> list4, List<c> list5, CaptureConfig captureConfig) {
        this.f36159a = list;
        this.f36160b = Collections.unmodifiableList(list2);
        this.f36161c = Collections.unmodifiableList(list3);
        this.f36162d = Collections.unmodifiableList(list4);
        this.f36163e = Collections.unmodifiableList(list5);
        this.f36164f = captureConfig;
    }

    /* JADX INFO: renamed from: a */
    public static SessionConfig m15370a() {
        return new SessionConfig(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new CaptureConfig.a().m15366d());
    }

    /* JADX INFO: renamed from: b */
    public List<DeferrableSurface> m15371b() {
        return Collections.unmodifiableList(this.f36159a);
    }
}
