package p007c.p056c.p057a.p064d0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.PathKeyframe;

/* JADX INFO: renamed from: c.c.a.d0.q, reason: use source file name */
/* JADX INFO: compiled from: KeyframesParser.java */
/* JADX INFO: loaded from: classes.dex */
public class KeyframesParser {

    /* JADX INFO: renamed from: a */
    public static JsonReader.a f2304a = JsonReader.a.m1394a("k");

    /* JADX INFO: renamed from: a */
    public static <T> List<Keyframe<T>> m1410a(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser<T> valueParser) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo1386f0() == JsonReader.b.STRING) {
            lottieComposition.m1443a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.mo1384c();
        while (jsonReader.mo1377B()) {
            if (jsonReader.mo1389n0(f2304a) != 0) {
                jsonReader.mo1392u0();
            } else if (jsonReader.mo1386f0() == JsonReader.b.BEGIN_ARRAY) {
                jsonReader.mo1382a();
                if (jsonReader.mo1386f0() == JsonReader.b.NUMBER) {
                    arrayList.add(KeyframeParser.m1409a(jsonReader, lottieComposition, f, valueParser, false));
                } else {
                    while (jsonReader.mo1377B()) {
                        arrayList.add(KeyframeParser.m1409a(jsonReader, lottieComposition, f, valueParser, true));
                    }
                }
                jsonReader.mo1385f();
            } else {
                arrayList.add(KeyframeParser.m1409a(jsonReader, lottieComposition, f, valueParser, false));
            }
        }
        jsonReader.mo1388h();
        m1411b(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m1411b(List<? extends Keyframe<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            Keyframe<T> keyframe = list.get(i2);
            i2++;
            Keyframe<T> keyframe2 = list.get(i2);
            keyframe.f2363f = Float.valueOf(keyframe2.f2362e);
            if (keyframe.f2360c == null && (t = keyframe2.f2359b) != null) {
                keyframe.f2360c = t;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).m1519e();
                }
            }
        }
        Keyframe<T> keyframe3 = list.get(i);
        if ((keyframe3.f2359b == null || keyframe3.f2360c == null) && list.size() > 1) {
            list.remove(keyframe3);
        }
    }
}
