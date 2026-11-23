package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p112s.ByteBufferUtil;

/* JADX INFO: renamed from: c.g.a.m.v.d.g, reason: use source file name */
/* JADX INFO: compiled from: ByteBufferBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferBitmapDecoder implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final Downsampler f3542a;

    public ByteBufferBitmapDecoder(Downsampler downsampler) {
        this.f3542a = downsampler;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public boolean mo1709a(ByteBuffer byteBuffer, Options options) throws IOException {
        Objects.requireNonNull(this.f3542a);
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> mo1710b(ByteBuffer byteBuffer, int i, int i2, Options options) throws IOException {
        AtomicReference<byte[]> atomicReference = ByteBufferUtil.f3804a;
        return this.f3542a.m1905b(new ByteBufferUtil.a(byteBuffer), i, i2, options, Downsampler.f3564f);
    }
}
