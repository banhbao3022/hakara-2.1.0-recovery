package p007c.p114h.p126d.p129c.p133c;

import android.content.Context;
import android.opengl.GLES30;
import android.text.TextUtils;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p126d.p129c.p130a.GLImageAudioFilter;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColorData;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.c.a, reason: use source file name */
/* JADX INFO: compiled from: DynamicColorBaseFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class DynamicColorBaseFilter extends GLImageAudioFilter {

    /* JADX INFO: renamed from: C */
    public DynamicColorData f4126C;

    /* JADX INFO: renamed from: D */
    public DynamicColorLoader f4127D;

    public DynamicColorBaseFilter(Context context, DynamicColorData dynamicColorData, String str) {
        super(context, (dynamicColorData == null || TextUtils.isEmpty(dynamicColorData.f4143b)) ? "attribute vec4 aPosition;                                  \nattribute vec4 aTextureCoord;                              \nvarying vec2 textureCoordinate;                            \nvoid main() {                                              \n    gl_Position = aPosition;                               \n    textureCoordinate = aTextureCoord.xy;                  \n}                                                          \n" : m2151v(context, str, dynamicColorData.f4143b), (dynamicColorData == null || TextUtils.isEmpty(dynamicColorData.f4144c)) ? "precision mediump float;                                   \nvarying vec2 textureCoordinate;                            \nuniform sampler2D inputTexture;                                \nvoid main() {                                              \n    gl_FragColor = texture2D(inputTexture, textureCoordinate); \n}                                                          \n" : m2151v(context, str, dynamicColorData.f4144c));
        this.f4126C = dynamicColorData;
        DynamicColorLoader dynamicColorLoader = new DynamicColorLoader(this, dynamicColorData, str);
        this.f4127D = dynamicColorLoader;
        int i = this.f4036j;
        Objects.requireNonNull(dynamicColorLoader);
        if (i == -1 || dynamicColorLoader.f4129b == null) {
            return;
        }
        dynamicColorLoader.f4136i = GLES30.glGetUniformLocation(i, "strength");
        if (dynamicColorLoader.f4129b.f4148g) {
            dynamicColorLoader.f4134g = GLES30.glGetUniformLocation(i, "texelWidthOffset");
            dynamicColorLoader.f4135h = GLES30.glGetUniformLocation(i, "texelHeightOffset");
        } else {
            dynamicColorLoader.f4134g = -1;
            dynamicColorLoader.f4135h = -1;
        }
        for (int i2 = 0; i2 < dynamicColorLoader.f4129b.f4145d.size(); i2++) {
            String str2 = dynamicColorLoader.f4129b.f4145d.get(i2);
            dynamicColorLoader.f4132e.put(str2, Integer.valueOf(GLES30.glGetUniformLocation(i, str2)));
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m2151v(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("shader is empty!");
        }
        String strM1600v = outline.m1600v(str, "/", str2);
        if (strM1600v.startsWith("assets://")) {
            return OpenGLUtils.m2186k(context, strM1600v.substring(9));
        }
        return strM1600v.startsWith("file://") ? OpenGLUtils.m2187l(strM1600v.substring(7)) : OpenGLUtils.m2187l(strM1600v);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        DynamicColorLoader dynamicColorLoader = this.f4127D;
        if (dynamicColorLoader != null) {
            int i = dynamicColorLoader.f4136i;
            if (i != -1) {
                GLES30.glUniform1f(i, dynamicColorLoader.f4137j);
            }
            int i2 = dynamicColorLoader.f4134g;
            if (i2 != -1) {
                GLES30.glUniform1f(i2, dynamicColorLoader.f4138k);
            }
            int i3 = dynamicColorLoader.f4135h;
            if (i3 != -1) {
                GLES30.glUniform1f(i3, dynamicColorLoader.f4139l);
            }
            if (dynamicColorLoader.f4133f == null || dynamicColorLoader.f4129b == null) {
                return;
            }
            for (int i4 = 0; i4 < dynamicColorLoader.f4129b.f4146e.size(); i4++) {
                for (int i5 = 0; i5 < dynamicColorLoader.f4132e.size(); i5++) {
                    Integer num = dynamicColorLoader.f4132e.get(dynamicColorLoader.f4129b.f4146e.get(i4).f4151a);
                    if (num != null && dynamicColorLoader.f4133f[i4] != -1) {
                        OpenGLUtils.m2176a(num.intValue(), dynamicColorLoader.f4133f[i4], i4 + 1);
                    }
                }
            }
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        DynamicColorLoader dynamicColorLoader = this.f4127D;
        if (dynamicColorLoader != null) {
            dynamicColorLoader.f4138k = 1.0f / i;
            dynamicColorLoader.f4139l = 1.0f / i2;
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageAudioFilter, p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        DynamicColorLoader dynamicColorLoader = this.f4127D;
        if (dynamicColorLoader != null) {
            int[] iArr = dynamicColorLoader.f4133f;
            if (iArr != null && iArr.length > 0) {
                GLES30.glDeleteTextures(iArr.length, iArr, 0);
                dynamicColorLoader.f4133f = null;
            }
            if (dynamicColorLoader.f4131d.get() != null) {
                dynamicColorLoader.f4131d.clear();
            }
        }
    }
}
