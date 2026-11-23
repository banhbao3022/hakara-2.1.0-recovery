package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oa2<T, B> {
    /* JADX INFO: renamed from: a */
    public abstract boolean mo7977a(k72 k72Var);

    /* JADX INFO: renamed from: b */
    public abstract void mo7978b(B b, int i, long j2);

    /* JADX INFO: renamed from: c */
    public abstract void mo7979c(B b, int i, int i2);

    /* JADX INFO: renamed from: d */
    public abstract void mo7980d(B b, int i, long j2);

    /* JADX INFO: renamed from: e */
    public abstract void mo7981e(B b, int i, g72 g72Var);

    /* JADX INFO: renamed from: f */
    public abstract void mo7982f(B b, int i, T t);

    /* JADX INFO: renamed from: g */
    public abstract B mo7983g();

    /* JADX INFO: renamed from: h */
    public abstract T mo7984h(B b);

    /* JADX INFO: renamed from: i */
    public abstract void mo7985i(Object obj, T t);

    /* JADX INFO: renamed from: j */
    public abstract T mo7986j(Object obj);

    /* JADX INFO: renamed from: k */
    public abstract B mo7987k(Object obj);

    /* JADX INFO: renamed from: l */
    public abstract void mo7988l(Object obj, B b);

    /* JADX INFO: renamed from: m */
    public abstract void mo7989m(Object obj);

    /* JADX INFO: renamed from: n */
    public final boolean m7990n(B b, k72 k72Var) throws IOException {
        int i = k72Var.f15897b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            mo7978b(b, i2, k72Var.m7447A());
            return true;
        }
        if (i3 == 1) {
            mo7980d(b, i2, k72Var.m7449C());
            return true;
        }
        if (i3 == 2) {
            mo7981e(b, i2, k72Var.m7454H());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw r82.m8265f();
            }
            mo7979c(b, i2, k72Var.m7450D());
            return true;
        }
        B bMo7983g = mo7983g();
        int i4 = 4 | (i2 << 3);
        while (k72Var.m7483v() != Integer.MAX_VALUE && m7990n(bMo7983g, k72Var)) {
        }
        if (i4 != k72Var.f15897b) {
            throw r82.m8264e();
        }
        mo7984h(bMo7983g);
        mo7982f(b, i2, bMo7983g);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public abstract T mo7991o(T t, T t2);

    /* JADX INFO: renamed from: p */
    public abstract int mo7992p(T t);

    /* JADX INFO: renamed from: q */
    public abstract int mo7993q(T t);

    /* JADX INFO: renamed from: r */
    public abstract void mo7994r(T t, p72 p72Var) throws IOException;
}
