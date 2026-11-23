package p007c.p056c.p057a.p064d0;

import java.io.IOException;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;

/* JADX INFO: renamed from: c.c.a.d0.n, reason: use source file name */
/* JADX INFO: compiled from: IntegerParser.java */
/* JADX INFO: loaded from: classes.dex */
public class IntegerParser implements ValueParser<Integer> {

    /* JADX INFO: renamed from: a */
    public static final IntegerParser f2299a = new IntegerParser();

    @Override // p007c.p056c.p057a.p064d0.ValueParser
    /* JADX INFO: renamed from: a */
    public Integer mo1374a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(JsonUtils.m1408d(jsonReader) * f));
    }
}
