package p007c.p082f.p083a.p084a;

import com.badlogic.gdx.math.Matrix4;
import java.util.Objects;

/* JADX INFO: renamed from: c.f.a.a.d, reason: use source file name */
/* JADX INFO: compiled from: OrthographicCamera.java */
/* JADX INFO: loaded from: classes.dex */
public class OrthographicCamera extends Camera {

    /* JADX INFO: renamed from: o */
    public float f2836o = 1.0f;

    /* JADX INFO: renamed from: p */
    public final Vector3 f2837p = new Vector3();

    public OrthographicCamera() {
        this.f2823h = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m1611a() {
        Matrix4 matrix4 = this.f2819d;
        float f = this.f2836o;
        float f2 = this.f2825j;
        float f3 = ((-f2) * f) / 2.0f;
        float f4 = (f2 / 2.0f) * f;
        float f5 = this.f2826k;
        float f6 = (-(f5 / 2.0f)) * f;
        float f7 = (f * f5) / 2.0f;
        float f8 = this.f2823h;
        float f9 = this.f2824i;
        matrix4.m12560a();
        float f10 = f4 - f3;
        float f11 = f7 - f6;
        float f12 = f9 - f8;
        float[] fArr = matrix4.f28146m;
        fArr[0] = 2.0f / f10;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 2.0f / f11;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = (-2.0f) / f12;
        fArr[11] = 0.0f;
        fArr[12] = (-(f4 + f3)) / f10;
        fArr[13] = (-(f7 + f6)) / f11;
        fArr[14] = (-(f9 + f8)) / f12;
        fArr[15] = 1.0f;
        Matrix4 matrix5 = this.f2820e;
        Vector3 vector3 = this.f2816a;
        Vector3 vector4 = this.f2837p;
        vector4.m1620e(vector3);
        Vector3 vector5 = this.f2817b;
        vector4.m1619d(vector4.f2851g + vector5.f2851g, vector4.f2852h + vector5.f2852h, vector4.f2853i + vector5.f2853i);
        Vector3 vector6 = this.f2818c;
        Objects.requireNonNull(matrix5);
        Vector3 vector7 = Matrix4.f28144k;
        vector7.m1620e(vector4);
        vector7.m1621f(vector3);
        Vector3 vector8 = Matrix4.f28141h;
        vector8.m1620e(vector7);
        vector8.m1618c();
        Vector3 vector9 = Matrix4.f28142i;
        vector9.m1620e(vector7);
        vector9.m1618c();
        vector9.m1616a(vector6);
        vector9.m1618c();
        Vector3 vector10 = Matrix4.f28143j;
        vector10.m1620e(vector9);
        vector10.m1616a(vector8);
        vector10.m1618c();
        matrix5.m12560a();
        float[] fArr2 = matrix5.f28146m;
        fArr2[0] = vector9.f2851g;
        fArr2[4] = vector9.f2852h;
        fArr2[8] = vector9.f2853i;
        fArr2[1] = vector10.f2851g;
        fArr2[5] = vector10.f2852h;
        fArr2[9] = vector10.f2853i;
        fArr2[2] = -vector8.f2851g;
        fArr2[6] = -vector8.f2852h;
        fArr2[10] = -vector8.f2853i;
        Matrix4 matrix6 = Matrix4.f28145l;
        float f13 = -vector3.f2851g;
        float f14 = -vector3.f2852h;
        float f15 = -vector3.f2853i;
        matrix6.m12560a();
        float[] fArr3 = matrix6.f28146m;
        fArr3[12] = f13;
        fArr3[13] = f14;
        fArr3[14] = f15;
        Matrix4.mul(matrix5.f28146m, fArr3);
        this.f2821f.m12561b(this.f2819d);
        Matrix4.mul(this.f2821f.f28146m, this.f2820e.f28146m);
        this.f2822g.m12561b(this.f2821f);
        Matrix4.inv(this.f2822g.f28146m);
        Frustum frustum = this.f2827l;
        Matrix4 matrix7 = this.f2822g;
        float[] fArr4 = Frustum.f2831b;
        System.arraycopy(fArr4, 0, frustum.f2834e, 0, fArr4.length);
        Matrix4.prj(matrix7.f28146m, frustum.f2834e, 0, 8, 3);
        int i = 0;
        int i2 = 0;
        while (i < 8) {
            Vector3 vector11 = frustum.f2833d[i];
            float[] fArr5 = frustum.f2834e;
            int i3 = i2 + 1;
            vector11.f2851g = fArr5[i2];
            int i4 = i3 + 1;
            vector11.f2852h = fArr5[i3];
            vector11.f2853i = fArr5[i4];
            i++;
            i2 = i4 + 1;
        }
        Plane plane = frustum.f2832c[0];
        Vector3[] vector3Arr = frustum.f2833d;
        plane.m1612a(vector3Arr[1], vector3Arr[0], vector3Arr[2]);
        Plane plane2 = frustum.f2832c[1];
        Vector3[] vector3Arr2 = frustum.f2833d;
        plane2.m1612a(vector3Arr2[4], vector3Arr2[5], vector3Arr2[7]);
        Plane plane3 = frustum.f2832c[2];
        Vector3[] vector3Arr3 = frustum.f2833d;
        plane3.m1612a(vector3Arr3[0], vector3Arr3[4], vector3Arr3[3]);
        Plane plane4 = frustum.f2832c[3];
        Vector3[] vector3Arr4 = frustum.f2833d;
        plane4.m1612a(vector3Arr4[5], vector3Arr4[1], vector3Arr4[6]);
        Plane plane5 = frustum.f2832c[4];
        Vector3[] vector3Arr5 = frustum.f2833d;
        plane5.m1612a(vector3Arr5[2], vector3Arr5[3], vector3Arr5[6]);
        Plane plane6 = frustum.f2832c[5];
        Vector3[] vector3Arr6 = frustum.f2833d;
        plane6.m1612a(vector3Arr6[4], vector3Arr6[0], vector3Arr6[1]);
    }

    public OrthographicCamera(float f, float f2) {
        this.f2825j = f;
        this.f2826k = f2;
        this.f2823h = 0.0f;
        m1611a();
    }
}
