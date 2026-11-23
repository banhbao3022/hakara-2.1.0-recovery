package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p112s.ExceptionCatchingInputStream;
import p007c.p085g.p086a.p112s.MarkEnforcingInputStream;

/* JADX INFO: renamed from: c.g.a.m.v.d.a0, reason: use source file name */
/* JADX INFO: compiled from: StreamBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class StreamBitmapDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final Downsampler f3515a;

    /* JADX INFO: renamed from: b */
    public final ArrayPool f3516b;

    /* JADX INFO: renamed from: c.g.a.m.v.d.a0$a */
    /* JADX INFO: compiled from: StreamBitmapDecoder.java */
    public static class a implements Downsampler.b {

        /* JADX INFO: renamed from: a */
        public final RecyclableBufferedInputStream f3517a;

        /* JADX INFO: renamed from: b */
        public final ExceptionCatchingInputStream f3518b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, ExceptionCatchingInputStream exceptionCatchingInputStream) {
            this.f3517a = recyclableBufferedInputStream;
            this.f3518b = exceptionCatchingInputStream;
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.Downsampler.b
        /* JADX INFO: renamed from: a */
        public void mo1872a(BitmapPool bitmapPool, Bitmap bitmap) throws IOException {
            IOException iOException = this.f3518b.f3815h;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                bitmapPool.mo1752d(bitmap);
                throw iOException;
            }
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.Downsampler.b
        /* JADX INFO: renamed from: b */
        public void mo1873b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f3517a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f3595h = recyclableBufferedInputStream.f3593f.length;
            }
        }
    }

    public StreamBitmapDecoder(Downsampler downsampler, ArrayPool arrayPool) {
        this.f3515a = downsampler;
        this.f3516b = arrayPool;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public boolean mo1709a(InputStream inputStream, Options options) throws IOException {
        Objects.requireNonNull(this.f3515a);
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> mo1710b(InputStream inputStream, int i, int i2, Options options) throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z;
        ExceptionCatchingInputStream exceptionCatchingInputStreamPoll;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream2;
            z = false;
        } else {
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream2, this.f3516b);
            z = true;
        }
        Queue<ExceptionCatchingInputStream> queue = ExceptionCatchingInputStream.f3813f;
        synchronized (queue) {
            exceptionCatchingInputStreamPoll = queue.poll();
        }
        if (exceptionCatchingInputStreamPoll == null) {
            exceptionCatchingInputStreamPoll = new ExceptionCatchingInputStream();
        }
        exceptionCatchingInputStreamPoll.f3814g = recyclableBufferedInputStream;
        try {
            return this.f3515a.m1905b(new MarkEnforcingInputStream(exceptionCatchingInputStreamPoll), i, i2, options, new a(recyclableBufferedInputStream, exceptionCatchingInputStreamPoll));
        } finally {
            exceptionCatchingInputStreamPoll.m2039a();
            if (z) {
                recyclableBufferedInputStream.m1917c();
            }
        }
    }
}
