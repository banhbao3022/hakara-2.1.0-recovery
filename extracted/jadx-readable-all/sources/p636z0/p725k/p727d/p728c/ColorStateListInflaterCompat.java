package p636z0.p725k.p727d.p728c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import mtp.media.karaoke.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p636z0.p725k.C8163b;

/* JADX INFO: renamed from: z0.k.d.c.a, reason: use source file name */
/* JADX INFO: compiled from: ColorStateListInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ColorStateListInflaterCompat {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f37818a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m16152a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m16153b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m16153b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = C8163b.f37655a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(0, -1);
                if (resourceId == -1) {
                    color = typedArrayObtainAttributes.getColor(0, -65281);
                } else {
                    ThreadLocal<TypedValue> threadLocal = f37818a;
                    TypedValue typedValue = threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    int i2 = typedValue.type;
                    if (i2 >= 28 && i2 <= 31) {
                        color = typedArrayObtainAttributes.getColor(0, -65281);
                    } else {
                        try {
                            color = m16152a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(0, -65281);
                        }
                    }
                }
                float f = 1.0f;
                if (typedArrayObtainAttributes.hasValue(r4)) {
                    f = typedArrayObtainAttributes.getFloat(r4, 1.0f);
                } else if (typedArrayObtainAttributes.hasValue(2)) {
                    f = typedArrayObtainAttributes.getFloat(2, 1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i3);
                int iRound = (Math.round(Color.alpha(color) * f) << 24) | (color & 16777215);
                int i6 = i + 1;
                if (i6 > iArr.length) {
                    int[] iArr4 = new int[i <= 4 ? 8 : i * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i);
                    iArr = iArr4;
                }
                iArr[i] = iRound;
                if (i6 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i > 4 ? i * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i);
                    objArr = objArr2;
                }
                objArr[i] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i = i6;
            }
            r4 = 1;
        }
        int[] iArr5 = new int[i];
        int[][] iArr6 = new int[i][];
        System.arraycopy(iArr, 0, iArr5, 0, i);
        System.arraycopy(objArr, 0, iArr6, 0, i);
        return new ColorStateList(iArr6, iArr5);
    }
}
