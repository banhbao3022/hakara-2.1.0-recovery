package p007c.p114h.p126d.p129c.p131b;

import android.content.Context;
import android.opengl.GLES20;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.b.a, reason: use source file name */
/* JADX INFO: compiled from: GLImageBeautyAdjustFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageBeautyAdjustFilter extends GLImageFilter {

    /* JADX INFO: renamed from: A */
    public int f4075A;

    /* JADX INFO: renamed from: v */
    public int f4076v;

    /* JADX INFO: renamed from: w */
    public int f4077w;

    /* JADX INFO: renamed from: x */
    public int f4078x;

    /* JADX INFO: renamed from: y */
    public float f4079y;

    /* JADX INFO: renamed from: z */
    public int f4080z;

    public GLImageBeautyAdjustFilter(Context context) {
        this(context, "attribute vec4 aPosition;                                  \nattribute vec4 aTextureCoord;                              \nvarying vec2 textureCoordinate;                            \nvoid main() {                                              \n    gl_Position = aPosition;                               \n    textureCoordinate = aTextureCoord.xy;                  \n}                                                          \n", OpenGLUtils.m2186k(context, "shader/beauty/fragment_beauty_adjust.glsl"));
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        this.f4076v = GLES20.glGetUniformLocation(this.f4036j, "blurTexture");
        this.f4077w = GLES20.glGetUniformLocation(this.f4036j, "highPassBlurTexture");
        this.f4078x = GLES20.glGetUniformLocation(this.f4036j, "intensity");
        this.f4079y = 1.0f;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        OpenGLUtils.m2176a(this.f4076v, this.f4080z, 1);
        OpenGLUtils.m2176a(this.f4077w, this.f4075A, 2);
        GLES20.glUniform1f(this.f4078x, this.f4079y);
    }

    public GLImageBeautyAdjustFilter(Context context, String str, String str2) {
        super(context, str, str2);
    }
}
