package p007c.p190n.p194b.p334e.p365y;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.e.y.k, reason: use source file name */
/* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeAppearancePathProvider {

    /* JADX INFO: renamed from: a */
    public final ShapePath3[] f25643a = new ShapePath3[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f25644b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f25645c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f25646d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f25647e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f25648f = new Path();

    /* JADX INFO: renamed from: g */
    public final ShapePath3 f25649g = new ShapePath3();

    /* JADX INFO: renamed from: h */
    public final float[] f25650h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f25651i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f25652j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f25653k = new Path();

    /* JADX INFO: renamed from: l */
    public boolean f25654l = true;

    /* JADX INFO: renamed from: c.n.b.e.y.k$a */
    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final ShapeAppearancePathProvider f25655a = new ShapeAppearancePathProvider();
    }

    /* JADX INFO: renamed from: c.n.b.e.y.k$b */
    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    public interface b {
    }

    public ShapeAppearancePathProvider() {
        for (int i = 0; i < 4; i++) {
            this.f25643a[i] = new ShapePath3();
            this.f25644b[i] = new Matrix();
            this.f25645c[i] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m11404a(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, b bVar, Path path) {
        EdgeTreatment edgeTreatment;
        CornerSize cornerSize;
        CornerTreatment cornerTreatment;
        path.rewind();
        this.f25647e.rewind();
        this.f25648f.rewind();
        this.f25648f.addRect(rectF, Path.Direction.CW);
        int i = 0;
        while (i < 4) {
            if (i == 1) {
                cornerSize = shapeAppearanceModel.f25625h;
            } else if (i != 2) {
                cornerSize = i != 3 ? shapeAppearanceModel.f25624g : shapeAppearanceModel.f25623f;
            } else {
                cornerSize = shapeAppearanceModel.f25626i;
            }
            if (i == 1) {
                cornerTreatment = shapeAppearanceModel.f25621d;
            } else if (i != 2) {
                cornerTreatment = i != 3 ? shapeAppearanceModel.f25620c : shapeAppearanceModel.f25619b;
            } else {
                cornerTreatment = shapeAppearanceModel.f25622e;
            }
            ShapePath3 shapePath3 = this.f25643a[i];
            Objects.requireNonNull(cornerTreatment);
            cornerTreatment.mo11364a(shapePath3, 90.0f, f, cornerSize.mo11363a(rectF));
            int i2 = i + 1;
            float f2 = i2 * 90;
            this.f25644b[i].reset();
            PointF pointF = this.f25646d;
            if (i == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            Matrix matrix = this.f25644b[i];
            PointF pointF2 = this.f25646d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f25644b[i].preRotate(f2);
            float[] fArr = this.f25650h;
            ShapePath3[] shapePath3Arr = this.f25643a;
            fArr[0] = shapePath3Arr[i].f25660c;
            fArr[1] = shapePath3Arr[i].f25661d;
            this.f25644b[i].mapPoints(fArr);
            this.f25645c[i].reset();
            Matrix matrix2 = this.f25645c[i];
            float[] fArr2 = this.f25650h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.f25645c[i].preRotate(f2);
            i = i2;
        }
        int i3 = 0;
        while (i3 < 4) {
            float[] fArr3 = this.f25650h;
            ShapePath3[] shapePath3Arr2 = this.f25643a;
            fArr3[0] = shapePath3Arr2[i3].f25658a;
            fArr3[1] = shapePath3Arr2[i3].f25659b;
            this.f25644b[i3].mapPoints(fArr3);
            if (i3 == 0) {
                float[] fArr4 = this.f25650h;
                path.moveTo(fArr4[0], fArr4[1]);
            } else {
                float[] fArr5 = this.f25650h;
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f25643a[i3].m11409c(this.f25644b[i3], path);
            if (bVar != null) {
                ShapePath3 shapePath4 = this.f25643a[i3];
                Matrix matrix3 = this.f25644b[i3];
                MaterialShapeDrawable.a aVar = (MaterialShapeDrawable.a) bVar;
                BitSet bitSet = MaterialShapeDrawable.this.f25577k;
                Objects.requireNonNull(shapePath4);
                bitSet.set(i3, false);
                ShapePath3.f[] fVarArr = MaterialShapeDrawable.this.f25575i;
                shapePath4.m11408b(shapePath4.f25663f);
                fVarArr[i3] = new ShapePath2(shapePath4, new ArrayList(shapePath4.f25665h), new Matrix(matrix3));
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.f25650h;
            ShapePath3[] shapePath3Arr3 = this.f25643a;
            fArr6[0] = shapePath3Arr3[i3].f25660c;
            fArr6[1] = shapePath3Arr3[i3].f25661d;
            this.f25644b[i3].mapPoints(fArr6);
            float[] fArr7 = this.f25651i;
            ShapePath3[] shapePath3Arr4 = this.f25643a;
            fArr7[0] = shapePath3Arr4[i5].f25658a;
            fArr7[1] = shapePath3Arr4[i5].f25659b;
            this.f25644b[i5].mapPoints(fArr7);
            float[] fArr8 = this.f25650h;
            float f3 = fArr8[0];
            float[] fArr9 = this.f25651i;
            float fMax = Math.max(((float) Math.hypot(f3 - fArr9[0], fArr8[1] - fArr9[1])) - 0.001f, 0.0f);
            float[] fArr10 = this.f25650h;
            ShapePath3[] shapePath3Arr5 = this.f25643a;
            fArr10[0] = shapePath3Arr5[i3].f25660c;
            fArr10[1] = shapePath3Arr5[i3].f25661d;
            this.f25644b[i3].mapPoints(fArr10);
            float fAbs = (i3 == 1 || i3 == 3) ? Math.abs(rectF.centerX() - this.f25650h[0]) : Math.abs(rectF.centerY() - this.f25650h[1]);
            this.f25649g.m11411e(0.0f, 0.0f);
            if (i3 == 1) {
                edgeTreatment = shapeAppearanceModel.f25629l;
            } else if (i3 != 2) {
                edgeTreatment = i3 != 3 ? shapeAppearanceModel.f25628k : shapeAppearanceModel.f25627j;
            } else {
                edgeTreatment = shapeAppearanceModel.f25630m;
            }
            edgeTreatment.mo11110a(fMax, fAbs, f, this.f25649g);
            this.f25652j.reset();
            this.f25649g.m11409c(this.f25645c[i3], this.f25652j);
            if (this.f25654l && (m11405b(this.f25652j, i3) || m11405b(this.f25652j, i5))) {
                Path path2 = this.f25652j;
                path2.op(path2, this.f25648f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f25650h;
                ShapePath3 shapePath5 = this.f25649g;
                fArr11[0] = shapePath5.f25658a;
                fArr11[1] = shapePath5.f25659b;
                this.f25645c[i3].mapPoints(fArr11);
                Path path3 = this.f25647e;
                float[] fArr12 = this.f25650h;
                path3.moveTo(fArr12[0], fArr12[1]);
                this.f25649g.m11409c(this.f25645c[i3], this.f25647e);
            } else {
                this.f25649g.m11409c(this.f25645c[i3], path);
            }
            if (bVar != null) {
                ShapePath3 shapePath6 = this.f25649g;
                Matrix matrix4 = this.f25645c[i3];
                MaterialShapeDrawable.a aVar2 = (MaterialShapeDrawable.a) bVar;
                Objects.requireNonNull(shapePath6);
                MaterialShapeDrawable.this.f25577k.set(i3 + 4, false);
                ShapePath3.f[] fVarArr2 = MaterialShapeDrawable.this.f25576j;
                shapePath6.m11408b(shapePath6.f25663f);
                fVarArr2[i3] = new ShapePath2(shapePath6, new ArrayList(shapePath6.f25665h), new Matrix(matrix4));
            }
            i3 = i4;
        }
        path.close();
        this.f25647e.close();
        if (this.f25647e.isEmpty()) {
            return;
        }
        path.op(this.f25647e, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11405b(Path path, int i) {
        this.f25653k.reset();
        this.f25643a[i].m11409c(this.f25644b[i], this.f25653k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f25653k.computeBounds(rectF, true);
        path.op(this.f25653k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
