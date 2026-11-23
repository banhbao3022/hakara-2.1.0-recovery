package p007c.p056c.p057a.p059b0.p062l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.LPaint;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ValueCallbackKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.l.h, reason: use source file name */
/* JADX INFO: compiled from: SolidLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class SolidLayer extends BaseLayer2 {

    /* JADX INFO: renamed from: A */
    public final Path f2206A;

    /* JADX INFO: renamed from: B */
    public final Layer f2207B;

    /* JADX INFO: renamed from: C */
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f2208C;

    /* JADX INFO: renamed from: x */
    public final RectF f2209x;

    /* JADX INFO: renamed from: y */
    public final Paint f2210y;

    /* JADX INFO: renamed from: z */
    public final float[] f2211z;

    public SolidLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f2209x = new RectF();
        LPaint lPaint = new LPaint();
        this.f2210y = lPaint;
        this.f2211z = new float[8];
        this.f2206A = new Path();
        this.f2207B = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(layer.f2179l);
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        super.mo1347d(rectF, matrix, z);
        RectF rectF2 = this.f2209x;
        Layer layer = this.f2207B;
        rectF2.set(0.0f, 0.0f, layer.f2177j, layer.f2178k);
        this.f2148m.mapRect(this.f2209x);
        rectF.set(this.f2209x);
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        this.f2157v.m1522c(t, lottieValueCallback);
        if (t == LottieProperty.f2451C) {
            if (lottieValueCallback == null) {
                this.f2208C = null;
            } else {
                this.f2208C = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2
    /* JADX INFO: renamed from: k */
    public void mo1352k(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.f2207B.f2179l);
        if (iAlpha == 0) {
            return;
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f2157v.f2669j;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (baseKeyframeAnimation == null ? 100 : baseKeyframeAnimation.mo1504e().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        this.f2210y.setAlpha(iIntValue);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation2 = this.f2208C;
        if (baseKeyframeAnimation2 != null) {
            this.f2210y.setColorFilter(baseKeyframeAnimation2.mo1504e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f2211z;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Layer layer = this.f2207B;
            int i2 = layer.f2177j;
            fArr[2] = i2;
            fArr[3] = 0.0f;
            fArr[4] = i2;
            int i3 = layer.f2178k;
            fArr[5] = i3;
            fArr[6] = 0.0f;
            fArr[7] = i3;
            matrix.mapPoints(fArr);
            this.f2206A.reset();
            Path path = this.f2206A;
            float[] fArr2 = this.f2211z;
            path.moveTo(fArr2[0], fArr2[1]);
            Path path2 = this.f2206A;
            float[] fArr3 = this.f2211z;
            path2.lineTo(fArr3[2], fArr3[3]);
            Path path3 = this.f2206A;
            float[] fArr4 = this.f2211z;
            path3.lineTo(fArr4[4], fArr4[5]);
            Path path4 = this.f2206A;
            float[] fArr5 = this.f2211z;
            path4.lineTo(fArr5[6], fArr5[7]);
            Path path5 = this.f2206A;
            float[] fArr6 = this.f2211z;
            path5.lineTo(fArr6[0], fArr6[1]);
            this.f2206A.close();
            canvas.drawPath(this.f2206A, this.f2210y);
        }
    }
}
