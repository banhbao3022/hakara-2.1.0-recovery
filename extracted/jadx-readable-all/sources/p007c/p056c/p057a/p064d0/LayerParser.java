package p007c.p056c.p057a.p064d0;

import android.graphics.Color;
import java.io.IOException;
import java.util.ArrayList;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.p059b0.p060j.AnimatableColorValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableShapeValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTextFrame;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTextProperties;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p061k.ContentModel;
import p007c.p056c.p057a.p059b0.p061k.Mask;
import p007c.p056c.p057a.p059b0.p062l.Layer;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.c.a.d0.r, reason: use source file name */
/* JADX INFO: compiled from: LayerParser.java */
/* JADX INFO: loaded from: classes.dex */
public class LayerParser {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.a f2305a = JsonReader.a.m1394a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: b */
    public static final JsonReader.a f2306b = JsonReader.a.m1394a("d", "a");

    /* JADX INFO: renamed from: c */
    public static final JsonReader.a f2307c = JsonReader.a.m1394a("nm");

    /* JADX WARN: Code duplicated, block: B:111:0x025a  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: a */
    public static Layer m1412a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        long j2;
        byte b;
        byte b2;
        String str;
        Layer.b bVar = Layer.b.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.mo1384c();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean z = false;
        Layer.b bVar2 = bVar;
        long jMo1380O = -1;
        float fMo1379H = 0.0f;
        float fMo1379H2 = 0.0f;
        String strMo1383b0 = null;
        Layer.a aVar = null;
        String strMo1383b1 = null;
        AnimatableTransform animatableTransformM1375a = null;
        int iM1439c = 0;
        int iM1439c2 = 0;
        int color = 0;
        float fMo1379H3 = 1.0f;
        float fMo1379H4 = 0.0f;
        int iM1439c3 = 0;
        int iM1439c4 = 0;
        AnimatableTextFrame animatableTextFrame = null;
        AnimatableTextProperties animatableTextProperties = null;
        AnimatableFloatValue animatableFloatValueM16957x = null;
        boolean zMo1378D = false;
        long jMo1380O2 = 0;
        String strMo1383b2 = "UNSET";
        while (jsonReader.mo1377B()) {
            int i = 1;
            switch (jsonReader.mo1389n0(f2305a)) {
                case 0:
                    strMo1383b0 = strMo1383b0;
                    strMo1383b2 = jsonReader.mo1383b0();
                    strMo1383b0 = strMo1383b0;
                    break;
                case 1:
                    strMo1383b0 = strMo1383b0;
                    jMo1380O2 = jsonReader.mo1380O();
                    strMo1383b0 = strMo1383b0;
                    break;
                case 2:
                    strMo1383b0 = strMo1383b0;
                    strMo1383b1 = jsonReader.mo1383b0();
                    strMo1383b0 = strMo1383b0;
                    break;
                case 3:
                    strMo1383b0 = strMo1383b0;
                    j2 = jMo1380O2;
                    int iMo1380O = jsonReader.mo1380O();
                    aVar = iMo1380O < 6 ? Layer.a.values()[iMo1380O] : Layer.a.UNKNOWN;
                    jMo1380O2 = j2;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 4:
                    strMo1383b0 = strMo1383b0;
                    jMo1380O = jsonReader.mo1380O();
                    strMo1383b0 = strMo1383b0;
                    break;
                case 5:
                    strMo1383b0 = strMo1383b0;
                    iM1439c = (int) (Utils.m1439c() * jsonReader.mo1380O());
                    strMo1383b0 = strMo1383b0;
                    break;
                case 6:
                    strMo1383b0 = strMo1383b0;
                    iM1439c2 = (int) (Utils.m1439c() * jsonReader.mo1380O());
                    strMo1383b0 = strMo1383b0;
                    break;
                case 7:
                    strMo1383b0 = strMo1383b0;
                    color = Color.parseColor(jsonReader.mo1383b0());
                    strMo1383b0 = strMo1383b0;
                    break;
                case 8:
                    strMo1383b0 = strMo1383b0;
                    animatableTransformM1375a = AnimatableTransformParser.m1375a(jsonReader, lottieComposition);
                    strMo1383b0 = strMo1383b0;
                    break;
                case 9:
                    strMo1383b0 = strMo1383b0;
                    j2 = jMo1380O2;
                    int iMo1380O2 = jsonReader.mo1380O();
                    Layer.b.values();
                    if (iMo1380O2 >= 6) {
                        lottieComposition.m1443a("Unsupported matte type: " + iMo1380O2);
                    } else {
                        bVar2 = Layer.b.values()[iMo1380O2];
                        int iOrdinal = bVar2.ordinal();
                        if (iOrdinal == 3) {
                            lottieComposition.m1443a("Unsupported matte type: Luma");
                        } else if (iOrdinal == 4) {
                            lottieComposition.m1443a("Unsupported matte type: Luma Inverted");
                        }
                        lottieComposition.f2357o++;
                    }
                    jMo1380O2 = j2;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 10:
                    strMo1383b0 = strMo1383b0;
                    Mask.a aVar2 = null;
                    jsonReader.mo1382a();
                    while (jsonReader.mo1377B()) {
                        Mask.a aVar3 = Mask.a.MASK_MODE_ADD;
                        jsonReader.mo1384c();
                        Mask.a aVar4 = aVar2;
                        Mask.a aVar5 = aVar4;
                        AnimatableIntegerValue animatableIntegerValueM16958y = aVar5;
                        boolean zMo1378D2 = false;
                        AnimatableShapeValue animatableShapeValue = aVar5;
                        while (jsonReader.mo1377B()) {
                            Mask.a aVar6 = aVar3;
                            String strMo1381R = jsonReader.mo1381R();
                            strMo1381R.hashCode();
                            long j3 = jMo1380O2;
                            int iHashCode = strMo1381R.hashCode();
                            if (iHashCode != 111) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 104433) {
                                        if (iHashCode == 3357091 && strMo1381R.equals("mode")) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strMo1381R.equals("inv")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strMo1381R.equals("pt")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                            } else if (strMo1381R.equals("o")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                animatableIntegerValueM16958y = C8462c.m16958y(jsonReader, lottieComposition);
                            } else if (b == 1) {
                                animatableShapeValue = new AnimatableShapeValue(KeyframesParser.m1410a(jsonReader, lottieComposition, Utils.m1439c(), ShapeDataParser.f2243a));
                            } else if (b == 2) {
                                zMo1378D2 = jsonReader.mo1378D();
                            } else if (b != 3) {
                                jsonReader.mo1392u0();
                            } else {
                                String strMo1383b3 = jsonReader.mo1383b0();
                                strMo1383b3.hashCode();
                                int iHashCode2 = strMo1383b3.hashCode();
                                if (iHashCode2 != 97) {
                                    if (iHashCode2 != 105) {
                                        if (iHashCode2 != 110) {
                                            if (iHashCode2 == 115 && strMo1383b3.equals("s")) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strMo1383b3.equals("n")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strMo1383b3.equals("i")) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strMo1383b3.equals("a")) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                if (b2 != 0) {
                                    if (b2 == 1) {
                                        lottieComposition.m1443a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                        aVar4 = Mask.a.MASK_MODE_INTERSECT;
                                    } else if (b2 == 2) {
                                        aVar4 = Mask.a.MASK_MODE_NONE;
                                    } else if (b2 != 3) {
                                        Logger2.m1420b("Unknown mask mode " + strMo1381R + ". Defaulting to Add.");
                                    } else {
                                        aVar4 = Mask.a.MASK_MODE_SUBTRACT;
                                    }
                                }
                                aVar4 = aVar6;
                            }
                            aVar3 = aVar6;
                            jMo1380O2 = j3;
                            animatableShapeValue = animatableShapeValue;
                            animatableIntegerValueM16958y = animatableIntegerValueM16958y;
                        }
                        jsonReader.mo1388h();
                        arrayList.add(new Mask(aVar4, animatableShapeValue, animatableIntegerValueM16958y, zMo1378D2));
                        jMo1380O2 = jMo1380O2;
                        aVar2 = null;
                    }
                    j2 = jMo1380O2;
                    lottieComposition.f2357o += arrayList.size();
                    jsonReader.mo1385f();
                    jMo1380O2 = j2;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 11:
                    jsonReader.mo1382a();
                    while (jsonReader.mo1377B()) {
                        ContentModel contentModelM1376a = ContentModelParser.m1376a(jsonReader, lottieComposition);
                        if (contentModelM1376a != null) {
                            arrayList2.add(contentModelM1376a);
                        }
                    }
                    jsonReader.mo1385f();
                    j2 = jMo1380O2;
                    jMo1380O2 = j2;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 12:
                    jsonReader.mo1384c();
                    while (jsonReader.mo1377B()) {
                        int iMo1389n0 = jsonReader.mo1389n0(f2306b);
                        if (iMo1389n0 == 0) {
                            str = strMo1383b0;
                            animatableTextFrame = new AnimatableTextFrame(C8462c.m16954u(jsonReader, lottieComposition, DocumentDataParser.f2258a));
                        } else if (iMo1389n0 != i) {
                            jsonReader.mo1390t0();
                            jsonReader.mo1392u0();
                        } else {
                            jsonReader.mo1382a();
                            if (jsonReader.mo1377B()) {
                                JsonReader.a aVar7 = AnimatableTextPropertiesParser.f2245a;
                                jsonReader.mo1384c();
                                AnimatableTextProperties animatableTextProperties2 = null;
                                while (jsonReader.mo1377B()) {
                                    if (jsonReader.mo1389n0(AnimatableTextPropertiesParser.f2245a) != 0) {
                                        jsonReader.mo1390t0();
                                        jsonReader.mo1392u0();
                                    } else {
                                        jsonReader.mo1384c();
                                        AnimatableFloatValue animatableFloatValueM16956w = null;
                                        AnimatableFloatValue animatableFloatValueM16956w2 = null;
                                        AnimatableColorValue animatableColorValueM16955v = null;
                                        AnimatableColorValue animatableColorValueM16955v2 = null;
                                        while (jsonReader.mo1377B()) {
                                            int iMo1389n1 = jsonReader.mo1389n0(AnimatableTextPropertiesParser.f2246b);
                                            if (iMo1389n1 == 0) {
                                                animatableColorValueM16955v = C8462c.m16955v(jsonReader, lottieComposition);
                                            } else if (iMo1389n1 == i) {
                                                animatableColorValueM16955v2 = C8462c.m16955v(jsonReader, lottieComposition);
                                            } else if (iMo1389n1 == 2) {
                                                animatableFloatValueM16956w = C8462c.m16956w(jsonReader, lottieComposition);
                                            } else if (iMo1389n1 != 3) {
                                                jsonReader.mo1390t0();
                                                jsonReader.mo1392u0();
                                            } else {
                                                animatableFloatValueM16956w2 = C8462c.m16956w(jsonReader, lottieComposition);
                                            }
                                            i = 1;
                                        }
                                        jsonReader.mo1388h();
                                        animatableTextProperties2 = new AnimatableTextProperties(animatableColorValueM16955v, animatableColorValueM16955v2, animatableFloatValueM16956w, animatableFloatValueM16956w2);
                                        strMo1383b0 = strMo1383b0;
                                        i = 1;
                                    }
                                }
                                str = strMo1383b0;
                                jsonReader.mo1388h();
                                animatableTextProperties = animatableTextProperties2 == null ? new AnimatableTextProperties(null, null, null, null) : animatableTextProperties2;
                            } else {
                                str = strMo1383b0;
                            }
                            while (jsonReader.mo1377B()) {
                                jsonReader.mo1392u0();
                            }
                            jsonReader.mo1385f();
                        }
                        strMo1383b0 = str;
                        i = 1;
                    }
                    strMo1383b0 = strMo1383b0;
                    jsonReader.mo1388h();
                    strMo1383b0 = strMo1383b0;
                    break;
                case 13:
                    jsonReader.mo1382a();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.mo1377B()) {
                        jsonReader.mo1384c();
                        while (jsonReader.mo1377B()) {
                            if (jsonReader.mo1389n0(f2307c) != 0) {
                                jsonReader.mo1390t0();
                                jsonReader.mo1392u0();
                            } else {
                                arrayList3.add(jsonReader.mo1383b0());
                            }
                        }
                        jsonReader.mo1388h();
                    }
                    jsonReader.mo1385f();
                    lottieComposition.m1443a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    j2 = jMo1380O2;
                    jMo1380O2 = j2;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 14:
                    fMo1379H3 = (float) jsonReader.mo1379H();
                    strMo1383b0 = strMo1383b0;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 15:
                    fMo1379H4 = (float) jsonReader.mo1379H();
                    strMo1383b0 = strMo1383b0;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 16:
                    iM1439c3 = (int) (Utils.m1439c() * jsonReader.mo1380O());
                    strMo1383b0 = strMo1383b0;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 17:
                    iM1439c4 = (int) (Utils.m1439c() * jsonReader.mo1380O());
                    strMo1383b0 = strMo1383b0;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 18:
                    fMo1379H = (float) jsonReader.mo1379H();
                    strMo1383b0 = strMo1383b0;
                    strMo1383b0 = strMo1383b0;
                    break;
                case 19:
                    fMo1379H2 = (float) jsonReader.mo1379H();
                    break;
                case 20:
                    animatableFloatValueM16957x = C8462c.m16957x(jsonReader, lottieComposition, z);
                    break;
                case 21:
                    strMo1383b0 = jsonReader.mo1383b0();
                    break;
                case 22:
                    zMo1378D = jsonReader.mo1378D();
                    break;
                default:
                    strMo1383b0 = strMo1383b0;
                    j2 = jMo1380O2;
                    jsonReader.mo1390t0();
                    jsonReader.mo1392u0();
                    jMo1380O2 = j2;
                    strMo1383b0 = strMo1383b0;
                    break;
            }
            z = false;
        }
        String str2 = strMo1383b0;
        long j4 = jMo1380O2;
        jsonReader.mo1388h();
        float f = fMo1379H / fMo1379H3;
        float f2 = fMo1379H2 / fMo1379H3;
        ArrayList arrayList4 = new ArrayList();
        if (f > 0.0f) {
            arrayList4.add(new Keyframe(lottieComposition, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(f)));
        }
        if (f2 <= 0.0f) {
            f2 = lottieComposition.f2354l;
        }
        arrayList4.add(new Keyframe(lottieComposition, fValueOf, fValueOf, null, f, Float.valueOf(f2)));
        arrayList4.add(new Keyframe(lottieComposition, fValueOf2, fValueOf2, null, f2, Float.valueOf(Float.MAX_VALUE)));
        if (strMo1383b2.endsWith(".ai") || "ai".equals(str2)) {
            lottieComposition.m1443a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList2, lottieComposition, strMo1383b2, j4, aVar, jMo1380O, strMo1383b1, arrayList, animatableTransformM1375a, iM1439c, iM1439c2, color, fMo1379H3, fMo1379H4, iM1439c3, iM1439c4, animatableTextFrame, animatableTextProperties, arrayList4, bVar2, animatableFloatValueM16957x, zMo1378D);
    }
}
