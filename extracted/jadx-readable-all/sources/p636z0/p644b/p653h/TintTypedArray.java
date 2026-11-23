package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.p727d.p728c.ResourcesCompat;

/* JADX INFO: renamed from: z0.b.h.y0, reason: use source file name */
/* JADX INFO: compiled from: TintTypedArray.java */
/* JADX INFO: loaded from: classes.dex */
public class TintTypedArray {

    /* JADX INFO: renamed from: a */
    public final Context f35266a;

    /* JADX INFO: renamed from: b */
    public final TypedArray f35267b;

    /* JADX INFO: renamed from: c */
    public TypedValue f35268c;

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.f35266a = context;
        this.f35267b = typedArray;
    }

    /* JADX INFO: renamed from: q */
    public static TintTypedArray m14997q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: r */
    public static TintTypedArray m14998r(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: a */
    public boolean m14999a(int i, boolean z) {
        return this.f35267b.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: b */
    public int m15000b(int i, int i2) {
        return this.f35267b.getColor(i, i2);
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m15001c(int i) {
        int resourceId;
        ColorStateList colorStateListM14706a;
        return (!this.f35267b.hasValue(i) || (resourceId = this.f35267b.getResourceId(i, 0)) == 0 || (colorStateListM14706a = AppCompatResources.m14706a(this.f35266a, resourceId)) == null) ? this.f35267b.getColorStateList(i) : colorStateListM14706a;
    }

    /* JADX INFO: renamed from: d */
    public float m15002d(int i, float f) {
        return this.f35267b.getDimension(i, f);
    }

    /* JADX INFO: renamed from: e */
    public int m15003e(int i, int i2) {
        return this.f35267b.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: f */
    public int m15004f(int i, int i2) {
        return this.f35267b.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: g */
    public Drawable m15005g(int i) {
        int resourceId;
        return (!this.f35267b.hasValue(i) || (resourceId = this.f35267b.getResourceId(i, 0)) == 0) ? this.f35267b.getDrawable(i) : AppCompatResources.m14707b(this.f35266a, resourceId);
    }

    /* JADX INFO: renamed from: h */
    public Drawable m15006h(int i) {
        int resourceId;
        Drawable drawableM14939g;
        if (!this.f35267b.hasValue(i) || (resourceId = this.f35267b.getResourceId(i, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager appCompatDrawableManagerM14904a = AppCompatDrawableManager.m14904a();
        Context context = this.f35266a;
        synchronized (appCompatDrawableManagerM14904a) {
            drawableM14939g = appCompatDrawableManagerM14904a.f35071c.m14939g(context, resourceId, true);
        }
        return drawableM14939g;
    }

    /* JADX INFO: renamed from: i */
    public Typeface m15007i(int i, int i2, ResourcesCompat.c cVar) {
        int resourceId = this.f35267b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f35268c == null) {
            this.f35268c = new TypedValue();
        }
        Context context = this.f35266a;
        TypedValue typedValue = this.f35268c;
        ThreadLocal<TypedValue> threadLocal = ResourcesCompat.f37835a;
        if (context.isRestricted()) {
            return null;
        }
        return ResourcesCompat.m16158a(context, resourceId, typedValue, i2, cVar, null, true, false);
    }

    /* JADX INFO: renamed from: j */
    public int m15008j(int i, int i2) {
        return this.f35267b.getInt(i, i2);
    }

    /* JADX INFO: renamed from: k */
    public int m15009k(int i, int i2) {
        return this.f35267b.getInteger(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public int m15010l(int i, int i2) {
        return this.f35267b.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public int m15011m(int i, int i2) {
        return this.f35267b.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public String m15012n(int i) {
        return this.f35267b.getString(i);
    }

    /* JADX INFO: renamed from: o */
    public CharSequence m15013o(int i) {
        return this.f35267b.getText(i);
    }

    /* JADX INFO: renamed from: p */
    public boolean m15014p(int i) {
        return this.f35267b.hasValue(i);
    }
}
