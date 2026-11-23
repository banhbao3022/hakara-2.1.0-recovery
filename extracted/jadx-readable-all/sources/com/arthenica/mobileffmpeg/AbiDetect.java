package com.arthenica.mobileffmpeg;

/* JADX INFO: loaded from: classes.dex */
public class AbiDetect {

    /* JADX INFO: renamed from: a */
    public static boolean f28134a = false;

    static {
        System.loadLibrary("mobileffmpeg_abidetect");
    }

    public static native String getNativeAbi();

    public static native String getNativeBuildConf();

    public static native String getNativeCpuAbi();

    public static native boolean isNativeLTSBuild();
}
