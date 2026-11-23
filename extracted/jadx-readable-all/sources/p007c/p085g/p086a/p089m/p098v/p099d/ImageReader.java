package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import p007c.p085g.p086a.p089m.ImageHeaderParserUtils2;
import p007c.p085g.p086a.p089m.ImageHeaderParserUtils3;
import p007c.p085g.p086a.p089m.p090s.InputStreamRewinder;
import p007c.p085g.p086a.p089m.p090s.ParcelFileDescriptorRewinder;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.v.d.t, reason: use source file name */
/* JADX INFO: compiled from: ImageReader.java */
/* JADX INFO: loaded from: classes.dex */
public interface ImageReader {

    /* JADX INFO: renamed from: c.g.a.m.v.d.t$a */
    /* JADX INFO: compiled from: ImageReader.java */
    public static final class a implements ImageReader {

        /* JADX INFO: renamed from: a */
        public final InputStreamRewinder f3583a;

        /* JADX INFO: renamed from: b */
        public final ArrayPool f3584b;

        /* JADX INFO: renamed from: c */
        public final List<ImageHeaderParser> f3585c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, ArrayPool arrayPool) {
            Objects.requireNonNull(arrayPool, "Argument must not be null");
            this.f3584b = arrayPool;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f3585c = list;
            this.f3583a = new InputStreamRewinder(inputStream, arrayPool);
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.ImageReader
        /* JADX INFO: renamed from: a */
        public int mo1910a() throws IOException {
            return C8462c.m16941h(this.f3585c, this.f3583a.mo1722a(), this.f3584b);
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.ImageReader
        /* JADX INFO: renamed from: b */
        public Bitmap mo1911b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f3583a.mo1722a(), null, options);
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.ImageReader
        /* JADX INFO: renamed from: c */
        public void mo1912c() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f3583a.f3065a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f3595h = recyclableBufferedInputStream.f3593f.length;
            }
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.ImageReader
        /* JADX INFO: renamed from: d */
        public ImageHeaderParser.ImageType mo1913d() throws IOException {
            return C8462c.m16945l(this.f3585c, this.f3583a.mo1722a(), this.f3584b);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.t$b */
    /* JADX INFO: compiled from: ImageReader.java */
    public static final class b implements ImageReader {

        /* JADX INFO: renamed from: a */
        public final ArrayPool f3586a;

        /* JADX INFO: renamed from: b */
        public final List<ImageHeaderParser> f3587b;

        /* JADX INFO: renamed from: c */
        public final ParcelFileDescriptorRewinder f3588c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, ArrayPool arrayPool) {
            Objects.requireNonNull(arrayPool, "Argument must not be null");
            this.f3586a = arrayPool;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f3587b = list;
            this.f3588c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.ImageReader
        /* JADX INFO: renamed from: a */
        public int mo1910a() throws IOException {
            return C8462c.m16942i(this.f3587b, new ImageHeaderParserUtils3(this.f3588c, this.f3586a));
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.ImageReader
        /* JADX INFO: renamed from: b */
        public Bitmap mo1911b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f3588c.mo1722a().getFileDescriptor(), null, options);
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.ImageReader
        /* JADX INFO: renamed from: c */
        public void mo1912c() {
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.ImageReader
        /* JADX INFO: renamed from: d */
        public ImageHeaderParser.ImageType mo1913d() throws IOException {
            return C8462c.m16946m(this.f3587b, new ImageHeaderParserUtils2(this.f3588c, this.f3586a));
        }
    }

    /* JADX INFO: renamed from: a */
    int mo1910a() throws IOException;

    /* JADX INFO: renamed from: b */
    Bitmap mo1911b(BitmapFactory.Options options) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo1912c();

    /* JADX INFO: renamed from: d */
    ImageHeaderParser.ImageType mo1913d() throws IOException;
}
