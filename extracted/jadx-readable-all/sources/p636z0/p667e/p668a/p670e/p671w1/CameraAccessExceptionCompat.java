package p636z0.p667e.p668a.p670e.p671w1;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: z0.e.a.e.w1.a, reason: use source file name */
/* JADX INFO: compiled from: CameraAccessExceptionCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {

    /* JADX INFO: renamed from: f */
    public static final Set<Integer> f35712f = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: g */
    public final int f35713g;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public CameraAccessExceptionCompat(int i) {
        super(m15205b(i));
        this.f35713g = i;
        if (f35712f.contains(Integer.valueOf(i))) {
            new CameraAccessException(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m15204a(int i, String str) {
        String str2;
        if (i == 1) {
            str2 = "CAMERA_DISABLED";
        } else if (i == 2) {
            str2 = "CAMERA_DISCONNECTED";
        } else if (i == 3) {
            str2 = "CAMERA_ERROR";
        } else if (i == 4) {
            str2 = "CAMERA_IN_USE";
        } else if (i == 5) {
            str2 = "MAX_CAMERAS_IN_USE";
        } else if (i == 1000) {
            str2 = "CAMERA_DEPRECATED_HAL";
        } else if (i != 10001) {
            str2 = i != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR";
        } else {
            str2 = "CAMERA_UNAVAILABLE_DO_NOT_DISTURB";
        }
        return String.format("%s (%d): %s", str2, Integer.valueOf(i), str);
    }

    /* JADX INFO: renamed from: b */
    public static String m15205b(int i) {
        if (i == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i == 4) {
            return "The camera device is in use already";
        }
        if (i == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    public CameraAccessExceptionCompat(int i, String str) {
        super(m15204a(i, str));
        this.f35713g = i;
        if (f35712f.contains(Integer.valueOf(i))) {
            new CameraAccessException(i, str);
        }
    }

    public CameraAccessExceptionCompat(int i, String str, Throwable th) {
        super(m15204a(i, str), th);
        this.f35713g = i;
        if (f35712f.contains(Integer.valueOf(i))) {
            new CameraAccessException(i, str, th);
        }
    }

    public CameraAccessExceptionCompat(int i, Throwable th) {
        super(m15205b(i), th);
        this.f35713g = i;
        if (f35712f.contains(Integer.valueOf(i))) {
            new CameraAccessException(i, null, th);
        }
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f35713g = cameraAccessException.getReason();
    }
}
