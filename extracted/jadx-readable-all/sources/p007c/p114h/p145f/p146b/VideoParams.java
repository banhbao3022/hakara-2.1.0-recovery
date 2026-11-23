package p007c.p114h.p145f.p146b;

import android.opengl.EGLContext;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.f.b.l, reason: use source file name */
/* JADX INFO: compiled from: VideoParams.java */
/* JADX INFO: loaded from: classes.dex */
public class VideoParams {

    /* JADX INFO: renamed from: a */
    public int f4365a;

    /* JADX INFO: renamed from: b */
    public int f4366b;

    /* JADX INFO: renamed from: d */
    public String f4368d;

    /* JADX INFO: renamed from: f */
    public long f4370f;

    /* JADX INFO: renamed from: g */
    public EGLContext f4371g;

    /* JADX INFO: renamed from: c */
    public int f4367c = 3145728;

    /* JADX INFO: renamed from: e */
    public int f4369e = 3;

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("VideoParams: ");
        sbM1556G.append(this.f4365a);
        sbM1556G.append("x");
        sbM1556G.append(this.f4366b);
        sbM1556G.append("@");
        sbM1556G.append(this.f4367c);
        sbM1556G.append(" to ");
        sbM1556G.append(this.f4368d);
        return sbM1556G.toString();
    }
}
