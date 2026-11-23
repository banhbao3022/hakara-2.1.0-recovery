package p007c.p114h.p126d.p129c.p131b;

import android.content.Context;
import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import p007c.p114h.p126d.p129c.p130a.GLImageDrawElementsFilter;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p130a.GLImageGaussPassFilter;
import p007c.p114h.p126d.p129c.p130a.GLImageGaussianBlurFilter;
import p007c.p114h.p126d.p129c.p131b.p132g.BeautyParam;
import p007c.p114h.p126d.p129c.p131b.p132g.IBeautify;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p126d.p129c.p143i.TextureRotationUtils;
import p007c.p114h.p144e.LandmarkEngine;

/* JADX INFO: renamed from: c.h.d.c.b.d, reason: use source file name */
/* JADX INFO: compiled from: GLImageBeautyFaceFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageBeautyFaceFilter extends GLImageDrawElementsFilter implements IBeautify {

    /* JADX INFO: renamed from: B */
    public float[] f4095B;

    /* JADX INFO: renamed from: C */
    public GLImageGaussianBlurFilter f4096C;

    /* JADX INFO: renamed from: D */
    public GLImageGaussianBlurFilter f4097D;

    /* JADX INFO: renamed from: E */
    public int f4098E;

    /* JADX INFO: renamed from: F */
    public int f4099F;

    /* JADX INFO: renamed from: G */
    public int f4100G;

    /* JADX INFO: renamed from: H */
    public int f4101H;

    /* JADX INFO: renamed from: I */
    public int f4102I;

    /* JADX INFO: renamed from: J */
    public int f4103J;

    /* JADX INFO: renamed from: K */
    public int f4104K;

    /* JADX INFO: renamed from: L */
    public FloatBuffer f4105L;

    /* JADX INFO: renamed from: M */
    public FloatBuffer f4106M;

    /* JADX INFO: renamed from: N */
    public int f4107N;

    /* JADX INFO: renamed from: O */
    public int f4108O;

    /* JADX INFO: renamed from: P */
    public int f4109P;

    /* JADX INFO: renamed from: Q */
    public int f4110Q;

    /* JADX INFO: renamed from: R */
    public int f4111R;

    /* JADX INFO: renamed from: S */
    public float f4112S;

    /* JADX INFO: renamed from: T */
    public float f4113T;

    /* JADX INFO: renamed from: U */
    public int f4114U;

    /* JADX INFO: renamed from: x */
    public static final short[] f4092x = {0, 5, 1, 1, 5, 12, 12, 5, 13, 12, 13, 4, 12, 4, 2, 2, 4, 3, 6, 7, 11, 7, 11, 14, 14, 11, 15, 14, 15, 10, 14, 10, 8, 8, 10, 9};

    /* JADX INFO: renamed from: y */
    public static final float[] f4093y = {0.102757f, 0.465517f, 0.175439f, 0.301724f, 0.370927f, 0.310345f, 0.446115f, 0.603448f, 0.353383f, 0.732759f, 0.197995f, 0.689655f, 0.566416f, 0.62931f, 0.659148f, 0.336207f, 0.802005f, 0.318966f, 0.884712f, 0.465517f, 0.81203f, 0.681034f, 0.681704f, 0.750023f, 0.273183f, 0.241379f, 0.275689f, 0.75862f, 0.721805f, 0.275862f, 0.739348f, 0.758621f};

    /* JADX INFO: renamed from: z */
    public static final short[] f4094z = {0, 11, 1, 1, 11, 10, 1, 10, 2, 2, 10, 3, 3, 10, 9, 3, 9, 8, 3, 8, 4, 4, 8, 5, 5, 8, 7, 5, 7, 6};

    /* JADX INFO: renamed from: A */
    public static final float[] f4091A = {0.154639f, 0.378788f, 0.295533f, 0.287879f, 0.398625f, 0.19697f, 0.512027f, 0.287879f, 0.611684f, 0.212121f, 0.728523f, 0.287879f, 0.872852f, 0.378788f, 0.742268f, 0.704546f, 0.639176f, 0.848485f, 0.522337f, 0.636364f, 0.398625f, 0.833333f, 0.24055f, 0.651515f};

    public GLImageBeautyFaceFilter(Context context) {
        super(context, OpenGLUtils.m2186k(context, "shader/beauty/vertex_beauty_face.glsl"), OpenGLUtils.m2186k(context, "shader/beauty/fragment_beauty_face.glsl"));
        this.f4095B = new float[100];
        this.f4107N = -1;
        this.f4108O = -1;
        this.f4114U = 0;
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = new GLImageGaussianBlurFilter(context);
        this.f4096C = gLImageGaussianBlurFilter;
        GLImageGaussPassFilter gLImageGaussPassFilter = gLImageGaussianBlurFilter.f4061v;
        if (gLImageGaussPassFilter != null) {
            gLImageGaussPassFilter.f4056v = 1.0f;
        }
        GLImageGaussPassFilter gLImageGaussPassFilter2 = gLImageGaussianBlurFilter.f4062w;
        if (gLImageGaussPassFilter2 != null) {
            gLImageGaussPassFilter2.f4056v = 1.0f;
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter2 = new GLImageGaussianBlurFilter(context);
        this.f4097D = gLImageGaussianBlurFilter2;
        GLImageGaussPassFilter gLImageGaussPassFilter3 = gLImageGaussianBlurFilter2.f4061v;
        if (gLImageGaussPassFilter3 != null) {
            gLImageGaussPassFilter3.f4056v = 0.3f;
        }
        GLImageGaussPassFilter gLImageGaussPassFilter4 = gLImageGaussianBlurFilter2.f4062w;
        if (gLImageGaussPassFilter4 != null) {
            gLImageGaussPassFilter4.f4056v = 0.3f;
        }
        this.f4109P = OpenGLUtils.m2184i(context, "texture/makeup_eye_mask.png");
        this.f4110Q = OpenGLUtils.m2184i(context, "texture/teeth_mask.png");
        this.f4111R = OpenGLUtils.m2184i(context, "texture/teeth_beauty_lookup.png");
        this.f4112S = 0.0f;
        this.f4113T = 0.0f;
    }

    @Override // p007c.p114h.p126d.p129c.p131b.p132g.IBeautify
    /* JADX INFO: renamed from: a */
    public void mo2149a(BeautyParam beautyParam) {
        if (beautyParam != null) {
            this.f4112S = GLImageFilter.m2139b(0.0f, 0.0f, 1.0f);
            this.f4113T = GLImageFilter.m2139b(0.0f, 0.0f, 1.0f);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: c */
    public void mo2128c() {
        super.mo2128c();
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4096C;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2128c();
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter2 = this.f4096C;
        if (gLImageGaussianBlurFilter2 != null) {
            gLImageGaussianBlurFilter2.mo2128c();
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        m2147t(this.f4104K, 0);
        m2150w(0, -1);
        super.mo2130e(i, floatBuffer, floatBuffer2);
        if (LandmarkEngine.b.f4266a.m2193c()) {
            GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4096C;
            if (gLImageGaussianBlurFilter != null) {
                this.f4107N = gLImageGaussianBlurFilter.mo2130e(i, floatBuffer, floatBuffer2);
            }
            GLImageGaussianBlurFilter gLImageGaussianBlurFilter2 = this.f4097D;
            if (gLImageGaussianBlurFilter2 != null) {
                this.f4108O = gLImageGaussianBlurFilter2.mo2130e(i, floatBuffer, floatBuffer2);
            }
            for (int i2 = 0; i2 < LandmarkEngine.b.f4266a.m2192b(); i2++) {
                if (this.f4112S != 0.0d) {
                    m2150w(1, i2);
                    m2147t(this.f4104K, 1);
                    m2145r(this.f4102I, this.f4112S);
                    super.mo2130e(i, this.f4105L, this.f4106M);
                }
                if (this.f4113T != 0.0d) {
                    m2150w(2, i2);
                    m2147t(this.f4104K, 2);
                    m2145r(this.f4103J, this.f4113T);
                    super.mo2130e(i, this.f4105L, this.f4106M);
                }
            }
        }
        return this.f4047u[0];
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: g */
    public void mo2131g(int i, int i2) {
        super.mo2131g(i, i2);
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4096C;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2131g((int) (i / 3.0f), (int) (i2 / 3.0f));
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter2 = this.f4097D;
        if (gLImageGaussianBlurFilter2 != null) {
            gLImageGaussianBlurFilter2.mo2131g((int) (i / 3.0f), (int) (i2 / 3.0f));
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        int i = this.f4036j;
        if (i != -1) {
            this.f4098E = GLES30.glGetUniformLocation(i, "blurTexture");
            this.f4099F = GLES30.glGetUniformLocation(this.f4036j, "blurTexture2");
            this.f4100G = GLES30.glGetUniformLocation(this.f4036j, "maskTexture");
            this.f4101H = GLES30.glGetUniformLocation(this.f4036j, "teethLookupTexture");
            this.f4102I = GLES30.glGetUniformLocation(this.f4036j, "brightEyeStrength");
            this.f4103J = GLES30.glGetUniformLocation(this.f4036j, "teethStrength");
            GLES30.glGetUniformLocation(this.f4036j, "nasolabialStrength");
            GLES30.glGetUniformLocation(this.f4036j, "furrowStrength");
            GLES30.glGetUniformLocation(this.f4036j, "eyeBagStrength");
            this.f4104K = GLES30.glGetUniformLocation(this.f4036j, "processType");
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: i */
    public void mo2133i(int i, int i2) {
        this.f4042p = i;
        this.f4043q = i2;
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4096C;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2133i(i, i2);
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter2 = this.f4097D;
        if (gLImageGaussianBlurFilter2 != null) {
            gLImageGaussianBlurFilter2.mo2133i(i, i2);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        int i = this.f4107N;
        if (i != -1) {
            OpenGLUtils.m2176a(this.f4098E, i, 1);
        }
        int i2 = this.f4108O;
        if (i2 != -1) {
            OpenGLUtils.m2176a(this.f4099F, i2, 2);
        }
        int i3 = this.f4114U;
        if (i3 == 1) {
            OpenGLUtils.m2176a(this.f4100G, this.f4109P, 3);
        } else if (i3 == 2) {
            OpenGLUtils.m2176a(this.f4100G, this.f4110Q, 3);
        }
        OpenGLUtils.m2176a(this.f4101H, this.f4111R, 4);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4096C;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2135n((int) (i / 3.0f), (int) (i2 / 3.0f));
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter2 = this.f4097D;
        if (gLImageGaussianBlurFilter2 != null) {
            gLImageGaussianBlurFilter2.mo2135n((int) (i / 3.0f), (int) (i2 / 3.0f));
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageDrawElementsFilter, p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4096C;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2126o();
            this.f4096C = null;
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter2 = this.f4097D;
        if (gLImageGaussianBlurFilter2 != null) {
            gLImageGaussianBlurFilter2.mo2126o();
            this.f4097D = null;
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageDrawElementsFilter
    /* JADX INFO: renamed from: u */
    public void mo2137u() {
        mo2138v();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(400).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4105L = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(400).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4106M = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.position(0);
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(200).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f4025v = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.position(0);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageDrawElementsFilter
    /* JADX INFO: renamed from: v */
    public void mo2138v() {
        super.mo2138v();
        FloatBuffer floatBuffer = this.f4105L;
        if (floatBuffer != null) {
            floatBuffer.clear();
            this.f4105L = null;
        }
        FloatBuffer floatBuffer2 = this.f4106M;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
            this.f4106M = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:48:0x0189 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: w */
    public final void m2150w(int i, int i2) {
        this.f4114U = i;
        if (i != 1) {
            if (i != 2) {
                this.f4025v.clear();
                this.f4025v.put(TextureRotationUtils.f4263d);
                this.f4025v.position(0);
                this.f4026w = 6;
                return;
            }
            LandmarkEngine landmarkEngine = LandmarkEngine.b.f4266a;
            float[] fArr = this.f4095B;
            synchronized (landmarkEngine) {
                if (fArr != null) {
                    if (fArr.length >= 24 && i2 < landmarkEngine.f4265b.size() && landmarkEngine.f4265b.get(i2) != null) {
                        for (int i3 = 84; i3 < 96; i3++) {
                            int i4 = (i3 - 84) * 2;
                            int i5 = i3 * 2;
                            fArr[i4] = landmarkEngine.f4265b.get(i2).f4273g[i5];
                            fArr[i4 + 1] = landmarkEngine.f4265b.get(i2).f4273g[i5 + 1];
                        }
                    }
                }
            }
            this.f4105L.clear();
            this.f4105L.put(this.f4095B);
            this.f4105L.position(0);
            this.f4106M.clear();
            this.f4106M.put(f4091A);
            this.f4106M.position(0);
            this.f4025v.clear();
            ShortBuffer shortBuffer = this.f4025v;
            short[] sArr = f4094z;
            shortBuffer.put(sArr);
            this.f4025v.position(0);
            this.f4026w = sArr.length;
            return;
        }
        LandmarkEngine landmarkEngine2 = LandmarkEngine.b.f4266a;
        float[] fArr2 = this.f4095B;
        synchronized (landmarkEngine2) {
            if (fArr2 != null) {
                if (fArr2.length >= 32 && i2 < landmarkEngine2.f4265b.size() && landmarkEngine2.f4265b.get(i2) != null) {
                    for (int i6 = 52; i6 < 64; i6++) {
                        int i7 = (i6 - 52) * 2;
                        int i8 = i6 * 2;
                        fArr2[i7] = landmarkEngine2.f4265b.get(i2).f4273g[i8];
                        fArr2[i7 + 1] = landmarkEngine2.f4265b.get(i2).f4273g[i8 + 1];
                    }
                    fArr2[24] = landmarkEngine2.f4265b.get(i2).f4273g[144];
                    fArr2[25] = landmarkEngine2.f4265b.get(i2).f4273g[145];
                    fArr2[26] = landmarkEngine2.f4265b.get(i2).f4273g[146];
                    fArr2[27] = landmarkEngine2.f4265b.get(i2).f4273g[147];
                    fArr2[28] = landmarkEngine2.f4265b.get(i2).f4273g[150];
                    fArr2[29] = landmarkEngine2.f4265b.get(i2).f4273g[151];
                    fArr2[30] = landmarkEngine2.f4265b.get(i2).f4273g[152];
                    fArr2[31] = landmarkEngine2.f4265b.get(i2).f4273g[153];
                }
            }
        }
        this.f4105L.clear();
        this.f4105L.put(this.f4095B);
        this.f4105L.position(0);
        this.f4106M.clear();
        this.f4106M.put(f4093y);
        this.f4106M.position(0);
        this.f4025v.clear();
        ShortBuffer shortBuffer2 = this.f4025v;
        short[] sArr2 = f4092x;
        shortBuffer2.put(sArr2);
        this.f4025v.position(0);
        this.f4026w = sArr2.length;
    }
}
