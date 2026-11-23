package p007c.p085g.p086a.p089m.p098v.p099d;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Option;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.d0, reason: use source file name */
/* JADX INFO: compiled from: VideoDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class VideoDecoder<T> implements ResourceDecoder<T, Bitmap> {

    /* JADX INFO: renamed from: a */
    public static final Option<Long> f3531a = new Option<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: b */
    public static final Option<Integer> f3532b = new Option<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: c */
    public static final e f3533c = new e();

    /* JADX INFO: renamed from: d */
    public final f<T> f3534d;

    /* JADX INFO: renamed from: e */
    public final BitmapPool f3535e;

    /* JADX INFO: renamed from: f */
    public final e f3536f;

    /* JADX INFO: renamed from: c.g.a.m.v.d.d0$a */
    /* JADX INFO: compiled from: VideoDecoder.java */
    public class a implements Option.b<Long> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f3537a = ByteBuffer.allocate(8);

        @Override // p007c.p085g.p086a.p089m.Option.b
        /* JADX INFO: renamed from: a */
        public void mo1706a(byte[] bArr, Long l, MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.f3537a) {
                this.f3537a.position(0);
                messageDigest.update(this.f3537a.putLong(l2.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.d0$b */
    /* JADX INFO: compiled from: VideoDecoder.java */
    public class b implements Option.b<Integer> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f3538a = ByteBuffer.allocate(4);

        @Override // p007c.p085g.p086a.p089m.Option.b
        /* JADX INFO: renamed from: a */
        public void mo1706a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f3538a) {
                this.f3538a.position(0);
                messageDigest.update(this.f3538a.putInt(num2.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.d0$c */
    /* JADX INFO: compiled from: VideoDecoder.java */
    public static final class c implements f<AssetFileDescriptor> {
        public c(a aVar) {
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.VideoDecoder.f
        /* JADX INFO: renamed from: a */
        public void mo1880a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.d0$d */
    /* JADX INFO: compiled from: VideoDecoder.java */
    public static final class d implements f<ByteBuffer> {
        @Override // p007c.p085g.p086a.p089m.p098v.p099d.VideoDecoder.f
        /* JADX INFO: renamed from: a */
        public void mo1880a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new VideoDecoder2(this, byteBuffer));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.d0$e */
    /* JADX INFO: compiled from: VideoDecoder.java */
    public static class e {
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.d0$f */
    /* JADX INFO: compiled from: VideoDecoder.java */
    public interface f<T> {
        /* JADX INFO: renamed from: a */
        void mo1880a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.d0$g */
    /* JADX INFO: compiled from: VideoDecoder.java */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // p007c.p085g.p086a.p089m.p098v.p099d.VideoDecoder.f
        /* JADX INFO: renamed from: a */
        public void mo1880a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(BitmapPool bitmapPool, f<T> fVar) {
        e eVar = f3533c;
        this.f3535e = bitmapPool;
        this.f3534d = fVar;
        this.f3536f = eVar;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m1879c(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap scaledFrameAtTime;
        if (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f3555d) {
            scaledFrameAtTime = null;
        } else {
            try {
                int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i6 == 90 || i6 == 270) {
                    i5 = i4;
                    i4 = i5;
                }
                float fMo1895b = downsampleStrategy.mo1895b(i4, i5, i2, i3);
                scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j2, i, Math.round(i4 * fMo1895b), Math.round(fMo1895b * i5));
            } catch (Throwable th) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
                }
                scaledFrameAtTime = null;
            }
        }
        return scaledFrameAtTime == null ? mediaMetadataRetriever.getFrameAtTime(j2, i) : scaledFrameAtTime;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public boolean mo1709a(T t, Options options) {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> mo1710b(T t, int i, int i2, Options options) throws IOException {
        long jLongValue = ((Long) options.m1707c(f3531a)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(outline.m1594p("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) options.m1707c(f3532b);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.m1707c(DownsampleStrategy.f3557f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f3556e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        Objects.requireNonNull(this.f3536f);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f3534d.mo1880a(mediaMetadataRetriever, t);
                Bitmap bitmapM1879c = m1879c(mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, downsampleStrategy2);
                mediaMetadataRetriever.release();
                return BitmapResource.m1881e(bitmapM1879c, this.f3535e);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
