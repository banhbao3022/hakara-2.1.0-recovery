package p007c.p056c.p057a.p064d0;

import android.graphics.Path;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.p059b0.p060j.AnimatableColorValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableGradientColorValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatablePointValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableShapeValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p060j.AnimatableValue;
import p007c.p056c.p057a.p059b0.p061k.CircleShape;
import p007c.p056c.p057a.p059b0.p061k.ContentModel;
import p007c.p056c.p057a.p059b0.p061k.GradientFill;
import p007c.p056c.p057a.p059b0.p061k.GradientStroke;
import p007c.p056c.p057a.p059b0.p061k.GradientType;
import p007c.p056c.p057a.p059b0.p061k.MergePaths;
import p007c.p056c.p057a.p059b0.p061k.PolystarShape;
import p007c.p056c.p057a.p059b0.p061k.RectangleShape;
import p007c.p056c.p057a.p059b0.p061k.Repeater3;
import p007c.p056c.p057a.p059b0.p061k.ShapeFill;
import p007c.p056c.p057a.p059b0.p061k.ShapeGroup;
import p007c.p056c.p057a.p059b0.p061k.ShapePath;
import p007c.p056c.p057a.p059b0.p061k.ShapeStroke;
import p007c.p056c.p057a.p059b0.p061k.ShapeTrimPath;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.c.a.d0.f, reason: use source file name */
/* JADX INFO: compiled from: ContentModelParser.java */
/* JADX INFO: loaded from: classes.dex */
public class ContentModelParser {

    /* JADX INFO: renamed from: a */
    public static JsonReader.a f2256a = JsonReader.a.m1394a("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x0205  */
    /* JADX WARN: Code duplicated, block: B:69:0x00de  */
    /* JADX INFO: renamed from: a */
    public static ContentModel m1376a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        String strMo1383b0;
        ContentModel circleShape;
        byte b;
        ShapeTrimPath.a aVar;
        GradientType gradientType = GradientType.LINEAR;
        GradientType gradientType2 = GradientType.RADIAL;
        jsonReader.mo1384c();
        int i = 2;
        int iMo1380O = 2;
        while (true) {
            if (!jsonReader.mo1377B()) {
                strMo1383b0 = null;
                break;
            }
            int iMo1389n0 = jsonReader.mo1389n0(f2256a);
            if (iMo1389n0 == 0) {
                strMo1383b0 = jsonReader.mo1383b0();
                break;
            }
            if (iMo1389n0 != 1) {
                jsonReader.mo1390t0();
                jsonReader.mo1392u0();
            } else {
                iMo1380O = jsonReader.mo1380O();
            }
        }
        if (strMo1383b0 == null) {
            return null;
        }
        switch (strMo1383b0) {
            case "el":
                JsonReader.a aVar2 = CircleShapeParser.f2251a;
                boolean z = iMo1380O == 3;
                String strMo1383b1 = null;
                AnimatableValue<PointF, PointF> animatableValueM1373b = null;
                AnimatablePointValue animatablePointValueM16959z = null;
                boolean zMo1378D = false;
                while (jsonReader.mo1377B()) {
                    int iMo1389n1 = jsonReader.mo1389n0(CircleShapeParser.f2251a);
                    if (iMo1389n1 == 0) {
                        strMo1383b1 = jsonReader.mo1383b0();
                    } else if (iMo1389n1 == 1) {
                        animatableValueM1373b = AnimatablePathValueParser.m1373b(jsonReader, lottieComposition);
                    } else if (iMo1389n1 == 2) {
                        animatablePointValueM16959z = C8462c.m16959z(jsonReader, lottieComposition);
                    } else if (iMo1389n1 == 3) {
                        zMo1378D = jsonReader.mo1378D();
                    } else if (iMo1389n1 != 4) {
                        jsonReader.mo1390t0();
                        jsonReader.mo1392u0();
                    } else {
                        z = jsonReader.mo1380O() == 3;
                    }
                }
                circleShape = new CircleShape(strMo1383b1, animatableValueM1373b, animatablePointValueM16959z, z, zMo1378D);
                break;
            case "fl":
                JsonReader.a aVar3 = ShapeFillParser.f2247a;
                int iMo1380O2 = 1;
                AnimatableIntegerValue animatableIntegerValue = null;
                String strMo1383b2 = null;
                AnimatableColorValue animatableColorValueM16955v = null;
                boolean zMo1378D2 = false;
                boolean zMo1378D3 = false;
                while (jsonReader.mo1377B()) {
                    int iMo1389n2 = jsonReader.mo1389n0(ShapeFillParser.f2247a);
                    if (iMo1389n2 == 0) {
                        strMo1383b2 = jsonReader.mo1383b0();
                    } else if (iMo1389n2 == 1) {
                        animatableColorValueM16955v = C8462c.m16955v(jsonReader, lottieComposition);
                    } else if (iMo1389n2 == 2) {
                        animatableIntegerValue = C8462c.m16958y(jsonReader, lottieComposition);
                    } else if (iMo1389n2 == 3) {
                        zMo1378D2 = jsonReader.mo1378D();
                    } else if (iMo1389n2 == 4) {
                        iMo1380O2 = jsonReader.mo1380O();
                    } else if (iMo1389n2 != 5) {
                        jsonReader.mo1390t0();
                        jsonReader.mo1392u0();
                    } else {
                        zMo1378D3 = jsonReader.mo1378D();
                    }
                }
                if (animatableIntegerValue == null) {
                    animatableIntegerValue = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100)));
                }
                circleShape = new ShapeFill(strMo1383b2, zMo1378D2, iMo1380O2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, animatableColorValueM16955v, animatableIntegerValue, zMo1378D3);
                break;
            case "gf":
                JsonReader.a aVar4 = GradientFillParser.f2294a;
                AnimatableIntegerValue animatableIntegerValueM16958y = null;
                Path.FillType fillType = Path.FillType.WINDING;
                String strMo1383b3 = null;
                GradientType gradientType3 = null;
                AnimatableGradientColorValue animatableGradientColorValue = null;
                AnimatablePointValue animatablePointValueM16959z2 = null;
                AnimatablePointValue animatablePointValueM16959z3 = null;
                boolean zMo1378D4 = false;
                while (jsonReader.mo1377B()) {
                    switch (jsonReader.mo1389n0(GradientFillParser.f2294a)) {
                        case 0:
                            strMo1383b3 = jsonReader.mo1383b0();
                            break;
                        case 1:
                            jsonReader.mo1384c();
                            int iMo1380O3 = -1;
                            while (jsonReader.mo1377B()) {
                                int iMo1389n3 = jsonReader.mo1389n0(GradientFillParser.f2295b);
                                if (iMo1389n3 == 0) {
                                    iMo1380O3 = jsonReader.mo1380O();
                                } else if (iMo1389n3 != 1) {
                                    jsonReader.mo1390t0();
                                    jsonReader.mo1392u0();
                                } else {
                                    animatableGradientColorValue = new AnimatableGradientColorValue(C8462c.m16954u(jsonReader, lottieComposition, new GradientColorParser(iMo1380O3)));
                                }
                            }
                            jsonReader.mo1388h();
                            break;
                        case 2:
                            animatableIntegerValueM16958y = C8462c.m16958y(jsonReader, lottieComposition);
                            break;
                        case 3:
                            gradientType3 = jsonReader.mo1380O() != 1 ? gradientType2 : gradientType;
                            break;
                        case 4:
                            animatablePointValueM16959z2 = C8462c.m16959z(jsonReader, lottieComposition);
                            break;
                        case 5:
                            animatablePointValueM16959z3 = C8462c.m16959z(jsonReader, lottieComposition);
                            break;
                        case 6:
                            fillType = jsonReader.mo1380O() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zMo1378D4 = jsonReader.mo1378D();
                            break;
                        default:
                            jsonReader.mo1390t0();
                            jsonReader.mo1392u0();
                            break;
                    }
                }
                circleShape = new GradientFill(strMo1383b3, gradientType3, fillType, animatableGradientColorValue, animatableIntegerValueM16958y == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : animatableIntegerValueM16958y, animatablePointValueM16959z2, animatablePointValueM16959z3, null, null, zMo1378D4);
                break;
            case "gr":
                JsonReader.a aVar5 = ShapeGroupParser.f2250a;
                ArrayList arrayList = new ArrayList();
                String strMo1383b4 = null;
                boolean zMo1378D5 = false;
                while (jsonReader.mo1377B()) {
                    int iMo1389n4 = jsonReader.mo1389n0(ShapeGroupParser.f2250a);
                    if (iMo1389n4 == 0) {
                        strMo1383b4 = jsonReader.mo1383b0();
                    } else if (iMo1389n4 == 1) {
                        zMo1378D5 = jsonReader.mo1378D();
                    } else if (iMo1389n4 != 2) {
                        jsonReader.mo1392u0();
                    } else {
                        jsonReader.mo1382a();
                        while (jsonReader.mo1377B()) {
                            ContentModel contentModelM1376a = m1376a(jsonReader, lottieComposition);
                            if (contentModelM1376a != null) {
                                arrayList.add(contentModelM1376a);
                            }
                        }
                        jsonReader.mo1385f();
                    }
                }
                circleShape = new ShapeGroup(strMo1383b4, arrayList, zMo1378D5);
                break;
            case "gs":
                JsonReader.a aVar6 = GradientStrokeParser.f2296a;
                ArrayList arrayList2 = new ArrayList();
                AnimatableIntegerValue animatableIntegerValueM16958y2 = null;
                AnimatableGradientColorValue animatableGradientColorValue2 = null;
                AnimatablePointValue animatablePointValueM16959z4 = null;
                AnimatablePointValue animatablePointValueM16959z5 = null;
                AnimatableFloatValue animatableFloatValueM16956w = null;
                ShapeStroke.a aVar7 = null;
                ShapeStroke.b bVar = null;
                AnimatableFloatValue animatableFloatValue = null;
                float fMo1379H = 0.0f;
                boolean zMo1378D6 = false;
                String strMo1383b5 = null;
                GradientType gradientType4 = null;
                while (jsonReader.mo1377B()) {
                    switch (jsonReader.mo1389n0(GradientStrokeParser.f2296a)) {
                        case 0:
                            strMo1383b5 = jsonReader.mo1383b0();
                            break;
                        case 1:
                            jsonReader.mo1384c();
                            int iMo1380O4 = -1;
                            while (jsonReader.mo1377B()) {
                                int iMo1389n5 = jsonReader.mo1389n0(GradientStrokeParser.f2297b);
                                if (iMo1389n5 == 0) {
                                    iMo1380O4 = jsonReader.mo1380O();
                                } else if (iMo1389n5 != 1) {
                                    jsonReader.mo1390t0();
                                    jsonReader.mo1392u0();
                                } else {
                                    animatableGradientColorValue2 = new AnimatableGradientColorValue(C8462c.m16954u(jsonReader, lottieComposition, new GradientColorParser(iMo1380O4)));
                                }
                            }
                            jsonReader.mo1388h();
                            break;
                        case 2:
                            animatableIntegerValueM16958y2 = C8462c.m16958y(jsonReader, lottieComposition);
                            break;
                        case 3:
                            gradientType4 = jsonReader.mo1380O() != 1 ? gradientType2 : gradientType;
                            break;
                        case 4:
                            animatablePointValueM16959z4 = C8462c.m16959z(jsonReader, lottieComposition);
                            break;
                        case 5:
                            animatablePointValueM16959z5 = C8462c.m16959z(jsonReader, lottieComposition);
                            break;
                        case 6:
                            animatableFloatValueM16956w = C8462c.m16956w(jsonReader, lottieComposition);
                            break;
                        case 7:
                            aVar7 = ShapeStroke.a.values()[jsonReader.mo1380O() - 1];
                            break;
                        case 8:
                            bVar = ShapeStroke.b.values()[jsonReader.mo1380O() - 1];
                            break;
                        case 9:
                            fMo1379H = (float) jsonReader.mo1379H();
                            break;
                        case 10:
                            zMo1378D6 = jsonReader.mo1378D();
                            break;
                        case 11:
                            jsonReader.mo1382a();
                            while (jsonReader.mo1377B()) {
                                jsonReader.mo1384c();
                                AnimatableFloatValue animatableFloatValueM16956w2 = null;
                                String strMo1383b6 = null;
                                while (jsonReader.mo1377B()) {
                                    int iMo1389n6 = jsonReader.mo1389n0(GradientStrokeParser.f2298c);
                                    if (iMo1389n6 == 0) {
                                        strMo1383b6 = jsonReader.mo1383b0();
                                    } else if (iMo1389n6 != 1) {
                                        jsonReader.mo1390t0();
                                        jsonReader.mo1392u0();
                                    } else {
                                        animatableFloatValueM16956w2 = C8462c.m16956w(jsonReader, lottieComposition);
                                    }
                                }
                                jsonReader.mo1388h();
                                if (strMo1383b6.equals("o")) {
                                    animatableFloatValue = animatableFloatValueM16956w2;
                                } else if (strMo1383b6.equals("d") || strMo1383b6.equals("g")) {
                                    lottieComposition.f2356n = true;
                                    arrayList2.add(animatableFloatValueM16956w2);
                                }
                            }
                            jsonReader.mo1385f();
                            if (arrayList2.size() == 1) {
                                arrayList2.add(arrayList2.get(0));
                            }
                            break;
                        default:
                            jsonReader.mo1390t0();
                            jsonReader.mo1392u0();
                            break;
                    }
                }
                circleShape = new GradientStroke(strMo1383b5, gradientType4, animatableGradientColorValue2, animatableIntegerValueM16958y2 == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : animatableIntegerValueM16958y2, animatablePointValueM16959z4, animatablePointValueM16959z5, animatableFloatValueM16956w, aVar7, bVar, fMo1379H, arrayList2, animatableFloatValue, zMo1378D6);
                break;
            case "mm":
                JsonReader.a aVar8 = MergePathsParser.f2312a;
                MergePaths.a aVar9 = null;
                String strMo1383b7 = null;
                boolean zMo1378D7 = false;
                while (jsonReader.mo1377B()) {
                    int iMo1389n7 = jsonReader.mo1389n0(MergePathsParser.f2312a);
                    if (iMo1389n7 == 0) {
                        strMo1383b7 = jsonReader.mo1383b0();
                    } else if (iMo1389n7 == 1) {
                        int iMo1380O5 = jsonReader.mo1380O();
                        MergePaths.a aVar10 = MergePaths.a.MERGE;
                        if (iMo1380O5 != 1) {
                            if (iMo1380O5 == 2) {
                                aVar9 = MergePaths.a.ADD;
                            } else if (iMo1380O5 == 3) {
                                aVar9 = MergePaths.a.SUBTRACT;
                            } else if (iMo1380O5 == 4) {
                                aVar9 = MergePaths.a.INTERSECT;
                            } else if (iMo1380O5 == 5) {
                                aVar9 = MergePaths.a.EXCLUDE_INTERSECTIONS;
                            }
                        }
                        aVar9 = aVar10;
                    } else if (iMo1389n7 != 2) {
                        jsonReader.mo1390t0();
                        jsonReader.mo1392u0();
                    } else {
                        zMo1378D7 = jsonReader.mo1378D();
                    }
                }
                MergePaths mergePaths = new MergePaths(strMo1383b7, aVar9, zMo1378D7);
                lottieComposition.m1443a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                circleShape = mergePaths;
                break;
            case "rc":
                JsonReader.a aVar11 = RectangleShapeParser.f2316a;
                String strMo1383b8 = null;
                AnimatableValue<PointF, PointF> animatableValueM1373b2 = null;
                AnimatablePointValue animatablePointValueM16959z6 = null;
                AnimatableFloatValue animatableFloatValueM16956w3 = null;
                boolean zMo1378D8 = false;
                while (jsonReader.mo1377B()) {
                    int iMo1389n8 = jsonReader.mo1389n0(RectangleShapeParser.f2316a);
                    if (iMo1389n8 == 0) {
                        strMo1383b8 = jsonReader.mo1383b0();
                    } else if (iMo1389n8 == 1) {
                        animatableValueM1373b2 = AnimatablePathValueParser.m1373b(jsonReader, lottieComposition);
                    } else if (iMo1389n8 == 2) {
                        animatablePointValueM16959z6 = C8462c.m16959z(jsonReader, lottieComposition);
                    } else if (iMo1389n8 == 3) {
                        animatableFloatValueM16956w3 = C8462c.m16956w(jsonReader, lottieComposition);
                    } else if (iMo1389n8 != 4) {
                        jsonReader.mo1392u0();
                    } else {
                        zMo1378D8 = jsonReader.mo1378D();
                    }
                }
                circleShape = new RectangleShape(strMo1383b8, animatableValueM1373b2, animatablePointValueM16959z6, animatableFloatValueM16956w3, zMo1378D8);
                break;
            case "rp":
                JsonReader.a aVar12 = RepeaterParser.f2317a;
                String strMo1383b9 = null;
                AnimatableFloatValue animatableFloatValueM16957x = null;
                AnimatableFloatValue animatableFloatValueM16957x2 = null;
                AnimatableTransform animatableTransformM1375a = null;
                boolean zMo1378D9 = false;
                while (jsonReader.mo1377B()) {
                    int iMo1389n9 = jsonReader.mo1389n0(RepeaterParser.f2317a);
                    if (iMo1389n9 == 0) {
                        strMo1383b9 = jsonReader.mo1383b0();
                    } else if (iMo1389n9 == 1) {
                        animatableFloatValueM16957x = C8462c.m16957x(jsonReader, lottieComposition, false);
                    } else if (iMo1389n9 == 2) {
                        animatableFloatValueM16957x2 = C8462c.m16957x(jsonReader, lottieComposition, false);
                    } else if (iMo1389n9 == 3) {
                        animatableTransformM1375a = AnimatableTransformParser.m1375a(jsonReader, lottieComposition);
                    } else if (iMo1389n9 != 4) {
                        jsonReader.mo1392u0();
                    } else {
                        zMo1378D9 = jsonReader.mo1378D();
                    }
                }
                circleShape = new Repeater3(strMo1383b9, animatableFloatValueM16957x, animatableFloatValueM16957x2, animatableTransformM1375a, zMo1378D9);
                break;
            case "sh":
                JsonReader.a aVar13 = ShapePathParser.f2252a;
                AnimatableShapeValue animatableShapeValue = null;
                boolean zMo1378D10 = false;
                String strMo1383b10 = null;
                int iMo1380O6 = 0;
                while (jsonReader.mo1377B()) {
                    int iMo1389n10 = jsonReader.mo1389n0(ShapePathParser.f2252a);
                    if (iMo1389n10 == 0) {
                        strMo1383b10 = jsonReader.mo1383b0();
                    } else if (iMo1389n10 == 1) {
                        iMo1380O6 = jsonReader.mo1380O();
                    } else if (iMo1389n10 == 2) {
                        animatableShapeValue = new AnimatableShapeValue(KeyframesParser.m1410a(jsonReader, lottieComposition, Utils.m1439c(), ShapeDataParser.f2243a));
                    } else if (iMo1389n10 != 3) {
                        jsonReader.mo1392u0();
                    } else {
                        zMo1378D10 = jsonReader.mo1378D();
                    }
                }
                circleShape = new ShapePath(strMo1383b10, iMo1380O6, animatableShapeValue, zMo1378D10);
                break;
            case "sr":
                JsonReader.a aVar14 = PolystarShapeParser.f2315a;
                String strMo1383b11 = null;
                PolystarShape.a aVar15 = null;
                AnimatableFloatValue animatableFloatValueM16957x3 = null;
                AnimatableValue<PointF, PointF> animatableValueM1373b3 = null;
                AnimatableFloatValue animatableFloatValueM16957x4 = null;
                AnimatableFloatValue animatableFloatValueM16956w4 = null;
                AnimatableFloatValue animatableFloatValueM16956w5 = null;
                AnimatableFloatValue animatableFloatValueM16957x5 = null;
                AnimatableFloatValue animatableFloatValueM16957x6 = null;
                boolean zMo1378D11 = false;
                while (jsonReader.mo1377B()) {
                    switch (jsonReader.mo1389n0(PolystarShapeParser.f2315a)) {
                        case 0:
                            strMo1383b11 = jsonReader.mo1383b0();
                            break;
                        case 1:
                            int iMo1380O7 = jsonReader.mo1380O();
                            PolystarShape.a[] aVarArrValues = PolystarShape.a.values();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= i) {
                                    aVar15 = null;
                                } else {
                                    PolystarShape.a aVar16 = aVarArrValues[i2];
                                    if (aVar16.f2081i == iMo1380O7) {
                                        aVar15 = aVar16;
                                    } else {
                                        i2++;
                                        i = 2;
                                    }
                                }
                                break;
                            }
                            break;
                        case 2:
                            animatableFloatValueM16957x3 = C8462c.m16957x(jsonReader, lottieComposition, false);
                            continue;
                        case 3:
                            animatableValueM1373b3 = AnimatablePathValueParser.m1373b(jsonReader, lottieComposition);
                            continue;
                        case 4:
                            animatableFloatValueM16957x4 = C8462c.m16957x(jsonReader, lottieComposition, false);
                            continue;
                        case 5:
                            animatableFloatValueM16956w5 = C8462c.m16956w(jsonReader, lottieComposition);
                            continue;
                        case 6:
                            animatableFloatValueM16957x6 = C8462c.m16957x(jsonReader, lottieComposition, false);
                            continue;
                        case 7:
                            animatableFloatValueM16956w4 = C8462c.m16956w(jsonReader, lottieComposition);
                            continue;
                        case 8:
                            animatableFloatValueM16957x5 = C8462c.m16957x(jsonReader, lottieComposition, false);
                            continue;
                        case 9:
                            zMo1378D11 = jsonReader.mo1378D();
                            continue;
                        default:
                            jsonReader.mo1390t0();
                            jsonReader.mo1392u0();
                            break;
                    }
                    i = 2;
                }
                circleShape = new PolystarShape(strMo1383b11, aVar15, animatableFloatValueM16957x3, animatableValueM1373b3, animatableFloatValueM16957x4, animatableFloatValueM16956w4, animatableFloatValueM16956w5, animatableFloatValueM16957x5, animatableFloatValueM16957x6, zMo1378D11);
                break;
            case "st":
                JsonReader.a aVar17 = ShapeStrokeParser.f2254a;
                ArrayList arrayList3 = new ArrayList();
                AnimatableIntegerValue animatableIntegerValueM16958y3 = null;
                String strMo1383b12 = null;
                AnimatableFloatValue animatableFloatValue2 = null;
                AnimatableColorValue animatableColorValueM16955v2 = null;
                AnimatableFloatValue animatableFloatValueM16956w6 = null;
                ShapeStroke.a aVar18 = null;
                ShapeStroke.b bVar2 = null;
                float fMo1379H2 = 0.0f;
                boolean zMo1378D12 = false;
                while (jsonReader.mo1377B()) {
                    switch (jsonReader.mo1389n0(ShapeStrokeParser.f2254a)) {
                        case 0:
                            strMo1383b12 = jsonReader.mo1383b0();
                            break;
                        case 1:
                            animatableColorValueM16955v2 = C8462c.m16955v(jsonReader, lottieComposition);
                            break;
                        case 2:
                            animatableFloatValueM16956w6 = C8462c.m16956w(jsonReader, lottieComposition);
                            break;
                        case 3:
                            animatableIntegerValueM16958y3 = C8462c.m16958y(jsonReader, lottieComposition);
                            break;
                        case 4:
                            aVar18 = ShapeStroke.a.values()[jsonReader.mo1380O() - 1];
                            break;
                        case 5:
                            bVar2 = ShapeStroke.b.values()[jsonReader.mo1380O() - 1];
                            break;
                        case 6:
                            fMo1379H2 = (float) jsonReader.mo1379H();
                            break;
                        case 7:
                            zMo1378D12 = jsonReader.mo1378D();
                            break;
                        case 8:
                            jsonReader.mo1382a();
                            while (jsonReader.mo1377B()) {
                                jsonReader.mo1384c();
                                AnimatableFloatValue animatableFloatValueM16956w7 = null;
                                String strMo1383b13 = null;
                                while (jsonReader.mo1377B()) {
                                    int iMo1389n11 = jsonReader.mo1389n0(ShapeStrokeParser.f2255b);
                                    if (iMo1389n11 == 0) {
                                        strMo1383b13 = jsonReader.mo1383b0();
                                    } else if (iMo1389n11 != 1) {
                                        jsonReader.mo1390t0();
                                        jsonReader.mo1392u0();
                                    } else {
                                        animatableFloatValueM16956w7 = C8462c.m16956w(jsonReader, lottieComposition);
                                    }
                                }
                                jsonReader.mo1388h();
                                strMo1383b13.hashCode();
                                int iHashCode = strMo1383b13.hashCode();
                                if (iHashCode != 100) {
                                    if (iHashCode != 103) {
                                        if (iHashCode == 111 && strMo1383b13.equals("o")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strMo1383b13.equals("g")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strMo1383b13.equals("d")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                if (b == 0 || b == 1) {
                                    lottieComposition.f2356n = true;
                                    arrayList3.add(animatableFloatValueM16956w7);
                                } else if (b == 2) {
                                    animatableFloatValue2 = animatableFloatValueM16956w7;
                                }
                            }
                            jsonReader.mo1385f();
                            if (arrayList3.size() == 1) {
                                arrayList3.add(arrayList3.get(0));
                            }
                            break;
                        default:
                            jsonReader.mo1392u0();
                            break;
                    }
                }
                circleShape = new ShapeStroke(strMo1383b12, animatableFloatValue2, arrayList3, animatableColorValueM16955v2, animatableIntegerValueM16958y3 == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : animatableIntegerValueM16958y3, animatableFloatValueM16956w6, aVar18, bVar2, fMo1379H2, zMo1378D12);
                break;
            case "tm":
                JsonReader.a aVar19 = ShapeTrimPathParser.f2257a;
                String strMo1383b14 = null;
                ShapeTrimPath.a aVar20 = null;
                AnimatableFloatValue animatableFloatValueM16957x7 = null;
                AnimatableFloatValue animatableFloatValueM16957x8 = null;
                AnimatableFloatValue animatableFloatValueM16957x9 = null;
                boolean zMo1378D13 = false;
                while (jsonReader.mo1377B()) {
                    int iMo1389n12 = jsonReader.mo1389n0(ShapeTrimPathParser.f2257a);
                    if (iMo1389n12 == 0) {
                        animatableFloatValueM16957x7 = C8462c.m16957x(jsonReader, lottieComposition, false);
                    } else if (iMo1389n12 == 1) {
                        animatableFloatValueM16957x8 = C8462c.m16957x(jsonReader, lottieComposition, false);
                    } else if (iMo1389n12 == 2) {
                        animatableFloatValueM16957x9 = C8462c.m16957x(jsonReader, lottieComposition, false);
                    } else if (iMo1389n12 == 3) {
                        strMo1383b14 = jsonReader.mo1383b0();
                    } else if (iMo1389n12 == 4) {
                        int iMo1380O8 = jsonReader.mo1380O();
                        if (iMo1380O8 == 1) {
                            aVar = ShapeTrimPath.a.SIMULTANEOUSLY;
                        } else {
                            if (iMo1380O8 != 2) {
                                throw new IllegalArgumentException(outline.m1590l("Unknown trim path type ", iMo1380O8));
                            }
                            aVar = ShapeTrimPath.a.INDIVIDUALLY;
                        }
                        aVar20 = aVar;
                    } else if (iMo1389n12 != 5) {
                        jsonReader.mo1392u0();
                    } else {
                        zMo1378D13 = jsonReader.mo1378D();
                    }
                }
                circleShape = new ShapeTrimPath(strMo1383b14, aVar20, animatableFloatValueM16957x7, animatableFloatValueM16957x8, animatableFloatValueM16957x9, zMo1378D13);
                break;
            case "tr":
                circleShape = AnimatableTransformParser.m1375a(jsonReader, lottieComposition);
                break;
            default:
                Logger2.m1420b("Unknown shape type " + strMo1383b0);
                circleShape = null;
                break;
        }
        while (jsonReader.mo1377B()) {
            jsonReader.mo1392u0();
        }
        jsonReader.mo1388h();
        return circleShape;
    }
}
