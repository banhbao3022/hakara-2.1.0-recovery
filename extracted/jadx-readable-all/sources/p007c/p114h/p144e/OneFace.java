package p007c.p114h.p144e;

/* JADX INFO: renamed from: c.h.e.c, reason: use source file name */
/* JADX INFO: compiled from: OneFace.java */
/* JADX INFO: loaded from: classes.dex */
public class OneFace {

    /* JADX INFO: renamed from: a */
    public float f4267a;

    /* JADX INFO: renamed from: b */
    public float f4268b;

    /* JADX INFO: renamed from: c */
    public float f4269c;

    /* JADX INFO: renamed from: d */
    public float f4270d;

    /* JADX INFO: renamed from: e */
    public float f4271e;

    /* JADX INFO: renamed from: f */
    public int f4272f;

    /* JADX INFO: renamed from: g */
    public float[] f4273g;

    public Object clone() throws CloneNotSupportedException {
        OneFace oneFace = new OneFace();
        oneFace.f4267a = this.f4267a;
        oneFace.f4268b = this.f4268b;
        oneFace.f4269c = this.f4269c;
        oneFace.f4270d = this.f4270d;
        oneFace.f4271e = this.f4271e;
        oneFace.f4272f = this.f4272f;
        oneFace.f4273g = (float[]) this.f4273g.clone();
        return oneFace;
    }
}
