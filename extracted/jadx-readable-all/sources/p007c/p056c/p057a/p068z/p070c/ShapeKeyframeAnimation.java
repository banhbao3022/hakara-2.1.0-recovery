package p007c.p056c.p057a.p068z.p070c;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p007c.p056c.p057a.p059b0.CubicCurveData;
import p007c.p056c.p057a.p059b0.p061k.ShapeData;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.z.c.l, reason: use source file name */
/* JADX INFO: compiled from: ShapeKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeKeyframeAnimation extends BaseKeyframeAnimation<ShapeData, Path> {

    /* JADX INFO: renamed from: i */
    public final ShapeData f2655i;

    /* JADX INFO: renamed from: j */
    public final Path f2656j;

    public ShapeKeyframeAnimation(List<Keyframe<ShapeData>> list) {
        super(list);
        this.f2655i = new ShapeData();
        this.f2656j = new Path();
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public Path mo1505f(Keyframe<ShapeData> keyframe, float f) {
        ShapeData shapeData = keyframe.f2359b;
        ShapeData shapeData2 = keyframe.f2360c;
        ShapeData shapeData3 = this.f2655i;
        if (shapeData3.f2093b == null) {
            shapeData3.f2093b = new PointF();
        }
        shapeData3.f2094c = shapeData.f2094c || shapeData2.f2094c;
        if (shapeData.f2092a.size() != shapeData2.f2092a.size()) {
            StringBuilder sbM1556G = outline.m1556G("Curves must have the same number of control points. Shape 1: ");
            sbM1556G.append(shapeData.f2092a.size());
            sbM1556G.append("\tShape 2: ");
            sbM1556G.append(shapeData2.f2092a.size());
            Logger2.m1420b(sbM1556G.toString());
        }
        int iMin = Math.min(shapeData.f2092a.size(), shapeData2.f2092a.size());
        if (shapeData3.f2092a.size() < iMin) {
            for (int size = shapeData3.f2092a.size(); size < iMin; size++) {
                shapeData3.f2092a.add(new CubicCurveData());
            }
        } else if (shapeData3.f2092a.size() > iMin) {
            for (int size2 = shapeData3.f2092a.size() - 1; size2 >= iMin; size2--) {
                List<CubicCurveData> list = shapeData3.f2092a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = shapeData.f2093b;
        PointF pointF2 = shapeData2.f2093b;
        float fM1435e = MiscUtils.m1435e(pointF.x, pointF2.x, f);
        float fM1435e2 = MiscUtils.m1435e(pointF.y, pointF2.y, f);
        if (shapeData3.f2093b == null) {
            shapeData3.f2093b = new PointF();
        }
        shapeData3.f2093b.set(fM1435e, fM1435e2);
        for (int size3 = shapeData3.f2092a.size() - 1; size3 >= 0; size3--) {
            CubicCurveData cubicCurveData = shapeData.f2092a.get(size3);
            CubicCurveData cubicCurveData2 = shapeData2.f2092a.get(size3);
            PointF pointF3 = cubicCurveData.f1966a;
            PointF pointF4 = cubicCurveData.f1967b;
            PointF pointF5 = cubicCurveData.f1968c;
            PointF pointF6 = cubicCurveData2.f1966a;
            PointF pointF7 = cubicCurveData2.f1967b;
            PointF pointF8 = cubicCurveData2.f1968c;
            shapeData3.f2092a.get(size3).f1966a.set(MiscUtils.m1435e(pointF3.x, pointF6.x, f), MiscUtils.m1435e(pointF3.y, pointF6.y, f));
            shapeData3.f2092a.get(size3).f1967b.set(MiscUtils.m1435e(pointF4.x, pointF7.x, f), MiscUtils.m1435e(pointF4.y, pointF7.y, f));
            shapeData3.f2092a.get(size3).f1968c.set(MiscUtils.m1435e(pointF5.x, pointF8.x, f), MiscUtils.m1435e(pointF5.y, pointF8.y, f));
        }
        ShapeData shapeData4 = this.f2655i;
        Path path = this.f2656j;
        path.reset();
        PointF pointF9 = shapeData4.f2093b;
        path.moveTo(pointF9.x, pointF9.y);
        MiscUtils.f2336a.set(pointF9.x, pointF9.y);
        for (int i = 0; i < shapeData4.f2092a.size(); i++) {
            CubicCurveData cubicCurveData3 = shapeData4.f2092a.get(i);
            PointF pointF10 = cubicCurveData3.f1966a;
            PointF pointF11 = cubicCurveData3.f1967b;
            PointF pointF12 = cubicCurveData3.f1968c;
            if (pointF10.equals(MiscUtils.f2336a) && pointF11.equals(pointF12)) {
                path.lineTo(pointF12.x, pointF12.y);
            } else {
                path.cubicTo(pointF10.x, pointF10.y, pointF11.x, pointF11.y, pointF12.x, pointF12.y);
            }
            MiscUtils.f2336a.set(pointF12.x, pointF12.y);
        }
        if (shapeData4.f2094c) {
            path.close();
        }
        return this.f2656j;
    }
}
