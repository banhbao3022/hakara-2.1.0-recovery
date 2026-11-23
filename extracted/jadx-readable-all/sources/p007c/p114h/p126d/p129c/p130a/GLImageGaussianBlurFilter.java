package p007c.p114h.p126d.p129c.p130a;

import android.content.Context;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: c.h.d.c.a.g, reason: use source file name */
/* JADX INFO: compiled from: GLImageGaussianBlurFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageGaussianBlurFilter extends GLImageFilter {

    /* JADX INFO: renamed from: v */
    public GLImageGaussPassFilter f4061v;

    /* JADX INFO: renamed from: w */
    public GLImageGaussPassFilter f4062w;

    /* JADX INFO: renamed from: x */
    public int f4063x;

    public GLImageGaussianBlurFilter(Context context) {
        super(context, null, null);
        this.f4061v = new GLImageGaussPassFilter(this.f4028b);
        this.f4062w = new GLImageGaussPassFilter(this.f4028b);
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: c */
    public void mo2128c() {
        super.mo2128c();
        GLImageGaussPassFilter gLImageGaussPassFilter = this.f4061v;
        if (gLImageGaussPassFilter != null) {
            gLImageGaussPassFilter.mo2128c();
        }
        GLImageGaussPassFilter gLImageGaussPassFilter2 = this.f4062w;
        if (gLImageGaussPassFilter2 != null) {
            gLImageGaussPassFilter2.mo2128c();
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (i == -1) {
            return false;
        }
        this.f4063x = i;
        GLImageGaussPassFilter gLImageGaussPassFilter = this.f4061v;
        if (gLImageGaussPassFilter != null) {
            this.f4063x = gLImageGaussPassFilter.mo2130e(i, floatBuffer, floatBuffer2);
        }
        GLImageGaussPassFilter gLImageGaussPassFilter2 = this.f4062w;
        if (gLImageGaussPassFilter2 != null) {
            return gLImageGaussPassFilter2.mo2129d(this.f4063x, floatBuffer, floatBuffer2);
        }
        return false;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        this.f4063x = i;
        if (i == -1) {
            return i;
        }
        GLImageGaussPassFilter gLImageGaussPassFilter = this.f4061v;
        if (gLImageGaussPassFilter != null) {
            this.f4063x = gLImageGaussPassFilter.mo2130e(i, floatBuffer, floatBuffer2);
        }
        GLImageGaussPassFilter gLImageGaussPassFilter2 = this.f4062w;
        if (gLImageGaussPassFilter2 != null) {
            this.f4063x = gLImageGaussPassFilter2.mo2130e(this.f4063x, floatBuffer, floatBuffer2);
        }
        return this.f4063x;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: g */
    public void mo2131g(int i, int i2) {
        super.mo2131g(i, i2);
        GLImageGaussPassFilter gLImageGaussPassFilter = this.f4061v;
        if (gLImageGaussPassFilter != null) {
            gLImageGaussPassFilter.mo2131g(i, i2);
        }
        GLImageGaussPassFilter gLImageGaussPassFilter2 = this.f4062w;
        if (gLImageGaussPassFilter2 != null) {
            gLImageGaussPassFilter2.mo2131g(i, i2);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: h */
    public void mo2132h() {
        super.mo2132h();
        GLImageGaussPassFilter gLImageGaussPassFilter = this.f4061v;
        if (gLImageGaussPassFilter != null) {
            gLImageGaussPassFilter.mo2132h();
        }
        GLImageGaussPassFilter gLImageGaussPassFilter2 = this.f4062w;
        if (gLImageGaussPassFilter2 != null) {
            gLImageGaussPassFilter2.mo2132h();
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: i */
    public void mo2133i(int i, int i2) {
        this.f4042p = i;
        this.f4043q = i2;
        GLImageGaussPassFilter gLImageGaussPassFilter = this.f4061v;
        if (gLImageGaussPassFilter != null) {
            gLImageGaussPassFilter.f4042p = i;
            gLImageGaussPassFilter.f4043q = i2;
        }
        GLImageGaussPassFilter gLImageGaussPassFilter2 = this.f4062w;
        if (gLImageGaussPassFilter2 != null) {
            gLImageGaussPassFilter2.f4042p = i;
            gLImageGaussPassFilter2.f4043q = i2;
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        GLImageGaussPassFilter gLImageGaussPassFilter = this.f4061v;
        if (gLImageGaussPassFilter != null) {
            gLImageGaussPassFilter.f4040n = i;
            gLImageGaussPassFilter.f4041o = i2;
            gLImageGaussPassFilter.m2148u(0.0f, i2);
        }
        GLImageGaussPassFilter gLImageGaussPassFilter2 = this.f4062w;
        if (gLImageGaussPassFilter2 != null) {
            gLImageGaussPassFilter2.f4040n = i;
            gLImageGaussPassFilter2.f4041o = i2;
            gLImageGaussPassFilter2.m2148u(i, 0.0f);
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        GLImageGaussPassFilter gLImageGaussPassFilter = this.f4061v;
        if (gLImageGaussPassFilter != null) {
            gLImageGaussPassFilter.mo2126o();
            this.f4061v = null;
        }
        GLImageGaussPassFilter gLImageGaussPassFilter2 = this.f4062w;
        if (gLImageGaussPassFilter2 != null) {
            gLImageGaussPassFilter2.mo2126o();
            this.f4062w = null;
        }
    }

    public GLImageGaussianBlurFilter(Context context, String str, String str2) {
        super(context, str, str2);
        this.f4061v = new GLImageGaussPassFilter(this.f4028b, str, str2);
        this.f4062w = new GLImageGaussPassFilter(this.f4028b, str, str2);
    }
}
