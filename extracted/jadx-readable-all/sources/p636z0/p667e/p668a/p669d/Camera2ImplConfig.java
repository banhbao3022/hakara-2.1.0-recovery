package p636z0.p667e.p668a.p669d;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p667e.p668a.p675f.CaptureRequestOptions;
import p636z0.p667e.p676b.ExtendableBuilder;
import p636z0.p667e.p676b.p677v1.AutoValue_Config_Option;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.MutableConfig;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;

/* JADX INFO: renamed from: z0.e.a.d.a, reason: use source file name */
/* JADX INFO: compiled from: Camera2ImplConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2ImplConfig extends CaptureRequestOptions {

    /* JADX INFO: renamed from: s */
    public static final Config3.a<Integer> f35415s = new AutoValue_Config_Option("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* JADX INFO: renamed from: t */
    public static final Config3.a<CameraDevice.StateCallback> f35416t = new AutoValue_Config_Option("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

    /* JADX INFO: renamed from: u */
    public static final Config3.a<CameraCaptureSession.StateCallback> f35417u = new AutoValue_Config_Option("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

    /* JADX INFO: renamed from: v */
    public static final Config3.a<CameraCaptureSession.CaptureCallback> f35418v = new AutoValue_Config_Option("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* JADX INFO: renamed from: w */
    public static final Config3.a<CameraEventCallbacks> f35419w = new AutoValue_Config_Option("camera2.cameraEvent.callback", CameraEventCallbacks.class, null);

    /* JADX INFO: renamed from: x */
    public static final Config3.a<Object> f35420x = new AutoValue_Config_Option("camera2.captureRequest.tag", Object.class, null);

    /* JADX INFO: renamed from: z0.e.a.d.a$a */
    /* JADX INFO: compiled from: Camera2ImplConfig.java */
    public static final class a implements ExtendableBuilder<Camera2ImplConfig> {

        /* JADX INFO: renamed from: a */
        public final MutableOptionsBundle f35421a = MutableOptionsBundle.m15434y();

        @Override // p636z0.p667e.p676b.ExtendableBuilder
        /* JADX INFO: renamed from: a */
        public MutableConfig mo15071a() {
            return this.f35421a;
        }

        /* JADX INFO: renamed from: c */
        public Camera2ImplConfig m15072c() {
            return new Camera2ImplConfig(OptionsBundle.m15339x(this.f35421a));
        }

        /* JADX INFO: renamed from: d */
        public <ValueT> a m15073d(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            Config3.a<Integer> aVar = Camera2ImplConfig.f35415s;
            StringBuilder sbM1556G = outline.m1556G("camera2.captureRequest.option.");
            sbM1556G.append(key.getName());
            this.f35421a.m15436A(new AutoValue_Config_Option(sbM1556G.toString(), Object.class, key), Config3.c.OPTIONAL, valuet);
            return this;
        }
    }

    public Camera2ImplConfig(Config3 config3) {
        super(config3);
    }
}
