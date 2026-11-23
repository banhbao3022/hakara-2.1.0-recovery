package p007c.p114h.p145f.p146b;

import android.text.TextUtils;
import android.util.Log;
import com.cgfay.media.CainCommandEditor;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p115a.p117b.CameraPreviewFragment2;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p122b.C0868a;
import p007c.p114h.p145f.p146b.MediaInfo3;

/* JADX INFO: renamed from: c.h.f.b.e, reason: use source file name */
/* JADX INFO: compiled from: HWMediaRecorder.java */
/* JADX INFO: loaded from: classes.dex */
public class HWMediaRecorder {

    /* JADX INFO: renamed from: a */
    public final AudioRecorder f4317a;

    /* JADX INFO: renamed from: b */
    public final VideoRecorder f4318b;

    /* JADX INFO: renamed from: c */
    public boolean f4319c = true;

    /* JADX INFO: renamed from: d */
    public int f4320d;

    /* JADX INFO: renamed from: e */
    public OnRecordStateListener f4321e;

    public HWMediaRecorder(OnRecordStateListener onRecordStateListener) {
        this.f4321e = onRecordStateListener;
        VideoRecorder videoRecorder = new VideoRecorder();
        this.f4318b = videoRecorder;
        videoRecorder.f4382p = this;
        AudioRecorder audioRecorder = new AudioRecorder();
        this.f4317a = audioRecorder;
        audioRecorder.f4303m = this;
        this.f4320d = 0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2200a() {
        boolean z;
        VideoRecorder videoRecorder = this.f4318b;
        if (videoRecorder == null) {
            return false;
        }
        synchronized (videoRecorder.f4379m) {
            z = videoRecorder.f4381o;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public void m2201b(RecordInfo recordInfo) {
        OnRecordStateListener onRecordStateListener = this.f4321e;
        if (onRecordStateListener != null) {
            final CameraPreviewPresenter cameraPreviewPresenter = (CameraPreviewPresenter) onRecordStateListener;
            Log.d("PHAN", "onRecordFinish: " + recordInfo);
            Log.d("PHAN", "mHWMediaRecorder: " + cameraPreviewPresenter.f3901l);
            MediaType mediaType = recordInfo.f4328c;
            if (mediaType == MediaType.AUDIO) {
                cameraPreviewPresenter.f3903n = recordInfo;
            } else if (mediaType == MediaType.VIDEO) {
                cameraPreviewPresenter.f3904o = recordInfo;
                cameraPreviewPresenter.f3898i = (recordInfo.f4327b * 1.0f) / cameraPreviewPresenter.f3894e.f4370f;
            }
            StringBuilder sbM1556G = outline.m1556G("mVideoInfo: ");
            sbM1556G.append(cameraPreviewPresenter.f3904o);
            Log.d("PHAN", sbM1556G.toString());
            Log.d("PHAN", "mCurrentProgress: " + cameraPreviewPresenter.f3898i);
            if (cameraPreviewPresenter.f3901l == null) {
                return;
            }
            StringBuilder sbM1556G2 = outline.m1556G("mHWMediaRecorder2: ");
            sbM1556G2.append(cameraPreviewPresenter.f3901l);
            Log.d("PHAN", sbM1556G2.toString());
            if (cameraPreviewPresenter.f3901l.f4319c && (cameraPreviewPresenter.f3903n == null || cameraPreviewPresenter.f3904o == null)) {
                return;
            }
            StringBuilder sbM1556G3 = outline.m1556G("mVideoInfo111: ");
            sbM1556G3.append(cameraPreviewPresenter.f3904o);
            Log.d("PHAN", sbM1556G3.toString());
            Log.d("CameraPreviewPresenter", "mVideoInfo: " + cameraPreviewPresenter.f3904o);
            if (cameraPreviewPresenter.f3901l.f4319c) {
                final String strM2081e = cameraPreviewPresenter.m2081e();
                File file = new File(strM2081e);
                if (file.exists()) {
                    file.delete();
                }
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                cameraPreviewPresenter.f3905p.execCommand(CainCommandEditor.mergeAudioVideo(cameraPreviewPresenter.f3904o.f4326a, cameraPreviewPresenter.f3903n.f4326a, strM2081e), new CainCommandEditor.CommandProcessCallback() { // from class: c.h.a.d.b
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.cgfay.media.CainCommandEditor.CommandProcessCallback
                    public final void onProcessResult(int i) {
                        CameraPreviewPresenter cameraPreviewPresenter2 = cameraPreviewPresenter;
                        String str = strM2081e;
                        if (i == 0) {
                            cameraPreviewPresenter2.f3902m.add(new MediaInfo3(str, cameraPreviewPresenter2.f3904o.f4327b));
                            cameraPreviewPresenter2.f3900k -= cameraPreviewPresenter2.f3904o.f4327b;
                            ((CameraPreviewFragment2) cameraPreviewPresenter2.f3908a).m2070a1();
                            cameraPreviewPresenter2.f3898i = 0.0f;
                        }
                        C0868a.m2107c(cameraPreviewPresenter2.f3903n.f4326a);
                        C0868a.m2107c(cameraPreviewPresenter2.f3904o.f4326a);
                        cameraPreviewPresenter2.f3903n = null;
                        cameraPreviewPresenter2.f3904o = null;
                        if (cameraPreviewPresenter2.f3897h) {
                            return;
                        }
                        StringBuilder sbM1556G4 = outline.m1556G("mergeAndEdit0: ");
                        sbM1556G4.append(cameraPreviewPresenter2.f3897h);
                        Log.d("PHAN", sbM1556G4.toString());
                        cameraPreviewPresenter2.m2082f();
                    }
                });
            } else {
                StringBuilder sbM1556G4 = outline.m1556G("mVideoInfo 1: ");
                sbM1556G4.append(cameraPreviewPresenter.f3904o);
                Log.d("CameraPreviewPresenter", sbM1556G4.toString());
                if (cameraPreviewPresenter.f3904o != null) {
                    StringBuilder sbM1556G5 = outline.m1556G("mVideoInfo2: ");
                    sbM1556G5.append(cameraPreviewPresenter.f3904o);
                    Log.d("CameraPreviewPresenter", sbM1556G5.toString());
                    String strM2081e2 = cameraPreviewPresenter.m2081e();
                    String str = cameraPreviewPresenter.f3904o.f4326a;
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strM2081e2)) {
                        new File(str).renameTo(new File(strM2081e2));
                    }
                    cameraPreviewPresenter.f3902m.add(new MediaInfo3(strM2081e2, cameraPreviewPresenter.f3904o.f4327b));
                    cameraPreviewPresenter.f3900k -= cameraPreviewPresenter.f3904o.f4327b;
                    cameraPreviewPresenter.f3903n = null;
                    cameraPreviewPresenter.f3904o = null;
                    StringBuilder sbM1556G6 = outline.m1556G("mVideoList: ");
                    sbM1556G6.append(cameraPreviewPresenter.f3902m);
                    Log.d("CameraPreviewPresenter", sbM1556G6.toString());
                    ((CameraPreviewFragment2) cameraPreviewPresenter.f3908a).m2070a1();
                    cameraPreviewPresenter.f3898i = 0.0f;
                    StringBuilder sbM1556G7 = outline.m1556G("mIsPause: ");
                    sbM1556G7.append(cameraPreviewPresenter.f3897h);
                    Log.d("CameraPreviewPresenter", sbM1556G7.toString());
                    if (!cameraPreviewPresenter.f3897h) {
                        StringBuilder sbM1556G8 = outline.m1556G("mergeAndEdit1: ");
                        sbM1556G8.append(cameraPreviewPresenter.f3897h);
                        Log.d("PHAN", sbM1556G8.toString());
                        cameraPreviewPresenter.m2082f();
                    }
                }
            }
            HWMediaRecorder hWMediaRecorder = cameraPreviewPresenter.f3901l;
            if (hWMediaRecorder != null) {
                hWMediaRecorder.m2203d();
                cameraPreviewPresenter.f3901l = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m2202c() {
        OnRecordStateListener onRecordStateListener;
        int i = this.f4320d + 1;
        this.f4320d = i;
        if ((!this.f4319c || i >= 2) && (onRecordStateListener = this.f4321e) != null) {
            Objects.requireNonNull((CameraPreviewFragment2) ((CameraPreviewPresenter) onRecordStateListener).f3908a);
            this.f4320d = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2203d() {
        VideoRecorder videoRecorder = this.f4318b;
        if (videoRecorder.f4378l != null) {
            videoRecorder.f4378l.sendMessage(videoRecorder.f4378l.obtainMessage(3));
        }
        this.f4317a.m2197b();
    }

    /* JADX INFO: renamed from: e */
    public void m2204e() {
        AudioRecorder audioRecorder;
        System.currentTimeMillis();
        VideoRecorder videoRecorder = this.f4318b;
        if (videoRecorder != null && videoRecorder.f4378l != null) {
            videoRecorder.f4378l.sendMessage(videoRecorder.f4378l.obtainMessage(1));
            videoRecorder.f4378l.sendMessage(videoRecorder.f4378l.obtainMessage(3));
        }
        if (!this.f4319c || (audioRecorder = this.f4317a) == null) {
            return;
        }
        audioRecorder.f4301k = false;
    }
}
