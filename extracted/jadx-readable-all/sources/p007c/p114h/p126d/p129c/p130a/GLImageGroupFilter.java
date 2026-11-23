package p007c.p114h.p126d.p129c.p130a;

import android.content.Context;
import android.opengl.GLES30;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c.h.d.c.a.h, reason: use source file name */
/* JADX INFO: compiled from: GLImageGroupFilter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class GLImageGroupFilter extends GLImageFilter {

    /* JADX INFO: renamed from: v */
    public List<GLImageFilter> f4064v;

    public GLImageGroupFilter(Context context) {
        super(context, null, null);
        this.f4064v = new ArrayList();
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: d */
    public boolean mo2129d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.f4064v.size() == 0) {
            return false;
        }
        boolean zMo2129d = super.mo2129d(i, floatBuffer, floatBuffer2);
        int size = this.f4064v.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == size - 1) {
                GLES30.glViewport(0, 0, this.f4064v.get(i2).f4042p, this.f4064v.get(i2).f4043q);
                if (this.f4064v.get(i2) != null) {
                    zMo2129d = this.f4064v.get(i2).mo2129d(i, floatBuffer, floatBuffer2);
                }
            } else if (this.f4064v.get(i2) != null) {
                i = this.f4064v.get(i2).mo2130e(i, floatBuffer, floatBuffer2);
            }
        }
        return zMo2129d;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: e */
    public int mo2130e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.f4064v.size() == 0) {
            return i;
        }
        int size = this.f4064v.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f4064v.get(i2) != null) {
                i = this.f4064v.get(i2).mo2130e(i, floatBuffer, floatBuffer2);
            }
        }
        return i;
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: g */
    public void mo2131g(int i, int i2) {
        super.mo2131g(i, i2);
        if (this.f4064v.size() == 0) {
            return;
        }
        int size = this.f4064v.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f4064v.get(i3) != null) {
                this.f4064v.get(i3).mo2131g(i, i2);
            }
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: i */
    public void mo2133i(int i, int i2) {
        this.f4042p = i;
        this.f4043q = i2;
        for (int i3 = 0; i3 < this.f4064v.size(); i3++) {
            if (this.f4064v.get(i3) != null) {
                this.f4064v.get(i3).mo2133i(i, i2);
            }
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: n */
    public void mo2135n(int i, int i2) {
        this.f4040n = i;
        this.f4041o = i2;
        for (int i3 = 0; i3 < this.f4064v.size(); i3++) {
            if (this.f4064v.get(i3) != null) {
                this.f4064v.get(i3).mo2135n(i, i2);
            }
        }
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        int size = this.f4064v.size();
        for (int i = 0; i < size; i++) {
            if (this.f4064v.get(i) != null) {
                this.f4064v.get(i).mo2126o();
            }
        }
        this.f4064v.clear();
    }
}
