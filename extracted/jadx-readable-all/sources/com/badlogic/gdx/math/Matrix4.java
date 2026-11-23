package com.badlogic.gdx.math;

import java.io.Serializable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p082f.p083a.p084a.Quaternion;
import p007c.p082f.p083a.p084a.Vector3;

/* JADX INFO: loaded from: classes.dex */
public class Matrix4 implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final float[] f28139f = new float[16];

    /* JADX INFO: renamed from: g */
    public static Quaternion f28140g = new Quaternion();

    /* JADX INFO: renamed from: h */
    public static final Vector3 f28141h;

    /* JADX INFO: renamed from: i */
    public static final Vector3 f28142i;

    /* JADX INFO: renamed from: j */
    public static final Vector3 f28143j;

    /* JADX INFO: renamed from: k */
    public static final Vector3 f28144k;

    /* JADX INFO: renamed from: l */
    public static final Matrix4 f28145l;

    /* JADX INFO: renamed from: m */
    public final float[] f28146m;

    static {
        new Quaternion();
        f28141h = new Vector3();
        f28142i = new Vector3();
        f28143j = new Vector3();
        f28144k = new Vector3();
        f28145l = new Matrix4();
        new Vector3();
        new Vector3();
        new Vector3();
        System.loadLibrary("nativegdx");
    }

    public Matrix4() {
        float[] fArr = new float[16];
        this.f28146m = fArr;
        fArr[0] = 1.0f;
        fArr[5] = 1.0f;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
    }

    public static native boolean inv(float[] fArr);

    public static native void mul(float[] fArr, float[] fArr2);

    public static native void prj(float[] fArr, float[] fArr2, int i, int i2, int i3);

    /* JADX INFO: renamed from: a */
    public Matrix4 m12560a() {
        float[] fArr = this.f28146m;
        fArr[0] = 1.0f;
        fArr[4] = 0.0f;
        fArr[8] = 0.0f;
        fArr[12] = 0.0f;
        fArr[1] = 0.0f;
        fArr[5] = 1.0f;
        fArr[9] = 0.0f;
        fArr[13] = 0.0f;
        fArr[2] = 0.0f;
        fArr[6] = 0.0f;
        fArr[10] = 1.0f;
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Matrix4 m12561b(Matrix4 matrix4) {
        float[] fArr = matrix4.f28146m;
        float[] fArr2 = this.f28146m;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public Matrix4 m12562c(float f, float f2, float f3) {
        float[] fArr = f28139f;
        fArr[0] = 1.0f;
        fArr[4] = 0.0f;
        fArr[8] = 0.0f;
        fArr[12] = f;
        fArr[1] = 0.0f;
        fArr[5] = 1.0f;
        fArr[9] = 0.0f;
        fArr[13] = f2;
        fArr[2] = 0.0f;
        fArr[6] = 0.0f;
        fArr[10] = 1.0f;
        fArr[14] = f3;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        mul(this.f28146m, fArr);
        return this;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("[");
        sbM1556G.append(this.f28146m[0]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[4]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[8]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[12]);
        sbM1556G.append("]\n[");
        sbM1556G.append(this.f28146m[1]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[5]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[9]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[13]);
        sbM1556G.append("]\n[");
        sbM1556G.append(this.f28146m[2]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[6]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[10]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[14]);
        sbM1556G.append("]\n[");
        sbM1556G.append(this.f28146m[3]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[7]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[11]);
        sbM1556G.append("|");
        sbM1556G.append(this.f28146m[15]);
        sbM1556G.append("]\n");
        return sbM1556G.toString();
    }

    public Matrix4(Matrix4 matrix4) {
        this.f28146m = new float[16];
        m12561b(matrix4);
    }

    public Matrix4(float[] fArr) {
        float[] fArr2 = new float[16];
        this.f28146m = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, 16);
    }

    public Matrix4(Quaternion quaternion) {
        this.f28146m = new float[]{1.0f - (f + f), f + f, f - f, 0.0f, f - f, 1.0f - (f + f), f + f, 0.0f, f + f, f - f, 1.0f - (f + f), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        float f = quaternion.f2840f;
        float f2 = quaternion.f2841g;
        float f3 = quaternion.f2842h;
        float f4 = quaternion.f2843i;
        float f5 = f * 2.0f;
        float f6 = f2 * 2.0f;
        float f7 = 2.0f * f3;
        float f8 = f4 * f5;
        float f9 = f4 * f6;
        float f10 = f4 * f7;
        float f11 = f5 * f;
        float f12 = f * f6;
        float f13 = f * f7;
        float f14 = f6 * f2;
        float f15 = f2 * f7;
        float f16 = f7 * f3;
    }

    public Matrix4(Vector3 vector3, Quaternion quaternion, Vector3 vector4) {
        this.f28146m = new float[]{(1.0f - (f + f)) * f, (f + f) * f, (f - f) * f, 0.0f, (f - f) * f, (1.0f - (f + f)) * f, (f + f) * f, 0.0f, (f + f) * f, (f - f) * f, (1.0f - (f + f)) * f, 0.0f, f, f, f, 1.0f};
        float f = vector3.f2851g;
        float f2 = vector3.f2852h;
        float f3 = vector3.f2853i;
        float f4 = quaternion.f2840f;
        float f5 = quaternion.f2841g;
        float f6 = quaternion.f2842h;
        float f7 = quaternion.f2843i;
        float f8 = vector4.f2851g;
        float f9 = vector4.f2852h;
        float f10 = vector4.f2853i;
        float f11 = f4 * 2.0f;
        float f12 = f5 * 2.0f;
        float f13 = 2.0f * f6;
        float f14 = f7 * f11;
        float f15 = f7 * f12;
        float f16 = f7 * f13;
        float f17 = f11 * f4;
        float f18 = f4 * f12;
        float f19 = f4 * f13;
        float f20 = f12 * f5;
        float f21 = f5 * f13;
        float f22 = f13 * f6;
    }
}
