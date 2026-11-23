package p007c.p190n.p194b.p334e.p360t;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.C4801b;

/* JADX INFO: renamed from: c.n.b.e.t.k, reason: use source file name */
/* JADX INFO: compiled from: ThemeEnforcement.java */
/* JADX INFO: loaded from: classes.dex */
public final class ThemeEnforcement {

    /* JADX INFO: renamed from: a */
    public static final int[] f25506a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b */
    public static final int[] f25507b = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: a */
    public static void m11344a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24745Q, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m11346c(context, f25507b, "Theme.MaterialComponents");
            }
        }
        m11346c(context, f25506a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    public static void m11345b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24745Q, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX INFO: renamed from: c */
    public static void m11346c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                if (z) {
                    throw new IllegalArgumentException(outline.m1600v("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        z = true;
        if (z) {
            throw new IllegalArgumentException(outline.m1600v("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* JADX INFO: renamed from: d */
    public static TypedArray m11347d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m11344a(context, attributeSet, i, i2);
        m11345b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
