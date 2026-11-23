package p007c.p190n.p194b.p334e.p337c;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: renamed from: c.n.b.e.c.g, reason: use source file name */
/* JADX INFO: compiled from: MatrixEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a */
    public final float[] f24803a = new float[9];

    /* JADX INFO: renamed from: b */
    public final float[] f24804b = new float[9];

    /* JADX INFO: renamed from: c */
    public final Matrix f24805c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f24803a);
        matrix2.getValues(this.f24804b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f24804b;
            float f2 = fArr[i];
            float[] fArr2 = this.f24803a;
            fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
        }
        this.f24805c.setValues(this.f24804b);
        return this.f24805c;
    }
}
