package mtp.media.karaoke.utils;

/* JADX INFO: loaded from: classes2.dex */
public class NativeUtils {
    static {
        System.loadLibrary("AudioEngine");
    }

    public static native String getAppKey();

    public static native String getPackage();
}
