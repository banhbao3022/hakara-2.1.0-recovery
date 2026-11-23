package p007c.p114h.p126d.p129c.p141h;

import android.content.Context;
import android.opengl.GLES30;
import com.badlogic.gdx.math.Matrix4;
import java.nio.FloatBuffer;
import java.util.Objects;
import p007c.p082f.p083a.p084a.OrthographicCamera;
import p007c.p082f.p083a.p084a.Quaternion;
import p007c.p082f.p083a.p084a.Vector3;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicSticker;
import p007c.p114h.p126d.p129c.p141h.p142g.StaticStickerNormalData;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p126d.p129c.p143i.TextureRotationUtils;

/* JADX INFO: renamed from: c.h.d.c.h.f, reason: use source file name */
/* JADX INFO: compiled from: StaticStickerNormalFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class StaticStickerNormalFilter extends DynamicStickerBaseFilter {

    /* JADX INFO: renamed from: E */
    public static final Vector3 f4241E = new Vector3();

    /* JADX INFO: renamed from: F */
    public static final Vector3 f4242F = new Vector3();

    /* JADX INFO: renamed from: G */
    public int f4243G;

    /* JADX INFO: renamed from: H */
    public final Matrix4 f4244H;

    /* JADX INFO: renamed from: I */
    public final Matrix4 f4245I;

    /* JADX INFO: renamed from: J */
    public final Matrix4 f4246J;

    /* JADX INFO: renamed from: K */
    public OrthographicCamera f4247K;

    /* JADX INFO: renamed from: L */
    public FloatBuffer f4248L;

    /* JADX INFO: renamed from: M */
    public FloatBuffer f4249M;

    /* JADX INFO: renamed from: N */
    public FloatBuffer f4250N;

    /* JADX INFO: renamed from: O */
    public final float[] f4251O;

    /* JADX INFO: renamed from: P */
    public final float[] f4252P;

    /* JADX INFO: renamed from: Q */
    public int f4253Q;

    /* JADX INFO: renamed from: R */
    public int f4254R;

    /* JADX INFO: renamed from: S */
    public float f4255S;

    /* JADX INFO: renamed from: T */
    public float f4256T;

    /* JADX INFO: renamed from: U */
    public float f4257U;

    public StaticStickerNormalFilter(Context context, DynamicSticker dynamicSticker) {
        super(context, dynamicSticker, OpenGLUtils.m2186k(context, "shader/sticker/vertex_sticker_normal.glsl"), OpenGLUtils.m2186k(context, "shader/sticker/fragment_sticker_normal.glsl"));
        this.f4244H = new Matrix4();
        this.f4245I = new Matrix4();
        this.f4246J = new Matrix4();
        this.f4251O = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f4252P = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f4253Q = 1;
        this.f4254R = 0;
        this.f4255S = 1.0f;
        DynamicSticker dynamicSticker2 = this.f4216C;
        if (dynamicSticker2 != null && dynamicSticker2.f4258a != null) {
            for (int i = 0; i < this.f4216C.f4258a.size(); i++) {
                if (this.f4216C.f4258a.get(i) instanceof StaticStickerNormalData) {
                    Objects.requireNonNull(this.f4216C);
                    Objects.requireNonNull(this.f4216C.f4258a.get(i));
                    this.f4217D.add(new DynamicStickerLoader(true, this, this.f4216C.f4258a.get(i), "null/null"));
                }
            }
        }
        this.f4247K = new OrthographicCamera();
        FloatBuffer floatBuffer = this.f4248L;
        if (floatBuffer != null) {
            floatBuffer.clear();
            this.f4248L = null;
        }
        FloatBuffer floatBuffer2 = this.f4250N;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
            this.f4250N = null;
        }
        FloatBuffer floatBuffer3 = this.f4249M;
        if (floatBuffer3 != null) {
            floatBuffer3.clear();
            this.f4249M = null;
        }
        this.f4250N = OpenGLUtils.m2178c(this.f4252P);
        this.f4248L = OpenGLUtils.m2178c(this.f4251O);
        this.f4249M = OpenGLUtils.m2178c(TextureRotationUtils.f4261b);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        return super.mo2129d(mo2130e(i, floatBuffer, floatBuffer2), floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        this.f4244H.m12560a();
        super.mo2130e(i, this.f4250N, floatBuffer2);
        if (this.f4217D.size() > 0) {
            for (int i2 = 0; i2 < this.f4217D.size(); i2++) {
                synchronized (this) {
                    this.f4217D.get(i2).m2174b();
                    m2175v((StaticStickerNormalData) this.f4217D.get(i2).f4227e);
                    super.mo2130e(this.f4217D.get(i2).f4224b, this.f4248L, this.f4249M);
                }
            }
        }
        return this.f4047u[0];
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        int i = this.f4036j;
        if (i != -1) {
            this.f4243G = GLES30.glGetUniformLocation(i, "uMVPMatrix");
        } else {
            this.f4243G = -1;
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: i */
    public void mo2133i(int i, int i2) {
        this.f4042p = i;
        this.f4043q = i2;
        OrthographicCamera orthographicCamera = this.f4247K;
        if (orthographicCamera != null) {
            orthographicCamera.f2828m = i;
            orthographicCamera.f2829n = i2;
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
        Matrix4 matrix4 = this.f4246J;
        matrix4.m12561b(this.f4245I);
        Matrix4.mul(matrix4.f28146m, this.f4244H.f28146m);
        int i = this.f4243G;
        if (i != -1) {
            GLES30.glUniformMatrix4fv(i, 1, false, this.f4246J.f28146m, 0);
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
        OrthographicCamera orthographicCamera = this.f4247K;
        if (orthographicCamera != null) {
            float f = i;
            float f2 = i2;
            orthographicCamera.f2818c.m1619d(0.0f, 1.0f, 0.0f);
            orthographicCamera.f2817b.m1619d(0.0f, 0.0f, -1.0f);
            Vector3 vector3 = orthographicCamera.f2816a;
            float f3 = orthographicCamera.f2836o;
            vector3.m1619d((f3 * f) / 2.0f, (f3 * f2) / 2.0f, 0.0f);
            orthographicCamera.f2825j = f;
            orthographicCamera.f2826k = f2;
            orthographicCamera.m1611a();
            this.f4247K.m1611a();
            this.f4245I.m12561b(this.f4247K.f2821f);
        }
        float[] fArr = this.f4252P;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f4 = i + 0.0f;
        fArr[2] = f4;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        float f5 = i2 + 0.0f;
        fArr[5] = f5;
        fArr[6] = f4;
        fArr[7] = f5;
        this.f4250N.clear();
        this.f4250N.position(0);
        this.f4250N.put(this.f4252P);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageAudioFilter, p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        for (int i = 0; i < this.f4217D.size(); i++) {
            if (this.f4217D.get(i) != null) {
                this.f4217D.get(i).m2173a();
            }
        }
        this.f4217D.clear();
    }

    /* JADX INFO: renamed from: v */
    public final void m2175v(StaticStickerNormalData staticStickerNormalData) {
        Objects.requireNonNull(staticStickerNormalData);
        float f = 0;
        float f2 = this.f4256T;
        float f3 = this.f4257U;
        float[] fArr = this.f4251O;
        fArr[0] = f2;
        fArr[1] = f3;
        float f4 = f2 + f;
        fArr[2] = f4;
        fArr[3] = f3;
        fArr[4] = f2;
        float f5 = f3 + f;
        fArr[5] = f5;
        fArr[6] = f4;
        fArr[7] = f5;
        this.f4248L.clear();
        this.f4248L.position(0);
        this.f4248L.put(this.f4251O);
        this.f4244H.m12560a();
        float f6 = f / 2.0f;
        float f7 = f2 + f6;
        float f8 = f3 + f6;
        this.f4244H.m12562c(f7, f8, 0.0f);
        Matrix4 matrix4 = this.f4244H;
        Vector3 vector3 = Vector3.f2850f;
        float f9 = this.f4254R;
        Objects.requireNonNull(matrix4);
        if (f9 != 0.0f) {
            Matrix4.f28140g.m1614b(vector3, f9);
            Quaternion quaternion = Matrix4.f28140g;
            float[] fArr2 = Matrix4.f28139f;
            float f10 = quaternion.f2840f;
            float f11 = f10 * f10;
            float f12 = quaternion.f2841g;
            float f13 = f10 * f12;
            float f14 = quaternion.f2842h;
            float f15 = f10 * f14;
            float f16 = quaternion.f2843i;
            float f17 = f10 * f16;
            float f18 = f12 * f12;
            float f19 = f12 * f14;
            float f20 = f12 * f16;
            float f21 = f14 * f14;
            float f22 = f14 * f16;
            fArr2[0] = 1.0f - ((f18 + f21) * 2.0f);
            fArr2[4] = (f13 - f22) * 2.0f;
            fArr2[8] = (f15 + f20) * 2.0f;
            fArr2[12] = 0.0f;
            fArr2[1] = (f13 + f22) * 2.0f;
            fArr2[5] = 1.0f - ((f21 + f11) * 2.0f);
            fArr2[9] = (f19 - f17) * 2.0f;
            fArr2[13] = 0.0f;
            fArr2[2] = (f15 - f20) * 2.0f;
            fArr2[6] = (f19 + f17) * 2.0f;
            fArr2[10] = 1.0f - ((f11 + f18) * 2.0f);
            fArr2[14] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[7] = 0.0f;
            fArr2[11] = 0.0f;
            fArr2[15] = 1.0f;
            Matrix4.mul(matrix4.f28146m, fArr2);
        }
        Matrix4 matrix5 = this.f4244H;
        float f23 = this.f4255S;
        Objects.requireNonNull(matrix5);
        float[] fArr3 = Matrix4.f28139f;
        fArr3[0] = f23;
        fArr3[4] = 0.0f;
        fArr3[8] = 0.0f;
        fArr3[12] = 0.0f;
        fArr3[1] = 0.0f;
        fArr3[5] = f23;
        fArr3[9] = 0.0f;
        fArr3[13] = 0.0f;
        fArr3[2] = 0.0f;
        fArr3[6] = 0.0f;
        fArr3[10] = f23;
        fArr3[14] = 0.0f;
        fArr3[3] = 0.0f;
        fArr3[7] = 0.0f;
        fArr3[11] = 0.0f;
        fArr3[15] = 1.0f;
        Matrix4.mul(matrix5.f28146m, fArr3);
        this.f4244H.m12562c(-f7, -f8, 0.0f);
        this.f4254R++;
        float f24 = this.f4255S;
        if (f24 >= 1.2f) {
            this.f4253Q = -1;
        }
        if (f24 <= 0.8f) {
            this.f4253Q = 1;
        }
        this.f4255S = (this.f4253Q * 0.01f) + f24;
    }
}
