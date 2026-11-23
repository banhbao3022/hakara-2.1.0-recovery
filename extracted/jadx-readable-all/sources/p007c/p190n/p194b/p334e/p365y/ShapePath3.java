package p007c.p190n.p194b.p334e.p365y;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p334e.p364x.ShadowRenderer;

/* JADX INFO: renamed from: c.n.b.e.y.m, reason: use source file name */
/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapePath3 {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public float f25658a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public float f25659b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public float f25660c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public float f25661d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public float f25662e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public float f25663f;

    /* JADX INFO: renamed from: g */
    public final List<e> f25664g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final List<f> f25665h = new ArrayList();

    /* JADX INFO: renamed from: c.n.b.e.y.m$a */
    /* JADX INFO: compiled from: ShapePath.java */
    public static class a extends f {

        /* JADX INFO: renamed from: b */
        public final c f25666b;

        public a(c cVar) {
            this.f25666b = cVar;
        }

        @Override // p007c.p190n.p194b.p334e.p365y.ShapePath3.f
        /* JADX INFO: renamed from: a */
        public void mo11406a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            c cVar = this.f25666b;
            float f = cVar.f25675g;
            float f2 = cVar.f25676h;
            c cVar2 = this.f25666b;
            RectF rectF = new RectF(cVar2.f25671c, cVar2.f25672d, cVar2.f25673e, cVar2.f25674f);
            boolean z = f2 < 0.0f;
            Path path = shadowRenderer.f25563k;
            if (z) {
                int[] iArr = ShadowRenderer.f25555c;
                iArr[0] = 0;
                iArr[1] = shadowRenderer.f25562j;
                iArr[2] = shadowRenderer.f25561i;
                iArr[3] = shadowRenderer.f25560h;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                int[] iArr2 = ShadowRenderer.f25555c;
                iArr2[0] = 0;
                iArr2[1] = shadowRenderer.f25560h;
                iArr2[2] = shadowRenderer.f25561i;
                iArr2[3] = shadowRenderer.f25562j;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f4 = 1.0f - (i / fWidth);
            float[] fArr = ShadowRenderer.f25556d;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            shadowRenderer.f25558f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, ShadowRenderer.f25555c, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, shadowRenderer.f25564l);
            }
            canvas.drawArc(rectF, f, f2, true, shadowRenderer.f25558f);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.y.m$b */
    /* JADX INFO: compiled from: ShapePath.java */
    public static class b extends f {

        /* JADX INFO: renamed from: b */
        public final d f25667b;

        /* JADX INFO: renamed from: c */
        public final float f25668c;

        /* JADX INFO: renamed from: d */
        public final float f25669d;

        public b(d dVar, float f, float f2) {
            this.f25667b = dVar;
            this.f25668c = f;
            this.f25669d = f2;
        }

        @Override // p007c.p190n.p194b.p334e.p365y.ShapePath3.f
        /* JADX INFO: renamed from: a */
        public void mo11406a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            d dVar = this.f25667b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(dVar.f25678c - this.f25669d, dVar.f25677b - this.f25668c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f25668c, this.f25669d);
            matrix2.preRotate(m11413b());
            Objects.requireNonNull(shadowRenderer);
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = ShadowRenderer.f25553a;
            iArr[0] = shadowRenderer.f25562j;
            iArr[1] = shadowRenderer.f25561i;
            iArr[2] = shadowRenderer.f25560h;
            Paint paint = shadowRenderer.f25559g;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, ShadowRenderer.f25554b, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, shadowRenderer.f25559g);
            canvas.restore();
        }

        /* JADX INFO: renamed from: b */
        public float m11413b() {
            d dVar = this.f25667b;
            return (float) Math.toDegrees(Math.atan((dVar.f25678c - this.f25669d) / (dVar.f25677b - this.f25668c)));
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.y.m$c */
    /* JADX INFO: compiled from: ShapePath.java */
    public static class c extends e {

        /* JADX INFO: renamed from: b */
        public static final RectF f25670b = new RectF();

        /* JADX INFO: renamed from: c */
        @Deprecated
        public float f25671c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public float f25672d;

        /* JADX INFO: renamed from: e */
        @Deprecated
        public float f25673e;

        /* JADX INFO: renamed from: f */
        @Deprecated
        public float f25674f;

        /* JADX INFO: renamed from: g */
        @Deprecated
        public float f25675g;

        /* JADX INFO: renamed from: h */
        @Deprecated
        public float f25676h;

        public c(float f, float f2, float f3, float f4) {
            this.f25671c = f;
            this.f25672d = f2;
            this.f25673e = f3;
            this.f25674f = f4;
        }

        @Override // p007c.p190n.p194b.p334e.p365y.ShapePath3.e
        /* JADX INFO: renamed from: a */
        public void mo11414a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f25679a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f25670b;
            rectF.set(this.f25671c, this.f25672d, this.f25673e, this.f25674f);
            path.arcTo(rectF, this.f25675g, this.f25676h, false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.y.m$d */
    /* JADX INFO: compiled from: ShapePath.java */
    public static class d extends e {

        /* JADX INFO: renamed from: b */
        public float f25677b;

        /* JADX INFO: renamed from: c */
        public float f25678c;

        @Override // p007c.p190n.p194b.p334e.p365y.ShapePath3.e
        /* JADX INFO: renamed from: a */
        public void mo11414a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f25679a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f25677b, this.f25678c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.y.m$e */
    /* JADX INFO: compiled from: ShapePath.java */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public final Matrix f25679a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo11414a(Matrix matrix, Path path);
    }

    /* JADX INFO: renamed from: c.n.b.e.y.m$f */
    /* JADX INFO: compiled from: ShapePath.java */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        public static final Matrix f25680a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo11406a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);
    }

    public ShapePath3() {
        m11411e(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m11407a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f25675g = f6;
        cVar.f25676h = f7;
        this.f25664g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        m11408b(f6);
        this.f25665h.add(aVar);
        this.f25662e = f9;
        double d2 = f8;
        this.f25660c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.f25661d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public final void m11408b(float f2) {
        float f3 = this.f25662e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f25660c;
        float f6 = this.f25661d;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f25675g = this.f25662e;
        cVar.f25676h = f4;
        this.f25665h.add(new a(cVar));
        this.f25662e = f2;
    }

    /* JADX INFO: renamed from: c */
    public void m11409c(Matrix matrix, Path path) {
        int size = this.f25664g.size();
        for (int i = 0; i < size; i++) {
            this.f25664g.get(i).mo11414a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11410d(float f2, float f3) {
        d dVar = new d();
        dVar.f25677b = f2;
        dVar.f25678c = f3;
        this.f25664g.add(dVar);
        b bVar = new b(dVar, this.f25660c, this.f25661d);
        float fM11413b = bVar.m11413b() + 270.0f;
        float fM11413b2 = bVar.m11413b() + 270.0f;
        m11408b(fM11413b);
        this.f25665h.add(bVar);
        this.f25662e = fM11413b2;
        this.f25660c = f2;
        this.f25661d = f3;
    }

    /* JADX INFO: renamed from: e */
    public void m11411e(float f2, float f3) {
        m11412f(f2, f3, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public void m11412f(float f2, float f3, float f4, float f5) {
        this.f25658a = f2;
        this.f25659b = f3;
        this.f25660c = f2;
        this.f25661d = f3;
        this.f25662e = f4;
        this.f25663f = (f4 + f5) % 360.0f;
        this.f25664g.clear();
        this.f25665h.clear();
    }

    public ShapePath3(float f2, float f3) {
        m11412f(f2, f3, 270.0f, 0.0f);
    }
}
