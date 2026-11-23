package p007c.p085g.p086a.p089m.p098v.p099d;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p636z0.p750o.p751a.ExifInterface;

/* JADX INFO: renamed from: c.g.a.m.v.d.q, reason: use source file name */
/* JADX INFO: compiled from: ExifInterfaceImageHeaderParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class ExifInterfaceImageHeaderParser implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo1883a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public ImageHeaderParser.ImageType mo1884b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public int mo1885c(InputStream inputStream, ArrayPool arrayPool) throws Throwable {
        int iM16433f;
        ExifInterface exifInterface = new ExifInterface(inputStream);
        ExifInterface.b bVarM16410d = exifInterface.m16410d("Orientation");
        if (bVarM16410d == null) {
            iM16433f = 1;
        } else {
            try {
                iM16433f = bVarM16410d.m16433f(exifInterface.f38236I);
            } catch (NumberFormatException unused) {
                iM16433f = 1;
            }
        }
        if (iM16433f == 0) {
            return -1;
        }
        return iM16433f;
    }
}
