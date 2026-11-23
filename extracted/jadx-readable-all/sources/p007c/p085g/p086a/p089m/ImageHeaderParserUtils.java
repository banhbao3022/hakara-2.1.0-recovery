package p007c.p085g.p086a.p089m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.g.a.m.f, reason: use source file name */
/* JADX INFO: compiled from: ImageHeaderParserUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ImageHeaderParserUtils implements ImageHeaderParserUtils5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteBuffer f3027a;

    public ImageHeaderParserUtils(ByteBuffer byteBuffer) {
        this.f3027a = byteBuffer;
    }

    @Override // p007c.p085g.p086a.p089m.ImageHeaderParserUtils5
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo1701a(ImageHeaderParser imageHeaderParser) throws IOException {
        return imageHeaderParser.mo1883a(this.f3027a);
    }
}
