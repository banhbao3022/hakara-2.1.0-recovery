package p007c.p190n.p194b.p334e.p362v;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: renamed from: c.n.b.e.v.b, reason: use source file name */
/* JADX INFO: compiled from: MaterialAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialAttributes {
    /* JADX INFO: renamed from: a */
    public static TypedValue m11349a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11350b(Context context, int i, boolean z) {
        TypedValue typedValueM11349a = m11349a(context, i);
        if (typedValueM11349a == null || typedValueM11349a.type != 18) {
            return z;
        }
        return typedValueM11349a.data != 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m11351c(Context context, int i, String str) {
        TypedValue typedValueM11349a = m11349a(context, i);
        if (typedValueM11349a != null) {
            return typedValueM11349a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
