package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;

/* JADX INFO: renamed from: c.g.a.m.v.d.h, reason: use source file name */
/* JADX INFO: compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class ByteBufferBitmapImageDecoderResourceDecoder implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final BitmapImageDecoderResourceDecoder f3543a = new BitmapImageDecoderResourceDecoder();

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1709a(ByteBuffer byteBuffer, Options options) throws IOException {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> mo1710b(ByteBuffer byteBuffer, int i, int i2, Options options) throws IOException {
        return this.f3543a.mo1710b(ImageDecoder.createSource(byteBuffer), i, i2, options);
    }
}
