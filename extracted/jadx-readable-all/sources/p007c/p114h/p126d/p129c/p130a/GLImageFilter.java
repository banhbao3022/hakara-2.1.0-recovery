package p007c.p114h.p126d.p129c.p130a;

import android.content.Context;
import android.opengl.GLES30;
import android.text.TextUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p126d.p129c.p143i.TextureRotationUtils;

/* JADX INFO: renamed from: c.h.d.c.a.d, reason: use source file name */
/* JADX INFO: compiled from: GLImageFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageFilter {

    /* JADX INFO: renamed from: a */
    public String f4027a;

    /* JADX INFO: renamed from: b */
    public Context f4028b;

    /* JADX INFO: renamed from: c */
    public final LinkedList<Runnable> f4029c;

    /* JADX INFO: renamed from: d */
    public String f4030d;

    /* JADX INFO: renamed from: e */
    public String f4031e;

    /* JADX INFO: renamed from: f */
    public boolean f4032f;

    /* JADX INFO: renamed from: g */
    public boolean f4033g;

    /* JADX INFO: renamed from: h */
    public int f4034h;

    /* JADX INFO: renamed from: i */
    public int f4035i;

    /* JADX INFO: renamed from: j */
    public int f4036j;

    /* JADX INFO: renamed from: k */
    public int f4037k;

    /* JADX INFO: renamed from: l */
    public int f4038l;

    /* JADX INFO: renamed from: m */
    public int f4039m;

    /* JADX INFO: renamed from: n */
    public int f4040n;

    /* JADX INFO: renamed from: o */
    public int f4041o;

    /* JADX INFO: renamed from: p */
    public int f4042p;

    /* JADX INFO: renamed from: q */
    public int f4043q;

    /* JADX INFO: renamed from: r */
    public int f4044r;

    /* JADX INFO: renamed from: s */
    public int f4045s;

    /* JADX INFO: renamed from: t */
    public int[] f4046t;

    /* JADX INFO: renamed from: u */
    public int[] f4047u;

    /* JADX INFO: renamed from: c.h.d.c.a.d$a */
    /* JADX INFO: compiled from: GLImageFilter.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f4048f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f4049g;

        public a(GLImageFilter gLImageFilter, int i, int i2) {
            this.f4048f = i;
            this.f4049g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES30.glUniform1i(this.f4048f, this.f4049g);
        }
    }

    /* JADX INFO: renamed from: c.h.d.c.a.d$b */
    /* JADX INFO: compiled from: GLImageFilter.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f4050f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f4051g;

        public b(GLImageFilter gLImageFilter, int i, float f) {
            this.f4050f = i;
            this.f4051g = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES30.glUniform1f(this.f4050f, this.f4051g);
        }
    }

    /* JADX INFO: renamed from: c.h.d.c.a.d$c */
    /* JADX INFO: compiled from: GLImageFilter.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f4052f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float[] f4053g;

        public c(GLImageFilter gLImageFilter, int i, float[] fArr) {
            this.f4052f = i;
            this.f4053g = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES30.glUniform3fv(this.f4052f, 1, FloatBuffer.wrap(this.f4053g));
        }
    }

    public GLImageFilter(Context context) {
        this(context, "attribute vec4 aPosition;                                  \nattribute vec4 aTextureCoord;                              \nvarying vec2 textureCoordinate;                            \nvoid main() {                                              \n    gl_Position = aPosition;                               \n    textureCoordinate = aTextureCoord.xy;                  \n}                                                          \n", "precision mediump float;                                   \nvarying vec2 textureCoordinate;                            \nuniform sampler2D inputTexture;                                \nvoid main() {                                              \n    gl_FragColor = texture2D(inputTexture, textureCoordinate); \n}                                                          \n");
    }

    /* JADX INFO: renamed from: b */
    public static float m2139b(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    /* JADX INFO: renamed from: c */
    public void mo2128c() {
        if (this.f4032f) {
            int[] iArr = this.f4047u;
            if (iArr != null) {
                GLES30.glDeleteTextures(1, iArr, 0);
                this.f4047u = null;
            }
            int[] iArr2 = this.f4046t;
            if (iArr2 != null) {
                GLES30.glDeleteFramebuffers(1, iArr2, 0);
                this.f4046t = null;
            }
            this.f4044r = -1;
            this.f4044r = -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!this.f4032f || i == -1 || !this.f4033g) {
            return false;
        }
        GLES30.glViewport(0, 0, this.f4042p, this.f4043q);
        GLES30.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES30.glClear(16384);
        GLES30.glUseProgram(this.f4036j);
        m2144q();
        m2142m(i, floatBuffer, floatBuffer2);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (i == -1 || this.f4046t == null || !this.f4032f || !this.f4033g) {
            return i;
        }
        GLES30.glViewport(0, 0, this.f4044r, this.f4045s);
        GLES30.glBindFramebuffer(36160, this.f4046t[0]);
        GLES30.glUseProgram(this.f4036j);
        m2144q();
        m2142m(i, floatBuffer, floatBuffer2);
        GLES30.glUseProgram(0);
        GLES30.glBindFramebuffer(36160, 0);
        return this.f4047u[0];
    }

    /* JADX INFO: renamed from: f */
    public int mo2140f() {
        return 3553;
    }

    /* JADX INFO: renamed from: g */
    public void mo2131g(int i, int i2) {
        if (this.f4032f) {
            if (this.f4046t != null && (this.f4044r != i || this.f4045s != i2)) {
                mo2128c();
            }
            if (this.f4046t == null) {
                this.f4044r = i;
                this.f4045s = i2;
                int[] iArr = new int[1];
                this.f4046t = iArr;
                int[] iArr2 = new int[1];
                this.f4047u = iArr2;
                OpenGLUtils.m2179d(iArr, iArr2, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        if (TextUtils.isEmpty(this.f4030d) || TextUtils.isEmpty(this.f4031e)) {
            this.f4037k = -1;
            this.f4038l = -1;
            this.f4039m = -1;
            this.f4032f = false;
            return;
        }
        int iM2181f = OpenGLUtils.m2181f(this.f4030d, this.f4031e);
        this.f4036j = iM2181f;
        this.f4037k = GLES30.glGetAttribLocation(iM2181f, "aPosition");
        this.f4038l = GLES30.glGetAttribLocation(this.f4036j, "aTextureCoord");
        this.f4039m = GLES30.glGetUniformLocation(this.f4036j, "inputTexture");
        this.f4032f = true;
    }

    /* JADX INFO: renamed from: i */
    public void mo2133i(int i, int i2) {
        this.f4042p = i;
        this.f4043q = i2;
    }

    /* JADX INFO: renamed from: j */
    public void mo2136j() {
        GLES30.glDrawArrays(5, 0, this.f4035i);
    }

    /* JADX INFO: renamed from: k */
    public void mo2141k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo2134l() {
    }

    /* JADX INFO: renamed from: m */
    public void m2142m(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        floatBuffer.position(0);
        GLES30.glVertexAttribPointer(this.f4037k, this.f4034h, 5126, false, 0, (Buffer) floatBuffer);
        GLES30.glEnableVertexAttribArray(this.f4037k);
        floatBuffer2.position(0);
        GLES30.glVertexAttribPointer(this.f4038l, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES30.glEnableVertexAttribArray(this.f4038l);
        GLES30.glActiveTexture(33984);
        GLES30.glBindTexture(mo2140f(), i);
        GLES30.glUniform1i(this.f4039m, 0);
        mo2134l();
        mo2136j();
        mo2141k();
        GLES30.glDisableVertexAttribArray(this.f4037k);
        GLES30.glDisableVertexAttribArray(this.f4038l);
        GLES30.glBindTexture(mo2140f(), 0);
    }

    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
    }

    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        if (this.f4032f) {
            GLES30.glDeleteProgram(this.f4036j);
            this.f4036j = -1;
        }
        mo2128c();
    }

    /* JADX INFO: renamed from: p */
    public void m2143p(Runnable runnable) {
        synchronized (this.f4029c) {
            this.f4029c.addLast(runnable);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2144q() {
        while (!this.f4029c.isEmpty()) {
            this.f4029c.removeFirst().run();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2145r(int i, float f) {
        m2143p(new b(this, i, f));
    }

    /* JADX INFO: renamed from: s */
    public void m2146s(int i, float[] fArr) {
        m2143p(new c(this, i, fArr));
    }

    /* JADX INFO: renamed from: t */
    public void m2147t(int i, int i2) {
        m2143p(new a(this, i, i2));
    }

    public GLImageFilter(Context context, String str, String str2) {
        this.f4027a = getClass().getSimpleName();
        this.f4033g = true;
        this.f4034h = 2;
        this.f4035i = TextureRotationUtils.f4260a.length / 2;
        this.f4044r = -1;
        this.f4045s = -1;
        this.f4028b = context;
        this.f4029c = new LinkedList<>();
        this.f4030d = str;
        this.f4031e = str2;
        mo2132h();
    }
}
