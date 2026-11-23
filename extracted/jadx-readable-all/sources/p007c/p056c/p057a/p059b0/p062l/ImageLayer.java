package p007c.p056c.p057a.p059b0.p062l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import p007c.p056c.p057a.ImageAssetDelegate;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieImageAsset;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p058a0.ImageAssetManager;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.LPaint;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ValueCallbackKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.l.d, reason: use source file name */
/* JADX INFO: compiled from: ImageLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class ImageLayer extends BaseLayer2 {

    /* JADX INFO: renamed from: A */
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f2164A;

    /* JADX INFO: renamed from: x */
    public final Paint f2165x;

    /* JADX INFO: renamed from: y */
    public final Rect f2166y;

    /* JADX INFO: renamed from: z */
    public final Rect f2167z;

    public ImageLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f2165x = new LPaint(3);
        this.f2166y = new Rect();
        this.f2167z = new Rect();
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        super.mo1347d(rectF, matrix, z);
        Bitmap bitmapM1359r = m1359r();
        if (bitmapM1359r != null) {
            rectF.set(0.0f, 0.0f, Utils.m1439c() * bitmapM1359r.getWidth(), Utils.m1439c() * bitmapM1359r.getHeight());
            this.f2148m.mapRect(rectF);
        }
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        this.f2157v.m1522c(t, lottieValueCallback);
        if (t == LottieProperty.f2451C) {
            if (lottieValueCallback == null) {
                this.f2164A = null;
            } else {
                this.f2164A = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2
    /* JADX INFO: renamed from: k */
    public void mo1352k(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapM1359r = m1359r();
        if (bitmapM1359r == null || bitmapM1359r.isRecycled()) {
            return;
        }
        float fM1439c = Utils.m1439c();
        this.f2165x.setAlpha(i);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f2164A;
        if (baseKeyframeAnimation != null) {
            this.f2165x.setColorFilter(baseKeyframeAnimation.mo1504e());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f2166y.set(0, 0, bitmapM1359r.getWidth(), bitmapM1359r.getHeight());
        this.f2167z.set(0, 0, (int) (bitmapM1359r.getWidth() * fM1439c), (int) (bitmapM1359r.getHeight() * fM1439c));
        canvas.drawBitmap(bitmapM1359r, this.f2166y, this.f2167z, this.f2165x);
        canvas.restore();
    }

    /* JADX INFO: renamed from: r */
    public final Bitmap m1359r() {
        ImageAssetManager imageAssetManager;
        LottieImageAsset lottieImageAsset;
        String str = this.f2150o.f2174g;
        LottieDrawable lottieDrawable = this.f2149n;
        if (lottieDrawable.getCallback() == null) {
            imageAssetManager = null;
        } else {
            ImageAssetManager imageAssetManager2 = lottieDrawable.f2404o;
            if (imageAssetManager2 != null) {
                Drawable.Callback callback = lottieDrawable.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                if (!((context == null && imageAssetManager2.f1962b == null) || imageAssetManager2.f1962b.equals(context))) {
                    lottieDrawable.f2404o = null;
                }
            }
            if (lottieDrawable.f2404o == null) {
                lottieDrawable.f2404o = new ImageAssetManager(lottieDrawable.getCallback(), lottieDrawable.f2405p, lottieDrawable.f2406q, lottieDrawable.f2396g.f2346d);
            }
            imageAssetManager = lottieDrawable.f2404o;
        }
        if (imageAssetManager == null || (lottieImageAsset = imageAssetManager.f1965e.get(str)) == null) {
            return null;
        }
        Bitmap bitmap = lottieImageAsset.f2448e;
        if (bitmap != null) {
            return bitmap;
        }
        ImageAssetDelegate imageAssetDelegate = imageAssetManager.f1964d;
        if (imageAssetDelegate != null) {
            Bitmap bitmapM1328a = imageAssetDelegate.m1328a(lottieImageAsset);
            if (bitmapM1328a == null) {
                return bitmapM1328a;
            }
            imageAssetManager.m1327a(str, bitmapM1328a);
            return bitmapM1328a;
        }
        String str2 = lottieImageAsset.f2447d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                imageAssetManager.m1327a(str, bitmapDecodeByteArray);
                return bitmapDecodeByteArray;
            } catch (IllegalArgumentException e) {
                Logger2.m1421c("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(imageAssetManager.f1963c)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            Bitmap bitmapM1441e = Utils.m1441e(BitmapFactory.decodeStream(imageAssetManager.f1962b.getAssets().open(imageAssetManager.f1963c + str2), null, options), lottieImageAsset.f2444a, lottieImageAsset.f2445b);
            imageAssetManager.m1327a(str, bitmapM1441e);
            return bitmapM1441e;
        } catch (IOException e2) {
            Logger2.m1421c("Unable to open asset.", e2);
            return null;
        }
    }
}
