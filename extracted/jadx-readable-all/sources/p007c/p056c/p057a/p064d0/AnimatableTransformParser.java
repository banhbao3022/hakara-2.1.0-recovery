package p007c.p056c.p057a.p064d0;

import android.graphics.PointF;
import java.io.IOException;
import java.util.List;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatablePathValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableScaleValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableSplitDimensionPathValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p060j.AnimatableValue;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.ScaleXY;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.c.a.d0.c, reason: use source file name */
/* JADX INFO: compiled from: AnimatableTransformParser.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableTransformParser {

    /* JADX INFO: renamed from: a */
    public static JsonReader.a f2248a = JsonReader.a.m1394a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b */
    public static JsonReader.a f2249b = JsonReader.a.m1394a("k");

    /* JADX WARN: Code duplicated, block: B:113:0x0219  */
    /* JADX WARN: Code duplicated, block: B:114:0x021c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c5  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: a */
    public static AnimatableTransform m1375a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        boolean z;
        AnimatableFloatValue animatableFloatValue;
        boolean z2;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableScaleValue animatableScaleValue;
        AnimatableFloatValue animatableFloatValue3;
        AnimatableValue<PointF, PointF> animatableValue;
        AnimatableFloatValue animatableFloatValueM16957x;
        AnimatableFloatValue animatableFloatValue4;
        boolean z3 = false;
        boolean z4 = jsonReader.mo1386f0() == JsonReader.b.BEGIN_OBJECT;
        if (z4) {
            jsonReader.mo1384c();
        }
        AnimatableFloatValue animatableFloatValue5 = null;
        AnimatableScaleValue animatableScaleValue2 = null;
        AnimatableValue<PointF, PointF> animatableValueM1373b = null;
        AnimatableFloatValue animatableFloatValueM16957x2 = null;
        AnimatableFloatValue animatableFloatValueM16957x3 = null;
        AnimatablePathValue animatablePathValueM1372a = null;
        AnimatableIntegerValue animatableIntegerValueM16958y = null;
        AnimatableFloatValue animatableFloatValueM16957x4 = null;
        AnimatableFloatValue animatableFloatValueM16957x5 = null;
        while (jsonReader.mo1377B()) {
            switch (jsonReader.mo1389n0(f2248a)) {
                case 0:
                    animatableScaleValue = animatableScaleValue2;
                    animatableFloatValue3 = animatableFloatValueM16957x2;
                    animatableValue = animatableValueM1373b;
                    jsonReader.mo1384c();
                    while (jsonReader.mo1377B()) {
                        if (jsonReader.mo1389n0(f2249b) != 0) {
                            jsonReader.mo1390t0();
                            jsonReader.mo1392u0();
                        } else {
                            animatablePathValueM1372a = AnimatablePathValueParser.m1372a(jsonReader, lottieComposition);
                        }
                    }
                    jsonReader.mo1388h();
                    animatableScaleValue2 = animatableScaleValue;
                    animatableValueM1373b = animatableValue;
                    animatableFloatValueM16957x2 = animatableFloatValue3;
                    z3 = false;
                    break;
                case 1:
                    animatableFloatValue3 = animatableFloatValueM16957x2;
                    animatableValueM1373b = AnimatablePathValueParser.m1373b(jsonReader, lottieComposition);
                    animatableFloatValueM16957x2 = animatableFloatValue3;
                    z3 = false;
                    break;
                case 2:
                    animatableFloatValue3 = animatableFloatValueM16957x2;
                    animatableValue = animatableValueM1373b;
                    animatableScaleValue2 = new AnimatableScaleValue((List<Keyframe<ScaleXY>>) C8462c.m16954u(jsonReader, lottieComposition, ScaleXYParser.f2318a));
                    animatableValueM1373b = animatableValue;
                    animatableFloatValueM16957x2 = animatableFloatValue3;
                    z3 = false;
                    break;
                case 3:
                    lottieComposition.m1443a("Lottie doesn't support 3D layers.");
                    animatableFloatValueM16957x = C8462c.m16957x(jsonReader, lottieComposition, z3);
                    if (animatableFloatValueM16957x.f2018a.isEmpty()) {
                        animatableFloatValue4 = animatableFloatValueM16957x;
                        animatableScaleValue = animatableScaleValue2;
                        animatableFloatValue3 = animatableFloatValueM16957x2;
                        animatableValue = animatableValueM1373b;
                        animatableFloatValueM16957x.f2018a.add((Keyframe<V>) new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.f2354l)));
                    } else {
                        animatableFloatValue4 = animatableFloatValueM16957x;
                        animatableScaleValue = animatableScaleValue2;
                        animatableFloatValue3 = animatableFloatValueM16957x2;
                        animatableValue = animatableValueM1373b;
                        if (((Keyframe) animatableFloatValue4.f2018a.get(0)).f2359b == 0) {
                            animatableFloatValue4.f2018a.set(0, (Keyframe<V>) new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.f2354l)));
                        }
                    }
                    animatableFloatValue5 = animatableFloatValue4;
                    animatableScaleValue2 = animatableScaleValue;
                    animatableValueM1373b = animatableValue;
                    animatableFloatValueM16957x2 = animatableFloatValue3;
                    z3 = false;
                    break;
                case 4:
                    animatableFloatValueM16957x = C8462c.m16957x(jsonReader, lottieComposition, z3);
                    if (animatableFloatValueM16957x.f2018a.isEmpty()) {
                        animatableFloatValue4 = animatableFloatValueM16957x;
                        animatableScaleValue = animatableScaleValue2;
                        animatableFloatValue3 = animatableFloatValueM16957x2;
                        animatableValue = animatableValueM1373b;
                        animatableFloatValueM16957x.f2018a.add((Keyframe<V>) new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.f2354l)));
                    } else {
                        animatableFloatValue4 = animatableFloatValueM16957x;
                        animatableScaleValue = animatableScaleValue2;
                        animatableFloatValue3 = animatableFloatValueM16957x2;
                        animatableValue = animatableValueM1373b;
                        if (((Keyframe) animatableFloatValue4.f2018a.get(0)).f2359b == 0) {
                            animatableFloatValue4.f2018a.set(0, (Keyframe<V>) new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.f2354l)));
                        }
                    }
                    animatableFloatValue5 = animatableFloatValue4;
                    animatableScaleValue2 = animatableScaleValue;
                    animatableValueM1373b = animatableValue;
                    animatableFloatValueM16957x2 = animatableFloatValue3;
                    z3 = false;
                    break;
                case 5:
                    animatableIntegerValueM16958y = C8462c.m16958y(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValueM16957x4 = C8462c.m16957x(jsonReader, lottieComposition, z3);
                    break;
                case 7:
                    animatableFloatValueM16957x5 = C8462c.m16957x(jsonReader, lottieComposition, z3);
                    break;
                case 8:
                    animatableFloatValueM16957x3 = C8462c.m16957x(jsonReader, lottieComposition, z3);
                    break;
                case 9:
                    animatableFloatValueM16957x2 = C8462c.m16957x(jsonReader, lottieComposition, z3);
                    break;
                default:
                    animatableFloatValue3 = animatableFloatValueM16957x2;
                    jsonReader.mo1390t0();
                    jsonReader.mo1392u0();
                    animatableFloatValueM16957x2 = animatableFloatValue3;
                    z3 = false;
                    break;
            }
        }
        AnimatableScaleValue animatableScaleValue3 = animatableScaleValue2;
        AnimatableFloatValue animatableFloatValue6 = animatableFloatValueM16957x2;
        AnimatableValue<PointF, PointF> animatableValue2 = animatableValueM1373b;
        if (z4) {
            jsonReader.mo1388h();
        }
        if (animatablePathValueM1372a == null || (animatablePathValueM1372a.mo1341c() && animatablePathValueM1372a.f2002a.get(0).f2359b.equals(0.0f, 0.0f))) {
            animatablePathValueM1372a = null;
        }
        if (animatableValue2 == null || (!(animatableValue2 instanceof AnimatableSplitDimensionPathValue) && animatableValue2.mo1341c() && animatableValue2.mo1340b().get(0).f2359b.equals(0.0f, 0.0f))) {
            animatableValue2 = null;
        }
        AnimatableFloatValue animatableFloatValue7 = animatableFloatValue5 == null || (animatableFloatValue5.mo1341c() && (((Float) ((Keyframe) animatableFloatValue5.f2018a.get(0)).f2359b).floatValue() > 0.0f ? 1 : (((Float) ((Keyframe) animatableFloatValue5.f2018a.get(0)).f2359b).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : animatableFloatValue5;
        if (animatableScaleValue3 != 0) {
            if (animatableScaleValue3.mo1341c()) {
                ScaleXY scaleXY = (ScaleXY) ((Keyframe) animatableScaleValue3.f2018a.get(0)).f2359b;
                z = (scaleXY.f2376a > 1.0f ? 1 : (scaleXY.f2376a == 1.0f ? 0 : -1)) == 0 && (scaleXY.f2377b > 1.0f ? 1 : (scaleXY.f2377b == 1.0f ? 0 : -1)) == 0;
            }
        }
        AnimatableScaleValue animatableScaleValue4 = z ? null : animatableScaleValue3;
        if (animatableFloatValueM16957x3 == null || (animatableFloatValueM16957x3.mo1341c() && ((Float) ((Keyframe) animatableFloatValueM16957x3.f2018a.get(0)).f2359b).floatValue() == 0.0f)) {
            animatableFloatValueM16957x3 = null;
        }
        if (animatableFloatValue6 != null) {
            animatableFloatValue = animatableFloatValue6;
            z2 = animatableFloatValue6.mo1341c() && ((Float) ((Keyframe) animatableFloatValue.f2018a.get(0)).f2359b).floatValue() == 0.0f;
            if (z2) {
                animatableFloatValue2 = null;
            } else {
                animatableFloatValue2 = animatableFloatValue;
            }
            return new AnimatableTransform(animatablePathValueM1372a, animatableValue2, animatableScaleValue4, animatableFloatValue7, animatableIntegerValueM16958y, animatableFloatValueM16957x4, animatableFloatValueM16957x5, animatableFloatValueM16957x3, animatableFloatValue2);
        }
        animatableFloatValue = animatableFloatValue6;
        if (z2) {
            animatableFloatValue2 = null;
        } else {
            animatableFloatValue2 = animatableFloatValue;
        }
        return new AnimatableTransform(animatablePathValueM1372a, animatableValue2, animatableScaleValue4, animatableFloatValue7, animatableIntegerValueM16958y, animatableFloatValueM16957x4, animatableFloatValueM16957x5, animatableFloatValueM16957x3, animatableFloatValue2);
    }
}
