package p007c.p114h.p126d.p129c.p138f;

import android.content.Context;
import android.opengl.GLES30;
import java.nio.FloatBuffer;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p130a.GLImageGaussianBlurFilter;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.f.a, reason: use source file name */
/* JADX INFO: compiled from: GLImageFrameEdgeBlurFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageFrameEdgeBlurFilter extends GLImageFilter {

    /* JADX INFO: renamed from: A */
    public GLImageGaussianBlurFilter f4186A;

    /* JADX INFO: renamed from: B */
    public float f4187B;

    /* JADX INFO: renamed from: C */
    public int f4188C;

    /* JADX INFO: renamed from: v */
    public int f4189v;

    /* JADX INFO: renamed from: w */
    public int f4190w;

    /* JADX INFO: renamed from: x */
    public int f4191x;

    /* JADX INFO: renamed from: y */
    public float f4192y;

    /* JADX INFO: renamed from: z */
    public float f4193z;

    public GLImageFrameEdgeBlurFilter(Context context) {
        this(context, "attribute vec4 aPosition;                                  \nattribute vec4 aTextureCoord;                              \nvarying vec2 textureCoordinate;                            \nvoid main() {                                              \n    gl_Position = aPosition;                               \n    textureCoordinate = aTextureCoord.xy;                  \n}                                                          \n", OpenGLUtils.m2186k(context, "shader/multiframe/fragment_frame_blur.glsl"));
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: c */
    public void mo2128c() {
        super.mo2128c();
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4186A;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2128c();
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4186A;
        if (gLImageGaussianBlurFilter != null) {
            this.f4188C = gLImageGaussianBlurFilter.mo2130e(i, floatBuffer, floatBuffer2);
        }
        return super.mo2129d(i, floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4186A;
        if (gLImageGaussianBlurFilter != null) {
            this.f4188C = gLImageGaussianBlurFilter.mo2130e(i, floatBuffer, floatBuffer2);
        }
        return super.mo2130e(i, floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: g */
    public void mo2131g(int i, int i2) {
        super.mo2131g(i, i2);
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4186A;
        if (gLImageGaussianBlurFilter != null) {
            float f = this.f4187B;
            gLImageGaussianBlurFilter.mo2131g((int) (i * f), (int) (i2 * f));
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        int i = this.f4036j;
        if (i != -1) {
            this.f4189v = GLES30.glGetUniformLocation(i, "blurTexture");
            this.f4190w = GLES30.glGetUniformLocation(this.f4036j, "blurOffsetX");
            this.f4191x = GLES30.glGetUniformLocation(this.f4036j, "blurOffsetY");
            this.f4192y = 0.15f;
            this.f4193z = 0.15f;
            m2145r(this.f4190w, 0.15f);
            m2145r(this.f4191x, this.f4193z);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: i */
    public void mo2133i(int i, int i2) {
        this.f4042p = i;
        this.f4043q = i2;
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4186A;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2133i(i, i2);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        int i = this.f4188C;
        if (i != -1) {
            OpenGLUtils.m2176a(this.f4189v, i, 1);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4186A;
        if (gLImageGaussianBlurFilter != null) {
            float f = i;
            float f2 = this.f4187B;
            float f3 = i2;
            gLImageGaussianBlurFilter.mo2135n((int) (f * f2), (int) (f2 * f3));
            GLImageGaussianBlurFilter gLImageGaussianBlurFilter2 = this.f4186A;
            float f4 = this.f4187B;
            gLImageGaussianBlurFilter2.mo2131g((int) (f * f4), (int) (f3 * f4));
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4186A;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2126o();
            this.f4186A = null;
        }
        int i = this.f4188C;
        if (i != -1) {
            GLES30.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    public GLImageFrameEdgeBlurFilter(Context context, String str, String str2) {
        super(context, str, str2);
        this.f4187B = 0.5f;
        this.f4186A = new GLImageGaussianBlurFilter(this.f4028b);
        this.f4188C = -1;
    }
}
