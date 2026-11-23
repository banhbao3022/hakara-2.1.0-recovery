package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.L;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.p061k.ShapeFill;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.LPaint;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ColorKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ValueCallbackKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.g, reason: use source file name */
/* JADX INFO: compiled from: FillContent.java */
/* JADX INFO: loaded from: classes.dex */
public class FillContent implements DrawingContent, BaseKeyframeAnimation.b, KeyPathElementContent {

    /* JADX INFO: renamed from: a */
    public final Path f2534a;

    /* JADX INFO: renamed from: b */
    public final Paint f2535b;

    /* JADX INFO: renamed from: c */
    public final BaseLayer2 f2536c;

    /* JADX INFO: renamed from: d */
    public final String f2537d;

    /* JADX INFO: renamed from: e */
    public final boolean f2538e;

    /* JADX INFO: renamed from: f */
    public final List<PathContent> f2539f;

    /* JADX INFO: renamed from: g */
    public final BaseKeyframeAnimation<Integer, Integer> f2540g;

    /* JADX INFO: renamed from: h */
    public final BaseKeyframeAnimation<Integer, Integer> f2541h;

    /* JADX INFO: renamed from: i */
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f2542i;

    /* JADX INFO: renamed from: j */
    public final LottieDrawable f2543j;

    public FillContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, ShapeFill shapeFill) {
        Path path = new Path();
        this.f2534a = path;
        this.f2535b = new LPaint(1);
        this.f2539f = new ArrayList();
        this.f2536c = baseLayer2;
        this.f2537d = shapeFill.f2097c;
        this.f2538e = shapeFill.f2100f;
        this.f2543j = lottieDrawable;
        if (shapeFill.f2098d == null || shapeFill.f2099e == null) {
            this.f2540g = null;
            this.f2541h = null;
            return;
        }
        path.setFillType(shapeFill.f2096b);
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationMo1339a = shapeFill.f2098d.mo1339a();
        this.f2540g = baseKeyframeAnimationMo1339a;
        baseKeyframeAnimationMo1339a.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationMo1339a2 = shapeFill.f2099e.mo1339a();
        this.f2541h = baseKeyframeAnimationMo1339a2;
        baseKeyframeAnimationMo1339a2.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a2);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2543j.invalidateSelf();
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = list2.get(i);
            if (content instanceof PathContent) {
                this.f2539f.add((PathContent) content);
            }
        }
    }

    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: c */
    public void mo1337c(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.m1436f(keyPath, i, list, keyPath2, this);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        this.f2534a.reset();
        for (int i = 0; i < this.f2539f.size(); i++) {
            this.f2534a.addPath(this.f2539f.get(i).mo1493g(), matrix);
        }
        this.f2534a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: f */
    public void mo1349f(Canvas canvas, Matrix matrix, int i) {
        if (this.f2538e) {
            return;
        }
        Paint paint = this.f2535b;
        ColorKeyframeAnimation colorKeyframeAnimation = (ColorKeyframeAnimation) this.f2540g;
        paint.setColor(colorKeyframeAnimation.m1515j(colorKeyframeAnimation.m1500a(), colorKeyframeAnimation.m1502c()));
        this.f2535b.setAlpha(MiscUtils.m1433c((int) ((((i / 255.0f) * this.f2541h.mo1504e().intValue()) / 100.0f) * 255.0f), 0, 255));
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f2542i;
        if (baseKeyframeAnimation != null) {
            this.f2535b.setColorFilter(baseKeyframeAnimation.mo1504e());
        }
        this.f2534a.reset();
        for (int i2 = 0; i2 < this.f2539f.size(); i2++) {
            this.f2534a.addPath(this.f2539f.get(i2).mo1493g(), matrix);
        }
        canvas.drawPath(this.f2534a, this.f2535b);
        L.m1365a("FillContent#draw");
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2537d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.f2453a) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f2540g;
            LottieValueCallback<Integer> lottieValueCallback2 = baseKeyframeAnimation.f2633e;
            baseKeyframeAnimation.f2633e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f2456d) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f2541h;
            LottieValueCallback<Integer> lottieValueCallback3 = baseKeyframeAnimation2.f2633e;
            baseKeyframeAnimation2.f2633e = lottieValueCallback;
        } else if (t == LottieProperty.f2451C) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation3 = this.f2542i;
            if (baseKeyframeAnimation3 != null) {
                this.f2536c.f2156u.remove(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == 0) {
                this.f2542i = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2542i = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f2629a.add(this);
            this.f2536c.m1348e(this.f2542i);
        }
    }
}
