package p007c.p056c.p057a.p064d0;

import android.graphics.PointF;
import java.io.IOException;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;

/* JADX INFO: renamed from: c.c.a.d0.u, reason: use source file name */
/* JADX INFO: compiled from: PathParser.java */
/* JADX INFO: loaded from: classes.dex */
public class PathParser implements ValueParser<PointF> {

    /* JADX INFO: renamed from: a */
    public static final PathParser f2313a = new PathParser();

    @Override // p007c.p056c.p057a.p064d0.ValueParser
    /* JADX INFO: renamed from: a */
    public PointF mo1374a(JsonReader jsonReader, float f) throws IOException {
        return JsonUtils.m1406b(jsonReader, f);
    }
}
