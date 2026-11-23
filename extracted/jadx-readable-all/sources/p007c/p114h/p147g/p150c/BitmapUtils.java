package p007c.p114h.p147g.p150c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;
import java.io.File;

/* JADX INFO: renamed from: c.h.g.c.a, reason: use source file name */
/* JADX INFO: compiled from: BitmapUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class BitmapUtils {
    /* JADX INFO: renamed from: a */
    public static Bitmap m2219a(String str) {
        if (!new File(str).exists()) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(str);
        } catch (Exception e) {
            Log.e("BitmapUtils", "getBitmapFromFile: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m2220b(byte[] bArr, int i) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.postRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
        bitmapDecodeByteArray.recycle();
        System.gc();
        return bitmapCreateBitmap;
    }
}
