package p469c1.p470a.p471a.p472a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.stetho.websocket.CloseCodes;
import java.security.MessageDigest;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c1.a.a.a.c, reason: use source file name */
/* JADX INFO: compiled from: RoundedCornersTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public class RoundedCornersTransformation extends BitmapTransformation2 {

    /* JADX INFO: renamed from: b */
    public int f28077b;

    /* JADX INFO: renamed from: c */
    public int f28078c;

    /* JADX INFO: renamed from: d */
    public int f28079d;

    /* JADX INFO: renamed from: e */
    public a f28080e;

    /* JADX INFO: renamed from: c1.a.a.a.c$a */
    /* JADX INFO: compiled from: RoundedCornersTransformation.java */
    public enum a {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public RoundedCornersTransformation(int i, int i2) {
        this(i, i2, a.ALL);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        StringBuilder sbM1556G = outline.m1556G("jp.wasabeef.glide.transformations.RoundedCornersTransformation.1");
        sbM1556G.append(this.f28077b);
        sbM1556G.append(this.f28078c);
        sbM1556G.append(this.f28079d);
        sbM1556G.append(this.f28080e);
        messageDigest.update(sbM1556G.toString().getBytes(Key.f3032a));
    }

    @Override // p469c1.p470a.p471a.p472a.BitmapTransformation2
    /* JADX INFO: renamed from: c */
    public Bitmap mo12545c(Context context, BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapMo1753e = bitmapPool.mo1753e(width, height, Bitmap.Config.ARGB_8888);
        bitmapMo1753e.setHasAlpha(true);
        Canvas canvas = new Canvas(bitmapMo1753e);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = height;
        float f2 = this.f28079d;
        float f3 = width - f2;
        float f4 = f - f2;
        switch (this.f28080e) {
            case ALL:
                float f5 = this.f28079d;
                RectF rectF = new RectF(f5, f5, f3, f4);
                float f6 = this.f28077b;
                canvas.drawRoundRect(rectF, f6, f6, paint);
                return bitmapMo1753e;
            case TOP_LEFT:
                int i3 = this.f28079d;
                float f7 = i3;
                float f8 = i3 + this.f28078c;
                RectF rectF2 = new RectF(f7, f7, f8, f8);
                float f9 = this.f28077b;
                canvas.drawRoundRect(rectF2, f9, f9, paint);
                int i4 = this.f28079d;
                float f10 = i4;
                float f11 = i4 + this.f28077b;
                canvas.drawRect(new RectF(f10, f11, f11, f4), paint);
                int i5 = this.f28079d;
                canvas.drawRect(new RectF(this.f28077b + i5, i5, f3, f4), paint);
                return bitmapMo1753e;
            case TOP_RIGHT:
                int i6 = this.f28078c;
                int i7 = this.f28079d;
                RectF rectF3 = new RectF(f3 - i6, i7, f3, i7 + i6);
                float f12 = this.f28077b;
                canvas.drawRoundRect(rectF3, f12, f12, paint);
                float f13 = this.f28079d;
                canvas.drawRect(new RectF(f13, f13, f3 - this.f28077b, f4), paint);
                int i8 = this.f28077b;
                canvas.drawRect(new RectF(f3 - i8, this.f28079d + i8, f3, f4), paint);
                return bitmapMo1753e;
            case BOTTOM_LEFT:
                int i9 = this.f28079d;
                int i10 = this.f28078c;
                RectF rectF4 = new RectF(i9, f4 - i10, i9 + i10, f4);
                float f14 = this.f28077b;
                canvas.drawRoundRect(rectF4, f14, f14, paint);
                int i11 = this.f28079d;
                float f15 = i11;
                canvas.drawRect(new RectF(f15, f15, i11 + this.f28078c, f4 - this.f28077b), paint);
                int i12 = this.f28079d;
                canvas.drawRect(new RectF(this.f28077b + i12, i12, f3, f4), paint);
                return bitmapMo1753e;
            case BOTTOM_RIGHT:
                float f16 = this.f28078c;
                RectF rectF5 = new RectF(f3 - f16, f4 - f16, f3, f4);
                float f17 = this.f28077b;
                canvas.drawRoundRect(rectF5, f17, f17, paint);
                float f18 = this.f28079d;
                canvas.drawRect(new RectF(f18, f18, f3 - this.f28077b, f4), paint);
                float f19 = this.f28077b;
                canvas.drawRect(new RectF(f3 - f19, this.f28079d, f3, f4 - f19), paint);
                return bitmapMo1753e;
            case TOP:
                int i13 = this.f28079d;
                float f20 = i13;
                RectF rectF6 = new RectF(f20, f20, f3, i13 + this.f28078c);
                float f21 = this.f28077b;
                canvas.drawRoundRect(rectF6, f21, f21, paint);
                int i14 = this.f28079d;
                canvas.drawRect(new RectF(i14, i14 + this.f28077b, f3, f4), paint);
                return bitmapMo1753e;
            case BOTTOM:
                RectF rectF7 = new RectF(this.f28079d, f4 - this.f28078c, f3, f4);
                float f22 = this.f28077b;
                canvas.drawRoundRect(rectF7, f22, f22, paint);
                float f23 = this.f28079d;
                canvas.drawRect(new RectF(f23, f23, f3, f4 - this.f28077b), paint);
                return bitmapMo1753e;
            case LEFT:
                int i15 = this.f28079d;
                float f24 = i15;
                RectF rectF8 = new RectF(f24, f24, i15 + this.f28078c, f4);
                float f25 = this.f28077b;
                canvas.drawRoundRect(rectF8, f25, f25, paint);
                int i16 = this.f28079d;
                canvas.drawRect(new RectF(this.f28077b + i16, i16, f3, f4), paint);
                return bitmapMo1753e;
            case RIGHT:
                RectF rectF9 = new RectF(f3 - this.f28078c, this.f28079d, f3, f4);
                float f26 = this.f28077b;
                canvas.drawRoundRect(rectF9, f26, f26, paint);
                float f27 = this.f28079d;
                canvas.drawRect(new RectF(f27, f27, f3 - this.f28077b, f4), paint);
                return bitmapMo1753e;
            case OTHER_TOP_LEFT:
                RectF rectF10 = new RectF(this.f28079d, f4 - this.f28078c, f3, f4);
                float f28 = this.f28077b;
                canvas.drawRoundRect(rectF10, f28, f28, paint);
                RectF rectF11 = new RectF(f3 - this.f28078c, this.f28079d, f3, f4);
                float f29 = this.f28077b;
                canvas.drawRoundRect(rectF11, f29, f29, paint);
                float f30 = this.f28079d;
                float f31 = this.f28077b;
                canvas.drawRect(new RectF(f30, f30, f3 - f31, f4 - f31), paint);
                return bitmapMo1753e;
            case OTHER_TOP_RIGHT:
                int i17 = this.f28079d;
                float f32 = i17;
                RectF rectF12 = new RectF(f32, f32, i17 + this.f28078c, f4);
                float f33 = this.f28077b;
                canvas.drawRoundRect(rectF12, f33, f33, paint);
                RectF rectF13 = new RectF(this.f28079d, f4 - this.f28078c, f3, f4);
                float f34 = this.f28077b;
                canvas.drawRoundRect(rectF13, f34, f34, paint);
                int i18 = this.f28079d;
                int i19 = this.f28077b;
                canvas.drawRect(new RectF(i18 + i19, i18, f3, f4 - i19), paint);
                return bitmapMo1753e;
            case OTHER_BOTTOM_LEFT:
                int i20 = this.f28079d;
                float f35 = i20;
                RectF rectF14 = new RectF(f35, f35, f3, i20 + this.f28078c);
                float f36 = this.f28077b;
                canvas.drawRoundRect(rectF14, f36, f36, paint);
                RectF rectF15 = new RectF(f3 - this.f28078c, this.f28079d, f3, f4);
                float f37 = this.f28077b;
                canvas.drawRoundRect(rectF15, f37, f37, paint);
                int i21 = this.f28079d;
                int i22 = this.f28077b;
                canvas.drawRect(new RectF(i21, i21 + i22, f3 - i22, f4), paint);
                return bitmapMo1753e;
            case OTHER_BOTTOM_RIGHT:
                int i23 = this.f28079d;
                float f38 = i23;
                RectF rectF16 = new RectF(f38, f38, f3, i23 + this.f28078c);
                float f39 = this.f28077b;
                canvas.drawRoundRect(rectF16, f39, f39, paint);
                int i24 = this.f28079d;
                float f40 = i24;
                RectF rectF17 = new RectF(f40, f40, i24 + this.f28078c, f4);
                float f41 = this.f28077b;
                canvas.drawRoundRect(rectF17, f41, f41, paint);
                float f42 = this.f28079d + this.f28077b;
                canvas.drawRect(new RectF(f42, f42, f3, f4), paint);
                return bitmapMo1753e;
            case DIAGONAL_FROM_TOP_LEFT:
                int i25 = this.f28079d;
                float f43 = i25;
                float f44 = i25 + this.f28078c;
                RectF rectF18 = new RectF(f43, f43, f44, f44);
                float f45 = this.f28077b;
                canvas.drawRoundRect(rectF18, f45, f45, paint);
                float f46 = this.f28078c;
                RectF rectF19 = new RectF(f3 - f46, f4 - f46, f3, f4);
                float f47 = this.f28077b;
                canvas.drawRoundRect(rectF19, f47, f47, paint);
                int i26 = this.f28079d;
                canvas.drawRect(new RectF(i26, i26 + this.f28077b, f3 - this.f28078c, f4), paint);
                int i27 = this.f28079d;
                canvas.drawRect(new RectF(this.f28078c + i27, i27, f3, f4 - this.f28077b), paint);
                return bitmapMo1753e;
            case DIAGONAL_FROM_TOP_RIGHT:
                int i28 = this.f28078c;
                int i29 = this.f28079d;
                RectF rectF20 = new RectF(f3 - i28, i29, f3, i29 + i28);
                float f48 = this.f28077b;
                canvas.drawRoundRect(rectF20, f48, f48, paint);
                int i30 = this.f28079d;
                int i31 = this.f28078c;
                RectF rectF21 = new RectF(i30, f4 - i31, i30 + i31, f4);
                float f49 = this.f28077b;
                canvas.drawRoundRect(rectF21, f49, f49, paint);
                float f50 = this.f28079d;
                float f51 = this.f28077b;
                canvas.drawRect(new RectF(f50, f50, f3 - f51, f4 - f51), paint);
                float f52 = this.f28079d + this.f28077b;
                canvas.drawRect(new RectF(f52, f52, f3, f4), paint);
                return bitmapMo1753e;
            default:
                float f53 = this.f28079d;
                RectF rectF22 = new RectF(f53, f53, f3, f4);
                float f54 = this.f28077b;
                canvas.drawRoundRect(rectF22, f54, f54, paint);
                return bitmapMo1753e;
        }
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (obj instanceof RoundedCornersTransformation) {
            RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) obj;
            if (roundedCornersTransformation.f28077b == this.f28077b && roundedCornersTransformation.f28078c == this.f28078c && roundedCornersTransformation.f28079d == this.f28079d && roundedCornersTransformation.f28080e == this.f28080e) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return (this.f28080e.ordinal() * 10) + (this.f28079d * 100) + (this.f28078c * CloseCodes.NORMAL_CLOSURE) + (this.f28077b * 10000) + 425235636;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("RoundedTransformation(radius=");
        sbM1556G.append(this.f28077b);
        sbM1556G.append(", margin=");
        sbM1556G.append(this.f28079d);
        sbM1556G.append(", diameter=");
        sbM1556G.append(this.f28078c);
        sbM1556G.append(", cornerType=");
        sbM1556G.append(this.f28080e.name());
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    public RoundedCornersTransformation(int i, int i2, a aVar) {
        this.f28077b = i;
        this.f28078c = i * 2;
        this.f28079d = i2;
        this.f28080e = aVar;
    }
}
