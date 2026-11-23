package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.vp */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public final class C3630vp extends Thread implements SurfaceTexture.OnFrameAvailableListener, InterfaceC3555tp {

    /* JADX INFO: renamed from: f */
    public static final float[] f20871f = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* JADX INFO: renamed from: A */
    public final Object f20872A;

    /* JADX INFO: renamed from: B */
    public EGL10 f20873B;

    /* JADX INFO: renamed from: C */
    public EGLDisplay f20874C;

    /* JADX INFO: renamed from: D */
    public EGLContext f20875D;

    /* JADX INFO: renamed from: E */
    public EGLSurface f20876E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f20877F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f20878G;

    /* JADX INFO: renamed from: g */
    public final C3592up f20879g;

    /* JADX INFO: renamed from: h */
    public final float[] f20880h;

    /* JADX INFO: renamed from: i */
    public final float[] f20881i;

    /* JADX INFO: renamed from: j */
    public final float[] f20882j;

    /* JADX INFO: renamed from: k */
    public final float[] f20883k;

    /* JADX INFO: renamed from: l */
    public final float[] f20884l;

    /* JADX INFO: renamed from: m */
    public final float[] f20885m;

    /* JADX INFO: renamed from: n */
    public final float[] f20886n;

    /* JADX INFO: renamed from: o */
    public float f20887o;

    /* JADX INFO: renamed from: p */
    public float f20888p;

    /* JADX INFO: renamed from: q */
    public float f20889q;

    /* JADX INFO: renamed from: r */
    public int f20890r;

    /* JADX INFO: renamed from: s */
    public int f20891s;

    /* JADX INFO: renamed from: t */
    public SurfaceTexture f20892t;

    /* JADX INFO: renamed from: u */
    public SurfaceTexture f20893u;

    /* JADX INFO: renamed from: v */
    public int f20894v;

    /* JADX INFO: renamed from: w */
    public int f20895w;

    /* JADX INFO: renamed from: x */
    public int f20896x;

    /* JADX INFO: renamed from: y */
    public final FloatBuffer f20897y;

    /* JADX INFO: renamed from: z */
    public final CountDownLatch f20898z;

    public C3630vp(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f20871f;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f20897y = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f20880h = new float[9];
        this.f20881i = new float[9];
        this.f20882j = new float[9];
        this.f20883k = new float[9];
        this.f20884l = new float[9];
        this.f20885m = new float[9];
        this.f20886n = new float[9];
        this.f20887o = Float.NaN;
        C3592up c3592up = new C3592up(context);
        this.f20879g = c3592up;
        c3592up.f20395h = this;
        this.f20898z = new CountDownLatch(1);
        this.f20872A = new Object();
    }

    /* JADX INFO: renamed from: e */
    public static final void m8574e(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8575f(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[2] * fArr3[6]) + (fArr2[1] * fArr3[3]) + (fArr2[0] * fArr3[0]);
        fArr[1] = (fArr2[2] * fArr3[7]) + (fArr2[1] * fArr3[4]) + (fArr2[0] * fArr3[1]);
        fArr[2] = (fArr2[2] * fArr3[8]) + (fArr2[1] * fArr3[5]) + (fArr2[0] * fArr3[2]);
        fArr[3] = (fArr2[5] * fArr3[6]) + (fArr2[4] * fArr3[3]) + (fArr2[3] * fArr3[0]);
        fArr[4] = (fArr2[5] * fArr3[7]) + (fArr2[4] * fArr3[4]) + (fArr2[3] * fArr3[1]);
        fArr[5] = (fArr2[5] * fArr3[8]) + (fArr2[4] * fArr3[5]) + (fArr2[3] * fArr3[2]);
        fArr[6] = (fArr2[8] * fArr3[6]) + (fArr2[7] * fArr3[3]) + (fArr2[6] * fArr3[0]);
        fArr[7] = (fArr2[8] * fArr3[7]) + (fArr2[7] * fArr3[4]) + (fArr2[6] * fArr3[1]);
        fArr[8] = (fArr2[8] * fArr3[8]) + (fArr2[7] * fArr3[5]) + (fArr2[6] * fArr3[2]);
    }

    /* JADX INFO: renamed from: g */
    public static final void m8576g(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* JADX INFO: renamed from: h */
    public static final void m8577h(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* JADX INFO: renamed from: i */
    public static final int m8578i(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m8574e("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            m8574e("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            m8574e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            m8574e("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                m8574e("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    /* JADX INFO: renamed from: a */
    public final void m8579a(int i, int i2) {
        synchronized (this.f20872A) {
            this.f20891s = i;
            this.f20890r = i2;
            this.f20877F = true;
            this.f20872A.notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8580b() {
        synchronized (this.f20872A) {
            this.f20878G = true;
            this.f20893u = null;
            this.f20872A.notifyAll();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8581c(float f, float f2) {
        int i = this.f20891s;
        int i2 = this.f20890r;
        float f3 = i > i2 ? i : i2;
        this.f20888p -= (f * 1.7453293f) / f3;
        float f4 = this.f20889q - ((f2 * 1.7453293f) / f3);
        this.f20889q = f4;
        if (f4 < -1.5707964f) {
            this.f20889q = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f20889q = 1.5707964f;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8582d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f20876E;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.f20873B.eglDestroySurface(this.f20874C, this.f20876E) | this.f20873B.eglMakeCurrent(this.f20874C, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f20876E = null;
        }
        EGLContext eGLContext = this.f20875D;
        if (eGLContext != null) {
            zEglDestroyContext |= this.f20873B.eglDestroyContext(this.f20874C, eGLContext);
            this.f20875D = null;
        }
        EGLDisplay eGLDisplay = this.f20874C;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.f20873B.eglTerminate(eGLDisplay);
        this.f20874C = null;
        return zEglTerminate | zEglDestroyContext;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f20896x++;
        synchronized (this.f20872A) {
            this.f20872A.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int iGlCreateProgram;
        if (this.f20893u == null) {
            C2622l.m5408n3("SphericalVideoProcessor started with no output texture.");
            this.f20898z.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f20873B = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f20874C = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.f20873B.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.f20873B.eglChooseConfig(this.f20874C, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig == null) {
                z = false;
            } else {
                EGLContext eGLContextEglCreateContext = this.f20873B.eglCreateContext(this.f20874C, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f20875D = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == EGL10.EGL_NO_CONTEXT) {
                    z = false;
                } else {
                    EGLSurface eGLSurfaceEglCreateWindowSurface = this.f20873B.eglCreateWindowSurface(this.f20874C, eGLConfig, this.f20893u, null);
                    this.f20876E = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE || !this.f20873B.eglMakeCurrent(this.f20874C, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.f20875D)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
        }
        AbstractC3718y2<String> abstractC3718y2 = C3052g3.f14203I0;
        C2862b c2862b = C2862b.f12493a;
        int iM8578i = m8578i(35633, !((String) c2862b.f12496d.m6596a(abstractC3718y2)).equals(abstractC3718y2.f21732c) ? (String) c2862b.f12496d.m6596a(abstractC3718y2) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iM8578i == 0) {
            iGlCreateProgram = 0;
        } else {
            AbstractC3718y2<String> abstractC3718y3 = C3052g3.f14209J0;
            int iM8578i2 = m8578i(35632, !((String) c2862b.f12496d.m6596a(abstractC3718y3)).equals(abstractC3718y3.f21732c) ? (String) c2862b.f12496d.m6596a(abstractC3718y3) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iM8578i2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                m8574e("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iM8578i);
                    m8574e("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iM8578i2);
                    m8574e("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    m8574e("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    m8574e("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        m8574e("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        m8574e("validateProgram");
                    }
                }
            }
        }
        this.f20894v = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        m8574e("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f20894v, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f20897y);
        m8574e("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        m8574e("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        m8574e("genTextures");
        int i = iArr3[0];
        GLES20.glBindTexture(36197, i);
        m8574e("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        m8574e("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        m8574e("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        m8574e("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        m8574e("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f20894v, "uVMat");
        this.f20895w = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i2 = this.f20894v;
        if (!z || i2 == 0) {
            String strValueOf = String.valueOf(GLUtils.getEGLErrorString(this.f20873B.eglGetError()));
            String strConcat = strValueOf.length() != 0 ? "EGL initialization failed: ".concat(strValueOf) : new String("EGL initialization failed: ");
            C2622l.m5408n3(strConcat);
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(new Throwable(strConcat), "SphericalVideoProcessor.run.1");
            m8582d();
            this.f20898z.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.f20892t = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f20898z.countDown();
        C3592up c3592up = this.f20879g;
        if (c3592up.f20394g == null) {
            Sensor defaultSensor = c3592up.f20388a.getDefaultSensor(11);
            if (defaultSensor == null) {
                C2622l.m5408n3("No Sensor of TYPE_ROTATION_VECTOR");
            } else {
                HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                handlerThread.start();
                xr1 xr1Var = new xr1(handlerThread.getLooper());
                c3592up.f20394g = xr1Var;
                if (!c3592up.f20388a.registerListener(c3592up, defaultSensor, 0, xr1Var)) {
                    C2622l.m5408n3("SensorManager.registerListener failed.");
                    c3592up.m8515a();
                }
            }
        }
        try {
            try {
                this.f20877F = true;
                while (!this.f20878G) {
                    while (this.f20896x > 0) {
                        this.f20892t.updateTexImage();
                        this.f20896x--;
                    }
                    if (this.f20879g.m8516b(this.f20880h)) {
                        if (Float.isNaN(this.f20887o)) {
                            float[] fArr = this.f20880h;
                            float[] fArr2 = {0.0f, 1.0f, 0.0f};
                            float f = fArr[0];
                            float f2 = fArr2[0];
                            float f3 = fArr[1];
                            float f4 = fArr2[1];
                            float f5 = (f3 * f4) + (f * f2);
                            float f6 = fArr[2];
                            float f7 = fArr2[2];
                            float[] fArr3 = {(f6 * f7) + f5, (fArr[5] * f7) + (fArr[4] * f4) + (fArr[3] * f2), (fArr[8] * f7) + (fArr[7] * f4) + (fArr[6] * f2)};
                            this.f20887o = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                        }
                        m8577h(this.f20885m, this.f20887o + this.f20888p);
                    } else {
                        m8576g(this.f20880h, -1.5707964f);
                        m8577h(this.f20885m, this.f20888p);
                    }
                    m8576g(this.f20881i, 1.5707964f);
                    m8575f(this.f20882j, this.f20885m, this.f20881i);
                    m8575f(this.f20883k, this.f20880h, this.f20882j);
                    m8576g(this.f20884l, this.f20889q);
                    m8575f(this.f20886n, this.f20884l, this.f20883k);
                    GLES20.glUniformMatrix3fv(this.f20895w, 1, false, this.f20886n, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    m8574e("drawArrays");
                    GLES20.glFinish();
                    this.f20873B.eglSwapBuffers(this.f20874C, this.f20876E);
                    if (this.f20877F) {
                        GLES20.glViewport(0, 0, this.f20891s, this.f20890r);
                        m8574e("viewport");
                        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f20894v, "uFOVx");
                        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.f20894v, "uFOVy");
                        int i3 = this.f20891s;
                        int i4 = this.f20890r;
                        if (i3 > i4) {
                            GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                            GLES20.glUniform1f(iGlGetUniformLocation3, (this.f20890r * 0.87266463f) / this.f20891s);
                        } else {
                            GLES20.glUniform1f(iGlGetUniformLocation2, (i3 * 0.87266463f) / i4);
                            GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                        }
                        this.f20877F = false;
                    }
                    try {
                        synchronized (this.f20872A) {
                            try {
                                if (!this.f20878G && !this.f20877F && this.f20896x == 0) {
                                    this.f20872A.wait();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                this.f20879g.m8515a();
                this.f20892t.setOnFrameAvailableListener(null);
                this.f20892t = null;
                m8582d();
            } catch (Throwable th2) {
                this.f20879g.m8515a();
                this.f20892t.setOnFrameAvailableListener(null);
                this.f20892t = null;
                m8582d();
                throw th2;
            }
        } catch (IllegalStateException unused2) {
            C2622l.m5226A3("SphericalVideoProcessor halted unexpectedly.");
            this.f20879g.m8515a();
            this.f20892t.setOnFrameAvailableListener(null);
            this.f20892t = null;
            m8582d();
        } catch (Throwable th3) {
            C2622l.m5438t3("SphericalVideoProcessor died.", th3);
            C2998en c2998en2 = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en2.f13616e, c2998en2.f13617f).mo8736b(th3, "SphericalVideoProcessor.run.2");
            this.f20879g.m8515a();
            this.f20892t.setOnFrameAvailableListener(null);
            this.f20892t = null;
            m8582d();
        }
    }
}
