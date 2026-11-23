package p007c.p114h.p126d.p129c.p130a;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES20;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.a.j, reason: use source file name */
/* JADX INFO: compiled from: GLImageVignetteFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageVignetteFilter extends GLImageFilter {

    /* JADX INFO: renamed from: A */
    public float[] f4067A;

    /* JADX INFO: renamed from: B */
    public float f4068B;

    /* JADX INFO: renamed from: C */
    public float f4069C;

    /* JADX INFO: renamed from: v */
    public int f4070v;

    /* JADX INFO: renamed from: w */
    public int f4071w;

    /* JADX INFO: renamed from: x */
    public int f4072x;

    /* JADX INFO: renamed from: y */
    public int f4073y;

    /* JADX INFO: renamed from: z */
    public PointF f4074z;

    public GLImageVignetteFilter(Context context) {
        this(context, "attribute vec4 aPosition;                                  \nattribute vec4 aTextureCoord;                              \nvarying vec2 textureCoordinate;                            \nvoid main() {                                              \n    gl_Position = aPosition;                               \n    textureCoordinate = aTextureCoord.xy;                  \n}                                                          \n", OpenGLUtils.m2186k(context, "shader/base/fragment_vignette.glsl"));
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        this.f4070v = GLES20.glGetUniformLocation(this.f4036j, "vignetteCenter");
        this.f4071w = GLES20.glGetUniformLocation(this.f4036j, "vignetteColor");
        this.f4072x = GLES20.glGetUniformLocation(this.f4036j, "vignetteStart");
        this.f4073y = GLES20.glGetUniformLocation(this.f4036j, "vignetteEnd");
        PointF pointF = new PointF(0.5f, 0.5f);
        this.f4074z = pointF;
        m2143p(new GLImageFilter2(this, pointF, this.f4070v));
        float[] fArr = {0.0f, 0.0f, 0.0f};
        this.f4067A = fArr;
        m2146s(this.f4071w, fArr);
        this.f4068B = 0.3f;
        m2145r(this.f4072x, 0.3f);
        this.f4069C = 0.75f;
        m2145r(this.f4073y, 0.75f);
    }

    public GLImageVignetteFilter(Context context, String str, String str2) {
        super(context, str, str2);
    }
}
