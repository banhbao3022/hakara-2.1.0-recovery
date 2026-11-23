package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0094a c0094a = (ConstraintLayout.C0094a) getLayoutParams();
        c0094a.f568a = i;
        setLayoutParams(c0094a);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0094a c0094a = (ConstraintLayout.C0094a) getLayoutParams();
        c0094a.f570b = i;
        setLayoutParams(c0094a);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0094a c0094a = (ConstraintLayout.C0094a) getLayoutParams();
        c0094a.f572c = f;
        setLayoutParams(c0094a);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
