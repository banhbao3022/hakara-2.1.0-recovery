package p007c.p466p.p467a.p468a;

import android.graphics.RectF;

/* JADX INFO: renamed from: c.p.a.a.i, reason: use source file name */
/* JADX INFO: compiled from: CropWindowHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class CropWindowHandler {

    /* JADX INFO: renamed from: c */
    public float f28044c;

    /* JADX INFO: renamed from: d */
    public float f28045d;

    /* JADX INFO: renamed from: e */
    public float f28046e;

    /* JADX INFO: renamed from: f */
    public float f28047f;

    /* JADX INFO: renamed from: g */
    public float f28048g;

    /* JADX INFO: renamed from: h */
    public float f28049h;

    /* JADX INFO: renamed from: i */
    public float f28050i;

    /* JADX INFO: renamed from: j */
    public float f28051j;

    /* JADX INFO: renamed from: a */
    public final RectF f28042a = new RectF();

    /* JADX INFO: renamed from: b */
    public final RectF f28043b = new RectF();

    /* JADX INFO: renamed from: k */
    public float f28052k = 1.0f;

    /* JADX INFO: renamed from: l */
    public float f28053l = 1.0f;

    /* JADX INFO: renamed from: f */
    public static boolean m12528f(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12529g(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12530h(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12531i(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    /* JADX INFO: renamed from: a */
    public float m12532a() {
        return Math.min(this.f28047f, this.f28051j / this.f28053l);
    }

    /* JADX INFO: renamed from: b */
    public float m12533b() {
        return Math.min(this.f28046e, this.f28050i / this.f28052k);
    }

    /* JADX INFO: renamed from: c */
    public float m12534c() {
        return Math.max(this.f28045d, this.f28049h / this.f28053l);
    }

    /* JADX INFO: renamed from: d */
    public float m12535d() {
        return Math.max(this.f28044c, this.f28048g / this.f28052k);
    }

    /* JADX INFO: renamed from: e */
    public RectF m12536e() {
        this.f28043b.set(this.f28042a);
        return this.f28043b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m12537j() {
        return this.f28042a.width() >= 100.0f && this.f28042a.height() >= 100.0f;
    }
}
