package p636z0.p770y;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.SparseArrayCompat;
import p636z0.p770y.p771t.C8457a;

/* JADX INFO: renamed from: z0.y.n, reason: use source file name */
/* JADX INFO: compiled from: NavInflater.java */
/* JADX INFO: loaded from: classes.dex */
public final class NavInflater {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f39051a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public Context f39052b;

    /* JADX INFO: renamed from: c */
    public NavigatorProvider f39053c;

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        this.f39052b = context;
        this.f39053c = navigatorProvider;
    }

    /* JADX INFO: renamed from: a */
    public static NavType m16915a(TypedValue typedValue, NavType navType, NavType navType2, String str, String str2) throws XmlPullParserException {
        if (navType == null || navType == navType2) {
            return navType != null ? navType : navType2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    /* JADX INFO: renamed from: b */
    public final NavDestination m16916b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        int i2;
        String strReplace;
        NavDestination navDestinationMo457a = this.f39053c.m16930d(xmlResourceParser.getName()).mo457a();
        navDestinationMo457a.mo462m(this.f39052b, attributeSet);
        int i3 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C8457a.f39091b);
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    NavArgument navArgumentM16918d = m16918d(typedArrayObtainAttributes, resources, i);
                    if (navDestinationMo457a.f39038m == null) {
                        navDestinationMo457a.f39038m = new HashMap<>();
                    }
                    navDestinationMo457a.f39038m.put(string, navArgumentM16918d);
                    typedArrayObtainAttributes.recycle();
                } else {
                    if ("deepLink".equals(name)) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, C8457a.f39092c);
                        String string2 = typedArrayObtainAttributes2.getString(3);
                        String string3 = typedArrayObtainAttributes2.getString(i3);
                        String string4 = typedArrayObtainAttributes2.getString(2);
                        if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                        }
                        String strReplace2 = string2 != null ? string2.replace("${applicationId}", this.f39052b.getPackageName()) : null;
                        if (TextUtils.isEmpty(string3)) {
                            strReplace = null;
                        } else {
                            strReplace = string3.replace("${applicationId}", this.f39052b.getPackageName());
                            if (strReplace.isEmpty()) {
                                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                            }
                        }
                        NavDeepLink navDeepLink = new NavDeepLink(strReplace2, strReplace, string4 != null ? string4.replace("${applicationId}", this.f39052b.getPackageName()) : null);
                        if (navDestinationMo457a.f39036k == null) {
                            navDestinationMo457a.f39036k = new ArrayList<>();
                        }
                        navDestinationMo457a.f39036k.add(navDeepLink);
                        typedArrayObtainAttributes2.recycle();
                    } else if ("action".equals(name)) {
                        TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, C8457a.f39090a);
                        int resourceId = typedArrayObtainAttributes3.getResourceId(0, 0);
                        NavAction navAction = new NavAction(typedArrayObtainAttributes3.getResourceId(i3, 0));
                        NavOptions.a aVar = new NavOptions.a();
                        aVar.f39061a = typedArrayObtainAttributes3.getBoolean(4, false);
                        int resourceId2 = typedArrayObtainAttributes3.getResourceId(7, -1);
                        boolean z = typedArrayObtainAttributes3.getBoolean(8, false);
                        aVar.f39062b = resourceId2;
                        aVar.f39063c = z;
                        aVar.f39064d = typedArrayObtainAttributes3.getResourceId(2, -1);
                        aVar.f39065e = typedArrayObtainAttributes3.getResourceId(3, -1);
                        aVar.f39066f = typedArrayObtainAttributes3.getResourceId(5, -1);
                        aVar.f39067g = typedArrayObtainAttributes3.getResourceId(6, -1);
                        navAction.f38989b = aVar.m16919a();
                        Bundle bundle = new Bundle();
                        int i4 = 1;
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        int i5 = i;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i4) {
                                i2 = depth2;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            i2 = depth2;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, C8457a.f39091b);
                                    String string5 = typedArrayObtainAttributes4.getString(0);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    NavArgument navArgumentM16918d2 = m16918d(typedArrayObtainAttributes4, resources, i5);
                                    boolean z2 = navArgumentM16918d2.f38993c;
                                    if (z2 && z2) {
                                        navArgumentM16918d2.f38991a.mo16923d(bundle, string5, navArgumentM16918d2.f38994d);
                                    }
                                    typedArrayObtainAttributes4.recycle();
                                }
                                i5 = i;
                            }
                            depth2 = i2;
                            i4 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            navAction.f38990c = bundle;
                        }
                        i3 = 1;
                        if (!(!(navDestinationMo457a instanceof ActivityNavigator.a))) {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + navDestinationMo457a + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                        if (resourceId == 0) {
                            throw new IllegalArgumentException("Cannot have an action with actionId 0");
                        }
                        if (navDestinationMo457a.f39037l == null) {
                            navDestinationMo457a.f39037l = new SparseArrayCompat<>();
                        }
                        navDestinationMo457a.f39037l.m15619j(resourceId, navAction);
                        typedArrayObtainAttributes3.recycle();
                    } else {
                        i2 = depth2;
                        if ("include".equals(name) && (navDestinationMo457a instanceof NavGraph)) {
                            TypedArray typedArrayObtainAttributes5 = resources.obtainAttributes(attributeSet, C8456s.f39089c);
                            ((NavGraph) navDestinationMo457a).m16912q(m16917c(typedArrayObtainAttributes5.getResourceId(0, 0)));
                            typedArrayObtainAttributes5.recycle();
                        } else if (navDestinationMo457a instanceof NavGraph) {
                            ((NavGraph) navDestinationMo457a).m16912q(m16916b(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    depth2 = i2;
                }
                i2 = depth2;
                depth2 = i2;
            }
        }
        return navDestinationMo457a;
    }

    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: c */
    public NavGraph m16917c(int i) {
        int next;
        Resources resources = this.f39052b.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        NavDestination navDestinationM16916b = m16916b(resources, xml, attributeSetAsAttributeSet, i);
        if (navDestinationM16916b instanceof NavGraph) {
            NavGraph navGraph = (NavGraph) navDestinationM16916b;
            xml.close();
            return navGraph;
        }
        throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008f A[PHI: r13
  0x008f: PHI (r13v29 z0.y.p) = (r13v14 z0.y.p), (r13v15 z0.y.p), (r13v16 z0.y.p), (r13v17 z0.y.p) binds: [B:29:0x008d, B:32:0x0098, B:35:0x00a3, B:38:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    public final NavArgument m16918d(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        NavType navTypeM16915a;
        NavType navType;
        NavType pVar;
        NavType navType2;
        String strSubstring;
        NavType pVar2;
        NavArgument.a aVar = new NavArgument.a();
        aVar.f38996b = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = f39051a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        Object objMo16924e = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            navTypeM16915a = NavType.f39068a;
            if (!"integer".equals(string)) {
                navTypeM16915a = NavType.f39070c;
                if (!"integer[]".equals(string)) {
                    navTypeM16915a = NavType.f39071d;
                    if (!"long".equals(string)) {
                        navTypeM16915a = NavType.f39072e;
                        if (!"long[]".equals(string)) {
                            navTypeM16915a = NavType.f39075h;
                            if (!"boolean".equals(string)) {
                                navTypeM16915a = NavType.f39076i;
                                if (!"boolean[]".equals(string)) {
                                    navTypeM16915a = NavType.f39077j;
                                    if (!"string".equals(string)) {
                                        NavType navType3 = NavType.f39078k;
                                        if ("string[]".equals(string)) {
                                            navTypeM16915a = navType3;
                                        } else {
                                            navType3 = NavType.f39073f;
                                            if ("float".equals(string)) {
                                                navTypeM16915a = navType3;
                                            } else {
                                                navType3 = NavType.f39074g;
                                                if ("float[]".equals(string)) {
                                                    navTypeM16915a = navType3;
                                                } else {
                                                    navType3 = NavType.f39069b;
                                                    if ("reference".equals(string)) {
                                                        navTypeM16915a = navType3;
                                                    } else if (!string.isEmpty()) {
                                                        try {
                                                            if (!string.startsWith(".") || resourcePackageName == null) {
                                                                strSubstring = string;
                                                            } else {
                                                                strSubstring = resourcePackageName + string;
                                                            }
                                                            if (string.endsWith("[]")) {
                                                                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                                                                Class<?> cls = Class.forName(strSubstring);
                                                                if (!Parcelable.class.isAssignableFrom(cls)) {
                                                                    if (Serializable.class.isAssignableFrom(cls)) {
                                                                        pVar2 = new NavType.o(cls);
                                                                    }
                                                                    throw new IllegalArgumentException(strSubstring + " is not Serializable or Parcelable.");
                                                                }
                                                                pVar2 = new NavType.m(cls);
                                                                navTypeM16915a = pVar2;
                                                            } else {
                                                                Class<?> cls2 = Class.forName(strSubstring);
                                                                if (Parcelable.class.isAssignableFrom(cls2)) {
                                                                    pVar2 = new NavType.n(cls2);
                                                                } else {
                                                                    if (!Enum.class.isAssignableFrom(cls2)) {
                                                                        if (Serializable.class.isAssignableFrom(cls2)) {
                                                                            pVar2 = new NavType.p(cls2);
                                                                        }
                                                                        throw new IllegalArgumentException(strSubstring + " is not Serializable or Parcelable.");
                                                                    }
                                                                    pVar2 = new NavType.l(cls2);
                                                                }
                                                                navTypeM16915a = pVar2;
                                                            }
                                                        } catch (ClassNotFoundException e) {
                                                            throw new RuntimeException(e);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            navTypeM16915a = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            NavType navType4 = NavType.f39069b;
            if (navTypeM16915a == navType4) {
                int i2 = typedValue.resourceId;
                if (i2 != 0) {
                    objMo16924e = Integer.valueOf(i2);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sbM1556G = outline.m1556G("unsupported value '");
                        sbM1556G.append((Object) typedValue.string);
                        sbM1556G.append("' for ");
                        sbM1556G.append(navTypeM16915a.mo16921b());
                        sbM1556G.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sbM1556G.toString());
                    }
                    objMo16924e = 0;
                }
            } else {
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    if (navTypeM16915a != null) {
                        StringBuilder sbM1556G2 = outline.m1556G("unsupported value '");
                        sbM1556G2.append((Object) typedValue.string);
                        sbM1556G2.append("' for ");
                        sbM1556G2.append(navTypeM16915a.mo16921b());
                        sbM1556G2.append(". You must use a \"");
                        throw new XmlPullParserException(outline.m1550A(sbM1556G2, "reference", "\" type to reference other resources."));
                    }
                    navTypeM16915a = navType4;
                    objMo16924e = Integer.valueOf(i3);
                } else if (navTypeM16915a == NavType.f39077j) {
                    objMo16924e = typedArray.getString(1);
                } else {
                    int i4 = typedValue.type;
                    if (i4 == 3) {
                        String string2 = typedValue.string.toString();
                        if (navTypeM16915a == null) {
                            try {
                                try {
                                    try {
                                        try {
                                            navType2 = NavType.f39068a;
                                            navType2.mo16924e(string2);
                                        } catch (IllegalArgumentException unused) {
                                            navType2 = NavType.f39071d;
                                            navType2.mo16924e(string2);
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        navType2 = NavType.f39075h;
                                        navType2.mo16924e(string2);
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    navType2 = NavType.f39073f;
                                    navType2.mo16924e(string2);
                                }
                            } catch (IllegalArgumentException unused4) {
                                navType2 = NavType.f39077j;
                            }
                            navTypeM16915a = navType2;
                        }
                        objMo16924e = navTypeM16915a.mo16924e(string2);
                    } else if (i4 == 4) {
                        navTypeM16915a = m16915a(typedValue, navTypeM16915a, NavType.f39073f, string, "float");
                        objMo16924e = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        navTypeM16915a = m16915a(typedValue, navTypeM16915a, NavType.f39068a, string, "dimension");
                        objMo16924e = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        navTypeM16915a = m16915a(typedValue, navTypeM16915a, NavType.f39075h, string, "boolean");
                        objMo16924e = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i4 < 16 || i4 > 31) {
                            StringBuilder sbM1556G3 = outline.m1556G("unsupported argument type ");
                            sbM1556G3.append(typedValue.type);
                            throw new XmlPullParserException(sbM1556G3.toString());
                        }
                        NavType navType5 = NavType.f39073f;
                        if (navTypeM16915a == navType5) {
                            navTypeM16915a = m16915a(typedValue, navTypeM16915a, navType5, string, "float");
                            objMo16924e = Float.valueOf(typedValue.data);
                        } else {
                            navTypeM16915a = m16915a(typedValue, navTypeM16915a, NavType.f39068a, string, "integer");
                            objMo16924e = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (objMo16924e != null) {
            aVar.f38997c = objMo16924e;
            aVar.f38998d = true;
        }
        if (navTypeM16915a != null) {
            aVar.f38995a = navTypeM16915a;
        }
        if (aVar.f38995a == null) {
            Object obj = aVar.f38997c;
            if (obj instanceof Integer) {
                navType = NavType.f39068a;
            } else if (obj instanceof int[]) {
                navType = NavType.f39070c;
            } else if (obj instanceof Long) {
                navType = NavType.f39071d;
            } else if (obj instanceof long[]) {
                navType = NavType.f39072e;
            } else if (obj instanceof Float) {
                navType = NavType.f39073f;
            } else if (obj instanceof float[]) {
                navType = NavType.f39074g;
            } else if (obj instanceof Boolean) {
                navType = NavType.f39075h;
            } else if (obj instanceof boolean[]) {
                navType = NavType.f39076i;
            } else if ((obj instanceof String) || obj == null) {
                navType = NavType.f39077j;
            } else if (obj instanceof String[]) {
                navType = NavType.f39078k;
            } else {
                if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                    pVar = new NavType.m(obj.getClass().getComponentType());
                } else if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                    pVar = new NavType.o(obj.getClass().getComponentType());
                } else if (obj instanceof Parcelable) {
                    pVar = new NavType.n(obj.getClass());
                } else if (obj instanceof Enum) {
                    pVar = new NavType.l(obj.getClass());
                } else {
                    if (!(obj instanceof Serializable)) {
                        StringBuilder sbM1556G4 = outline.m1556G("Object of type ");
                        sbM1556G4.append(obj.getClass().getName());
                        sbM1556G4.append(" is not supported for navigation arguments.");
                        throw new IllegalArgumentException(sbM1556G4.toString());
                    }
                    pVar = new NavType.p(obj.getClass());
                }
                navType = pVar;
            }
            aVar.f38995a = navType;
        }
        return new NavArgument(aVar.f38995a, aVar.f38996b, aVar.f38997c, aVar.f38998d);
    }
}
