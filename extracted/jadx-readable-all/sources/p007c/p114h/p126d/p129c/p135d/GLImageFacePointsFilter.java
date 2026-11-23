package p007c.p114h.p126d.p129c.p135d;

import android.content.Context;
import android.opengl.GLES30;
import android.text.TextUtils;
import android.util.SparseArray;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p144e.LandmarkEngine;
import p007c.p114h.p144e.OneFace;

/* JADX INFO: renamed from: c.h.d.c.d.a, reason: use source file name */
/* JADX INFO: compiled from: GLImageFacePointsFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageFacePointsFilter extends GLImageFilter {

    /* JADX INFO: renamed from: v */
    public final float[] f4153v;

    /* JADX INFO: renamed from: w */
    public int f4154w;

    /* JADX INFO: renamed from: x */
    public int f4155x;

    /* JADX INFO: renamed from: y */
    public float[] f4156y;

    /* JADX INFO: renamed from: z */
    public FloatBuffer f4157z;

    public GLImageFacePointsFilter(Context context) {
        this(context, "attribute vec4 aPosition;\nvoid main() {\n    gl_Position = aPosition;\n    gl_PointSize = 8.0;\n}", "precision mediump float;\nuniform vec4 color;\nvoid main() {\n    gl_FragColor = color;\n}");
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: c */
    public void mo2128c() {
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!this.f4032f || !this.f4033g) {
            return false;
        }
        GLES30.glViewport(0, 0, this.f4042p, this.f4043q);
        GLES30.glUseProgram(this.f4036j);
        m2144q();
        GLES30.glEnableVertexAttribArray(this.f4037k);
        GLES30.glUniform4fv(this.f4154w, 1, this.f4153v, 0);
        synchronized (this) {
            if (LandmarkEngine.b.f4266a.m2192b() > 0) {
                SparseArray<OneFace> sparseArray = LandmarkEngine.b.f4266a.f4265b;
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    if (sparseArray.get(i2).f4273g != null) {
                        LandmarkEngine.b.f4266a.m2191a(this.f4156y, i2);
                        this.f4157z.clear();
                        FloatBuffer floatBuffer3 = this.f4157z;
                        float[] fArr = this.f4156y;
                        floatBuffer3.put(fArr, 0, fArr.length);
                        this.f4157z.position(0);
                        GLES30.glVertexAttribPointer(this.f4037k, 2, 5126, false, 8, (Buffer) this.f4157z);
                        GLES30.glDrawArrays(0, 0, this.f4155x);
                    }
                }
            }
        }
        GLES30.glDisableVertexAttribArray(this.f4037k);
        return true;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (i != -1 && this.f4046t != null && this.f4032f && this.f4033g) {
            mo2129d(i, floatBuffer, floatBuffer2);
        }
        return i;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: g */
    public void mo2131g(int i, int i2) {
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        if (TextUtils.isEmpty(this.f4030d) || TextUtils.isEmpty(this.f4031e)) {
            this.f4037k = -1;
            this.f4154w = -1;
            this.f4032f = false;
        } else {
            int iM2181f = OpenGLUtils.m2181f(this.f4030d, this.f4031e);
            this.f4036j = iM2181f;
            this.f4037k = GLES30.glGetAttribLocation(iM2181f, "aPosition");
            this.f4154w = GLES30.glGetUniformLocation(this.f4036j, "color");
            this.f4032f = true;
        }
        this.f4038l = -1;
        this.f4039m = -1;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
    }

    public GLImageFacePointsFilter(Context context, String str, String str2) {
        super(context, str, str2);
        this.f4153v = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.f4155x = 114;
        float[] fArr = new float[114 * 2];
        this.f4156y = fArr;
        this.f4157z = OpenGLUtils.m2178c(fArr);
    }
}
