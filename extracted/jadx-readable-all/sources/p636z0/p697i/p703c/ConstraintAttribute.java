package p636z0.p697i.p703c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: z0.i.c.a, reason: use source file name */
/* JADX INFO: compiled from: ConstraintAttribute.java */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintAttribute {

    /* JADX INFO: renamed from: a */
    public String f37011a;

    /* JADX INFO: renamed from: b */
    public a f37012b;

    /* JADX INFO: renamed from: c */
    public int f37013c;

    /* JADX INFO: renamed from: d */
    public float f37014d;

    /* JADX INFO: renamed from: e */
    public String f37015e;

    /* JADX INFO: renamed from: f */
    public boolean f37016f;

    /* JADX INFO: renamed from: g */
    public int f37017g;

    /* JADX INFO: renamed from: z0.i.c.a$a */
    /* JADX INFO: compiled from: ConstraintAttribute.java */
    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public ConstraintAttribute(String str, a aVar) {
        this.f37011a = str;
        this.f37012b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m15838a(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> map) {
        a aVar;
        Object string;
        a aVar2 = a.DIMENSION_TYPE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8022i.f37167e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        a aVar3 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar3 = a.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    aVar = a.COLOR_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    if (index == 7) {
                        objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        aVar = a.FLOAT_TYPE;
                        string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        aVar = a.INT_TYPE;
                        string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 8) {
                        aVar = a.STRING_TYPE;
                        string = typedArrayObtainStyledAttributes.getString(index);
                    }
                    aVar3 = aVar2;
                }
                Object obj = string;
                aVar3 = aVar;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new ConstraintAttribute(string2, aVar3, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public void m15839b(Object obj) {
        switch (this.f37012b) {
            case INT_TYPE:
                this.f37013c = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f37014d = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f37017g = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f37015e = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f37016f = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f37014d = ((Float) obj).floatValue();
                break;
        }
    }

    public ConstraintAttribute(String str, a aVar, Object obj) {
        this.f37011a = str;
        this.f37012b = aVar;
        m15839b(obj);
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f37011a = constraintAttribute.f37011a;
        this.f37012b = constraintAttribute.f37012b;
        m15839b(obj);
    }
}
