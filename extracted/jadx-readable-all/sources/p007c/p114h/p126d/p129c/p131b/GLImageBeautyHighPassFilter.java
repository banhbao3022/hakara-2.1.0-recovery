package p007c.p114h.p126d.p129c.p131b;

import android.content.Context;
import android.opengl.GLES30;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.b.f, reason: use source file name */
/* JADX INFO: compiled from: GLImageBeautyHighPassFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageBeautyHighPassFilter extends GLImageFilter {

    /* JADX INFO: renamed from: v */
    public int f4122v;

    /* JADX INFO: renamed from: w */
    public int f4123w;

    public GLImageBeautyHighPassFilter(Context context) {
        this(context, "attribute vec4 aPosition;                                  \nattribute vec4 aTextureCoord;                              \nvarying vec2 textureCoordinate;                            \nvoid main() {                                              \n    gl_Position = aPosition;                               \n    textureCoordinate = aTextureCoord.xy;                  \n}                                                          \n", OpenGLUtils.m2186k(context, "shader/beauty/fragment_beauty_highpass.glsl"));
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        this.f4122v = GLES30.glGetUniformLocation(this.f4036j, "blurTexture");
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        OpenGLUtils.m2176a(this.f4122v, this.f4123w, 1);
    }

    public GLImageBeautyHighPassFilter(Context context, String str, String str2) {
        super(context, str, str2);
    }
}
