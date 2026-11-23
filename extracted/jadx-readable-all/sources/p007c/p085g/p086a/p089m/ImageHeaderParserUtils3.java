package p007c.p085g.p086a.p089m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileInputStream;
import java.io.IOException;
import p007c.p085g.p086a.p089m.p090s.ParcelFileDescriptorRewinder;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p098v.p099d.RecyclableBufferedInputStream;

/* JADX INFO: renamed from: c.g.a.m.h, reason: use source file name */
/* JADX INFO: compiled from: ImageHeaderParserUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ImageHeaderParserUtils3 implements ImageHeaderParserUtils4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ParcelFileDescriptorRewinder f3030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayPool f3031b;

    public ImageHeaderParserUtils3(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ArrayPool arrayPool) {
        this.f3030a = parcelFileDescriptorRewinder;
        this.f3031b = arrayPool;
    }

    @Override // p007c.p085g.p086a.p089m.ImageHeaderParserUtils4
    /* JADX INFO: renamed from: a */
    public int mo1702a(ImageHeaderParser imageHeaderParser) throws Throwable {
        RecyclableBufferedInputStream recyclableBufferedInputStream = null;
        try {
            RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f3030a.mo1722a().getFileDescriptor()), this.f3031b);
            try {
                int iMo1885c = imageHeaderParser.mo1885c(recyclableBufferedInputStream2, this.f3031b);
                try {
                    recyclableBufferedInputStream2.close();
                } catch (IOException unused) {
                }
                this.f3030a.mo1722a();
                return iMo1885c;
            } catch (Throwable th) {
                th = th;
                recyclableBufferedInputStream = recyclableBufferedInputStream2;
                if (recyclableBufferedInputStream != null) {
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f3030a.mo1722a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
