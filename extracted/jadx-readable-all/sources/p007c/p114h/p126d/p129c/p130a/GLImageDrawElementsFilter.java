package p007c.p114h.p126d.p129c.p130a;

import android.content.Context;
import android.opengl.GLES30;
import java.nio.ShortBuffer;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p126d.p129c.p143i.TextureRotationUtils;

/* JADX INFO: renamed from: c.h.d.c.a.c, reason: use source file name */
/* JADX INFO: compiled from: GLImageDrawElementsFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageDrawElementsFilter extends GLImageFilter {

    /* JADX INFO: renamed from: v */
    public ShortBuffer f4025v;

    /* JADX INFO: renamed from: w */
    public int f4026w;

    public GLImageDrawElementsFilter(Context context) {
        this(context, "attribute vec4 aPosition;                                  \nattribute vec4 aTextureCoord;                              \nvarying vec2 textureCoordinate;                            \nvoid main() {                                              \n    gl_Position = aPosition;                               \n    textureCoordinate = aTextureCoord.xy;                  \n}                                                          \n", "precision mediump float;                                   \nvarying vec2 textureCoordinate;                            \nuniform sampler2D inputTexture;                                \nvoid main() {                                              \n    gl_FragColor = texture2D(inputTexture, textureCoordinate); \n}                                                          \n");
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: j */
    public void mo2136j() {
        ShortBuffer shortBuffer = this.f4025v;
        if (shortBuffer != null) {
            GLES30.glDrawElements(4, this.f4026w, 5123, shortBuffer);
        } else {
            GLES30.glDrawArrays(5, 0, this.f4035i);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        mo2138v();
    }

    /* JADX INFO: renamed from: u */
    public void mo2137u() {
        mo2138v();
        this.f4025v = OpenGLUtils.m2182g(TextureRotationUtils.f4263d);
        this.f4026w = 6;
    }

    /* JADX INFO: renamed from: v */
    public void mo2138v() {
        ShortBuffer shortBuffer = this.f4025v;
        if (shortBuffer != null) {
            shortBuffer.clear();
            this.f4025v = null;
        }
    }

    public GLImageDrawElementsFilter(Context context, String str, String str2) {
        super(context, str, str2);
        mo2137u();
    }
}
