package p007c.p085g.p086a.p089m.p096u;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p007c.p085g.p086a.p089m.Encoder;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;

/* JADX INFO: renamed from: c.g.a.m.u.t, reason: use source file name */
/* JADX INFO: compiled from: StreamEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class StreamEncoder implements Encoder<InputStream> {

    /* JADX INFO: renamed from: a */
    public final ArrayPool f3464a;

    public StreamEncoder(ArrayPool arrayPool) {
        this.f3464a = arrayPool;
    }

    @Override // p007c.p085g.p086a.p089m.Encoder
    /* JADX INFO: renamed from: a */
    public boolean mo1700a(InputStream inputStream, File file, Options options) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        byte[] bArr = (byte[]) this.f3464a.mo1745e(65536, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int i = inputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream2 = fileOutputStream;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            this.f3464a.mo1744d(bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f3464a.mo1744d(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z = true;
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e2) {
                e = e2;
            }
            this.f3464a.mo1744d(bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
