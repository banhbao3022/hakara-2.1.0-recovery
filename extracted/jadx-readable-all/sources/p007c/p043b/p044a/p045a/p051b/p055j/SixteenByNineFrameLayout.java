package p007c.p043b.p044a.p045a.p051b.p055j;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.b.j.b, reason: use source file name */
/* JADX INFO: compiled from: SixteenByNineFrameLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public class SixteenByNineFrameLayout extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SixteenByNineFrameLayout(Context context) {
        this(context, null);
        Intrinsics2.m13090f(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) * 9) / 16, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SixteenByNineFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics2.m13090f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SixteenByNineFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13090f(context, "context");
    }

    public /* synthetic */ SixteenByNineFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
