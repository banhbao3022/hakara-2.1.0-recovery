package p007c.p114h.p126d.p129c.p131b;

import android.content.Context;
import java.nio.FloatBuffer;
import java.util.Objects;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p130a.GLImageGaussianBlurFilter;
import p007c.p114h.p126d.p129c.p131b.p132g.BeautyParam;
import p007c.p114h.p126d.p129c.p131b.p132g.IBeautify;

/* JADX INFO: renamed from: c.h.d.c.b.e, reason: use source file name */
/* JADX INFO: compiled from: GLImageBeautyFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageBeautyFilter extends GLImageFilter implements IBeautify {

    /* JADX INFO: renamed from: A */
    public GLImageBeautyFaceFilter f4115A;

    /* JADX INFO: renamed from: B */
    public float f4116B;

    /* JADX INFO: renamed from: v */
    public GLImageBeautyComplexionFilter f4117v;

    /* JADX INFO: renamed from: w */
    public GLImageBeautyBlurFilter f4118w;

    /* JADX INFO: renamed from: x */
    public GLImageBeautyHighPassFilter f4119x;

    /* JADX INFO: renamed from: y */
    public GLImageGaussianBlurFilter f4120y;

    /* JADX INFO: renamed from: z */
    public GLImageBeautyAdjustFilter f4121z;

    public GLImageBeautyFilter(Context context) {
        this(context, null, null);
    }

    @Override // p007c.p114h.p126d.p129c.p131b.p132g.IBeautify
    /* JADX INFO: renamed from: a */
    public void mo2149a(BeautyParam beautyParam) {
        GLImageBeautyComplexionFilter gLImageBeautyComplexionFilter = this.f4117v;
        if (gLImageBeautyComplexionFilter != null) {
            gLImageBeautyComplexionFilter.f4085E = beautyParam.f4125b;
        }
        GLImageBeautyAdjustFilter gLImageBeautyAdjustFilter = this.f4121z;
        if (gLImageBeautyAdjustFilter != null) {
            gLImageBeautyAdjustFilter.f4079y = beautyParam.f4124a;
        }
        GLImageBeautyFaceFilter gLImageBeautyFaceFilter = this.f4115A;
        if (gLImageBeautyFaceFilter != null) {
            Objects.requireNonNull(gLImageBeautyFaceFilter);
            if (beautyParam != null) {
                gLImageBeautyFaceFilter.f4112S = GLImageFilter.m2139b(0.0f, 0.0f, 1.0f);
                gLImageBeautyFaceFilter.f4113T = GLImageFilter.m2139b(0.0f, 0.0f, 1.0f);
            }
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: c */
    public void mo2128c() {
        super.mo2128c();
        GLImageBeautyComplexionFilter gLImageBeautyComplexionFilter = this.f4117v;
        if (gLImageBeautyComplexionFilter != null) {
            gLImageBeautyComplexionFilter.mo2128c();
        }
        GLImageBeautyBlurFilter gLImageBeautyBlurFilter = this.f4118w;
        if (gLImageBeautyBlurFilter != null) {
            gLImageBeautyBlurFilter.mo2128c();
        }
        GLImageBeautyHighPassFilter gLImageBeautyHighPassFilter = this.f4119x;
        if (gLImageBeautyHighPassFilter != null) {
            gLImageBeautyHighPassFilter.mo2128c();
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4120y;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2128c();
        }
        GLImageBeautyAdjustFilter gLImageBeautyAdjustFilter = this.f4121z;
        if (gLImageBeautyAdjustFilter != null) {
            gLImageBeautyAdjustFilter.mo2128c();
        }
        GLImageBeautyFaceFilter gLImageBeautyFaceFilter = this.f4115A;
        if (gLImageBeautyFaceFilter != null) {
            gLImageBeautyFaceFilter.mo2128c();
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int iMo2130e;
        if (i == -1) {
            return false;
        }
        int iMo2130e2 = this.f4117v.mo2130e(i, floatBuffer, floatBuffer2);
        GLImageBeautyBlurFilter gLImageBeautyBlurFilter = this.f4118w;
        int iMo2130e3 = gLImageBeautyBlurFilter != null ? gLImageBeautyBlurFilter.mo2130e(iMo2130e2, floatBuffer, floatBuffer2) : iMo2130e2;
        GLImageBeautyHighPassFilter gLImageBeautyHighPassFilter = this.f4119x;
        if (gLImageBeautyHighPassFilter != null) {
            gLImageBeautyHighPassFilter.f4123w = iMo2130e3;
            iMo2130e = gLImageBeautyHighPassFilter.mo2130e(iMo2130e2, floatBuffer, floatBuffer2);
        } else {
            iMo2130e = iMo2130e3;
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4120y;
        int iMo2130e4 = gLImageGaussianBlurFilter != null ? gLImageGaussianBlurFilter.mo2130e(iMo2130e, floatBuffer, floatBuffer2) : iMo2130e2;
        GLImageBeautyAdjustFilter gLImageBeautyAdjustFilter = this.f4121z;
        if (gLImageBeautyAdjustFilter != null) {
            gLImageBeautyAdjustFilter.f4080z = iMo2130e3;
            gLImageBeautyAdjustFilter.f4075A = iMo2130e4;
            iMo2130e = gLImageBeautyAdjustFilter.mo2130e(iMo2130e2, floatBuffer, floatBuffer2);
        }
        GLImageBeautyFaceFilter gLImageBeautyFaceFilter = this.f4115A;
        if (gLImageBeautyFaceFilter != null) {
            return gLImageBeautyFaceFilter.mo2129d(iMo2130e, floatBuffer, floatBuffer2);
        }
        return false;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int iMo2130e;
        int iMo2130e2;
        int iMo2130e3;
        if (i == -1) {
            return i;
        }
        int iMo2130e4 = this.f4117v.mo2130e(i, floatBuffer, floatBuffer2);
        GLImageBeautyBlurFilter gLImageBeautyBlurFilter = this.f4118w;
        int iMo2130e5 = gLImageBeautyBlurFilter != null ? gLImageBeautyBlurFilter.mo2130e(iMo2130e4, floatBuffer, floatBuffer2) : iMo2130e4;
        GLImageBeautyHighPassFilter gLImageBeautyHighPassFilter = this.f4119x;
        if (gLImageBeautyHighPassFilter != null) {
            gLImageBeautyHighPassFilter.f4123w = iMo2130e5;
            iMo2130e = gLImageBeautyHighPassFilter.mo2130e(iMo2130e4, floatBuffer, floatBuffer2);
        } else {
            iMo2130e = iMo2130e5;
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4120y;
        if (gLImageGaussianBlurFilter != null) {
            iMo2130e3 = gLImageGaussianBlurFilter.mo2130e(iMo2130e, floatBuffer, floatBuffer2);
            iMo2130e2 = iMo2130e3;
        } else {
            iMo2130e2 = iMo2130e;
            iMo2130e3 = iMo2130e4;
        }
        GLImageBeautyAdjustFilter gLImageBeautyAdjustFilter = this.f4121z;
        if (gLImageBeautyAdjustFilter != null) {
            gLImageBeautyAdjustFilter.f4080z = iMo2130e5;
            gLImageBeautyAdjustFilter.f4075A = iMo2130e3;
            iMo2130e2 = gLImageBeautyAdjustFilter.mo2130e(iMo2130e4, floatBuffer, floatBuffer2);
        }
        GLImageBeautyFaceFilter gLImageBeautyFaceFilter = this.f4115A;
        return gLImageBeautyFaceFilter != null ? gLImageBeautyFaceFilter.mo2130e(iMo2130e2, floatBuffer, floatBuffer2) : iMo2130e2;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: g */
    public void mo2131g(int i, int i2) {
        super.mo2131g(i, i2);
        GLImageBeautyComplexionFilter gLImageBeautyComplexionFilter = this.f4117v;
        if (gLImageBeautyComplexionFilter != null) {
            gLImageBeautyComplexionFilter.mo2131g(i, i2);
        }
        GLImageBeautyBlurFilter gLImageBeautyBlurFilter = this.f4118w;
        if (gLImageBeautyBlurFilter != null) {
            float f = this.f4116B;
            gLImageBeautyBlurFilter.mo2131g((int) (i * f), (int) (i2 * f));
        }
        GLImageBeautyHighPassFilter gLImageBeautyHighPassFilter = this.f4119x;
        if (gLImageBeautyHighPassFilter != null) {
            float f2 = this.f4116B;
            gLImageBeautyHighPassFilter.mo2131g((int) (i * f2), (int) (i2 * f2));
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4120y;
        if (gLImageGaussianBlurFilter != null) {
            float f3 = this.f4116B;
            gLImageGaussianBlurFilter.mo2131g((int) (i * f3), (int) (i2 * f3));
        }
        GLImageBeautyAdjustFilter gLImageBeautyAdjustFilter = this.f4121z;
        if (gLImageBeautyAdjustFilter != null) {
            gLImageBeautyAdjustFilter.mo2131g(i, i2);
        }
        GLImageBeautyFaceFilter gLImageBeautyFaceFilter = this.f4115A;
        if (gLImageBeautyFaceFilter != null) {
            gLImageBeautyFaceFilter.mo2131g(i, i2);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: i */
    public void mo2133i(int i, int i2) {
        this.f4042p = i;
        this.f4043q = i2;
        GLImageBeautyComplexionFilter gLImageBeautyComplexionFilter = this.f4117v;
        if (gLImageBeautyComplexionFilter != null) {
            gLImageBeautyComplexionFilter.f4042p = i;
            gLImageBeautyComplexionFilter.f4043q = i2;
        }
        GLImageBeautyBlurFilter gLImageBeautyBlurFilter = this.f4118w;
        if (gLImageBeautyBlurFilter != null) {
            gLImageBeautyBlurFilter.mo2133i(i, i2);
        }
        GLImageBeautyHighPassFilter gLImageBeautyHighPassFilter = this.f4119x;
        if (gLImageBeautyHighPassFilter != null) {
            gLImageBeautyHighPassFilter.f4042p = i;
            gLImageBeautyHighPassFilter.f4043q = i2;
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4120y;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2133i(i, i2);
        }
        GLImageBeautyAdjustFilter gLImageBeautyAdjustFilter = this.f4121z;
        if (gLImageBeautyAdjustFilter != null) {
            gLImageBeautyAdjustFilter.f4042p = i;
            gLImageBeautyAdjustFilter.f4043q = i2;
        }
        GLImageBeautyFaceFilter gLImageBeautyFaceFilter = this.f4115A;
        if (gLImageBeautyFaceFilter != null) {
            gLImageBeautyFaceFilter.mo2133i(i, i2);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        GLImageBeautyComplexionFilter gLImageBeautyComplexionFilter = this.f4117v;
        if (gLImageBeautyComplexionFilter != null) {
            gLImageBeautyComplexionFilter.f4040n = i;
            gLImageBeautyComplexionFilter.f4041o = i2;
        }
        GLImageBeautyBlurFilter gLImageBeautyBlurFilter = this.f4118w;
        if (gLImageBeautyBlurFilter != null) {
            float f = this.f4116B;
            gLImageBeautyBlurFilter.mo2135n((int) (i * f), (int) (i2 * f));
        }
        GLImageBeautyHighPassFilter gLImageBeautyHighPassFilter = this.f4119x;
        if (gLImageBeautyHighPassFilter != null) {
            float f2 = this.f4116B;
            gLImageBeautyHighPassFilter.f4040n = (int) (i * f2);
            gLImageBeautyHighPassFilter.f4041o = (int) (i2 * f2);
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4120y;
        if (gLImageGaussianBlurFilter != null) {
            float f3 = this.f4116B;
            gLImageGaussianBlurFilter.mo2135n((int) (i * f3), (int) (i2 * f3));
        }
        GLImageBeautyAdjustFilter gLImageBeautyAdjustFilter = this.f4121z;
        if (gLImageBeautyAdjustFilter != null) {
            gLImageBeautyAdjustFilter.f4040n = i;
            gLImageBeautyAdjustFilter.f4041o = i2;
        }
        GLImageBeautyFaceFilter gLImageBeautyFaceFilter = this.f4115A;
        if (gLImageBeautyFaceFilter != null) {
            gLImageBeautyFaceFilter.mo2135n(i, i2);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        GLImageBeautyComplexionFilter gLImageBeautyComplexionFilter = this.f4117v;
        if (gLImageBeautyComplexionFilter != null) {
            gLImageBeautyComplexionFilter.mo2126o();
            this.f4117v = null;
        }
        GLImageBeautyBlurFilter gLImageBeautyBlurFilter = this.f4118w;
        if (gLImageBeautyBlurFilter != null) {
            gLImageBeautyBlurFilter.mo2126o();
            this.f4118w = null;
        }
        GLImageBeautyHighPassFilter gLImageBeautyHighPassFilter = this.f4119x;
        if (gLImageBeautyHighPassFilter != null) {
            gLImageBeautyHighPassFilter.mo2126o();
            this.f4119x = null;
        }
        GLImageGaussianBlurFilter gLImageGaussianBlurFilter = this.f4120y;
        if (gLImageGaussianBlurFilter != null) {
            gLImageGaussianBlurFilter.mo2126o();
            this.f4120y = null;
        }
        GLImageBeautyAdjustFilter gLImageBeautyAdjustFilter = this.f4121z;
        if (gLImageBeautyAdjustFilter != null) {
            gLImageBeautyAdjustFilter.mo2126o();
            this.f4121z = null;
        }
        GLImageBeautyFaceFilter gLImageBeautyFaceFilter = this.f4115A;
        if (gLImageBeautyFaceFilter != null) {
            gLImageBeautyFaceFilter.mo2126o();
            this.f4115A = null;
        }
    }

    public GLImageBeautyFilter(Context context, String str, String str2) {
        super(context, str, str2);
        this.f4116B = 0.5f;
        this.f4117v = new GLImageBeautyComplexionFilter(this.f4028b);
        this.f4118w = new GLImageBeautyBlurFilter(this.f4028b);
        this.f4119x = new GLImageBeautyHighPassFilter(this.f4028b);
        this.f4120y = new GLImageGaussianBlurFilter(this.f4028b);
        this.f4121z = new GLImageBeautyAdjustFilter(this.f4028b);
        this.f4115A = new GLImageBeautyFaceFilter(this.f4028b);
    }
}
