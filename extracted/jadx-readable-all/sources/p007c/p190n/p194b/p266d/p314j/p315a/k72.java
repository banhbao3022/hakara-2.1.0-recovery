package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class k72 {

    /* JADX INFO: renamed from: a */
    public final j72 f15896a;

    /* JADX INFO: renamed from: b */
    public int f15897b;

    /* JADX INFO: renamed from: c */
    public int f15898c;

    /* JADX INFO: renamed from: d */
    public int f15899d = 0;

    public k72(j72 j72Var) {
        Charset charset = p82.f17879a;
        this.f15896a = j72Var;
        j72Var.f15506b = this;
    }

    /* JADX INFO: renamed from: t */
    public static final void m7445t(int i) throws IOException {
        if ((i & 3) != 0) {
            throw r82.m8266g();
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m7446u(int i) throws IOException {
        if ((i & 7) != 0) {
            throw r82.m8266g();
        }
    }

    /* JADX INFO: renamed from: A */
    public final long m7447A() throws IOException {
        m7479p(0);
        return this.f15896a.mo7085l();
    }

    /* JADX INFO: renamed from: B */
    public final int m7448B() throws IOException {
        m7479p(0);
        return this.f15896a.mo7086m();
    }

    /* JADX INFO: renamed from: C */
    public final long m7449C() throws IOException {
        m7479p(1);
        return this.f15896a.mo7087n();
    }

    /* JADX INFO: renamed from: D */
    public final int m7450D() throws IOException {
        m7479p(5);
        return this.f15896a.mo7088o();
    }

    /* JADX INFO: renamed from: E */
    public final boolean m7451E() throws IOException {
        m7479p(0);
        return this.f15896a.mo7089p();
    }

    /* JADX INFO: renamed from: F */
    public final <T> T m7452F(ba2<T> ba2Var, s72 s72Var) throws IOException {
        m7479p(2);
        return (T) m7480q(ba2Var, s72Var);
    }

    /* JADX INFO: renamed from: G */
    public final <T> T m7453G(ba2<T> ba2Var, s72 s72Var) throws IOException {
        m7479p(3);
        return (T) m7481r(ba2Var, s72Var);
    }

    /* JADX INFO: renamed from: H */
    public final g72 m7454H() throws IOException {
        m7479p(2);
        return this.f15896a.mo7092s();
    }

    /* JADX INFO: renamed from: I */
    public final int m7455I() throws IOException {
        m7479p(0);
        return this.f15896a.mo7093t();
    }

    /* JADX INFO: renamed from: J */
    public final int m7456J() throws IOException {
        m7479p(0);
        return this.f15896a.mo7094u();
    }

    /* JADX INFO: renamed from: K */
    public final int m7457K() throws IOException {
        m7479p(5);
        return this.f15896a.mo7095v();
    }

    /* JADX INFO: renamed from: L */
    public final long m7458L() throws IOException {
        m7479p(1);
        return this.f15896a.mo7096w();
    }

    /* JADX INFO: renamed from: M */
    public final int m7459M() throws IOException {
        m7479p(0);
        return this.f15896a.mo7097x();
    }

    /* JADX INFO: renamed from: N */
    public final long m7460N() throws IOException {
        m7479p(0);
        return this.f15896a.mo7098y();
    }

    /* JADX INFO: renamed from: O */
    public final void m7461O(List<Double> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof q72)) {
            int i = this.f15897b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.f15896a.mo7082i()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7093t = this.f15896a.mo7093t();
            m7446u(iMo7093t);
            int iMo7078c = this.f15896a.mo7078c() + iMo7093t;
            do {
                list.add(Double.valueOf(this.f15896a.mo7082i()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            return;
        }
        q72 q72Var = (q72) list;
        int i2 = this.f15897b & 7;
        if (i2 == 1) {
            do {
                q72Var.m8193f(this.f15896a.mo7082i());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7093t2 = this.f15896a.mo7093t();
        m7446u(iMo7093t2);
        int iMo7078c2 = this.f15896a.mo7078c() + iMo7093t2;
        do {
            q72Var.m8193f(this.f15896a.mo7082i());
        } while (this.f15896a.mo7078c() < iMo7078c2);
    }

    /* JADX INFO: renamed from: P */
    public final void m7462P(List<Float> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof a82)) {
            int i = this.f15897b & 7;
            if (i == 2) {
                int iMo7093t = this.f15896a.mo7093t();
                m7445t(iMo7093t);
                int iMo7078c = this.f15896a.mo7078c() + iMo7093t;
                do {
                    list.add(Float.valueOf(this.f15896a.mo7083j()));
                } while (this.f15896a.mo7078c() < iMo7078c);
                return;
            }
            if (i != 5) {
                throw r82.m8265f();
            }
            do {
                list.add(Float.valueOf(this.f15896a.mo7083j()));
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f = this.f15896a.mo7079f();
                }
            } while (iMo7079f == this.f15897b);
            this.f15899d = iMo7079f;
            return;
        }
        a82 a82Var = (a82) list;
        int i2 = this.f15897b & 7;
        if (i2 == 2) {
            int iMo7093t2 = this.f15896a.mo7093t();
            m7445t(iMo7093t2);
            int iMo7078c2 = this.f15896a.mo7078c() + iMo7093t2;
            do {
                a82Var.m5702f(this.f15896a.mo7083j());
            } while (this.f15896a.mo7078c() < iMo7078c2);
            return;
        }
        if (i2 != 5) {
            throw r82.m8265f();
        }
        do {
            a82Var.m5702f(this.f15896a.mo7083j());
            if (this.f15896a.mo7077b()) {
                return;
            } else {
                iMo7079f2 = this.f15896a.mo7079f();
            }
        } while (iMo7079f2 == this.f15897b);
        this.f15899d = iMo7079f2;
    }

    /* JADX INFO: renamed from: Q */
    public final void m7463Q(List<Long> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof b92)) {
            int i = this.f15897b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f15896a.mo7084k()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7078c = this.f15896a.mo7078c() + this.f15896a.mo7093t();
            do {
                list.add(Long.valueOf(this.f15896a.mo7084k()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            m7482s(iMo7078c);
            return;
        }
        b92 b92Var = (b92) list;
        int i2 = this.f15897b & 7;
        if (i2 == 0) {
            do {
                b92Var.m5938j(this.f15896a.mo7084k());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7078c2 = this.f15896a.mo7078c() + this.f15896a.mo7093t();
        do {
            b92Var.m5938j(this.f15896a.mo7084k());
        } while (this.f15896a.mo7078c() < iMo7078c2);
        m7482s(iMo7078c2);
    }

    /* JADX INFO: renamed from: a */
    public final void m7464a(List<Long> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof b92)) {
            int i = this.f15897b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f15896a.mo7085l()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7078c = this.f15896a.mo7078c() + this.f15896a.mo7093t();
            do {
                list.add(Long.valueOf(this.f15896a.mo7085l()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            m7482s(iMo7078c);
            return;
        }
        b92 b92Var = (b92) list;
        int i2 = this.f15897b & 7;
        if (i2 == 0) {
            do {
                b92Var.m5938j(this.f15896a.mo7085l());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7078c2 = this.f15896a.mo7078c() + this.f15896a.mo7093t();
        do {
            b92Var.m5938j(this.f15896a.mo7085l());
        } while (this.f15896a.mo7078c() < iMo7078c2);
        m7482s(iMo7078c2);
    }

    /* JADX INFO: renamed from: b */
    public final void m7465b(List<Integer> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof h82)) {
            int i = this.f15897b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f15896a.mo7086m()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7078c = this.f15896a.mo7078c() + this.f15896a.mo7093t();
            do {
                list.add(Integer.valueOf(this.f15896a.mo7086m()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            m7482s(iMo7078c);
            return;
        }
        h82 h82Var = (h82) list;
        int i2 = this.f15897b & 7;
        if (i2 == 0) {
            do {
                h82Var.m7102j(this.f15896a.mo7086m());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7078c2 = this.f15896a.mo7078c() + this.f15896a.mo7093t();
        do {
            h82Var.m7102j(this.f15896a.mo7086m());
        } while (this.f15896a.mo7078c() < iMo7078c2);
        m7482s(iMo7078c2);
    }

    /* JADX INFO: renamed from: c */
    public final void m7466c(List<Long> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof b92)) {
            int i = this.f15897b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.f15896a.mo7087n()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7093t = this.f15896a.mo7093t();
            m7446u(iMo7093t);
            int iMo7078c = this.f15896a.mo7078c() + iMo7093t;
            do {
                list.add(Long.valueOf(this.f15896a.mo7087n()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            return;
        }
        b92 b92Var = (b92) list;
        int i2 = this.f15897b & 7;
        if (i2 == 1) {
            do {
                b92Var.m5938j(this.f15896a.mo7087n());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7093t2 = this.f15896a.mo7093t();
        m7446u(iMo7093t2);
        int iMo7078c2 = this.f15896a.mo7078c() + iMo7093t2;
        do {
            b92Var.m5938j(this.f15896a.mo7087n());
        } while (this.f15896a.mo7078c() < iMo7078c2);
    }

    /* JADX INFO: renamed from: d */
    public final void m7467d(List<Integer> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof h82)) {
            int i = this.f15897b & 7;
            if (i == 2) {
                int iMo7093t = this.f15896a.mo7093t();
                m7445t(iMo7093t);
                int iMo7078c = this.f15896a.mo7078c() + iMo7093t;
                do {
                    list.add(Integer.valueOf(this.f15896a.mo7088o()));
                } while (this.f15896a.mo7078c() < iMo7078c);
                return;
            }
            if (i != 5) {
                throw r82.m8265f();
            }
            do {
                list.add(Integer.valueOf(this.f15896a.mo7088o()));
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f = this.f15896a.mo7079f();
                }
            } while (iMo7079f == this.f15897b);
            this.f15899d = iMo7079f;
            return;
        }
        h82 h82Var = (h82) list;
        int i2 = this.f15897b & 7;
        if (i2 == 2) {
            int iMo7093t2 = this.f15896a.mo7093t();
            m7445t(iMo7093t2);
            int iMo7078c2 = this.f15896a.mo7078c() + iMo7093t2;
            do {
                h82Var.m7102j(this.f15896a.mo7088o());
            } while (this.f15896a.mo7078c() < iMo7078c2);
            return;
        }
        if (i2 != 5) {
            throw r82.m8265f();
        }
        do {
            h82Var.m7102j(this.f15896a.mo7088o());
            if (this.f15896a.mo7077b()) {
                return;
            } else {
                iMo7079f2 = this.f15896a.mo7079f();
            }
        } while (iMo7079f2 == this.f15897b);
        this.f15899d = iMo7079f2;
    }

    /* JADX INFO: renamed from: e */
    public final void m7468e(List<Boolean> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof x62)) {
            int i = this.f15897b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.f15896a.mo7089p()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7078c = this.f15896a.mo7078c() + this.f15896a.mo7093t();
            do {
                list.add(Boolean.valueOf(this.f15896a.mo7089p()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            m7482s(iMo7078c);
            return;
        }
        x62 x62Var = (x62) list;
        int i2 = this.f15897b & 7;
        if (i2 == 0) {
            do {
                x62Var.m8719f(this.f15896a.mo7089p());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7078c2 = this.f15896a.mo7078c() + this.f15896a.mo7093t();
        do {
            x62Var.m8719f(this.f15896a.mo7089p());
        } while (this.f15896a.mo7078c() < iMo7078c2);
        m7482s(iMo7078c2);
    }

    /* JADX INFO: renamed from: f */
    public final void m7469f(List<String> list, boolean z) throws IOException {
        String strMo7090q;
        int iMo7079f;
        int iMo7079f2;
        if ((this.f15897b & 7) != 2) {
            throw r82.m8265f();
        }
        if ((list instanceof w82) && !z) {
            w82 w82Var = (w82) list;
            do {
                w82Var.mo8410J(m7454H());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        do {
            if (z) {
                m7479p(2);
                strMo7090q = this.f15896a.mo7091r();
            } else {
                m7479p(2);
                strMo7090q = this.f15896a.mo7090q();
            }
            list.add(strMo7090q);
            if (this.f15896a.mo7077b()) {
                return;
            } else {
                iMo7079f = this.f15896a.mo7079f();
            }
        } while (iMo7079f == this.f15897b);
        this.f15899d = iMo7079f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final <T> void m7470g(List<T> list, ba2<T> ba2Var, s72 s72Var) throws IOException {
        int iMo7079f;
        int i = this.f15897b;
        if ((i & 7) != 2) {
            throw r82.m8265f();
        }
        do {
            list.add(m7480q(ba2Var, s72Var));
            if (this.f15896a.mo7077b() || this.f15899d != 0) {
                return;
            } else {
                iMo7079f = this.f15896a.mo7079f();
            }
        } while (iMo7079f == i);
        this.f15899d = iMo7079f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final <T> void m7471h(List<T> list, ba2<T> ba2Var, s72 s72Var) throws IOException {
        int iMo7079f;
        int i = this.f15897b;
        if ((i & 7) != 3) {
            throw r82.m8265f();
        }
        do {
            list.add(m7481r(ba2Var, s72Var));
            if (this.f15896a.mo7077b() || this.f15899d != 0) {
                return;
            } else {
                iMo7079f = this.f15896a.mo7079f();
            }
        } while (iMo7079f == i);
        this.f15899d = iMo7079f;
    }

    /* JADX INFO: renamed from: i */
    public final void m7472i(List<g72> list) throws IOException {
        int iMo7079f;
        if ((this.f15897b & 7) != 2) {
            throw r82.m8265f();
        }
        do {
            list.add(m7454H());
            if (this.f15896a.mo7077b()) {
                return;
            } else {
                iMo7079f = this.f15896a.mo7079f();
            }
        } while (iMo7079f == this.f15897b);
        this.f15899d = iMo7079f;
    }

    /* JADX INFO: renamed from: j */
    public final void m7473j(List<Integer> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof h82)) {
            int i = this.f15897b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f15896a.mo7093t()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7078c = this.f15896a.mo7078c() + this.f15896a.mo7093t();
            do {
                list.add(Integer.valueOf(this.f15896a.mo7093t()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            m7482s(iMo7078c);
            return;
        }
        h82 h82Var = (h82) list;
        int i2 = this.f15897b & 7;
        if (i2 == 0) {
            do {
                h82Var.m7102j(this.f15896a.mo7093t());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7078c2 = this.f15896a.mo7078c() + this.f15896a.mo7093t();
        do {
            h82Var.m7102j(this.f15896a.mo7093t());
        } while (this.f15896a.mo7078c() < iMo7078c2);
        m7482s(iMo7078c2);
    }

    /* JADX INFO: renamed from: k */
    public final void m7474k(List<Integer> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof h82)) {
            int i = this.f15897b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f15896a.mo7094u()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7078c = this.f15896a.mo7078c() + this.f15896a.mo7093t();
            do {
                list.add(Integer.valueOf(this.f15896a.mo7094u()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            m7482s(iMo7078c);
            return;
        }
        h82 h82Var = (h82) list;
        int i2 = this.f15897b & 7;
        if (i2 == 0) {
            do {
                h82Var.m7102j(this.f15896a.mo7094u());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7078c2 = this.f15896a.mo7078c() + this.f15896a.mo7093t();
        do {
            h82Var.m7102j(this.f15896a.mo7094u());
        } while (this.f15896a.mo7078c() < iMo7078c2);
        m7482s(iMo7078c2);
    }

    /* JADX INFO: renamed from: l */
    public final void m7475l(List<Integer> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof h82)) {
            int i = this.f15897b & 7;
            if (i == 2) {
                int iMo7093t = this.f15896a.mo7093t();
                m7445t(iMo7093t);
                int iMo7078c = this.f15896a.mo7078c() + iMo7093t;
                do {
                    list.add(Integer.valueOf(this.f15896a.mo7095v()));
                } while (this.f15896a.mo7078c() < iMo7078c);
                return;
            }
            if (i != 5) {
                throw r82.m8265f();
            }
            do {
                list.add(Integer.valueOf(this.f15896a.mo7095v()));
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f = this.f15896a.mo7079f();
                }
            } while (iMo7079f == this.f15897b);
            this.f15899d = iMo7079f;
            return;
        }
        h82 h82Var = (h82) list;
        int i2 = this.f15897b & 7;
        if (i2 == 2) {
            int iMo7093t2 = this.f15896a.mo7093t();
            m7445t(iMo7093t2);
            int iMo7078c2 = this.f15896a.mo7078c() + iMo7093t2;
            do {
                h82Var.m7102j(this.f15896a.mo7095v());
            } while (this.f15896a.mo7078c() < iMo7078c2);
            return;
        }
        if (i2 != 5) {
            throw r82.m8265f();
        }
        do {
            h82Var.m7102j(this.f15896a.mo7095v());
            if (this.f15896a.mo7077b()) {
                return;
            } else {
                iMo7079f2 = this.f15896a.mo7079f();
            }
        } while (iMo7079f2 == this.f15897b);
        this.f15899d = iMo7079f2;
    }

    /* JADX INFO: renamed from: m */
    public final void m7476m(List<Long> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof b92)) {
            int i = this.f15897b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.f15896a.mo7096w()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7093t = this.f15896a.mo7093t();
            m7446u(iMo7093t);
            int iMo7078c = this.f15896a.mo7078c() + iMo7093t;
            do {
                list.add(Long.valueOf(this.f15896a.mo7096w()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            return;
        }
        b92 b92Var = (b92) list;
        int i2 = this.f15897b & 7;
        if (i2 == 1) {
            do {
                b92Var.m5938j(this.f15896a.mo7096w());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7093t2 = this.f15896a.mo7093t();
        m7446u(iMo7093t2);
        int iMo7078c2 = this.f15896a.mo7078c() + iMo7093t2;
        do {
            b92Var.m5938j(this.f15896a.mo7096w());
        } while (this.f15896a.mo7078c() < iMo7078c2);
    }

    /* JADX INFO: renamed from: n */
    public final void m7477n(List<Integer> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof h82)) {
            int i = this.f15897b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f15896a.mo7097x()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7078c = this.f15896a.mo7078c() + this.f15896a.mo7093t();
            do {
                list.add(Integer.valueOf(this.f15896a.mo7097x()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            m7482s(iMo7078c);
            return;
        }
        h82 h82Var = (h82) list;
        int i2 = this.f15897b & 7;
        if (i2 == 0) {
            do {
                h82Var.m7102j(this.f15896a.mo7097x());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7078c2 = this.f15896a.mo7078c() + this.f15896a.mo7093t();
        do {
            h82Var.m7102j(this.f15896a.mo7097x());
        } while (this.f15896a.mo7078c() < iMo7078c2);
        m7482s(iMo7078c2);
    }

    /* JADX INFO: renamed from: o */
    public final void m7478o(List<Long> list) throws IOException {
        int iMo7079f;
        int iMo7079f2;
        if (!(list instanceof b92)) {
            int i = this.f15897b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f15896a.mo7098y()));
                    if (this.f15896a.mo7077b()) {
                        return;
                    } else {
                        iMo7079f = this.f15896a.mo7079f();
                    }
                } while (iMo7079f == this.f15897b);
                this.f15899d = iMo7079f;
                return;
            }
            if (i != 2) {
                throw r82.m8265f();
            }
            int iMo7078c = this.f15896a.mo7078c() + this.f15896a.mo7093t();
            do {
                list.add(Long.valueOf(this.f15896a.mo7098y()));
            } while (this.f15896a.mo7078c() < iMo7078c);
            m7482s(iMo7078c);
            return;
        }
        b92 b92Var = (b92) list;
        int i2 = this.f15897b & 7;
        if (i2 == 0) {
            do {
                b92Var.m5938j(this.f15896a.mo7098y());
                if (this.f15896a.mo7077b()) {
                    return;
                } else {
                    iMo7079f2 = this.f15896a.mo7079f();
                }
            } while (iMo7079f2 == this.f15897b);
            this.f15899d = iMo7079f2;
            return;
        }
        if (i2 != 2) {
            throw r82.m8265f();
        }
        int iMo7078c2 = this.f15896a.mo7078c() + this.f15896a.mo7093t();
        do {
            b92Var.m5938j(this.f15896a.mo7098y());
        } while (this.f15896a.mo7078c() < iMo7078c2);
        m7482s(iMo7078c2);
    }

    /* JADX INFO: renamed from: p */
    public final void m7479p(int i) throws IOException {
        if ((this.f15897b & 7) != i) {
            throw r82.m8265f();
        }
    }

    /* JADX INFO: renamed from: q */
    public final <T> T m7480q(ba2<T> ba2Var, s72 s72Var) throws IOException {
        int iMo7093t = this.f15896a.mo7093t();
        j72 j72Var = this.f15896a;
        if (j72Var.f15505a >= 100) {
            throw new r82("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo7099z = j72Var.mo7099z(iMo7093t);
        T tZza = ba2Var.zza();
        this.f15896a.f15505a++;
        ba2Var.mo5954j(tZza, this, s72Var);
        ba2Var.mo5952h(tZza);
        this.f15896a.mo7080g(0);
        j72 j72Var2 = this.f15896a;
        j72Var2.f15505a--;
        j72Var2.mo7076a(iMo7099z);
        return tZza;
    }

    /* JADX INFO: renamed from: r */
    public final <T> T m7481r(ba2<T> ba2Var, s72 s72Var) throws IOException {
        int i = this.f15898c;
        this.f15898c = ((this.f15897b >>> 3) << 3) | 4;
        try {
            T tZza = ba2Var.zza();
            ba2Var.mo5954j(tZza, this, s72Var);
            ba2Var.mo5952h(tZza);
            if (this.f15897b != this.f15898c) {
                throw r82.m8266g();
            }
            this.f15898c = i;
            return tZza;
        } catch (Throwable th) {
            this.f15898c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7482s(int i) throws IOException {
        if (this.f15896a.mo7078c() != i) {
            throw r82.m8260a();
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m7483v() throws IOException {
        int iMo7079f = this.f15899d;
        if (iMo7079f != 0) {
            this.f15897b = iMo7079f;
            this.f15899d = 0;
        } else {
            iMo7079f = this.f15896a.mo7079f();
            this.f15897b = iMo7079f;
        }
        if (iMo7079f == 0 || iMo7079f == this.f15898c) {
            return Integer.MAX_VALUE;
        }
        return iMo7079f >>> 3;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7484w() throws IOException {
        int i;
        if (this.f15896a.mo7077b() || (i = this.f15897b) == this.f15898c) {
            return false;
        }
        return this.f15896a.mo7081h(i);
    }

    /* JADX INFO: renamed from: x */
    public final double m7485x() throws IOException {
        m7479p(1);
        return this.f15896a.mo7082i();
    }

    /* JADX INFO: renamed from: y */
    public final float m7486y() throws IOException {
        m7479p(5);
        return this.f15896a.mo7083j();
    }

    /* JADX INFO: renamed from: z */
    public final long m7487z() throws IOException {
        m7479p(0);
        return this.f15896a.mo7084k();
    }
}
