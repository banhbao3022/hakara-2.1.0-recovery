package p007c.p085g.p086a.p089m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileInputStream;
import java.io.IOException;
import p007c.p085g.p086a.p089m.p090s.ParcelFileDescriptorRewinder;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p098v.p099d.RecyclableBufferedInputStream;

/* JADX INFO: renamed from: c.g.a.m.g, reason: use source file name */
/* JADX INFO: compiled from: ImageHeaderParserUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ImageHeaderParserUtils2 implements ImageHeaderParserUtils5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ParcelFileDescriptorRewinder f3028a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayPool f3029b;

    public ImageHeaderParserUtils2(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ArrayPool arrayPool) {
        this.f3028a = parcelFileDescriptorRewinder;
        this.f3029b = arrayPool;
    }

    @Override // p007c.p085g.p086a.p089m.ImageHeaderParserUtils5
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo1701a(ImageHeaderParser imageHeaderParser) throws Throwable {
        RecyclableBufferedInputStream recyclableBufferedInputStream = null;
        try {
            RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f3028a.mo1722a().getFileDescriptor()), this.f3029b);
            try {
                ImageHeaderParser.ImageType imageTypeMo1884b = imageHeaderParser.mo1884b(recyclableBufferedInputStream2);
                try {
                    recyclableBufferedInputStream2.close();
                } catch (IOException unused) {
                }
                this.f3028a.mo1722a();
                return imageTypeMo1884b;
            } catch (Throwable th) {
                th = th;
                recyclableBufferedInputStream = recyclableBufferedInputStream2;
                if (recyclableBufferedInputStream != null) {
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f3028a.mo1722a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
