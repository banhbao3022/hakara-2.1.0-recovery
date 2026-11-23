package p007c.p114h.p126d.p129c.p141h;

import android.content.Context;
import android.opengl.GLES30;
import android.opengl.Matrix;
import java.nio.FloatBuffer;
import java.util.Objects;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicSticker;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicStickerData;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicStickerNormalData;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p126d.p129c.p143i.TextureRotationUtils;
import p007c.p114h.p144e.LandmarkEngine;
import p007c.p114h.p144e.OneFace;

/* JADX INFO: renamed from: c.h.d.c.h.d, reason: use source file name */
/* JADX INFO: compiled from: DynamicStickerNormalFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class DynamicStickerNormalFilter extends DynamicStickerBaseFilter {

    /* JADX INFO: renamed from: E */
    public int f4232E;

    /* JADX INFO: renamed from: F */
    public float[] f4233F;

    /* JADX INFO: renamed from: G */
    public float[] f4234G;

    /* JADX INFO: renamed from: H */
    public float[] f4235H;

    /* JADX INFO: renamed from: I */
    public float[] f4236I;

    /* JADX INFO: renamed from: J */
    public float f4237J;

    /* JADX INFO: renamed from: K */
    public FloatBuffer f4238K;

    /* JADX INFO: renamed from: L */
    public FloatBuffer f4239L;

    /* JADX INFO: renamed from: M */
    public float[] f4240M;

    public DynamicStickerNormalFilter(Context context, DynamicSticker dynamicSticker) {
        super(context, dynamicSticker, OpenGLUtils.m2186k(context, "shader/sticker/vertex_sticker_normal.glsl"), OpenGLUtils.m2186k(context, "shader/sticker/fragment_sticker_normal.glsl"));
        this.f4233F = new float[16];
        this.f4234G = new float[16];
        this.f4235H = new float[16];
        this.f4236I = new float[16];
        this.f4240M = new float[8];
        DynamicSticker dynamicSticker2 = this.f4216C;
        if (dynamicSticker2 != null && dynamicSticker2.f4258a != null) {
            for (int i = 0; i < this.f4216C.f4258a.size(); i++) {
                if (this.f4216C.f4258a.get(i) instanceof DynamicStickerNormalData) {
                    Objects.requireNonNull(this.f4216C);
                    Objects.requireNonNull(this.f4216C.f4258a.get(i));
                    this.f4217D.add(new DynamicStickerLoader(this, this.f4216C.f4258a.get(i), "null/null"));
                }
            }
        }
        Matrix.setIdentityM(this.f4233F, 0);
        Matrix.setIdentityM(this.f4234G, 0);
        Matrix.setIdentityM(this.f4235H, 0);
        Matrix.setIdentityM(this.f4236I, 0);
        FloatBuffer floatBuffer = this.f4238K;
        if (floatBuffer != null) {
            floatBuffer.clear();
            this.f4238K = null;
        }
        FloatBuffer floatBuffer2 = this.f4239L;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
            this.f4239L = null;
        }
        this.f4238K = OpenGLUtils.m2178c(TextureRotationUtils.f4260a);
        this.f4239L = OpenGLUtils.m2178c(TextureRotationUtils.f4262c);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        return super.mo2129d(mo2130e(i, floatBuffer, floatBuffer2), floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        OneFace oneFace;
        Matrix.setIdentityM(this.f4236I, 0);
        super.mo2130e(i, floatBuffer, floatBuffer2);
        if (this.f4217D.size() > 0 && LandmarkEngine.b.f4266a.m2193c()) {
            int iM2192b = LandmarkEngine.b.f4266a.m2192b();
            DynamicStickerData dynamicStickerData = this.f4217D.get(0).f4227e;
            int iMin = Math.min(iM2192b, 0);
            for (int i2 = 0; i2 < iMin; i2++) {
                LandmarkEngine landmarkEngine = LandmarkEngine.b.f4266a;
                synchronized (landmarkEngine.f4264a) {
                    oneFace = landmarkEngine.f4265b.get(i2);
                    if (oneFace == null) {
                        oneFace = new OneFace();
                    }
                }
                if (oneFace.f4267a > 0.5f) {
                    for (int i3 = 0; i3 < this.f4217D.size(); i3++) {
                        synchronized (this) {
                            this.f4217D.get(i3).m2174b();
                            DynamicStickerNormalData dynamicStickerNormalData = (DynamicStickerNormalData) this.f4217D.get(i3).f4227e;
                            float[] fArr = oneFace.f4273g;
                            if (fArr != null) {
                                Objects.requireNonNull(dynamicStickerNormalData);
                                float f = (fArr[0] * 0.5f) + 0.5f;
                                float f2 = this.f4040n;
                                float f3 = f * f2;
                                float[] fArr2 = oneFace.f4273g;
                                float f4 = (fArr2[1] * 0.5f) + 0.5f;
                                float f5 = this.f4041o;
                                float f6 = ((fArr2[0] * 0.5f) + 0.5f) * f2;
                                Math.sqrt(Math.pow((f4 * f5) - (((fArr2[1] * 0.5f) + 0.5f) * f5), 2.0d) + Math.pow(f3 - f6, 2.0d));
                                throw null;
                            }
                            super.mo2130e(this.f4217D.get(i3).f4224b, this.f4238K, this.f4239L);
                        }
                    }
                }
            }
            GLES30.glFlush();
        }
        return this.f4047u[0];
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        int i = this.f4036j;
        if (i != -1) {
            this.f4232E = GLES30.glGetUniformLocation(i, "uMVPMatrix");
        } else {
            this.f4232E = -1;
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: k */
    public void mo2141k() {
        GLES30.glDisable(3042);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        int i = this.f4232E;
        if (i != -1) {
            GLES30.glUniformMatrix4fv(i, 1, false, this.f4236I, 0);
        }
        GLES30.glEnable(3042);
        GLES30.glBlendEquation(32774);
        GLES30.glBlendFuncSeparate(1, 771, 1, 1);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        float f = i / i2;
        this.f4237J = f;
        Matrix.frustumM(this.f4233F, 0, -f, f, -1.0f, 1.0f, 3.0f, 9.0f);
        Matrix.setLookAtM(this.f4234G, 0, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageAudioFilter, p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        FloatBuffer floatBuffer = this.f4238K;
        if (floatBuffer != null) {
            floatBuffer.clear();
            this.f4238K = null;
        }
        FloatBuffer floatBuffer2 = this.f4239L;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
            this.f4239L = null;
        }
    }
}
