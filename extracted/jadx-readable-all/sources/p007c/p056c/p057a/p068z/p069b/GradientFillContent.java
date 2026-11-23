package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.L;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.p061k.GradientColor;
import p007c.p056c.p057a.p059b0.p061k.GradientFill;
import p007c.p056c.p057a.p059b0.p061k.GradientType;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.LPaint;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ValueCallbackKeyframeAnimation;
import p636z0.p691g.LongSparseArray;

/* JADX INFO: renamed from: c.c.a.z.b.h, reason: use source file name */
/* JADX INFO: compiled from: GradientFillContent.java */
/* JADX INFO: loaded from: classes.dex */
public class GradientFillContent implements DrawingContent, BaseKeyframeAnimation.b, KeyPathElementContent {

    /* JADX INFO: renamed from: a */
    public final String f2544a;

    /* JADX INFO: renamed from: b */
    public final boolean f2545b;

    /* JADX INFO: renamed from: c */
    public final BaseLayer2 f2546c;

    /* JADX INFO: renamed from: d */
    public final LongSparseArray<LinearGradient> f2547d = new LongSparseArray<>();

    /* JADX INFO: renamed from: e */
    public final LongSparseArray<RadialGradient> f2548e = new LongSparseArray<>();

    /* JADX INFO: renamed from: f */
    public final Path f2549f;

    /* JADX INFO: renamed from: g */
    public final Paint f2550g;

    /* JADX INFO: renamed from: h */
    public final RectF f2551h;

    /* JADX INFO: renamed from: i */
    public final List<PathContent> f2552i;

    /* JADX INFO: renamed from: j */
    public final GradientType f2553j;

    /* JADX INFO: renamed from: k */
    public final BaseKeyframeAnimation<GradientColor, GradientColor> f2554k;

    /* JADX INFO: renamed from: l */
    public final BaseKeyframeAnimation<Integer, Integer> f2555l;

    /* JADX INFO: renamed from: m */
    public final BaseKeyframeAnimation<PointF, PointF> f2556m;

    /* JADX INFO: renamed from: n */
    public final BaseKeyframeAnimation<PointF, PointF> f2557n;

    /* JADX INFO: renamed from: o */
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f2558o;

    /* JADX INFO: renamed from: p */
    public ValueCallbackKeyframeAnimation f2559p;

    /* JADX INFO: renamed from: q */
    public final LottieDrawable f2560q;

    /* JADX INFO: renamed from: r */
    public final int f2561r;

    public GradientFillContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, GradientFill gradientFill) {
        Path path = new Path();
        this.f2549f = path;
        this.f2550g = new LPaint(1);
        this.f2551h = new RectF();
        this.f2552i = new ArrayList();
        this.f2546c = baseLayer2;
        this.f2544a = gradientFill.f2032g;
        this.f2545b = gradientFill.f2033h;
        this.f2560q = lottieDrawable;
        this.f2553j = gradientFill.f2026a;
        path.setFillType(gradientFill.f2027b);
        this.f2561r = (int) (lottieDrawable.f2396g.m1444b() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> baseKeyframeAnimationMo1339a = gradientFill.f2028c.mo1339a();
        this.f2554k = baseKeyframeAnimationMo1339a;
        baseKeyframeAnimationMo1339a.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationMo1339a2 = gradientFill.f2029d.mo1339a();
        this.f2555l = baseKeyframeAnimationMo1339a2;
        baseKeyframeAnimationMo1339a2.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a2);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationMo1339a3 = gradientFill.f2030e.mo1339a();
        this.f2556m = baseKeyframeAnimationMo1339a3;
        baseKeyframeAnimationMo1339a3.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a3);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationMo1339a4 = gradientFill.f2031f.mo1339a();
        this.f2557n = baseKeyframeAnimationMo1339a4;
        baseKeyframeAnimationMo1339a4.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a4);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2560q.invalidateSelf();
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = list2.get(i);
            if (content instanceof PathContent) {
                this.f2552i.add((PathContent) content);
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
        this.f2549f.reset();
        for (int i = 0; i < this.f2552i.size(); i++) {
            this.f2549f.addPath(this.f2552i.get(i).mo1493g(), matrix);
        }
        this.f2549f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* JADX INFO: renamed from: e */
    public final int[] m1494e(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f2559p;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.mo1504e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: f */
    public void mo1349f(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradientM15589i;
        if (this.f2545b) {
            return;
        }
        this.f2549f.reset();
        for (int i2 = 0; i2 < this.f2552i.size(); i2++) {
            this.f2549f.addPath(this.f2552i.get(i2).mo1493g(), matrix);
        }
        this.f2549f.computeBounds(this.f2551h, false);
        if (this.f2553j == GradientType.LINEAR) {
            long jM1495i = m1495i();
            radialGradientM15589i = this.f2547d.m15589i(jM1495i);
            if (radialGradientM15589i == null) {
                PointF pointFMo1504e = this.f2556m.mo1504e();
                PointF pointFMo1504e2 = this.f2557n.mo1504e();
                GradientColor gradientColorMo1504e = this.f2554k.mo1504e();
                LinearGradient linearGradient = new LinearGradient(pointFMo1504e.x, pointFMo1504e.y, pointFMo1504e2.x, pointFMo1504e2.y, m1494e(gradientColorMo1504e.f2025b), gradientColorMo1504e.f2024a, Shader.TileMode.CLAMP);
                this.f2547d.m15593m(jM1495i, linearGradient);
                radialGradientM15589i = linearGradient;
            }
        } else {
            long jM1495i2 = m1495i();
            radialGradientM15589i = this.f2548e.m15589i(jM1495i2);
            if (radialGradientM15589i == null) {
                PointF pointFMo1504e3 = this.f2556m.mo1504e();
                PointF pointFMo1504e4 = this.f2557n.mo1504e();
                GradientColor gradientColorMo1504e2 = this.f2554k.mo1504e();
                int[] iArrM1494e = m1494e(gradientColorMo1504e2.f2025b);
                float[] fArr = gradientColorMo1504e2.f2024a;
                float f = pointFMo1504e3.x;
                float f2 = pointFMo1504e3.y;
                float fHypot = (float) Math.hypot(pointFMo1504e4.x - f, pointFMo1504e4.y - f2);
                radialGradientM15589i = new RadialGradient(f, f2, fHypot <= 0.0f ? 0.001f : fHypot, iArrM1494e, fArr, Shader.TileMode.CLAMP);
                this.f2548e.m15593m(jM1495i2, radialGradientM15589i);
            }
        }
        radialGradientM15589i.setLocalMatrix(matrix);
        this.f2550g.setShader(radialGradientM15589i);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f2558o;
        if (baseKeyframeAnimation != null) {
            this.f2550g.setColorFilter(baseKeyframeAnimation.mo1504e());
        }
        this.f2550g.setAlpha(MiscUtils.m1433c((int) ((((i / 255.0f) * this.f2555l.mo1504e().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f2549f, this.f2550g);
        L.m1365a("GradientFillContent#draw");
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2544a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.f2456d) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f2555l;
            LottieValueCallback<Integer> lottieValueCallback2 = baseKeyframeAnimation.f2633e;
            baseKeyframeAnimation.f2633e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f2451C) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation2 = this.f2558o;
            if (baseKeyframeAnimation2 != null) {
                this.f2546c.f2156u.remove(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == 0) {
                this.f2558o = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2558o = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f2629a.add(this);
            this.f2546c.m1348e(this.f2558o);
            return;
        }
        if (t == LottieProperty.f2452D) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.f2559p;
            if (valueCallbackKeyframeAnimation2 != null) {
                this.f2546c.f2156u.remove(valueCallbackKeyframeAnimation2);
            }
            if (lottieValueCallback == 0) {
                this.f2559p = null;
                return;
            }
            this.f2547d.m15585b();
            this.f2548e.m15585b();
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2559p = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.f2629a.add(this);
            this.f2546c.m1348e(this.f2559p);
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m1495i() {
        int iRound = Math.round(this.f2556m.f2632d * this.f2561r);
        int iRound2 = Math.round(this.f2557n.f2632d * this.f2561r);
        int iRound3 = Math.round(this.f2554k.f2632d * this.f2561r);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
