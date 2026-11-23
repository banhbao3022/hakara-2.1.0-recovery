package p007c.p056c.p057a.p064d0;

import android.graphics.Color;
import java.io.IOException;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;

/* JADX INFO: renamed from: c.c.a.d0.e, reason: use source file name */
/* JADX INFO: compiled from: ColorParser.java */
/* JADX INFO: loaded from: classes.dex */
public class ColorParser implements ValueParser<Integer> {

    /* JADX INFO: renamed from: a */
    public static final ColorParser f2253a = new ColorParser();

    @Override // p007c.p056c.p057a.p064d0.ValueParser
    /* JADX INFO: renamed from: a */
    public Integer mo1374a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.mo1386f0() == JsonReader.b.BEGIN_ARRAY;
        if (z) {
            jsonReader.mo1382a();
        }
        double dMo1379H = jsonReader.mo1379H();
        double dMo1379H2 = jsonReader.mo1379H();
        double dMo1379H3 = jsonReader.mo1379H();
        double dMo1379H4 = jsonReader.mo1386f0() == JsonReader.b.NUMBER ? jsonReader.mo1379H() : 1.0d;
        if (z) {
            jsonReader.mo1385f();
        }
        if (dMo1379H <= 1.0d && dMo1379H2 <= 1.0d && dMo1379H3 <= 1.0d) {
            dMo1379H *= 255.0d;
            dMo1379H2 *= 255.0d;
            dMo1379H3 *= 255.0d;
            if (dMo1379H4 <= 1.0d) {
                dMo1379H4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMo1379H4, (int) dMo1379H, (int) dMo1379H2, (int) dMo1379H3));
    }
}
