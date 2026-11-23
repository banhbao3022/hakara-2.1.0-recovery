package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* JADX INFO: renamed from: f */
        public final boolean f28148f;

        ImageType(boolean z) {
            this.f28148f = z;
        }

        public boolean hasAlpha() {
            return this.f28148f;
        }
    }

    /* JADX INFO: renamed from: a */
    ImageType mo1883a(ByteBuffer byteBuffer) throws IOException;

    /* JADX INFO: renamed from: b */
    ImageType mo1884b(InputStream inputStream) throws IOException;

    /* JADX INFO: renamed from: c */
    int mo1885c(InputStream inputStream, ArrayPool arrayPool) throws IOException;
}
