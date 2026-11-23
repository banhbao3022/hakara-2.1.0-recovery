package p007c.p190n.p194b.p334e.p355o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p365y.AbsoluteCornerSize;
import p007c.p190n.p194b.p334e.p365y.CornerSize;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.o.b, reason: use source file name */
/* JADX INFO: compiled from: CalendarItemStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class CalendarItemStyle {

    /* JADX INFO: renamed from: a */
    public final Rect f25214a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f25215b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f25216c;

    /* JADX INFO: renamed from: d */
    public final ColorStateList f25217d;

    /* JADX INFO: renamed from: e */
    public final int f25218e;

    /* JADX INFO: renamed from: f */
    public final ShapeAppearanceModel f25219f;

    public CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        C8162a.m16062g(rect.left);
        C8162a.m16062g(rect.top);
        C8162a.m16062g(rect.right);
        C8162a.m16062g(rect.bottom);
        this.f25214a = rect;
        this.f25215b = colorStateList2;
        this.f25216c = colorStateList;
        this.f25217d = colorStateList3;
        this.f25218e = i;
        this.f25219f = shapeAppearanceModel;
    }

    /* JADX INFO: renamed from: a */
    public static CalendarItemStyle m11211a(Context context, int i) {
        C8162a.m16061f(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C4801b.f24771z);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM10961L = C4799a.m10961L(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM10961L2 = C4799a.m10961L(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM10961L3 = C4799a.m10961L(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        CornerSize cornerSize = ShapeAppearanceModel.f25618a;
        ShapeAppearanceModel shapeAppearanceModelM11398a = ShapeAppearanceModel.m11391a(context, resourceId, resourceId2, new AbsoluteCornerSize(0)).m11398a();
        typedArrayObtainStyledAttributes.recycle();
        return new CalendarItemStyle(colorStateListM10961L, colorStateListM10961L2, colorStateListM10961L3, dimensionPixelSize, shapeAppearanceModelM11398a, rect);
    }

    /* JADX INFO: renamed from: b */
    public void m11212b(TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f25219f);
        materialShapeDrawable2.setShapeAppearanceModel(this.f25219f);
        materialShapeDrawable.m11381q(this.f25216c);
        materialShapeDrawable.m11387w(this.f25218e, this.f25217d);
        textView.setTextColor(this.f25215b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f25215b.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f25214a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        textView.setBackground(insetDrawable);
    }
}
