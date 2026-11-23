package p007c.p056c.p057a.p068z.p070c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.Keyframe;

/* JADX INFO: renamed from: c.c.a.z.c.h, reason: use source file name */
/* JADX INFO: compiled from: PathKeyframe.java */
/* JADX INFO: loaded from: classes.dex */
public class PathKeyframe extends Keyframe<PointF> {

    /* JADX INFO: renamed from: o */
    public Path f2647o;

    /* JADX INFO: renamed from: p */
    public final Keyframe<PointF> f2648p;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe<PointF> keyframe) {
        super(lottieComposition, keyframe.f2359b, keyframe.f2360c, keyframe.f2361d, keyframe.f2362e, keyframe.f2363f);
        this.f2648p = keyframe;
        m1519e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m1519e() {
        T t;
        T t2 = this.f2360c;
        boolean z = (t2 == 0 || (t = this.f2359b) == 0 || !((PointF) t).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.f2360c;
        if (t3 == 0 || z) {
            return;
        }
        PointF pointF = (PointF) this.f2359b;
        PointF pointF2 = (PointF) t3;
        Keyframe<PointF> keyframe = this.f2648p;
        PointF pointF3 = keyframe.f2370m;
        PointF pointF4 = keyframe.f2371n;
        ThreadLocal<PathMeasure> threadLocal = Utils.f2337a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.f2647o = path;
    }
}
