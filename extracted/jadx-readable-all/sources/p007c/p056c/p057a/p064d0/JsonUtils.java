package p007c.p056c.p057a.p064d0;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.d0.o, reason: use source file name */
/* JADX INFO: compiled from: JsonUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class JsonUtils {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.a f2300a = JsonReader.a.m1394a("x", "y");

    /* JADX INFO: renamed from: a */
    public static int m1405a(JsonReader jsonReader) throws IOException {
        jsonReader.mo1382a();
        int iMo1379H = (int) (jsonReader.mo1379H() * 255.0d);
        int iMo1379H2 = (int) (jsonReader.mo1379H() * 255.0d);
        int iMo1379H3 = (int) (jsonReader.mo1379H() * 255.0d);
        while (jsonReader.mo1377B()) {
            jsonReader.mo1392u0();
        }
        jsonReader.mo1385f();
        return Color.argb(255, iMo1379H, iMo1379H2, iMo1379H3);
    }

    /* JADX INFO: renamed from: b */
    public static PointF m1406b(JsonReader jsonReader, float f) throws IOException {
        int iOrdinal = jsonReader.mo1386f0().ordinal();
        if (iOrdinal == 0) {
            jsonReader.mo1382a();
            float fMo1379H = (float) jsonReader.mo1379H();
            float fMo1379H2 = (float) jsonReader.mo1379H();
            while (jsonReader.mo1386f0() != JsonReader.b.END_ARRAY) {
                jsonReader.mo1392u0();
            }
            jsonReader.mo1385f();
            return new PointF(fMo1379H * f, fMo1379H2 * f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                StringBuilder sbM1556G = outline.m1556G("Unknown point starts with ");
                sbM1556G.append(jsonReader.mo1386f0());
                throw new IllegalArgumentException(sbM1556G.toString());
            }
            float fMo1379H3 = (float) jsonReader.mo1379H();
            float fMo1379H4 = (float) jsonReader.mo1379H();
            while (jsonReader.mo1377B()) {
                jsonReader.mo1392u0();
            }
            return new PointF(fMo1379H3 * f, fMo1379H4 * f);
        }
        jsonReader.mo1384c();
        float fM1408d = 0.0f;
        float fM1408d2 = 0.0f;
        while (jsonReader.mo1377B()) {
            int iMo1389n0 = jsonReader.mo1389n0(f2300a);
            if (iMo1389n0 == 0) {
                fM1408d = m1408d(jsonReader);
            } else if (iMo1389n0 != 1) {
                jsonReader.mo1390t0();
                jsonReader.mo1392u0();
            } else {
                fM1408d2 = m1408d(jsonReader);
            }
        }
        jsonReader.mo1388h();
        return new PointF(fM1408d * f, fM1408d2 * f);
    }

    /* JADX INFO: renamed from: c */
    public static List<PointF> m1407c(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo1382a();
        while (jsonReader.mo1386f0() == JsonReader.b.BEGIN_ARRAY) {
            jsonReader.mo1382a();
            arrayList.add(m1406b(jsonReader, f));
            jsonReader.mo1385f();
        }
        jsonReader.mo1385f();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static float m1408d(JsonReader jsonReader) throws IOException {
        JsonReader.b bVarMo1386f0 = jsonReader.mo1386f0();
        int iOrdinal = bVarMo1386f0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) jsonReader.mo1379H();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + bVarMo1386f0);
        }
        jsonReader.mo1382a();
        float fMo1379H = (float) jsonReader.mo1379H();
        while (jsonReader.mo1377B()) {
            jsonReader.mo1392u0();
        }
        jsonReader.mo1385f();
        return fMo1379H;
    }
}
