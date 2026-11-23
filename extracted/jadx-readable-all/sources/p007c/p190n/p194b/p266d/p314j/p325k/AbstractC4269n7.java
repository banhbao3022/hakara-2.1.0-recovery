package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.d.j.k.n7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4269n7<T, B> {
    /* JADX INFO: renamed from: a */
    public abstract B mo10076a();

    /* JADX INFO: renamed from: b */
    public abstract T mo10077b(B b);

    /* JADX INFO: renamed from: c */
    public abstract void mo10078c(B b, int i, int i2);

    /* JADX INFO: renamed from: d */
    public abstract void mo10079d(B b, int i, long j2);

    /* JADX INFO: renamed from: e */
    public abstract void mo10080e(B b, int i, AbstractC4402x3 abstractC4402x3);

    /* JADX INFO: renamed from: f */
    public abstract void mo10081f(B b, int i, T t);

    /* JADX INFO: renamed from: g */
    public abstract void mo10082g(T t, InterfaceC4158f8 interfaceC4158f8) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo10083h(Object obj, T t);

    /* JADX INFO: renamed from: i */
    public abstract boolean mo10084i(C4210j4 c4210j4);

    /* JADX INFO: renamed from: j */
    public final boolean m10085j(B b, C4210j4 c4210j4) throws IOException {
        int i = c4210j4.f23250b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            mo10079d(b, i2, c4210j4.m9905x());
            return true;
        }
        if (i3 == 1) {
            mo10087l(b, i2, c4210j4.m9864B());
            return true;
        }
        if (i3 == 2) {
            mo10080e(b, i2, c4210j4.m9873K());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw C4239l5.m10000f();
            }
            mo10078c(b, i2, c4210j4.m9866D());
            return true;
        }
        B bMo10076a = mo10076a();
        int i4 = 4 | (i2 << 3);
        while (c4210j4.m9884a() != Integer.MAX_VALUE && m10085j(bMo10076a, c4210j4)) {
        }
        if (i4 != c4210j4.f23250b) {
            throw C4239l5.m9999e();
        }
        mo10081f(b, i2, mo10077b(bMo10076a));
        return true;
    }

    /* JADX INFO: renamed from: k */
    public abstract T mo10086k(Object obj);

    /* JADX INFO: renamed from: l */
    public abstract void mo10087l(B b, int i, long j2);

    /* JADX INFO: renamed from: m */
    public abstract void mo10088m(T t, InterfaceC4158f8 interfaceC4158f8) throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract void mo10089n(Object obj, B b);

    /* JADX INFO: renamed from: o */
    public abstract B mo10090o(Object obj);

    /* JADX INFO: renamed from: p */
    public abstract T mo10091p(T t, T t2);

    /* JADX INFO: renamed from: q */
    public abstract void mo10092q(Object obj);

    /* JADX INFO: renamed from: r */
    public abstract int mo10093r(T t);

    /* JADX INFO: renamed from: s */
    public abstract int mo10094s(T t);
}
