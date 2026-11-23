package p001a1.p002a.p003a.p004e;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import p001a1.p002a.p003a.C0004c;
import p001a1.p002a.p003a.Util2;
import p477d1.Tuples;
import p477d1.p481d0.Strings5;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: a1.a.a.e.c, reason: use source file name */
/* JADX INFO: compiled from: DefaultConstraint.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultConstraint implements Constraint {

    /* JADX INFO: renamed from: a */
    public boolean f11a;

    /* JADX INFO: renamed from: b */
    public final int f12b;

    /* JADX INFO: renamed from: c */
    public final int f13c;

    /* JADX INFO: renamed from: d */
    public final Bitmap.CompressFormat f14d;

    /* JADX INFO: renamed from: e */
    public final int f15e;

    public DefaultConstraint() {
        this(0, 0, null, 0, 15, null);
    }

    public DefaultConstraint(int i, int i2, Bitmap.CompressFormat compressFormat, int i3) {
        Intrinsics2.m13090f(compressFormat, "format");
        this.f12b = i;
        this.f13c = i2;
        this.f14d = compressFormat;
        this.f15e = i3;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001a1.p002a.p003a.p004e.Constraint
    /* JADX INFO: renamed from: a */
    public File mo7a(File file) throws Throwable {
        int i;
        Bitmap.CompressFormat compressFormat;
        File file2;
        Intrinsics2.m13090f(file, "imageFile");
        int i2 = this.f12b;
        int i3 = this.f13c;
        String str = Util2.f9a;
        Intrinsics2.m13090f(file, "imageFile");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Intrinsics2.m13090f(options, "options");
        Tuples tuples = new Tuples(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) tuples.f29491f).intValue();
        int iIntValue2 = ((Number) tuples.f29492g).intValue();
        if (iIntValue > i3 || iIntValue2 > i2) {
            int i4 = iIntValue / 2;
            int i5 = iIntValue2 / 2;
            i = 1;
            while (i4 / i >= i3 && i5 / i >= i2) {
                i *= 2;
            }
        } else {
            i = 1;
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Intrinsics2.m13086b(bitmapDecodeFile, "BitmapFactory.decodeFile…eFile.absolutePath, this)");
        Intrinsics2.m13086b(bitmapDecodeFile, "BitmapFactory.Options().…absolutePath, this)\n    }");
        Intrinsics2.m13090f(file, "imageFile");
        Intrinsics2.m13090f(bitmapDecodeFile, "bitmap");
        int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
        Matrix matrix = new Matrix();
        if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else if (attributeInt == 8) {
            matrix.postRotate(270.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
        Intrinsics2.m13086b(bitmapCreateBitmap, "Bitmap.createBitmap(bitm…map.height, matrix, true)");
        Bitmap.CompressFormat compressFormat2 = this.f14d;
        int i6 = this.f15e;
        Intrinsics2.m13090f(file, "imageFile");
        Intrinsics2.m13090f(bitmapCreateBitmap, "bitmap");
        Intrinsics2.m13090f(compressFormat2, "format");
        Intrinsics2.m13090f(file, "$this$compressFormat");
        Intrinsics2.m13089e(file, "$this$extension");
        String name = file.getName();
        Intrinsics2.m13088d(name, "name");
        String lowerCase = Strings5.m13003F(name, '.', "").toLowerCase();
        Intrinsics2.m13086b(lowerCase, "(this as java.lang.String).toLowerCase()");
        int iHashCode = lowerCase.hashCode();
        String str2 = "webp";
        if (iHashCode != 111145) {
            if (iHashCode == 3645340 && lowerCase.equals("webp")) {
                compressFormat = Bitmap.CompressFormat.WEBP;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
        } else if (lowerCase.equals("png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if (compressFormat2 == compressFormat) {
            file2 = file;
        } else {
            StringBuilder sb = new StringBuilder();
            String absolutePath = file.getAbsolutePath();
            Intrinsics2.m13086b(absolutePath, "imageFile.absolutePath");
            Intrinsics2.m13089e(absolutePath, "$this$substringBeforeLast");
            Intrinsics2.m13089e(".", "delimiter");
            Intrinsics2.m13089e(absolutePath, "missingDelimiterValue");
            int iM13015y = Strings5.m13015y(absolutePath, ".", 0, false, 6);
            if (iM13015y != -1) {
                absolutePath = absolutePath.substring(0, iM13015y);
                Intrinsics2.m13088d(absolutePath, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            sb.append(absolutePath);
            sb.append('.');
            Intrinsics2.m13090f(compressFormat2, "$this$extension");
            int i7 = C0004c.f8a[compressFormat2.ordinal()];
            if (i7 == 1) {
                str2 = "png";
            } else if (i7 != 2) {
                str2 = "jpg";
            }
            sb.append(str2);
            file2 = new File(sb.toString());
        }
        file.delete();
        Intrinsics2.m13090f(bitmapCreateBitmap, "bitmap");
        Intrinsics2.m13090f(file2, "destination");
        Intrinsics2.m13090f(compressFormat2, "format");
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2.getAbsolutePath());
            try {
                bitmapCreateBitmap.compress(compressFormat2, i6, fileOutputStream2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                this.f11a = true;
                return file2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p001a1.p002a.p003a.p004e.Constraint
    /* JADX INFO: renamed from: b */
    public boolean mo8b(File file) {
        Intrinsics2.m13090f(file, "imageFile");
        return this.f11a;
    }

    public /* synthetic */ DefaultConstraint(int i, int i2, Bitmap.CompressFormat compressFormat, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 612 : i, (i4 & 2) != 0 ? 816 : i2, (i4 & 4) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat, (i4 & 8) != 0 ? 80 : i3);
    }
}
