package p636z0.p667e.p668a.p670e.p671w1;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.e.a.e.w1.k, reason: use source file name */
/* JADX INFO: compiled from: CameraManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraManagerCompat {

    /* JADX INFO: renamed from: a */
    public final b f35783a;

    /* JADX INFO: renamed from: b */
    public final Map<String, CameraCharacteristicsCompat> f35784b = new ArrayMap(4);

    /* JADX INFO: renamed from: z0.e.a.e.w1.k$a */
    /* JADX INFO: compiled from: CameraManagerCompat.java */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a */
        public final Executor f35785a;

        /* JADX INFO: renamed from: b */
        public final CameraManager.AvailabilityCallback f35786b;

        /* JADX INFO: renamed from: c */
        public final Object f35787c = new Object();

        /* JADX INFO: renamed from: d */
        public boolean f35788d = false;

        /* JADX INFO: renamed from: z0.e.a.e.w1.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CameraManagerCompat.java */
        public class RunnableC8566a implements Runnable {
            public RunnableC8566a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f35786b.onCameraAccessPrioritiesChanged();
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.k$a$b */
        /* JADX INFO: compiled from: CameraManagerCompat.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ String f35790f;

            public b(String str) {
                this.f35790f = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f35786b.onCameraAvailable(this.f35790f);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.k$a$c */
        /* JADX INFO: compiled from: CameraManagerCompat.java */
        public class c implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ String f35792f;

            public c(String str) {
                this.f35792f = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f35786b.onCameraUnavailable(this.f35792f);
            }
        }

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f35785a = executor;
            this.f35786b = availabilityCallback;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f35787c) {
                if (!this.f35788d) {
                    this.f35785a.execute(new RunnableC8566a());
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            synchronized (this.f35787c) {
                if (!this.f35788d) {
                    this.f35785a.execute(new b(str));
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            synchronized (this.f35787c) {
                if (!this.f35788d) {
                    this.f35785a.execute(new c(str));
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.w1.k$b */
    /* JADX INFO: compiled from: CameraManagerCompat.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo15216a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        /* JADX INFO: renamed from: b */
        void mo15217b(CameraManager.AvailabilityCallback availabilityCallback);

        /* JADX INFO: renamed from: c */
        CameraCharacteristics mo15218c(String str) throws CameraAccessExceptionCompat;

        /* JADX INFO: renamed from: d */
        void mo15219d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;
    }

    public CameraManagerCompat(b bVar) {
        this.f35783a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static CameraManagerCompat m15213a(Context context, Handler handler) {
        CameraManagerCompatBaseImpl cameraManagerCompatApi28Impl;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            cameraManagerCompatApi28Impl = new CameraManagerCompatApi29Impl(context);
        } else {
            cameraManagerCompatApi28Impl = i >= 28 ? new CameraManagerCompatApi28Impl(context) : new CameraManagerCompatBaseImpl(context, new CameraManagerCompatBaseImpl.a(handler));
        }
        return new CameraManagerCompat(cameraManagerCompatApi28Impl);
    }

    /* JADX INFO: renamed from: b */
    public CameraCharacteristicsCompat m15214b(String str) throws CameraAccessExceptionCompat {
        CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.f35784b) {
            cameraCharacteristicsCompat = this.f35784b.get(str);
            if (cameraCharacteristicsCompat == null) {
                CameraCharacteristicsCompat cameraCharacteristicsCompat2 = new CameraCharacteristicsCompat(this.f35783a.mo15218c(str));
                this.f35784b.put(str, cameraCharacteristicsCompat2);
                cameraCharacteristicsCompat = cameraCharacteristicsCompat2;
            }
        }
        return cameraCharacteristicsCompat;
    }

    /* JADX INFO: renamed from: c */
    public String[] m15215c() throws CameraAccessExceptionCompat {
        CameraManagerCompatBaseImpl cameraManagerCompatBaseImpl = (CameraManagerCompatBaseImpl) this.f35783a;
        Objects.requireNonNull(cameraManagerCompatBaseImpl);
        try {
            return cameraManagerCompatBaseImpl.f35794a.getCameraIdList();
        } catch (CameraAccessException e) {
            Set<Integer> set = CameraAccessExceptionCompat.f35712f;
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
