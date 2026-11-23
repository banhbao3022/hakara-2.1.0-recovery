package p007c.p056c.p057a.p064d0;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import p007c.p056c.p057a.p059b0.p061k.GradientColor;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p066e0.MiscUtils;

/* JADX INFO: renamed from: c.c.a.d0.k, reason: use source file name */
/* JADX INFO: compiled from: GradientColorParser.java */
/* JADX INFO: loaded from: classes.dex */
public class GradientColorParser implements ValueParser<GradientColor> {

    /* JADX INFO: renamed from: a */
    public int f2293a;

    public GradientColorParser(int i) {
        this.f2293a = i;
    }

    @Override // p007c.p056c.p057a.p064d0.ValueParser
    /* JADX INFO: renamed from: a */
    public GradientColor mo1374a(JsonReader jsonReader, float f) throws IOException {
        double d;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = jsonReader.mo1386f0() == JsonReader.b.BEGIN_ARRAY;
        if (z) {
            jsonReader.mo1382a();
        }
        while (jsonReader.mo1377B()) {
            arrayList.add(Float.valueOf((float) jsonReader.mo1379H()));
        }
        if (z) {
            jsonReader.mo1385f();
        }
        if (this.f2293a == -1) {
            this.f2293a = arrayList.size() / 4;
        }
        int i2 = this.f2293a;
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2293a * 4; i5++) {
            int i6 = i5 / 4;
            double dFloatValue = ((Float) arrayList.get(i5)).floatValue();
            int i7 = i5 % 4;
            if (i7 == 0) {
                fArr[i6] = (float) dFloatValue;
            } else if (i7 == 1) {
                i3 = (int) (dFloatValue * 255.0d);
            } else if (i7 == 2) {
                i4 = (int) (dFloatValue * 255.0d);
            } else if (i7 == 3) {
                iArr[i6] = Color.argb(255, i3, i4, (int) (dFloatValue * 255.0d));
            }
        }
        GradientColor gradientColor = new GradientColor(fArr, iArr);
        int i8 = this.f2293a * 4;
        if (arrayList.size() > i8) {
            int size = (arrayList.size() - i8) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i9 = 0;
            while (i8 < arrayList.size()) {
                if (i8 % 2 == 0) {
                    dArr[i9] = ((Float) arrayList.get(i8)).floatValue();
                } else {
                    dArr2[i9] = ((Float) arrayList.get(i8)).floatValue();
                    i9++;
                }
                i8++;
            }
            while (true) {
                int[] iArr2 = gradientColor.f2025b;
                if (i >= iArr2.length) {
                    break;
                }
                int i10 = iArr2[i];
                double d2 = gradientColor.f2024a[i];
                int i11 = 1;
                while (true) {
                    if (i11 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i12 = i11 - 1;
                    double d3 = dArr[i12];
                    double d4 = dArr[i11];
                    if (dArr[i11] >= d2) {
                        double d5 = (d2 - d3) / (d4 - d3);
                        PointF pointF = MiscUtils.f2336a;
                        double dMax = Math.max(0.0d, Math.min(1.0d, d5));
                        double d6 = dArr2[i12];
                        d = ((dArr2[i11] - d6) * dMax) + d6;
                        break;
                    }
                    i11++;
                }
                GradientColor gradientColor2 = gradientColor;
                gradientColor2.f2025b[i] = Color.argb((int) (d * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
                i++;
                gradientColor = gradientColor2;
            }
        }
        return gradientColor;
    }
}
