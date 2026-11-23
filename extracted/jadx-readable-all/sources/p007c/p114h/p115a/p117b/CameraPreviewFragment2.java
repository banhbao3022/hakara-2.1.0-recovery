package p007c.p114h.p115a.p117b;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import com.cgfay.camera.widget.CameraMeasureFrameLayout;
import com.cgfay.media.CainCommandEditor;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p115a.p116a.CameraParam;
import p007c.p114h.p115a.p116a.CameraXController;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p115a.p120e.CameraRenderHandler;
import p007c.p114h.p115a.p120e.CameraRenderer;
import p007c.p114h.p115a.p120e.GLImageReader;
import p007c.p114h.p115a.p120e.RenderManager;
import p007c.p114h.p115a.p121f.CameraTextureView2;
import p007c.p114h.p115a.p121f.PreviewMeasureListener;
import p007c.p114h.p122b.C0868a;
import p007c.p114h.p123c.p124a.FaceTracker;
import p007c.p114h.p123c.p124a.FaceTrackerBuilder;
import p007c.p114h.p144e.LandmarkEngine;
import p007c.p114h.p145f.p146b.AudioParams;
import p007c.p114h.p145f.p146b.AudioRecorder;
import p007c.p114h.p145f.p146b.HWMediaRecorder;
import p007c.p114h.p145f.p146b.VideoParams;
import p007c.p114h.p145f.p146b.VideoRecorder;
import p007c.p114h.p147g.p149b.PermissionConfirmDialogFragment;
import p007c.p114h.p147g.p149b.PermissionErrorDialogFragment;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p655c.p656a.p659c.Function3;
import p636z0.p667e.p676b.CameraSelector;
import p636z0.p667e.p676b.CameraX2;
import p636z0.p667e.p676b.CameraXConfig;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.ChainingListenableFuture;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures;
import p636z0.p667e.p684c.C7911a;
import p636z0.p667e.p684c.ProcessCameraProvider;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p735h.ExecutorCompat;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p752p.p753c.FragmentHostCallback;

/* JADX INFO: renamed from: c.h.a.b.d, reason: use source file name */
/* JADX INFO: compiled from: CameraPreviewFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraPreviewFragment2 extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ int f3867c0 = 0;

    /* JADX INFO: renamed from: d0 */
    public CameraParam f3868d0;

    /* JADX INFO: renamed from: e0 */
    public View f3869e0;

    /* JADX INFO: renamed from: f0 */
    public CameraMeasureFrameLayout f3870f0;

    /* JADX INFO: renamed from: g0 */
    public CameraTextureView2 f3871g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f3872h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f3873i0;

    /* JADX INFO: renamed from: j0 */
    public final Handler f3874j0;

    /* JADX INFO: renamed from: k0 */
    public FragmentActivity f3875k0;

    /* JADX INFO: renamed from: l0 */
    public CameraPreviewPresenter f3876l0;

    /* JADX INFO: renamed from: m0 */
    public String f3877m0;

    /* JADX INFO: renamed from: n0 */
    public int f3878n0;

    /* JADX INFO: renamed from: o0 */
    public int f3879o0;

    /* JADX INFO: renamed from: p0 */
    public CameraTextureView2.c f3880p0;

    /* JADX INFO: renamed from: q0 */
    public CameraTextureView2.b f3881q0;

    /* JADX INFO: renamed from: r0 */
    public TextureView.SurfaceTextureListener f3882r0;

    /* JADX INFO: renamed from: s0 */
    public Toast f3883s0;

    /* JADX INFO: renamed from: c.h.a.b.d$a */
    /* JADX INFO: compiled from: CameraPreviewFragment.java */
    public class a implements CameraTextureView2.c {
        public a() {
        }
    }

    /* JADX INFO: renamed from: c.h.a.b.d$b */
    /* JADX INFO: compiled from: CameraPreviewFragment.java */
    public class b implements CameraTextureView2.b {
        public b() {
        }
    }

    /* JADX INFO: renamed from: c.h.a.b.d$c */
    /* JADX INFO: compiled from: CameraPreviewFragment.java */
    public class c implements TextureView.SurfaceTextureListener {
        public c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            CameraRenderHandler cameraRenderHandlerM2087d = CameraPreviewFragment2.this.f3876l0.f3907r.m2087d();
            cameraRenderHandlerM2087d.sendMessage(cameraRenderHandlerM2087d.obtainMessage(1, surfaceTexture));
            CameraRenderHandler cameraRenderHandlerM2087d2 = CameraPreviewFragment2.this.f3876l0.f3907r.m2087d();
            cameraRenderHandlerM2087d2.sendMessage(cameraRenderHandlerM2087d2.obtainMessage(2, i, i2));
            Log.d("CameraPreviewFragment", "onSurfaceTextureAvailable: ");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            CameraRenderHandler cameraRenderHandlerM2087d = CameraPreviewFragment2.this.f3876l0.f3907r.m2087d();
            cameraRenderHandlerM2087d.sendMessage(cameraRenderHandlerM2087d.obtainMessage(3));
            Log.d("CameraPreviewFragment", "onSurfaceTextureDestroyed: ");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            CameraRenderHandler cameraRenderHandlerM2087d = CameraPreviewFragment2.this.f3876l0.f3907r.m2087d();
            cameraRenderHandlerM2087d.sendMessage(cameraRenderHandlerM2087d.obtainMessage(2, i, i2));
            Log.d("CameraPreviewFragment", "onSurfaceTextureSizeChanged: ");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public CameraPreviewFragment2(String str, int i, int i2) {
        this.f3877m0 = "";
        this.f3878n0 = 0;
        this.f3879o0 = 0;
        this.f3880p0 = new a();
        this.f3881q0 = new b();
        this.f3882r0 = new c();
        this.f3877m0 = str;
        this.f3878n0 = i;
        this.f3879o0 = i2;
        this.f3868d0 = CameraParam.f3841a;
        this.f3874j0 = new Handler(Looper.getMainLooper());
        this.f3876l0 = new CameraPreviewPresenter(this);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: W */
    public void mo2065W(Bundle bundle) {
        this.f38414K = true;
        if (C0868a.m2112h(this.f3875k0, "android.permission.CAMERA")) {
            m2068Y0(this.f3869e0);
        } else {
            C0868a.m2113i(this);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m2066W0(String str) {
        Log.d("PHAN finishRecord:", str);
        File file = new File(str);
        File file2 = new File(this.f3877m0);
        Log.d("PHAN target:", file2.getPath());
        if (file.getParentFile().exists() && file.exists() && file.renameTo(file2)) {
            Log.i("CameraPreviewFragment", "Success");
        } else {
            Log.i("CameraPreviewFragment", "Fail");
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m2067X0() {
        this.f3872h0 = this.f3872h0;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m2068Y0(View view) {
        this.f3870f0 = (CameraMeasureFrameLayout) this.f3869e0.findViewById(R.id.layout_camera_preview);
        CameraTextureView2 cameraTextureView2 = new CameraTextureView2(this.f3875k0);
        this.f3871g0 = cameraTextureView2;
        cameraTextureView2.f3955f = this.f3880p0;
        cameraTextureView2.f3956g = this.f3881q0;
        cameraTextureView2.setSurfaceTextureListener(this.f3882r0);
        this.f3870f0.addView(this.f3871g0);
        CameraMeasureFrameLayout cameraMeasureFrameLayout = this.f3870f0;
        cameraMeasureFrameLayout.setOnMeasureListener(new PreviewMeasureListener(cameraMeasureFrameLayout));
        m2067X0();
        Objects.requireNonNull(this.f3868d0);
        if (!C0868a.m2112h(this.f3875k0, "android.permission.RECORD_AUDIO")) {
            FragmentHostCallback<?> fragmentHostCallback = this.f38451z;
            if (fragmentHostCallback != null ? fragmentHostCallback.mo16584j("android.permission.RECORD_AUDIO") : false) {
                PermissionConfirmDialogFragment.m2216d1(m16546Q(R.string.request_sound_permission), 3, false).mo5469c1(m16570w(), "dialog");
            } else {
                m16523D0(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            }
        }
        Objects.requireNonNull(this.f3868d0);
        CameraPreviewPresenter cameraPreviewPresenter = this.f3876l0;
        HWMediaRecorder hWMediaRecorder = cameraPreviewPresenter.f3901l;
        if (hWMediaRecorder != null) {
            hWMediaRecorder.f4319c = false;
        }
        long j2 = 15000000;
        cameraPreviewPresenter.f3900k = j2;
        cameraPreviewPresenter.f3899j = j2;
        cameraPreviewPresenter.f3894e.f4370f = j2;
        Objects.requireNonNull(cameraPreviewPresenter.f3895f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        int i;
        int i2;
        super.mo463Z(context);
        if (context instanceof Activity) {
            this.f3875k0 = (FragmentActivity) context;
        } else {
            this.f3875k0 = m16562f();
        }
        CameraPreviewPresenter cameraPreviewPresenter = this.f3876l0;
        FragmentActivity fragmentActivity = this.f3875k0;
        cameraPreviewPresenter.f3893d = fragmentActivity;
        VideoParams videoParams = cameraPreviewPresenter.f3894e;
        StringBuilder sbM1556G = outline.m1556G((!"mounted".equals(Environment.getExternalStorageState()) || fragmentActivity.getExternalCacheDir() == null) ? fragmentActivity.getCacheDir().getAbsolutePath() : fragmentActivity.getExternalCacheDir().getAbsolutePath());
        String str = File.separator;
        String strM1550A = outline.m1550A(sbM1556G, str, "temp.mp4");
        File file = new File(strM1550A);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        videoParams.f4368d = strM1550A;
        AudioParams audioParams = cameraPreviewPresenter.f3895f;
        FragmentActivity fragmentActivity2 = cameraPreviewPresenter.f3893d;
        String strM1600v = outline.m1600v("mounted".equals(Environment.getExternalStorageState()) ? fragmentActivity2.getExternalCacheDir().getAbsolutePath() : fragmentActivity2.getCacheDir().getAbsolutePath(), str, "temp.aac");
        File file2 = new File(strM1600v);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        audioParams.f4295f = strM1600v;
        CameraRenderer cameraRenderer = cameraPreviewPresenter.f3907r;
        synchronized (cameraRenderer) {
            if (!cameraRenderer.f3930v) {
                cameraRenderer.start();
                cameraRenderer.f3930v = true;
            }
        }
        FragmentActivity fragmentActivity3 = cameraPreviewPresenter.f3893d;
        CameraPreviewFragment2 cameraPreviewFragment2 = (CameraPreviewFragment2) cameraPreviewPresenter.f3908a;
        CameraXController cameraXController = new CameraXController(fragmentActivity3, cameraPreviewFragment2.f3878n0, cameraPreviewFragment2.f3879o0);
        cameraPreviewPresenter.f3906q = cameraXController;
        cameraXController.f3858k = cameraPreviewPresenter;
        cameraXController.f3860m = cameraPreviewPresenter;
        cameraXController.f3859l = cameraPreviewPresenter;
        try {
            i = Settings.System.getInt(cameraPreviewPresenter.f3893d.getContentResolver(), "screen_brightness_mode");
        } catch (Exception e) {
            Log.e("BrightnessUtils", "getSystemBrightnessMode: ", e);
            i = 0;
        }
        if (i == 1) {
            cameraPreviewPresenter.f3892c.f3844d = -1;
        } else {
            CameraParam cameraParam = cameraPreviewPresenter.f3892c;
            try {
                i2 = Settings.System.getInt(cameraPreviewPresenter.f3893d.getContentResolver(), "screen_brightness");
            } catch (Exception e2) {
                Log.e("BrightnessUtils", "getSystemBrightness: ", e2);
                i2 = 255;
            }
            cameraParam.f3844d = i2;
        }
        FaceTracker faceTracker = FaceTracker.b.f3965a;
        Objects.requireNonNull(faceTracker);
        FaceTrackerBuilder faceTrackerBuilder = new FaceTrackerBuilder(faceTracker, cameraPreviewPresenter);
        Objects.requireNonNull(faceTrackerBuilder.f3980b);
        FaceTracker faceTracker2 = faceTrackerBuilder.f3979a;
        synchronized (faceTracker2.f3963a) {
            FaceTracker.c cVar = new FaceTracker.c("FaceTrackerThread");
            faceTracker2.f3964b = cVar;
            cVar.start();
            faceTracker2.f3964b.m2115a();
        }
        Log.d("CameraPreviewFragment", "onAttach: ");
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m2069Z0() {
        if (m16570w().m16656I("FRAGMENT_TAG") == null) {
            return false;
        }
        if (!this.f3873i0) {
            this.f3873i0 = true;
            AnimationUtils.loadAnimation(this.f3875k0, R.anim.preivew_slide_down).setAnimationListener(new CameraPreviewFragment(this));
        }
        return true;
    }

    /* JADX INFO: renamed from: a1 */
    public void m2070a1() {
        this.f3874j0.post(new Runnable() { // from class: c.h.a.b.a
            @Override // java.lang.Runnable
            public final void run() {
                int i = CameraPreviewFragment2.f3867c0;
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public void m2071b1() {
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Objects.requireNonNull(this.f3876l0);
    }

    /* JADX INFO: renamed from: c1 */
    public void m2072c1() {
        CameraPreviewPresenter cameraPreviewPresenter = this.f3876l0;
        if (cameraPreviewPresenter.f3896g) {
            return;
        }
        if (cameraPreviewPresenter.f3901l == null) {
            cameraPreviewPresenter.f3901l = new HWMediaRecorder(cameraPreviewPresenter);
        }
        HWMediaRecorder hWMediaRecorder = cameraPreviewPresenter.f3901l;
        hWMediaRecorder.f4319c = false;
        VideoParams videoParams = cameraPreviewPresenter.f3894e;
        AudioParams audioParams = cameraPreviewPresenter.f3895f;
        VideoRecorder videoRecorder = hWMediaRecorder.f4318b;
        Objects.requireNonNull(videoRecorder);
        Log.d("VideoRecorder", "VideoRecorder: startRecord()");
        synchronized (videoRecorder.f4379m) {
            if (videoRecorder.f4381o) {
                Log.w("VideoRecorder", "VideoRecorder thread already running");
            } else {
                videoRecorder.f4381o = true;
                new Thread(videoRecorder, "VideoRecorder").start();
                while (!videoRecorder.f4380n) {
                    try {
                        videoRecorder.f4379m.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                videoRecorder.f4383q = 0;
                videoRecorder.f4384r = -1L;
                videoRecorder.f4378l.sendMessage(videoRecorder.f4378l.obtainMessage(0, videoParams));
            }
        }
        if (hWMediaRecorder.f4319c) {
            try {
                hWMediaRecorder.f4317a.m2196a(audioParams);
                AudioRecorder audioRecorder = hWMediaRecorder.f4317a;
                audioRecorder.f4301k = true;
                new Thread(audioRecorder).start();
            } catch (Exception e) {
                StringBuilder sbM1556G = outline.m1556G("startRecord: ");
                sbM1556G.append(e.getMessage());
                Log.e("FFMediaRecorder", sbM1556G.toString());
            }
        }
        cameraPreviewPresenter.f3896g = true;
        cameraPreviewPresenter.f3897h = false;
    }

    /* JADX INFO: renamed from: d1 */
    public void m2073d1() {
        if (!C0868a.m2112h(this.f3875k0, "android.permission.CAMERA")) {
            C0868a.m2113i(this);
            return;
        }
        CameraXController cameraXController = (CameraXController) this.f3876l0.f3906q;
        cameraXController.f3852e = !cameraXController.f3852e;
        cameraXController.f3853f.m15458b();
        CameraSelector.a aVar = new CameraSelector.a();
        aVar.m15299b(!cameraXController.f3852e ? 1 : 0);
        cameraXController.f3854g = cameraXController.f3853f.m15457a(cameraXController.f3851d, aVar.m15298a(), cameraXController.f3855h, cameraXController.f3857j);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_camera_preview, viewGroup, false);
        this.f3869e0 = viewInflate;
        return viewInflate;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo1956g0() {
        Looper looper;
        CameraPreviewPresenter cameraPreviewPresenter = this.f3876l0;
        Objects.requireNonNull(cameraPreviewPresenter);
        FaceTracker faceTracker = FaceTracker.b.f3965a;
        synchronized (faceTracker.f3963a) {
            FaceTracker.c cVar = faceTracker.f3964b;
            if (cVar.isAlive()) {
                synchronized (cVar) {
                    while (cVar.isAlive() && cVar.f3968h == null) {
                        try {
                            cVar.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                looper = cVar.f3968h;
            } else {
                looper = null;
            }
            if (looper != null) {
                looper.quitSafely();
            }
        }
        LandmarkEngine landmarkEngine = LandmarkEngine.b.f4266a;
        synchronized (landmarkEngine.f4264a) {
            landmarkEngine.f4265b.clear();
        }
        HWMediaRecorder hWMediaRecorder = cameraPreviewPresenter.f3901l;
        if (hWMediaRecorder != null) {
            hWMediaRecorder.m2203d();
            cameraPreviewPresenter.f3901l = null;
        }
        CainCommandEditor cainCommandEditor = cameraPreviewPresenter.f3905p;
        if (cainCommandEditor != null) {
            cainCommandEditor.release();
            cameraPreviewPresenter.f3905p = null;
        }
        this.f3874j0.removeCallbacksAndMessages(null);
        this.f38414K = true;
        Log.d("CameraPreviewFragment", "onDestroy: ");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        this.f3869e0 = null;
        this.f38414K = true;
        Log.d("CameraPreviewFragment", "onDestroyView: ");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        CameraPreviewPresenter cameraPreviewPresenter = this.f3876l0;
        cameraPreviewPresenter.f3893d = null;
        CameraRenderer cameraRenderer = cameraPreviewPresenter.f3907r;
        synchronized (cameraRenderer) {
            Looper looperM2088e = cameraRenderer.m2088e();
            if (looperM2088e != null) {
                looperM2088e.quitSafely();
            }
        }
        this.f3876l0 = null;
        this.f3875k0 = null;
        this.f38414K = true;
        Log.d("CameraPreviewFragment", "onDetach: ");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: o0 */
    public void mo2074o0() {
        this.f38414K = true;
        CameraPreviewPresenter cameraPreviewPresenter = this.f3876l0;
        WeakReference<SurfaceTexture> weakReference = cameraPreviewPresenter.f3907r.f3922n;
        if (weakReference != null) {
            weakReference.clear();
        }
        CameraXController cameraXController = (CameraXController) cameraPreviewPresenter.f3906q;
        Objects.requireNonNull(cameraXController);
        try {
            ProcessCameraProvider processCameraProvider = cameraXController.f3853f;
            if (processCameraProvider != null) {
                processCameraProvider.m15458b();
                cameraXController.f3853f = null;
            }
            SurfaceTexture surfaceTexture = cameraXController.f3861n;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                cameraXController.f3861n = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        CameraParam cameraParam = cameraPreviewPresenter.f3892c;
        cameraParam.f3845e = null;
        cameraParam.f3846f = null;
        Log.d("CameraPreviewFragment", "onPause: ");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: r0 */
    public void mo2075r0(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            if (iArr.length == 1 && iArr[0] == 0) {
                m2068Y0(this.f3869e0);
                return;
            } else {
                PermissionErrorDialogFragment.m2218d1(m16546Q(R.string.request_camera_permission), 1, true).mo5469c1(m16570w(), "dialog");
                return;
            }
        }
        if (i == 2) {
            if (iArr.length == 1 && iArr[0] == 0) {
                return;
            }
            PermissionErrorDialogFragment.m2218d1(m16546Q(R.string.request_storage_permission), 2, true).mo5469c1(m16570w(), "dialog");
            return;
        }
        if (i == 3) {
            if (iArr.length == 1 && iArr[0] == 0) {
                return;
            }
            PermissionErrorDialogFragment.m2218d1(m16546Q(R.string.request_sound_permission), 3, true).mo5469c1(m16570w(), "dialog");
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: s0 */
    public void mo2076s0() {
        ListenableFuture<CameraX2> listenableFutureM15439c;
        int iM2062b;
        int iM2063c;
        boolean z = true;
        this.f38414K = true;
        FragmentActivity fragmentActivity = this.f3875k0;
        Objects.requireNonNull(this.f3868d0);
        int i = this.f3868d0.f3844d;
        WindowManager.LayoutParams attributes = fragmentActivity.getWindow().getAttributes();
        if (i == -1) {
            attributes.screenBrightness = -1.0f;
        } else {
            attributes.screenBrightness = i / 255.0f;
        }
        fragmentActivity.getWindow().setAttributes(attributes);
        CameraPreviewPresenter cameraPreviewPresenter = this.f3876l0;
        final CameraXController cameraXController = (CameraXController) cameraPreviewPresenter.f3906q;
        FragmentActivity fragmentActivity2 = cameraXController.f3851d;
        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.f36372a;
        Objects.requireNonNull(fragmentActivity2);
        Object obj = CameraX2.f36313a;
        C8162a.m16063h(fragmentActivity2, "Context must not be null.");
        synchronized (CameraX2.f36313a) {
            boolean z2 = CameraX2.f36315c != null;
            listenableFutureM15439c = CameraX2.m15439c();
            if (listenableFutureM15439c.isDone()) {
                try {
                    try {
                        listenableFutureM15439c.get();
                    } catch (ExecutionException unused) {
                        CameraX2.m15441f();
                        listenableFutureM15439c = null;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException("Unexpected thread interrupt. Should not be possible since future is already complete.", e);
                }
            }
            if (listenableFutureM15439c == null) {
                if (!z2) {
                    CameraXConfig.b bVarM15438b = CameraX2.m15438b(fragmentActivity2);
                    if (bVarM15438b == null) {
                        throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                    }
                    if (CameraX2.f36315c != null) {
                        z = false;
                    }
                    C8162a.m16065j(z, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                    CameraX2.f36315c = bVarM15438b;
                    Integer num = (Integer) bVarM15438b.getCameraXConfig().mo15105d(CameraXConfig.f36360w, null);
                    if (num != null) {
                        Logger8.f35916a = num.intValue();
                    }
                }
                CameraX2.m15440d(fragmentActivity2);
                listenableFutureM15439c = CameraX2.m15439c();
            }
        }
        C7911a c7911a = new Function3() { // from class: z0.e.c.a
            @Override // p636z0.p655c.p656a.p659c.Function3
            public final Object apply(Object obj2) {
                ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.f36372a;
                processCameraProvider2.f36374c = (CameraX2) obj2;
                return processCameraProvider2;
            }
        };
        Executor executorM14569f = C7462a.m14569f();
        final ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(new Futures(c7911a), listenableFutureM15439c);
        listenableFutureM15439c.mo11664h(chainingListenableFuture, executorM14569f);
        Runnable runnable = new Runnable() { // from class: c.h.a.a.d
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                CameraXController cameraXController2 = cameraXController;
                ListenableFuture listenableFuture = chainingListenableFuture;
                Objects.requireNonNull(cameraXController2);
                try {
                    cameraXController2.f3853f = (ProcessCameraProvider) listenableFuture.get();
                    cameraXController2.m2061a();
                } catch (InterruptedException | ExecutionException e2) {
                    e2.printStackTrace();
                }
            }
        };
        FragmentActivity fragmentActivity3 = cameraXController.f3851d;
        Object obj2 = ContextCompat.f37815a;
        chainingListenableFuture.f36273f.mo11664h(runnable, Build.VERSION.SDK_INT >= 28 ? ContextCompat.g.m16151a(fragmentActivity3) : new ExecutorCompat(new Handler(fragmentActivity3.getMainLooper())));
        CameraXController cameraXController2 = (CameraXController) cameraPreviewPresenter.f3906q;
        int i2 = cameraXController2.f3850c;
        if (i2 == 90 || i2 == 270) {
            iM2062b = cameraXController2.m2062b();
            iM2063c = ((CameraXController) cameraPreviewPresenter.f3906q).m2063c();
        } else {
            iM2062b = cameraXController2.m2063c();
            iM2063c = ((CameraXController) cameraPreviewPresenter.f3906q).m2062b();
        }
        VideoParams videoParams = cameraPreviewPresenter.f3894e;
        videoParams.f4365a = iM2062b;
        videoParams.f4366b = iM2063c;
        if (iM2062b * iM2063c < 921600) {
            videoParams.f4367c = 3921332;
        }
        CameraRenderer cameraRenderer = cameraPreviewPresenter.f3907r;
        RenderManager renderManager = cameraRenderer.f3926r;
        renderManager.f3950i = iM2062b;
        renderManager.f3951j = iM2063c;
        if (renderManager.f3948g != 0 && renderManager.f3949h != 0) {
            renderManager.m2094b();
            renderManager.m2102j();
        }
        GLImageReader gLImageReader = cameraRenderer.f3918j;
        if (gLImageReader != null) {
            gLImageReader.m2092a(iM2062b, iM2063c);
        }
        CameraParam cameraParam = cameraPreviewPresenter.f3892c;
        cameraParam.f3845e = cameraPreviewPresenter;
        cameraParam.f3846f = cameraPreviewPresenter;
        Log.d("CameraPreviewFragment", "onResume: ");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: u0 */
    public void mo1958u0() {
        this.f38414K = true;
        Objects.requireNonNull(this.f3876l0);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: v0 */
    public void mo1959v0() {
        this.f38414K = true;
        Objects.requireNonNull(this.f3876l0);
        Log.d("CameraPreviewFragment", "onStop: ");
    }

    public CameraPreviewFragment2(String str) {
        this.f3877m0 = "";
        this.f3878n0 = 0;
        this.f3879o0 = 0;
        this.f3880p0 = new a();
        this.f3881q0 = new b();
        this.f3882r0 = new c();
        this.f3877m0 = str;
        this.f3868d0 = CameraParam.f3841a;
        this.f3874j0 = new Handler(Looper.getMainLooper());
        this.f3876l0 = new CameraPreviewPresenter(this);
    }

    public CameraPreviewFragment2() {
        this.f3877m0 = "";
        this.f3878n0 = 0;
        this.f3879o0 = 0;
        this.f3880p0 = new a();
        this.f3881q0 = new b();
        this.f3882r0 = new c();
        this.f3868d0 = CameraParam.f3841a;
        this.f3874j0 = new Handler(Looper.getMainLooper());
        this.f3876l0 = new CameraPreviewPresenter(this);
    }
}
