package p636z0.p685e0;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: z0.e0.f, reason: use source file name */
/* JADX INFO: compiled from: RectEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {
    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left;
        int i2 = i + ((int) ((rect4.left - i) * f));
        int i3 = rect3.top;
        int i4 = i3 + ((int) ((rect4.top - i3) * f));
        int i5 = rect3.right;
        int i6 = i5 + ((int) ((rect4.right - i5) * f));
        int i7 = rect3.bottom;
        return new Rect(i2, i4, i6, i7 + ((int) ((rect4.bottom - i7) * f)));
    }
}
