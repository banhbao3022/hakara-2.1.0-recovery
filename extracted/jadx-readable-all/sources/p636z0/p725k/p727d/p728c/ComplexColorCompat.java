package p636z0.p725k.p727d.p728c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p636z0.p725k.C8162a;
import p636z0.p725k.C8163b;

/* JADX INFO: renamed from: z0.k.d.c.b, reason: use source file name */
/* JADX INFO: compiled from: ComplexColorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ComplexColorCompat {

    /* JADX INFO: renamed from: a */
    public final Shader f37819a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f37820b;

    /* JADX INFO: renamed from: c */
    public int f37821c;

    public ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i) {
        this.f37819a = shader;
        this.f37820b = colorStateList;
        this.f37821c = i;
    }

    /* JADX INFO: renamed from: a */
    public static ComplexColorCompat m16154a(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        float f3;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM16153b = ColorStateListInflaterCompat.m16153b(resources, xml, attributeSetAsAttributeSet, theme);
                return new ComplexColorCompat(null, colorStateListM16153b, colorStateListM16153b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM16038I = C8162a.m16038I(resources, theme, attributeSetAsAttributeSet, C8163b.f37658d);
        float f4 = !C8162a.m16033D(xml, "startX") ? 0.0f : typedArrayM16038I.getFloat(8, 0.0f);
        float f5 = !C8162a.m16033D(xml, "startY") ? 0.0f : typedArrayM16038I.getFloat(9, 0.0f);
        float f6 = !C8162a.m16033D(xml, "endX") ? 0.0f : typedArrayM16038I.getFloat(10, 0.0f);
        float f7 = !C8162a.m16033D(xml, "endY") ? 0.0f : typedArrayM16038I.getFloat(11, 0.0f);
        float f8 = !C8162a.m16033D(xml, "centerX") ? 0.0f : typedArrayM16038I.getFloat(3, 0.0f);
        float f9 = !C8162a.m16033D(xml, "centerY") ? 0.0f : typedArrayM16038I.getFloat(4, 0.0f);
        int i2 = !C8162a.m16033D(xml, "type") ? 0 : typedArrayM16038I.getInt(2, 0);
        int color = !C8162a.m16033D(xml, "startColor") ? 0 : typedArrayM16038I.getColor(0, 0);
        boolean zM16033D = C8162a.m16033D(xml, "centerColor");
        int color2 = !C8162a.m16033D(xml, "centerColor") ? 0 : typedArrayM16038I.getColor(7, 0);
        int color3 = !C8162a.m16033D(xml, "endColor") ? 0 : typedArrayM16038I.getColor(1, 0);
        int i3 = !C8162a.m16033D(xml, "tileMode") ? 0 : typedArrayM16038I.getInt(6, 0);
        float f10 = !C8162a.m16033D(xml, "gradientRadius") ? 0.0f : typedArrayM16038I.getFloat(5, 0.0f);
        typedArrayM16038I.recycle();
        int depth = xml.getDepth() + 1;
        float f11 = f10;
        ArrayList arrayList = new ArrayList(20);
        float f12 = f7;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f6;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM16038I2 = C8162a.m16038I(resources, theme, attributeSetAsAttributeSet, C8163b.f37659e);
                boolean zHasValue = typedArrayM16038I2.hasValue(0);
                boolean zHasValue2 = typedArrayM16038I2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM16038I2.getColor(0, 0);
                float f13 = typedArrayM16038I2.getFloat(1, 0.0f);
                typedArrayM16038I2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f13));
            }
            f6 = f;
            f5 = f2;
        }
        GradientColorInflaterCompat gradientColorInflaterCompat = arrayList2.size() > 0 ? new GradientColorInflaterCompat(arrayList2, arrayList) : null;
        if (gradientColorInflaterCompat == null) {
            gradientColorInflaterCompat = zM16033D ? new GradientColorInflaterCompat(color, color2, color3) : new GradientColorInflaterCompat(color, color3);
        }
        if (i2 == 1) {
            float f14 = f8;
            if (f11 <= 0.0f) {
                f3 = f9;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr = gradientColorInflaterCompat.f37833a;
            float[] fArr = gradientColorInflaterCompat.f37834b;
            if (i3 == 1) {
                f3 = f9;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i3 != 2) {
                f3 = f9;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f3 = f9;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f14, f3, f11, iArr, fArr, tileMode);
        } else if (i2 != 2) {
            int[] iArr2 = gradientColorInflaterCompat.f37833a;
            float[] fArr2 = gradientColorInflaterCompat.f37834b;
            if (i3 != 1) {
                tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            radialGradient = new LinearGradient(f4, f2, f, f12, iArr2, fArr2, tileMode2);
        } else {
            radialGradient = new SweepGradient(f8, f9, gradientColorInflaterCompat.f37833a, gradientColorInflaterCompat.f37834b);
        }
        return new ComplexColorCompat(radialGradient, null, 0);
    }

    /* JADX INFO: renamed from: b */
    public boolean m16155b() {
        return this.f37819a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16156c() {
        ColorStateList colorStateList;
        return this.f37819a == null && (colorStateList = this.f37820b) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: d */
    public boolean m16157d(int[] iArr) {
        if (m16156c()) {
            ColorStateList colorStateList = this.f37820b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f37821c) {
                this.f37821c = colorForState;
                return true;
            }
        }
        return false;
    }
}
