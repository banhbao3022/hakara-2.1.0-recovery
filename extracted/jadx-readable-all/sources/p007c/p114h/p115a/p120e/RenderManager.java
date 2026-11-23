package p007c.p114h.p115a.p120e;

import android.content.Context;
import android.util.SparseArray;
import java.nio.FloatBuffer;
import p007c.p114h.p115a.p116a.CameraParam;
import p007c.p114h.p126d.p129c.p130a.GLImageDepthBlurFilter;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p130a.GLImageOESInputFilter;
import p007c.p114h.p126d.p129c.p130a.GLImageVignetteFilter;
import p007c.p114h.p126d.p129c.p131b.GLImageBeautyFilter;
import p007c.p114h.p126d.p129c.p133c.GLImageDynamicColorFilter;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColor;
import p007c.p114h.p126d.p129c.p135d.GLImageFacePointsFilter;
import p007c.p114h.p126d.p129c.p135d.GLImageFaceReshapeFilter;
import p007c.p114h.p126d.p129c.p136e.GLImageMakeupFilter;
import p007c.p114h.p126d.p129c.p136e.p137c.DynamicMakeup;
import p007c.p114h.p126d.p129c.p138f.GLImageFrameEdgeBlurFilter;
import p007c.p114h.p126d.p129c.p141h.GLImageDynamicStickerFilter;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicSticker;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p126d.p129c.p143i.TextureRotationUtils;

/* JADX INFO: renamed from: c.h.a.e.g, reason: use source file name */
/* JADX INFO: compiled from: RenderManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class RenderManager {

    /* JADX INFO: renamed from: c */
    public FloatBuffer f3944c;

    /* JADX INFO: renamed from: d */
    public FloatBuffer f3945d;

    /* JADX INFO: renamed from: e */
    public FloatBuffer f3946e;

    /* JADX INFO: renamed from: f */
    public FloatBuffer f3947f;

    /* JADX INFO: renamed from: g */
    public int f3948g;

    /* JADX INFO: renamed from: h */
    public int f3949h;

    /* JADX INFO: renamed from: i */
    public int f3950i;

    /* JADX INFO: renamed from: j */
    public int f3951j;

    /* JADX INFO: renamed from: l */
    public Context f3953l;

    /* JADX INFO: renamed from: a */
    public SparseArray<GLImageFilter> f3942a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public int f3943b = 2;

    /* JADX INFO: renamed from: k */
    public CameraParam f3952k = CameraParam.f3841a;

    /* JADX INFO: renamed from: a */
    public final float m2093a(float f, float f2) {
        return f == 0.0f ? f2 : 1.0f - f2;
    }

    /* JADX INFO: renamed from: b */
    public final void m2094b() {
        float[] fArr;
        float[] fArr2 = TextureRotationUtils.f4261b;
        float[] fArr3 = TextureRotationUtils.f4260a;
        float fMax = Math.max(this.f3948g / this.f3950i, this.f3949h / this.f3951j);
        int iRound = Math.round(this.f3950i * fMax);
        int iRound2 = Math.round(this.f3951j * fMax);
        float f = iRound / this.f3948g;
        float f2 = iRound2 / this.f3949h;
        int i = this.f3943b;
        float[] fArr4 = null;
        if (i == 1) {
            float[] fArr5 = {fArr3[0] / f2, fArr3[1] / f, fArr3[2] / f2, fArr3[3] / f, fArr3[4] / f2, fArr3[5] / f, fArr3[6] / f2, fArr3[7] / f};
            fArr = null;
            fArr4 = fArr5;
        } else if (i == 2) {
            float f3 = (1.0f - (1.0f / f)) / 2.0f;
            float f4 = (1.0f - (1.0f / f2)) / 2.0f;
            fArr = new float[]{m2093a(fArr2[0], f3), m2093a(fArr2[1], f4), m2093a(fArr2[2], f3), m2093a(fArr2[3], f4), m2093a(fArr2[4], f3), m2093a(fArr2[5], f4), m2093a(fArr2[6], f3), m2093a(fArr2[7], f4)};
        } else {
            fArr = null;
        }
        if (fArr4 != null) {
            fArr3 = fArr4;
        }
        if (fArr != null) {
            fArr2 = fArr;
        }
        if (this.f3946e == null || this.f3947f == null) {
            m2101i();
        }
        this.f3946e.clear();
        this.f3946e.put(fArr3).position(0);
        this.f3947f.clear();
        this.f3947f.put(fArr2).position(0);
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m2095c(DynamicColor dynamicColor) {
        if (this.f3942a.get(4) != null) {
            this.f3942a.get(4).mo2126o();
            this.f3942a.put(4, null);
        }
        if (dynamicColor == null) {
            return;
        }
        GLImageDynamicColorFilter gLImageDynamicColorFilter = new GLImageDynamicColorFilter(this.f3953l, dynamicColor);
        gLImageDynamicColorFilter.mo2135n(this.f3950i, this.f3951j);
        gLImageDynamicColorFilter.mo2131g(this.f3950i, this.f3951j);
        gLImageDynamicColorFilter.mo2133i(this.f3948g, this.f3949h);
        this.f3942a.put(4, gLImageDynamicColorFilter);
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m2096d(DynamicMakeup dynamicMakeup) {
        if (this.f3942a.get(2) != null) {
            ((GLImageMakeupFilter) this.f3942a.get(2)).m2153u(dynamicMakeup);
        } else {
            GLImageMakeupFilter gLImageMakeupFilter = new GLImageMakeupFilter(this.f3953l, dynamicMakeup);
            gLImageMakeupFilter.mo2135n(this.f3950i, this.f3951j);
            gLImageMakeupFilter.mo2131g(this.f3950i, this.f3951j);
            int i = this.f3948g;
            int i2 = this.f3949h;
            gLImageMakeupFilter.f4042p = i;
            gLImageMakeupFilter.f4043q = i2;
            this.f3942a.put(2, gLImageMakeupFilter);
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m2097e(DynamicColor dynamicColor) {
        if (this.f3942a.get(5) != null) {
            this.f3942a.get(5).mo2126o();
            this.f3942a.put(5, null);
        }
        if (dynamicColor == null) {
            return;
        }
        GLImageDynamicColorFilter gLImageDynamicColorFilter = new GLImageDynamicColorFilter(this.f3953l, dynamicColor);
        gLImageDynamicColorFilter.mo2135n(this.f3950i, this.f3951j);
        gLImageDynamicColorFilter.mo2131g(this.f3950i, this.f3951j);
        gLImageDynamicColorFilter.mo2133i(this.f3948g, this.f3949h);
        this.f3942a.put(5, gLImageDynamicColorFilter);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m2098f(DynamicSticker dynamicSticker) {
        if (this.f3942a.get(5) != null) {
            this.f3942a.get(5).mo2126o();
            this.f3942a.put(5, null);
        }
        if (dynamicSticker == null) {
            return;
        }
        GLImageDynamicStickerFilter gLImageDynamicStickerFilter = new GLImageDynamicStickerFilter(this.f3953l, dynamicSticker);
        gLImageDynamicStickerFilter.mo2135n(this.f3950i, this.f3951j);
        gLImageDynamicStickerFilter.mo2131g(this.f3950i, this.f3951j);
        gLImageDynamicStickerFilter.mo2133i(this.f3948g, this.f3949h);
        this.f3942a.put(5, gLImageDynamicStickerFilter);
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m2099g(boolean z) {
        try {
            if (z) {
                this.f3942a.get(8).mo2126o();
                GLImageFrameEdgeBlurFilter gLImageFrameEdgeBlurFilter = new GLImageFrameEdgeBlurFilter(this.f3953l);
                gLImageFrameEdgeBlurFilter.mo2135n(this.f3950i, this.f3951j);
                gLImageFrameEdgeBlurFilter.mo2133i(this.f3948g, this.f3949h);
                this.f3942a.put(8, gLImageFrameEdgeBlurFilter);
            } else {
                this.f3942a.get(8).mo2126o();
                GLImageFilter gLImageFilter = new GLImageFilter(this.f3953l);
                int i = this.f3950i;
                int i2 = this.f3951j;
                gLImageFilter.f4040n = i;
                gLImageFilter.f4041o = i2;
                int i3 = this.f3948g;
                int i4 = this.f3949h;
                gLImageFilter.f4042p = i3;
                gLImageFilter.f4043q = i4;
                this.f3942a.put(8, gLImageFilter);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2100h(Context context) {
        m2101i();
        m2104l();
        this.f3942a.put(0, new GLImageOESInputFilter(context));
        this.f3942a.put(1, new GLImageBeautyFilter(context));
        this.f3942a.put(2, new GLImageMakeupFilter(context, null));
        this.f3942a.put(3, new GLImageFaceReshapeFilter(context));
        this.f3942a.put(4, null);
        this.f3942a.put(5, null);
        this.f3942a.put(6, new GLImageDepthBlurFilter(context));
        this.f3942a.put(7, new GLImageVignetteFilter(context));
        this.f3942a.put(8, new GLImageFilter(context));
        this.f3942a.put(9, new GLImageFacePointsFilter(context));
        this.f3953l = context;
    }

    /* JADX INFO: renamed from: i */
    public final void m2101i() {
        m2103k();
        float[] fArr = TextureRotationUtils.f4260a;
        this.f3946e = OpenGLUtils.m2178c(fArr);
        float[] fArr2 = TextureRotationUtils.f4261b;
        this.f3947f = OpenGLUtils.m2178c(fArr2);
        this.f3944c = OpenGLUtils.m2178c(fArr);
        this.f3945d = OpenGLUtils.m2178c(fArr2);
    }

    /* JADX INFO: renamed from: j */
    public final void m2102j() {
        for (int i = 0; i < 10; i++) {
            if (this.f3942a.get(i) != null) {
                this.f3942a.get(i).mo2135n(this.f3950i, this.f3951j);
                if (i < 8) {
                    this.f3942a.get(i).mo2131g(this.f3950i, this.f3951j);
                }
                this.f3942a.get(i).mo2133i(this.f3948g, this.f3949h);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2103k() {
        FloatBuffer floatBuffer = this.f3944c;
        if (floatBuffer != null) {
            floatBuffer.clear();
            this.f3944c = null;
        }
        FloatBuffer floatBuffer2 = this.f3945d;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
            this.f3945d = null;
        }
        FloatBuffer floatBuffer3 = this.f3946e;
        if (floatBuffer3 != null) {
            floatBuffer3.clear();
            this.f3946e = null;
        }
        FloatBuffer floatBuffer4 = this.f3947f;
        if (floatBuffer4 != null) {
            floatBuffer4.clear();
            this.f3947f = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2104l() {
        for (int i = 0; i < 10; i++) {
            if (this.f3942a.get(i) != null) {
                this.f3942a.get(i).mo2126o();
            }
        }
        this.f3942a.clear();
    }
}
