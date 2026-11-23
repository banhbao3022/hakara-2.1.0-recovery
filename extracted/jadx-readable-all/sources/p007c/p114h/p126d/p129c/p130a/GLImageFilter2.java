package p007c.p114h.p126d.p129c.p130a;

import android.graphics.PointF;
import android.opengl.GLES30;

/* JADX INFO: renamed from: c.h.d.c.a.e, reason: use source file name */
/* JADX INFO: compiled from: GLImageFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageFilter2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PointF f4054f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4055g;

    public GLImageFilter2(GLImageFilter gLImageFilter, PointF pointF, int i) {
        this.f4054f = pointF;
        this.f4055g = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        PointF pointF = this.f4054f;
        GLES30.glUniform2fv(this.f4055g, 1, new float[]{pointF.x, pointF.y}, 0);
    }
}
