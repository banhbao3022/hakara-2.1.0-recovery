package p007c.p082f.p083a.p084a;

import com.badlogic.gdx.math.Matrix4;

/* JADX INFO: renamed from: c.f.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: Camera.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Camera {

    /* JADX INFO: renamed from: a */
    public final Vector3 f2816a = new Vector3();

    /* JADX INFO: renamed from: b */
    public final Vector3 f2817b = new Vector3(0.0f, 0.0f, -1.0f);

    /* JADX INFO: renamed from: c */
    public final Vector3 f2818c = new Vector3(0.0f, 1.0f, 0.0f);

    /* JADX INFO: renamed from: d */
    public final Matrix4 f2819d = new Matrix4();

    /* JADX INFO: renamed from: e */
    public final Matrix4 f2820e = new Matrix4();

    /* JADX INFO: renamed from: f */
    public final Matrix4 f2821f = new Matrix4();

    /* JADX INFO: renamed from: g */
    public final Matrix4 f2822g = new Matrix4();

    /* JADX INFO: renamed from: h */
    public float f2823h = 1.0f;

    /* JADX INFO: renamed from: i */
    public float f2824i = 100.0f;

    /* JADX INFO: renamed from: j */
    public float f2825j = 0.0f;

    /* JADX INFO: renamed from: k */
    public float f2826k = 0.0f;

    /* JADX INFO: renamed from: l */
    public final Frustum f2827l = new Frustum();

    /* JADX INFO: renamed from: m */
    public int f2828m;

    /* JADX INFO: renamed from: n */
    public int f2829n;

    public Camera() {
        new Vector3();
        new Ray(new Vector3(), new Vector3());
    }
}
