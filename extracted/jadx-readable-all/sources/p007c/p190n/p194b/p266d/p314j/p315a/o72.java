package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o72 extends y62 {

    /* JADX INFO: renamed from: a */
    public static final Logger f17551a = Logger.getLogger(o72.class.getName());

    /* JADX INFO: renamed from: b */
    public static final boolean f17552b = za2.f22224g;

    /* JADX INFO: renamed from: c */
    public p72 f17553c;

    public o72() {
    }

    public /* synthetic */ o72(l72 l72Var) {
    }

    /* JADX INFO: renamed from: a */
    public static int m7966a(g72 g72Var) {
        int iMo5719m = g72Var.mo5719m();
        return m7971u(iMo5719m) + iMo5719m;
    }

    /* JADX INFO: renamed from: b */
    public static int m7967b(l92 l92Var, ba2 ba2Var) {
        t62 t62Var = (t62) l92Var;
        int iMo6959c = t62Var.mo6959c();
        if (iMo6959c == -1) {
            iMo6959c = ba2Var.mo5948c(t62Var);
            t62Var.mo6962f(iMo6959c);
        }
        return m7971u(iMo6959c) + iMo6959c;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static int m7968c(int i, l92 l92Var, ba2 ba2Var) {
        int iM7971u = m7971u(i << 3);
        int i2 = iM7971u + iM7971u;
        t62 t62Var = (t62) l92Var;
        int iMo6959c = t62Var.mo6959c();
        if (iMo6959c == -1) {
            iMo6959c = ba2Var.mo5948c(t62Var);
            t62Var.mo6962f(iMo6959c);
        }
        return i2 + iMo6959c;
    }

    /* JADX INFO: renamed from: s */
    public static int m7969s(int i) {
        return m7971u(i << 3);
    }

    /* JADX INFO: renamed from: t */
    public static int m7970t(int i) {
        if (i >= 0) {
            return m7971u(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: u */
    public static int m7971u(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: v */
    public static int m7972v(long j2) {
        int i;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: w */
    public static int m7973w(String str) {
        int length;
        try {
            length = cb2.m6158b(str);
        } catch (bb2 unused) {
            length = str.getBytes(p82.f17879a).length;
        }
        return m7971u(length) + length;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo7661d(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: e */
    public abstract void mo7662e(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract void mo7663f(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: g */
    public abstract void mo7664g(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo7665h(int i, long j2) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo7666i(int i, long j2) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo7667j(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract void mo7668k(int i, String str) throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract void mo7669l(int i, g72 g72Var) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract void mo7670m(byte b) throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract void mo7671n(int i) throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract void mo7672o(int i) throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo7673p(int i) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo7674q(long j2) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo7675r(long j2) throws IOException;
}
