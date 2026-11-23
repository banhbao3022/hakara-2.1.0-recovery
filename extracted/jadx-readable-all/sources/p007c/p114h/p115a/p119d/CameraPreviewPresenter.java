package p007c.p114h.p115a.p119d;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.cgfay.media.CainCommandEditor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p115a.p116a.CameraParam;
import p007c.p114h.p115a.p116a.ICameraController;
import p007c.p114h.p115a.p116a.OnFrameAvailableListener;
import p007c.p114h.p115a.p116a.OnSurfaceTextureListener;
import p007c.p114h.p115a.p116a.PreviewCallback;
import p007c.p114h.p115a.p117b.CameraPreviewFragment2;
import p007c.p114h.p115a.p118c.OnCaptureListener;
import p007c.p114h.p115a.p118c.OnFpsListener;
import p007c.p114h.p115a.p120e.CameraRenderHandler;
import p007c.p114h.p115a.p120e.CameraRenderer;
import p007c.p114h.p122b.C0868a;
import p007c.p114h.p123c.p125b.FaceTrackerCallback;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColor;
import p007c.p114h.p126d.p129c.p139g.FilterHelper;
import p007c.p114h.p126d.p129c.p139g.ResourceJsonCodec;
import p007c.p114h.p126d.p129c.p139g.p140i.ResourceData;
import p007c.p114h.p145f.p146b.AudioParams;
import p007c.p114h.p145f.p146b.HWMediaRecorder;
import p007c.p114h.p145f.p146b.MediaInfo3;
import p007c.p114h.p145f.p146b.OnRecordStateListener;
import p007c.p114h.p145f.p146b.RecordInfo;
import p007c.p114h.p145f.p146b.VideoParams;
import p007c.p114h.p145f.p146b.VideoRecorder;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.h.a.d.c, reason: use source file name */
/* JADX INFO: compiled from: CameraPreviewPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraPreviewPresenter extends PreviewPresenter<CameraPreviewFragment2> implements PreviewCallback, FaceTrackerCallback, OnCaptureListener, OnFpsListener, OnSurfaceTextureListener, OnFrameAvailableListener, OnRecordStateListener {

    /* JADX INFO: renamed from: b */
    public int f3891b;

    /* JADX INFO: renamed from: c */
    public CameraParam f3892c;

    /* JADX INFO: renamed from: d */
    public FragmentActivity f3893d;

    /* JADX INFO: renamed from: e */
    public final VideoParams f3894e;

    /* JADX INFO: renamed from: f */
    public final AudioParams f3895f;

    /* JADX INFO: renamed from: g */
    public boolean f3896g;

    /* JADX INFO: renamed from: h */
    public boolean f3897h;

    /* JADX INFO: renamed from: i */
    public float f3898i;

    /* JADX INFO: renamed from: j */
    public long f3899j;

    /* JADX INFO: renamed from: k */
    public long f3900k;

    /* JADX INFO: renamed from: l */
    public HWMediaRecorder f3901l;

    /* JADX INFO: renamed from: m */
    public List<MediaInfo3> f3902m;

    /* JADX INFO: renamed from: n */
    public RecordInfo f3903n;

    /* JADX INFO: renamed from: o */
    public RecordInfo f3904o;

    /* JADX INFO: renamed from: p */
    public CainCommandEditor f3905p;

    /* JADX INFO: renamed from: q */
    public ICameraController f3906q;

    /* JADX INFO: renamed from: r */
    public final CameraRenderer f3907r;

    public CameraPreviewPresenter(CameraPreviewFragment2 cameraPreviewFragment2) {
        super(cameraPreviewFragment2);
        this.f3891b = 0;
        this.f3896g = false;
        this.f3897h = false;
        this.f3902m = new ArrayList();
        this.f3892c = CameraParam.f3841a;
        this.f3907r = new CameraRenderer(this);
        this.f3894e = new VideoParams();
        this.f3895f = new AudioParams();
        this.f3905p = new CainCommandEditor();
    }

    @Override // p007c.p114h.p115a.p119d.IPresenter
    /* JADX INFO: renamed from: a */
    public Context mo2077a() {
        return this.f3893d;
    }

    @Override // p007c.p114h.p115a.p119d.PreviewPresenter
    /* JADX INFO: renamed from: b */
    public void mo2078b(EGLContext eGLContext) {
        this.f3894e.f4371g = eGLContext;
        Log.d("CameraPreviewPresenter", "onBindSharedContext: ");
    }

    @Override // p007c.p114h.p115a.p119d.PreviewPresenter
    /* JADX INFO: renamed from: c */
    public void mo2079c(int i, long j2) {
        HWMediaRecorder hWMediaRecorder;
        VideoRecorder videoRecorder;
        if (!this.f3896g || (hWMediaRecorder = this.f3901l) == null || !hWMediaRecorder.m2200a() || (videoRecorder = this.f3901l.f4318b) == null) {
            return;
        }
        synchronized (videoRecorder.f4379m) {
            if (videoRecorder.f4380n) {
                if (j2 != 0 && videoRecorder.f4378l != null) {
                    videoRecorder.f4378l.sendMessage(videoRecorder.f4378l.obtainMessage(2, (int) (j2 >> 32), (int) j2, Integer.valueOf(i)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2080d(int i) {
        if (this.f3893d == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(FilterHelper.m2161c(this.f3893d));
        sb.append(File.separator);
        List<ResourceData> list = FilterHelper.f4194a;
        sb.append(list.get(i).f4207c);
        String string = sb.toString();
        DynamicColor dynamicColorM2172a = null;
        if (!list.get(i).f4207c.equalsIgnoreCase("none")) {
            try {
                dynamicColorM2172a = ResourceJsonCodec.m2172a(string);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        CameraRenderHandler cameraRenderHandlerM2087d = this.f3907r.m2087d();
        cameraRenderHandlerM2087d.sendMessage(cameraRenderHandlerM2087d.obtainMessage(5, dynamicColorM2172a));
    }

    /* JADX INFO: renamed from: e */
    public String m2081e() {
        FragmentActivity fragmentActivity = this.f3893d;
        StringBuilder sbM1556G = outline.m1556G("mounted".equals(Environment.getExternalStorageState()) ? fragmentActivity.getExternalCacheDir().getAbsolutePath() : fragmentActivity.getCacheDir().getAbsolutePath());
        sbM1556G.append(File.separator);
        sbM1556G.append("HakaraCamera_");
        sbM1556G.append(System.currentTimeMillis());
        sbM1556G.append(".mp4");
        String string = sbM1556G.toString();
        File file = new File(string);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m2082f() {
        StringBuilder sbM1556G = outline.m1556G("mergeAndEdit: ");
        sbM1556G.append(this.f3902m.size());
        Log.d("PHAN", sbM1556G.toString());
        if (this.f3902m.size() < 1) {
            return;
        }
        if (this.f3902m.size() == 1) {
            ((CameraPreviewFragment2) this.f3908a).m2066W0(this.f3902m.get(0).f4322a);
            this.f3902m.clear();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaInfo3 mediaInfo3 : this.f3902m) {
            if (mediaInfo3 != null && !TextUtils.isEmpty(mediaInfo3.f4322a)) {
                arrayList.add(mediaInfo3.f4322a);
            }
        }
        final String strM2081e = m2081e();
        this.f3905p.execCommand(CainCommandEditor.concatVideo(this.f3893d, arrayList, strM2081e), new CainCommandEditor.CommandProcessCallback() { // from class: c.h.a.d.a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.cgfay.media.CainCommandEditor.CommandProcessCallback
            public final void onProcessResult(int i) {
                CameraPreviewPresenter cameraPreviewPresenter = this.f3887a;
                String str = strM2081e;
                if (i != 0) {
                    final CameraPreviewFragment2 cameraPreviewFragment2 = (CameraPreviewFragment2) cameraPreviewPresenter.f3908a;
                    final String str2 = "Fail";
                    cameraPreviewFragment2.f3874j0.post(new Runnable() { // from class: c.h.a.b.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraPreviewFragment2 cameraPreviewFragment3 = cameraPreviewFragment2;
                            String str3 = str2;
                            Toast toast = cameraPreviewFragment3.f3883s0;
                            if (toast != null) {
                                toast.cancel();
                            }
                            Toast toastMakeText = Toast.makeText(cameraPreviewFragment3.f3875k0, str3, 0);
                            cameraPreviewFragment3.f3883s0 = toastMakeText;
                            toastMakeText.show();
                        }
                    });
                    return;
                }
                for (MediaInfo3 mediaInfo4 : cameraPreviewPresenter.f3902m) {
                    if (mediaInfo4 != null && !TextUtils.isEmpty(mediaInfo4.f4322a)) {
                        C0868a.m2107c(mediaInfo4.f4322a);
                    }
                }
                cameraPreviewPresenter.f3902m.clear();
                ((CameraPreviewFragment2) cameraPreviewPresenter.f3908a).m2066W0(str);
            }
        });
    }
}
