package com.cgfay.media;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.cgfay.media.CainCommandEditor;
import com.cgfay.media.FFmpegUtils;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p122b.C0868a;

/* JADX INFO: loaded from: classes.dex */
public class CainCommandEditor {
    private static final String TAG = "CainCommandEditor";
    private Handler mHandler;

    public interface CommandProcessCallback {
        void onProcessResult(int i);
    }

    public CainCommandEditor() {
        HandlerThread handlerThread = new HandlerThread("cain_command_editor");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
    }

    public static String[] adjustAudioSpeed(String str, String str2, float f) {
        if (f < 0.25f) {
            f = 0.25f;
        } else if (f > 4.0f) {
            f = 4.0f;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-vn");
        arrayList.add("-filter:a");
        String str3 = String.format(Locale.getDefault(), "atempo=%f", Float.valueOf(f));
        double d = f;
        if (d > 2.0d) {
            str3 = String.format(Locale.getDefault(), "atempo=2.0,atempo=%f", Float.valueOf(f / 2.0f));
        } else if (d < 0.5d) {
            str3 = String.format(Locale.getDefault(), "atempo=0.5,atempo=%f", Float.valueOf(f / 0.5f));
        }
        arrayList.add(str3);
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] adjustVideoSpeed(String str, String str2, float f) {
        if (f < 0.5f) {
            f = 0.5f;
        } else if (f > 4.0f) {
            f = 4.0f;
        }
        float f2 = 1.0f / f;
        String str3 = String.format(Locale.getDefault(), "[0:v]setpts=%f*PTS[v];[0:a]atempo=%f[a]", Float.valueOf(f2), Float.valueOf(f));
        if (f > 2.0d) {
            str3 = String.format(Locale.getDefault(), "[0:v]setpts=%f*PTS[v];[0:a]atempo=2.0,atempo=%f[a]", Float.valueOf(f2), Float.valueOf(f / 2.0f));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-vcodec");
        arrayList.add("libx264");
        arrayList.add("-filter_complex");
        arrayList.add(str3);
        arrayList.add("-map");
        arrayList.add("[v]");
        arrayList.add("-map");
        arrayList.add("[a]");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] audioCut(String str, String str2, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-ss");
        arrayList.add(String.valueOf(i / CloseCodes.NORMAL_CLOSURE));
        arrayList.add("-t");
        arrayList.add(String.valueOf(i2 / CloseCodes.NORMAL_CLOSURE));
        arrayList.add("-vn");
        arrayList.add("-acodec");
        arrayList.add("copy");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] audioDelayMix(String str, String str2, String str3, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        String str4 = String.format(Locale.getDefault(), "[1:a]adelay=%d|%d[delaya1]; [0:a][delaya1]amix=inputs=2:duration=first:dropout_transition=2", Integer.valueOf(i), Integer.valueOf(i2));
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-i");
        arrayList.add(str2);
        arrayList.add("-filter_complex");
        arrayList.add(str4);
        arrayList.add("-acodec");
        arrayList.add("libfdk-aac");
        arrayList.add("-y");
        arrayList.add(str3);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] audioVideoMix(String str, String str2, String str3, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-i");
        arrayList.add(str2);
        arrayList.add("-c:v");
        arrayList.add("copy");
        arrayList.add("-map");
        arrayList.add("0:v:0");
        arrayList.add("-strict");
        arrayList.add("-2");
        if (f == 0.0f) {
            arrayList.add("-c:a");
            arrayList.add("aac");
            arrayList.add("-map");
            arrayList.add("1:a:0");
            arrayList.add("-shortest");
            double d = f2;
            if (d < 0.99d || d > 1.01d) {
                arrayList.add("-vol");
                arrayList.add(String.valueOf((int) (f2 * 100.0f)));
            }
        } else if (f <= 0.001f || f2 <= 0.001f) {
            Log.w(TAG, String.format(Locale.getDefault(), "Illigal volume : SrcVideo = %.2f, SrcAudio = %.2f", Float.valueOf(f), Float.valueOf(f2)));
        } else {
            arrayList.add("-filter_complex");
            arrayList.add(String.format("[0:a]aformat=sample_fmts=fltp:sample_rates=48000:channel_layouts=stereo,volume=%f[a0];[1:a]aformat=sample_fmts=fltp:sample_rates=48000:channel_layouts=stereo,volume=%f[a1];[a0][a1]amix=inputs=2:duration=first[aout]", Float.valueOf(f), Float.valueOf(f2)));
            arrayList.add("-map");
            arrayList.add("[aout]");
        }
        arrayList.add("-f");
        arrayList.add("mp4");
        arrayList.add("-y");
        arrayList.add("-movflags");
        arrayList.add("faststart");
        arrayList.add(str3);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] audioVolumeMix(String str, String str2, String str3, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        String str4 = String.format(Locale.getDefault(), "[0:a]volume=volume=%f[a1]; [1:a]volume=volume=%f[a2]; [a1][a2]amix=inputs=2:duration=first:dropout_transition=2", Float.valueOf(f), Float.valueOf(f2));
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-i");
        arrayList.add(str2);
        arrayList.add("-filter_complex");
        arrayList.add(str4);
        arrayList.add("-acodec");
        arrayList.add("libfdk-aac");
        arrayList.add("-y");
        arrayList.add(str3);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] concatVideo(Context context, List<String> list, String str) {
        String strGenerateConcatPath = generateConcatPath(context);
        writeConcatToFile(list, strGenerateConcatPath);
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-f");
        arrayList.add("concat");
        arrayList.add("-safe");
        arrayList.add("0");
        arrayList.add("-i");
        arrayList.add(strGenerateConcatPath);
        arrayList.add("-c");
        arrayList.add("copy");
        arrayList.add("-threads");
        arrayList.add("5");
        arrayList.add("-y");
        arrayList.add(str);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    private static String generateConcatPath(Context context) {
        StringBuilder sbM1556G = outline.m1556G("mounted".equals(Environment.getExternalStorageState()) ? context.getExternalCacheDir().getAbsolutePath() : context.getCacheDir().getAbsolutePath());
        sbM1556G.append(File.separator);
        sbM1556G.append("ff_concat.txt");
        String string = sbM1556G.toString();
        C0868a.m2107c(string);
        File file = new File(string);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return string;
    }

    public static long getDuration(String str) {
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            int iSelectVideoTrack = selectVideoTrack(mediaExtractor);
            if (iSelectVideoTrack == -1 && (iSelectVideoTrack = selectAudioTrack(mediaExtractor)) == -1) {
                return 0L;
            }
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(iSelectVideoTrack);
            long j2 = trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : 0L;
            mediaExtractor.release();
            return j2;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String[] getOneFrameExactly(String str, String str2, float f) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-ss");
        arrayList.add(String.valueOf(f));
        arrayList.add("-vframes");
        arrayList.add("1");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] getOneScaleFrameExactly(String str, String str2, float f, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbM1556G = outline.m1556G(outline.m1599u(String.valueOf(i), "x"));
        sbM1556G.append(String.valueOf(i2));
        String string = sbM1556G.toString();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-ss");
        arrayList.add(String.valueOf(f));
        arrayList.add("-s");
        arrayList.add(string);
        arrayList.add("-vframes");
        arrayList.add("1");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] mergeAudioVideo(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        float duration = getDuration(str2) / 1000000.0f;
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str2);
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-ss");
        arrayList.add("0");
        arrayList.add("-t");
        arrayList.add("" + duration);
        arrayList.add("-acodec");
        arrayList.add("copy");
        arrayList.add("-vcodec");
        arrayList.add("copy");
        arrayList.add("-y");
        arrayList.add(str3);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] mp3TransAAC(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-acodec");
        arrayList.add("libfdk-aac");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] mp4TransTs(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-c");
        arrayList.add("copy");
        arrayList.add("-bsf:v");
        arrayList.add("h264_mp4toannexb");
        arrayList.add("-f");
        arrayList.add("mpegts");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] pcmMix(String str, String str2, String str3, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList();
        String str4 = String.format(Locale.getDefault(), "[0:a]volume=volume=%f[a1]; [1:a]volume=volume=%f[a2]; [a1][a2]amix=inputs=2:duration=first:dropout_transition=2", Float.valueOf(f), Float.valueOf(f2));
        arrayList.add("ffmpeg");
        arrayList.add("-f");
        arrayList.add("s16le");
        arrayList.add("-ar");
        arrayList.add(String.valueOf(i));
        arrayList.add("-ac");
        arrayList.add(String.valueOf(i2));
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-f");
        arrayList.add("s16le");
        arrayList.add("-ar");
        arrayList.add(String.valueOf(i3));
        arrayList.add("-ac");
        arrayList.add(String.valueOf(i4));
        arrayList.add("-i");
        arrayList.add(str2);
        arrayList.add("-filter_complex");
        arrayList.add(str4);
        arrayList.add("-f");
        arrayList.add("s16le");
        arrayList.add("-acodec");
        arrayList.add("pcm_s16le");
        arrayList.add("-y");
        arrayList.add(str3);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] pcmToAAC(String str, String str2, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-f");
        arrayList.add("s16le");
        arrayList.add("-ar");
        arrayList.add(String.valueOf(i));
        arrayList.add("-ac");
        arrayList.add(String.valueOf(i2));
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-acodec");
        arrayList.add("libfdk-aac");
        arrayList.add("-b:a");
        arrayList.add("44100");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] pcmVideoMerge(String str, String str2, String str3, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-f");
        arrayList.add("s16le");
        arrayList.add("-ar");
        arrayList.add(String.valueOf(i));
        arrayList.add("-ac");
        arrayList.add(String.valueOf(i2));
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-i");
        arrayList.add(str2);
        arrayList.add("-b:a");
        arrayList.add("48000");
        arrayList.add("-acodec");
        arrayList.add("libfdk-aac");
        arrayList.add("-vcodec");
        arrayList.add("copy");
        arrayList.add("-y");
        arrayList.add(str3);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] pictureTransVideo(String str, String str2, float f) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-loop");
        arrayList.add("1");
        arrayList.add("-t");
        arrayList.add(String.valueOf(f));
        arrayList.add("-vcodec");
        arrayList.add("libx264");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    private static int selectAudioTrack(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("audio/")) {
                return i;
            }
        }
        return -1;
    }

    private static int selectVideoTrack(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                return i;
            }
        }
        return -1;
    }

    public static String[] splitAudioTrack(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-acodec");
        arrayList.add("copy");
        arrayList.add("-vn");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] splitVideoTrack(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-vcodec");
        arrayList.add("copy");
        arrayList.add("-an");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] tsTransMP4(String[] strArr, String str) {
        String strM1599u = "concat:";
        for (int i = 0; i < strArr.length - 1; i++) {
            StringBuilder sbM1556G = outline.m1556G(strM1599u);
            sbM1556G.append(strArr[i]);
            strM1599u = outline.m1599u(sbM1556G.toString(), "|");
        }
        StringBuilder sbM1556G2 = outline.m1556G(strM1599u);
        sbM1556G2.append(strArr[strArr.length - 1]);
        String string = sbM1556G2.toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(string);
        arrayList.add("-c");
        arrayList.add("copy");
        arrayList.add("-bsf:a");
        arrayList.add("aac_adtstoasc");
        arrayList.add("-y");
        arrayList.add(str);
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    public static String[] videoCut(String str, String str2, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-ss");
        arrayList.add(String.valueOf(f));
        arrayList.add("-t");
        arrayList.add(String.valueOf(f2));
        arrayList.add("-vcodec");
        arrayList.add("copy");
        arrayList.add("-acodec");
        arrayList.add("copy");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    private static void writeConcatToFile(List<String> list, String str) {
        String strM1550A = "";
        for (int i = 0; i < list.size(); i++) {
            strM1550A = outline.m1550A(outline.m1561L(strM1550A, "file "), list.get(i), "\r\n");
        }
        try {
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                file.delete();
            }
            file.getParentFile().mkdirs();
            file.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            randomAccessFile.seek(file.length());
            randomAccessFile.write(strM1550A.getBytes());
            randomAccessFile.close();
            Log.e(TAG, "concat path:" + str);
        } catch (Exception e) {
            Log.e(TAG, "Error on write File:" + e);
        }
    }

    public void execCommand(final String[] strArr, final CommandProcessCallback commandProcessCallback) {
        if (strArr == null || strArr.length <= 0) {
            commandProcessCallback.onProcessResult(-1);
        } else {
            this.mHandler.post(new Runnable() { // from class: c.h.f.a
                @Override // java.lang.Runnable
                public final void run() {
                    String[] strArr2 = strArr;
                    CainCommandEditor.CommandProcessCallback commandProcessCallback2 = commandProcessCallback;
                    int iExecute = FFmpegUtils.execute(strArr2);
                    if (commandProcessCallback2 != null) {
                        commandProcessCallback2.onProcessResult(iExecute);
                    }
                }
            });
        }
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public void release() {
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.getLooper().quitSafely();
        this.mHandler = null;
    }

    public static String[] mp3TransAAC(String str, String str2, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ffmpeg");
        arrayList.add("-i");
        arrayList.add(str);
        arrayList.add("-ss");
        arrayList.add(String.valueOf(f));
        arrayList.add("-t");
        arrayList.add(String.valueOf(f2));
        arrayList.add("-acodec");
        arrayList.add("libfdk-aac");
        arrayList.add("-y");
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }
}
