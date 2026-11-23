package p007c.p056c.p057a.p064d0;

import android.graphics.Rect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.LottieImageAsset;
import p007c.p056c.p057a.p059b0.Font;
import p007c.p056c.p057a.p059b0.FontCharacter;
import p007c.p056c.p057a.p059b0.Marker;
import p007c.p056c.p057a.p059b0.p061k.ShapeGroup;
import p007c.p056c.p057a.p059b0.p062l.Layer;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p056c.p057a.p066e0.Utils;
import p636z0.p691g.LongSparseArray;
import p636z0.p691g.SparseArrayCompat;

/* JADX INFO: renamed from: c.c.a.d0.s, reason: use source file name */
/* JADX INFO: compiled from: LottieCompositionMoshiParser.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionMoshiParser {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.a f2308a = JsonReader.a.m1394a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b */
    public static JsonReader.a f2309b = JsonReader.a.m1394a("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c */
    public static final JsonReader.a f2310c = JsonReader.a.m1394a("list");

    /* JADX INFO: renamed from: d */
    public static final JsonReader.a f2311d = JsonReader.a.m1394a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0046. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    public static LottieComposition m1413a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        float f;
        float f2;
        float fM1439c = Utils.m1439c();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<FontCharacter> sparseArrayCompat = new SparseArrayCompat<>();
        LottieComposition lottieComposition = new LottieComposition();
        jsonReader.mo1384c();
        float fMo1379H = 0.0f;
        int iMo1380O = 0;
        int iMo1380O2 = 0;
        float fMo1379H2 = 0.0f;
        float fMo1379H3 = 0.0f;
        while (jsonReader.mo1377B()) {
            float f3 = fMo1379H;
            switch (jsonReader.mo1389n0(f2308a)) {
                case 0:
                    iMo1380O = jsonReader.mo1380O();
                    fMo1379H = f3;
                    break;
                case 1:
                    iMo1380O2 = jsonReader.mo1380O();
                    fMo1379H = f3;
                    break;
                case 2:
                    fMo1379H2 = (float) jsonReader.mo1379H();
                    fMo1379H = f3;
                    arrayList3 = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
                case 3:
                    fMo1379H3 = ((float) jsonReader.mo1379H()) - 0.01f;
                    fMo1379H = f3;
                    arrayList3 = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
                case 4:
                    arrayList3 = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    fMo1379H = (float) jsonReader.mo1379H();
                    arrayList3 = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
                case 5:
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    f = fMo1379H2;
                    f2 = fMo1379H3;
                    String[] strArrSplit = jsonReader.mo1383b0().split("\\.");
                    int i = Integer.parseInt(strArrSplit[0]);
                    boolean z = true;
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    int i3 = Integer.parseInt(strArrSplit[2]);
                    if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                        z = false;
                    }
                    if (!z) {
                        lottieComposition.m1443a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fMo1379H = f3;
                    fMo1379H2 = f;
                    arrayList3 = arrayList;
                    fMo1379H3 = f2;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
                case 6:
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    f = fMo1379H2;
                    f2 = fMo1379H3;
                    jsonReader.mo1382a();
                    int i4 = 0;
                    while (jsonReader.mo1377B()) {
                        Layer layerM1412a = LayerParser.m1412a(jsonReader, lottieComposition);
                        if (layerM1412a.f2172e == Layer.a.IMAGE) {
                            i4++;
                        }
                        arrayList2.add(layerM1412a);
                        longSparseArray.m15593m(layerM1412a.f2171d, layerM1412a);
                        if (i4 > 4) {
                            Logger2.m1420b("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    jsonReader.mo1385f();
                    fMo1379H = f3;
                    fMo1379H2 = f;
                    arrayList3 = arrayList;
                    fMo1379H3 = f2;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
                case 7:
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    f = fMo1379H2;
                    f2 = fMo1379H3;
                    jsonReader.mo1382a();
                    while (jsonReader.mo1377B()) {
                        ArrayList arrayList4 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        jsonReader.mo1384c();
                        String strMo1383b0 = null;
                        String strMo1383b1 = null;
                        String strMo1383b2 = null;
                        int iMo1380O3 = 0;
                        int iMo1380O4 = 0;
                        while (jsonReader.mo1377B()) {
                            int iMo1389n0 = jsonReader.mo1389n0(f2309b);
                            if (iMo1389n0 == 0) {
                                strMo1383b0 = jsonReader.mo1383b0();
                            } else if (iMo1389n0 == 1) {
                                jsonReader.mo1382a();
                                while (jsonReader.mo1377B()) {
                                    Layer layerM1412a2 = LayerParser.m1412a(jsonReader, lottieComposition);
                                    longSparseArray2.m15593m(layerM1412a2.f2171d, layerM1412a2);
                                    arrayList4.add(layerM1412a2);
                                }
                                jsonReader.mo1385f();
                            } else if (iMo1389n0 == 2) {
                                iMo1380O3 = jsonReader.mo1380O();
                            } else if (iMo1389n0 == 3) {
                                iMo1380O4 = jsonReader.mo1380O();
                            } else if (iMo1389n0 == 4) {
                                strMo1383b1 = jsonReader.mo1383b0();
                            } else if (iMo1389n0 != 5) {
                                jsonReader.mo1390t0();
                                jsonReader.mo1392u0();
                            } else {
                                strMo1383b2 = jsonReader.mo1383b0();
                            }
                        }
                        jsonReader.mo1388h();
                        if (strMo1383b1 != null) {
                            LottieImageAsset lottieImageAsset = new LottieImageAsset(iMo1380O3, iMo1380O4, strMo1383b0, strMo1383b1, strMo1383b2);
                            map2.put(lottieImageAsset.f2446c, lottieImageAsset);
                        } else {
                            map.put(strMo1383b0, arrayList4);
                        }
                    }
                    jsonReader.mo1385f();
                    fMo1379H = f3;
                    fMo1379H2 = f;
                    arrayList3 = arrayList;
                    fMo1379H3 = f2;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
                case 8:
                    f = fMo1379H2;
                    f2 = fMo1379H3;
                    jsonReader.mo1384c();
                    while (jsonReader.mo1377B()) {
                        if (jsonReader.mo1389n0(f2310c) != 0) {
                            jsonReader.mo1390t0();
                            jsonReader.mo1392u0();
                        } else {
                            jsonReader.mo1382a();
                            while (jsonReader.mo1377B()) {
                                JsonReader.a aVar = FontParser.f2292a;
                                jsonReader.mo1384c();
                                String strMo1383b3 = null;
                                String strMo1383b4 = null;
                                String strMo1383b5 = null;
                                float fMo1379H4 = 0.0f;
                                while (jsonReader.mo1377B()) {
                                    arrayList3 = arrayList3;
                                    int iMo1389n1 = jsonReader.mo1389n0(FontParser.f2292a);
                                    if (iMo1389n1 != 0) {
                                        SparseArrayCompat<FontCharacter> sparseArrayCompat2 = sparseArrayCompat;
                                        if (iMo1389n1 == 1) {
                                            strMo1383b4 = jsonReader.mo1383b0();
                                        } else if (iMo1389n1 == 2) {
                                            strMo1383b5 = jsonReader.mo1383b0();
                                        } else if (iMo1389n1 != 3) {
                                            jsonReader.mo1390t0();
                                            jsonReader.mo1392u0();
                                        } else {
                                            fMo1379H4 = (float) jsonReader.mo1379H();
                                        }
                                        sparseArrayCompat = sparseArrayCompat2;
                                    } else {
                                        strMo1383b3 = jsonReader.mo1383b0();
                                    }
                                }
                                ArrayList arrayList5 = arrayList3;
                                jsonReader.mo1388h();
                                Font font = new Font(strMo1383b3, strMo1383b4, strMo1383b5, fMo1379H4);
                                map3.put(font.f1985b, font);
                                arrayList3 = arrayList5;
                                sparseArrayCompat = sparseArrayCompat;
                            }
                            jsonReader.mo1385f();
                        }
                    }
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    jsonReader.mo1388h();
                    fMo1379H = f3;
                    fMo1379H2 = f;
                    arrayList3 = arrayList;
                    fMo1379H3 = f2;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
                case 9:
                    f = fMo1379H2;
                    f2 = fMo1379H3;
                    jsonReader.mo1382a();
                    while (jsonReader.mo1377B()) {
                        JsonReader.a aVar2 = FontCharacterParser.f2290a;
                        ArrayList arrayList6 = new ArrayList();
                        jsonReader.mo1384c();
                        double dMo1379H = 0.0d;
                        double dMo1379H2 = 0.0d;
                        String strMo1383b6 = null;
                        String strMo1383b7 = null;
                        char cCharAt = 0;
                        while (jsonReader.mo1377B()) {
                            int iMo1389n2 = jsonReader.mo1389n0(FontCharacterParser.f2290a);
                            if (iMo1389n2 == 0) {
                                cCharAt = jsonReader.mo1383b0().charAt(0);
                            } else if (iMo1389n2 == 1) {
                                dMo1379H = jsonReader.mo1379H();
                            } else if (iMo1389n2 == 2) {
                                dMo1379H2 = jsonReader.mo1379H();
                            } else if (iMo1389n2 == 3) {
                                strMo1383b6 = jsonReader.mo1383b0();
                            } else if (iMo1389n2 == 4) {
                                strMo1383b7 = jsonReader.mo1383b0();
                            } else if (iMo1389n2 != 5) {
                                jsonReader.mo1390t0();
                                jsonReader.mo1392u0();
                            } else {
                                jsonReader.mo1384c();
                                while (jsonReader.mo1377B()) {
                                    if (jsonReader.mo1389n0(FontCharacterParser.f2291b) != 0) {
                                        jsonReader.mo1390t0();
                                        jsonReader.mo1392u0();
                                    } else {
                                        jsonReader.mo1382a();
                                        while (jsonReader.mo1377B()) {
                                            arrayList6.add((ShapeGroup) ContentModelParser.m1376a(jsonReader, lottieComposition));
                                        }
                                        jsonReader.mo1385f();
                                    }
                                }
                                jsonReader.mo1388h();
                            }
                        }
                        jsonReader.mo1388h();
                        FontCharacter fontCharacter = new FontCharacter(arrayList6, cCharAt, dMo1379H, dMo1379H2, strMo1383b6, strMo1383b7);
                        sparseArrayCompat.m15619j(fontCharacter.hashCode(), fontCharacter);
                    }
                    jsonReader.mo1385f();
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    fMo1379H = f3;
                    fMo1379H2 = f;
                    arrayList3 = arrayList;
                    fMo1379H3 = f2;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
                case 10:
                    jsonReader.mo1382a();
                    while (jsonReader.mo1377B()) {
                        jsonReader.mo1384c();
                        String strMo1383b8 = null;
                        float fMo1379H5 = 0.0f;
                        float fMo1379H6 = 0.0f;
                        while (jsonReader.mo1377B()) {
                            int iMo1389n3 = jsonReader.mo1389n0(f2311d);
                            if (iMo1389n3 != 0) {
                                float f4 = fMo1379H3;
                                if (iMo1389n3 == 1) {
                                    fMo1379H5 = (float) jsonReader.mo1379H();
                                } else if (iMo1389n3 != 2) {
                                    jsonReader.mo1390t0();
                                    jsonReader.mo1392u0();
                                    fMo1379H3 = f4;
                                } else {
                                    fMo1379H6 = (float) jsonReader.mo1379H();
                                }
                                fMo1379H3 = f4;
                                fMo1379H2 = fMo1379H2;
                            } else {
                                strMo1383b8 = jsonReader.mo1383b0();
                            }
                        }
                        jsonReader.mo1388h();
                        arrayList3.add(new Marker(strMo1383b8, fMo1379H5, fMo1379H6));
                        fMo1379H2 = fMo1379H2;
                        fMo1379H3 = fMo1379H3;
                    }
                    f = fMo1379H2;
                    f2 = fMo1379H3;
                    jsonReader.mo1385f();
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    fMo1379H = f3;
                    fMo1379H2 = f;
                    arrayList3 = arrayList;
                    fMo1379H3 = f2;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
                default:
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat;
                    f = fMo1379H2;
                    f2 = fMo1379H3;
                    jsonReader.mo1390t0();
                    jsonReader.mo1392u0();
                    fMo1379H = f3;
                    fMo1379H2 = f;
                    arrayList3 = arrayList;
                    fMo1379H3 = f2;
                    sparseArrayCompat = sparseArrayCompat;
                    break;
            }
        }
        lottieComposition.f2352j = new Rect(0, 0, (int) (iMo1380O * fM1439c), (int) (iMo1380O2 * fM1439c));
        lottieComposition.f2353k = fMo1379H2;
        lottieComposition.f2354l = fMo1379H3;
        lottieComposition.f2355m = fMo1379H;
        lottieComposition.f2351i = arrayList2;
        lottieComposition.f2350h = longSparseArray;
        lottieComposition.f2345c = map;
        lottieComposition.f2346d = map2;
        lottieComposition.f2349g = sparseArrayCompat;
        lottieComposition.f2347e = map3;
        lottieComposition.f2348f = arrayList3;
        return lottieComposition;
    }
}
