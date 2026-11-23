package p007c.p056c.p057a.p068z.p070c;

import android.graphics.PointF;
import java.util.List;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.LottieValueCallback;

/* JADX INFO: renamed from: c.c.a.z.c.e, reason: use source file name */
/* JADX INFO: compiled from: IntegerKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class IntegerKeyframeAnimation extends KeyframeAnimation<Integer> {
    public IntegerKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public Object mo1505f(Keyframe keyframe, float f) {
        return Integer.valueOf(m1518j(keyframe, f));
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
    public int m1518j(Keyframe<Integer> keyframe, float f) {
        Integer num;
        if (keyframe.f2359b == null || keyframe.f2360c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback<A> lottieValueCallback = this.f2633e;
        if (lottieValueCallback != 0 && (num = (Integer) lottieValueCallback.m1452a(keyframe.f2362e, keyframe.f2363f.floatValue(), keyframe.f2359b, keyframe.f2360c, f, m1503d(), this.f2632d)) != null) {
            return num.intValue();
        }
        if (keyframe.f2366i == 784923401) {
            keyframe.f2366i = keyframe.f2359b.intValue();
        }
        int i = keyframe.f2366i;
        if (keyframe.f2367j == 784923401) {
            keyframe.f2367j = keyframe.f2360c.intValue();
        }
        int i2 = keyframe.f2367j;
        PointF pointF = MiscUtils.f2336a;
        return (int) ((f * (i2 - i)) + i);
    }
}
