package p007c.p056c.p057a.p068z.p070c;

import android.graphics.PointF;
import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.z.c.j, reason: use source file name */
/* JADX INFO: compiled from: PointKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class PointKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f2653i;

    public PointKeyframeAnimation(List<Keyframe<PointF>> list) {
        super(list);
        this.f2653i = new PointF();
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
    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public Object mo1505f(Keyframe keyframe, float f) {
        T t;
        PointF pointF;
        T t2 = keyframe.f2359b;
        if (t2 == 0 || (t = keyframe.f2360c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) t2;
        PointF pointF3 = (PointF) t;
        LottieValueCallback<A> lottieValueCallback = this.f2633e;
        if (lottieValueCallback != 0 && (pointF = (PointF) lottieValueCallback.m1452a(keyframe.f2362e, keyframe.f2363f.floatValue(), pointF2, pointF3, f, m1503d(), this.f2632d)) != null) {
            return pointF;
        }
        PointF pointF4 = this.f2653i;
        float f2 = pointF2.x;
        float fM1576a = outline.m1576a(pointF3.x, f2, f, f2);
        float f3 = pointF2.y;
        pointF4.set(fM1576a, ((pointF3.y - f3) * f) + f3);
        return this.f2653i;
    }
}
