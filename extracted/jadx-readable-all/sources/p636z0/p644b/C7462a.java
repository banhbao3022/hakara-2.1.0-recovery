package p636z0.p644b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.p653h.TooltipCompatHandler;
import p636z0.p644b.p653h.WithHint;
import p636z0.p667e.p668a.p670e.p671w1.CameraAccessExceptionCompat;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;
import p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat;
import p636z0.p667e.p668a.p670e.p671w1.p673p.AeFpsRangeLegacyQuirk;
import p636z0.p667e.p668a.p670e.p671w1.p673p.AspectRatioLegacyApi21Quirk;
import p636z0.p667e.p668a.p670e.p671w1.p673p.JpegHalCorruptImageQuirk;
import p636z0.p667e.p668a.p675f.CaptureRequestOptions;
import p636z0.p667e.p676b.CameraSelector;
import p636z0.p667e.p676b.CameraUnavailableException;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.p677v1.CameraRepository;
import p636z0.p667e.p676b.p677v1.CameraValidator;
import p636z0.p667e.p676b.p677v1.CaptureConfig;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.Quirks;
import p636z0.p667e.p676b.p677v1.p678r1.p679b.DirectExecutor;
import p636z0.p667e.p676b.p677v1.p678r1.p679b.HandlerScheduledExecutorService;
import p636z0.p667e.p676b.p677v1.p678r1.p679b.HighPriorityExecutor;
import p636z0.p667e.p676b.p677v1.p678r1.p679b.MainThreadExecutor2;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7462a {

    /* JADX INFO: renamed from: a */
    public static Field f34377a;

    /* JADX INFO: renamed from: b */
    public static boolean f34378b;

    /* JADX INFO: renamed from: c */
    public static Class<?> f34379c;

    /* JADX INFO: renamed from: d */
    public static boolean f34380d;

    /* JADX INFO: renamed from: e */
    public static Field f34381e;

    /* JADX INFO: renamed from: f */
    public static boolean f34382f;

    /* JADX INFO: renamed from: g */
    public static Field f34383g;

    /* JADX INFO: renamed from: h */
    public static boolean f34384h;

    /* JADX INFO: renamed from: a */
    public static void m14564a(CaptureRequest.Builder builder, Config3 config3) {
        CaptureRequestOptions captureRequestOptionsM15245c = CaptureRequestOptions.a.m15244d(config3).m15245c();
        for (Config3.a<?> aVar : captureRequestOptionsM15245c.mo15104c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.mo15384b();
            try {
                builder.set(key, captureRequestOptionsM15245c.mo15107h().mo15102a(aVar));
            } catch (IllegalArgumentException unused) {
                Logger8.m15273b("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static CaptureRequest m14565b(CaptureConfig captureConfig, CameraDevice cameraDevice, Map<DeferrableSurface, Surface> map) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        List<DeferrableSurface> listM15362a = captureConfig.m15362a();
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = listM15362a.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(captureConfig.f36145e);
        m14564a(builderCreateCaptureRequest, captureConfig.f36144d);
        Config3 config3 = captureConfig.f36144d;
        Config3.a<Integer> aVar = CaptureConfig.f36141a;
        if (config3.mo15103b(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) captureConfig.f36144d.mo15102a(aVar));
        }
        Config3 config4 = captureConfig.f36144d;
        Config3.a<Integer> aVar2 = CaptureConfig.f36142b;
        if (config4.mo15103b(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) captureConfig.f36144d.mo15102a(aVar2)).byteValue()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(captureConfig.f36148h);
        return builderCreateCaptureRequest.build();
    }

    /* JADX INFO: renamed from: c */
    public static void m14566c() {
        C8162a.m16065j(m14575l(), "Not in application's main thread");
    }

    /* JADX INFO: renamed from: d */
    public static CameraUnavailableException m14567d(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int i = cameraAccessExceptionCompat.f35713g;
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = 2;
            } else if (i == 3) {
                i2 = 3;
            } else if (i == 4) {
                i2 = 4;
            } else if (i != 5) {
                i2 = i != 10001 ? 0 : 6;
            } else {
                i2 = 5;
            }
        }
        return new CameraUnavailableException(i2, cameraAccessExceptionCompat);
    }

    /* JADX INFO: renamed from: e */
    public static String m14568e(CameraManagerCompat cameraManagerCompat, Integer num, List<String> list) throws CameraAccessExceptionCompat {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) cameraManagerCompat.m15214b("0").m15209a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) cameraManagerCompat.m15214b("1").m15209a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Executor m14569f() {
        if (DirectExecutor.f36244f != null) {
            return DirectExecutor.f36244f;
        }
        synchronized (DirectExecutor.class) {
            if (DirectExecutor.f36244f == null) {
                DirectExecutor.f36244f = new DirectExecutor();
            }
        }
        return DirectExecutor.f36244f;
    }

    /* JADX INFO: renamed from: g */
    public static void m14570g(Object obj) {
        if (!f34380d) {
            try {
                f34379c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f34380d = true;
        }
        Class<?> cls = f34379c;
        if (cls == null) {
            return;
        }
        if (!f34382f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f34381e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f34382f = true;
        }
        Field field = f34381e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* JADX INFO: renamed from: h */
    public static Quirks m14571h(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        ArrayList arrayList = new ArrayList();
        Integer num = (Integer) cameraCharacteristicsCompat.m15209a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            arrayList.add(new AeFpsRangeLegacyQuirk(cameraCharacteristicsCompat));
        }
        Integer num2 = (Integer) cameraCharacteristicsCompat.m15209a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num2 != null && num2.intValue() == 2 && Build.VERSION.SDK_INT == 21) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        Set<String> set = JpegHalCorruptImageQuirk.f35820a;
        Integer num3 = (Integer) cameraCharacteristicsCompat.m15209a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Objects.requireNonNull(num3);
        if (JpegHalCorruptImageQuirk.f35820a.contains(Build.DEVICE.toLowerCase(Locale.US)) && JpegHalCorruptImageQuirk.f35821b.contains(Integer.valueOf(num3.intValue()))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        return new Quirks(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static int m14572i(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (Logger8.m15274c("CameraOrientationUtil")) {
            Logger8.m15272a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)), null);
        }
        return i3;
    }

    /* JADX INFO: renamed from: j */
    public static Executor m14573j() {
        if (HighPriorityExecutor.f36255f != null) {
            return HighPriorityExecutor.f36255f;
        }
        synchronized (HighPriorityExecutor.class) {
            if (HighPriorityExecutor.f36255f == null) {
                HighPriorityExecutor.f36255f = new HighPriorityExecutor();
            }
        }
        return HighPriorityExecutor.f36255f;
    }

    /* JADX INFO: renamed from: k */
    public static void m14574k(List<DeferrableSurface> list) throws DeferrableSurface.a {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                list.get(i).m15392e();
                i++;
            } catch (DeferrableSurface.a e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    list.get(i2).m15389b();
                }
                throw e;
            }
        } while (i < list.size());
    }

    /* JADX INFO: renamed from: l */
    public static boolean m14575l() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: renamed from: m */
    public static ScheduledExecutorService m14576m() {
        if (MainThreadExecutor2.f36257a != null) {
            return MainThreadExecutor2.f36257a;
        }
        synchronized (MainThreadExecutor2.class) {
            if (MainThreadExecutor2.f36257a == null) {
                MainThreadExecutor2.f36257a = new HandlerScheduledExecutorService(new Handler(Looper.getMainLooper()));
            }
        }
        return MainThreadExecutor2.f36257a;
    }

    /* JADX INFO: renamed from: n */
    public static InputConnection m14577n(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof WithHint) {
                    editorInfo.hintText = ((WithHint) parent).m14888a();
                    break;
                }
            }
        }
        return inputConnection;
    }

    /* JADX INFO: renamed from: o */
    public static void m14578o(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler = TooltipCompatHandler.f34952f;
        if (tooltipCompatHandler != null && tooltipCompatHandler.f34954h == view) {
            TooltipCompatHandler.m14839c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new TooltipCompatHandler(view, charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler2 = TooltipCompatHandler.f34953g;
        if (tooltipCompatHandler2 != null && tooltipCompatHandler2.f34954h == view) {
            tooltipCompatHandler2.m14841b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: renamed from: p */
    public static int m14579p(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(outline.m1590l("Unsupported surface rotation: ", i));
    }

    /* JADX INFO: renamed from: q */
    public static void m14580q(Context context, CameraRepository cameraRepository) throws CameraValidator {
        PackageManager packageManager = context.getPackageManager();
        StringBuilder sbM1556G = outline.m1556G("Verifying camera lens facing on ");
        sbM1556G.append(Build.DEVICE);
        Logger8.m15272a("CameraValidator", sbM1556G.toString(), null);
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                CameraSelector.f36010b.m15295a(cameraRepository.m15340a()).iterator().next();
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                CameraSelector.f36009a.m15295a(cameraRepository.m15340a()).iterator().next();
            }
        } catch (IllegalArgumentException e) {
            StringBuilder sbM1556G2 = outline.m1556G("Camera LensFacing verification failed, existing cameras: ");
            sbM1556G2.append(cameraRepository.m15340a());
            Logger8.m15273b("CameraValidator", sbM1556G2.toString(), null);
            throw new CameraValidator("Expected camera missing from device.", e);
        }
    }
}
