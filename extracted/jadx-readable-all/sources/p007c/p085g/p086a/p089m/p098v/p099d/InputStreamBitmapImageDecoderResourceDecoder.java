package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p112s.ByteBufferUtil;

/* JADX INFO: renamed from: c.g.a.m.v.d.u, reason: use source file name */
/* JADX INFO: compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class InputStreamBitmapImageDecoderResourceDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final BitmapImageDecoderResourceDecoder f3589a = new BitmapImageDecoderResourceDecoder();

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1709a(InputStream inputStream, Options options) throws IOException {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> mo1710b(InputStream inputStream, int i, int i2, Options options) throws IOException {
        InputStream inputStream2 = inputStream;
        AtomicReference<byte[]> atomicReference = ByteBufferUtil.f3804a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = ByteBufferUtil.f3804a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i3 = inputStream2.read(andSet);
            if (i3 < 0) {
                ByteBufferUtil.f3804a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f3589a.mo1710b(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i, i2, options);
            }
            byteArrayOutputStream.write(andSet, 0, i3);
        }
    }
}
