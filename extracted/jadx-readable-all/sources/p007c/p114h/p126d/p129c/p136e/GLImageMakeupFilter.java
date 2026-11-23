package p007c.p114h.p126d.p129c.p136e;

import android.content.Context;
import android.opengl.GLES30;
import android.util.SparseArray;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p136e.p137c.DynamicMakeup;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p144e.LandmarkEngine;

/* JADX INFO: renamed from: c.h.d.c.e.a, reason: use source file name */
/* JADX INFO: compiled from: GLImageMakeupFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageMakeupFilter extends GLImageFilter {

    /* JADX INFO: renamed from: v */
    public int f4171v;

    /* JADX INFO: renamed from: w */
    public int f4172w;

    /* JADX INFO: renamed from: x */
    public int f4173x;

    /* JADX INFO: renamed from: y */
    public int f4174y;

    /* JADX INFO: renamed from: z */
    public SparseArray<MakeupBaseLoader> f4175z;

    public GLImageMakeupFilter(Context context) {
        this(context, null);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.mo2130e(i, floatBuffer, floatBuffer2);
        if (LandmarkEngine.b.f4266a.m2193c()) {
            for (int i2 = 0; i2 < LandmarkEngine.b.f4266a.m2192b(); i2++) {
                for (int i3 = 0; i3 < this.f4175z.size(); i3++) {
                    if (this.f4175z.get(i3) != null) {
                        this.f4175z.get(i3).m2156a(i2, i, floatBuffer, floatBuffer2);
                    }
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
            this.f4171v = GLES30.glGetUniformLocation(i, "maskTexture");
            this.f4172w = GLES30.glGetUniformLocation(this.f4036j, "materialTexture");
            this.f4173x = GLES30.glGetUniformLocation(this.f4036j, "strength");
            this.f4174y = GLES30.glGetUniformLocation(this.f4036j, "makeupType");
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        GLES30.glUniform1i(this.f4174y, 0);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        for (int i3 = 0; i3 < this.f4175z.size(); i3++) {
            if (this.f4175z.get(i3) != null) {
                this.f4175z.get(i3).m2158c(i, i2);
            }
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        for (int i = 0; i < this.f4175z.size(); i++) {
            if (this.f4175z.get(i) != null) {
                this.f4175z.get(i).m2159d();
            }
        }
        this.f4175z.clear();
        this.f4175z = null;
    }

    /* JADX INFO: renamed from: u */
    public void m2153u(DynamicMakeup dynamicMakeup) {
        for (int i = 0; i < this.f4175z.size(); i++) {
            if (this.f4175z.get(i) != null) {
                MakeupBaseLoader makeupBaseLoader = this.f4175z.get(i);
                int i2 = makeupBaseLoader.f4181f;
                if (i2 != -1) {
                    GLES30.glDeleteTextures(1, new int[]{i2}, 0);
                    makeupBaseLoader.f4181f = -1;
                }
                makeupBaseLoader.f4183h = false;
            }
        }
        if (dynamicMakeup == null || dynamicMakeup.f4185a == null) {
            return;
        }
        for (int i3 = 0; i3 < dynamicMakeup.f4185a.size(); i3++) {
            if (dynamicMakeup.f4185a.get(i3) != null) {
                Objects.requireNonNull(dynamicMakeup.f4185a.get(i3));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m2154v(int i, int i2, int i3, int i4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, ShortBuffer shortBuffer, int i5, float f) {
        int i6;
        if (i2 == -1 || shortBuffer == null) {
            return;
        }
        GLES30.glBindFramebuffer(36160, i);
        GLES30.glUseProgram(this.f4036j);
        m2144q();
        GLES30.glEnable(3042);
        GLES30.glBlendFunc(1, 769);
        if (floatBuffer != null) {
            floatBuffer.position(0);
            i6 = 0;
            GLES30.glVertexAttribPointer(this.f4037k, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES30.glEnableVertexAttribArray(this.f4037k);
        } else {
            i6 = 0;
        }
        if (floatBuffer2 != null) {
            floatBuffer2.position(i6);
            GLES30.glVertexAttribPointer(this.f4038l, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES30.glEnableVertexAttribArray(this.f4038l);
        }
        GLES30.glActiveTexture(33984);
        GLES30.glBindTexture(3553, i2);
        GLES30.glUniform1i(this.f4039m, i6);
        if (i3 != -1) {
            GLES30.glActiveTexture(33985);
            GLES30.glBindTexture(3553, i3);
            GLES30.glUniform1i(this.f4172w, 1);
        }
        if (i4 != -1) {
            GLES30.glActiveTexture(33986);
            GLES30.glBindTexture(3553, i4);
            GLES30.glUniform1i(this.f4171v, 2);
        }
        GLES30.glUniform1i(this.f4174y, i5);
        GLES30.glUniform1f(this.f4173x, f);
        GLES30.glDrawElements(4, shortBuffer.capacity(), 5123, shortBuffer);
        GLES30.glDisableVertexAttribArray(this.f4037k);
        GLES30.glDisableVertexAttribArray(this.f4038l);
        GLES30.glBindTexture(3553, i6);
        GLES30.glDisable(3042);
        GLES30.glUseProgram(i6);
        GLES30.glBindFramebuffer(36160, i6);
    }

    /* JADX INFO: renamed from: w */
    public void m2155w(int i, int i2, int i3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, ShortBuffer shortBuffer, int i4, float f) {
        m2154v(this.f4046t[0], i, i2, i3, null, null, null, i4, f);
    }

    public GLImageMakeupFilter(Context context, DynamicMakeup dynamicMakeup) {
        super(context, OpenGLUtils.m2186k(context, "shader/makeup/vertex_makeup.glsl"), OpenGLUtils.m2186k(context, "shader/makeup/fragment_makeup.glsl"));
        this.f4175z = new SparseArray<>();
        for (int i = 0; i < 9; i++) {
            this.f4175z.put(i, null);
        }
        if (dynamicMakeup == null || dynamicMakeup.f4185a == null) {
            return;
        }
        for (int i2 = 0; i2 < dynamicMakeup.f4185a.size(); i2++) {
            if (dynamicMakeup.f4185a.get(i2) != null) {
                Objects.requireNonNull(dynamicMakeup.f4185a.get(i2));
                throw null;
            }
        }
    }
}
