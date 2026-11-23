package p007c.p056c.p057a.p068z.p070c;

import java.util.List;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.LottieValueCallback;

/* JADX INFO: renamed from: c.c.a.z.c.c, reason: use source file name */
/* JADX INFO: compiled from: FloatKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class FloatKeyframeAnimation extends KeyframeAnimation<Float> {
    public FloatKeyframeAnimation(List<Keyframe<Float>> list) {
        super(list);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public Object mo1505f(Keyframe keyframe, float f) {
        return Float.valueOf(m1517k(keyframe, f));
    }

    /* JADX INFO: renamed from: j */
    public float m1516j() {
        return m1517k(m1500a(), m1502c());
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
    /* JADX INFO: renamed from: k */
    public float m1517k(Keyframe<Float> keyframe, float f) {
        Float f2;
        if (keyframe.f2359b == null || keyframe.f2360c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback<A> lottieValueCallback = this.f2633e;
        if (lottieValueCallback != 0 && (f2 = (Float) lottieValueCallback.m1452a(keyframe.f2362e, keyframe.f2363f.floatValue(), keyframe.f2359b, keyframe.f2360c, f, m1503d(), this.f2632d)) != null) {
            return f2.floatValue();
        }
        if (keyframe.f2364g == -3987645.8f) {
            keyframe.f2364g = keyframe.f2359b.floatValue();
        }
        float f3 = keyframe.f2364g;
        if (keyframe.f2365h == -3987645.8f) {
            keyframe.f2365h = keyframe.f2360c.floatValue();
        }
        return MiscUtils.m1435e(f3, keyframe.f2365h, f);
    }
}
