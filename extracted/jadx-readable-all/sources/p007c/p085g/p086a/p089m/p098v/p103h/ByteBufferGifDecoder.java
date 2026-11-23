package p007c.p085g.p086a.p089m.p098v.p103h;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.p089m.DecodeFormat;
import p007c.p085g.p086a.p089m.ImageHeaderParserUtils;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p098v.UnitTransformation;
import p007c.p085g.p086a.p112s.LogTime;
import p007c.p085g.p086a.p112s.Util4;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.v.h.a, reason: use source file name */
/* JADX INFO: compiled from: ByteBufferGifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferGifDecoder implements ResourceDecoder<ByteBuffer, GifDrawable> {

    /* JADX INFO: renamed from: a */
    public static final a f3608a = new a();

    /* JADX INFO: renamed from: b */
    public static final b f3609b = new b();

    /* JADX INFO: renamed from: c */
    public final Context f3610c;

    /* JADX INFO: renamed from: d */
    public final List<ImageHeaderParser> f3611d;

    /* JADX INFO: renamed from: e */
    public final b f3612e;

    /* JADX INFO: renamed from: f */
    public final a f3613f;

    /* JADX INFO: renamed from: g */
    public final GifBitmapProvider f3614g;

    /* JADX INFO: renamed from: c.g.a.m.v.h.a$a */
    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    public static class a {
    }

    /* JADX INFO: renamed from: c.g.a.m.v.h.a$b */
    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Queue<GifHeaderParser> f3615a;

        public b() {
            char[] cArr = Util4.f3828a;
            this.f3615a = new ArrayDeque(0);
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m1922a(GifHeaderParser gifHeaderParser) {
            gifHeaderParser.f2990b = null;
            gifHeaderParser.f2991c = null;
            this.f3615a.offer(gifHeaderParser);
        }
    }

    public ByteBufferGifDecoder(Context context) {
        this(context, Glide.m1624b(context).f2859k.m1632e(), Glide.m1624b(context).f2856h, Glide.m1624b(context).f2860l);
    }

    /* JADX INFO: renamed from: d */
    public static int m1920d(GifHeader gifHeader, int i, int i2) {
        int iMin = Math.min(gifHeader.f2984g / i2, gifHeader.f2983f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbM1559J = outline.m1559J("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i, "x");
            sbM1559J.append(i2);
            sbM1559J.append("], actual dimens: [");
            sbM1559J.append(gifHeader.f2983f);
            sbM1559J.append("x");
            sbM1559J.append(gifHeader.f2984g);
            sbM1559J.append("]");
            Log.v("BufferGifDecoder", sbM1559J.toString());
        }
        return iMax;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public boolean mo1709a(ByteBuffer byteBuffer, Options options) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!((Boolean) options.m1707c(GifOptions.f3654b)).booleanValue()) {
            if ((byteBuffer2 == null ? ImageHeaderParser.ImageType.UNKNOWN : C8462c.m16946m(this.f3611d, new ImageHeaderParserUtils(byteBuffer2))) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<GifDrawable> mo1710b(ByteBuffer byteBuffer, int i, int i2, Options options) throws IOException {
        GifHeaderParser gifHeaderParser;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f3612e;
        synchronized (bVar) {
            GifHeaderParser gifHeaderParserPoll = bVar.f3615a.poll();
            if (gifHeaderParserPoll == null) {
                gifHeaderParserPoll = new GifHeaderParser();
            }
            gifHeaderParser = gifHeaderParserPoll;
            gifHeaderParser.f2990b = null;
            Arrays.fill(gifHeaderParser.f2989a, (byte) 0);
            gifHeaderParser.f2991c = new GifHeader();
            gifHeaderParser.f2992d = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            gifHeaderParser.f2990b = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            gifHeaderParser.f2990b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return m1921c(byteBuffer2, i, i2, gifHeaderParser, options);
        } finally {
            this.f3612e.m1922a(gifHeaderParser);
        }
    }

    /* JADX INFO: renamed from: c */
    public final GifDrawableResource m1921c(ByteBuffer byteBuffer, int i, int i2, GifHeaderParser gifHeaderParser, Options options) {
        int i3 = LogTime.f3820b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            GifHeader gifHeaderM1691b = gifHeaderParser.m1691b();
            if (gifHeaderM1691b.f2980c > 0 && gifHeaderM1691b.f2979b == 0) {
                Bitmap.Config config = options.m1707c(GifOptions.f3653a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM1920d = m1920d(gifHeaderM1691b, i, i2);
                a aVar = this.f3613f;
                GifBitmapProvider gifBitmapProvider = this.f3614g;
                Objects.requireNonNull(aVar);
                StandardGifDecoder standardGifDecoder = new StandardGifDecoder(gifBitmapProvider, gifHeaderM1691b, byteBuffer, iM1920d);
                standardGifDecoder.setDefaultBitmapConfig(config);
                standardGifDecoder.f3004l = (standardGifDecoder.f3004l + 1) % standardGifDecoder.f3005m.f2980c;
                Bitmap nextFrame = standardGifDecoder.getNextFrame();
                if (nextFrame == null) {
                    return null;
                }
                return new GifDrawableResource(new GifDrawable(this.f3610c, standardGifDecoder, (UnitTransformation) UnitTransformation.f3512b, i, i2, nextFrame));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sbM1556G = outline.m1556G("Decoded GIF from stream in ");
                sbM1556G.append(LogTime.m2040a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sbM1556G.toString());
            }
        }
    }

    public ByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool) {
        b bVar = f3609b;
        a aVar = f3608a;
        this.f3610c = context.getApplicationContext();
        this.f3611d = list;
        this.f3613f = aVar;
        this.f3614g = new GifBitmapProvider(bitmapPool, arrayPool);
        this.f3612e = bVar;
    }
}
