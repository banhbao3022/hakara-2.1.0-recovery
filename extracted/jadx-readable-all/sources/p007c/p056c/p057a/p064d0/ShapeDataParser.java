package p007c.p056c.p057a.p064d0;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007c.p056c.p057a.p059b0.CubicCurveData;
import p007c.p056c.p057a.p059b0.p061k.ShapeData;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p066e0.MiscUtils;

/* JADX INFO: renamed from: c.c.a.d0.a0, reason: use source file name */
/* JADX INFO: compiled from: ShapeDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeDataParser implements ValueParser<ShapeData> {

    /* JADX INFO: renamed from: a */
    public static final ShapeDataParser f2243a = new ShapeDataParser();

    /* JADX INFO: renamed from: b */
    public static final JsonReader.a f2244b = JsonReader.a.m1394a("c", "v", "i", "o");

    @Override // p007c.p056c.p057a.p064d0.ValueParser
    /* JADX INFO: renamed from: a */
    public ShapeData mo1374a(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.mo1386f0() == JsonReader.b.BEGIN_ARRAY) {
            jsonReader.mo1382a();
        }
        jsonReader.mo1384c();
        List<PointF> listM1407c = null;
        List<PointF> listM1407c2 = null;
        List<PointF> listM1407c3 = null;
        boolean zMo1378D = false;
        while (jsonReader.mo1377B()) {
            int iMo1389n0 = jsonReader.mo1389n0(f2244b);
            if (iMo1389n0 == 0) {
                zMo1378D = jsonReader.mo1378D();
            } else if (iMo1389n0 == 1) {
                listM1407c = JsonUtils.m1407c(jsonReader, f);
            } else if (iMo1389n0 == 2) {
                listM1407c2 = JsonUtils.m1407c(jsonReader, f);
            } else if (iMo1389n0 != 3) {
                jsonReader.mo1390t0();
                jsonReader.mo1392u0();
            } else {
                listM1407c3 = JsonUtils.m1407c(jsonReader, f);
            }
        }
        jsonReader.mo1388h();
        if (jsonReader.mo1386f0() == JsonReader.b.END_ARRAY) {
            jsonReader.mo1385f();
        }
        if (listM1407c == null || listM1407c2 == null || listM1407c3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listM1407c.isEmpty()) {
            return new ShapeData(new PointF(), false, Collections.emptyList());
        }
        int size = listM1407c.size();
        PointF pointF = listM1407c.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listM1407c.get(i);
            int i2 = i - 1;
            arrayList.add(new CubicCurveData(MiscUtils.m1431a(listM1407c.get(i2), listM1407c3.get(i2)), MiscUtils.m1431a(pointF2, listM1407c2.get(i)), pointF2));
        }
        if (zMo1378D) {
            PointF pointF3 = listM1407c.get(0);
            int i3 = size - 1;
            arrayList.add(new CubicCurveData(MiscUtils.m1431a(listM1407c.get(i3), listM1407c3.get(i3)), MiscUtils.m1431a(pointF3, listM1407c2.get(0)), pointF3));
        }
        return new ShapeData(pointF, zMo1378D, arrayList);
    }
}
