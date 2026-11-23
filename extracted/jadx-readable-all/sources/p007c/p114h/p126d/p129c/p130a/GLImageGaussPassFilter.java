package p007c.p114h.p126d.p129c.p130a;

import android.content.Context;
import android.opengl.GLES20;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.a.f, reason: use source file name */
/* JADX INFO: compiled from: GLImageGaussPassFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageGaussPassFilter extends GLImageFilter {

    /* JADX INFO: renamed from: v */
    public float f4056v;

    /* JADX INFO: renamed from: w */
    public int f4057w;

    /* JADX INFO: renamed from: x */
    public int f4058x;

    /* JADX INFO: renamed from: y */
    public float f4059y;

    /* JADX INFO: renamed from: z */
    public float f4060z;

    public GLImageGaussPassFilter(Context context) {
        this(context, OpenGLUtils.m2186k(context, "shader/base/vertex_gaussian_pass.glsl"), OpenGLUtils.m2186k(context, "shader/base/fragment_gaussian_pass.glsl"));
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        this.f4057w = GLES20.glGetUniformLocation(this.f4036j, "texelWidthOffset");
        this.f4058x = GLES20.glGetUniformLocation(this.f4036j, "texelHeightOffset");
    }

    /* JADX INFO: renamed from: u */
    public void m2148u(float f, float f2) {
        this.f4059y = f;
        this.f4060z = f2;
        if (f != 0.0f) {
            m2145r(this.f4057w, this.f4056v / f);
        } else {
            m2145r(this.f4057w, 0.0f);
        }
        float f3 = this.f4060z;
        if (f3 != 0.0f) {
            m2145r(this.f4058x, this.f4056v / f3);
        } else {
            m2145r(this.f4058x, 0.0f);
        }
    }

    public GLImageGaussPassFilter(Context context, String str, String str2) {
        super(context, str, str2);
        this.f4056v = 1.0f;
    }
}
