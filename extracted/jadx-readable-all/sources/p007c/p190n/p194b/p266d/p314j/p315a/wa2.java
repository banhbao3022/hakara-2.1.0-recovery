package p007c.p190n.p194b.p266d.p314j.p315a;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wa2 extends ya2 {
    public wa2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ya2
    /* JADX INFO: renamed from: a */
    public final void mo8616a(Object obj, long j2, byte b) {
        if (za2.f22226i) {
            za2.m8854c(obj, j2, b);
        } else {
            za2.m8855d(obj, j2, b);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ya2
    /* JADX INFO: renamed from: b */
    public final boolean mo8617b(Object obj, long j2) {
        return za2.f22226i ? za2.m8872u(obj, j2) : za2.m8873v(obj, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ya2
    /* JADX INFO: renamed from: c */
    public final void mo8618c(Object obj, long j2, boolean z) {
        if (za2.f22226i) {
            za2.m8854c(obj, j2, z ? (byte) 1 : (byte) 0);
        } else {
            za2.m8855d(obj, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ya2
    /* JADX INFO: renamed from: d */
    public final float mo8619d(Object obj, long j2) {
        return Float.intBitsToFloat(m8784k(obj, j2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ya2
    /* JADX INFO: renamed from: e */
    public final void mo8620e(Object obj, long j2, float f) {
        m8785l(obj, j2, Float.floatToIntBits(f));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ya2
    /* JADX INFO: renamed from: f */
    public final double mo8621f(Object obj, long j2) {
        return Double.longBitsToDouble(m8786m(obj, j2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ya2
    /* JADX INFO: renamed from: g */
    public final void mo8622g(Object obj, long j2, double d) {
        m8787n(obj, j2, Double.doubleToLongBits(d));
    }
}
