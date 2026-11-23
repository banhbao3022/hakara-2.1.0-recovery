package p007c.p056c.p057a.p064d0;

import android.graphics.PointF;
import java.io.IOException;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;

/* JADX INFO: renamed from: c.c.a.d0.v, reason: use source file name */
/* JADX INFO: compiled from: PointFParser.java */
/* JADX INFO: loaded from: classes.dex */
public class PointFParser implements ValueParser<PointF> {

    /* JADX INFO: renamed from: a */
    public static final PointFParser f2314a = new PointFParser();

    @Override // p007c.p056c.p057a.p064d0.ValueParser
    /* JADX INFO: renamed from: a */
    public PointF mo1374a(JsonReader jsonReader, float f) throws IOException {
        JsonReader.b bVarMo1386f0 = jsonReader.mo1386f0();
        if (bVarMo1386f0 == JsonReader.b.BEGIN_ARRAY) {
            return JsonUtils.m1406b(jsonReader, f);
        }
        if (bVarMo1386f0 == JsonReader.b.BEGIN_OBJECT) {
            return JsonUtils.m1406b(jsonReader, f);
        }
        if (bVarMo1386f0 == JsonReader.b.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.mo1379H()) * f, ((float) jsonReader.mo1379H()) * f);
            while (jsonReader.mo1377B()) {
                jsonReader.mo1392u0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarMo1386f0);
    }
}
