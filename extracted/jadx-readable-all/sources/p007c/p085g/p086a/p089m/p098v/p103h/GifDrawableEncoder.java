package p007c.p085g.p086a.p089m.p098v.p103h;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p007c.p085g.p086a.p089m.EncodeStrategy;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceEncoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p112s.ByteBufferUtil;

/* JADX INFO: renamed from: c.g.a.m.v.h.d, reason: use source file name */
/* JADX INFO: compiled from: GifDrawableEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class GifDrawableEncoder implements ResourceEncoder<GifDrawable> {
    @Override // p007c.p085g.p086a.p089m.Encoder
    /* JADX INFO: renamed from: a */
    public boolean mo1700a(Object obj, File file, Options options) throws Throwable {
        try {
            ByteBufferUtil.m2034b(((GifDrawable) ((Resource2) obj).get()).f3618f.f3628a.f3630a.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // p007c.p085g.p086a.p089m.ResourceEncoder
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo1711b(Options options) {
        return EncodeStrategy.SOURCE;
    }
}
