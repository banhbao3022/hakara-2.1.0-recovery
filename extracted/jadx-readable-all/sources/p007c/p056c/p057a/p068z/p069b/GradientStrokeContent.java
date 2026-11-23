package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.p059b0.p061k.GradientColor;
import p007c.p056c.p057a.p059b0.p061k.GradientStroke;
import p007c.p056c.p057a.p059b0.p061k.GradientType;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ValueCallbackKeyframeAnimation;
import p636z0.p691g.LongSparseArray;

/* JADX INFO: renamed from: c.c.a.z.b.i, reason: use source file name */
/* JADX INFO: compiled from: GradientStrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class GradientStrokeContent extends BaseStrokeContent {

    /* JADX INFO: renamed from: o */
    public final String f2562o;

    /* JADX INFO: renamed from: p */
    public final boolean f2563p;

    /* JADX INFO: renamed from: q */
    public final LongSparseArray<LinearGradient> f2564q;

    /* JADX INFO: renamed from: r */
    public final LongSparseArray<RadialGradient> f2565r;

    /* JADX INFO: renamed from: s */
    public final RectF f2566s;

    /* JADX INFO: renamed from: t */
    public final GradientType f2567t;

    /* JADX INFO: renamed from: u */
    public final int f2568u;

    /* JADX INFO: renamed from: v */
    public final BaseKeyframeAnimation<GradientColor, GradientColor> f2569v;

    /* JADX INFO: renamed from: w */
    public final BaseKeyframeAnimation<PointF, PointF> f2570w;

    /* JADX INFO: renamed from: x */
    public final BaseKeyframeAnimation<PointF, PointF> f2571x;

    /* JADX INFO: renamed from: y */
    public ValueCallbackKeyframeAnimation f2572y;

    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, GradientStroke gradientStroke) {
        super(lottieDrawable, baseLayer2, gradientStroke.f2041h.m1343f(), gradientStroke.f2042i.m1344f(), gradientStroke.f2043j, gradientStroke.f2037d, gradientStroke.f2040g, gradientStroke.f2044k, gradientStroke.f2045l);
        this.f2564q = new LongSparseArray<>();
        this.f2565r = new LongSparseArray<>();
        this.f2566s = new RectF();
        this.f2562o = gradientStroke.f2034a;
        this.f2567t = gradientStroke.f2035b;
        this.f2563p = gradientStroke.f2046m;
        this.f2568u = (int) (lottieDrawable.f2396g.m1444b() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> baseKeyframeAnimationMo1339a = gradientStroke.f2036c.mo1339a();
        this.f2569v = baseKeyframeAnimationMo1339a;
        baseKeyframeAnimationMo1339a.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationMo1339a2 = gradientStroke.f2038e.mo1339a();
        this.f2570w = baseKeyframeAnimationMo1339a2;
        baseKeyframeAnimationMo1339a2.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a2);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationMo1339a3 = gradientStroke.f2039f.mo1339a();
        this.f2571x = baseKeyframeAnimationMo1339a3;
        baseKeyframeAnimationMo1339a3.f2629a.add(this);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a3);
    }

    /* JADX INFO: renamed from: e */
    public final int[] m1496e(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f2572y;
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
    @Override // p007c.p056c.p057a.p068z.p069b.BaseStrokeContent, p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: f */
    public void mo1349f(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradientM15589i;
        if (this.f2563p) {
            return;
        }
        mo1347d(this.f2566s, matrix, false);
        if (this.f2567t == GradientType.LINEAR) {
            long jM1497i = m1497i();
            radialGradientM15589i = this.f2564q.m15589i(jM1497i);
            if (radialGradientM15589i == null) {
                PointF pointFMo1504e = this.f2570w.mo1504e();
                PointF pointFMo1504e2 = this.f2571x.mo1504e();
                GradientColor gradientColorMo1504e = this.f2569v.mo1504e();
                radialGradientM15589i = new LinearGradient(pointFMo1504e.x, pointFMo1504e.y, pointFMo1504e2.x, pointFMo1504e2.y, m1496e(gradientColorMo1504e.f2025b), gradientColorMo1504e.f2024a, Shader.TileMode.CLAMP);
                this.f2564q.m15593m(jM1497i, radialGradientM15589i);
            }
        } else {
            long jM1497i2 = m1497i();
            radialGradientM15589i = this.f2565r.m15589i(jM1497i2);
            if (radialGradientM15589i == null) {
                PointF pointFMo1504e3 = this.f2570w.mo1504e();
                PointF pointFMo1504e4 = this.f2571x.mo1504e();
                GradientColor gradientColorMo1504e2 = this.f2569v.mo1504e();
                int[] iArrM1496e = m1496e(gradientColorMo1504e2.f2025b);
                float[] fArr = gradientColorMo1504e2.f2024a;
                float f = pointFMo1504e3.x;
                float f2 = pointFMo1504e3.y;
                radialGradientM15589i = new RadialGradient(f, f2, (float) Math.hypot(pointFMo1504e4.x - f, pointFMo1504e4.y - f2), iArrM1496e, fArr, Shader.TileMode.CLAMP);
                this.f2565r.m15593m(jM1497i2, radialGradientM15589i);
            }
        }
        radialGradientM15589i.setLocalMatrix(matrix);
        this.f2506i.setShader(radialGradientM15589i);
        super.mo1349f(canvas, matrix, i);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2562o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p068z.p069b.BaseStrokeContent, p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        super.mo1338h(t, lottieValueCallback);
        if (t == LottieProperty.f2452D) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f2572y;
            if (valueCallbackKeyframeAnimation != null) {
                this.f2503f.f2156u.remove(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f2572y = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2572y = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.f2629a.add(this);
            this.f2503f.m1348e(this.f2572y);
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m1497i() {
        int iRound = Math.round(this.f2570w.f2632d * this.f2568u);
        int iRound2 = Math.round(this.f2571x.f2632d * this.f2568u);
        int iRound3 = Math.round(this.f2569v.f2632d * this.f2568u);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
