package p469c1.p470a.p471a.p472a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c1.a.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: BlurTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public class BlurTransformation extends BitmapTransformation2 {

    /* JADX INFO: renamed from: b */
    public int f28075b;

    /* JADX INFO: renamed from: c */
    public int f28076c;

    public BlurTransformation() {
        this(25, 1);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        StringBuilder sbM1556G = outline.m1556G("jp.wasabeef.glide.transformations.BlurTransformation.1");
        sbM1556G.append(this.f28075b);
        sbM1556G.append(this.f28076c);
        messageDigest.update(sbM1556G.toString().getBytes(Key.f3032a));
    }

    @Override // p469c1.p470a.p471a.p472a.BitmapTransformation2
    /* JADX INFO: renamed from: c */
    public Bitmap mo12545c(Context context, BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.f28076c;
        Bitmap bitmapMo1753e = bitmapPool.mo1753e(width / i3, height / i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapMo1753e);
        int i4 = this.f28076c;
        canvas.scale(1.0f / i4, 1.0f / i4);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        int i5 = this.f28075b;
        if (i5 < 1) {
            return null;
        }
        int width2 = bitmapMo1753e.getWidth();
        int height2 = bitmapMo1753e.getHeight();
        int i6 = width2 * height2;
        int[] iArr = new int[i6];
        bitmapMo1753e.getPixels(iArr, 0, width2, 0, 0, width2, height2);
        int i7 = width2 - 1;
        int i8 = height2 - 1;
        int i9 = i5 + i5 + 1;
        int[] iArr2 = new int[i6];
        int[] iArr3 = new int[i6];
        int[] iArr4 = new int[i6];
        int[] iArr5 = new int[Math.max(width2, height2)];
        int i10 = (i9 + 1) >> 1;
        int i11 = i10 * i10;
        int i12 = i11 * 256;
        int[] iArr6 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr6[i13] = i13 / i11;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) int.class, i9, 3);
        int i14 = i5 + 1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < height2) {
            Bitmap bitmap2 = bitmapMo1753e;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = -i5;
            int i27 = 0;
            while (i26 <= i5) {
                int i28 = i8;
                int i29 = height2;
                int i30 = iArr[Math.min(i7, Math.max(i26, 0)) + i16];
                int[] iArr8 = iArr7[i26 + i5];
                iArr8[0] = (i30 & 16711680) >> 16;
                iArr8[1] = (i30 & 65280) >> 8;
                iArr8[2] = i30 & 255;
                int iAbs = i14 - Math.abs(i26);
                i27 = (iArr8[0] * iAbs) + i27;
                i18 = (iArr8[1] * iAbs) + i18;
                i19 = (iArr8[2] * iAbs) + i19;
                if (i26 > 0) {
                    i23 += iArr8[0];
                    i24 += iArr8[1];
                    i25 += iArr8[2];
                } else {
                    i20 += iArr8[0];
                    i21 += iArr8[1];
                    i22 += iArr8[2];
                }
                i26++;
                height2 = i29;
                i8 = i28;
            }
            int i31 = i8;
            int i32 = height2;
            int i33 = i27;
            int i34 = i5;
            int i35 = 0;
            while (i35 < width2) {
                iArr2[i16] = iArr6[i33];
                iArr3[i16] = iArr6[i18];
                iArr4[i16] = iArr6[i19];
                int i36 = i33 - i20;
                int i37 = i18 - i21;
                int i38 = i19 - i22;
                int[] iArr9 = iArr7[((i34 - i5) + i9) % i9];
                int i39 = i20 - iArr9[0];
                int i40 = i21 - iArr9[1];
                int i41 = i22 - iArr9[2];
                if (i15 == 0) {
                    iArr5[i35] = Math.min(i35 + i5 + 1, i7);
                }
                int i42 = iArr[i17 + iArr5[i35]];
                iArr9[0] = (i42 & 16711680) >> 16;
                iArr9[1] = (i42 & 65280) >> 8;
                iArr9[2] = i42 & 255;
                int i43 = i23 + iArr9[0];
                int i44 = i24 + iArr9[1];
                int i45 = i25 + iArr9[2];
                i33 = i36 + i43;
                i18 = i37 + i44;
                i19 = i38 + i45;
                i34 = (i34 + 1) % i9;
                int[] iArr10 = iArr7[i34 % i9];
                i20 = i39 + iArr10[0];
                i21 = i40 + iArr10[1];
                i22 = i41 + iArr10[2];
                i23 = i43 - iArr10[0];
                i24 = i44 - iArr10[1];
                i25 = i45 - iArr10[2];
                i16++;
                i35++;
                iArr6 = iArr6;
            }
            i17 += width2;
            i15++;
            bitmapMo1753e = bitmap2;
            height2 = i32;
            i8 = i31;
        }
        Bitmap bitmap3 = bitmapMo1753e;
        int[] iArr11 = iArr6;
        int i46 = i8;
        int i47 = height2;
        int i48 = 0;
        while (i48 < width2) {
            int i49 = -i5;
            int i50 = i9;
            int[] iArr12 = iArr5;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = i49;
            int i59 = i49 * width2;
            int i60 = 0;
            int i61 = 0;
            while (i58 <= i5) {
                int i62 = width2;
                int iMax = Math.max(0, i59) + i48;
                int[] iArr13 = iArr7[i58 + i5];
                iArr13[0] = iArr2[iMax];
                iArr13[1] = iArr3[iMax];
                iArr13[2] = iArr4[iMax];
                int iAbs2 = i14 - Math.abs(i58);
                i61 = (iArr2[iMax] * iAbs2) + i61;
                i60 = (iArr3[iMax] * iAbs2) + i60;
                i51 = (iArr4[iMax] * iAbs2) + i51;
                if (i58 > 0) {
                    i55 += iArr13[0];
                    i56 += iArr13[1];
                    i57 += iArr13[2];
                } else {
                    i52 += iArr13[0];
                    i53 += iArr13[1];
                    i54 += iArr13[2];
                }
                int i63 = i46;
                if (i58 < i63) {
                    i59 += i62;
                }
                i58++;
                i46 = i63;
                width2 = i62;
            }
            int i64 = width2;
            int i65 = i46;
            int i66 = i47;
            int i67 = i48;
            int i68 = i5;
            int i69 = 0;
            while (i69 < i66) {
                iArr[i67] = (iArr[i67] & (-16777216)) | (iArr11[i61] << 16) | (iArr11[i60] << 8) | iArr11[i51];
                int i70 = i61 - i52;
                int i71 = i60 - i53;
                int i72 = i51 - i54;
                int[] iArr14 = iArr7[((i68 - i5) + i50) % i50];
                int i73 = i52 - iArr14[0];
                int i74 = i53 - iArr14[1];
                int i75 = i54 - iArr14[2];
                int i76 = i5;
                if (i48 == 0) {
                    iArr12[i69] = Math.min(i69 + i14, i65) * i64;
                }
                int i77 = iArr12[i69] + i48;
                iArr14[0] = iArr2[i77];
                iArr14[1] = iArr3[i77];
                iArr14[2] = iArr4[i77];
                int i78 = i55 + iArr14[0];
                int i79 = i56 + iArr14[1];
                int i80 = i57 + iArr14[2];
                i61 = i70 + i78;
                i60 = i71 + i79;
                i51 = i72 + i80;
                i68 = (i68 + 1) % i50;
                int[] iArr15 = iArr7[i68];
                i52 = i73 + iArr15[0];
                i53 = i74 + iArr15[1];
                i54 = i75 + iArr15[2];
                i55 = i78 - iArr15[0];
                i56 = i79 - iArr15[1];
                i57 = i80 - iArr15[2];
                i67 += i64;
                i69++;
                i5 = i76;
            }
            i48++;
            i47 = i66;
            i46 = i65;
            iArr5 = iArr12;
            i9 = i50;
            width2 = i64;
        }
        int i81 = width2;
        bitmap3.setPixels(iArr, 0, i81, 0, 0, i81, i47);
        return bitmap3;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (obj instanceof BlurTransformation) {
            BlurTransformation blurTransformation = (BlurTransformation) obj;
            if (blurTransformation.f28075b == this.f28075b && blurTransformation.f28076c == this.f28076c) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return (this.f28076c * 10) + (this.f28075b * CloseCodes.NORMAL_CLOSURE) + 737513610;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("BlurTransformation(radius=");
        sbM1556G.append(this.f28075b);
        sbM1556G.append(", sampling=");
        return outline.m1603y(sbM1556G, this.f28076c, ")");
    }

    public BlurTransformation(int i) {
        this(i, 1);
    }

    public BlurTransformation(int i, int i2) {
        this.f28075b = i;
        this.f28076c = i2;
    }
}
