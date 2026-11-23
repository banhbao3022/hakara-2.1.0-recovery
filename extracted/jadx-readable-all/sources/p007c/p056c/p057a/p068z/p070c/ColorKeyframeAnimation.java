package p007c.p056c.p057a.p068z.p070c;

import java.util.List;
import p007c.p056c.p057a.p066e0.GammaEvaluator;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.LottieValueCallback;

/* JADX INFO: renamed from: c.c.a.z.c.b, reason: use source file name */
/* JADX INFO: compiled from: ColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class ColorKeyframeAnimation extends KeyframeAnimation<Integer> {
    public ColorKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public Object mo1505f(Keyframe keyframe, float f) {
        return Integer.valueOf(m1515j(keyframe, f));
    }

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
    /* JADX INFO: renamed from: j */
    public int m1515j(Keyframe<Integer> keyframe, float f) {
        Integer num;
        Integer num2 = keyframe.f2359b;
        if (num2 == null || keyframe.f2360c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iIntValue = num2.intValue();
        int iIntValue2 = keyframe.f2360c.intValue();
        LottieValueCallback<A> lottieValueCallback = this.f2633e;
        return (lottieValueCallback == 0 || (num = (Integer) lottieValueCallback.m1452a(keyframe.f2362e, keyframe.f2363f.floatValue(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), f, m1503d(), this.f2632d)) == null) ? GammaEvaluator.m1418c(MiscUtils.m1432b(f, 0.0f, 1.0f), iIntValue, iIntValue2) : num.intValue();
    }
}
