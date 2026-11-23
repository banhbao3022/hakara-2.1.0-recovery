package p007c.p056c.p057a.p068z.p070c;

import java.util.List;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p067f0.ScaleXY;

/* JADX INFO: renamed from: c.c.a.z.c.k, reason: use source file name */
/* JADX INFO: compiled from: ScaleKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class ScaleKeyframeAnimation extends KeyframeAnimation<ScaleXY> {

    /* JADX INFO: renamed from: i */
    public final ScaleXY f2654i;

    public ScaleKeyframeAnimation(List<Keyframe<ScaleXY>> list) {
        super(list);
        this.f2654i = new ScaleXY();
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
        ScaleXY scaleXY;
        T t2 = keyframe.f2359b;
        if (t2 == 0 || (t = keyframe.f2360c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ScaleXY scaleXY2 = (ScaleXY) t2;
        ScaleXY scaleXY3 = (ScaleXY) t;
        LottieValueCallback<A> lottieValueCallback = this.f2633e;
        if (lottieValueCallback != 0 && (scaleXY = (ScaleXY) lottieValueCallback.m1452a(keyframe.f2362e, keyframe.f2363f.floatValue(), scaleXY2, scaleXY3, f, m1503d(), this.f2632d)) != null) {
            return scaleXY;
        }
        ScaleXY scaleXY4 = this.f2654i;
        float fM1435e = MiscUtils.m1435e(scaleXY2.f2376a, scaleXY3.f2376a, f);
        float fM1435e2 = MiscUtils.m1435e(scaleXY2.f2377b, scaleXY3.f2377b, f);
        scaleXY4.f2376a = fM1435e;
        scaleXY4.f2377b = fM1435e2;
        return this.f2654i;
    }
}
