package com.cgfay.media;

import p007c.p114h.p122b.C0868a;

/* JADX INFO: loaded from: classes.dex */
public class CainMediaEditor {
    private static final String TAG = "CainMediaEditor";
    private long handle = nativeInit();

    public interface OnEditProcessListener {
        void onError(String str);

        void onProcessing(int i);

        void onSuccess();
    }

    static {
        System.loadLibrary("ffmpeg");
        System.loadLibrary("soundtouch");
        System.loadLibrary("yuv");
        System.loadLibrary("media_editor");
    }

    private native void audioCut(long j2, String str, String str2, float f, float f2, float f3, OnEditProcessListener onEditProcessListener);

    private native long nativeInit();

    private native void nativeRelease(long j2);

    private native void videoCut(long j2, String str, String str2, float f, float f2, float f3, OnEditProcessListener onEditProcessListener);

    private native void videoReverse(long j2, String str, String str2, OnEditProcessListener onEditProcessListener);

    public void audioCut(String str, String str2, float f, float f2, OnEditProcessListener onEditProcessListener) {
        if (C0868a.m2110f(str)) {
            audioCut(this.handle, str, str2, f, f2, 1.0f, onEditProcessListener);
        } else if (onEditProcessListener != null) {
            onEditProcessListener.onError("source path is not exists.");
        }
    }

    public void audioSpeedCut(String str, String str2, float f, float f2, float f3, OnEditProcessListener onEditProcessListener) {
        if (C0868a.m2110f(str)) {
            audioCut(this.handle, str, str2, f, f2, f3, onEditProcessListener);
        } else if (onEditProcessListener != null) {
            onEditProcessListener.onError("source path is not exists.");
        }
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public void release() {
        long j2 = this.handle;
        if (j2 != 0) {
            nativeRelease(j2);
            this.handle = 0L;
        }
    }

    public void videoCut(String str, String str2, float f, float f2, OnEditProcessListener onEditProcessListener) {
        if (C0868a.m2110f(str)) {
            videoCut(this.handle, str, str2, f, f2, 1.0f, onEditProcessListener);
        } else if (onEditProcessListener != null) {
            onEditProcessListener.onError("source path is not exists.");
        }
    }

    public void videoReverse(String str, String str2, OnEditProcessListener onEditProcessListener) {
        if (C0868a.m2110f(str)) {
            videoReverse(this.handle, str, str2, onEditProcessListener);
        } else if (onEditProcessListener != null) {
            onEditProcessListener.onError("source path is not exists.");
        }
    }

    public void videoSpeedCut(String str, String str2, float f, float f2, float f3, OnEditProcessListener onEditProcessListener) {
        if (C0868a.m2110f(str)) {
            videoCut(this.handle, str, str2, f, f2, f3, onEditProcessListener);
        } else if (onEditProcessListener != null) {
            onEditProcessListener.onError("source path is not exists.");
        }
    }
}
