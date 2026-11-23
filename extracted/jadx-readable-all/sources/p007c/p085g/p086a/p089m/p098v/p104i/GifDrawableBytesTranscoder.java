package p007c.p085g.p086a.p089m.p098v.p104i;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p098v.p100e.BytesResource;
import p007c.p085g.p086a.p089m.p098v.p103h.GifDrawable;
import p007c.p085g.p086a.p112s.ByteBufferUtil;

/* JADX INFO: renamed from: c.g.a.m.v.i.d, reason: use source file name */
/* JADX INFO: compiled from: GifDrawableBytesTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class GifDrawableBytesTranscoder implements ResourceTranscoder<GifDrawable, byte[]> {
    @Override // p007c.p085g.p086a.p089m.p098v.p104i.ResourceTranscoder
    /* JADX INFO: renamed from: a */
    public Resource2<byte[]> mo1934a(Resource2<GifDrawable> resource2, Options options) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = resource2.get().f3618f.f3628a.f3630a.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = ByteBufferUtil.f3804a;
        ByteBufferUtil.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new ByteBufferUtil.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar != null && bVar.f3807a == 0 && bVar.f3808b == bVar.f3809c.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.position(0);
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new BytesResource(bArrArray);
    }
}
