package p636z0.p667e.p668a.p670e.p671w1;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat;

/* JADX INFO: renamed from: z0.e.a.e.w1.f, reason: use source file name */
/* JADX INFO: compiled from: CameraDeviceCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraDeviceCompat {

    /* JADX INFO: renamed from: a */
    public final a f35768a;

    /* JADX INFO: renamed from: z0.e.a.e.w1.f$a */
    /* JADX INFO: compiled from: CameraDeviceCompat.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo15210a(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessException;
    }

    /* JADX INFO: renamed from: z0.e.a.e.w1.f$b */
    /* JADX INFO: compiled from: CameraDeviceCompat.java */
    public static final class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        public final CameraDevice.StateCallback f35769a;

        /* JADX INFO: renamed from: b */
        public final Executor f35770b;

        /* JADX INFO: renamed from: z0.e.a.e.w1.f$b$a */
        /* JADX INFO: compiled from: CameraDeviceCompat.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraDevice f35771f;

            public a(CameraDevice cameraDevice) {
                this.f35771f = cameraDevice;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35769a.onOpened(this.f35771f);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.f$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CameraDeviceCompat.java */
        public class RunnableC8565b implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraDevice f35773f;

            public RunnableC8565b(CameraDevice cameraDevice) {
                this.f35773f = cameraDevice;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35769a.onDisconnected(this.f35773f);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.f$b$c */
        /* JADX INFO: compiled from: CameraDeviceCompat.java */
        public class c implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraDevice f35775f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f35776g;

            public c(CameraDevice cameraDevice, int i) {
                this.f35775f = cameraDevice;
                this.f35776g = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35769a.onError(this.f35775f, this.f35776g);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.f$b$d */
        /* JADX INFO: compiled from: CameraDeviceCompat.java */
        public class d implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraDevice f35778f;

            public d(CameraDevice cameraDevice) {
                this.f35778f = cameraDevice;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35769a.onClosed(this.f35778f);
            }
        }

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f35770b = executor;
            this.f35769a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            this.f35770b.execute(new d(cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            this.f35770b.execute(new RunnableC8565b(cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            this.f35770b.execute(new c(cameraDevice, i));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            this.f35770b.execute(new a(cameraDevice));
        }
    }

    public CameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f35768a = new CameraDeviceCompatApi28Impl(cameraDevice);
            return;
        }
        if (i >= 24) {
            this.f35768a = new CameraDeviceCompatApi24Impl(cameraDevice, new CameraDeviceCompatBaseImpl.a(handler));
        } else if (i >= 23) {
            this.f35768a = new CameraDeviceCompatApi23Impl(cameraDevice, new CameraDeviceCompatBaseImpl.a(handler));
        } else {
            this.f35768a = new CameraDeviceCompatBaseImpl(cameraDevice, new CameraDeviceCompatBaseImpl.a(handler));
        }
    }
}
