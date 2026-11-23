package p636z0.p667e.p668a.p670e.p671w1;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat;
import p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat;
import p636z0.p667e.p676b.Logger8;

/* JADX INFO: renamed from: z0.e.a.e.w1.j, reason: use source file name */
/* JADX INFO: compiled from: CameraDeviceCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraDeviceCompatBaseImpl implements CameraDeviceCompat.a {

    /* JADX INFO: renamed from: a */
    public final CameraDevice f35780a;

    /* JADX INFO: renamed from: b */
    public final Object f35781b;

    /* JADX INFO: renamed from: z0.e.a.e.w1.j$a */
    /* JADX INFO: compiled from: CameraDeviceCompatBaseImpl.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Handler f35782a;

        public a(Handler handler) {
            this.f35782a = handler;
        }
    }

    public CameraDeviceCompatBaseImpl(CameraDevice cameraDevice, Object obj) {
        Objects.requireNonNull(cameraDevice);
        this.f35780a = cameraDevice;
        this.f35781b = obj;
    }

    /* JADX INFO: renamed from: b */
    public static void m15211b(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat) {
        Objects.requireNonNull(cameraDevice);
        Objects.requireNonNull(sessionConfigurationCompat);
        Objects.requireNonNull(sessionConfigurationCompat.m15230e());
        List<OutputConfigurationCompat> listM15228c = sessionConfigurationCompat.m15228c();
        if (listM15228c == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (sessionConfigurationCompat.m15226a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id = cameraDevice.getId();
        Iterator<OutputConfigurationCompat> it = listM15228c.iterator();
        while (it.hasNext()) {
            String strMo15223b = it.next().f35803a.mo15223b();
            if (strMo15223b != null && !strMo15223b.isEmpty()) {
                Logger8.m15276e("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + strMo15223b + ". Ignoring.", null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<Surface> m15212c(List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfigurationCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f35803a.mo15222a());
        }
        return arrayList;
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraDeviceCompat.a
    /* JADX INFO: renamed from: a */
    public void mo15210a(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessException {
        m15211b(this.f35780a, sessionConfigurationCompat);
        if (sessionConfigurationCompat.m15227b() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        }
        if (sessionConfigurationCompat.m15229d() == 1) {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        CameraCaptureSessionCompat.c cVar = new CameraCaptureSessionCompat.c(sessionConfigurationCompat.m15226a(), sessionConfigurationCompat.m15230e());
        this.f35780a.createCaptureSession(m15212c(sessionConfigurationCompat.m15228c()), cVar, ((a) this.f35781b).f35782a);
    }
}
