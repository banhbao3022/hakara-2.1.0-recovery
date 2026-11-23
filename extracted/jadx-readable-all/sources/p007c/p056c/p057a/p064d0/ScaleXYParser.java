package p007c.p056c.p057a.p064d0;

import java.io.IOException;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p067f0.ScaleXY;

/* JADX INFO: renamed from: c.c.a.d0.z, reason: use source file name */
/* JADX INFO: compiled from: ScaleXYParser.java */
/* JADX INFO: loaded from: classes.dex */
public class ScaleXYParser implements ValueParser<ScaleXY> {

    /* JADX INFO: renamed from: a */
    public static final ScaleXYParser f2318a = new ScaleXYParser();

    @Override // p007c.p056c.p057a.p064d0.ValueParser
    /* JADX INFO: renamed from: a */
    public ScaleXY mo1374a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.mo1386f0() == JsonReader.b.BEGIN_ARRAY;
        if (z) {
            jsonReader.mo1382a();
        }
        float fMo1379H = (float) jsonReader.mo1379H();
        float fMo1379H2 = (float) jsonReader.mo1379H();
        while (jsonReader.mo1377B()) {
            jsonReader.mo1392u0();
        }
        if (z) {
            jsonReader.mo1385f();
        }
        return new ScaleXY((fMo1379H / 100.0f) * f, (fMo1379H2 / 100.0f) * f);
    }
}
