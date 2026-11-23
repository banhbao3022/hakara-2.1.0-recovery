package p007c.p114h.p126d.p129c.p130a;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES30;
import java.nio.FloatBuffer;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.a.b, reason: use source file name */
/* JADX INFO: compiled from: GLImageDepthBlurFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageDepthBlurFilter extends GLImageFilter {

    /* JADX INFO: renamed from: A */
    public int f4013A;

    /* JADX INFO: renamed from: B */
    public int f4014B;

    /* JADX INFO: renamed from: C */
    public int f4015C;

    /* JADX INFO: renamed from: D */
    public int f4016D;

    /* JADX INFO: renamed from: E */
    public GLImageGaussianBlurFilter f4017E;

    /* JADX INFO: renamed from: F */
    public float f4018F;

    /* JADX INFO: renamed from: G */
    public int f4019G;

    /* JADX INFO: renamed from: v */
    public int f4020v;

    /* JADX INFO: renamed from: w */
    public int f4021w;

    /* JADX INFO: renamed from: x */
    public int f4022x;

    /* JADX INFO: renamed from: y */
    public int f4023y;

    /* JADX INFO: renamed from: z */
    public int f4024z;

    public GLImageDepthBlurFilter(Context context) {
        this(context, "attribute vec4 aPosition;                                  \nattribute vec4 aTextureCoord;                              \nvarying vec2 textureCoordinate;                            \nvoid main() {                                              \n    gl_Position = aPosition;                               \n    textureCoordinate = aTextureCoord.xy;                  \n}                                                          \n", OpenGLUtils.m2186k(context, "shader/base/fragment_depth_blur.glsl"));
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: c */
    public void mo2128c() {
        super.mo2128c();
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4017E;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2128c();
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4017E;
        if (gLImageGaussianBlurFilter != null) {
            this.f4019G = gLImageGaussianBlurFilter.mo2130e(i, floatBuffer, floatBuffer2);
        }
        return super.mo2129d(i, floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4017E;
        if (gLImageGaussianBlurFilter != null) {
            this.f4019G = gLImageGaussianBlurFilter.mo2130e(i, floatBuffer, floatBuffer2);
        }
        return super.mo2130e(i, floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: g */
    public void mo2131g(int i, int i2) {
        super.mo2131g(i, i2);
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4017E;
        if (gLImageGaussianBlurFilter != null) {
            float f = this.f4018F;
            gLImageGaussianBlurFilter.mo2131g((int) (i * f), (int) (i2 * f));
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        int i = this.f4036j;
        if (i != -1) {
            this.f4020v = GLES30.glGetUniformLocation(i, "blurImageTexture");
            this.f4021w = GLES30.glGetUniformLocation(this.f4036j, "inner");
            this.f4022x = GLES30.glGetUniformLocation(this.f4036j, "outer");
            this.f4023y = GLES30.glGetUniformLocation(this.f4036j, "width");
            this.f4024z = GLES30.glGetUniformLocation(this.f4036j, "height");
            this.f4013A = GLES30.glGetUniformLocation(this.f4036j, "center");
            this.f4014B = GLES30.glGetUniformLocation(this.f4036j, "line1");
            this.f4015C = GLES30.glGetUniformLocation(this.f4036j, "line2");
            this.f4016D = GLES30.glGetUniformLocation(this.f4036j, "intensity");
            m2145r(this.f4021w, 0.35f);
            m2145r(this.f4022x, 0.12f);
            m2143p(new GLImageFilter2(this, new PointF(0.5f, 0.5f), this.f4013A));
            m2146s(this.f4014B, new float[]{0.0f, 0.0f, -0.15f});
            m2146s(this.f4015C, new float[]{0.0f, 0.0f, -0.15f});
            m2145r(this.f4016D, 1.0f);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: i */
    public void mo2133i(int i, int i2) {
        this.f4042p = i;
        this.f4043q = i2;
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4017E;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2133i(i, i2);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        int i = this.f4019G;
        if (i != -1) {
            OpenGLUtils.m2176a(this.f4020v, i, 1);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        float f = i;
        m2145r(this.f4023y, f);
        float f2 = i2;
        m2145r(this.f4024z, f2);
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4017E;
        if (gLImageGaussianBlurFilter != null) {
            float f3 = this.f4018F;
            gLImageGaussianBlurFilter.mo2135n((int) (f * f3), (int) (f2 * f3));
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4017E;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2126o();
            this.f4017E = null;
        }
        int i = this.f4019G;
        if (i != -1) {
            GLES30.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    public GLImageDepthBlurFilter(Context context, String str, String str2) {
        super(context, str, str2);
        this.f4018F = 0.5f;
        this.f4017E = new GLImageGaussianBlurFilter(context);
        this.f4019G = -1;
    }
}
