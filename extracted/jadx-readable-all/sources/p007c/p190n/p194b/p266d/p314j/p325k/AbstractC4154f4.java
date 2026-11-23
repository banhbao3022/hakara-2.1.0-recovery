package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.d.j.k.f4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4154f4 {

    /* JADX INFO: renamed from: a */
    public int f23155a;

    /* JADX INFO: renamed from: b */
    public int f23156b = 100;

    /* JADX INFO: renamed from: c */
    public C4210j4 f23157c;

    public AbstractC4154f4(C4196i4 c4196i4) {
    }

    /* JADX INFO: renamed from: b */
    public static long m9596b(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC4154f4 m9597c(byte[] bArr, int i) {
        C4182h4 c4182h4 = new C4182h4(bArr, i);
        try {
            c4182h4.mo9605h(i);
            return c4182h4;
        } catch (C4239l5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m9598k(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo9599A();

    /* JADX INFO: renamed from: a */
    public abstract int mo9600a() throws IOException;

    /* JADX INFO: renamed from: d */
    public abstract void mo9601d(int i) throws C4239l5;

    /* JADX INFO: renamed from: e */
    public abstract double mo9602e() throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract boolean mo9603f(int i) throws IOException;

    /* JADX INFO: renamed from: g */
    public abstract float mo9604g() throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract int mo9605h(int i) throws C4239l5;

    /* JADX INFO: renamed from: i */
    public abstract long mo9606i() throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo9607j(int i);

    /* JADX INFO: renamed from: l */
    public abstract long mo9608l() throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract int mo9609m() throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract long mo9610n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract int mo9611o() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract boolean mo9612p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract String mo9613q() throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract String mo9614r() throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract AbstractC4402x3 mo9615s() throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract int mo9616t() throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract int mo9617u() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract int mo9618v() throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract long mo9619w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract int mo9620x() throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract long mo9621y() throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract boolean mo9622z() throws IOException;
}
