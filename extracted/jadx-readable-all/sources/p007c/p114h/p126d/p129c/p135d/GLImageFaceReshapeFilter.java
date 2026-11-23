package p007c.p114h.p126d.p129c.p135d;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Objects;
import p007c.p114h.p126d.p129c.p130a.GLImageDrawElementsFilter;
import p007c.p114h.p126d.p129c.p131b.p132g.BeautyParam;
import p007c.p114h.p126d.p129c.p131b.p132g.IBeautify;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p126d.p129c.p143i.TextureRotationUtils;
import p007c.p114h.p144e.LandmarkEngine;

/* JADX INFO: renamed from: c.h.d.c.d.b, reason: use source file name */
/* JADX INFO: compiled from: GLImageFaceReshapeFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageFaceReshapeFilter extends GLImageDrawElementsFilter implements IBeautify {

    /* JADX INFO: renamed from: x */
    public static final short[] f4158x = {110, 114, 111, 111, 114, 115, 115, 111, 32, 32, 115, 116, 116, 32, 31, 31, 116, 30, 30, 116, 29, 29, 116, 28, 28, 116, 27, 27, 116, 26, 26, 116, 25, 25, 116, 117, 117, 25, 24, 24, 117, 23, 23, 117, 22, 22, 117, 21, 21, 117, 20, 20, 117, 19, 19, 117, 118, 118, 19, 18, 18, 118, 17, 17, 118, 16, 16, 118, 15, 15, 118, 14, 14, 118, 13, 13, 118, 119, 119, 13, 12, 12, 119, 11, 11, 119, 10, 10, 119, 9, 9, 119, 8, 8, 119, 7, 7, 119, 120, 120, 7, 6, 6, 120, 5, 5, 120, 4, 4, 120, 3, 3, 120, 2, 2, 120, 1, 1, 120, 0, 0, 120, 121, 121, 0, 109, 109, 121, 114, 114, 109, 110, 0, 33, 109, 109, 33, 34, 34, 109, 35, 35, 109, 36, 36, 109, 110, 36, 110, 37, 37, 110, 43, 43, 110, 38, 38, 110, 39, 39, 110, 111, 111, 39, 40, 40, 111, 41, 41, 111, 42, 42, 111, 32, 33, 34, 64, 64, 34, 65, 65, 34, 107, 107, 34, 35, 35, 36, 107, 107, 36, 66, 66, 107, 65, 66, 36, 67, 67, 36, 37, 37, 67, 43, 43, 38, 68, 68, 38, 39, 39, 68, 69, 39, 40, 108, 39, 108, 69, 69, 108, 70, 70, 108, 41, 41, 108, 40, 41, 70, 71, 71, 41, 42, 0, 33, 52, 33, 52, 64, 52, 64, 53, 64, 53, 65, 65, 53, 72, 65, 72, 66, 66, 72, 54, 66, 54, 67, 54, 67, 55, 67, 55, 78, 67, 78, 43, 52, 53, 57, 53, 72, 74, 53, 74, 57, 74, 57, 73, 72, 54, 104, 72, 104, 74, 74, 104, 73, 73, 104, 56, 104, 56, 54, 54, 56, 55, 68, 43, 79, 68, 79, 58, 68, 58, 59, 68, 59, 69, 69, 59, 75, 69, 75, 70, 70, 75, 60, 70, 60, 71, 71, 60, 61, 71, 61, 42, 42, 61, 32, 61, 60, 62, 60, 75, 77, 60, 77, 62, 77, 62, 76, 75, 77, 105, 77, 105, 76, 105, 76, 63, 105, 63, 59, 105, 59, 75, 59, 63, 58, 0, 52, 1, 1, 52, 2, 2, 52, 57, 2, 57, 3, 3, 57, 4, 4, 57, 112, 57, 112, 74, 74, 112, 56, 56, 112, 80, 80, 112, 82, 82, 112, 7, 7, 112, 6, 6, 112, 5, 5, 112, 4, 56, 80, 55, 55, 80, 78, 32, 61, 31, 31, 61, 30, 30, 61, 62, 30, 62, 29, 29, 62, 28, 28, 62, 113, 62, 113, 76, 76, 113, 63, 63, 113, 81, 81, 113, 83, 83, 113, 25, 25, 113, 26, 26, 113, 27, 27, 113, 28, 63, 81, 58, 58, 81, 79, 78, 43, 44, 43, 44, 79, 78, 44, 80, 79, 81, 44, 80, 44, 45, 44, 81, 45, 80, 45, 46, 45, 81, 46, 80, 46, 82, 81, 46, 83, 82, 46, 47, 47, 46, 48, 48, 46, 49, 49, 46, 50, 50, 46, 51, 51, 46, 83, 7, 82, 84, 82, 84, 47, 84, 47, 85, 85, 47, 48, 48, 85, 86, 86, 48, 49, 49, 86, 87, 49, 87, 88, 88, 49, 50, 88, 50, 89, 89, 50, 51, 89, 51, 90, 51, 90, 83, 83, 90, 25, 84, 85, 96, 96, 85, 97, 97, 85, 86, 86, 97, 98, 86, 98, 87, 87, 98, 88, 88, 98, 99, 88, 99, 89, 89, 99, 100, 89, 100, 90, 90, 100, 91, 100, 91, 101, 101, 91, 92, 101, 92, 102, 102, 92, 93, 102, 93, 94, 102, 94, 103, 103, 94, 95, 103, 95, 96, 96, 95, 84, 96, 97, 103, 97, 103, 106, 97, 106, 98, 106, 103, 102, 106, 102, 101, 106, 101, 99, 106, 98, 99, 99, 101, 100, 7, 84, 8, 8, 84, 9, 9, 84, 10, 10, 84, 95, 10, 95, 11, 11, 95, 12, 12, 95, 94, 12, 94, 13, 13, 94, 14, 14, 94, 93, 14, 93, 15, 15, 93, 16, 16, 93, 17, 17, 93, 18, 18, 93, 92, 18, 92, 19, 19, 92, 20, 20, 92, 91, 20, 91, 21, 21, 91, 22, 22, 91, 90, 22, 90, 23, 23, 90, 24, 24, 90, 25};

    /* JADX INFO: renamed from: A */
    public float[] f4159A;

    /* JADX INFO: renamed from: B */
    public float[] f4160B;

    /* JADX INFO: renamed from: C */
    public FloatBuffer f4161C;

    /* JADX INFO: renamed from: D */
    public FloatBuffer f4162D;

    /* JADX INFO: renamed from: E */
    public FloatBuffer f4163E;

    /* JADX INFO: renamed from: F */
    public int f4164F;

    /* JADX INFO: renamed from: G */
    public int f4165G;

    /* JADX INFO: renamed from: H */
    public int f4166H;

    /* JADX INFO: renamed from: I */
    public int f4167I;

    /* JADX INFO: renamed from: J */
    public int f4168J;

    /* JADX INFO: renamed from: y */
    public float[] f4169y;

    /* JADX INFO: renamed from: z */
    public float[] f4170z;

    public GLImageFaceReshapeFilter(Context context) {
        super(context, OpenGLUtils.m2186k(context, "shader/face/vertex_face_reshape.glsl"), OpenGLUtils.m2186k(context, "shader/face/fragment_face_reshape.glsl"));
        this.f4169y = new float[244];
        this.f4170z = new float[244];
        this.f4159A = new float[212];
        this.f4160B = new float[12];
    }

    @Override // p007c.p114h.p126d.p129c.p131b.p132g.IBeautify
    /* JADX INFO: renamed from: a */
    public void mo2149a(BeautyParam beautyParam) {
        if (beautyParam == null) {
            return;
        }
        float[] fArr = this.f4160B;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        m2152w();
        return LandmarkEngine.b.f4266a.m2193c() ? super.mo2129d(i, this.f4161C, this.f4162D) : super.mo2129d(i, floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        m2152w();
        return LandmarkEngine.b.f4266a.m2193c() ? super.mo2130e(i, this.f4161C, this.f4162D) : super.mo2130e(i, floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        int i = this.f4036j;
        if (i != -1) {
            this.f4164F = GLES30.glGetUniformLocation(i, "cartesianPoints");
            this.f4165G = GLES30.glGetUniformLocation(this.f4036j, "reshapeIntensity");
            this.f4166H = GLES30.glGetUniformLocation(this.f4036j, "textureWidth");
            this.f4167I = GLES30.glGetUniformLocation(this.f4036j, "textureHeight");
            this.f4168J = GLES30.glGetUniformLocation(this.f4036j, "enableReshape");
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        GLES30.glDisable(2884);
        GLES30.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES30.glClear(16384);
        GLES20.glUniform1fv(this.f4165G, 7, FloatBuffer.wrap(this.f4160B));
        GLES30.glUniform2fv(this.f4164F, 106, this.f4163E);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        m2147t(this.f4166H, i);
        m2147t(this.f4167I, i2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageDrawElementsFilter
    /* JADX INFO: renamed from: u */
    public void mo2137u() {
        this.f4161C = ByteBuffer.allocateDirect(976).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4162D = ByteBuffer.allocateDirect(976).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4163E = ByteBuffer.allocateDirect(848).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4025v = OpenGLUtils.m2182g(f4158x);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageDrawElementsFilter
    /* JADX INFO: renamed from: v */
    public void mo2138v() {
        super.mo2138v();
        FloatBuffer floatBuffer = this.f4161C;
        if (floatBuffer != null) {
            floatBuffer.clear();
            this.f4161C = null;
        }
        FloatBuffer floatBuffer2 = this.f4162D;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
            this.f4162D = null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2152w() {
        if (!LandmarkEngine.b.f4266a.m2193c()) {
            this.f4025v.clear();
            this.f4025v.put(TextureRotationUtils.f4263d);
            this.f4025v.position(0);
            this.f4026w = 6;
            m2147t(this.f4168J, 0);
            return;
        }
        LandmarkEngine landmarkEngine = LandmarkEngine.b.f4266a;
        float[] fArr = this.f4169y;
        float[] fArr2 = this.f4170z;
        Objects.requireNonNull(landmarkEngine);
        if (fArr != null && fArr.length == 244 && fArr2 != null && fArr2.length == 244) {
            landmarkEngine.m2191a(fArr, 0);
            if (fArr.length >= 244) {
                fArr[228] = 0.0f;
                fArr[229] = 1.0f;
                fArr[230] = 1.0f;
                fArr[231] = 1.0f;
                fArr[232] = 1.0f;
                fArr[233] = 0.0f;
                fArr[234] = 1.0f;
                fArr[235] = -1.0f;
                fArr[236] = -fArr[228];
                fArr[237] = -fArr[229];
                fArr[238] = -fArr[230];
                fArr[239] = -fArr[231];
                fArr[240] = -fArr[232];
                fArr[241] = -fArr[233];
                fArr[242] = -fArr[234];
                fArr[243] = -fArr[235];
            }
            for (int i = 0; i < fArr.length; i++) {
                fArr2[i] = (fArr[i] * 0.5f) + 0.5f;
            }
        }
        this.f4161C.clear();
        this.f4161C.put(this.f4169y);
        this.f4161C.position(0);
        this.f4162D.clear();
        this.f4162D.put(this.f4170z);
        this.f4162D.position(0);
        for (int i2 = 0; i2 < 106; i2++) {
            float[] fArr3 = this.f4159A;
            int i3 = i2 * 2;
            float[] fArr4 = this.f4170z;
            fArr3[i3] = fArr4[i3] * this.f4040n;
            int i4 = i3 + 1;
            fArr3[i4] = fArr4[i4] * this.f4041o;
        }
        this.f4163E.clear();
        this.f4163E.put(this.f4159A);
        this.f4163E.position(0);
        this.f4025v.clear();
        this.f4025v.put(f4158x);
        this.f4025v.position(0);
        this.f4026w = this.f4025v.capacity();
        m2147t(this.f4168J, 1);
    }
}
