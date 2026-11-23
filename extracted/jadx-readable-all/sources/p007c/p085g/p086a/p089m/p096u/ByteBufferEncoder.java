package p007c.p085g.p086a.p089m.p096u;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p007c.p085g.p086a.p089m.Encoder;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p112s.ByteBufferUtil;

/* JADX INFO: renamed from: c.g.a.m.u.c, reason: use source file name */
/* JADX INFO: compiled from: ByteBufferEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferEncoder implements Encoder<ByteBuffer> {
    @Override // p007c.p085g.p086a.p089m.Encoder
    /* JADX INFO: renamed from: a */
    public boolean mo1700a(ByteBuffer byteBuffer, File file, Options options) throws Throwable {
        try {
            ByteBufferUtil.m2034b(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
