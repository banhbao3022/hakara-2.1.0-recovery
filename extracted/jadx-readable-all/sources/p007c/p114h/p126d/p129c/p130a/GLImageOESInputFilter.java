package p007c.p114h.p126d.p129c.p130a;

import android.content.Context;
import android.opengl.GLES30;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.a.i, reason: use source file name */
/* JADX INFO: compiled from: GLImageOESInputFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageOESInputFilter extends GLImageFilter {

    /* JADX INFO: renamed from: v */
    public int f4065v;

    /* JADX INFO: renamed from: w */
    public float[] f4066w;

    public GLImageOESInputFilter(Context context) {
        this(context, OpenGLUtils.m2186k(context, "shader/base/vertex_oes_input.glsl"), OpenGLUtils.m2186k(context, "shader/base/fragment_oes_input.glsl"));
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: f */
    public int mo2140f() {
        return 36197;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        this.f4065v = GLES30.glGetUniformLocation(this.f4036j, "transformMatrix");
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        GLES30.glUniformMatrix4fv(this.f4065v, 1, false, this.f4066w, 0);
    }

    public GLImageOESInputFilter(Context context, String str, String str2) {
        super(context, str, str2);
    }
}
