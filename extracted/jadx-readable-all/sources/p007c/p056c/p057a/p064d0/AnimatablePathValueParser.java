package p007c.p056c.p057a.p064d0;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatablePathValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableSplitDimensionPathValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableValue;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.PathKeyframe;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.c.a.d0.a, reason: use source file name */
/* JADX INFO: compiled from: AnimatablePathValueParser.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatablePathValueParser {

    /* JADX INFO: renamed from: a */
    public static JsonReader.a f2242a = JsonReader.a.m1394a("k", "x", "y");

    /* JADX INFO: renamed from: a */
    public static AnimatablePathValue m1372a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo1386f0() == JsonReader.b.BEGIN_ARRAY) {
            jsonReader.mo1382a();
            while (jsonReader.mo1377B()) {
                arrayList.add(new PathKeyframe(lottieComposition, KeyframeParser.m1409a(jsonReader, lottieComposition, Utils.m1439c(), PathParser.f2313a, jsonReader.mo1386f0() == JsonReader.b.BEGIN_OBJECT)));
            }
            jsonReader.mo1385f();
            KeyframesParser.m1411b(arrayList);
        } else {
            arrayList.add(new Keyframe(JsonUtils.m1406b(jsonReader, Utils.m1439c())));
        }
        return new AnimatablePathValue(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static AnimatableValue<PointF, PointF> m1373b(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        JsonReader.b bVar = JsonReader.b.STRING;
        jsonReader.mo1384c();
        AnimatablePathValue animatablePathValueM1372a = null;
        AnimatableFloatValue animatableFloatValueM16956w = null;
        AnimatableFloatValue animatableFloatValueM16956w2 = null;
        boolean z = false;
        while (jsonReader.mo1386f0() != JsonReader.b.END_OBJECT) {
            int iMo1389n0 = jsonReader.mo1389n0(f2242a);
            if (iMo1389n0 == 0) {
                animatablePathValueM1372a = m1372a(jsonReader, lottieComposition);
            } else if (iMo1389n0 != 1) {
                if (iMo1389n0 != 2) {
                    jsonReader.mo1390t0();
                    jsonReader.mo1392u0();
                } else if (jsonReader.mo1386f0() == bVar) {
                    jsonReader.mo1392u0();
                    z = true;
                } else {
                    animatableFloatValueM16956w2 = C8462c.m16956w(jsonReader, lottieComposition);
                }
            } else if (jsonReader.mo1386f0() == bVar) {
                jsonReader.mo1392u0();
                z = true;
            } else {
                animatableFloatValueM16956w = C8462c.m16956w(jsonReader, lottieComposition);
            }
        }
        jsonReader.mo1388h();
        if (z) {
            lottieComposition.m1443a("Lottie doesn't support expressions.");
        }
        return animatablePathValueM1372a != null ? animatablePathValueM1372a : new AnimatableSplitDimensionPathValue(animatableFloatValueM16956w, animatableFloatValueM16956w2);
    }
}
