package p007c.p056c.p057a.p068z.p070c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.LottieValueCallback;

/* JADX INFO: renamed from: c.c.a.z.c.i, reason: use source file name */
/* JADX INFO: compiled from: PathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class PathKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f2649i;

    /* JADX INFO: renamed from: j */
    public final float[] f2650j;

    /* JADX INFO: renamed from: k */
    public PathKeyframe f2651k;

    /* JADX INFO: renamed from: l */
    public PathMeasure f2652l;

    public PathKeyframeAnimation(List<? extends Keyframe<PointF>> list) {
        super(list);
        this.f2649i = new PointF();
        this.f2650j = new float[2];
        this.f2652l = new PathMeasure();
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
        PointF pointF;
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path path = pathKeyframe.f2647o;
        if (path == null) {
            return (PointF) keyframe.f2359b;
        }
        LottieValueCallback<A> lottieValueCallback = this.f2633e;
        if (lottieValueCallback != 0 && (pointF = (PointF) lottieValueCallback.m1452a(pathKeyframe.f2362e, pathKeyframe.f2363f.floatValue(), pathKeyframe.f2359b, pathKeyframe.f2360c, m1503d(), f, this.f2632d)) != null) {
            return pointF;
        }
        if (this.f2651k != pathKeyframe) {
            this.f2652l.setPath(path, false);
            this.f2651k = pathKeyframe;
        }
        PathMeasure pathMeasure = this.f2652l;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.f2650j, null);
        PointF pointF2 = this.f2649i;
        float[] fArr = this.f2650j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f2649i;
    }
}
