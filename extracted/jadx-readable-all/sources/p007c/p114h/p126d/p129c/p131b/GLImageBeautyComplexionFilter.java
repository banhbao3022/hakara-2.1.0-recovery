package p007c.p114h.p126d.p129c.p131b;

import android.content.Context;
import android.opengl.GLES30;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.b.c, reason: use source file name */
/* JADX INFO: compiled from: GLImageBeautyComplexionFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageBeautyComplexionFilter extends GLImageFilter {

    /* JADX INFO: renamed from: A */
    public int f4081A;

    /* JADX INFO: renamed from: B */
    public int f4082B;

    /* JADX INFO: renamed from: C */
    public float f4083C;

    /* JADX INFO: renamed from: D */
    public float f4084D;

    /* JADX INFO: renamed from: E */
    public float f4085E;

    /* JADX INFO: renamed from: v */
    public int f4086v;

    /* JADX INFO: renamed from: w */
    public int f4087w;

    /* JADX INFO: renamed from: x */
    public int f4088x;

    /* JADX INFO: renamed from: y */
    public int f4089y;

    /* JADX INFO: renamed from: z */
    public int f4090z;

    public GLImageBeautyComplexionFilter(Context context) {
        this(context, "attribute vec4 aPosition;                                  \nattribute vec4 aTextureCoord;                              \nvarying vec2 textureCoordinate;                            \nvoid main() {                                              \n    gl_Position = aPosition;                               \n    textureCoordinate = aTextureCoord.xy;                  \n}                                                          \n", OpenGLUtils.m2186k(context, "shader/beauty/fragment_beauty_complexion.glsl"));
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        this.f4086v = GLES30.glGetUniformLocation(this.f4036j, "grayTexture");
        this.f4087w = GLES30.glGetUniformLocation(this.f4036j, "lookupTexture");
        this.f4088x = GLES30.glGetUniformLocation(this.f4036j, "levelRangeInv");
        this.f4089y = GLES30.glGetUniformLocation(this.f4036j, "levelBlack");
        this.f4090z = GLES30.glGetUniformLocation(this.f4036j, "alpha");
        this.f4081A = OpenGLUtils.m2184i(this.f4028b, "texture/skin_gray.png");
        this.f4082B = OpenGLUtils.m2184i(this.f4028b, "texture/skin_lookup.png");
        this.f4083C = 1.040816f;
        this.f4084D = 0.01960784f;
        this.f4085E = 1.0f;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        OpenGLUtils.m2176a(this.f4086v, this.f4081A, 1);
        OpenGLUtils.m2176a(this.f4087w, this.f4082B, 2);
        GLES30.glUniform1f(this.f4088x, this.f4083C);
        GLES30.glUniform1f(this.f4089y, this.f4084D);
        GLES30.glUniform1f(this.f4090z, this.f4085E);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        GLES30.glDeleteTextures(2, new int[]{this.f4081A, this.f4082B}, 0);
    }

    public GLImageBeautyComplexionFilter(Context context, String str, String str2) {
        super(context, str, str2);
    }
}
