package p636z0.p667e.p676b.p677v1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p636z0.p667e.p676b.Camera2;
import p636z0.p667e.p676b.Logger8;

/* JADX INFO: renamed from: z0.e.b.v1.d0, reason: use source file name */
/* JADX INFO: compiled from: CameraStateRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraStateRegistry {

    /* JADX INFO: renamed from: c */
    public final int f36125c;

    /* JADX INFO: renamed from: e */
    public int f36127e;

    /* JADX INFO: renamed from: a */
    public final StringBuilder f36123a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final Object f36124b = new Object();

    /* JADX INFO: renamed from: d */
    public final Map<Camera2, a> f36126d = new HashMap();

    /* JADX INFO: renamed from: z0.e.b.v1.d0$a */
    /* JADX INFO: compiled from: CameraStateRegistry.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public CameraInternal2.a f36128a = null;

        /* JADX INFO: renamed from: b */
        public final Executor f36129b;

        /* JADX INFO: renamed from: c */
        public final b f36130c;

        public a(CameraInternal2.a aVar, Executor executor, b bVar) {
            this.f36129b = executor;
            this.f36130c = bVar;
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.d0$b */
    /* JADX INFO: compiled from: CameraStateRegistry.java */
    public interface b {
    }

    public CameraStateRegistry(int i) {
        this.f36125c = i;
        synchronized ("mLock") {
            this.f36127e = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15349a(CameraInternal2.a aVar) {
        return aVar != null && aVar.f36109n;
    }

    /* JADX INFO: renamed from: b */
    public final void m15350b() {
        if (Logger8.m15274c("CameraStateRegistry")) {
            this.f36123a.setLength(0);
            this.f36123a.append("Recalculating open cameras:\n");
            this.f36123a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f36123a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry<Camera2, a> entry : this.f36126d.entrySet()) {
            if (Logger8.m15274c("CameraStateRegistry")) {
                this.f36123a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().f36128a != null ? entry.getValue().f36128a.toString() : "UNKNOWN"));
            }
            if (m15349a(entry.getValue().f36128a)) {
                i++;
            }
        }
        if (Logger8.m15274c("CameraStateRegistry")) {
            this.f36123a.append("-------------------------------------------------------------------\n");
            this.f36123a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f36125c)));
            Logger8.m15272a("CameraStateRegistry", this.f36123a.toString(), null);
        }
        this.f36127e = Math.max(this.f36125c - i, 0);
    }
}
