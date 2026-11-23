package p007c.p082f.p083a.p084a;

/* JADX INFO: renamed from: c.f.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: Frustum.java */
/* JADX INFO: loaded from: classes.dex */
public class Frustum {

    /* JADX INFO: renamed from: a */
    public static final Vector3[] f2830a;

    /* JADX INFO: renamed from: b */
    public static final float[] f2831b;

    /* JADX INFO: renamed from: c */
    public final Plane[] f2832c = new Plane[6];

    /* JADX INFO: renamed from: d */
    public final Vector3[] f2833d = {new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3()};

    /* JADX INFO: renamed from: e */
    public final float[] f2834e = new float[24];

    static {
        int i = 0;
        Vector3[] vector3Arr = {new Vector3(-1.0f, -1.0f, -1.0f), new Vector3(1.0f, -1.0f, -1.0f), new Vector3(1.0f, 1.0f, -1.0f), new Vector3(-1.0f, 1.0f, -1.0f), new Vector3(-1.0f, -1.0f, 1.0f), new Vector3(1.0f, -1.0f, 1.0f), new Vector3(1.0f, 1.0f, 1.0f), new Vector3(-1.0f, 1.0f, 1.0f)};
        f2830a = vector3Arr;
        f2831b = new float[24];
        int length = vector3Arr.length;
        int i2 = 0;
        while (i < length) {
            Vector3 vector3 = vector3Arr[i];
            float[] fArr = f2831b;
            int i3 = i2 + 1;
            fArr[i2] = vector3.f2851g;
            int i4 = i3 + 1;
            fArr[i3] = vector3.f2852h;
            fArr[i4] = vector3.f2853i;
            i++;
            i2 = i4 + 1;
        }
        new Vector3();
    }

    public Frustum() {
        for (int i = 0; i < 6; i++) {
            this.f2832c[i] = new Plane(new Vector3(), 0.0f);
        }
    }
}
