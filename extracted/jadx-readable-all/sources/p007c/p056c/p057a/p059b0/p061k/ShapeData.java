package p007c.p056c.p057a.p059b0.p061k;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.p059b0.CubicCurveData;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.k.l, reason: use source file name */
/* JADX INFO: compiled from: ShapeData.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeData {

    /* JADX INFO: renamed from: a */
    public final List<CubicCurveData> f2092a;

    /* JADX INFO: renamed from: b */
    public PointF f2093b;

    /* JADX INFO: renamed from: c */
    public boolean f2094c;

    public ShapeData(PointF pointF, boolean z, List<CubicCurveData> list) {
        this.f2093b = pointF;
        this.f2094c = z;
        this.f2092a = new ArrayList(list);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ShapeData{numCurves=");
        sbM1556G.append(this.f2092a.size());
        sbM1556G.append("closed=");
        sbM1556G.append(this.f2094c);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }

    public ShapeData() {
        this.f2092a = new ArrayList();
    }
}
