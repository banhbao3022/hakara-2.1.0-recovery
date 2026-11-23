package p636z0.p688f0.p689a.p690a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.C8162a;
import p636z0.p725k.p729e.PathParser2;

/* JADX INFO: renamed from: z0.f0.a.a.c, reason: use source file name */
/* JADX INFO: compiled from: AnimatorInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatorInflaterCompat {

    /* JADX INFO: renamed from: z0.f0.a.a.c$a */
    /* JADX INFO: compiled from: AnimatorInflaterCompat.java */
    public static class a implements TypeEvaluator<PathParser2[]> {

        /* JADX INFO: renamed from: a */
        public PathParser2[] f36547a;

        @Override // android.animation.TypeEvaluator
        public PathParser2[] evaluate(float f, PathParser2[] pathParser2Arr, PathParser2[] pathParser2Arr2) {
            PathParser2[] pathParser2Arr3 = pathParser2Arr;
            PathParser2[] pathParser2Arr4 = pathParser2Arr2;
            if (!C8162a.m16059d(pathParser2Arr3, pathParser2Arr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C8162a.m16059d(this.f36547a, pathParser2Arr3)) {
                this.f36547a = C8162a.m16073r(pathParser2Arr3);
            }
            for (int i = 0; i < pathParser2Arr3.length; i++) {
                PathParser2 pathParser2 = this.f36547a[i];
                PathParser2 pathParser3 = pathParser2Arr3[i];
                PathParser2 pathParser4 = pathParser2Arr4[i];
                Objects.requireNonNull(pathParser2);
                pathParser2.f37855a = pathParser3.f37855a;
                int i2 = 0;
                while (true) {
                    float[] fArr = pathParser3.f37856b;
                    if (i2 < fArr.length) {
                        pathParser2.f37856b[i2] = (pathParser4.f37856b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.f36547a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Animator m15549a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        String str;
        PropertyValuesHolder propertyValuesHolderM15551c;
        int size;
        Keyframe keyframeOfFloat;
        resources = resources;
        theme = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int depth = xmlPullParser.getDepth();
        Animator animatorM15553e = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i2 = 3;
            boolean z = false;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i3 = 1;
            if (next == 1) {
                break;
            }
            int i4 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    m15553e(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
                    animatorM15553e = objectAnimator;
                } else if (name.equals("animator")) {
                    animatorM15553e = m15553e(context, resources, theme, attributeSet, null, f, xmlPullParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray typedArrayM16038I = C8162a.m16038I(resources, theme, attributeSet, AndroidResources.f36531h);
                    m15549a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, !C8162a.m16033D(xmlPullParser2, "ordering") ? 0 : typedArrayM16038I.getInt(0, 0), f);
                    typedArrayM16038I.recycle();
                    animatorM15553e = animatorSet2;
                } else {
                    String str2 = "propertyValuesHolder";
                    if (!name.equals("propertyValuesHolder")) {
                        StringBuilder sbM1556G = outline.m1556G("Unknown animator name: ");
                        sbM1556G.append(xmlPullParser.getName());
                        throw new RuntimeException(sbM1556G.toString());
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    ArrayList arrayList2 = null;
                    while (true) {
                        int eventType = xmlPullParser.getEventType();
                        if (eventType == i2 || eventType == i3) {
                            break;
                        }
                        if (eventType != i4) {
                            xmlPullParser.next();
                        } else {
                            if (xmlPullParser.getName().equals(str2)) {
                                TypedArray typedArrayM16038I2 = C8162a.m16038I(resources, theme, attributeSetAsAttributeSet, AndroidResources.f36532i);
                                String strM16079x = C8162a.m16079x(typedArrayM16038I2, xmlPullParser2, "propertyName", i2);
                                int i5 = !C8162a.m16033D(xmlPullParser2, "valueType") ? 4 : typedArrayM16038I2.getInt(i4, 4);
                                ArrayList arrayList3 = null;
                                int i6 = i5;
                                while (true) {
                                    int next2 = xmlPullParser.next();
                                    if (next2 == i2) {
                                        break;
                                    }
                                    int i7 = i2;
                                    if (next2 == 1) {
                                        break;
                                    }
                                    if (xmlPullParser.getName().equals("keyframe")) {
                                        if (i6 == 4) {
                                            TypedArray typedArrayM16038I3 = C8162a.m16038I(resources, theme, Xml.asAttributeSet(xmlPullParser), AndroidResources.f36533j);
                                            TypedValue typedValuePeekValue = !C8162a.m16033D(xmlPullParser2, "value") ? null : typedArrayM16038I3.peekValue(0);
                                            i6 = ((typedValuePeekValue != null) && m15552d(typedValuePeekValue.type)) ? 3 : 0;
                                            typedArrayM16038I3.recycle();
                                        }
                                        String str3 = str2;
                                        TypedArray typedArrayM16038I4 = C8162a.m16038I(resources, theme, Xml.asAttributeSet(xmlPullParser), AndroidResources.f36533j);
                                        float f2 = C8162a.m16033D(xmlPullParser2, "fraction") ? typedArrayM16038I4.getFloat(3, -1.0f) : -1.0f;
                                        TypedValue typedValuePeekValue2 = !C8162a.m16033D(xmlPullParser2, "value") ? null : typedArrayM16038I4.peekValue(0);
                                        boolean z2 = typedValuePeekValue2 != null;
                                        int i8 = i6 == 4 ? (z2 && m15552d(typedValuePeekValue2.type)) ? 3 : 0 : i6;
                                        if (!z2) {
                                            keyframeOfFloat = i8 == 0 ? Keyframe.ofFloat(f2) : Keyframe.ofInt(f2);
                                        } else if (i8 == 0) {
                                            keyframeOfFloat = Keyframe.ofFloat(f2, !C8162a.m16033D(xmlPullParser2, "value") ? 0.0f : typedArrayM16038I4.getFloat(0, 0.0f));
                                        } else if (i8 == 1 || i8 == 3) {
                                            keyframeOfFloat = Keyframe.ofInt(f2, !C8162a.m16033D(xmlPullParser2, "value") ? 0 : typedArrayM16038I4.getInt(0, 0));
                                        } else {
                                            keyframeOfFloat = null;
                                        }
                                        int resourceId = !C8162a.m16033D(xmlPullParser2, "interpolator") ? 0 : typedArrayM16038I4.getResourceId(1, 0);
                                        if (resourceId > 0) {
                                            keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                        }
                                        typedArrayM16038I4.recycle();
                                        if (keyframeOfFloat != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(keyframeOfFloat);
                                        }
                                        xmlPullParser.next();
                                        i2 = 3;
                                        str2 = str3;
                                    } else {
                                        i2 = i7;
                                    }
                                }
                                str = str2;
                                if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                    i2 = 3;
                                    propertyValuesHolderM15551c = null;
                                } else {
                                    Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                    Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                    float fraction = keyframe2.getFraction();
                                    if (fraction < 1.0f) {
                                        if (fraction < 0.0f) {
                                            keyframe2.setFraction(1.0f);
                                        } else {
                                            arrayList3.add(arrayList3.size(), m15550b(keyframe2, 1.0f));
                                            size++;
                                        }
                                    }
                                    float fraction2 = keyframe.getFraction();
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe.setFraction(0.0f);
                                        } else {
                                            arrayList3.add(0, m15550b(keyframe, 0.0f));
                                            size++;
                                        }
                                    }
                                    Keyframe[] keyframeArr = new Keyframe[size];
                                    arrayList3.toArray(keyframeArr);
                                    int i9 = 0;
                                    while (i9 < size) {
                                        Keyframe keyframe3 = keyframeArr[i9];
                                        if (keyframe3.getFraction() < 0.0f) {
                                            if (i9 == 0) {
                                                keyframe3.setFraction(0.0f);
                                            } else {
                                                int i10 = size - 1;
                                                if (i9 == i10) {
                                                    keyframe3.setFraction(1.0f);
                                                } else {
                                                    int i11 = i9;
                                                    for (int i12 = i9 + 1; i12 < i10 && keyframeArr[i12].getFraction() < 0.0f; i12++) {
                                                        i11 = i12;
                                                    }
                                                    float fraction3 = (keyframeArr[i11 + 1].getFraction() - keyframeArr[i9 - 1].getFraction()) / ((i11 - i9) + 2);
                                                    int i13 = i9;
                                                    while (i13 <= i11) {
                                                        keyframeArr[i13].setFraction(keyframeArr[i13 - 1].getFraction() + fraction3);
                                                        i13++;
                                                        size = size;
                                                    }
                                                }
                                            }
                                        }
                                        i9++;
                                        size = size;
                                    }
                                    propertyValuesHolderM15551c = PropertyValuesHolder.ofKeyframe(strM16079x, keyframeArr);
                                    i2 = 3;
                                    if (i6 == 3) {
                                        propertyValuesHolderM15551c.setEvaluator(ArgbEvaluator.f36548a);
                                    }
                                }
                                if (propertyValuesHolderM15551c == null) {
                                    propertyValuesHolderM15551c = m15551c(typedArrayM16038I2, i5, 0, 1, strM16079x);
                                }
                                if (propertyValuesHolderM15551c != null) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(propertyValuesHolderM15551c);
                                }
                                typedArrayM16038I2.recycle();
                                i3 = 1;
                            } else {
                                str = str2;
                            }
                            xmlPullParser.next();
                            i4 = 2;
                            resources = resources;
                            theme = theme;
                            xmlPullParser2 = xmlPullParser;
                            attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                            str2 = str;
                        }
                    }
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        propertyValuesHolderArr = new PropertyValuesHolder[size2];
                        for (int i14 = 0; i14 < size2; i14++) {
                            propertyValuesHolderArr[i14] = (PropertyValuesHolder) arrayList2.get(i14);
                        }
                    } else {
                        propertyValuesHolderArr = null;
                    }
                    if (propertyValuesHolderArr != null && (animatorM15553e instanceof ValueAnimator)) {
                        ((ValueAnimator) animatorM15553e).setValues(propertyValuesHolderArr);
                    }
                    z = true;
                }
                if (animatorSet != null && !z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animatorM15553e);
                }
                resources = resources;
                theme = theme;
                xmlPullParser2 = xmlPullParser;
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                animatorArr[i15] = (Animator) it.next();
                i15++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animatorM15553e;
    }

    /* JADX INFO: renamed from: b */
    public static Keyframe m15550b(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        return keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* JADX INFO: renamed from: c */
    public static PropertyValuesHolder m15551c(TypedArray typedArray, int i, int i2, int i3, String str) {
        int color;
        PropertyValuesHolder propertyValuesHolderOfInt;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && m15552d(i4)) || (z2 && m15552d(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            PathParser2[] pathParser2ArrM16071p = C8162a.m16071p(string);
            PathParser2[] pathParser2ArrM16071p2 = C8162a.m16071p(string2);
            if (pathParser2ArrM16071p == null && pathParser2ArrM16071p2 == null) {
                return null;
            }
            if (pathParser2ArrM16071p == null) {
                if (pathParser2ArrM16071p2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), pathParser2ArrM16071p2);
                }
                return null;
            }
            a aVar = new a();
            if (pathParser2ArrM16071p2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, pathParser2ArrM16071p);
            } else {
                if (!C8162a.m16059d(pathParser2ArrM16071p, pathParser2ArrM16071p2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, pathParser2ArrM16071p, pathParser2ArrM16071p2);
            }
            return propertyValuesHolderOfObject;
        }
        ArgbEvaluator argbEvaluator = i == 3 ? ArgbEvaluator.f36548a : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
        } else {
            if (!z) {
                if (z2) {
                    if (i5 == 5) {
                        color = (int) typedArray.getDimension(i3, 0.0f);
                    } else {
                        color = m15552d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
                }
                if (propertyValuesHolder == null && argbEvaluator != null) {
                    propertyValuesHolder.setEvaluator(argbEvaluator);
                    return propertyValuesHolder;
                }
            }
            if (i4 == 5) {
                color2 = (int) typedArray.getDimension(i2, 0.0f);
            } else {
                color2 = m15552d(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    color3 = (int) typedArray.getDimension(i3, 0.0f);
                } else {
                    color3 = m15552d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        }
        propertyValuesHolder = propertyValuesHolderOfInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15552d(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX INFO: renamed from: e */
    public static ValueAnimator m15553e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray typedArrayM16038I = C8162a.m16038I(resources, theme, attributeSet, AndroidResources.f36530g);
        TypedArray typedArrayM16038I2 = C8162a.m16038I(resources, theme, attributeSet, AndroidResources.f36534k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long j2 = C8162a.m16033D(xmlPullParser, CainMediaMetadataRetriever.METADATA_KEY_DURATION) ? typedArrayM16038I.getInt(1, 300) : 300;
        int resourceId = 0;
        long j3 = !C8162a.m16033D(xmlPullParser, "startOffset") ? 0 : typedArrayM16038I.getInt(2, 0);
        int i = !C8162a.m16033D(xmlPullParser, "valueType") ? 4 : typedArrayM16038I.getInt(7, 4);
        if (C8162a.m16033D(xmlPullParser, "valueFrom") && C8162a.m16033D(xmlPullParser, "valueTo")) {
            if (i == 4) {
                TypedValue typedValuePeekValue = typedArrayM16038I.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i2 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayM16038I.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                i = ((z && m15552d(i2)) || (z2 && m15552d(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderM15551c = m15551c(typedArrayM16038I, i, 5, 6, "");
            if (propertyValuesHolderM15551c != null) {
                valueAnimator4.setValues(propertyValuesHolderM15551c);
            }
        }
        valueAnimator4.setDuration(j2);
        valueAnimator4.setStartDelay(j3);
        valueAnimator4.setRepeatCount(!C8162a.m16033D(xmlPullParser, "repeatCount") ? 0 : typedArrayM16038I.getInt(3, 0));
        valueAnimator4.setRepeatMode(!C8162a.m16033D(xmlPullParser, "repeatMode") ? 1 : typedArrayM16038I.getInt(4, 1));
        if (typedArrayM16038I2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String strM16079x = C8162a.m16079x(typedArrayM16038I2, xmlPullParser, "pathData", 1);
            if (strM16079x != null) {
                String strM16079x2 = C8162a.m16079x(typedArrayM16038I2, xmlPullParser, "propertyXName", 2);
                String strM16079x3 = C8162a.m16079x(typedArrayM16038I2, xmlPullParser, "propertyYName", 3);
                if (strM16079x2 == null && strM16079x3 == null) {
                    throw new InflateException(typedArrayM16038I2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathM16072q = C8162a.m16072q(strM16079x);
                float f2 = 0.5f * f;
                PathMeasure pathMeasure = new PathMeasure(pathM16072q, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathM16072q, false);
                int iMin = Math.min(100, ((int) (length / f2)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f3 = length / (iMin - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = typedArrayM16038I;
                int i3 = 0;
                float f4 = 0.0f;
                while (true) {
                    if (resourceId >= iMin) {
                        break;
                    }
                    int i4 = iMin;
                    pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
                    fArr[resourceId] = fArr3[0];
                    fArr2[resourceId] = fArr3[1];
                    f4 += f3;
                    int i5 = i3 + 1;
                    if (i5 < arrayList.size() && f4 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i3 = i5;
                    }
                    resourceId++;
                    iMin = i4;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strM16079x2 != null ? PropertyValuesHolder.ofFloat(strM16079x2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strM16079x3 != null ? PropertyValuesHolder.ofFloat(strM16079x3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = typedArrayM16038I;
                objectAnimator.setPropertyName(C8162a.m16079x(typedArrayM16038I2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = typedArrayM16038I;
        }
        if (C8162a.m16033D(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (typedArrayM16038I2 != null) {
            typedArrayM16038I2.recycle();
        }
        return valueAnimator3;
    }
}
