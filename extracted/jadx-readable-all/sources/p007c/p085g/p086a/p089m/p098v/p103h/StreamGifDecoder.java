package p007c.p085g.p086a.p089m.p098v.p103h;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.v.h.j, reason: use source file name */
/* JADX INFO: compiled from: StreamGifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class StreamGifDecoder implements ResourceDecoder<InputStream, GifDrawable> {

    /* JADX INFO: renamed from: a */
    public final List<ImageHeaderParser> f3655a;

    /* JADX INFO: renamed from: b */
    public final ResourceDecoder<ByteBuffer, GifDrawable> f3656b;

    /* JADX INFO: renamed from: c */
    public final ArrayPool f3657c;

    public StreamGifDecoder(List<ImageHeaderParser> list, ResourceDecoder<ByteBuffer, GifDrawable> resourceDecoder, ArrayPool arrayPool) {
        this.f3655a = list;
        this.f3656b = resourceDecoder;
        this.f3657c = arrayPool;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public boolean mo1709a(InputStream inputStream, Options options) throws IOException {
        return !((Boolean) options.m1707c(GifOptions.f3654b)).booleanValue() && C8462c.m16945l(this.f3655a, inputStream, this.f3657c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<GifDrawable> mo1710b(InputStream inputStream, int i, int i2, Options options) throws IOException {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream2.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f3656b.mo1710b(ByteBuffer.wrap(byteArray), i, i2, options);
    }
}
