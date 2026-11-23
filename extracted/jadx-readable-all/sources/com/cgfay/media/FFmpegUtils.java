package com.cgfay.media;

/* JADX INFO: loaded from: classes.dex */
public final class FFmpegUtils {
    static {
        System.loadLibrary("ffmpeg");
        System.loadLibrary("ffcommand");
    }

    private FFmpegUtils() {
    }

    private static native int _execute(String[] strArr);

    public static int execute(String[] strArr) {
        return _execute(strArr);
    }
}
