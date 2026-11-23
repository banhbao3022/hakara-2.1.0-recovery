package p007c.p114h.p126d.p129c.p141h;

import android.content.Context;
import android.opengl.GLES30;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Objects;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicSticker;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicStickerFrameData;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.h.b, reason: use source file name */
/* JADX INFO: compiled from: DynamicStickerFrameFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class DynamicStickerFrameFilter extends DynamicStickerBaseFilter {

    /* JADX INFO: renamed from: E */
    public int f4218E;

    /* JADX INFO: renamed from: F */
    public int f4219F;

    /* JADX INFO: renamed from: G */
    public int f4220G;

    /* JADX INFO: renamed from: H */
    public FloatBuffer f4221H;

    /* JADX INFO: renamed from: I */
    public int f4222I;

    public DynamicStickerFrameFilter(Context context, DynamicSticker dynamicSticker) {
        super(context, dynamicSticker, OpenGLUtils.m2186k(context, "shader/sticker/vertex_sticker_frame.glsl"), OpenGLUtils.m2186k(context, "shader/sticker/fragment_sticker_frame.glsl"));
        this.f4221H = OpenGLUtils.m2178c(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.f4222I = -1;
        DynamicSticker dynamicSticker2 = this.f4216C;
        if (dynamicSticker2 == null || dynamicSticker2.f4258a == null) {
            return;
        }
        for (int i = 0; i < this.f4216C.f4258a.size(); i++) {
            if (this.f4216C.f4258a.get(i) instanceof DynamicStickerFrameData) {
                Objects.requireNonNull(this.f4216C);
                Objects.requireNonNull(this.f4216C.f4258a.get(i));
                this.f4217D.add(new DynamicStickerLoader(this, this.f4216C.f4258a.get(i), "null/null"));
            }
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        for (int i2 = 0; i2 < this.f4217D.size(); i2++) {
            this.f4217D.get(i2).m2174b();
            this.f4222I = this.f4217D.get(i2).f4224b;
        }
        return super.mo2129d(i, floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        for (int i2 = 0; i2 < this.f4217D.size(); i2++) {
            this.f4217D.get(i2).m2174b();
            this.f4222I = this.f4217D.get(i2).f4224b;
        }
        return super.mo2130e(i, floatBuffer, floatBuffer2);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        int i = this.f4036j;
        if (i != -1) {
            this.f4218E = GLES30.glGetAttribLocation(i, "aStickerCoord");
            this.f4219F = GLES30.glGetUniformLocation(this.f4036j, "stickerTexture");
            this.f4220G = GLES30.glGetUniformLocation(this.f4036j, "enableSticker");
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: k */
    public void mo2141k() {
        GLES30.glDisableVertexAttribArray(this.f4218E);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: l */
    public void mo2134l() {
        this.f4221H.position(0);
        GLES30.glVertexAttribPointer(this.f4218E, 2, 5126, false, 0, (Buffer) this.f4221H);
        GLES30.glEnableVertexAttribArray(this.f4218E);
        int i = this.f4222I;
        if (i == -1) {
            GLES30.glUniform1i(this.f4220G, 0);
        } else {
            OpenGLUtils.m2176a(this.f4219F, i, 1);
            GLES30.glUniform1i(this.f4220G, 1);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageAudioFilter, p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        for (int i = 0; i < this.f4217D.size(); i++) {
            if (this.f4217D.get(i) != null) {
                this.f4217D.get(i).m2173a();
            }
        }
        this.f4217D.clear();
    }
}
