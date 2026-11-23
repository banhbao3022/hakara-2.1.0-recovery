package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p007c.p085g.p086a.p089m.EncodeStrategy;
import p007c.p085g.p086a.p089m.Option;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceEncoder;
import p007c.p085g.p086a.p089m.p090s.BufferedOutputStream;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p112s.LogTime;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.v.d.c, reason: use source file name */
/* JADX INFO: compiled from: BitmapEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {

    /* JADX INFO: renamed from: a */
    public static final Option<Integer> f3526a = Option.m1705a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: b */
    public static final Option<Bitmap.CompressFormat> f3527b = new Option<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, Option.f3034a);

    /* JADX INFO: renamed from: c */
    public final ArrayPool f3528c;

    public BitmapEncoder(ArrayPool arrayPool) {
        this.f3528c = arrayPool;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {, blocks: (B:10:0x0026, B:32:0x006b, B:34:0x006f, B:36:0x0075, B:40:0x00bf, B:41:0x00c2), top: B:46:0x0026 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0075, please report this as an issue */
    @Override // p007c.p085g.p086a.p089m.Encoder
    /* JADX INFO: renamed from: a */
    public boolean mo1700a(Object obj, File file, Options options) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) ((Resource2) obj).get();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) options.m1707c(f3527b);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = LogTime.f3820b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) options.m1707c(f3526a)).intValue();
        boolean z = false;
        OutputStream bufferedOutputStream = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        bufferedOutputStream = this.f3528c != null ? new BufferedOutputStream(fileOutputStream, this.f3528c) : fileOutputStream;
                        bitmap.compress(compressFormat, iIntValue, bufferedOutputStream);
                        bufferedOutputStream.close();
                        z = true;
                    } catch (IOException e) {
                        e = e;
                        bufferedOutputStream = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (bufferedOutputStream != null) {
                        }
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + Util4.m2049d(bitmap) + " in " + LogTime.m2040a(jElapsedRealtimeNanos) + ", options format: " + options.m1707c(f3527b) + ", hasAlpha: " + bitmap.hasAlpha());
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (IOException e2) {
                e = e2;
            }
            bufferedOutputStream.close();
        } catch (IOException unused2) {
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + Util4.m2049d(bitmap) + " in " + LogTime.m2040a(jElapsedRealtimeNanos) + ", options format: " + options.m1707c(f3527b) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceEncoder
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo1711b(Options options) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Deprecated
    public BitmapEncoder() {
        this.f3528c = null;
    }
}
