package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewDebug;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.ReflectionUtil;
import com.facebook.stetho.common.StringUtil;
import com.facebook.stetho.common.android.ResourcesUtil;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import com.facebook.stetho.inspector.helper.IntegerFormatter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public final class ViewDescriptor extends AbstractChainedDescriptor<View> implements HighlightableDescriptor<View> {
    private static final String ACCESSIBILITY_STYLE_RULE_NAME = "Accessibility Properties";
    private static final String ID_NAME = "id";
    private static final String NONE_MAPPING = "<no mapping>";
    private static final String NONE_VALUE = "(none)";
    private static final String VIEW_STYLE_RULE_NAME = "<this_view>";
    private static final boolean sHasSupportNodeInfo;
    private final MethodInvoker mMethodInvoker;
    private volatile List<ViewCSSProperty> mViewProperties;
    private Pattern mWordBoundaryPattern;

    public final class FieldBackedCSSProperty extends ViewCSSProperty {
        private final Field mField;

        public FieldBackedCSSProperty(Field field, String str, ViewDebug.ExportedProperty exportedProperty) {
            super(str, exportedProperty);
            this.mField = field;
            field.setAccessible(true);
        }

        @Override // com.facebook.stetho.inspector.elements.android.ViewDescriptor.ViewCSSProperty
        public Object getValue(View view) throws IllegalAccessException, InvocationTargetException {
            return this.mField.get(view);
        }
    }

    public final class MethodBackedCSSProperty extends ViewCSSProperty {
        private final Method mMethod;

        public MethodBackedCSSProperty(Method method, String str, ViewDebug.ExportedProperty exportedProperty) {
            super(str, exportedProperty);
            this.mMethod = method;
            method.setAccessible(true);
        }

        @Override // com.facebook.stetho.inspector.elements.android.ViewDescriptor.ViewCSSProperty
        public Object getValue(View view) throws IllegalAccessException, InvocationTargetException {
            return this.mMethod.invoke(view, new Object[0]);
        }
    }

    public abstract class ViewCSSProperty {
        private final ViewDebug.ExportedProperty mAnnotation;
        private final String mCSSName;

        public ViewCSSProperty(String str, ViewDebug.ExportedProperty exportedProperty) {
            this.mCSSName = str;
            this.mAnnotation = exportedProperty;
        }

        public final ViewDebug.ExportedProperty getAnnotation() {
            return this.mAnnotation;
        }

        public final String getCSSName() {
            return this.mCSSName;
        }

        public abstract Object getValue(View view) throws IllegalAccessException, InvocationTargetException;
    }

    static {
        sHasSupportNodeInfo = ReflectionUtil.tryGetClassForName("androidx.core.view.accessibility.AccessibilityNodeInfoCompat") != null;
    }

    public ViewDescriptor() {
        this(new MethodInvoker());
    }

    private static boolean canFlagsBeMappedToString(ViewDebug.ExportedProperty exportedProperty) {
        return (exportedProperty == null || exportedProperty.flagMapping() == null || exportedProperty.flagMapping().length <= 0) ? false : true;
    }

    private static boolean canIntBeMappedToString(ViewDebug.ExportedProperty exportedProperty) {
        return (exportedProperty == null || exportedProperty.mapping() == null || exportedProperty.mapping().length <= 0) ? false : true;
    }

    private static String capitalize(String str) {
        if (str == null || str.length() == 0 || Character.isTitleCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(0, Character.toTitleCase(sb.charAt(0)));
        return sb.toString();
    }

    private String convertViewPropertyNameToCSSName(String str) {
        String[] strArrSplit = getWordBoundaryPattern().split(str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!strArrSplit[i].equals("get") && !strArrSplit[i].equals("m")) {
                sb.append(strArrSplit[i].toLowerCase());
                if (i < strArrSplit.length - 1) {
                    sb.append('-');
                }
            }
        }
        return sb.toString();
    }

    private static String getIdAttribute(View view) {
        int id = view.getId();
        if (id == -1) {
            return null;
        }
        return ResourcesUtil.getIdStringQuietly(view, view.getResources(), id);
    }

    private void getIdStyle(View view, StyleAccumulator styleAccumulator) {
        String idAttribute = getIdAttribute(view);
        if (idAttribute == null) {
            styleAccumulator.store(ID_NAME, NONE_VALUE, false);
        } else {
            styleAccumulator.store(ID_NAME, idAttribute, false);
        }
    }

    private void getStyleFromInteger(String str, Integer num, ViewDebug.ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
        String str2 = IntegerFormatter.getInstance().format(num, exportedProperty);
        if (canIntBeMappedToString(exportedProperty)) {
            styleAccumulator.store(str, outline.m1550A(outline.m1561L(str2, " ("), mapIntToStringUsingAnnotation(num.intValue(), exportedProperty), ")"), false);
            return;
        }
        if (canFlagsBeMappedToString(exportedProperty)) {
            styleAccumulator.store(str, outline.m1550A(outline.m1561L(str2, " ("), mapFlagsToStringUsingAnnotation(num.intValue(), exportedProperty), ")"), false);
            return;
        }
        Boolean bool = Boolean.TRUE;
        if (num.intValue() != 0 || canFlagsBeMappedToString(exportedProperty) || canIntBeMappedToString(exportedProperty)) {
            bool = Boolean.FALSE;
        }
        styleAccumulator.store(str, str2, bool.booleanValue());
    }

    private void getStyleFromValue(View view, String str, Object obj, ViewDebug.ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
        if (str.equals(ID_NAME)) {
            getIdStyle(view, styleAccumulator);
            return;
        }
        if (obj instanceof Integer) {
            getStyleFromInteger(str, (Integer) obj, exportedProperty, styleAccumulator);
            return;
        }
        if (obj instanceof Float) {
            styleAccumulator.store(str, String.valueOf(obj), ((Float) obj).floatValue() == 0.0f);
            return;
        }
        if (obj instanceof Boolean) {
            styleAccumulator.store(str, String.valueOf(obj), false);
            return;
        }
        if (obj instanceof Short) {
            styleAccumulator.store(str, String.valueOf(obj), ((Short) obj).shortValue() == 0);
            return;
        }
        if (obj instanceof Long) {
            styleAccumulator.store(str, String.valueOf(obj), ((Long) obj).longValue() == 0);
            return;
        }
        if (obj instanceof Double) {
            styleAccumulator.store(str, String.valueOf(obj), ((Double) obj).doubleValue() == 0.0d);
            return;
        }
        if (obj instanceof Byte) {
            styleAccumulator.store(str, String.valueOf(obj), ((Byte) obj).byteValue() == 0);
            return;
        }
        if (obj instanceof Character) {
            styleAccumulator.store(str, String.valueOf(obj), ((Character) obj).charValue() == 0);
        } else if (obj instanceof CharSequence) {
            styleAccumulator.store(str, String.valueOf(obj), ((CharSequence) obj).length() == 0);
        } else {
            getStylesFromObject(view, str, obj, exportedProperty, styleAccumulator);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    private void getStylesFromObject(View view, String str, Object obj, ViewDebug.ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
        String str2;
        String strConvertViewPropertyNameToCSSName;
        if (exportedProperty == null || !exportedProperty.deepExport() || obj == null) {
            return;
        }
        for (Field field : obj.getClass().getFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                try {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    String name = field.getName();
                    name.hashCode();
                    switch (name) {
                        case "rightMargin":
                            str2 = "margin-right";
                            strConvertViewPropertyNameToCSSName = str2;
                            break;
                        case "topMargin":
                            str2 = "margin-top";
                            strConvertViewPropertyNameToCSSName = str2;
                            break;
                        case "leftMargin":
                            str2 = "margin-left";
                            strConvertViewPropertyNameToCSSName = str2;
                            break;
                        case "bottomMargin":
                            str2 = "margin-bottom";
                            strConvertViewPropertyNameToCSSName = str2;
                            break;
                        default:
                            String strPrefix = exportedProperty.prefix();
                            if (strPrefix != null) {
                                name = outline.m1599u(strPrefix, name);
                            }
                            strConvertViewPropertyNameToCSSName = convertViewPropertyNameToCSSName(name);
                            break;
                    }
                    getStyleFromValue(view, strConvertViewPropertyNameToCSSName, obj2, (ViewDebug.ExportedProperty) field.getAnnotation(ViewDebug.ExportedProperty.class), styleAccumulator);
                } catch (IllegalAccessException e) {
                    StringBuilder sbM1562M = outline.m1562M("failed to get property of name: \"", str, "\" of object: ");
                    sbM1562M.append(String.valueOf(obj));
                    LogUtil.m12601e(e, sbM1562M.toString());
                    return;
                }
            }
        }
    }

    private List<ViewCSSProperty> getViewProperties() {
        if (this.mViewProperties == null) {
            synchronized (this) {
                if (this.mViewProperties == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Method method : View.class.getDeclaredMethods()) {
                        ViewDebug.ExportedProperty exportedProperty = (ViewDebug.ExportedProperty) method.getAnnotation(ViewDebug.ExportedProperty.class);
                        if (exportedProperty != null) {
                            arrayList.add(new MethodBackedCSSProperty(method, convertViewPropertyNameToCSSName(method.getName()), exportedProperty));
                        }
                    }
                    for (Field field : View.class.getDeclaredFields()) {
                        ViewDebug.ExportedProperty exportedProperty2 = (ViewDebug.ExportedProperty) field.getAnnotation(ViewDebug.ExportedProperty.class);
                        if (exportedProperty2 != null) {
                            arrayList.add(new FieldBackedCSSProperty(field, convertViewPropertyNameToCSSName(field.getName()), exportedProperty2));
                        }
                    }
                    Collections.sort(arrayList, new Comparator<ViewCSSProperty>() { // from class: com.facebook.stetho.inspector.elements.android.ViewDescriptor.1
                        @Override // java.util.Comparator
                        public int compare(ViewCSSProperty viewCSSProperty, ViewCSSProperty viewCSSProperty2) {
                            return viewCSSProperty.getCSSName().compareTo(viewCSSProperty2.getCSSName());
                        }
                    });
                    this.mViewProperties = Collections.unmodifiableList(arrayList);
                }
            }
        }
        return this.mViewProperties;
    }

    private Pattern getWordBoundaryPattern() {
        if (this.mWordBoundaryPattern == null) {
            this.mWordBoundaryPattern = Pattern.compile("(?<=\\p{Lower})(?=\\p{Upper})");
        }
        return this.mWordBoundaryPattern;
    }

    private static String mapFlagsToStringUsingAnnotation(int i, ViewDebug.ExportedProperty exportedProperty) {
        if (!canFlagsBeMappedToString(exportedProperty)) {
            throw new IllegalStateException("Cannot map using this annotation");
        }
        StringBuilder sb = null;
        boolean z = false;
        for (ViewDebug.FlagToString flagToString : exportedProperty.flagMapping()) {
            if (flagToString.outputIf() == ((flagToString.mask() & i) == flagToString.equals())) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                if (z) {
                    sb.append(" | ");
                }
                sb.append(flagToString.name());
                z = true;
            }
        }
        return z ? sb.toString() : NONE_MAPPING;
    }

    private static String mapIntToStringUsingAnnotation(int i, ViewDebug.ExportedProperty exportedProperty) {
        if (!canIntBeMappedToString(exportedProperty)) {
            throw new IllegalStateException("Cannot map using this annotation");
        }
        for (ViewDebug.IntToString intToString : exportedProperty.mapping()) {
            if (intToString.from() == i) {
                return intToString.to();
            }
        }
        return NONE_MAPPING;
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    public View getViewAndBoundsForHighlighting(View view, Rect rect) {
        return view;
    }

    public ViewDescriptor(MethodInvoker methodInvoker) {
        this.mMethodInvoker = methodInvoker;
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    public Object getElementToHighlightAtPosition(View view, int i, int i2, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        return view;
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public void onGetAttributes(View view, AttributeAccumulator attributeAccumulator) {
        String idAttribute = getIdAttribute(view);
        if (idAttribute != null) {
            attributeAccumulator.store(ID_NAME, idAttribute);
        }
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public void onGetComputedStyles(View view, ComputedStyleAccumulator computedStyleAccumulator) {
        computedStyleAccumulator.store("left", Integer.toString(view.getLeft()));
        computedStyleAccumulator.store("top", Integer.toString(view.getTop()));
        computedStyleAccumulator.store("right", Integer.toString(view.getRight()));
        computedStyleAccumulator.store("bottom", Integer.toString(view.getBottom()));
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public String onGetNodeName(View view) {
        String name = view.getClass().getName();
        return StringUtil.removePrefix(name, "android.view.", StringUtil.removePrefix(name, "android.widget."));
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public void onGetStyleRuleNames(View view, StyleRuleNameAccumulator styleRuleNameAccumulator) {
        styleRuleNameAccumulator.store(VIEW_STYLE_RULE_NAME, false);
        if (sHasSupportNodeInfo) {
            styleRuleNameAccumulator.store(ACCESSIBILITY_STYLE_RULE_NAME, false);
        }
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public void onGetStyles(View view, String str, StyleAccumulator styleAccumulator) {
        if (!VIEW_STYLE_RULE_NAME.equals(str)) {
            if (ACCESSIBILITY_STYLE_RULE_NAME.equals(str) && sHasSupportNodeInfo) {
                boolean ignored = AccessibilityNodeInfoWrapper.getIgnored(view);
                getStyleFromValue(view, "ignored", Boolean.valueOf(ignored), null, styleAccumulator);
                if (ignored) {
                    getStyleFromValue(view, "ignored-reasons", AccessibilityNodeInfoWrapper.getIgnoredReasons(view), null, styleAccumulator);
                }
                getStyleFromValue(view, "focusable", Boolean.valueOf(!ignored), null, styleAccumulator);
                if (ignored) {
                    return;
                }
                getStyleFromValue(view, "focusable-reasons", AccessibilityNodeInfoWrapper.getFocusableReasons(view), null, styleAccumulator);
                getStyleFromValue(view, "focused", Boolean.valueOf(AccessibilityNodeInfoWrapper.getIsAccessibilityFocused(view)), null, styleAccumulator);
                getStyleFromValue(view, CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION, AccessibilityNodeInfoWrapper.getDescription(view), null, styleAccumulator);
                getStyleFromValue(view, "actions", AccessibilityNodeInfoWrapper.getActions(view), null, styleAccumulator);
                return;
            }
            return;
        }
        List<ViewCSSProperty> viewProperties = getViewProperties();
        int size = viewProperties.size();
        for (int i = 0; i < size; i++) {
            ViewCSSProperty viewCSSProperty = viewProperties.get(i);
            try {
                try {
                    getStyleFromValue(view, viewCSSProperty.getCSSName(), viewCSSProperty.getValue(view), viewCSSProperty.getAnnotation(), styleAccumulator);
                } catch (Exception e) {
                    e = e;
                    if (!(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw ExceptionUtil.propagate(e);
                    }
                    StringBuilder sbM1556G = outline.m1556G("failed to get style property ");
                    sbM1556G.append(viewCSSProperty.getCSSName());
                    sbM1556G.append(" of element= ");
                    sbM1556G.append(view.toString());
                    LogUtil.m12601e(e, sbM1556G.toString());
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public void onSetAttributesAsText(View view, String str) {
        for (Map.Entry<String, String> entry : Descriptor.parseSetAttributesAsTextArg(str).entrySet()) {
            StringBuilder sbM1556G = outline.m1556G("set");
            sbM1556G.append(capitalize(entry.getKey()));
            this.mMethodInvoker.invoke(view, sbM1556G.toString(), entry.getValue());
        }
    }
}
