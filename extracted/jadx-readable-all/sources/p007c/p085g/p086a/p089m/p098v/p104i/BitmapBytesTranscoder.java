package p007c.p085g.p086a.p089m.p098v.p104i;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p098v.p100e.BytesResource;

/* JADX INFO: renamed from: c.g.a.m.v.i.a, reason: use source file name */
/* JADX INFO: compiled from: BitmapBytesTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class BitmapBytesTranscoder implements ResourceTranscoder<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a */
    public final Bitmap.CompressFormat f3658a;

    /* JADX INFO: renamed from: b */
    public final int f3659b;

    public BitmapBytesTranscoder() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p104i.ResourceTranscoder
    /* JADX INFO: renamed from: a */
    public Resource2<byte[]> mo1934a(Resource2<Bitmap> resource2, Options options) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        resource2.get().compress(this.f3658a, this.f3659b, byteArrayOutputStream);
        resource2.mo1830b();
        return new BytesResource(byteArrayOutputStream.toByteArray());
    }

    public BitmapBytesTranscoder(Bitmap.CompressFormat compressFormat, int i) {
        this.f3658a = compressFormat;
        this.f3659b = i;
    }
}
