package p007c.p114h.p126d.p129c.p143i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.d.c.i.a, reason: use source file name */
/* JADX INFO: compiled from: OpenGLUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class OpenGLUtils {

    /* JADX INFO: renamed from: a */
    public static final float[] f4259a;

    static {
        float[] fArr = new float[16];
        f4259a = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m2176a(int i, int i2, int i3) {
        if (i3 > 31) {
            throw new IllegalArgumentException("index must be no more than 31!");
        }
        GLES30.glActiveTexture(33984 + i3);
        GLES30.glBindTexture(3553, i2);
        GLES30.glUniform1i(i, i3);
    }

    /* JADX INFO: renamed from: b */
    public static void m2177b(String str) {
        int iGlGetError = GLES30.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbM1561L = outline.m1561L(str, ": glError 0x");
            sbM1561L.append(Integer.toHexString(iGlGetError));
            Log.e("OpenGLUtils", sbM1561L.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static FloatBuffer m2178c(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    /* JADX INFO: renamed from: d */
    public static void m2179d(int[] iArr, int[] iArr2, int i, int i2) {
        GLES30.glGenFramebuffers(iArr.length, iArr, 0);
        GLES30.glGenTextures(iArr2.length, iArr2, 0);
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            GLES30.glBindTexture(3553, iArr2[i3]);
            GLES30.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES30.glTexParameterf(3553, 10240, 9729.0f);
            GLES30.glTexParameterf(3553, 10241, 9729.0f);
            GLES30.glTexParameterf(3553, 10242, 33071.0f);
            GLES30.glTexParameterf(3553, 10243, 33071.0f);
            GLES30.glBindFramebuffer(36160, iArr[i3]);
            GLES30.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i3], 0);
            GLES30.glBindTexture(3553, 0);
            GLES30.glBindFramebuffer(36160, 0);
        }
        m2177b("createFrameBuffer");
    }

    /* JADX INFO: renamed from: e */
    public static int m2180e() {
        int[] iArr = new int[1];
        GLES30.glGenTextures(1, iArr, 0);
        m2177b("glGenTextures");
        int i = iArr[0];
        GLES30.glBindTexture(36197, i);
        m2177b("glBindTexture " + i);
        GLES30.glTexParameterf(36197, 10241, 9728.0f);
        GLES30.glTexParameterf(36197, 10240, 9729.0f);
        GLES30.glTexParameterf(36197, 10242, 33071.0f);
        GLES30.glTexParameterf(36197, 10243, 33071.0f);
        m2177b("glTexParameter");
        return i;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized int m2181f(String str, String str2) {
        int iM2189n = m2189n(35633, str);
        int i = 0;
        if (iM2189n == 0) {
            return 0;
        }
        int iM2189n2 = m2189n(35632, str2);
        if (iM2189n2 == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES30.glCreateProgram();
        m2177b("glCreateProgram");
        if (iGlCreateProgram == 0) {
            Log.e("OpenGLUtils", "Could not create program");
        }
        GLES30.glAttachShader(iGlCreateProgram, iM2189n);
        m2177b("glAttachShader");
        GLES30.glAttachShader(iGlCreateProgram, iM2189n2);
        m2177b("glAttachShader");
        GLES30.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES30.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.e("OpenGLUtils", "Could not link program: ");
            Log.e("OpenGLUtils", GLES30.glGetProgramInfoLog(iGlCreateProgram));
            GLES30.glDeleteProgram(iGlCreateProgram);
        } else {
            i = iGlCreateProgram;
        }
        if (iM2189n > 0) {
            GLES30.glDetachShader(i, iM2189n);
            GLES30.glDeleteShader(iM2189n);
        }
        if (iM2189n2 > 0) {
            GLES30.glDetachShader(i, iM2189n2);
            GLES30.glDeleteShader(iM2189n2);
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static ShortBuffer m2182g(short[] sArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        shortBufferAsShortBuffer.put(sArr);
        shortBufferAsShortBuffer.position(0);
        return shortBufferAsShortBuffer;
    }

    /* JADX INFO: renamed from: h */
    public static int m2183h(Bitmap bitmap) {
        int[] iArr = new int[1];
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        GLES30.glGenTextures(1, iArr, 0);
        m2177b("glGenTexture");
        GLES30.glBindTexture(3553, iArr[0]);
        GLES30.glTexParameterf(3553, 10241, 9728.0f);
        GLES30.glTexParameterf(3553, 10240, 9729.0f);
        GLES30.glTexParameterf(3553, 10242, 33071.0f);
        GLES30.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return iArr[0];
    }

    /* JADX INFO: renamed from: i */
    public static int m2184i(Context context, String str) {
        int[] iArr = new int[1];
        GLES30.glGenTextures(1, iArr, 0);
        if (iArr[0] != 0) {
            Bitmap bitmapDecodeStream = null;
            try {
                InputStream inputStreamOpen = context.getResources().getAssets().open(str);
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                inputStreamOpen.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            GLES30.glBindTexture(3553, iArr[0]);
            GLES30.glTexParameterf(3553, 10240, 9729.0f);
            GLES30.glTexParameterf(3553, 10241, 9729.0f);
            GLES30.glTexParameterf(3553, 10242, 33071.0f);
            GLES30.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmapDecodeStream, 0);
            bitmapDecodeStream.recycle();
        }
        if (iArr[0] != 0) {
            return iArr[0];
        }
        throw new RuntimeException("Error loading texture.");
    }

    /* JADX INFO: renamed from: j */
    public static void m2185j(int i) {
        GLES30.glDeleteTextures(1, new int[]{i}, 0);
    }

    /* JADX INFO: renamed from: k */
    public static String m2186k(Context context, String str) {
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = context.getResources().getAssets().open(str);
        } catch (IOException e) {
            e.printStackTrace();
            inputStreamOpen = null;
        }
        return m2188m(inputStreamOpen);
    }

    /* JADX INFO: renamed from: l */
    public static String m2187l(String str) {
        FileInputStream fileInputStream = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.isDirectory()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return m2188m(fileInputStream);
    }

    /* JADX INFO: renamed from: m */
    public static String m2188m(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m2189n(int i, String str) {
        int iGlCreateShader = GLES30.glCreateShader(i);
        m2177b("glCreateShader type=" + i);
        GLES30.glShaderSource(iGlCreateShader, str);
        GLES30.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES30.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("OpenGLUtils", "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(GLES30.glGetShaderInfoLog(iGlCreateShader));
        Log.e("OpenGLUtils", sb.toString());
        GLES30.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
