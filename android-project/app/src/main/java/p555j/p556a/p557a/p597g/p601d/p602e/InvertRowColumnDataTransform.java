package p555j.p556a.p557a.p597g.p601d.p602e;

/* JADX INFO: renamed from: j.a.a.g.d.e.a, reason: use source file name */
/* JADX INFO: compiled from: InvertRowColumnDataTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class InvertRowColumnDataTransform<T> {

    /* JADX INFO: renamed from: a */
    public int f32191a;

    /* JADX INFO: renamed from: b */
    public int f32192b;

    public InvertRowColumnDataTransform(int i, int i2) {
        this.f32191a = 1;
        this.f32192b = 1;
        if (i2 <= 0 || i <= 0) {
            throw new IllegalArgumentException("row or column must be not null");
        }
        this.f32191a = i2;
        this.f32192b = i;
    }
}
