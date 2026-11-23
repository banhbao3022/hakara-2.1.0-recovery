package p007c.p056c.p057a.p064d0;

import java.io.IOException;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;

/* JADX INFO: renamed from: c.c.a.d0.h, reason: use source file name */
/* JADX INFO: compiled from: FloatParser.java */
/* JADX INFO: loaded from: classes.dex */
public class FloatParser implements ValueParser<Float> {

    /* JADX INFO: renamed from: a */
    public static final FloatParser f2260a = new FloatParser();

    @Override // p007c.p056c.p057a.p064d0.ValueParser
    /* JADX INFO: renamed from: a */
    public Float mo1374a(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(JsonUtils.m1408d(jsonReader) * f);
    }
}
