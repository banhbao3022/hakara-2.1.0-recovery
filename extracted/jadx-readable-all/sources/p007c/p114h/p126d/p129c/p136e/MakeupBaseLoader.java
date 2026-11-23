package p007c.p114h.p126d.p129c.p136e;

import android.opengl.GLES30;
import java.lang.ref.WeakReference;
import java.nio.FloatBuffer;
import p007c.p114h.p126d.p129c.p136e.p137c.MakeupBaseData;

/* JADX INFO: renamed from: c.h.d.c.e.b, reason: use source file name */
/* JADX INFO: compiled from: MakeupBaseLoader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class MakeupBaseLoader {

    /* JADX INFO: renamed from: a */
    public int f4176a;

    /* JADX INFO: renamed from: b */
    public int f4177b;

    /* JADX INFO: renamed from: c */
    public float f4178c;

    /* JADX INFO: renamed from: d */
    public MakeupBaseData f4179d;

    /* JADX INFO: renamed from: e */
    public String f4180e;

    /* JADX INFO: renamed from: f */
    public int f4181f;

    /* JADX INFO: renamed from: g */
    public int f4182g;

    /* JADX INFO: renamed from: h */
    public boolean f4183h;

    /* JADX INFO: renamed from: i */
    public final WeakReference<GLImageMakeupFilter> f4184i;

    public MakeupBaseLoader(GLImageMakeupFilter gLImageMakeupFilter, MakeupBaseData makeupBaseData, String str) {
        this.f4184i = new WeakReference<>(gLImageMakeupFilter);
        this.f4179d = makeupBaseData;
        this.f4180e = str.startsWith("file://") ? str.substring(7) : str;
        this.f4181f = -1;
        this.f4182g = -1;
        this.f4178c = makeupBaseData == null ? 1.0f : 0.0f;
        m2157b();
    }

    /* JADX INFO: renamed from: a */
    public void m2156a(int i, int i2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        m2160e(i);
        if (this.f4184i.get() == null || !this.f4183h) {
            return;
        }
        this.f4184i.get().m2155w(i2, this.f4182g, this.f4181f, null, null, null, 0, this.f4178c);
    }

    /* JADX INFO: renamed from: b */
    public abstract void m2157b();

    /* JADX INFO: renamed from: c */
    public void m2158c(int i, int i2) {
        this.f4176a = i;
        this.f4177b = i2;
    }

    /* JADX INFO: renamed from: d */
    public void m2159d() {
        int i = this.f4181f;
        if (i != -1) {
            GLES30.glDeleteTextures(1, new int[]{i}, 0);
            this.f4181f = -1;
        }
        int i2 = this.f4182g;
        if (i2 != -1) {
            GLES30.glDeleteTextures(1, new int[]{i2}, 0);
            this.f4182g = -1;
        }
        this.f4184i.clear();
    }

    /* JADX INFO: renamed from: e */
    public abstract void m2160e(int i);
}
