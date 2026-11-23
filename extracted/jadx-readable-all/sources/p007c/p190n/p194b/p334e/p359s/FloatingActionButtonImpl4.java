package p007c.p190n.p194b.p334e.p359s;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: c.n.b.e.s.i, reason: use source file name */
/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButtonImpl4 implements TypeEvaluator<Float> {

    /* JADX INFO: renamed from: a */
    public FloatEvaluator f25412a = new FloatEvaluator();

    public FloatingActionButtonImpl4(FloatingActionButtonImpl3 floatingActionButtonImpl3) {
    }

    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f, Float f2, Float f3) {
        float fFloatValue = this.f25412a.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
