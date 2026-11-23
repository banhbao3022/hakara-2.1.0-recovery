package p007c.p085g.p086a.p089m.p098v.p103h;

import com.bumptech.glide.gifdecoder.GifDecoder;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.h.b, reason: use source file name */
/* JADX INFO: compiled from: GifBitmapProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class GifBitmapProvider implements GifDecoder.BitmapProvider {

    /* JADX INFO: renamed from: a */
    public final BitmapPool f3616a;

    /* JADX INFO: renamed from: b */
    public final ArrayPool f3617b;

    public GifBitmapProvider(BitmapPool bitmapPool) {
        this(bitmapPool, null);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m1923a(int i) {
        ArrayPool arrayPool = this.f3617b;
        return arrayPool == null ? new byte[i] : (byte[]) arrayPool.mo1745e(i, byte[].class);
    }

    public GifBitmapProvider(BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.f3616a = bitmapPool;
        this.f3617b = arrayPool;
    }
}
