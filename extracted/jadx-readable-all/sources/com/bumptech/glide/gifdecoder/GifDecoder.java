package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.g.a.l.a, reason: use source file name */
/* JADX INFO: compiled from: GifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public interface GifDecoder {

    /* JADX WARN: Can't change package for inner class: c.g.a.l.a.a to com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider */
    /* JADX INFO: renamed from: c.g.a.l.a$a */
    /* JADX INFO: compiled from: GifDecoder.java */
    public interface BitmapProvider {
    }

    /* JADX INFO: renamed from: a */
    Bitmap getNextFrame();

    /* JADX INFO: renamed from: b */
    void advance();

    /* JADX INFO: renamed from: c */
    int getFrameCount();

    void clear();

    /* JADX INFO: renamed from: d */
    int getNextDelay();

    /* JADX INFO: renamed from: e */
    ByteBuffer getData();

    /* JADX INFO: renamed from: f */
    int getCurrentFrameIndex();

    /* JADX INFO: renamed from: g */
    int getByteSize();
}
