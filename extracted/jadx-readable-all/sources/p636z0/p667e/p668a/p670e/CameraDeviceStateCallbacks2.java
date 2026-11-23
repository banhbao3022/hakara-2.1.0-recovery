package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z0.e.a.e.z0, reason: use source file name */
/* JADX INFO: compiled from: CameraDeviceStateCallbacks.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraDeviceStateCallbacks2 extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a */
    public final List<CameraDevice.StateCallback> f35832a = new ArrayList();

    public CameraDeviceStateCallbacks2(List<CameraDevice.StateCallback> list) {
        for (CameraDevice.StateCallback stateCallback : list) {
            if (!(stateCallback instanceof CameraDeviceStateCallbacks)) {
                this.f35832a.add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) {
        Iterator<CameraDevice.StateCallback> it = this.f35832a.iterator();
        while (it.hasNext()) {
            it.next().onClosed(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) {
        Iterator<CameraDevice.StateCallback> it = this.f35832a.iterator();
        while (it.hasNext()) {
            it.next().onDisconnected(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int i) {
        Iterator<CameraDevice.StateCallback> it = this.f35832a.iterator();
        while (it.hasNext()) {
            it.next().onError(cameraDevice, i);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        Iterator<CameraDevice.StateCallback> it = this.f35832a.iterator();
        while (it.hasNext()) {
            it.next().onOpened(cameraDevice);
        }
    }
}
